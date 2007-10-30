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
  protected final String TEXT_289 = "()" + NL + "\t{";
  protected final String TEXT_290 = NL + "\t\treturn ";
  protected final String TEXT_291 = "(";
  protected final String TEXT_292 = "(";
  protected final String TEXT_293 = ")eGet(";
  protected final String TEXT_294 = ", true)";
  protected final String TEXT_295 = ").";
  protected final String TEXT_296 = "()";
  protected final String TEXT_297 = ";";
  protected final String TEXT_298 = NL + "\t\t";
  protected final String TEXT_299 = " ";
  protected final String TEXT_300 = " = (";
  protected final String TEXT_301 = ")eVirtualGet(";
  protected final String TEXT_302 = ");";
  protected final String TEXT_303 = NL + "\t\tif (";
  protected final String TEXT_304 = " == null)" + NL + "\t\t{";
  protected final String TEXT_305 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_306 = ", ";
  protected final String TEXT_307 = " = new ";
  protected final String TEXT_308 = ");";
  protected final String TEXT_309 = NL + "\t\t\t";
  protected final String TEXT_310 = " = new ";
  protected final String TEXT_311 = ";";
  protected final String TEXT_312 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_313 = ";";
  protected final String TEXT_314 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_315 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_316 = ")eContainer();";
  protected final String TEXT_317 = NL + "\t\t";
  protected final String TEXT_318 = " ";
  protected final String TEXT_319 = " = (";
  protected final String TEXT_320 = ")eVirtualGet(";
  protected final String TEXT_321 = ", ";
  protected final String TEXT_322 = ");";
  protected final String TEXT_323 = NL + "\t\tif (";
  protected final String TEXT_324 = " != null && ";
  protected final String TEXT_325 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_326 = " old";
  protected final String TEXT_327 = " = (";
  protected final String TEXT_328 = ")";
  protected final String TEXT_329 = ";" + NL + "\t\t\t";
  protected final String TEXT_330 = " = ";
  protected final String TEXT_331 = "eResolveProxy(old";
  protected final String TEXT_332 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_333 = " != old";
  protected final String TEXT_334 = ")" + NL + "\t\t\t{";
  protected final String TEXT_335 = NL + "\t\t\t\t";
  protected final String TEXT_336 = " new";
  protected final String TEXT_337 = " = (";
  protected final String TEXT_338 = ")";
  protected final String TEXT_339 = ";";
  protected final String TEXT_340 = NL + "\t\t\t\t";
  protected final String TEXT_341 = " msgs = old";
  protected final String TEXT_342 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_343 = ", null, null);";
  protected final String TEXT_344 = NL + "\t\t\t\t";
  protected final String TEXT_345 = " msgs =  old";
  protected final String TEXT_346 = ".eInverseRemove(this, ";
  protected final String TEXT_347 = ", ";
  protected final String TEXT_348 = ".class, null);";
  protected final String TEXT_349 = NL + "\t\t\t\tif (new";
  protected final String TEXT_350 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_351 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_352 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_353 = ", null, msgs);";
  protected final String TEXT_354 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_355 = ".eInverseAdd(this, ";
  protected final String TEXT_356 = ", ";
  protected final String TEXT_357 = ".class, msgs);";
  protected final String TEXT_358 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_359 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_360 = ", ";
  protected final String TEXT_361 = ");";
  protected final String TEXT_362 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_363 = "(this, ";
  protected final String TEXT_364 = ".RESOLVE, ";
  protected final String TEXT_365 = ", old";
  protected final String TEXT_366 = ", ";
  protected final String TEXT_367 = "));";
  protected final String TEXT_368 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_369 = NL + "\t\treturn (";
  protected final String TEXT_370 = ")eVirtualGet(";
  protected final String TEXT_371 = ", ";
  protected final String TEXT_372 = ");";
  protected final String TEXT_373 = NL + "\t\treturn (";
  protected final String TEXT_374 = " & ";
  protected final String TEXT_375 = "_EFLAG) != 0;";
  protected final String TEXT_376 = NL + "\t\treturn ";
  protected final String TEXT_377 = ";";
  protected final String TEXT_378 = NL + "\t\t";
  protected final String TEXT_379 = " ";
  protected final String TEXT_380 = " = basicGet";
  protected final String TEXT_381 = "();" + NL + "\t\treturn ";
  protected final String TEXT_382 = " != null && ";
  protected final String TEXT_383 = ".eIsProxy() ? ";
  protected final String TEXT_384 = "eResolveProxy((";
  protected final String TEXT_385 = ")";
  protected final String TEXT_386 = ") : ";
  protected final String TEXT_387 = ";";
  protected final String TEXT_388 = NL + "\t\treturn new ";
  protected final String TEXT_389 = "((";
  protected final String TEXT_390 = ".Internal)((";
  protected final String TEXT_391 = ".Internal.Wrapper)get";
  protected final String TEXT_392 = "()).featureMap().";
  protected final String TEXT_393 = "list(";
  protected final String TEXT_394 = "));";
  protected final String TEXT_395 = NL + "\t\treturn (";
  protected final String TEXT_396 = ")get";
  protected final String TEXT_397 = "().";
  protected final String TEXT_398 = "list(";
  protected final String TEXT_399 = ");";
  protected final String TEXT_400 = NL + "\t\treturn ((";
  protected final String TEXT_401 = ".Internal.Wrapper)get";
  protected final String TEXT_402 = "()).featureMap().list(";
  protected final String TEXT_403 = ");";
  protected final String TEXT_404 = NL + "\t\treturn get";
  protected final String TEXT_405 = "().list(";
  protected final String TEXT_406 = ");";
  protected final String TEXT_407 = NL + "\t\treturn ";
  protected final String TEXT_408 = "(";
  protected final String TEXT_409 = "(";
  protected final String TEXT_410 = ")";
  protected final String TEXT_411 = "((";
  protected final String TEXT_412 = ".Internal.Wrapper)get";
  protected final String TEXT_413 = "()).featureMap().get(";
  protected final String TEXT_414 = ", true)";
  protected final String TEXT_415 = ").";
  protected final String TEXT_416 = "()";
  protected final String TEXT_417 = ";";
  protected final String TEXT_418 = NL + "\t\treturn ";
  protected final String TEXT_419 = "(";
  protected final String TEXT_420 = "(";
  protected final String TEXT_421 = ")";
  protected final String TEXT_422 = "get";
  protected final String TEXT_423 = "().get(";
  protected final String TEXT_424 = ", true)";
  protected final String TEXT_425 = ").";
  protected final String TEXT_426 = "()";
  protected final String TEXT_427 = ";";
  protected final String TEXT_428 = NL + "\t\t";
  protected final String TEXT_429 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_430 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_431 = NL + "\t\t\t";
  protected final String TEXT_432 = " result = (";
  protected final String TEXT_433 = ") cache.get(";
  protected final String TEXT_434 = "eResource(), ";
  protected final String TEXT_435 = "this, ";
  protected final String TEXT_436 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_437 = "eResource(), ";
  protected final String TEXT_438 = "this, ";
  protected final String TEXT_439 = ", result = ";
  protected final String TEXT_440 = "new ";
  protected final String TEXT_441 = "(";
  protected final String TEXT_442 = ".";
  protected final String TEXT_443 = "(this)";
  protected final String TEXT_444 = ")";
  protected final String TEXT_445 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_446 = ".";
  protected final String TEXT_447 = "()";
  protected final String TEXT_448 = ";" + NL + "\t\t}";
  protected final String TEXT_449 = NL + "\t\treturn ";
  protected final String TEXT_450 = ".";
  protected final String TEXT_451 = "(this);";
  protected final String TEXT_452 = NL + "\t\t";
  protected final String TEXT_453 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_454 = " eResource = eResource();";
  protected final String TEXT_455 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_456 = NL + "\t\t\t";
  protected final String TEXT_457 = " ";
  protected final String TEXT_458 = " = (";
  protected final String TEXT_459 = ") cache.get(eResource, this, ";
  protected final String TEXT_460 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_461 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_462 = ", ";
  protected final String TEXT_463 = " = new ";
  protected final String TEXT_464 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_465 = ";" + NL + "\t\t}";
  protected final String TEXT_466 = NL + "\t\treturn new ";
  protected final String TEXT_467 = ";";
  protected final String TEXT_468 = NL + "\t\t";
  protected final String TEXT_469 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_470 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_471 = " method = getClass().getMethod(\"";
  protected final String TEXT_472 = "\", null);";
  protected final String TEXT_473 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_474 = NL + "\t\t\t\t";
  protected final String TEXT_475 = " ";
  protected final String TEXT_476 = " = (";
  protected final String TEXT_477 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_478 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_479 = " union = ";
  protected final String TEXT_480 = "Helper(new ";
  protected final String TEXT_481 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_482 = " = new ";
  protected final String TEXT_483 = "(this, ";
  protected final String TEXT_484 = "null";
  protected final String TEXT_485 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_486 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_487 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_488 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_489 = NL + "\t\t\t";
  protected final String TEXT_490 = " ";
  protected final String TEXT_491 = " = (";
  protected final String TEXT_492 = ") cache.get(eResource(), this, ";
  protected final String TEXT_493 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_494 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_495 = " union = ";
  protected final String TEXT_496 = "Helper(new ";
  protected final String TEXT_497 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_498 = ", ";
  protected final String TEXT_499 = " = new ";
  protected final String TEXT_500 = "(this, ";
  protected final String TEXT_501 = "null";
  protected final String TEXT_502 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_503 = ";";
  protected final String TEXT_504 = NL + "\t\t}";
  protected final String TEXT_505 = NL + "\t\t";
  protected final String TEXT_506 = " union = ";
  protected final String TEXT_507 = "Helper(new ";
  protected final String TEXT_508 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_509 = "(this, ";
  protected final String TEXT_510 = "null";
  protected final String TEXT_511 = ", union.size(), union.toArray());";
  protected final String TEXT_512 = NL + "\t\tif (isSet";
  protected final String TEXT_513 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_514 = "();" + NL + "\t\t}";
  protected final String TEXT_515 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_516 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_517 = "();" + NL + "\t\t}";
  protected final String TEXT_518 = NL + "\t\t";
  protected final String TEXT_519 = " ";
  protected final String TEXT_520 = " = ";
  protected final String TEXT_521 = "();" + NL + "\t\tif (";
  protected final String TEXT_522 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_523 = ";" + NL + "\t\t}";
  protected final String TEXT_524 = NL + "\t\treturn ";
  protected final String TEXT_525 = "super.";
  protected final String TEXT_526 = "()";
  protected final String TEXT_527 = "null";
  protected final String TEXT_528 = ";";
  protected final String TEXT_529 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_530 = "' ";
  protected final String TEXT_531 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_532 = NL + "\t}" + NL;
  protected final String TEXT_533 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_534 = NL + "\t@Override";
  protected final String TEXT_535 = NL + "\tpublic ";
  protected final String TEXT_536 = " basicGet";
  protected final String TEXT_537 = "()" + NL + "\t{";
  protected final String TEXT_538 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_539 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_540 = ")eInternalContainer();";
  protected final String TEXT_541 = NL + "\t\treturn (";
  protected final String TEXT_542 = ")eVirtualGet(";
  protected final String TEXT_543 = ");";
  protected final String TEXT_544 = NL + "\t\treturn ";
  protected final String TEXT_545 = ";";
  protected final String TEXT_546 = NL + "\t\treturn (";
  protected final String TEXT_547 = ")((";
  protected final String TEXT_548 = ".Internal.Wrapper)get";
  protected final String TEXT_549 = "()).featureMap().get(";
  protected final String TEXT_550 = ", false);";
  protected final String TEXT_551 = NL + "\t\treturn (";
  protected final String TEXT_552 = ")get";
  protected final String TEXT_553 = "().get(";
  protected final String TEXT_554 = ", false);";
  protected final String TEXT_555 = NL + "\t\treturn ";
  protected final String TEXT_556 = ".";
  protected final String TEXT_557 = "(this);";
  protected final String TEXT_558 = NL + "\t\tif (isSet";
  protected final String TEXT_559 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_560 = "basicGet";
  protected final String TEXT_561 = "();" + NL + "\t\t}";
  protected final String TEXT_562 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_563 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_564 = "basicGet";
  protected final String TEXT_565 = "();" + NL + "\t\t}";
  protected final String TEXT_566 = NL + "\t\t";
  protected final String TEXT_567 = " ";
  protected final String TEXT_568 = " = ";
  protected final String TEXT_569 = "basicGet";
  protected final String TEXT_570 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_571 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_572 = ";" + NL + "\t\t}";
  protected final String TEXT_573 = NL + "\t\treturn ";
  protected final String TEXT_574 = "super.basicGet";
  protected final String TEXT_575 = "()";
  protected final String TEXT_576 = "null";
  protected final String TEXT_577 = ";";
  protected final String TEXT_578 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_579 = "' ";
  protected final String TEXT_580 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_581 = NL + "\t}" + NL;
  protected final String TEXT_582 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_583 = NL + "\t@Override";
  protected final String TEXT_584 = NL + "\tpublic ";
  protected final String TEXT_585 = " basicSet";
  protected final String TEXT_586 = "(";
  protected final String TEXT_587 = " new";
  protected final String TEXT_588 = ", ";
  protected final String TEXT_589 = " msgs)" + NL + "\t{";
  protected final String TEXT_590 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_591 = ")new";
  protected final String TEXT_592 = ", ";
  protected final String TEXT_593 = ", msgs);";
  protected final String TEXT_594 = NL + "\t\t";
  protected final String TEXT_595 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_596 = NL + "\t\t\t";
  protected final String TEXT_597 = " ";
  protected final String TEXT_598 = " = ";
  protected final String TEXT_599 = "();";
  protected final String TEXT_600 = NL + "\t\t\tObject ";
  protected final String TEXT_601 = " = eVirtualGet(";
  protected final String TEXT_602 = ");";
  protected final String TEXT_603 = NL + "\t\t\tif (";
  protected final String TEXT_604 = " != null && ";
  protected final String TEXT_605 = " != new";
  protected final String TEXT_606 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_607 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_608 = NL + "\t\t\tif (new";
  protected final String TEXT_609 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_610 = NL + "\t\t\t\t";
  protected final String TEXT_611 = " ";
  protected final String TEXT_612 = " = ";
  protected final String TEXT_613 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_614 = ".contains(new";
  protected final String TEXT_615 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_616 = ".add(new";
  protected final String TEXT_617 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_618 = NL + "\t\t\t\t";
  protected final String TEXT_619 = " ";
  protected final String TEXT_620 = " = ";
  protected final String TEXT_621 = "();";
  protected final String TEXT_622 = NL + "\t\t\t\tObject ";
  protected final String TEXT_623 = " = eVirtualGet(";
  protected final String TEXT_624 = ");";
  protected final String TEXT_625 = NL + "\t\t\t\tif (new";
  protected final String TEXT_626 = " != ";
  protected final String TEXT_627 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_628 = "(new";
  protected final String TEXT_629 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_630 = NL + "\t\t\t}";
  protected final String TEXT_631 = NL + "\t\t}";
  protected final String TEXT_632 = NL + "\t\treturn msgs;";
  protected final String TEXT_633 = NL + "\t\tObject old";
  protected final String TEXT_634 = " = eVirtualSet(";
  protected final String TEXT_635 = ", new";
  protected final String TEXT_636 = ");";
  protected final String TEXT_637 = NL + "\t\t";
  protected final String TEXT_638 = " old";
  protected final String TEXT_639 = " = ";
  protected final String TEXT_640 = ";" + NL + "\t\t";
  protected final String TEXT_641 = " = new";
  protected final String TEXT_642 = ";";
  protected final String TEXT_643 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_644 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_645 = NL + "\t\tboolean old";
  protected final String TEXT_646 = "ESet = (";
  protected final String TEXT_647 = " & ";
  protected final String TEXT_648 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_649 = " |= ";
  protected final String TEXT_650 = "_ESETFLAG;";
  protected final String TEXT_651 = NL + "\t\tboolean old";
  protected final String TEXT_652 = "ESet = ";
  protected final String TEXT_653 = "ESet;" + NL + "\t\t";
  protected final String TEXT_654 = "ESet = true;";
  protected final String TEXT_655 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_656 = NL + "\t\t\t";
  protected final String TEXT_657 = " notification = new ";
  protected final String TEXT_658 = "(this, ";
  protected final String TEXT_659 = ".SET, ";
  protected final String TEXT_660 = ", ";
  protected final String TEXT_661 = "isSetChange ? null : old";
  protected final String TEXT_662 = "old";
  protected final String TEXT_663 = ", new";
  protected final String TEXT_664 = ", ";
  protected final String TEXT_665 = "isSetChange";
  protected final String TEXT_666 = "!old";
  protected final String TEXT_667 = "ESet";
  protected final String TEXT_668 = ");";
  protected final String TEXT_669 = NL + "\t\t\t";
  protected final String TEXT_670 = " notification = new ";
  protected final String TEXT_671 = "(this, ";
  protected final String TEXT_672 = ".SET, ";
  protected final String TEXT_673 = ", ";
  protected final String TEXT_674 = "old";
  protected final String TEXT_675 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_676 = "old";
  protected final String TEXT_677 = ", new";
  protected final String TEXT_678 = ");";
  protected final String TEXT_679 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_680 = NL + "\t\t";
  protected final String TEXT_681 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_682 = NL + "\t\t\t";
  protected final String TEXT_683 = " ";
  protected final String TEXT_684 = " = ";
  protected final String TEXT_685 = "();";
  protected final String TEXT_686 = NL + "\t\t\tObject ";
  protected final String TEXT_687 = " = eVirtualGet(";
  protected final String TEXT_688 = ");";
  protected final String TEXT_689 = NL + "\t\t\tif (";
  protected final String TEXT_690 = " != null && ";
  protected final String TEXT_691 = " != new";
  protected final String TEXT_692 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_693 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_694 = NL + "\t\t\tif (new";
  protected final String TEXT_695 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_696 = NL + "\t\t\t\t";
  protected final String TEXT_697 = " ";
  protected final String TEXT_698 = " = ";
  protected final String TEXT_699 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_700 = ".contains(new";
  protected final String TEXT_701 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_702 = ".add(new";
  protected final String TEXT_703 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_704 = NL + "\t\t\t\t";
  protected final String TEXT_705 = " ";
  protected final String TEXT_706 = " = ";
  protected final String TEXT_707 = "();";
  protected final String TEXT_708 = NL + "\t\t\t\tObject ";
  protected final String TEXT_709 = " = eVirtualGet(";
  protected final String TEXT_710 = ");";
  protected final String TEXT_711 = NL + "\t\t\t\tif (new";
  protected final String TEXT_712 = " != ";
  protected final String TEXT_713 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_714 = "(new";
  protected final String TEXT_715 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_716 = NL + "\t\t\t}";
  protected final String TEXT_717 = NL + "\t\t}";
  protected final String TEXT_718 = NL + "\t\treturn msgs;";
  protected final String TEXT_719 = NL + "\t\treturn ((";
  protected final String TEXT_720 = ".Internal)((";
  protected final String TEXT_721 = ".Internal.Wrapper)get";
  protected final String TEXT_722 = "()).featureMap()).basicAdd(";
  protected final String TEXT_723 = ", new";
  protected final String TEXT_724 = ", msgs);";
  protected final String TEXT_725 = NL + "\t\treturn ((";
  protected final String TEXT_726 = ".Internal)get";
  protected final String TEXT_727 = "()).basicAdd(";
  protected final String TEXT_728 = ", new";
  protected final String TEXT_729 = ", msgs);";
  protected final String TEXT_730 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_731 = "' ";
  protected final String TEXT_732 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_733 = NL + "\t}" + NL;
  protected final String TEXT_734 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_735 = "#";
  protected final String TEXT_736 = " <em>";
  protected final String TEXT_737 = "</em>}' ";
  protected final String TEXT_738 = ".";
  protected final String TEXT_739 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_740 = "</em>' ";
  protected final String TEXT_741 = ".";
  protected final String TEXT_742 = NL + "\t * @see ";
  protected final String TEXT_743 = NL + "\t * @see #isSet";
  protected final String TEXT_744 = "()";
  protected final String TEXT_745 = NL + "\t * @see #unset";
  protected final String TEXT_746 = "()";
  protected final String TEXT_747 = NL + "\t * @see #";
  protected final String TEXT_748 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_749 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_750 = NL + "\t@Override";
  protected final String TEXT_751 = NL + "\tvoid set";
  protected final String TEXT_752 = "(";
  protected final String TEXT_753 = " value);" + NL;
  protected final String TEXT_754 = NL + "\tpublic void set";
  protected final String TEXT_755 = "(";
  protected final String TEXT_756 = " new";
  protected final String TEXT_757 = ")" + NL + "\t{";
  protected final String TEXT_758 = NL + "\t\tnew";
  protected final String TEXT_759 = " = new";
  protected final String TEXT_760 = " == null ? ";
  protected final String TEXT_761 = " : new";
  protected final String TEXT_762 = ";";
  protected final String TEXT_763 = NL + "\t\teSet(";
  protected final String TEXT_764 = ", ";
  protected final String TEXT_765 = "new ";
  protected final String TEXT_766 = "(";
  protected final String TEXT_767 = "new";
  protected final String TEXT_768 = ")";
  protected final String TEXT_769 = ");";
  protected final String TEXT_770 = NL + "\t\tif (new";
  protected final String TEXT_771 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_772 = " && new";
  protected final String TEXT_773 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_774 = ".isAncestor(this, ";
  protected final String TEXT_775 = "new";
  protected final String TEXT_776 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_777 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_778 = NL + "\t\t\t";
  protected final String TEXT_779 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_780 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_781 = ")new";
  protected final String TEXT_782 = ").eInverseAdd(this, ";
  protected final String TEXT_783 = ", ";
  protected final String TEXT_784 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_785 = "(";
  protected final String TEXT_786 = "new";
  protected final String TEXT_787 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_788 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_789 = "(this, ";
  protected final String TEXT_790 = ".SET, ";
  protected final String TEXT_791 = ", new";
  protected final String TEXT_792 = ", new";
  protected final String TEXT_793 = "));";
  protected final String TEXT_794 = NL + "\t\t";
  protected final String TEXT_795 = " ";
  protected final String TEXT_796 = " = (";
  protected final String TEXT_797 = ")eVirtualGet(";
  protected final String TEXT_798 = ");";
  protected final String TEXT_799 = NL + "\t\tif (new";
  protected final String TEXT_800 = " != ";
  protected final String TEXT_801 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_802 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_803 = " != null)";
  protected final String TEXT_804 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_805 = ")";
  protected final String TEXT_806 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_807 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_808 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_809 = ")new";
  protected final String TEXT_810 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_811 = ", null, msgs);";
  protected final String TEXT_812 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_813 = ")";
  protected final String TEXT_814 = ").eInverseRemove(this, ";
  protected final String TEXT_815 = ", ";
  protected final String TEXT_816 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_817 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_818 = ")new";
  protected final String TEXT_819 = ").eInverseAdd(this, ";
  protected final String TEXT_820 = ", ";
  protected final String TEXT_821 = ".class, msgs);";
  protected final String TEXT_822 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_823 = "(";
  protected final String TEXT_824 = "new";
  protected final String TEXT_825 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_826 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_827 = NL + "\t\t\tboolean old";
  protected final String TEXT_828 = "ESet = eVirtualIsSet(";
  protected final String TEXT_829 = ");";
  protected final String TEXT_830 = NL + "\t\t\tboolean old";
  protected final String TEXT_831 = "ESet = (";
  protected final String TEXT_832 = " & ";
  protected final String TEXT_833 = "_ESETFLAG) != 0;";
  protected final String TEXT_834 = NL + "\t\t\t";
  protected final String TEXT_835 = " |= ";
  protected final String TEXT_836 = "_ESETFLAG;";
  protected final String TEXT_837 = NL + "\t\t\tboolean old";
  protected final String TEXT_838 = "ESet = ";
  protected final String TEXT_839 = "ESet;";
  protected final String TEXT_840 = NL + "\t\t\t";
  protected final String TEXT_841 = "ESet = true;";
  protected final String TEXT_842 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_843 = "(this, ";
  protected final String TEXT_844 = ".SET, ";
  protected final String TEXT_845 = ", new";
  protected final String TEXT_846 = ", new";
  protected final String TEXT_847 = ", !old";
  protected final String TEXT_848 = "ESet));";
  protected final String TEXT_849 = NL + "\t\t}";
  protected final String TEXT_850 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_851 = "(this, ";
  protected final String TEXT_852 = ".SET, ";
  protected final String TEXT_853 = ", new";
  protected final String TEXT_854 = ", new";
  protected final String TEXT_855 = "));";
  protected final String TEXT_856 = NL + "\t\t";
  protected final String TEXT_857 = " old";
  protected final String TEXT_858 = " = (";
  protected final String TEXT_859 = " & ";
  protected final String TEXT_860 = "_EFLAG) != 0;";
  protected final String TEXT_861 = NL + "\t\tif (new";
  protected final String TEXT_862 = ") ";
  protected final String TEXT_863 = " |= ";
  protected final String TEXT_864 = "_EFLAG; else ";
  protected final String TEXT_865 = " &= ~";
  protected final String TEXT_866 = "_EFLAG;";
  protected final String TEXT_867 = NL + "\t\t";
  protected final String TEXT_868 = " old";
  protected final String TEXT_869 = " = ";
  protected final String TEXT_870 = ";";
  protected final String TEXT_871 = NL + "\t\t";
  protected final String TEXT_872 = " ";
  protected final String TEXT_873 = " = new";
  protected final String TEXT_874 = " == null ? ";
  protected final String TEXT_875 = " : new";
  protected final String TEXT_876 = ";";
  protected final String TEXT_877 = NL + "\t\t";
  protected final String TEXT_878 = " = new";
  protected final String TEXT_879 = " == null ? ";
  protected final String TEXT_880 = " : new";
  protected final String TEXT_881 = ";";
  protected final String TEXT_882 = NL + "\t\t";
  protected final String TEXT_883 = " ";
  protected final String TEXT_884 = " = ";
  protected final String TEXT_885 = "new";
  protected final String TEXT_886 = ";";
  protected final String TEXT_887 = NL + "\t\t";
  protected final String TEXT_888 = " = ";
  protected final String TEXT_889 = "new";
  protected final String TEXT_890 = ";";
  protected final String TEXT_891 = NL + "\t\tObject old";
  protected final String TEXT_892 = " = eVirtualSet(";
  protected final String TEXT_893 = ", ";
  protected final String TEXT_894 = ");";
  protected final String TEXT_895 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_896 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_897 = NL + "\t\tboolean old";
  protected final String TEXT_898 = "ESet = (";
  protected final String TEXT_899 = " & ";
  protected final String TEXT_900 = "_ESETFLAG) != 0;";
  protected final String TEXT_901 = NL + "\t\t";
  protected final String TEXT_902 = " |= ";
  protected final String TEXT_903 = "_ESETFLAG;";
  protected final String TEXT_904 = NL + "\t\tboolean old";
  protected final String TEXT_905 = "ESet = ";
  protected final String TEXT_906 = "ESet;";
  protected final String TEXT_907 = NL + "\t\t";
  protected final String TEXT_908 = "ESet = true;";
  protected final String TEXT_909 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_910 = "(this, ";
  protected final String TEXT_911 = ".SET, ";
  protected final String TEXT_912 = ", ";
  protected final String TEXT_913 = "isSetChange ? ";
  protected final String TEXT_914 = " : old";
  protected final String TEXT_915 = "old";
  protected final String TEXT_916 = ", ";
  protected final String TEXT_917 = "new";
  protected final String TEXT_918 = ", ";
  protected final String TEXT_919 = "isSetChange";
  protected final String TEXT_920 = "!old";
  protected final String TEXT_921 = "ESet";
  protected final String TEXT_922 = "));";
  protected final String TEXT_923 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_924 = "(this, ";
  protected final String TEXT_925 = ".SET, ";
  protected final String TEXT_926 = ", ";
  protected final String TEXT_927 = "old";
  protected final String TEXT_928 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_929 = " : old";
  protected final String TEXT_930 = "old";
  protected final String TEXT_931 = ", ";
  protected final String TEXT_932 = "new";
  protected final String TEXT_933 = "));";
  protected final String TEXT_934 = NL + "\t\t";
  protected final String TEXT_935 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_936 = NL + "\t\t\t";
  protected final String TEXT_937 = " ";
  protected final String TEXT_938 = " = ";
  protected final String TEXT_939 = "();";
  protected final String TEXT_940 = NL + "\t\t\tObject ";
  protected final String TEXT_941 = " = eVirtualGet(";
  protected final String TEXT_942 = ");";
  protected final String TEXT_943 = NL + "\t\t\tif (";
  protected final String TEXT_944 = " != null && ";
  protected final String TEXT_945 = " != new";
  protected final String TEXT_946 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_947 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_948 = NL + "\t\t\tif (new";
  protected final String TEXT_949 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_950 = NL + "\t\t\t\t";
  protected final String TEXT_951 = " ";
  protected final String TEXT_952 = " = ";
  protected final String TEXT_953 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_954 = ".contains(new";
  protected final String TEXT_955 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_956 = ".add(new";
  protected final String TEXT_957 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_958 = NL + "\t\t\t\t";
  protected final String TEXT_959 = " ";
  protected final String TEXT_960 = " = ";
  protected final String TEXT_961 = "();";
  protected final String TEXT_962 = NL + "\t\t\t\tObject ";
  protected final String TEXT_963 = " = eVirtualGet(";
  protected final String TEXT_964 = ");";
  protected final String TEXT_965 = NL + "\t\t\t\tif (new";
  protected final String TEXT_966 = " != ";
  protected final String TEXT_967 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_968 = "(new";
  protected final String TEXT_969 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_970 = NL + "\t\t\t}";
  protected final String TEXT_971 = NL + "\t\t}";
  protected final String TEXT_972 = NL + "\t\t((";
  protected final String TEXT_973 = ".Internal)((";
  protected final String TEXT_974 = ".Internal.Wrapper)get";
  protected final String TEXT_975 = "()).featureMap()).set(";
  protected final String TEXT_976 = ", ";
  protected final String TEXT_977 = "new ";
  protected final String TEXT_978 = "(";
  protected final String TEXT_979 = "new";
  protected final String TEXT_980 = ")";
  protected final String TEXT_981 = ");";
  protected final String TEXT_982 = NL + "\t\t((";
  protected final String TEXT_983 = ".Internal)get";
  protected final String TEXT_984 = "()).set(";
  protected final String TEXT_985 = ", ";
  protected final String TEXT_986 = "new ";
  protected final String TEXT_987 = "(";
  protected final String TEXT_988 = "new";
  protected final String TEXT_989 = ")";
  protected final String TEXT_990 = ");";
  protected final String TEXT_991 = NL + "\t\t";
  protected final String TEXT_992 = ".";
  protected final String TEXT_993 = "(this, ";
  protected final String TEXT_994 = ");";
  protected final String TEXT_995 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_996 = "' ";
  protected final String TEXT_997 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_998 = NL + "\t}" + NL;
  protected final String TEXT_999 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1000 = NL + "\t@Override";
  protected final String TEXT_1001 = NL + "\tpublic ";
  protected final String TEXT_1002 = " basicUnset";
  protected final String TEXT_1003 = "(";
  protected final String TEXT_1004 = " msgs)" + NL + "\t{";
  protected final String TEXT_1005 = NL + "\t\tObject old";
  protected final String TEXT_1006 = " = eVirtualUnset(";
  protected final String TEXT_1007 = ");";
  protected final String TEXT_1008 = NL + "\t\t";
  protected final String TEXT_1009 = " old";
  protected final String TEXT_1010 = " = ";
  protected final String TEXT_1011 = ";" + NL + "\t\t";
  protected final String TEXT_1012 = " = null;";
  protected final String TEXT_1013 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1014 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1015 = NL + "\t\tboolean old";
  protected final String TEXT_1016 = "ESet = (";
  protected final String TEXT_1017 = " & ";
  protected final String TEXT_1018 = "_ESETFLAG) != 0;" + NL + "\t\t";
  protected final String TEXT_1019 = " &= ~";
  protected final String TEXT_1020 = "_ESETFLAG;";
  protected final String TEXT_1021 = NL + "\t\tboolean old";
  protected final String TEXT_1022 = "ESet = ";
  protected final String TEXT_1023 = "ESet;" + NL + "\t\t";
  protected final String TEXT_1024 = "ESet = false;";
  protected final String TEXT_1025 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1026 = " notification = new ";
  protected final String TEXT_1027 = "(this, ";
  protected final String TEXT_1028 = ".UNSET, ";
  protected final String TEXT_1029 = ", ";
  protected final String TEXT_1030 = "isSetChange ? old";
  protected final String TEXT_1031 = " : null";
  protected final String TEXT_1032 = "old";
  protected final String TEXT_1033 = ", null, ";
  protected final String TEXT_1034 = "isSetChange";
  protected final String TEXT_1035 = "old";
  protected final String TEXT_1036 = "ESet";
  protected final String TEXT_1037 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1038 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1039 = "' ";
  protected final String TEXT_1040 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1041 = NL + "\t}" + NL;
  protected final String TEXT_1042 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1043 = "#";
  protected final String TEXT_1044 = " <em>";
  protected final String TEXT_1045 = "</em>}' ";
  protected final String TEXT_1046 = ".";
  protected final String TEXT_1047 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1048 = NL + "\t * @see #isSet";
  protected final String TEXT_1049 = "()";
  protected final String TEXT_1050 = NL + "\t * @see #";
  protected final String TEXT_1051 = "()";
  protected final String TEXT_1052 = NL + "\t * @see #set";
  protected final String TEXT_1053 = "(";
  protected final String TEXT_1054 = ")";
  protected final String TEXT_1055 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1056 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1057 = NL + "\t@Override";
  protected final String TEXT_1058 = NL + "\tvoid unset";
  protected final String TEXT_1059 = "();" + NL;
  protected final String TEXT_1060 = NL + "\tpublic void unset";
  protected final String TEXT_1061 = "()" + NL + "\t{";
  protected final String TEXT_1062 = NL + "\t\teUnset(";
  protected final String TEXT_1063 = ");";
  protected final String TEXT_1064 = NL + "\t\t";
  protected final String TEXT_1065 = " ";
  protected final String TEXT_1066 = " = (";
  protected final String TEXT_1067 = ")eVirtualGet(";
  protected final String TEXT_1068 = ");";
  protected final String TEXT_1069 = NL + "\t\tif (";
  protected final String TEXT_1070 = " != null) ((";
  protected final String TEXT_1071 = ".Unsettable";
  protected final String TEXT_1072 = ")";
  protected final String TEXT_1073 = ").unset();";
  protected final String TEXT_1074 = NL + "\t\t";
  protected final String TEXT_1075 = " ";
  protected final String TEXT_1076 = " = (";
  protected final String TEXT_1077 = ")eVirtualGet(";
  protected final String TEXT_1078 = ");";
  protected final String TEXT_1079 = NL + "\t\tif (";
  protected final String TEXT_1080 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1081 = " msgs = null;";
  protected final String TEXT_1082 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1083 = ")";
  protected final String TEXT_1084 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1085 = ", null, msgs);";
  protected final String TEXT_1086 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1087 = ")";
  protected final String TEXT_1088 = ").eInverseRemove(this, ";
  protected final String TEXT_1089 = ", ";
  protected final String TEXT_1090 = ".class, msgs);";
  protected final String TEXT_1091 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1092 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1093 = NL + "\t\t\tboolean old";
  protected final String TEXT_1094 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1095 = ");";
  protected final String TEXT_1096 = NL + "\t\t\tboolean old";
  protected final String TEXT_1097 = "ESet = (";
  protected final String TEXT_1098 = " & ";
  protected final String TEXT_1099 = "_ESETFLAG) != 0;";
  protected final String TEXT_1100 = NL + "\t\t\t";
  protected final String TEXT_1101 = " &= ~";
  protected final String TEXT_1102 = "_ESETFLAG;";
  protected final String TEXT_1103 = NL + "\t\t\tboolean old";
  protected final String TEXT_1104 = "ESet = ";
  protected final String TEXT_1105 = "ESet;";
  protected final String TEXT_1106 = NL + "\t\t\t";
  protected final String TEXT_1107 = "ESet = false;";
  protected final String TEXT_1108 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1109 = "(this, ";
  protected final String TEXT_1110 = ".UNSET, ";
  protected final String TEXT_1111 = ", null, null, old";
  protected final String TEXT_1112 = "ESet));";
  protected final String TEXT_1113 = NL + "\t\t}";
  protected final String TEXT_1114 = NL + "\t\t";
  protected final String TEXT_1115 = " old";
  protected final String TEXT_1116 = " = (";
  protected final String TEXT_1117 = " & ";
  protected final String TEXT_1118 = "_EFLAG) != 0;";
  protected final String TEXT_1119 = NL + "\t\tObject old";
  protected final String TEXT_1120 = " = eVirtualUnset(";
  protected final String TEXT_1121 = ");";
  protected final String TEXT_1122 = NL + "\t\t";
  protected final String TEXT_1123 = " old";
  protected final String TEXT_1124 = " = ";
  protected final String TEXT_1125 = ";";
  protected final String TEXT_1126 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1127 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1128 = NL + "\t\tboolean old";
  protected final String TEXT_1129 = "ESet = (";
  protected final String TEXT_1130 = " & ";
  protected final String TEXT_1131 = "_ESETFLAG) != 0;";
  protected final String TEXT_1132 = NL + "\t\tboolean old";
  protected final String TEXT_1133 = "ESet = ";
  protected final String TEXT_1134 = "ESet;";
  protected final String TEXT_1135 = NL + "\t\t";
  protected final String TEXT_1136 = " = null;";
  protected final String TEXT_1137 = NL + "\t\t";
  protected final String TEXT_1138 = " &= ~";
  protected final String TEXT_1139 = "_ESETFLAG;";
  protected final String TEXT_1140 = NL + "\t\t";
  protected final String TEXT_1141 = "ESet = false;";
  protected final String TEXT_1142 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1143 = "(this, ";
  protected final String TEXT_1144 = ".UNSET, ";
  protected final String TEXT_1145 = ", ";
  protected final String TEXT_1146 = "isSetChange ? old";
  protected final String TEXT_1147 = " : null";
  protected final String TEXT_1148 = "old";
  protected final String TEXT_1149 = ", null, ";
  protected final String TEXT_1150 = "isSetChange";
  protected final String TEXT_1151 = "old";
  protected final String TEXT_1152 = "ESet";
  protected final String TEXT_1153 = "));";
  protected final String TEXT_1154 = NL + "\t\tif (";
  protected final String TEXT_1155 = ") ";
  protected final String TEXT_1156 = " |= ";
  protected final String TEXT_1157 = "_EFLAG; else ";
  protected final String TEXT_1158 = " &= ~";
  protected final String TEXT_1159 = "_EFLAG;";
  protected final String TEXT_1160 = NL + "\t\t";
  protected final String TEXT_1161 = " = ";
  protected final String TEXT_1162 = ";";
  protected final String TEXT_1163 = NL + "\t\t";
  protected final String TEXT_1164 = " &= ~";
  protected final String TEXT_1165 = "_ESETFLAG;";
  protected final String TEXT_1166 = NL + "\t\t";
  protected final String TEXT_1167 = "ESet = false;";
  protected final String TEXT_1168 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1169 = "(this, ";
  protected final String TEXT_1170 = ".UNSET, ";
  protected final String TEXT_1171 = ", ";
  protected final String TEXT_1172 = "isSetChange ? old";
  protected final String TEXT_1173 = " : ";
  protected final String TEXT_1174 = "old";
  protected final String TEXT_1175 = ", ";
  protected final String TEXT_1176 = ", ";
  protected final String TEXT_1177 = "isSetChange";
  protected final String TEXT_1178 = "old";
  protected final String TEXT_1179 = "ESet";
  protected final String TEXT_1180 = "));";
  protected final String TEXT_1181 = NL + "\t\t((";
  protected final String TEXT_1182 = ".Internal)((";
  protected final String TEXT_1183 = ".Internal.Wrapper)get";
  protected final String TEXT_1184 = "()).featureMap()).clear(";
  protected final String TEXT_1185 = ");";
  protected final String TEXT_1186 = NL + "\t\t((";
  protected final String TEXT_1187 = ".Internal)get";
  protected final String TEXT_1188 = "()).clear(";
  protected final String TEXT_1189 = ");";
  protected final String TEXT_1190 = NL + "\t\t";
  protected final String TEXT_1191 = ".";
  protected final String TEXT_1192 = "(this);";
  protected final String TEXT_1193 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1194 = "' ";
  protected final String TEXT_1195 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1196 = NL + "\t}" + NL;
  protected final String TEXT_1197 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1198 = "#";
  protected final String TEXT_1199 = " <em>";
  protected final String TEXT_1200 = "</em>}' ";
  protected final String TEXT_1201 = " is set.";
  protected final String TEXT_1202 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1203 = "</em>' ";
  protected final String TEXT_1204 = " is set.";
  protected final String TEXT_1205 = NL + "\t * @see #unset";
  protected final String TEXT_1206 = "()";
  protected final String TEXT_1207 = NL + "\t * @see #";
  protected final String TEXT_1208 = "()";
  protected final String TEXT_1209 = NL + "\t * @see #set";
  protected final String TEXT_1210 = "(";
  protected final String TEXT_1211 = ")";
  protected final String TEXT_1212 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1213 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1214 = NL + "\t@Override";
  protected final String TEXT_1215 = NL + "\tboolean isSet";
  protected final String TEXT_1216 = "();" + NL;
  protected final String TEXT_1217 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1218 = "()" + NL + "\t{";
  protected final String TEXT_1219 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1220 = ");";
  protected final String TEXT_1221 = NL + "\t\t";
  protected final String TEXT_1222 = " ";
  protected final String TEXT_1223 = " = (";
  protected final String TEXT_1224 = ")eVirtualGet(";
  protected final String TEXT_1225 = ");";
  protected final String TEXT_1226 = NL + "\t\treturn ";
  protected final String TEXT_1227 = " != null && ((";
  protected final String TEXT_1228 = ".Unsettable";
  protected final String TEXT_1229 = ")";
  protected final String TEXT_1230 = ").isSet();";
  protected final String TEXT_1231 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1232 = ");";
  protected final String TEXT_1233 = NL + "\t\treturn (";
  protected final String TEXT_1234 = " & ";
  protected final String TEXT_1235 = "_ESETFLAG) != 0;";
  protected final String TEXT_1236 = NL + "\t\treturn ";
  protected final String TEXT_1237 = "ESet;";
  protected final String TEXT_1238 = NL + "\t\treturn !((";
  protected final String TEXT_1239 = ".Internal)((";
  protected final String TEXT_1240 = ".Internal.Wrapper)get";
  protected final String TEXT_1241 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1242 = ");";
  protected final String TEXT_1243 = NL + "\t\treturn !((";
  protected final String TEXT_1244 = ".Internal)get";
  protected final String TEXT_1245 = "()).isEmpty(";
  protected final String TEXT_1246 = ");";
  protected final String TEXT_1247 = NL + "\t\treturn ";
  protected final String TEXT_1248 = ".";
  protected final String TEXT_1249 = "(this);";
  protected final String TEXT_1250 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1251 = "' ";
  protected final String TEXT_1252 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1253 = NL + "\t}" + NL;
  protected final String TEXT_1254 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1255 = "() <em>";
  protected final String TEXT_1256 = "</em>}' ";
  protected final String TEXT_1257 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1258 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1259 = "_ESUBSETS = ";
  protected final String TEXT_1260 = ";" + NL;
  protected final String TEXT_1261 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1262 = "() <em>";
  protected final String TEXT_1263 = "</em>}' ";
  protected final String TEXT_1264 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1265 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1266 = "_ESUPERSETS = ";
  protected final String TEXT_1267 = ";" + NL;
  protected final String TEXT_1268 = NL + "\t/**";
  protected final String TEXT_1269 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1270 = "}, with the specified ";
  protected final String TEXT_1271 = ", and appends it to the '<em><b>";
  protected final String TEXT_1272 = "</b></em>' ";
  protected final String TEXT_1273 = ".";
  protected final String TEXT_1274 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1275 = "}, with the specified ";
  protected final String TEXT_1276 = ", and sets the '<em><b>";
  protected final String TEXT_1277 = "</b></em>' ";
  protected final String TEXT_1278 = ".";
  protected final String TEXT_1279 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1280 = "} and appends it to the '<em><b>";
  protected final String TEXT_1281 = "</b></em>' ";
  protected final String TEXT_1282 = ".";
  protected final String TEXT_1283 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1284 = "} and sets the '<em><b>";
  protected final String TEXT_1285 = "</b></em>' ";
  protected final String TEXT_1286 = ".";
  protected final String TEXT_1287 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1288 = NL + "\t * @param ";
  protected final String TEXT_1289 = " The ";
  protected final String TEXT_1290 = " for the new {@link ";
  protected final String TEXT_1291 = "}, or <code>null</code>.";
  protected final String TEXT_1292 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1293 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1294 = "}." + NL + "\t * @see #";
  protected final String TEXT_1295 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1296 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1297 = NL + "\t";
  protected final String TEXT_1298 = " create";
  protected final String TEXT_1299 = "(";
  protected final String TEXT_1300 = ", ";
  protected final String TEXT_1301 = " eClass);" + NL;
  protected final String TEXT_1302 = NL + "\t@Override";
  protected final String TEXT_1303 = NL + "\tpublic ";
  protected final String TEXT_1304 = " create";
  protected final String TEXT_1305 = "(";
  protected final String TEXT_1306 = ", ";
  protected final String TEXT_1307 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1308 = " new";
  protected final String TEXT_1309 = " = (";
  protected final String TEXT_1310 = ") create(eClass);";
  protected final String TEXT_1311 = NL + "\t\t";
  protected final String TEXT_1312 = "().add(new";
  protected final String TEXT_1313 = ");";
  protected final String TEXT_1314 = NL + "\t\tset";
  protected final String TEXT_1315 = "(new";
  protected final String TEXT_1316 = ");";
  protected final String TEXT_1317 = NL + "\t\tint ";
  protected final String TEXT_1318 = "ListSize = 0;";
  protected final String TEXT_1319 = NL + "\t\tint ";
  protected final String TEXT_1320 = "Size = ";
  protected final String TEXT_1321 = " == null ? 0 : ";
  protected final String TEXT_1322 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1323 = "Size > ";
  protected final String TEXT_1324 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1325 = "ListSize = ";
  protected final String TEXT_1326 = "Size;";
  protected final String TEXT_1327 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1328 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1329 = ".create";
  protected final String TEXT_1330 = "(";
  protected final String TEXT_1331 = ", ";
  protected final String TEXT_1332 = "i < ";
  protected final String TEXT_1333 = "Size ? (";
  protected final String TEXT_1334 = ") ";
  protected final String TEXT_1335 = ".get(i) : null";
  protected final String TEXT_1336 = ");" + NL + "\t\t}";
  protected final String TEXT_1337 = NL + "\t\tnew";
  protected final String TEXT_1338 = ".create";
  protected final String TEXT_1339 = "(";
  protected final String TEXT_1340 = ", ";
  protected final String TEXT_1341 = ");";
  protected final String TEXT_1342 = NL + "\t\tif (";
  protected final String TEXT_1343 = " != null)";
  protected final String TEXT_1344 = NL + "\t\t\tnew";
  protected final String TEXT_1345 = ".";
  protected final String TEXT_1346 = "().addAll(";
  protected final String TEXT_1347 = ");";
  protected final String TEXT_1348 = NL + "\t\t\tnew";
  protected final String TEXT_1349 = ".set";
  protected final String TEXT_1350 = "(";
  protected final String TEXT_1351 = ");";
  protected final String TEXT_1352 = NL + "\t\treturn new";
  protected final String TEXT_1353 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1354 = NL + "\t/**";
  protected final String TEXT_1355 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1356 = "}, with the specified ";
  protected final String TEXT_1357 = ", and appends it to the '<em><b>";
  protected final String TEXT_1358 = "</b></em>' ";
  protected final String TEXT_1359 = ".";
  protected final String TEXT_1360 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1361 = "},with the specified ";
  protected final String TEXT_1362 = ", and sets the '<em><b>";
  protected final String TEXT_1363 = "</b></em>' ";
  protected final String TEXT_1364 = ".";
  protected final String TEXT_1365 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1366 = "} and appends it to the '<em><b>";
  protected final String TEXT_1367 = "</b></em>' ";
  protected final String TEXT_1368 = ".";
  protected final String TEXT_1369 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1370 = "} and sets the '<em><b>";
  protected final String TEXT_1371 = "</b></em>' ";
  protected final String TEXT_1372 = ".";
  protected final String TEXT_1373 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1374 = NL + "\t * @param ";
  protected final String TEXT_1375 = " The ";
  protected final String TEXT_1376 = " for the new {@link ";
  protected final String TEXT_1377 = "}, or <code>null</code>.";
  protected final String TEXT_1378 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1379 = "}." + NL + "\t * @see #";
  protected final String TEXT_1380 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1381 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1382 = NL + "\t";
  protected final String TEXT_1383 = " create";
  protected final String TEXT_1384 = "(";
  protected final String TEXT_1385 = ");" + NL;
  protected final String TEXT_1386 = NL + "\t@Override";
  protected final String TEXT_1387 = NL + "\tpublic ";
  protected final String TEXT_1388 = " create";
  protected final String TEXT_1389 = "(";
  protected final String TEXT_1390 = ")" + NL + "\t{";
  protected final String TEXT_1391 = NL + "\t\treturn create";
  protected final String TEXT_1392 = "(";
  protected final String TEXT_1393 = ", ";
  protected final String TEXT_1394 = ");";
  protected final String TEXT_1395 = NL + "\t\t";
  protected final String TEXT_1396 = " new";
  protected final String TEXT_1397 = " = (";
  protected final String TEXT_1398 = ") create(";
  protected final String TEXT_1399 = ");";
  protected final String TEXT_1400 = NL + "\t\t";
  protected final String TEXT_1401 = "().add(new";
  protected final String TEXT_1402 = ");";
  protected final String TEXT_1403 = NL + "\t\tset";
  protected final String TEXT_1404 = "(new";
  protected final String TEXT_1405 = ");";
  protected final String TEXT_1406 = NL + "\t\tint ";
  protected final String TEXT_1407 = "ListSize = 0;";
  protected final String TEXT_1408 = NL + "\t\tint ";
  protected final String TEXT_1409 = "Size = ";
  protected final String TEXT_1410 = " == null ? 0 : ";
  protected final String TEXT_1411 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1412 = "Size > ";
  protected final String TEXT_1413 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1414 = "ListSize = ";
  protected final String TEXT_1415 = "Size;";
  protected final String TEXT_1416 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1417 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1418 = ".create";
  protected final String TEXT_1419 = "(";
  protected final String TEXT_1420 = ", ";
  protected final String TEXT_1421 = "i < ";
  protected final String TEXT_1422 = "Size ? (";
  protected final String TEXT_1423 = ") ";
  protected final String TEXT_1424 = ".get(i) : null";
  protected final String TEXT_1425 = ");" + NL + "\t\t}";
  protected final String TEXT_1426 = NL + "\t\tnew";
  protected final String TEXT_1427 = ".create";
  protected final String TEXT_1428 = "(";
  protected final String TEXT_1429 = ", ";
  protected final String TEXT_1430 = ");";
  protected final String TEXT_1431 = NL + "\t\tif (";
  protected final String TEXT_1432 = " != null)";
  protected final String TEXT_1433 = NL + "\t\t\tnew";
  protected final String TEXT_1434 = ".";
  protected final String TEXT_1435 = "().addAll(";
  protected final String TEXT_1436 = ");";
  protected final String TEXT_1437 = NL + "\t\t\tnew";
  protected final String TEXT_1438 = ".set";
  protected final String TEXT_1439 = "(";
  protected final String TEXT_1440 = ");";
  protected final String TEXT_1441 = NL + "\t\treturn new";
  protected final String TEXT_1442 = ";";
  protected final String TEXT_1443 = NL + "\t}" + NL;
  protected final String TEXT_1444 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1445 = "} with the specified ";
  protected final String TEXT_1446 = " from the '<em><b>";
  protected final String TEXT_1447 = "</b></em>' ";
  protected final String TEXT_1448 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1449 = NL + "\t * @param ";
  protected final String TEXT_1450 = " The ";
  protected final String TEXT_1451 = " of the {@link ";
  protected final String TEXT_1452 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1453 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1454 = "} with the specified ";
  protected final String TEXT_1455 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1456 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1457 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1458 = NL + "\t";
  protected final String TEXT_1459 = " get";
  protected final String TEXT_1460 = "(";
  protected final String TEXT_1461 = ");" + NL;
  protected final String TEXT_1462 = NL + "\t@Override";
  protected final String TEXT_1463 = NL + "\tpublic ";
  protected final String TEXT_1464 = " get";
  protected final String TEXT_1465 = "(";
  protected final String TEXT_1466 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1467 = "(";
  protected final String TEXT_1468 = ", false";
  protected final String TEXT_1469 = ", null";
  protected final String TEXT_1470 = ", false";
  protected final String TEXT_1471 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1472 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1473 = "} with the specified ";
  protected final String TEXT_1474 = " from the '<em><b>";
  protected final String TEXT_1475 = "</b></em>' ";
  protected final String TEXT_1476 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1477 = NL + "\t * @param ";
  protected final String TEXT_1478 = " The ";
  protected final String TEXT_1479 = " of the {@link ";
  protected final String TEXT_1480 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1481 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1482 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1483 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1484 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1485 = "} on demand if not found.";
  protected final String TEXT_1486 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1487 = "} with the specified ";
  protected final String TEXT_1488 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1489 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1490 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1491 = NL + "\t";
  protected final String TEXT_1492 = " get";
  protected final String TEXT_1493 = "(";
  protected final String TEXT_1494 = ", boolean ignoreCase";
  protected final String TEXT_1495 = ", ";
  protected final String TEXT_1496 = " eClass";
  protected final String TEXT_1497 = ", boolean createOnDemand";
  protected final String TEXT_1498 = ");" + NL;
  protected final String TEXT_1499 = NL + "\t@Override";
  protected final String TEXT_1500 = NL + "\tpublic ";
  protected final String TEXT_1501 = " get";
  protected final String TEXT_1502 = "(";
  protected final String TEXT_1503 = ", boolean ignoreCase";
  protected final String TEXT_1504 = ", ";
  protected final String TEXT_1505 = " eClass";
  protected final String TEXT_1506 = ", boolean createOnDemand";
  protected final String TEXT_1507 = ")" + NL + "\t{";
  protected final String TEXT_1508 = NL + "\t\t";
  protected final String TEXT_1509 = "Loop: for (";
  protected final String TEXT_1510 = " ";
  protected final String TEXT_1511 = " : ";
  protected final String TEXT_1512 = "())" + NL + "\t\t{";
  protected final String TEXT_1513 = NL + "\t\t";
  protected final String TEXT_1514 = "Loop: for (";
  protected final String TEXT_1515 = " i = ";
  protected final String TEXT_1516 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1517 = " ";
  protected final String TEXT_1518 = " = (";
  protected final String TEXT_1519 = ") i.next();";
  protected final String TEXT_1520 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1521 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1522 = "Loop;";
  protected final String TEXT_1523 = NL + "\t\t\t";
  protected final String TEXT_1524 = " ";
  protected final String TEXT_1525 = "List = ";
  protected final String TEXT_1526 = ".";
  protected final String TEXT_1527 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1528 = "ListSize = ";
  protected final String TEXT_1529 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1530 = " || (";
  protected final String TEXT_1531 = " != null && ";
  protected final String TEXT_1532 = ".size() != ";
  protected final String TEXT_1533 = "ListSize";
  protected final String TEXT_1534 = ")";
  protected final String TEXT_1535 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1536 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1537 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1538 = " ";
  protected final String TEXT_1539 = " = ";
  protected final String TEXT_1540 = "(";
  protected final String TEXT_1541 = ") ";
  protected final String TEXT_1542 = "List.get(j);";
  protected final String TEXT_1543 = NL + "\t\t\t\tif (";
  protected final String TEXT_1544 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1545 = "(";
  protected final String TEXT_1546 = ")";
  protected final String TEXT_1547 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1548 = ".";
  protected final String TEXT_1549 = "()) : ";
  protected final String TEXT_1550 = ".get(j).equals(";
  protected final String TEXT_1551 = ".";
  protected final String TEXT_1552 = "())))";
  protected final String TEXT_1553 = NL + "\t\t\t\tif (";
  protected final String TEXT_1554 = " != null && !";
  protected final String TEXT_1555 = ".get(j).equals(";
  protected final String TEXT_1556 = ".";
  protected final String TEXT_1557 = "()))";
  protected final String TEXT_1558 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1559 = "Loop;";
  protected final String TEXT_1560 = NL + "\t\t\t}";
  protected final String TEXT_1561 = NL + "\t\t\t";
  protected final String TEXT_1562 = " ";
  protected final String TEXT_1563 = " = ";
  protected final String TEXT_1564 = ".";
  protected final String TEXT_1565 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1566 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1567 = "Loop;";
  protected final String TEXT_1568 = NL + "\t\t\tif (";
  protected final String TEXT_1569 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1570 = ".equalsIgnoreCase(";
  protected final String TEXT_1571 = ".";
  protected final String TEXT_1572 = "()) : ";
  protected final String TEXT_1573 = ".equals(";
  protected final String TEXT_1574 = ".";
  protected final String TEXT_1575 = "())))";
  protected final String TEXT_1576 = NL + "\t\t\tif (";
  protected final String TEXT_1577 = " != null && !";
  protected final String TEXT_1578 = ".equals(";
  protected final String TEXT_1579 = ".";
  protected final String TEXT_1580 = "()))";
  protected final String TEXT_1581 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1582 = "Loop;";
  protected final String TEXT_1583 = NL + "\t\t\tif (";
  protected final String TEXT_1584 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1585 = ".equalsIgnoreCase(";
  protected final String TEXT_1586 = ".";
  protected final String TEXT_1587 = "()) : ";
  protected final String TEXT_1588 = ".equals(";
  protected final String TEXT_1589 = ".";
  protected final String TEXT_1590 = "())))";
  protected final String TEXT_1591 = NL + "\t\t\tif (";
  protected final String TEXT_1592 = " != null && !";
  protected final String TEXT_1593 = ".equals(";
  protected final String TEXT_1594 = ".";
  protected final String TEXT_1595 = "()))";
  protected final String TEXT_1596 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1597 = "Loop;";
  protected final String TEXT_1598 = NL + "\t\t\treturn ";
  protected final String TEXT_1599 = ";" + NL + "\t\t}";
  protected final String TEXT_1600 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1601 = " && eClass != null";
  protected final String TEXT_1602 = " ? create";
  protected final String TEXT_1603 = "(";
  protected final String TEXT_1604 = ", eClass";
  protected final String TEXT_1605 = ") : null;";
  protected final String TEXT_1606 = NL + "\t\treturn null;";
  protected final String TEXT_1607 = NL + "\t}" + NL;
  protected final String TEXT_1608 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1609 = "()" + NL + "\t{";
  protected final String TEXT_1610 = NL + "  \t\treturn false;";
  protected final String TEXT_1611 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1612 = ");";
  protected final String TEXT_1613 = NL + "\t\treturn !((";
  protected final String TEXT_1614 = ".Internal.Wrapper)";
  protected final String TEXT_1615 = "()).featureMap().isEmpty();";
  protected final String TEXT_1616 = NL + "\t\treturn ";
  protected final String TEXT_1617 = " != null && !";
  protected final String TEXT_1618 = ".featureMap().isEmpty();";
  protected final String TEXT_1619 = NL + "\t\treturn ";
  protected final String TEXT_1620 = " != null && !";
  protected final String TEXT_1621 = ".isEmpty();";
  protected final String TEXT_1622 = NL + "\t\t";
  protected final String TEXT_1623 = " ";
  protected final String TEXT_1624 = " = (";
  protected final String TEXT_1625 = ")eVirtualGet(";
  protected final String TEXT_1626 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1627 = " != null && !";
  protected final String TEXT_1628 = ".isEmpty();";
  protected final String TEXT_1629 = NL + "\t\treturn !";
  protected final String TEXT_1630 = "().isEmpty();";
  protected final String TEXT_1631 = NL + "\t\treturn ";
  protected final String TEXT_1632 = " != null;";
  protected final String TEXT_1633 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1634 = ") != null;";
  protected final String TEXT_1635 = NL + "\t\treturn basicGet";
  protected final String TEXT_1636 = "() != null;";
  protected final String TEXT_1637 = NL + "\t\treturn ";
  protected final String TEXT_1638 = " != null;";
  protected final String TEXT_1639 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1640 = ") != null;";
  protected final String TEXT_1641 = NL + "\t\treturn ";
  protected final String TEXT_1642 = "() != null;";
  protected final String TEXT_1643 = NL + "\t\treturn ((";
  protected final String TEXT_1644 = " & ";
  protected final String TEXT_1645 = "_EFLAG) != 0) != ";
  protected final String TEXT_1646 = ";";
  protected final String TEXT_1647 = NL + "\t\treturn ";
  protected final String TEXT_1648 = " != ";
  protected final String TEXT_1649 = ";";
  protected final String TEXT_1650 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1651 = ", ";
  protected final String TEXT_1652 = ") != ";
  protected final String TEXT_1653 = ";";
  protected final String TEXT_1654 = NL + "\t\treturn ";
  protected final String TEXT_1655 = "() != ";
  protected final String TEXT_1656 = ";";
  protected final String TEXT_1657 = NL + "\t\treturn ";
  protected final String TEXT_1658 = " == null ? ";
  protected final String TEXT_1659 = " != null : !";
  protected final String TEXT_1660 = ".equals(";
  protected final String TEXT_1661 = ");";
  protected final String TEXT_1662 = NL + "\t\t";
  protected final String TEXT_1663 = " ";
  protected final String TEXT_1664 = " = (";
  protected final String TEXT_1665 = ")eVirtualGet(";
  protected final String TEXT_1666 = ", ";
  protected final String TEXT_1667 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1668 = " == null ? ";
  protected final String TEXT_1669 = " != null : !";
  protected final String TEXT_1670 = ".equals(";
  protected final String TEXT_1671 = ");";
  protected final String TEXT_1672 = NL + "\t\treturn ";
  protected final String TEXT_1673 = " == null ? ";
  protected final String TEXT_1674 = "() != null : !";
  protected final String TEXT_1675 = ".equals(";
  protected final String TEXT_1676 = "());";
  protected final String TEXT_1677 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1678 = ");";
  protected final String TEXT_1679 = NL + "\t\t";
  protected final String TEXT_1680 = " ";
  protected final String TEXT_1681 = " = (";
  protected final String TEXT_1682 = ")eVirtualGet(";
  protected final String TEXT_1683 = ");";
  protected final String TEXT_1684 = NL + "\t\treturn ";
  protected final String TEXT_1685 = " != null && ((";
  protected final String TEXT_1686 = ".Unsettable";
  protected final String TEXT_1687 = ")";
  protected final String TEXT_1688 = ").isSet();";
  protected final String TEXT_1689 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1690 = ");";
  protected final String TEXT_1691 = NL + "\t\treturn (";
  protected final String TEXT_1692 = " & ";
  protected final String TEXT_1693 = "_ESETFLAG) != 0;";
  protected final String TEXT_1694 = NL + "\t\treturn ";
  protected final String TEXT_1695 = "ESet;";
  protected final String TEXT_1696 = NL + "\t\treturn !((";
  protected final String TEXT_1697 = ".Internal)((";
  protected final String TEXT_1698 = ".Internal.Wrapper)get";
  protected final String TEXT_1699 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1700 = ");";
  protected final String TEXT_1701 = NL + "\t\treturn !((";
  protected final String TEXT_1702 = ".Internal)get";
  protected final String TEXT_1703 = "()).isEmpty(";
  protected final String TEXT_1704 = ");";
  protected final String TEXT_1705 = NL + "\t\treturn ";
  protected final String TEXT_1706 = ".";
  protected final String TEXT_1707 = "(this);";
  protected final String TEXT_1708 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1709 = "' ";
  protected final String TEXT_1710 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1711 = NL + "\t}" + NL;
  protected final String TEXT_1712 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_1713 = "(";
  protected final String TEXT_1714 = ") <em>";
  protected final String TEXT_1715 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1716 = "(";
  protected final String TEXT_1717 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1718 = " ";
  protected final String TEXT_1719 = "__EOCL_EXP = \"";
  protected final String TEXT_1720 = "\";";
  protected final String TEXT_1721 = NL;
  protected final String TEXT_1722 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_1723 = "(";
  protected final String TEXT_1724 = ") <em>";
  protected final String TEXT_1725 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1726 = "(";
  protected final String TEXT_1727 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1728 = " ";
  protected final String TEXT_1729 = "__EOCL_INV;" + NL;
  protected final String TEXT_1730 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_1731 = "(";
  protected final String TEXT_1732 = ") <em>";
  protected final String TEXT_1733 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1734 = "(";
  protected final String TEXT_1735 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1736 = "<";
  protected final String TEXT_1737 = ">";
  protected final String TEXT_1738 = " ";
  protected final String TEXT_1739 = "__EOCL_QRY;" + NL;
  protected final String TEXT_1740 = NL + "\t/**";
  protected final String TEXT_1741 = NL + "\t * <p>" + NL + "\t * This operation redefines the following operations:" + NL + "\t * <ul>";
  protected final String TEXT_1742 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_1743 = "#";
  protected final String TEXT_1744 = "(";
  protected final String TEXT_1745 = ") <em>";
  protected final String TEXT_1746 = "</em>}' </li>";
  protected final String TEXT_1747 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_1748 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1749 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1750 = NL + "\t * ";
  protected final String TEXT_1751 = NL + "\t * @param ";
  protected final String TEXT_1752 = NL + "\t *   ";
  protected final String TEXT_1753 = NL + "\t * @param ";
  protected final String TEXT_1754 = " ";
  protected final String TEXT_1755 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1756 = NL + "\t * @model ";
  protected final String TEXT_1757 = NL + "\t *        ";
  protected final String TEXT_1758 = NL + "\t * @model";
  protected final String TEXT_1759 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1760 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1761 = NL + "\t@Override";
  protected final String TEXT_1762 = NL + "\t";
  protected final String TEXT_1763 = " ";
  protected final String TEXT_1764 = "(";
  protected final String TEXT_1765 = ")";
  protected final String TEXT_1766 = ";" + NL;
  protected final String TEXT_1767 = NL + "\tpublic ";
  protected final String TEXT_1768 = " ";
  protected final String TEXT_1769 = "(";
  protected final String TEXT_1770 = ")";
  protected final String TEXT_1771 = NL + "\t{";
  protected final String TEXT_1772 = NL + "\t\t";
  protected final String TEXT_1773 = NL + "\t\treturn ";
  protected final String TEXT_1774 = ".";
  protected final String TEXT_1775 = "(this, ";
  protected final String TEXT_1776 = ", ";
  protected final String TEXT_1777 = ");";
  protected final String TEXT_1778 = NL + "\t\tif (";
  protected final String TEXT_1779 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1780 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_1781 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1782 = " = helper.createInvariant(";
  protected final String TEXT_1783 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_1784 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_1785 = ").check(this))";
  protected final String TEXT_1786 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_1787 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1788 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1789 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1790 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1791 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1792 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1793 = ".";
  protected final String TEXT_1794 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1795 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1796 = "\", ";
  protected final String TEXT_1797 = ".getObjectLabel(this, ";
  protected final String TEXT_1798 = ") }),";
  protected final String TEXT_1799 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1800 = NL + "\t\t";
  protected final String TEXT_1801 = ".";
  protected final String TEXT_1802 = "(this";
  protected final String TEXT_1803 = ", ";
  protected final String TEXT_1804 = ");";
  protected final String TEXT_1805 = NL + "\t\t";
  protected final String TEXT_1806 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_1807 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1808 = NL + "\t\t\t";
  protected final String TEXT_1809 = " result = (";
  protected final String TEXT_1810 = ") cache.get(";
  protected final String TEXT_1811 = "eResource(), ";
  protected final String TEXT_1812 = "this, ";
  protected final String TEXT_1813 = ".getEOperations().get(";
  protected final String TEXT_1814 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1815 = "eResource(), ";
  protected final String TEXT_1816 = "this, ";
  protected final String TEXT_1817 = ".getEOperations().get(";
  protected final String TEXT_1818 = "), result = ";
  protected final String TEXT_1819 = "new ";
  protected final String TEXT_1820 = "(";
  protected final String TEXT_1821 = ".";
  protected final String TEXT_1822 = "(this";
  protected final String TEXT_1823 = ", ";
  protected final String TEXT_1824 = ")";
  protected final String TEXT_1825 = ")";
  protected final String TEXT_1826 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1827 = ".";
  protected final String TEXT_1828 = "()";
  protected final String TEXT_1829 = ";" + NL + "\t\t}";
  protected final String TEXT_1830 = NL + "\t\treturn ";
  protected final String TEXT_1831 = ".";
  protected final String TEXT_1832 = "(this";
  protected final String TEXT_1833 = ", ";
  protected final String TEXT_1834 = ");";
  protected final String TEXT_1835 = NL + "\t\tif (";
  protected final String TEXT_1836 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1837 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_1838 = ", ";
  protected final String TEXT_1839 = ".getEAllOperations().get(";
  protected final String TEXT_1840 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1841 = " = helper.createQuery(";
  protected final String TEXT_1842 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_1843 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_1844 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_1845 = ");";
  protected final String TEXT_1846 = NL + "\t\t";
  protected final String TEXT_1847 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_1848 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_1849 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_1850 = "\", ";
  protected final String TEXT_1851 = ");";
  protected final String TEXT_1852 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1853 = NL + "\t\t";
  protected final String TEXT_1854 = "<";
  protected final String TEXT_1855 = "> result = (";
  protected final String TEXT_1856 = "<";
  protected final String TEXT_1857 = ">) query.evaluate(this);" + NL + "\t\treturn new ";
  protected final String TEXT_1858 = ".UnmodifiableEList<";
  protected final String TEXT_1859 = ">(result.size(), result.toArray());";
  protected final String TEXT_1860 = NL + "\t\treturn ((";
  protected final String TEXT_1861 = ") query.evaluate(this)).";
  protected final String TEXT_1862 = "();";
  protected final String TEXT_1863 = NL + "\t\treturn (";
  protected final String TEXT_1864 = ") query.evaluate(this);";
  protected final String TEXT_1865 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1866 = NL + "\t}" + NL;
  protected final String TEXT_1867 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1868 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1869 = NL + "\t@Override";
  protected final String TEXT_1870 = NL + "\tpublic ";
  protected final String TEXT_1871 = " eInverseAdd(";
  protected final String TEXT_1872 = " otherEnd, int featureID, ";
  protected final String TEXT_1873 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1874 = ")" + NL + "\t\t{";
  protected final String TEXT_1875 = NL + "\t\t\tcase ";
  protected final String TEXT_1876 = ":";
  protected final String TEXT_1877 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1878 = "(";
  protected final String TEXT_1879 = ".InternalMapView";
  protected final String TEXT_1880 = ")";
  protected final String TEXT_1881 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1882 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1883 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1884 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1885 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1886 = "((";
  protected final String TEXT_1887 = ")otherEnd, msgs);";
  protected final String TEXT_1888 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1889 = ", msgs);";
  protected final String TEXT_1890 = NL + "\t\t\t\t";
  protected final String TEXT_1891 = " ";
  protected final String TEXT_1892 = " = (";
  protected final String TEXT_1893 = ")eVirtualGet(";
  protected final String TEXT_1894 = ");";
  protected final String TEXT_1895 = NL + "\t\t\t\t";
  protected final String TEXT_1896 = " ";
  protected final String TEXT_1897 = " = ";
  protected final String TEXT_1898 = "basicGet";
  protected final String TEXT_1899 = "();";
  protected final String TEXT_1900 = NL + "\t\t\t\tif (";
  protected final String TEXT_1901 = " != null)";
  protected final String TEXT_1902 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1903 = ")";
  protected final String TEXT_1904 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1905 = ", null, msgs);";
  protected final String TEXT_1906 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1907 = ")";
  protected final String TEXT_1908 = ").eInverseRemove(this, ";
  protected final String TEXT_1909 = ", ";
  protected final String TEXT_1910 = ".class, msgs);";
  protected final String TEXT_1911 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1912 = "((";
  protected final String TEXT_1913 = ")otherEnd, msgs);";
  protected final String TEXT_1914 = NL + "\t\t}";
  protected final String TEXT_1915 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1916 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_1917 = NL + "\t}" + NL;
  protected final String TEXT_1918 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1919 = NL + "\t@Override";
  protected final String TEXT_1920 = NL + "\tpublic ";
  protected final String TEXT_1921 = " eInverseRemove(";
  protected final String TEXT_1922 = " otherEnd, int featureID, ";
  protected final String TEXT_1923 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1924 = ")" + NL + "\t\t{";
  protected final String TEXT_1925 = NL + "\t\t\tcase ";
  protected final String TEXT_1926 = ":";
  protected final String TEXT_1927 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1928 = ")((";
  protected final String TEXT_1929 = ".InternalMapView";
  protected final String TEXT_1930 = ")";
  protected final String TEXT_1931 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1932 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1933 = ")((";
  protected final String TEXT_1934 = ".Internal.Wrapper)";
  protected final String TEXT_1935 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1936 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1937 = ")";
  protected final String TEXT_1938 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_1939 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_1940 = ", msgs);";
  protected final String TEXT_1941 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_1942 = "(msgs);";
  protected final String TEXT_1943 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1944 = "(null, msgs);";
  protected final String TEXT_1945 = NL + "\t\t}";
  protected final String TEXT_1946 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1947 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_1948 = NL + "\t}" + NL;
  protected final String TEXT_1949 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1950 = NL + "\t@Override";
  protected final String TEXT_1951 = NL + "\tpublic ";
  protected final String TEXT_1952 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_1953 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID";
  protected final String TEXT_1954 = ")" + NL + "\t\t{";
  protected final String TEXT_1955 = NL + "\t\t\tcase ";
  protected final String TEXT_1956 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_1957 = ", ";
  protected final String TEXT_1958 = ".class, msgs);";
  protected final String TEXT_1959 = NL + "\t\t}";
  protected final String TEXT_1960 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_1961 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1962 = NL + "\t}" + NL;
  protected final String TEXT_1963 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1964 = NL + "\t@Override";
  protected final String TEXT_1965 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1966 = ")" + NL + "\t\t{";
  protected final String TEXT_1967 = NL + "\t\t\tcase ";
  protected final String TEXT_1968 = ":";
  protected final String TEXT_1969 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1970 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_1971 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_1972 = "(";
  protected final String TEXT_1973 = "());";
  protected final String TEXT_1974 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_1975 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_1976 = "();";
  protected final String TEXT_1977 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1978 = ".InternalMapView";
  protected final String TEXT_1979 = ")";
  protected final String TEXT_1980 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1981 = "();";
  protected final String TEXT_1982 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1983 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_1984 = "().map();";
  protected final String TEXT_1985 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_1986 = ".Internal.Wrapper)";
  protected final String TEXT_1987 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_1988 = "();";
  protected final String TEXT_1989 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_1990 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_1991 = ".Internal)";
  protected final String TEXT_1992 = "()).getWrapper();";
  protected final String TEXT_1993 = NL + "\t\t\t\treturn ";
  protected final String TEXT_1994 = "();";
  protected final String TEXT_1995 = NL + "\t\t}";
  protected final String TEXT_1996 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_1997 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_1998 = NL + "\t}" + NL;
  protected final String TEXT_1999 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2000 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2001 = NL + "\t@Override";
  protected final String TEXT_2002 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2003 = ")" + NL + "\t\t{";
  protected final String TEXT_2004 = NL + "\t\t\tcase ";
  protected final String TEXT_2005 = ":";
  protected final String TEXT_2006 = NL + "\t\t\t\t((";
  protected final String TEXT_2007 = ".Internal)((";
  protected final String TEXT_2008 = ".Internal.Wrapper)";
  protected final String TEXT_2009 = "()).featureMap()).set(newValue);";
  protected final String TEXT_2010 = NL + "\t\t\t\t((";
  protected final String TEXT_2011 = ".Internal)";
  protected final String TEXT_2012 = "()).set(newValue);";
  protected final String TEXT_2013 = NL + "\t\t\t\t((";
  protected final String TEXT_2014 = ".Setting)((";
  protected final String TEXT_2015 = ".InternalMapView";
  protected final String TEXT_2016 = ")";
  protected final String TEXT_2017 = "()).eMap()).set(newValue);";
  protected final String TEXT_2018 = NL + "\t\t\t\t((";
  protected final String TEXT_2019 = ".Setting)";
  protected final String TEXT_2020 = "()).set(newValue);";
  protected final String TEXT_2021 = NL + "\t\t\t\t";
  protected final String TEXT_2022 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_2023 = "().addAll((";
  protected final String TEXT_2024 = "<? extends ";
  protected final String TEXT_2025 = ">";
  protected final String TEXT_2026 = ")newValue);";
  protected final String TEXT_2027 = NL + "\t\t\t\tset";
  protected final String TEXT_2028 = "(((";
  protected final String TEXT_2029 = ")newValue).";
  protected final String TEXT_2030 = "());";
  protected final String TEXT_2031 = NL + "\t\t\t\tset";
  protected final String TEXT_2032 = "(";
  protected final String TEXT_2033 = "(";
  protected final String TEXT_2034 = ")";
  protected final String TEXT_2035 = "newValue);";
  protected final String TEXT_2036 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2037 = NL + "\t\t}";
  protected final String TEXT_2038 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_2039 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_2040 = NL + "\t}" + NL;
  protected final String TEXT_2041 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2042 = NL + "\t@Override";
  protected final String TEXT_2043 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2044 = ")" + NL + "\t\t{";
  protected final String TEXT_2045 = NL + "\t\t\tcase ";
  protected final String TEXT_2046 = ":";
  protected final String TEXT_2047 = NL + "\t\t\t\t((";
  protected final String TEXT_2048 = ".Internal.Wrapper)";
  protected final String TEXT_2049 = "()).featureMap().clear();";
  protected final String TEXT_2050 = NL + "\t\t\t\t";
  protected final String TEXT_2051 = "().clear();";
  protected final String TEXT_2052 = NL + "\t\t\t\tunset";
  protected final String TEXT_2053 = "();";
  protected final String TEXT_2054 = NL + "\t\t\t\tset";
  protected final String TEXT_2055 = "((";
  protected final String TEXT_2056 = ")null);";
  protected final String TEXT_2057 = NL + "\t\t\t\tset";
  protected final String TEXT_2058 = "(";
  protected final String TEXT_2059 = ");";
  protected final String TEXT_2060 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2061 = NL + "\t\t}";
  protected final String TEXT_2062 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_2063 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_2064 = NL + "\t}" + NL;
  protected final String TEXT_2065 = NL;
  protected final String TEXT_2066 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2067 = NL + "\t@Override";
  protected final String TEXT_2068 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_2069 = NL + "\t\t\tcase ";
  protected final String TEXT_2070 = ":";
  protected final String TEXT_2071 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2072 = "();";
  protected final String TEXT_2073 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_2074 = ".Internal.Wrapper)";
  protected final String TEXT_2075 = "()).featureMap().isEmpty();";
  protected final String TEXT_2076 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2077 = " != null && !";
  protected final String TEXT_2078 = ".featureMap().isEmpty();";
  protected final String TEXT_2079 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2080 = " != null && !";
  protected final String TEXT_2081 = ".isEmpty();";
  protected final String TEXT_2082 = NL + "\t\t\t\t";
  protected final String TEXT_2083 = " ";
  protected final String TEXT_2084 = " = (";
  protected final String TEXT_2085 = ")eVirtualGet(";
  protected final String TEXT_2086 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2087 = " != null && !";
  protected final String TEXT_2088 = ".isEmpty();";
  protected final String TEXT_2089 = NL + "\t\t\t\treturn !";
  protected final String TEXT_2090 = "().isEmpty();";
  protected final String TEXT_2091 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2092 = "();";
  protected final String TEXT_2093 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2094 = " != null;";
  protected final String TEXT_2095 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2096 = ") != null;";
  protected final String TEXT_2097 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2098 = "() != null;";
  protected final String TEXT_2099 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2100 = " != null;";
  protected final String TEXT_2101 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2102 = ") != null;";
  protected final String TEXT_2103 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2104 = "() != null;";
  protected final String TEXT_2105 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2106 = " & ";
  protected final String TEXT_2107 = "_EFLAG) != 0) != ";
  protected final String TEXT_2108 = ";";
  protected final String TEXT_2109 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2110 = " != ";
  protected final String TEXT_2111 = ";";
  protected final String TEXT_2112 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2113 = ", ";
  protected final String TEXT_2114 = ") != ";
  protected final String TEXT_2115 = ";";
  protected final String TEXT_2116 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2117 = "() != ";
  protected final String TEXT_2118 = ";";
  protected final String TEXT_2119 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2120 = " == null ? ";
  protected final String TEXT_2121 = " != null : !";
  protected final String TEXT_2122 = ".equals(";
  protected final String TEXT_2123 = ");";
  protected final String TEXT_2124 = NL + "\t\t\t\t";
  protected final String TEXT_2125 = " ";
  protected final String TEXT_2126 = " = (";
  protected final String TEXT_2127 = ")eVirtualGet(";
  protected final String TEXT_2128 = ", ";
  protected final String TEXT_2129 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2130 = " == null ? ";
  protected final String TEXT_2131 = " != null : !";
  protected final String TEXT_2132 = ".equals(";
  protected final String TEXT_2133 = ");";
  protected final String TEXT_2134 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2135 = " == null ? ";
  protected final String TEXT_2136 = "() != null : !";
  protected final String TEXT_2137 = ".equals(";
  protected final String TEXT_2138 = "());";
  protected final String TEXT_2139 = NL + "\t\t}";
  protected final String TEXT_2140 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2141 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2142 = NL + "\t}" + NL;
  protected final String TEXT_2143 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2144 = NL + "\t@Override";
  protected final String TEXT_2145 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2146 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2147 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2148 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_2149 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2150 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2151 = ": return ";
  protected final String TEXT_2152 = ";";
  protected final String TEXT_2153 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2154 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_2155 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2156 = NL + "\t@Override";
  protected final String TEXT_2157 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2158 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2159 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2160 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2161 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2162 = ": return ";
  protected final String TEXT_2163 = ";";
  protected final String TEXT_2164 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2165 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2166 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_2167 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2168 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2169 = ": return ";
  protected final String TEXT_2170 = ";";
  protected final String TEXT_2171 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2172 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2173 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2174 = NL + "\t@Override";
  protected final String TEXT_2175 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2176 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2177 = NL + "\t@Override";
  protected final String TEXT_2178 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2179 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2180 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2181 = NL + "\t@Override";
  protected final String TEXT_2182 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2183 = NL + "\t\t\tcase ";
  protected final String TEXT_2184 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2185 = ";";
  protected final String TEXT_2186 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2187 = NL + "\t@Override";
  protected final String TEXT_2188 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2189 = NL + "\t\t\tcase ";
  protected final String TEXT_2190 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2191 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2192 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2193 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2194 = NL + "\t@Override";
  protected final String TEXT_2195 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2196 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2197 = ": \");";
  protected final String TEXT_2198 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2199 = ": \");";
  protected final String TEXT_2200 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2201 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2202 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2203 = NL + "\t\tif (";
  protected final String TEXT_2204 = "(";
  protected final String TEXT_2205 = " & ";
  protected final String TEXT_2206 = "_ESETFLAG) != 0";
  protected final String TEXT_2207 = "ESet";
  protected final String TEXT_2208 = ") result.append((";
  protected final String TEXT_2209 = " & ";
  protected final String TEXT_2210 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2211 = NL + "\t\tif (";
  protected final String TEXT_2212 = "(";
  protected final String TEXT_2213 = " & ";
  protected final String TEXT_2214 = "_ESETFLAG) != 0";
  protected final String TEXT_2215 = "ESet";
  protected final String TEXT_2216 = ") result.append(";
  protected final String TEXT_2217 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2218 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2219 = ", ";
  protected final String TEXT_2220 = "));";
  protected final String TEXT_2221 = NL + "\t\tresult.append((";
  protected final String TEXT_2222 = " & ";
  protected final String TEXT_2223 = "_EFLAG) != 0);";
  protected final String TEXT_2224 = NL + "\t\tresult.append(";
  protected final String TEXT_2225 = ");";
  protected final String TEXT_2226 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2227 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2228 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2229 = " getKey()" + NL + "\t{";
  protected final String TEXT_2230 = NL + "\t\treturn new ";
  protected final String TEXT_2231 = "(getTypedKey());";
  protected final String TEXT_2232 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2233 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2234 = " key)" + NL + "\t{";
  protected final String TEXT_2235 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2236 = "(";
  protected final String TEXT_2237 = ")";
  protected final String TEXT_2238 = "key);";
  protected final String TEXT_2239 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2240 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2241 = ")key).";
  protected final String TEXT_2242 = "());";
  protected final String TEXT_2243 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2244 = ")key);";
  protected final String TEXT_2245 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2246 = " getValue()" + NL + "\t{";
  protected final String TEXT_2247 = NL + "\t\treturn new ";
  protected final String TEXT_2248 = "(getTypedValue());";
  protected final String TEXT_2249 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2250 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2251 = " setValue(";
  protected final String TEXT_2252 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2253 = " oldValue = getValue();";
  protected final String TEXT_2254 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2255 = "(";
  protected final String TEXT_2256 = ")";
  protected final String TEXT_2257 = "value);";
  protected final String TEXT_2258 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2259 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2260 = ")value).";
  protected final String TEXT_2261 = "());";
  protected final String TEXT_2262 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2263 = ")value);";
  protected final String TEXT_2264 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2265 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2266 = NL + "\tpublic ";
  protected final String TEXT_2267 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2268 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2269 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2270 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2271 = " EOCL_ENV = ";
  protected final String TEXT_2272 = ".newInstance();" + NL;
  protected final String TEXT_2273 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2274 = " create(";
  protected final String TEXT_2275 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2276 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2277 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2278 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2279 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2280 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2281 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2282 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2283 = NL + "\t@Override";
  protected final String TEXT_2284 = NL + "\tprotected ";
  protected final String TEXT_2285 = " ";
  protected final String TEXT_2286 = "Helper(";
  protected final String TEXT_2287 = " ";
  protected final String TEXT_2288 = ")" + NL + "\t{";
  protected final String TEXT_2289 = NL + "\t\t";
  protected final String TEXT_2290 = ".addAll(super.";
  protected final String TEXT_2291 = "());";
  protected final String TEXT_2292 = NL + "\t\tsuper.";
  protected final String TEXT_2293 = "Helper(";
  protected final String TEXT_2294 = ");";
  protected final String TEXT_2295 = NL + "\t\tif (isSet";
  protected final String TEXT_2296 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2297 = "<";
  protected final String TEXT_2298 = ">";
  protected final String TEXT_2299 = " i = ((";
  protected final String TEXT_2300 = ") ";
  protected final String TEXT_2301 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2302 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2303 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2304 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2305 = "<";
  protected final String TEXT_2306 = ">";
  protected final String TEXT_2307 = " i = ((";
  protected final String TEXT_2308 = ") ";
  protected final String TEXT_2309 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2310 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2311 = NL + "\t\t";
  protected final String TEXT_2312 = " ";
  protected final String TEXT_2313 = " = ";
  protected final String TEXT_2314 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2315 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2316 = "<";
  protected final String TEXT_2317 = ">";
  protected final String TEXT_2318 = " i = ((";
  protected final String TEXT_2319 = ") ";
  protected final String TEXT_2320 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2321 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2322 = NL + "\t\tif (isSet";
  protected final String TEXT_2323 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2324 = ".addAll(";
  protected final String TEXT_2325 = "());" + NL + "\t\t}";
  protected final String TEXT_2326 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2327 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2328 = ".addAll(";
  protected final String TEXT_2329 = "());" + NL + "\t\t}";
  protected final String TEXT_2330 = NL + "\t\t";
  protected final String TEXT_2331 = " ";
  protected final String TEXT_2332 = " = ";
  protected final String TEXT_2333 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2334 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2335 = ".addAll(";
  protected final String TEXT_2336 = ");" + NL + "\t\t}";
  protected final String TEXT_2337 = NL + "\t\tif (isSet";
  protected final String TEXT_2338 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2339 = ".add(";
  protected final String TEXT_2340 = "basicGet";
  protected final String TEXT_2341 = "());" + NL + "\t\t}";
  protected final String TEXT_2342 = NL + "\t\t";
  protected final String TEXT_2343 = " ";
  protected final String TEXT_2344 = " = ";
  protected final String TEXT_2345 = "basicGet";
  protected final String TEXT_2346 = "();" + NL + "\t\tif (";
  protected final String TEXT_2347 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2348 = ".add(";
  protected final String TEXT_2349 = ");" + NL + "\t\t}";
  protected final String TEXT_2350 = NL + "\t\treturn ";
  protected final String TEXT_2351 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2352 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2353 = NL + "\t@Override";
  protected final String TEXT_2354 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2355 = "()" + NL + "\t{";
  protected final String TEXT_2356 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2357 = "()";
  protected final String TEXT_2358 = NL + "\t\treturn isSet";
  protected final String TEXT_2359 = "()";
  protected final String TEXT_2360 = ";";
  protected final String TEXT_2361 = NL + "\t\treturn !";
  protected final String TEXT_2362 = "().isEmpty()";
  protected final String TEXT_2363 = ";";
  protected final String TEXT_2364 = NL + "\t\treturn ";
  protected final String TEXT_2365 = "basicGet";
  protected final String TEXT_2366 = "() != null";
  protected final String TEXT_2367 = ";";
  protected final String TEXT_2368 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2369 = ")";
  protected final String TEXT_2370 = ";";
  protected final String TEXT_2371 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2372 = "()";
  protected final String TEXT_2373 = ";";
  protected final String TEXT_2374 = NL + "\t\t\t|| !";
  protected final String TEXT_2375 = "().isEmpty()";
  protected final String TEXT_2376 = ";";
  protected final String TEXT_2377 = NL + "\t\t\t|| ";
  protected final String TEXT_2378 = "basicGet";
  protected final String TEXT_2379 = "() != null";
  protected final String TEXT_2380 = ";";
  protected final String TEXT_2381 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2382 = ")";
  protected final String TEXT_2383 = ";";
  protected final String TEXT_2384 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2385 = "();";
  protected final String TEXT_2386 = NL + "\t\treturn false;";
  protected final String TEXT_2387 = NL + "\t}" + NL;
  protected final String TEXT_2388 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2389 = NL + "\t@Override";
  protected final String TEXT_2390 = NL + "\tpublic ";
  protected final String TEXT_2391 = " ";
  protected final String TEXT_2392 = "()" + NL + "\t{";
  protected final String TEXT_2393 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2394 = " ";
  protected final String TEXT_2395 = " = (";
  protected final String TEXT_2396 = ")((";
  protected final String TEXT_2397 = ")";
  protected final String TEXT_2398 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2399 = ";";
  protected final String TEXT_2400 = NL + "\t\treturn ";
  protected final String TEXT_2401 = "();";
  protected final String TEXT_2402 = NL + "\t\treturn new ";
  protected final String TEXT_2403 = ".UnmodifiableEList";
  protected final String TEXT_2404 = "(this, ";
  protected final String TEXT_2405 = "null";
  protected final String TEXT_2406 = ", 0, ";
  protected final String TEXT_2407 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2408 = NL + "\t\treturn null;";
  protected final String TEXT_2409 = NL + "\t\treturn ";
  protected final String TEXT_2410 = "();";
  protected final String TEXT_2411 = NL + "\t}" + NL;
  protected final String TEXT_2412 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2413 = NL + "\t@Override";
  protected final String TEXT_2414 = NL + "\tpublic ";
  protected final String TEXT_2415 = " basicGet";
  protected final String TEXT_2416 = "()" + NL + "\t{";
  protected final String TEXT_2417 = NL + "\t\treturn null;";
  protected final String TEXT_2418 = NL + "\t\treturn ";
  protected final String TEXT_2419 = "basicGet";
  protected final String TEXT_2420 = "();";
  protected final String TEXT_2421 = NL + "\t}" + NL;
  protected final String TEXT_2422 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2423 = NL + "\t@Override";
  protected final String TEXT_2424 = NL + "\tpublic ";
  protected final String TEXT_2425 = " basicSet";
  protected final String TEXT_2426 = "(";
  protected final String TEXT_2427 = " new";
  protected final String TEXT_2428 = ", ";
  protected final String TEXT_2429 = " msgs)" + NL + "\t{";
  protected final String TEXT_2430 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2431 = NL + "\t\tif (new";
  protected final String TEXT_2432 = " != null && !(new";
  protected final String TEXT_2433 = " instanceof ";
  protected final String TEXT_2434 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2435 = "));" + NL + "\t\t}";
  protected final String TEXT_2436 = NL + "\t\treturn basicSet";
  protected final String TEXT_2437 = "(";
  protected final String TEXT_2438 = "(";
  protected final String TEXT_2439 = ") ";
  protected final String TEXT_2440 = "new";
  protected final String TEXT_2441 = ", msgs);";
  protected final String TEXT_2442 = NL + "\t\tset";
  protected final String TEXT_2443 = "(";
  protected final String TEXT_2444 = "(";
  protected final String TEXT_2445 = ") ";
  protected final String TEXT_2446 = "new";
  protected final String TEXT_2447 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2448 = NL + "\t}" + NL;
  protected final String TEXT_2449 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2450 = NL + "\t@Override";
  protected final String TEXT_2451 = NL + "\tpublic void set";
  protected final String TEXT_2452 = "(";
  protected final String TEXT_2453 = " new";
  protected final String TEXT_2454 = ")" + NL + "\t{";
  protected final String TEXT_2455 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2456 = NL + "\t\tif (new";
  protected final String TEXT_2457 = " != null && !(new";
  protected final String TEXT_2458 = " instanceof ";
  protected final String TEXT_2459 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2460 = "));" + NL + "\t\t}";
  protected final String TEXT_2461 = NL + "\t\tset";
  protected final String TEXT_2462 = "(";
  protected final String TEXT_2463 = "(";
  protected final String TEXT_2464 = ") ";
  protected final String TEXT_2465 = "new";
  protected final String TEXT_2466 = ");";
  protected final String TEXT_2467 = NL + "\t}" + NL;
  protected final String TEXT_2468 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2469 = "() <em>";
  protected final String TEXT_2470 = "</em>}' ";
  protected final String TEXT_2471 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2472 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2473 = "_ESUBSETS = ";
  protected final String TEXT_2474 = ";" + NL;
  protected final String TEXT_2475 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2476 = "() <em>";
  protected final String TEXT_2477 = "</em>}' ";
  protected final String TEXT_2478 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2479 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2480 = "_ESUPERSETS = ";
  protected final String TEXT_2481 = ";" + NL;
  protected final String TEXT_2482 = NL + "\t/**";
  protected final String TEXT_2483 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2484 = "}, with the specified ";
  protected final String TEXT_2485 = ", and appends it to the '<em><b>";
  protected final String TEXT_2486 = "</b></em>' ";
  protected final String TEXT_2487 = ".";
  protected final String TEXT_2488 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2489 = "}, with the specified ";
  protected final String TEXT_2490 = ", and sets the '<em><b>";
  protected final String TEXT_2491 = "</b></em>' ";
  protected final String TEXT_2492 = ".";
  protected final String TEXT_2493 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2494 = "} and appends it to the '<em><b>";
  protected final String TEXT_2495 = "</b></em>' ";
  protected final String TEXT_2496 = ".";
  protected final String TEXT_2497 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2498 = "} and sets the '<em><b>";
  protected final String TEXT_2499 = "</b></em>' ";
  protected final String TEXT_2500 = ".";
  protected final String TEXT_2501 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2502 = NL + "\t * @param ";
  protected final String TEXT_2503 = " The ";
  protected final String TEXT_2504 = " for the new {@link ";
  protected final String TEXT_2505 = "}, or <code>null</code>.";
  protected final String TEXT_2506 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2507 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2508 = "}." + NL + "\t * @see #";
  protected final String TEXT_2509 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2510 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2511 = NL + "\t";
  protected final String TEXT_2512 = " create";
  protected final String TEXT_2513 = "(";
  protected final String TEXT_2514 = ", ";
  protected final String TEXT_2515 = " eClass);" + NL;
  protected final String TEXT_2516 = NL + "\t@Override";
  protected final String TEXT_2517 = NL + "\tpublic ";
  protected final String TEXT_2518 = " create";
  protected final String TEXT_2519 = "(";
  protected final String TEXT_2520 = ", ";
  protected final String TEXT_2521 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2522 = " new";
  protected final String TEXT_2523 = " = (";
  protected final String TEXT_2524 = ") create(eClass);";
  protected final String TEXT_2525 = NL + "\t\t";
  protected final String TEXT_2526 = "().add(new";
  protected final String TEXT_2527 = ");";
  protected final String TEXT_2528 = NL + "\t\tset";
  protected final String TEXT_2529 = "(new";
  protected final String TEXT_2530 = ");";
  protected final String TEXT_2531 = NL + "\t\tint ";
  protected final String TEXT_2532 = "ListSize = 0;";
  protected final String TEXT_2533 = NL + "\t\tint ";
  protected final String TEXT_2534 = "Size = ";
  protected final String TEXT_2535 = " == null ? 0 : ";
  protected final String TEXT_2536 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2537 = "Size > ";
  protected final String TEXT_2538 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2539 = "ListSize = ";
  protected final String TEXT_2540 = "Size;";
  protected final String TEXT_2541 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2542 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2543 = ".create";
  protected final String TEXT_2544 = "(";
  protected final String TEXT_2545 = ", ";
  protected final String TEXT_2546 = "i < ";
  protected final String TEXT_2547 = "Size ? (";
  protected final String TEXT_2548 = ") ";
  protected final String TEXT_2549 = ".get(i) : null";
  protected final String TEXT_2550 = ");" + NL + "\t\t}";
  protected final String TEXT_2551 = NL + "\t\tnew";
  protected final String TEXT_2552 = ".create";
  protected final String TEXT_2553 = "(";
  protected final String TEXT_2554 = ", ";
  protected final String TEXT_2555 = ");";
  protected final String TEXT_2556 = NL + "\t\tif (";
  protected final String TEXT_2557 = " != null)";
  protected final String TEXT_2558 = NL + "\t\t\tnew";
  protected final String TEXT_2559 = ".";
  protected final String TEXT_2560 = "().addAll(";
  protected final String TEXT_2561 = ");";
  protected final String TEXT_2562 = NL + "\t\t\tnew";
  protected final String TEXT_2563 = ".set";
  protected final String TEXT_2564 = "(";
  protected final String TEXT_2565 = ");";
  protected final String TEXT_2566 = NL + "\t\treturn new";
  protected final String TEXT_2567 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2568 = NL + "\t/**";
  protected final String TEXT_2569 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2570 = "}, with the specified ";
  protected final String TEXT_2571 = ", and appends it to the '<em><b>";
  protected final String TEXT_2572 = "</b></em>' ";
  protected final String TEXT_2573 = ".";
  protected final String TEXT_2574 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2575 = "},with the specified ";
  protected final String TEXT_2576 = ", and sets the '<em><b>";
  protected final String TEXT_2577 = "</b></em>' ";
  protected final String TEXT_2578 = ".";
  protected final String TEXT_2579 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2580 = "} and appends it to the '<em><b>";
  protected final String TEXT_2581 = "</b></em>' ";
  protected final String TEXT_2582 = ".";
  protected final String TEXT_2583 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2584 = "} and sets the '<em><b>";
  protected final String TEXT_2585 = "</b></em>' ";
  protected final String TEXT_2586 = ".";
  protected final String TEXT_2587 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2588 = NL + "\t * @param ";
  protected final String TEXT_2589 = " The ";
  protected final String TEXT_2590 = " for the new {@link ";
  protected final String TEXT_2591 = "}, or <code>null</code>.";
  protected final String TEXT_2592 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2593 = "}." + NL + "\t * @see #";
  protected final String TEXT_2594 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2595 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2596 = NL + "\t";
  protected final String TEXT_2597 = " create";
  protected final String TEXT_2598 = "(";
  protected final String TEXT_2599 = ");" + NL;
  protected final String TEXT_2600 = NL + "\t@Override";
  protected final String TEXT_2601 = NL + "\tpublic ";
  protected final String TEXT_2602 = " create";
  protected final String TEXT_2603 = "(";
  protected final String TEXT_2604 = ")" + NL + "\t{";
  protected final String TEXT_2605 = NL + "\t\treturn create";
  protected final String TEXT_2606 = "(";
  protected final String TEXT_2607 = ", ";
  protected final String TEXT_2608 = ");";
  protected final String TEXT_2609 = NL + "\t\t";
  protected final String TEXT_2610 = " new";
  protected final String TEXT_2611 = " = (";
  protected final String TEXT_2612 = ") create(";
  protected final String TEXT_2613 = ");";
  protected final String TEXT_2614 = NL + "\t\t";
  protected final String TEXT_2615 = "().add(new";
  protected final String TEXT_2616 = ");";
  protected final String TEXT_2617 = NL + "\t\tset";
  protected final String TEXT_2618 = "(new";
  protected final String TEXT_2619 = ");";
  protected final String TEXT_2620 = NL + "\t\tint ";
  protected final String TEXT_2621 = "ListSize = 0;";
  protected final String TEXT_2622 = NL + "\t\tint ";
  protected final String TEXT_2623 = "Size = ";
  protected final String TEXT_2624 = " == null ? 0 : ";
  protected final String TEXT_2625 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2626 = "Size > ";
  protected final String TEXT_2627 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2628 = "ListSize = ";
  protected final String TEXT_2629 = "Size;";
  protected final String TEXT_2630 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2631 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2632 = ".create";
  protected final String TEXT_2633 = "(";
  protected final String TEXT_2634 = ", ";
  protected final String TEXT_2635 = "i < ";
  protected final String TEXT_2636 = "Size ? (";
  protected final String TEXT_2637 = ") ";
  protected final String TEXT_2638 = ".get(i) : null";
  protected final String TEXT_2639 = ");" + NL + "\t\t}";
  protected final String TEXT_2640 = NL + "\t\tnew";
  protected final String TEXT_2641 = ".create";
  protected final String TEXT_2642 = "(";
  protected final String TEXT_2643 = ", ";
  protected final String TEXT_2644 = ");";
  protected final String TEXT_2645 = NL + "\t\tif (";
  protected final String TEXT_2646 = " != null)";
  protected final String TEXT_2647 = NL + "\t\t\tnew";
  protected final String TEXT_2648 = ".";
  protected final String TEXT_2649 = "().addAll(";
  protected final String TEXT_2650 = ");";
  protected final String TEXT_2651 = NL + "\t\t\tnew";
  protected final String TEXT_2652 = ".set";
  protected final String TEXT_2653 = "(";
  protected final String TEXT_2654 = ");";
  protected final String TEXT_2655 = NL + "\t\treturn new";
  protected final String TEXT_2656 = ";";
  protected final String TEXT_2657 = NL + "\t}" + NL;
  protected final String TEXT_2658 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2659 = "} with the specified ";
  protected final String TEXT_2660 = " from the '<em><b>";
  protected final String TEXT_2661 = "</b></em>' ";
  protected final String TEXT_2662 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2663 = NL + "\t * @param ";
  protected final String TEXT_2664 = " The ";
  protected final String TEXT_2665 = " of the {@link ";
  protected final String TEXT_2666 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2667 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2668 = "} with the specified ";
  protected final String TEXT_2669 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2670 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2671 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2672 = NL + "\t";
  protected final String TEXT_2673 = " get";
  protected final String TEXT_2674 = "(";
  protected final String TEXT_2675 = ");" + NL;
  protected final String TEXT_2676 = NL + "\t@Override";
  protected final String TEXT_2677 = NL + "\tpublic ";
  protected final String TEXT_2678 = " get";
  protected final String TEXT_2679 = "(";
  protected final String TEXT_2680 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2681 = "(";
  protected final String TEXT_2682 = ", false";
  protected final String TEXT_2683 = ", null";
  protected final String TEXT_2684 = ", false";
  protected final String TEXT_2685 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2686 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2687 = "} with the specified ";
  protected final String TEXT_2688 = " from the '<em><b>";
  protected final String TEXT_2689 = "</b></em>' ";
  protected final String TEXT_2690 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2691 = NL + "\t * @param ";
  protected final String TEXT_2692 = " The ";
  protected final String TEXT_2693 = " of the {@link ";
  protected final String TEXT_2694 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2695 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2696 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2697 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2698 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2699 = "} on demand if not found.";
  protected final String TEXT_2700 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2701 = "} with the specified ";
  protected final String TEXT_2702 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2703 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2704 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2705 = NL + "\t";
  protected final String TEXT_2706 = " get";
  protected final String TEXT_2707 = "(";
  protected final String TEXT_2708 = ", boolean ignoreCase";
  protected final String TEXT_2709 = ", ";
  protected final String TEXT_2710 = " eClass";
  protected final String TEXT_2711 = ", boolean createOnDemand";
  protected final String TEXT_2712 = ");" + NL;
  protected final String TEXT_2713 = NL + "\t@Override";
  protected final String TEXT_2714 = NL + "\tpublic ";
  protected final String TEXT_2715 = " get";
  protected final String TEXT_2716 = "(";
  protected final String TEXT_2717 = ", boolean ignoreCase";
  protected final String TEXT_2718 = ", ";
  protected final String TEXT_2719 = " eClass";
  protected final String TEXT_2720 = ", boolean createOnDemand";
  protected final String TEXT_2721 = ")" + NL + "\t{";
  protected final String TEXT_2722 = NL + "\t\t";
  protected final String TEXT_2723 = "Loop: for (";
  protected final String TEXT_2724 = " ";
  protected final String TEXT_2725 = " : ";
  protected final String TEXT_2726 = "())" + NL + "\t\t{";
  protected final String TEXT_2727 = NL + "\t\t";
  protected final String TEXT_2728 = "Loop: for (";
  protected final String TEXT_2729 = " i = ";
  protected final String TEXT_2730 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2731 = " ";
  protected final String TEXT_2732 = " = (";
  protected final String TEXT_2733 = ") i.next();";
  protected final String TEXT_2734 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2735 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2736 = "Loop;";
  protected final String TEXT_2737 = NL + "\t\t\t";
  protected final String TEXT_2738 = " ";
  protected final String TEXT_2739 = "List = ";
  protected final String TEXT_2740 = ".";
  protected final String TEXT_2741 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2742 = "ListSize = ";
  protected final String TEXT_2743 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2744 = " || (";
  protected final String TEXT_2745 = " != null && ";
  protected final String TEXT_2746 = ".size() != ";
  protected final String TEXT_2747 = "ListSize";
  protected final String TEXT_2748 = ")";
  protected final String TEXT_2749 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2750 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2751 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2752 = " ";
  protected final String TEXT_2753 = " = ";
  protected final String TEXT_2754 = "(";
  protected final String TEXT_2755 = ") ";
  protected final String TEXT_2756 = "List.get(j);";
  protected final String TEXT_2757 = NL + "\t\t\t\tif (";
  protected final String TEXT_2758 = " != null && !(ignoreCase ? (";
  protected final String TEXT_2759 = "(";
  protected final String TEXT_2760 = ")";
  protected final String TEXT_2761 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2762 = ".";
  protected final String TEXT_2763 = "()) : ";
  protected final String TEXT_2764 = ".get(j).equals(";
  protected final String TEXT_2765 = ".";
  protected final String TEXT_2766 = "())))";
  protected final String TEXT_2767 = NL + "\t\t\t\tif (";
  protected final String TEXT_2768 = " != null && !";
  protected final String TEXT_2769 = ".get(j).equals(";
  protected final String TEXT_2770 = ".";
  protected final String TEXT_2771 = "()))";
  protected final String TEXT_2772 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2773 = "Loop;";
  protected final String TEXT_2774 = NL + "\t\t\t}";
  protected final String TEXT_2775 = NL + "\t\t\t";
  protected final String TEXT_2776 = " ";
  protected final String TEXT_2777 = " = ";
  protected final String TEXT_2778 = ".";
  protected final String TEXT_2779 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2780 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2781 = "Loop;";
  protected final String TEXT_2782 = NL + "\t\t\tif (";
  protected final String TEXT_2783 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2784 = ".equalsIgnoreCase(";
  protected final String TEXT_2785 = ".";
  protected final String TEXT_2786 = "()) : ";
  protected final String TEXT_2787 = ".equals(";
  protected final String TEXT_2788 = ".";
  protected final String TEXT_2789 = "())))";
  protected final String TEXT_2790 = NL + "\t\t\tif (";
  protected final String TEXT_2791 = " != null && !";
  protected final String TEXT_2792 = ".equals(";
  protected final String TEXT_2793 = ".";
  protected final String TEXT_2794 = "()))";
  protected final String TEXT_2795 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2796 = "Loop;";
  protected final String TEXT_2797 = NL + "\t\t\tif (";
  protected final String TEXT_2798 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2799 = ".equalsIgnoreCase(";
  protected final String TEXT_2800 = ".";
  protected final String TEXT_2801 = "()) : ";
  protected final String TEXT_2802 = ".equals(";
  protected final String TEXT_2803 = ".";
  protected final String TEXT_2804 = "())))";
  protected final String TEXT_2805 = NL + "\t\t\tif (";
  protected final String TEXT_2806 = " != null && !";
  protected final String TEXT_2807 = ".equals(";
  protected final String TEXT_2808 = ".";
  protected final String TEXT_2809 = "()))";
  protected final String TEXT_2810 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2811 = "Loop;";
  protected final String TEXT_2812 = NL + "\t\t\treturn ";
  protected final String TEXT_2813 = ";" + NL + "\t\t}";
  protected final String TEXT_2814 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2815 = " && eClass != null";
  protected final String TEXT_2816 = " ? create";
  protected final String TEXT_2817 = "(";
  protected final String TEXT_2818 = ", eClass";
  protected final String TEXT_2819 = ") : null;";
  protected final String TEXT_2820 = NL + "\t\treturn null;";
  protected final String TEXT_2821 = NL + "\t}" + NL;
  protected final String TEXT_2822 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2823 = "()" + NL + "\t{";
  protected final String TEXT_2824 = NL + "  \t\treturn false;";
  protected final String TEXT_2825 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2826 = ");";
  protected final String TEXT_2827 = NL + "\t\treturn !((";
  protected final String TEXT_2828 = ".Internal.Wrapper)";
  protected final String TEXT_2829 = "()).featureMap().isEmpty();";
  protected final String TEXT_2830 = NL + "\t\treturn ";
  protected final String TEXT_2831 = " != null && !";
  protected final String TEXT_2832 = ".featureMap().isEmpty();";
  protected final String TEXT_2833 = NL + "\t\treturn ";
  protected final String TEXT_2834 = " != null && !";
  protected final String TEXT_2835 = ".isEmpty();";
  protected final String TEXT_2836 = NL + "\t\t";
  protected final String TEXT_2837 = " ";
  protected final String TEXT_2838 = " = (";
  protected final String TEXT_2839 = ")eVirtualGet(";
  protected final String TEXT_2840 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2841 = " != null && !";
  protected final String TEXT_2842 = ".isEmpty();";
  protected final String TEXT_2843 = NL + "\t\treturn !";
  protected final String TEXT_2844 = "().isEmpty();";
  protected final String TEXT_2845 = NL + "\t\treturn ";
  protected final String TEXT_2846 = " != null;";
  protected final String TEXT_2847 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2848 = ") != null;";
  protected final String TEXT_2849 = NL + "\t\treturn basicGet";
  protected final String TEXT_2850 = "() != null;";
  protected final String TEXT_2851 = NL + "\t\treturn ";
  protected final String TEXT_2852 = " != null;";
  protected final String TEXT_2853 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2854 = ") != null;";
  protected final String TEXT_2855 = NL + "\t\treturn ";
  protected final String TEXT_2856 = "() != null;";
  protected final String TEXT_2857 = NL + "\t\treturn ((";
  protected final String TEXT_2858 = " & ";
  protected final String TEXT_2859 = "_EFLAG) != 0) != ";
  protected final String TEXT_2860 = ";";
  protected final String TEXT_2861 = NL + "\t\treturn ";
  protected final String TEXT_2862 = " != ";
  protected final String TEXT_2863 = ";";
  protected final String TEXT_2864 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2865 = ", ";
  protected final String TEXT_2866 = ") != ";
  protected final String TEXT_2867 = ";";
  protected final String TEXT_2868 = NL + "\t\treturn ";
  protected final String TEXT_2869 = "() != ";
  protected final String TEXT_2870 = ";";
  protected final String TEXT_2871 = NL + "\t\treturn ";
  protected final String TEXT_2872 = " == null ? ";
  protected final String TEXT_2873 = " != null : !";
  protected final String TEXT_2874 = ".equals(";
  protected final String TEXT_2875 = ");";
  protected final String TEXT_2876 = NL + "\t\t";
  protected final String TEXT_2877 = " ";
  protected final String TEXT_2878 = " = (";
  protected final String TEXT_2879 = ")eVirtualGet(";
  protected final String TEXT_2880 = ", ";
  protected final String TEXT_2881 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2882 = " == null ? ";
  protected final String TEXT_2883 = " != null : !";
  protected final String TEXT_2884 = ".equals(";
  protected final String TEXT_2885 = ");";
  protected final String TEXT_2886 = NL + "\t\treturn ";
  protected final String TEXT_2887 = " == null ? ";
  protected final String TEXT_2888 = "() != null : !";
  protected final String TEXT_2889 = ".equals(";
  protected final String TEXT_2890 = "());";
  protected final String TEXT_2891 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2892 = ");";
  protected final String TEXT_2893 = NL + "\t\t";
  protected final String TEXT_2894 = " ";
  protected final String TEXT_2895 = " = (";
  protected final String TEXT_2896 = ")eVirtualGet(";
  protected final String TEXT_2897 = ");";
  protected final String TEXT_2898 = NL + "\t\treturn ";
  protected final String TEXT_2899 = " != null && ((";
  protected final String TEXT_2900 = ".Unsettable";
  protected final String TEXT_2901 = ")";
  protected final String TEXT_2902 = ").isSet();";
  protected final String TEXT_2903 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2904 = ");";
  protected final String TEXT_2905 = NL + "\t\treturn (";
  protected final String TEXT_2906 = " & ";
  protected final String TEXT_2907 = "_ESETFLAG) != 0;";
  protected final String TEXT_2908 = NL + "\t\treturn ";
  protected final String TEXT_2909 = "ESet;";
  protected final String TEXT_2910 = NL + "\t\treturn !((";
  protected final String TEXT_2911 = ".Internal)((";
  protected final String TEXT_2912 = ".Internal.Wrapper)get";
  protected final String TEXT_2913 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2914 = ");";
  protected final String TEXT_2915 = NL + "\t\treturn !((";
  protected final String TEXT_2916 = ".Internal)get";
  protected final String TEXT_2917 = "()).isEmpty(";
  protected final String TEXT_2918 = ");";
  protected final String TEXT_2919 = NL + "\t\treturn ";
  protected final String TEXT_2920 = ".";
  protected final String TEXT_2921 = "(this);";
  protected final String TEXT_2922 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2923 = "' ";
  protected final String TEXT_2924 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2925 = NL + "\t}" + NL;
  protected final String TEXT_2926 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2927 = NL + "\t@Override";
  protected final String TEXT_2928 = NL + "\tpublic ";
  protected final String TEXT_2929 = " ";
  protected final String TEXT_2930 = "(";
  protected final String TEXT_2931 = ")";
  protected final String TEXT_2932 = NL + "\t{";
  protected final String TEXT_2933 = NL + "\t\t";
  protected final String TEXT_2934 = "(";
  protected final String TEXT_2935 = ");";
  protected final String TEXT_2936 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2937 = NL + "\t\treturn ";
  protected final String TEXT_2938 = "(";
  protected final String TEXT_2939 = ");";
  protected final String TEXT_2940 = NL + "\t}" + NL;
  protected final String TEXT_2941 = NL + "} //";
  protected final String TEXT_2942 = NL;

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
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !genModel.isReflectiveDelegation() && genFeature.isUncheckedCast() || genFeature.isListType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature())) {
    stringBuffer.append(TEXT_286);
    }
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_289);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_290);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_291);
    }
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_294);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_296);
    }
    stringBuffer.append(TEXT_297);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_302);
    }
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_304);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_308);
    } else {
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_311);
    }
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_313);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_316);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_322);
    }
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_334);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_339);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_343);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_346);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_347);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_348);
    }
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_350);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_353);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_355);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_356);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_357);
    }
    stringBuffer.append(TEXT_358);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_361);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_367);
    }
    stringBuffer.append(TEXT_368);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_372);
    } else if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_375);
    } else {
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_377);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_387);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_391);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_392);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_394);
    } else {
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_396);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_397);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_399);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_401);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_403);
    } else {
    stringBuffer.append(TEXT_404);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_406);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_407);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_408);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_410);
    }
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_412);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_414);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_416);
    }
    stringBuffer.append(TEXT_417);
    } else {
    stringBuffer.append(TEXT_418);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_419);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_421);
    }
    stringBuffer.append(TEXT_422);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_424);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_426);
    }
    stringBuffer.append(TEXT_427);
    }
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_429);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_430);
    }
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_433);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_434);
    }
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_436);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_437);
    }
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_439);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_441);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_443);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_444);
    }
    stringBuffer.append(TEXT_445);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_447);
    }
    stringBuffer.append(TEXT_448);
    }
    stringBuffer.append(TEXT_449);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_451);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_454);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_455);
    }
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_465);
    }
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_467);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_469);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_473);
    }
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_483);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_484);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_487);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_488);
    }
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_500);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_501);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_503);
    }
    stringBuffer.append(TEXT_504);
    }
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_509);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_510);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_511);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_512);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_513);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_514);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_516);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_517);
    } else {
    stringBuffer.append(TEXT_518);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_519);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_520);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_521);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_522);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_523);
    }
    }
    }
    }
    stringBuffer.append(TEXT_524);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_526);
    } else {
    stringBuffer.append(TEXT_527);
    }
    stringBuffer.append(TEXT_528);
    }
    } else {
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_531);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_532);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_533);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_534);
    }
    }
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_537);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_540);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_543);
    } else {
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_545);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_548);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_550);
    } else {
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_554);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_555);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_556);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_557);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_558);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_559);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_560);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_561);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_563);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_564);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_565);
    } else {
    stringBuffer.append(TEXT_566);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_567);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_568);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_569);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_570);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_571);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_572);
    }
    }
    }
    }
    stringBuffer.append(TEXT_573);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_575);
    } else {
    stringBuffer.append(TEXT_576);
    }
    stringBuffer.append(TEXT_577);
    } else {
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_580);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_581);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_582);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_583);
    }
    }
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_589);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_593);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_595);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_596);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_597);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_598);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_599);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_600);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_602);
    }
    stringBuffer.append(TEXT_603);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_604);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_606);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_607);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_609);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_610);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_611);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_612);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_613);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_614);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_615);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_616);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_617);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_618);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_619);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_620);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_621);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_622);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_624);
    }
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_627);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_629);
    }
    stringBuffer.append(TEXT_630);
    }
    stringBuffer.append(TEXT_631);
    }
    stringBuffer.append(TEXT_632);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_636);
    } else {
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_642);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_644);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_650);
    } else {
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_654);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_655);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_660);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_664);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_665);
    } else {
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_667);
    }
    stringBuffer.append(TEXT_668);
    } else {
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_670);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_673);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_678);
    }
    stringBuffer.append(TEXT_679);
    }
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_681);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_682);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_683);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_684);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_685);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_686);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_688);
    }
    stringBuffer.append(TEXT_689);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_690);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_692);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_693);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_695);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_696);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_697);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_698);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_699);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_701);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_703);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_704);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_705);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_706);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_707);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_708);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_710);
    }
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_712);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_713);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_715);
    }
    stringBuffer.append(TEXT_716);
    }
    stringBuffer.append(TEXT_717);
    }
    stringBuffer.append(TEXT_718);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_721);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_724);
    } else {
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_726);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_729);
    }
    } else {
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_732);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_733);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_738);
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_741);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_744);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_746);
    }
    }
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_748);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_749);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_750);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_753);
    } else {
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_757);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_762);
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_764);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_766);
    }
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_768);
    }
    stringBuffer.append(TEXT_769);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_782);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_783);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_787);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_793);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_798);
    }
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_803);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_811);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_814);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_815);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_819);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_820);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_821);
    }
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_825);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_826);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_829);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_833);
    }
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_836);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_839);
    }
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_841);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_848);
    }
    stringBuffer.append(TEXT_849);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_851);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_855);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_860);
    }
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_866);
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_870);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_876);
    } else {
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_881);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_886);
    } else {
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_890);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_894);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_896);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_900);
    }
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_903);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_906);
    }
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_908);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_912);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_915);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_916);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_918);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_919);
    } else {
    stringBuffer.append(TEXT_920);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_921);
    }
    stringBuffer.append(TEXT_922);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_925);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_926);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_927);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_929);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_931);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_933);
    }
    }
    }
    if (!genFeature.isBasicSet()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_934);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_935);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_936);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_937);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_938);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_939);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_940);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_942);
    }
    stringBuffer.append(TEXT_943);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_944);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_946);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_947);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_949);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_950);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_951);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_952);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_953);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_955);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_957);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_958);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_959);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_960);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_961);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_962);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_964);
    }
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_966);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_967);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_969);
    }
    stringBuffer.append(TEXT_970);
    }
    stringBuffer.append(TEXT_971);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_974);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_976);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_978);
    }
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_980);
    }
    stringBuffer.append(TEXT_981);
    } else {
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_983);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_985);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_987);
    }
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_989);
    }
    stringBuffer.append(TEXT_990);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_991);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_994);
    } else {
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_997);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_998);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_999);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1000);
    }
    }
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1004);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1007);
    } else {
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1012);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1014);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1020);
    } else {
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1024);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1029);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1031);
    } else {
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1033);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1034);
    } else {
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1036);
    }
    stringBuffer.append(TEXT_1037);
    }
    } else {
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1040);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1041);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(TEXT_1047);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1049);
    }
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1051);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1054);
    }
    stringBuffer.append(TEXT_1055);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1056);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1057);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1059);
    } else {
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1061);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1063);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1068);
    }
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1073);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1078);
    }
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1081);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1085);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1090);
    }
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1092);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1095);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1099);
    }
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1102);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1105);
    }
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1107);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1112);
    }
    stringBuffer.append(TEXT_1113);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1118);
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1121);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1125);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1127);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1131);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1134);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1136);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1139);
    } else {
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1141);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1145);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1147);
    } else {
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1149);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1150);
    } else {
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1152);
    }
    stringBuffer.append(TEXT_1153);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1159);
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1162);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1165);
    } else {
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1167);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1171);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1176);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1177);
    } else {
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1179);
    }
    stringBuffer.append(TEXT_1180);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1185);
    } else {
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1189);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1192);
    } else {
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1195);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1196);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1204);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1206);
    }
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1208);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1211);
    }
    stringBuffer.append(TEXT_1212);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1213);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1214);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1216);
    } else {
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1218);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1220);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1225);
    }
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1230);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1232);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1235);
    } else {
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1237);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1242);
    } else {
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1246);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1249);
    } else {
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1252);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1253);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1260);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1267);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1268);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1273);
    } else {
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1278);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1282);
    } else {
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1286);
    }
    }
    stringBuffer.append(TEXT_1287);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1291);
    }
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1295);
    } else {
    stringBuffer.append(TEXT_1296);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1299);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1300);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1301);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1302);
    }
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1305);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1306);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1310);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1313);
    } else {
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1316);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1318);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1326);
    index++;}
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1330);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1331);
    }
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1335);
    }
    stringBuffer.append(TEXT_1336);
    } else {
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1339);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1340);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1341);
    }
    } else {
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1343);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1347);
    } else {
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1351);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1353);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1354);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1359);
    } else {
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1364);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1368);
    } else {
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1372);
    }
    }
    stringBuffer.append(TEXT_1373);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1377);
    }
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1380);
    } else {
    stringBuffer.append(TEXT_1381);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1385);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1386);
    }
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1390);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1392);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_1393);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1394);
    } else {
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1399);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1402);
    } else {
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1405);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1407);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1415);
    index++;}
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1419);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1420);
    }
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1424);
    }
    stringBuffer.append(TEXT_1425);
    } else {
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1428);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1429);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1430);
    }
    } else {
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1432);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1436);
    } else {
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1440);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1442);
    }
    stringBuffer.append(TEXT_1443);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1448);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1452);
    }
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1456);
    } else {
    stringBuffer.append(TEXT_1457);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1461);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1462);
    }
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1468);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1469);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1470);
    }
    stringBuffer.append(TEXT_1471);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1476);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1480);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1481);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1483);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1485);
    }
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1489);
    } else {
    stringBuffer.append(TEXT_1490);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1494);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1496);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1497);
    }
    stringBuffer.append(TEXT_1498);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1499);
    }
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1503);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1505);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1506);
    }
    stringBuffer.append(TEXT_1507);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1512);
    } else {
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1519);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1522);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1529);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1530);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1533);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1534);
    }
    }
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1539);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1541);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1542);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1544);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1546);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1552);
    } else {
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1557);
    }
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1559);
    index++;}
    stringBuffer.append(TEXT_1560);
    } else {
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1567);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1575);
    } else {
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1580);
    }
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1582);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1590);
    } else {
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1595);
    }
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1597);
    index++;}
    }
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1599);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1600);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1601);
    }
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1604);
    }
    stringBuffer.append(TEXT_1605);
    } else {
    stringBuffer.append(TEXT_1606);
    }
    stringBuffer.append(TEXT_1607);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1609);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1610);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1612);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1615);
    } else {
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1618);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1621);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1628);
    } else {
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1630);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1632);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1634);
    } else {
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1636);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1638);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1640);
    } else {
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1642);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1646);
    } else {
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1649);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1653);
    } else {
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1656);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1661);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1671);
    } else {
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1676);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1678);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1683);
    }
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1686);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1688);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1690);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1693);
    } else {
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1695);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1700);
    } else {
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1704);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1707);
    } else {
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1710);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1711);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation && !UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage()) && UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1721);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1729);
    } else {
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
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_1737);
    }
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1739);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1740);
    if (UML2GenModelUtil.isRedefinition(genOperation)) {
    stringBuffer.append(TEXT_1741);
    for (GenOperation redefinedGenOperation : UML2GenModelUtil.getRedefinedGenOperations(genOperation)) {
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(redefinedGenOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(redefinedGenOperation.getName());
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(redefinedGenOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(redefinedGenOperation.getFormattedName());
    stringBuffer.append(TEXT_1746);
    }
    stringBuffer.append(TEXT_1747);
    }
    stringBuffer.append(TEXT_1748);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1749);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1755);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1757);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1758);
    }}
    stringBuffer.append(TEXT_1759);
    } else {
    stringBuffer.append(TEXT_1760);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_1761);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1763);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1766);
    } else {
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1771);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (UML2GenModelUtil.isOperationsClasses(opClass.getGenPackage())) {
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1777);
    } else {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1785);
    } else {
    stringBuffer.append(TEXT_1786);
    }
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1796);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1799);
    }
    } else { GenPackage opPackage = genOperation.getGenPackage();
    if (UML2GenModelUtil.isOperationsClasses(opPackage)) { GenClass opClass = genOperation.getGenClass();
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1802);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1804);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1806);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_1807);
    }
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1810);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1811);
    }
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1814);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1815);
    }
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1818);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1820);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1822);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1824);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1825);
    }
    stringBuffer.append(TEXT_1826);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1828);
    }
    stringBuffer.append(TEXT_1829);
    }
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1832);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1834);
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
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_1845);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1847);
    }
    stringBuffer.append(TEXT_1848);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1852);
    }
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_1857);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_1859);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1862);
    } else {
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_1864);
    }
    } else {
    stringBuffer.append(TEXT_1865);
    }
    }
    stringBuffer.append(TEXT_1866);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1867);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_1868);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1869);
    }
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1872);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1874);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1876);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1881);
    } else {
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1883);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1884);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1887);
    } else {
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1889);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1894);
    } else if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1896);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1897);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1899);
    }
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1901);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1905);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1909);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1910);
    }
    stringBuffer.append(TEXT_1911);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1913);
    }
    }
    stringBuffer.append(TEXT_1914);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1915);
    } else {
    stringBuffer.append(TEXT_1916);
    }
    stringBuffer.append(TEXT_1917);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_1918);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1919);
    }
    stringBuffer.append(TEXT_1920);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1921);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1924);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1926);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1927);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1930);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1931);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1932);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1933);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1934);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1935);
    } else {
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1938);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1940);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1941);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1942);
    } else {
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1944);
    }
    }
    stringBuffer.append(TEXT_1945);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1946);
    } else {
    stringBuffer.append(TEXT_1947);
    }
    stringBuffer.append(TEXT_1948);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_1949);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1950);
    }
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1953);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1954);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1956);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1958);
    }
    stringBuffer.append(TEXT_1959);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1960);
    } else {
    stringBuffer.append(TEXT_1961);
    }
    stringBuffer.append(TEXT_1962);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_1963);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1964);
    }
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1966);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1968);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1969);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1970);
    } else {
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1972);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1973);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1976);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1980);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1981);
    } else {
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1983);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1984);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1985);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1986);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1988);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_1989);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1992);
    } else {
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1994);
    }
    }
    stringBuffer.append(TEXT_1995);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_1996);
    } else {
    stringBuffer.append(TEXT_1997);
    }
    stringBuffer.append(TEXT_1998);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_1999);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_2000);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2001);
    }
    stringBuffer.append(TEXT_2002);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2003);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_2004);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2005);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2006);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2008);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2009);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2011);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2012);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2017);
    } else {
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2020);
    }
    } else {
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2024);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2025);
    }
    stringBuffer.append(TEXT_2026);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2027);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2030);
    } else {
    stringBuffer.append(TEXT_2031);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2032);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2033);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2034);
    }
    stringBuffer.append(TEXT_2035);
    }
    stringBuffer.append(TEXT_2036);
    }
    stringBuffer.append(TEXT_2037);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2038);
    } else {
    stringBuffer.append(TEXT_2039);
    }
    stringBuffer.append(TEXT_2040);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_2041);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2042);
    }
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2044);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_2045);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2046);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2048);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2049);
    } else {
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2051);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2052);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2053);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2055);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2056);
    } else {
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2059);
    }
    stringBuffer.append(TEXT_2060);
    }
    stringBuffer.append(TEXT_2061);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2062);
    } else {
    stringBuffer.append(TEXT_2063);
    }
    stringBuffer.append(TEXT_2064);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_2065);
    stringBuffer.append(TEXT_2066);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2067);
    }
    stringBuffer.append(TEXT_2068);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2070);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2071);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2072);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2074);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2075);
    } else {
    stringBuffer.append(TEXT_2076);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2078);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2080);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2081);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2083);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2085);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2088);
    } else {
    stringBuffer.append(TEXT_2089);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2090);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2091);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2092);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2094);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2096);
    } else {
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2098);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2099);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2100);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2102);
    } else {
    stringBuffer.append(TEXT_2103);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2104);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2105);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2106);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2107);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2108);
    } else {
    stringBuffer.append(TEXT_2109);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2110);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2111);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2112);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2115);
    } else {
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2117);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2118);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2122);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2123);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2124);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2125);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2126);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2127);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2131);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2133);
    } else {
    stringBuffer.append(TEXT_2134);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2138);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2139);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2140);
    } else {
    stringBuffer.append(TEXT_2141);
    }
    stringBuffer.append(TEXT_2142);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2143);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2144);
    }
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2146);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2147);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2148);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2149);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2150);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2152);
    }
    stringBuffer.append(TEXT_2153);
    }
    stringBuffer.append(TEXT_2154);
    }
    stringBuffer.append(TEXT_2155);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2156);
    }
    stringBuffer.append(TEXT_2157);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2158);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2159);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2160);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2162);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2163);
    }
    stringBuffer.append(TEXT_2164);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2165);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2166);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2167);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2168);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2170);
    }
    stringBuffer.append(TEXT_2171);
    }
    stringBuffer.append(TEXT_2172);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2173);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2174);
    }
    stringBuffer.append(TEXT_2175);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2176);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2177);
    }
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2179);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2180);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2181);
    }
    stringBuffer.append(TEXT_2182);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2185);
    }
    stringBuffer.append(TEXT_2186);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2187);
    }
    stringBuffer.append(TEXT_2188);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2189);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2191);
    }
    stringBuffer.append(TEXT_2192);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2193);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2194);
    }
    stringBuffer.append(TEXT_2195);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2196);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2197);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2198);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2199);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2200);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2202);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2203);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2204);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2205);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2206);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2207);
    }
    stringBuffer.append(TEXT_2208);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2209);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2210);
    stringBuffer.append(genModel.getNonNLS());
    } else {
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
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2217);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2218);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2219);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2220);
    } else {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2221);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2222);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2223);
    } else {
    stringBuffer.append(TEXT_2224);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2225);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2226);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2227);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2228);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2229);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2230);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2231);
    } else {
    stringBuffer.append(TEXT_2232);
    }
    stringBuffer.append(TEXT_2233);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2234);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2235);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2236);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2237);
    }
    stringBuffer.append(TEXT_2238);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2239);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2241);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2242);
    } else {
    stringBuffer.append(TEXT_2243);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2244);
    }
    stringBuffer.append(TEXT_2245);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2246);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2247);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2248);
    } else {
    stringBuffer.append(TEXT_2249);
    }
    stringBuffer.append(TEXT_2250);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2251);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2252);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2253);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2254);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2255);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2256);
    }
    stringBuffer.append(TEXT_2257);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2258);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2259);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2260);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2261);
    } else {
    stringBuffer.append(TEXT_2262);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2263);
    }
    stringBuffer.append(TEXT_2264);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2265);
    }
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2267);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2269);
    }
    if (isImplementation) {
    if (!UML2GenModelUtil.isOperationsClasses(genClass.getGenPackage()) && UML2GenModelUtil.hasOCLOperationBodies(genClass) && !UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass())) {
    stringBuffer.append(TEXT_2270);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2271);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2272);
    }
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2273);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2275);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2276);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2277);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2278);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2279);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2280);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2281);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2282);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2283);
    }
    stringBuffer.append(TEXT_2284);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2286);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2288);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2290);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2291);
    } else {
    stringBuffer.append(TEXT_2292);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2293);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2294);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2296);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2297);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2298);
    }
    stringBuffer.append(TEXT_2299);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2300);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2301);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2302);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2303);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
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
    stringBuffer.append(TEXT_2311);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2313);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2315);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2316);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2317);
    }
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2319);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2320);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2321);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2322);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2323);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2324);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2325);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2326);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2327);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2328);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2329);
    } else {
    stringBuffer.append(TEXT_2330);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2331);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2332);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2333);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2334);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2335);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2336);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2337);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2338);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2339);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2340);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2341);
    } else {
    stringBuffer.append(TEXT_2342);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2343);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2344);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2346);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2347);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2348);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2349);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2350);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2351);
    }
    }
    }
    stringBuffer.append(TEXT_2352);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2353);
    }
    }
    stringBuffer.append(TEXT_2354);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2355);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2356);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2357);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2358);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2359);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2360);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2361);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2362);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2363);
    }
    } else {
    stringBuffer.append(TEXT_2364);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2366);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2367);
    }
    }
    } else {
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2369);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2370);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2372);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2373);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2374);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2375);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2376);
    }
    } else {
    stringBuffer.append(TEXT_2377);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2378);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2379);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2380);
    }
    }
    } else {
    stringBuffer.append(TEXT_2381);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2382);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2383);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2384);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2385);
    } else {
    stringBuffer.append(TEXT_2386);
    }
    }
    stringBuffer.append(TEXT_2387);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2388);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2389);
    }
    }
    stringBuffer.append(TEXT_2390);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2391);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2392);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType(genClass).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_2393);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2394);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2399);
    } else {
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2401);
    }
    } else {
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2403);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2404);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2405);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2407);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2408);
    } else {
    stringBuffer.append(TEXT_2409);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2410);
    }
    }
    stringBuffer.append(TEXT_2411);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2412);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2413);
    }
    }
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2415);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2416);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2417);
    } else {
    stringBuffer.append(TEXT_2418);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2419);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2420);
    }
    stringBuffer.append(TEXT_2421);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2422);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2423);
    }
    }
    stringBuffer.append(TEXT_2424);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2425);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2426);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2428);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2429);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2430);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2431);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2432);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2433);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2434);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2435);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2436);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2437);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2438);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2439);
    }
    stringBuffer.append(TEXT_2440);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2441);
    } else {
    stringBuffer.append(TEXT_2442);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2443);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2444);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2445);
    }
    stringBuffer.append(TEXT_2446);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2447);
    }
    }
    stringBuffer.append(TEXT_2448);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2449);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2450);
    }
    }
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2453);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2454);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2455);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2456);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2457);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2458);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2460);
    }
    stringBuffer.append(TEXT_2461);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2462);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2463);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2464);
    }
    stringBuffer.append(TEXT_2465);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2466);
    }
    stringBuffer.append(TEXT_2467);
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2468);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2469);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2470);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2471);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2472);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2474);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2475);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2478);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2480);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2481);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2482);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2484);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2485);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2487);
    } else {
    stringBuffer.append(TEXT_2488);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2489);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2490);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2491);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2492);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2493);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2494);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2495);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2496);
    } else {
    stringBuffer.append(TEXT_2497);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2499);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2500);
    }
    }
    stringBuffer.append(TEXT_2501);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2502);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2503);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2504);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2505);
    }
    stringBuffer.append(TEXT_2506);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2508);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2509);
    } else {
    stringBuffer.append(TEXT_2510);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2512);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2513);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2514);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2515);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2516);
    }
    stringBuffer.append(TEXT_2517);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2518);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2519);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2520);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2521);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2522);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2523);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2524);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2525);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2526);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2527);
    } else {
    stringBuffer.append(TEXT_2528);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2530);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2532);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2533);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2534);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2535);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2537);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2539);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2540);
    index++;}
    stringBuffer.append(TEXT_2541);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2542);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2543);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2544);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2545);
    }
    stringBuffer.append(TEXT_2546);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2547);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2548);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2549);
    }
    stringBuffer.append(TEXT_2550);
    } else {
    stringBuffer.append(TEXT_2551);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2552);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2553);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2554);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2555);
    }
    } else {
    stringBuffer.append(TEXT_2556);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2557);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2558);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2559);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2560);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2561);
    } else {
    stringBuffer.append(TEXT_2562);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2563);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2564);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2565);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2567);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2568);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2569);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2570);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2571);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2572);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2573);
    } else {
    stringBuffer.append(TEXT_2574);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2577);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2578);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2579);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2581);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2582);
    } else {
    stringBuffer.append(TEXT_2583);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2585);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2586);
    }
    }
    stringBuffer.append(TEXT_2587);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2589);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2590);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2591);
    }
    stringBuffer.append(TEXT_2592);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2593);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2594);
    } else {
    stringBuffer.append(TEXT_2595);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2597);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2598);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2599);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2600);
    }
    stringBuffer.append(TEXT_2601);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2602);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2603);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2604);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2605);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2606);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_2607);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2608);
    } else {
    stringBuffer.append(TEXT_2609);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2610);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2612);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2613);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2614);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2615);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2616);
    } else {
    stringBuffer.append(TEXT_2617);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2618);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2619);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2621);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2623);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2624);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2625);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2626);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2627);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2628);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2629);
    index++;}
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2631);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2632);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2633);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2634);
    }
    stringBuffer.append(TEXT_2635);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2636);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2637);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2638);
    }
    stringBuffer.append(TEXT_2639);
    } else {
    stringBuffer.append(TEXT_2640);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2641);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2642);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2643);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2644);
    }
    } else {
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2646);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2647);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2649);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2650);
    } else {
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2652);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2653);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2654);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2655);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2656);
    }
    stringBuffer.append(TEXT_2657);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2659);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2660);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2661);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2662);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2664);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2665);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2666);
    }
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2668);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2670);
    } else {
    stringBuffer.append(TEXT_2671);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2672);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2674);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2675);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2676);
    }
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2679);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2680);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2682);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2683);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2684);
    }
    stringBuffer.append(TEXT_2685);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2687);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2690);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2691);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2692);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2693);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2694);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2695);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2697);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2698);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2699);
    }
    stringBuffer.append(TEXT_2700);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2702);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2703);
    } else {
    stringBuffer.append(TEXT_2704);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2706);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2707);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2708);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2709);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2710);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2711);
    }
    stringBuffer.append(TEXT_2712);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2713);
    }
    stringBuffer.append(TEXT_2714);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2715);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2716);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2717);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2718);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2719);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2720);
    }
    stringBuffer.append(TEXT_2721);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2722);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2723);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_2724);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2725);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2726);
    } else {
    stringBuffer.append(TEXT_2727);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2728);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2729);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2730);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2731);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2732);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2733);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2734);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2735);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2736);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2737);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2739);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2740);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2741);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2742);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2743);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_2744);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_2745);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_2746);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2747);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2748);
    }
    }
    stringBuffer.append(TEXT_2749);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2750);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2751);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2752);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2753);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2754);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2755);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2756);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2757);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2758);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2759);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2760);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2762);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2763);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2764);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2765);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2766);
    } else {
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2768);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2769);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2770);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2771);
    }
    stringBuffer.append(TEXT_2772);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2773);
    index++;}
    stringBuffer.append(TEXT_2774);
    } else {
    stringBuffer.append(TEXT_2775);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2776);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2777);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2780);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2781);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2782);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2784);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2786);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2787);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2788);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2789);
    } else {
    stringBuffer.append(TEXT_2790);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2791);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2792);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2793);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2794);
    }
    stringBuffer.append(TEXT_2795);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2796);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2797);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2798);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2799);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2800);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2801);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2802);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2803);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2804);
    } else {
    stringBuffer.append(TEXT_2805);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2806);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2807);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2808);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2809);
    }
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2811);
    index++;}
    }
    stringBuffer.append(TEXT_2812);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2813);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2814);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2815);
    }
    stringBuffer.append(TEXT_2816);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2817);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2818);
    }
    stringBuffer.append(TEXT_2819);
    } else {
    stringBuffer.append(TEXT_2820);
    }
    stringBuffer.append(TEXT_2821);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2822);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2823);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2824);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2825);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2826);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2827);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2828);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2829);
    } else {
    stringBuffer.append(TEXT_2830);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2831);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2832);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2833);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2834);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2835);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2836);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2837);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2838);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2839);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2840);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2841);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2842);
    } else {
    stringBuffer.append(TEXT_2843);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2844);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2845);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2846);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2847);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2848);
    } else {
    stringBuffer.append(TEXT_2849);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2850);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2851);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2852);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2853);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2854);
    } else {
    stringBuffer.append(TEXT_2855);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2856);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_2857);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2858);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2859);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2860);
    } else {
    stringBuffer.append(TEXT_2861);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2862);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2863);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2864);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2865);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2866);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2867);
    } else {
    stringBuffer.append(TEXT_2868);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2869);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2870);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2871);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2872);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2873);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2874);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2875);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2876);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2877);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2878);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2879);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2880);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2881);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2882);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2883);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2884);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2885);
    } else {
    stringBuffer.append(TEXT_2886);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2887);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2888);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2889);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2890);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2891);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2892);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2893);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2894);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2895);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2896);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2897);
    }
    stringBuffer.append(TEXT_2898);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2899);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2900);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2901);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2902);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2903);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2904);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2905);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2906);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2907);
    } else {
    stringBuffer.append(TEXT_2908);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2909);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2910);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2911);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2912);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2913);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2914);
    } else {
    stringBuffer.append(TEXT_2915);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2916);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2917);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2918);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.isOperationsClasses(genOperation.getGenPackage())) { GenClass opClass = genOperation.getGenClass();
    stringBuffer.append(TEXT_2919);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(opClass));
    stringBuffer.append(TEXT_2920);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2921);
    } else {
    stringBuffer.append(TEXT_2922);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2923);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2924);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2925);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_2926);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //genOperation.annotations.insert.javajetinc
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_2927);
    }
    }
    stringBuffer.append(TEXT_2928);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_2929);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2930);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_2931);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_2932);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2933);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2934);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2935);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_2936);
    } else {
    stringBuffer.append(TEXT_2937);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_2938);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_2939);
    }
    }
    stringBuffer.append(TEXT_2940);
    }
    }
    stringBuffer.append(TEXT_2941);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_2942);
    return stringBuffer.toString();
  }
}
