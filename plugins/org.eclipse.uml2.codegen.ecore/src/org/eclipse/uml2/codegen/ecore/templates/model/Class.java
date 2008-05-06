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
  protected final String TEXT_95 = NL + "\t/**" + NL + "\t * The offset of the flags representing the value of the '{@link #";
  protected final String TEXT_96 = "() <em>";
  protected final String TEXT_97 = "</em>}' ";
  protected final String TEXT_98 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_99 = "_EFLAG_OFFSET = ";
  protected final String TEXT_100 = ";" + NL + "" + NL + "\t/**" + NL + "\t * The flags representing the default value of the '{@link #";
  protected final String TEXT_101 = "() <em>";
  protected final String TEXT_102 = "</em>}' ";
  protected final String TEXT_103 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_104 = "_EFLAG_DEFAULT = ";
  protected final String TEXT_105 = ".ordinal()";
  protected final String TEXT_106 = ".VALUES.indexOf(";
  protected final String TEXT_107 = ")";
  protected final String TEXT_108 = " << ";
  protected final String TEXT_109 = "_EFLAG_OFFSET;" + NL + "" + NL + "\t/**" + NL + "\t * The array of enumeration values for '{@link ";
  protected final String TEXT_110 = " ";
  protected final String TEXT_111 = "}'" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprivate static final ";
  protected final String TEXT_112 = "[] ";
  protected final String TEXT_113 = "_EFLAG_VALUES = ";
  protected final String TEXT_114 = ".values()";
  protected final String TEXT_115 = "(";
  protected final String TEXT_116 = "[])";
  protected final String TEXT_117 = ".VALUES.toArray(new ";
  protected final String TEXT_118 = "[";
  protected final String TEXT_119 = ".VALUES.size()])";
  protected final String TEXT_120 = ";" + NL;
  protected final String TEXT_121 = NL + "\t/**" + NL + "\t * The flag";
  protected final String TEXT_122 = " representing the value of the '{@link #";
  protected final String TEXT_123 = "() <em>";
  protected final String TEXT_124 = "</em>}' ";
  protected final String TEXT_125 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_126 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_127 = "_EFLAG = ";
  protected final String TEXT_128 = " << ";
  protected final String TEXT_129 = "_EFLAG_OFFSET";
  protected final String TEXT_130 = ";" + NL;
  protected final String TEXT_131 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_132 = "() <em>";
  protected final String TEXT_133 = "</em>}' ";
  protected final String TEXT_134 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_135 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_136 = " ";
  protected final String TEXT_137 = " = ";
  protected final String TEXT_138 = ";" + NL;
  protected final String TEXT_139 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_140 = " = 0;" + NL;
  protected final String TEXT_141 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_142 = " ";
  protected final String TEXT_143 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_144 = "_ESETFLAG = 1 << ";
  protected final String TEXT_145 = ";" + NL;
  protected final String TEXT_146 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_147 = " ";
  protected final String TEXT_148 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_149 = "ESet;" + NL;
  protected final String TEXT_150 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_151 = " = ";
  protected final String TEXT_152 = ".getFeatureID(";
  protected final String TEXT_153 = ") - ";
  protected final String TEXT_154 = ";" + NL;
  protected final String TEXT_155 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_156 = " = ";
  protected final String TEXT_157 = ".getFeatureID(";
  protected final String TEXT_158 = ") - ";
  protected final String TEXT_159 = ";" + NL;
  protected final String TEXT_160 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_161 = "public";
  protected final String TEXT_162 = "protected";
  protected final String TEXT_163 = " ";
  protected final String TEXT_164 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_165 = NL + "\t\t";
  protected final String TEXT_166 = " |= ";
  protected final String TEXT_167 = "_EFLAG";
  protected final String TEXT_168 = "_DEFAULT";
  protected final String TEXT_169 = ";";
  protected final String TEXT_170 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_171 = NL + "\t@Override";
  protected final String TEXT_172 = NL + "\tprotected ";
  protected final String TEXT_173 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_174 = ";" + NL + "\t}" + NL;
  protected final String TEXT_175 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_176 = NL + "\t@Override";
  protected final String TEXT_177 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_178 = ";" + NL + "\t}" + NL;
  protected final String TEXT_179 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_180 = NL + "\t";
  protected final String TEXT_181 = "[] ";
  protected final String TEXT_182 = "();" + NL;
  protected final String TEXT_183 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_184 = NL + "\tpublic ";
  protected final String TEXT_185 = "[] ";
  protected final String TEXT_186 = "()" + NL + "\t{";
  protected final String TEXT_187 = NL + "\t\t";
  protected final String TEXT_188 = " list = (";
  protected final String TEXT_189 = ")";
  protected final String TEXT_190 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_191 = "(";
  protected final String TEXT_192 = "[])";
  protected final String TEXT_193 = "_EEMPTY_ARRAY;";
  protected final String TEXT_194 = NL + "\t\tif (";
  protected final String TEXT_195 = " == null || ";
  protected final String TEXT_196 = ".isEmpty()) return ";
  protected final String TEXT_197 = "(";
  protected final String TEXT_198 = "[])";
  protected final String TEXT_199 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_200 = " list = (";
  protected final String TEXT_201 = ")";
  protected final String TEXT_202 = ";";
  protected final String TEXT_203 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_204 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_205 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_206 = NL + "\t";
  protected final String TEXT_207 = " get";
  protected final String TEXT_208 = "(int index);" + NL;
  protected final String TEXT_209 = NL + "\tpublic ";
  protected final String TEXT_210 = " get";
  protected final String TEXT_211 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_212 = "(";
  protected final String TEXT_213 = ")";
  protected final String TEXT_214 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_215 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_216 = NL + "\tint get";
  protected final String TEXT_217 = "Length();" + NL;
  protected final String TEXT_218 = NL + "\tpublic int get";
  protected final String TEXT_219 = "Length()" + NL + "\t{";
  protected final String TEXT_220 = NL + "\t\treturn ";
  protected final String TEXT_221 = "().size();";
  protected final String TEXT_222 = NL + "\t\treturn ";
  protected final String TEXT_223 = " == null ? 0 : ";
  protected final String TEXT_224 = ".size();";
  protected final String TEXT_225 = NL + "\t}" + NL;
  protected final String TEXT_226 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_227 = NL + "\tvoid set";
  protected final String TEXT_228 = "(";
  protected final String TEXT_229 = "[] new";
  protected final String TEXT_230 = ");" + NL;
  protected final String TEXT_231 = NL + "\tpublic void set";
  protected final String TEXT_232 = "(";
  protected final String TEXT_233 = "[] new";
  protected final String TEXT_234 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_235 = ")";
  protected final String TEXT_236 = "()).setData(new";
  protected final String TEXT_237 = ".length, new";
  protected final String TEXT_238 = ");" + NL + "\t}" + NL;
  protected final String TEXT_239 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_240 = NL + "\tvoid set";
  protected final String TEXT_241 = "(int index, ";
  protected final String TEXT_242 = " element);" + NL;
  protected final String TEXT_243 = NL + "\tpublic void set";
  protected final String TEXT_244 = "(int index, ";
  protected final String TEXT_245 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_246 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_247 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_248 = "</b></em>' ";
  protected final String TEXT_249 = ".";
  protected final String TEXT_250 = NL + "\t * The key is of type ";
  protected final String TEXT_251 = "list of {@link ";
  protected final String TEXT_252 = "}";
  protected final String TEXT_253 = "{@link ";
  protected final String TEXT_254 = "}";
  protected final String TEXT_255 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_256 = "list of {@link ";
  protected final String TEXT_257 = "}";
  protected final String TEXT_258 = "{@link ";
  protected final String TEXT_259 = "}";
  protected final String TEXT_260 = ",";
  protected final String TEXT_261 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_262 = "}";
  protected final String TEXT_263 = ".";
  protected final String TEXT_264 = NL + "\t * The default value is <code>";
  protected final String TEXT_265 = "</code>.";
  protected final String TEXT_266 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_267 = "}.";
  protected final String TEXT_268 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_269 = "#";
  protected final String TEXT_270 = " <em>";
  protected final String TEXT_271 = "</em>}'.";
  protected final String TEXT_272 = NL + "\t * <p>" + NL + "\t * This feature subsets the following features:" + NL + "\t * <ul>";
  protected final String TEXT_273 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_274 = "#";
  protected final String TEXT_275 = "() <em>";
  protected final String TEXT_276 = "</em>}'</li>";
  protected final String TEXT_277 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_278 = NL + "\t * <p>" + NL + "\t * This feature redefines the following features:" + NL + "\t * <ul>";
  protected final String TEXT_279 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_280 = "#";
  protected final String TEXT_281 = "() <em>";
  protected final String TEXT_282 = "</em>}'</li>";
  protected final String TEXT_283 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_284 = NL + "\t * This feature is a derived union.";
  protected final String TEXT_285 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_286 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_287 = "</em>' ";
  protected final String TEXT_288 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_289 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_290 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_291 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_292 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_293 = "</em>' ";
  protected final String TEXT_294 = ".";
  protected final String TEXT_295 = NL + "\t * @see ";
  protected final String TEXT_296 = NL + "\t * @see #isSet";
  protected final String TEXT_297 = "()";
  protected final String TEXT_298 = NL + "\t * @see #unset";
  protected final String TEXT_299 = "()";
  protected final String TEXT_300 = NL + "\t * @see #set";
  protected final String TEXT_301 = "(";
  protected final String TEXT_302 = ")";
  protected final String TEXT_303 = NL + "\t * @see ";
  protected final String TEXT_304 = "#get";
  protected final String TEXT_305 = "()";
  protected final String TEXT_306 = NL + "\t * @see ";
  protected final String TEXT_307 = "#";
  protected final String TEXT_308 = NL + "\t * @model ";
  protected final String TEXT_309 = NL + "\t *        ";
  protected final String TEXT_310 = NL + "\t * @model";
  protected final String TEXT_311 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_312 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_313 = NL + "\t@Override";
  protected final String TEXT_314 = NL + "\t";
  protected final String TEXT_315 = " ";
  protected final String TEXT_316 = "();" + NL;
  protected final String TEXT_317 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_318 = NL + "\tpublic ";
  protected final String TEXT_319 = " ";
  protected final String TEXT_320 = "_";
  protected final String TEXT_321 = "()" + NL + "\t{";
  protected final String TEXT_322 = NL + "\t\treturn ";
  protected final String TEXT_323 = "(";
  protected final String TEXT_324 = "(";
  protected final String TEXT_325 = ")eGet(";
  protected final String TEXT_326 = ", true)";
  protected final String TEXT_327 = ").";
  protected final String TEXT_328 = "()";
  protected final String TEXT_329 = ";";
  protected final String TEXT_330 = NL + "\t\t";
  protected final String TEXT_331 = " ";
  protected final String TEXT_332 = " = (";
  protected final String TEXT_333 = ")eVirtualGet(";
  protected final String TEXT_334 = ");";
  protected final String TEXT_335 = NL + "\t\tif (";
  protected final String TEXT_336 = " == null)" + NL + "\t\t{";
  protected final String TEXT_337 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_338 = ", ";
  protected final String TEXT_339 = " = new ";
  protected final String TEXT_340 = ");";
  protected final String TEXT_341 = NL + "\t\t\t";
  protected final String TEXT_342 = " = new ";
  protected final String TEXT_343 = ";";
  protected final String TEXT_344 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_345 = ";";
  protected final String TEXT_346 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_347 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_348 = ")eContainer();";
  protected final String TEXT_349 = NL + "\t\t";
  protected final String TEXT_350 = " ";
  protected final String TEXT_351 = " = (";
  protected final String TEXT_352 = ")eVirtualGet(";
  protected final String TEXT_353 = ", ";
  protected final String TEXT_354 = ");";
  protected final String TEXT_355 = NL + "\t\tif (";
  protected final String TEXT_356 = " != null && ";
  protected final String TEXT_357 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_358 = " old";
  protected final String TEXT_359 = " = (";
  protected final String TEXT_360 = ")";
  protected final String TEXT_361 = ";" + NL + "\t\t\t";
  protected final String TEXT_362 = " = ";
  protected final String TEXT_363 = "eResolveProxy(old";
  protected final String TEXT_364 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_365 = " != old";
  protected final String TEXT_366 = ")" + NL + "\t\t\t{";
  protected final String TEXT_367 = NL + "\t\t\t\t";
  protected final String TEXT_368 = " new";
  protected final String TEXT_369 = " = (";
  protected final String TEXT_370 = ")";
  protected final String TEXT_371 = ";";
  protected final String TEXT_372 = NL + "\t\t\t\t";
  protected final String TEXT_373 = " msgs = old";
  protected final String TEXT_374 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_375 = ", null, null);";
  protected final String TEXT_376 = NL + "\t\t\t\t";
  protected final String TEXT_377 = " msgs =  old";
  protected final String TEXT_378 = ".eInverseRemove(this, ";
  protected final String TEXT_379 = ", ";
  protected final String TEXT_380 = ".class, null);";
  protected final String TEXT_381 = NL + "\t\t\t\tif (new";
  protected final String TEXT_382 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_383 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_384 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_385 = ", null, msgs);";
  protected final String TEXT_386 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_387 = ".eInverseAdd(this, ";
  protected final String TEXT_388 = ", ";
  protected final String TEXT_389 = ".class, msgs);";
  protected final String TEXT_390 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_391 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_392 = ", ";
  protected final String TEXT_393 = ");";
  protected final String TEXT_394 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_395 = "(this, ";
  protected final String TEXT_396 = ".RESOLVE, ";
  protected final String TEXT_397 = ", old";
  protected final String TEXT_398 = ", ";
  protected final String TEXT_399 = "));";
  protected final String TEXT_400 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_401 = NL + "\t\treturn (";
  protected final String TEXT_402 = ")eVirtualGet(";
  protected final String TEXT_403 = ", ";
  protected final String TEXT_404 = ");";
  protected final String TEXT_405 = NL + "\t\treturn (";
  protected final String TEXT_406 = " & ";
  protected final String TEXT_407 = "_EFLAG) != 0;";
  protected final String TEXT_408 = NL + "\t\treturn ";
  protected final String TEXT_409 = "_EFLAG_VALUES[(";
  protected final String TEXT_410 = " & ";
  protected final String TEXT_411 = "_EFLAG) >>> ";
  protected final String TEXT_412 = "_EFLAG_OFFSET];";
  protected final String TEXT_413 = NL + "\t\treturn ";
  protected final String TEXT_414 = ";";
  protected final String TEXT_415 = NL + "\t\t";
  protected final String TEXT_416 = " ";
  protected final String TEXT_417 = " = basicGet";
  protected final String TEXT_418 = "();" + NL + "\t\treturn ";
  protected final String TEXT_419 = " != null && ";
  protected final String TEXT_420 = ".eIsProxy() ? ";
  protected final String TEXT_421 = "eResolveProxy((";
  protected final String TEXT_422 = ")";
  protected final String TEXT_423 = ") : ";
  protected final String TEXT_424 = ";";
  protected final String TEXT_425 = NL + "\t\treturn new ";
  protected final String TEXT_426 = "((";
  protected final String TEXT_427 = ".Internal)((";
  protected final String TEXT_428 = ".Internal.Wrapper)get";
  protected final String TEXT_429 = "()).featureMap().";
  protected final String TEXT_430 = "list(";
  protected final String TEXT_431 = "));";
  protected final String TEXT_432 = NL + "\t\treturn (";
  protected final String TEXT_433 = ")get";
  protected final String TEXT_434 = "().";
  protected final String TEXT_435 = "list(";
  protected final String TEXT_436 = ");";
  protected final String TEXT_437 = NL + "\t\treturn ((";
  protected final String TEXT_438 = ".Internal.Wrapper)get";
  protected final String TEXT_439 = "()).featureMap().list(";
  protected final String TEXT_440 = ");";
  protected final String TEXT_441 = NL + "\t\treturn get";
  protected final String TEXT_442 = "().list(";
  protected final String TEXT_443 = ");";
  protected final String TEXT_444 = NL + "\t\treturn ";
  protected final String TEXT_445 = "(";
  protected final String TEXT_446 = "(";
  protected final String TEXT_447 = ")";
  protected final String TEXT_448 = "((";
  protected final String TEXT_449 = ".Internal.Wrapper)get";
  protected final String TEXT_450 = "()).featureMap().get(";
  protected final String TEXT_451 = ", true)";
  protected final String TEXT_452 = ").";
  protected final String TEXT_453 = "()";
  protected final String TEXT_454 = ";";
  protected final String TEXT_455 = NL + "\t\treturn ";
  protected final String TEXT_456 = "(";
  protected final String TEXT_457 = "(";
  protected final String TEXT_458 = ")";
  protected final String TEXT_459 = "get";
  protected final String TEXT_460 = "().get(";
  protected final String TEXT_461 = ", true)";
  protected final String TEXT_462 = ").";
  protected final String TEXT_463 = "()";
  protected final String TEXT_464 = ";";
  protected final String TEXT_465 = NL + "\t\t";
  protected final String TEXT_466 = NL + "\t\t";
  protected final String TEXT_467 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_468 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_469 = NL + "\t\t\t";
  protected final String TEXT_470 = " result = (";
  protected final String TEXT_471 = ") cache.get(";
  protected final String TEXT_472 = "eResource(), ";
  protected final String TEXT_473 = "this, ";
  protected final String TEXT_474 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_475 = "eResource(), ";
  protected final String TEXT_476 = "this, ";
  protected final String TEXT_477 = ", result = ";
  protected final String TEXT_478 = "new ";
  protected final String TEXT_479 = "(";
  protected final String TEXT_480 = ".";
  protected final String TEXT_481 = "(this)";
  protected final String TEXT_482 = ")";
  protected final String TEXT_483 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_484 = ".";
  protected final String TEXT_485 = "()";
  protected final String TEXT_486 = ";" + NL + "\t\t}";
  protected final String TEXT_487 = NL + "\t\treturn ";
  protected final String TEXT_488 = ".";
  protected final String TEXT_489 = "(this);";
  protected final String TEXT_490 = NL + "\t\t";
  protected final String TEXT_491 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_492 = " eResource = eResource();";
  protected final String TEXT_493 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_494 = NL + "\t\t\t";
  protected final String TEXT_495 = " ";
  protected final String TEXT_496 = " = (";
  protected final String TEXT_497 = ") cache.get(eResource, this, ";
  protected final String TEXT_498 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_499 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_500 = ", ";
  protected final String TEXT_501 = " = new ";
  protected final String TEXT_502 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_503 = ";" + NL + "\t\t}";
  protected final String TEXT_504 = NL + "\t\treturn new ";
  protected final String TEXT_505 = ";";
  protected final String TEXT_506 = NL + "\t\t";
  protected final String TEXT_507 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_508 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_509 = " method = getClass().getMethod(\"";
  protected final String TEXT_510 = "\", null);";
  protected final String TEXT_511 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_512 = NL + "\t\t\t\t";
  protected final String TEXT_513 = " ";
  protected final String TEXT_514 = " = (";
  protected final String TEXT_515 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_516 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_517 = " union = ";
  protected final String TEXT_518 = "Helper(new ";
  protected final String TEXT_519 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_520 = " = new ";
  protected final String TEXT_521 = "(this, ";
  protected final String TEXT_522 = "null";
  protected final String TEXT_523 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_524 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_525 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_526 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_527 = NL + "\t\t\t";
  protected final String TEXT_528 = " ";
  protected final String TEXT_529 = " = (";
  protected final String TEXT_530 = ") cache.get(eResource(), this, ";
  protected final String TEXT_531 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_532 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_533 = " union = ";
  protected final String TEXT_534 = "Helper(new ";
  protected final String TEXT_535 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_536 = ", ";
  protected final String TEXT_537 = " = new ";
  protected final String TEXT_538 = "(this, ";
  protected final String TEXT_539 = "null";
  protected final String TEXT_540 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_541 = ";";
  protected final String TEXT_542 = NL + "\t\t}";
  protected final String TEXT_543 = NL + "\t\t";
  protected final String TEXT_544 = " union = ";
  protected final String TEXT_545 = "Helper(new ";
  protected final String TEXT_546 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_547 = "(this, ";
  protected final String TEXT_548 = "null";
  protected final String TEXT_549 = ", union.size(), union.toArray());";
  protected final String TEXT_550 = NL + "\t\tif (isSet";
  protected final String TEXT_551 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_552 = "();" + NL + "\t\t}";
  protected final String TEXT_553 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_554 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_555 = "();" + NL + "\t\t}";
  protected final String TEXT_556 = NL + "\t\t";
  protected final String TEXT_557 = " ";
  protected final String TEXT_558 = " = ";
  protected final String TEXT_559 = "();" + NL + "\t\tif (";
  protected final String TEXT_560 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_561 = ";" + NL + "\t\t}";
  protected final String TEXT_562 = NL + "\t\treturn ";
  protected final String TEXT_563 = "super.";
  protected final String TEXT_564 = "()";
  protected final String TEXT_565 = "null";
  protected final String TEXT_566 = ";";
  protected final String TEXT_567 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_568 = "' ";
  protected final String TEXT_569 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_570 = NL + "\t}" + NL;
  protected final String TEXT_571 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_572 = NL + "\t@Override";
  protected final String TEXT_573 = NL + "\tpublic ";
  protected final String TEXT_574 = " basicGet";
  protected final String TEXT_575 = "()" + NL + "\t{";
  protected final String TEXT_576 = NL + "\t\tif (eContainerFeatureID != ";
  protected final String TEXT_577 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_578 = ")eInternalContainer();";
  protected final String TEXT_579 = NL + "\t\treturn (";
  protected final String TEXT_580 = ")eVirtualGet(";
  protected final String TEXT_581 = ");";
  protected final String TEXT_582 = NL + "\t\treturn ";
  protected final String TEXT_583 = ";";
  protected final String TEXT_584 = NL + "\t\treturn (";
  protected final String TEXT_585 = ")((";
  protected final String TEXT_586 = ".Internal.Wrapper)get";
  protected final String TEXT_587 = "()).featureMap().get(";
  protected final String TEXT_588 = ", false);";
  protected final String TEXT_589 = NL + "\t\treturn (";
  protected final String TEXT_590 = ")get";
  protected final String TEXT_591 = "().get(";
  protected final String TEXT_592 = ", false);";
  protected final String TEXT_593 = NL + "\t\treturn ";
  protected final String TEXT_594 = ".";
  protected final String TEXT_595 = "(this);";
  protected final String TEXT_596 = NL + "\t\tif (isSet";
  protected final String TEXT_597 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_598 = "basicGet";
  protected final String TEXT_599 = "();" + NL + "\t\t}";
  protected final String TEXT_600 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_601 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_602 = "basicGet";
  protected final String TEXT_603 = "();" + NL + "\t\t}";
  protected final String TEXT_604 = NL + "\t\t";
  protected final String TEXT_605 = " ";
  protected final String TEXT_606 = " = ";
  protected final String TEXT_607 = "basicGet";
  protected final String TEXT_608 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_609 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_610 = ";" + NL + "\t\t}";
  protected final String TEXT_611 = NL + "\t\treturn ";
  protected final String TEXT_612 = "super.basicGet";
  protected final String TEXT_613 = "()";
  protected final String TEXT_614 = "null";
  protected final String TEXT_615 = ";";
  protected final String TEXT_616 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_617 = "' ";
  protected final String TEXT_618 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_619 = NL + "\t}" + NL;
  protected final String TEXT_620 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_621 = NL + "\t@Override";
  protected final String TEXT_622 = NL + "\tpublic ";
  protected final String TEXT_623 = " basicSet";
  protected final String TEXT_624 = "(";
  protected final String TEXT_625 = " new";
  protected final String TEXT_626 = ", ";
  protected final String TEXT_627 = " msgs)" + NL + "\t{";
  protected final String TEXT_628 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_629 = ")new";
  protected final String TEXT_630 = ", ";
  protected final String TEXT_631 = ", msgs);";
  protected final String TEXT_632 = NL + "\t\t";
  protected final String TEXT_633 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_634 = NL + "\t\t\t";
  protected final String TEXT_635 = " ";
  protected final String TEXT_636 = " = ";
  protected final String TEXT_637 = "();";
  protected final String TEXT_638 = NL + "\t\t\tObject ";
  protected final String TEXT_639 = " = eVirtualGet(";
  protected final String TEXT_640 = ");";
  protected final String TEXT_641 = NL + "\t\t\tif (";
  protected final String TEXT_642 = " != null && ";
  protected final String TEXT_643 = " != new";
  protected final String TEXT_644 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_645 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_646 = NL + "\t\t\tif (new";
  protected final String TEXT_647 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_648 = NL + "\t\t\t\t";
  protected final String TEXT_649 = " ";
  protected final String TEXT_650 = " = ";
  protected final String TEXT_651 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_652 = ".contains(new";
  protected final String TEXT_653 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_654 = ".add(new";
  protected final String TEXT_655 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_656 = NL + "\t\t\t\t";
  protected final String TEXT_657 = " ";
  protected final String TEXT_658 = " = ";
  protected final String TEXT_659 = "();";
  protected final String TEXT_660 = NL + "\t\t\t\tObject ";
  protected final String TEXT_661 = " = eVirtualGet(";
  protected final String TEXT_662 = ");";
  protected final String TEXT_663 = NL + "\t\t\t\tif (new";
  protected final String TEXT_664 = " != ";
  protected final String TEXT_665 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_666 = "(new";
  protected final String TEXT_667 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_668 = NL + "\t\t\t}";
  protected final String TEXT_669 = NL + "\t\t}";
  protected final String TEXT_670 = NL + "\t\treturn msgs;";
  protected final String TEXT_671 = NL + "\t\tObject old";
  protected final String TEXT_672 = " = eVirtualSet(";
  protected final String TEXT_673 = ", new";
  protected final String TEXT_674 = ");";
  protected final String TEXT_675 = NL + "\t\t";
  protected final String TEXT_676 = " old";
  protected final String TEXT_677 = " = ";
  protected final String TEXT_678 = ";" + NL + "\t\t";
  protected final String TEXT_679 = " = new";
  protected final String TEXT_680 = ";";
  protected final String TEXT_681 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_682 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_683 = NL + "\t\tboolean old";
  protected final String TEXT_684 = "ESet = (";
  protected final String TEXT_685 = " & ";
  protected final String TEXT_686 = "_ESETFLAG) != 0;";
  protected final String TEXT_687 = NL + "\t\t";
  protected final String TEXT_688 = " |= ";
  protected final String TEXT_689 = "_ESETFLAG;";
  protected final String TEXT_690 = NL + "\t\tboolean old";
  protected final String TEXT_691 = "ESet = ";
  protected final String TEXT_692 = "ESet;";
  protected final String TEXT_693 = NL + "\t\t";
  protected final String TEXT_694 = "ESet = true;";
  protected final String TEXT_695 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_696 = NL + "\t\t\t";
  protected final String TEXT_697 = " notification = new ";
  protected final String TEXT_698 = "(this, ";
  protected final String TEXT_699 = ".SET, ";
  protected final String TEXT_700 = ", ";
  protected final String TEXT_701 = "isSetChange ? null : old";
  protected final String TEXT_702 = "old";
  protected final String TEXT_703 = ", new";
  protected final String TEXT_704 = ", ";
  protected final String TEXT_705 = "isSetChange";
  protected final String TEXT_706 = "!old";
  protected final String TEXT_707 = "ESet";
  protected final String TEXT_708 = ");";
  protected final String TEXT_709 = NL + "\t\t\t";
  protected final String TEXT_710 = " notification = new ";
  protected final String TEXT_711 = "(this, ";
  protected final String TEXT_712 = ".SET, ";
  protected final String TEXT_713 = ", ";
  protected final String TEXT_714 = "old";
  protected final String TEXT_715 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_716 = "old";
  protected final String TEXT_717 = ", new";
  protected final String TEXT_718 = ");";
  protected final String TEXT_719 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_720 = NL + "\t\t";
  protected final String TEXT_721 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_722 = NL + "\t\t\t";
  protected final String TEXT_723 = " ";
  protected final String TEXT_724 = " = ";
  protected final String TEXT_725 = "();";
  protected final String TEXT_726 = NL + "\t\t\tObject ";
  protected final String TEXT_727 = " = eVirtualGet(";
  protected final String TEXT_728 = ");";
  protected final String TEXT_729 = NL + "\t\t\tif (";
  protected final String TEXT_730 = " != null && ";
  protected final String TEXT_731 = " != new";
  protected final String TEXT_732 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_733 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_734 = NL + "\t\t\tif (new";
  protected final String TEXT_735 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_736 = NL + "\t\t\t\t";
  protected final String TEXT_737 = " ";
  protected final String TEXT_738 = " = ";
  protected final String TEXT_739 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_740 = ".contains(new";
  protected final String TEXT_741 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_742 = ".add(new";
  protected final String TEXT_743 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_744 = NL + "\t\t\t\t";
  protected final String TEXT_745 = " ";
  protected final String TEXT_746 = " = ";
  protected final String TEXT_747 = "();";
  protected final String TEXT_748 = NL + "\t\t\t\tObject ";
  protected final String TEXT_749 = " = eVirtualGet(";
  protected final String TEXT_750 = ");";
  protected final String TEXT_751 = NL + "\t\t\t\tif (new";
  protected final String TEXT_752 = " != ";
  protected final String TEXT_753 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_754 = "(new";
  protected final String TEXT_755 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_756 = NL + "\t\t\t}";
  protected final String TEXT_757 = NL + "\t\t}";
  protected final String TEXT_758 = NL + "\t\treturn msgs;";
  protected final String TEXT_759 = NL + "\t\treturn ((";
  protected final String TEXT_760 = ".Internal)((";
  protected final String TEXT_761 = ".Internal.Wrapper)get";
  protected final String TEXT_762 = "()).featureMap()).basicAdd(";
  protected final String TEXT_763 = ", new";
  protected final String TEXT_764 = ", msgs);";
  protected final String TEXT_765 = NL + "\t\treturn ((";
  protected final String TEXT_766 = ".Internal)get";
  protected final String TEXT_767 = "()).basicAdd(";
  protected final String TEXT_768 = ", new";
  protected final String TEXT_769 = ", msgs);";
  protected final String TEXT_770 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_771 = "' ";
  protected final String TEXT_772 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_773 = NL + "\t}" + NL;
  protected final String TEXT_774 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_775 = "#";
  protected final String TEXT_776 = " <em>";
  protected final String TEXT_777 = "</em>}' ";
  protected final String TEXT_778 = ".";
  protected final String TEXT_779 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_780 = "</em>' ";
  protected final String TEXT_781 = ".";
  protected final String TEXT_782 = NL + "\t * @see ";
  protected final String TEXT_783 = NL + "\t * @see #isSet";
  protected final String TEXT_784 = "()";
  protected final String TEXT_785 = NL + "\t * @see #unset";
  protected final String TEXT_786 = "()";
  protected final String TEXT_787 = NL + "\t * @see #";
  protected final String TEXT_788 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_789 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_790 = NL + "\t@Override";
  protected final String TEXT_791 = NL + "\tvoid set";
  protected final String TEXT_792 = "(";
  protected final String TEXT_793 = " value);" + NL;
  protected final String TEXT_794 = NL + "\tpublic void set";
  protected final String TEXT_795 = "_";
  protected final String TEXT_796 = "(";
  protected final String TEXT_797 = " ";
  protected final String TEXT_798 = ")" + NL + "\t{";
  protected final String TEXT_799 = NL + "\t\tnew";
  protected final String TEXT_800 = " = new";
  protected final String TEXT_801 = " == null ? ";
  protected final String TEXT_802 = " : new";
  protected final String TEXT_803 = ";";
  protected final String TEXT_804 = NL + "\t\teSet(";
  protected final String TEXT_805 = ", ";
  protected final String TEXT_806 = "new ";
  protected final String TEXT_807 = "(";
  protected final String TEXT_808 = "new";
  protected final String TEXT_809 = ")";
  protected final String TEXT_810 = ");";
  protected final String TEXT_811 = NL + "\t\tif (new";
  protected final String TEXT_812 = " != eInternalContainer() || (eContainerFeatureID != ";
  protected final String TEXT_813 = " && new";
  protected final String TEXT_814 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_815 = ".isAncestor(this, ";
  protected final String TEXT_816 = "new";
  protected final String TEXT_817 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_818 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_819 = NL + "\t\t\t";
  protected final String TEXT_820 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_821 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_822 = ")new";
  protected final String TEXT_823 = ").eInverseAdd(this, ";
  protected final String TEXT_824 = ", ";
  protected final String TEXT_825 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_826 = "(";
  protected final String TEXT_827 = "new";
  protected final String TEXT_828 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_829 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_830 = "(this, ";
  protected final String TEXT_831 = ".SET, ";
  protected final String TEXT_832 = ", new";
  protected final String TEXT_833 = ", new";
  protected final String TEXT_834 = "));";
  protected final String TEXT_835 = NL + "\t\t";
  protected final String TEXT_836 = " ";
  protected final String TEXT_837 = " = (";
  protected final String TEXT_838 = ")eVirtualGet(";
  protected final String TEXT_839 = ");";
  protected final String TEXT_840 = NL + "\t\tif (new";
  protected final String TEXT_841 = " != ";
  protected final String TEXT_842 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_843 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_844 = " != null)";
  protected final String TEXT_845 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_846 = ")";
  protected final String TEXT_847 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_848 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_849 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_850 = ")new";
  protected final String TEXT_851 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_852 = ", null, msgs);";
  protected final String TEXT_853 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_854 = ")";
  protected final String TEXT_855 = ").eInverseRemove(this, ";
  protected final String TEXT_856 = ", ";
  protected final String TEXT_857 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_858 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_859 = ")new";
  protected final String TEXT_860 = ").eInverseAdd(this, ";
  protected final String TEXT_861 = ", ";
  protected final String TEXT_862 = ".class, msgs);";
  protected final String TEXT_863 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_864 = "(";
  protected final String TEXT_865 = "new";
  protected final String TEXT_866 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_867 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_868 = NL + "\t\t\tboolean old";
  protected final String TEXT_869 = "ESet = eVirtualIsSet(";
  protected final String TEXT_870 = ");";
  protected final String TEXT_871 = NL + "\t\t\tboolean old";
  protected final String TEXT_872 = "ESet = (";
  protected final String TEXT_873 = " & ";
  protected final String TEXT_874 = "_ESETFLAG) != 0;";
  protected final String TEXT_875 = NL + "\t\t\t";
  protected final String TEXT_876 = " |= ";
  protected final String TEXT_877 = "_ESETFLAG;";
  protected final String TEXT_878 = NL + "\t\t\tboolean old";
  protected final String TEXT_879 = "ESet = ";
  protected final String TEXT_880 = "ESet;";
  protected final String TEXT_881 = NL + "\t\t\t";
  protected final String TEXT_882 = "ESet = true;";
  protected final String TEXT_883 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_884 = "(this, ";
  protected final String TEXT_885 = ".SET, ";
  protected final String TEXT_886 = ", new";
  protected final String TEXT_887 = ", new";
  protected final String TEXT_888 = ", !old";
  protected final String TEXT_889 = "ESet));";
  protected final String TEXT_890 = NL + "\t\t}";
  protected final String TEXT_891 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_892 = "(this, ";
  protected final String TEXT_893 = ".SET, ";
  protected final String TEXT_894 = ", new";
  protected final String TEXT_895 = ", new";
  protected final String TEXT_896 = "));";
  protected final String TEXT_897 = NL + "\t\t";
  protected final String TEXT_898 = " old";
  protected final String TEXT_899 = " = (";
  protected final String TEXT_900 = " & ";
  protected final String TEXT_901 = "_EFLAG) != 0;";
  protected final String TEXT_902 = NL + "\t\t";
  protected final String TEXT_903 = " old";
  protected final String TEXT_904 = " = ";
  protected final String TEXT_905 = "_EFLAG_VALUES[(";
  protected final String TEXT_906 = " & ";
  protected final String TEXT_907 = "_EFLAG) >>> ";
  protected final String TEXT_908 = "_EFLAG_OFFSET];";
  protected final String TEXT_909 = NL + "\t\tif (new";
  protected final String TEXT_910 = ") ";
  protected final String TEXT_911 = " |= ";
  protected final String TEXT_912 = "_EFLAG; else ";
  protected final String TEXT_913 = " &= ~";
  protected final String TEXT_914 = "_EFLAG;";
  protected final String TEXT_915 = NL + "\t\tif (new";
  protected final String TEXT_916 = " == null) new";
  protected final String TEXT_917 = " = ";
  protected final String TEXT_918 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_919 = " = ";
  protected final String TEXT_920 = " & ~";
  protected final String TEXT_921 = "_EFLAG | ";
  protected final String TEXT_922 = "new";
  protected final String TEXT_923 = ".ordinal()";
  protected final String TEXT_924 = ".VALUES.indexOf(new";
  protected final String TEXT_925 = ")";
  protected final String TEXT_926 = " << ";
  protected final String TEXT_927 = "_EFLAG_OFFSET;";
  protected final String TEXT_928 = NL + "\t\t";
  protected final String TEXT_929 = " old";
  protected final String TEXT_930 = " = ";
  protected final String TEXT_931 = ";";
  protected final String TEXT_932 = NL + "\t\t";
  protected final String TEXT_933 = " ";
  protected final String TEXT_934 = " = new";
  protected final String TEXT_935 = " == null ? ";
  protected final String TEXT_936 = " : new";
  protected final String TEXT_937 = ";";
  protected final String TEXT_938 = NL + "\t\t";
  protected final String TEXT_939 = " = new";
  protected final String TEXT_940 = " == null ? ";
  protected final String TEXT_941 = " : new";
  protected final String TEXT_942 = ";";
  protected final String TEXT_943 = NL + "\t\t";
  protected final String TEXT_944 = " ";
  protected final String TEXT_945 = " = ";
  protected final String TEXT_946 = "new";
  protected final String TEXT_947 = ";";
  protected final String TEXT_948 = NL + "\t\t";
  protected final String TEXT_949 = " = ";
  protected final String TEXT_950 = "new";
  protected final String TEXT_951 = ";";
  protected final String TEXT_952 = NL + "\t\tObject old";
  protected final String TEXT_953 = " = eVirtualSet(";
  protected final String TEXT_954 = ", ";
  protected final String TEXT_955 = ");";
  protected final String TEXT_956 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_957 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_958 = NL + "\t\tboolean old";
  protected final String TEXT_959 = "ESet = (";
  protected final String TEXT_960 = " & ";
  protected final String TEXT_961 = "_ESETFLAG) != 0;";
  protected final String TEXT_962 = NL + "\t\t";
  protected final String TEXT_963 = " |= ";
  protected final String TEXT_964 = "_ESETFLAG;";
  protected final String TEXT_965 = NL + "\t\tboolean old";
  protected final String TEXT_966 = "ESet = ";
  protected final String TEXT_967 = "ESet;";
  protected final String TEXT_968 = NL + "\t\t";
  protected final String TEXT_969 = "ESet = true;";
  protected final String TEXT_970 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_971 = "(this, ";
  protected final String TEXT_972 = ".SET, ";
  protected final String TEXT_973 = ", ";
  protected final String TEXT_974 = "isSetChange ? ";
  protected final String TEXT_975 = " : old";
  protected final String TEXT_976 = "old";
  protected final String TEXT_977 = ", ";
  protected final String TEXT_978 = "new";
  protected final String TEXT_979 = ", ";
  protected final String TEXT_980 = "isSetChange";
  protected final String TEXT_981 = "!old";
  protected final String TEXT_982 = "ESet";
  protected final String TEXT_983 = "));";
  protected final String TEXT_984 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_985 = "(this, ";
  protected final String TEXT_986 = ".SET, ";
  protected final String TEXT_987 = ", ";
  protected final String TEXT_988 = "old";
  protected final String TEXT_989 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_990 = " : old";
  protected final String TEXT_991 = "old";
  protected final String TEXT_992 = ", ";
  protected final String TEXT_993 = "new";
  protected final String TEXT_994 = "));";
  protected final String TEXT_995 = NL + "\t\t";
  protected final String TEXT_996 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_997 = NL + "\t\t\t";
  protected final String TEXT_998 = " ";
  protected final String TEXT_999 = " = ";
  protected final String TEXT_1000 = "();";
  protected final String TEXT_1001 = NL + "\t\t\tObject ";
  protected final String TEXT_1002 = " = eVirtualGet(";
  protected final String TEXT_1003 = ");";
  protected final String TEXT_1004 = NL + "\t\t\tif (";
  protected final String TEXT_1005 = " != null && ";
  protected final String TEXT_1006 = " != new";
  protected final String TEXT_1007 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_1008 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_1009 = NL + "\t\t\tif (new";
  protected final String TEXT_1010 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_1011 = NL + "\t\t\t\t";
  protected final String TEXT_1012 = " ";
  protected final String TEXT_1013 = " = ";
  protected final String TEXT_1014 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_1015 = ".contains(new";
  protected final String TEXT_1016 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_1017 = ".add(new";
  protected final String TEXT_1018 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1019 = NL + "\t\t\t\t";
  protected final String TEXT_1020 = " ";
  protected final String TEXT_1021 = " = ";
  protected final String TEXT_1022 = "();";
  protected final String TEXT_1023 = NL + "\t\t\t\tObject ";
  protected final String TEXT_1024 = " = eVirtualGet(";
  protected final String TEXT_1025 = ");";
  protected final String TEXT_1026 = NL + "\t\t\t\tif (new";
  protected final String TEXT_1027 = " != ";
  protected final String TEXT_1028 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_1029 = "(new";
  protected final String TEXT_1030 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1031 = NL + "\t\t\t}";
  protected final String TEXT_1032 = NL + "\t\t}";
  protected final String TEXT_1033 = NL + "\t\t((";
  protected final String TEXT_1034 = ".Internal)((";
  protected final String TEXT_1035 = ".Internal.Wrapper)get";
  protected final String TEXT_1036 = "()).featureMap()).set(";
  protected final String TEXT_1037 = ", ";
  protected final String TEXT_1038 = "new ";
  protected final String TEXT_1039 = "(";
  protected final String TEXT_1040 = "new";
  protected final String TEXT_1041 = ")";
  protected final String TEXT_1042 = ");";
  protected final String TEXT_1043 = NL + "\t\t((";
  protected final String TEXT_1044 = ".Internal)get";
  protected final String TEXT_1045 = "()).set(";
  protected final String TEXT_1046 = ", ";
  protected final String TEXT_1047 = "new ";
  protected final String TEXT_1048 = "(";
  protected final String TEXT_1049 = "new";
  protected final String TEXT_1050 = ")";
  protected final String TEXT_1051 = ");";
  protected final String TEXT_1052 = NL + "\t\t";
  protected final String TEXT_1053 = NL + "\t\t";
  protected final String TEXT_1054 = ".";
  protected final String TEXT_1055 = "(this, ";
  protected final String TEXT_1056 = ");";
  protected final String TEXT_1057 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_1058 = "' ";
  protected final String TEXT_1059 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1060 = NL + "\t}" + NL;
  protected final String TEXT_1061 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1062 = NL + "\t@Override";
  protected final String TEXT_1063 = NL + "\tpublic ";
  protected final String TEXT_1064 = " basicUnset";
  protected final String TEXT_1065 = "(";
  protected final String TEXT_1066 = " msgs)" + NL + "\t{";
  protected final String TEXT_1067 = "Object old";
  protected final String TEXT_1068 = " = ";
  protected final String TEXT_1069 = "eVirtualUnset(";
  protected final String TEXT_1070 = ");";
  protected final String TEXT_1071 = NL + "\t\t";
  protected final String TEXT_1072 = " old";
  protected final String TEXT_1073 = " = ";
  protected final String TEXT_1074 = ";";
  protected final String TEXT_1075 = NL + "\t\t";
  protected final String TEXT_1076 = " = null;";
  protected final String TEXT_1077 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1078 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1079 = NL + "\t\tboolean old";
  protected final String TEXT_1080 = "ESet = (";
  protected final String TEXT_1081 = " & ";
  protected final String TEXT_1082 = "_ESETFLAG) != 0;";
  protected final String TEXT_1083 = NL + "\t\t";
  protected final String TEXT_1084 = " &= ~";
  protected final String TEXT_1085 = "_ESETFLAG;";
  protected final String TEXT_1086 = NL + "\t\tboolean old";
  protected final String TEXT_1087 = "ESet = ";
  protected final String TEXT_1088 = "ESet;";
  protected final String TEXT_1089 = NL + "\t\t";
  protected final String TEXT_1090 = "ESet = false;";
  protected final String TEXT_1091 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1092 = " notification = new ";
  protected final String TEXT_1093 = "(this, ";
  protected final String TEXT_1094 = ".UNSET, ";
  protected final String TEXT_1095 = ", ";
  protected final String TEXT_1096 = "isSetChange ? old";
  protected final String TEXT_1097 = " : null";
  protected final String TEXT_1098 = "old";
  protected final String TEXT_1099 = ", null, ";
  protected final String TEXT_1100 = "isSetChange";
  protected final String TEXT_1101 = "old";
  protected final String TEXT_1102 = "ESet";
  protected final String TEXT_1103 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1104 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1105 = "' ";
  protected final String TEXT_1106 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1107 = NL + "\t}" + NL;
  protected final String TEXT_1108 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1109 = "#";
  protected final String TEXT_1110 = " <em>";
  protected final String TEXT_1111 = "</em>}' ";
  protected final String TEXT_1112 = ".";
  protected final String TEXT_1113 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1114 = NL + "\t * @see #isSet";
  protected final String TEXT_1115 = "()";
  protected final String TEXT_1116 = NL + "\t * @see #";
  protected final String TEXT_1117 = "()";
  protected final String TEXT_1118 = NL + "\t * @see #set";
  protected final String TEXT_1119 = "(";
  protected final String TEXT_1120 = ")";
  protected final String TEXT_1121 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1122 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1123 = NL + "\t@Override";
  protected final String TEXT_1124 = NL + "\tvoid unset";
  protected final String TEXT_1125 = "();" + NL;
  protected final String TEXT_1126 = NL + "\tpublic void unset";
  protected final String TEXT_1127 = "_";
  protected final String TEXT_1128 = "()" + NL + "\t{";
  protected final String TEXT_1129 = NL + "\t\teUnset(";
  protected final String TEXT_1130 = ");";
  protected final String TEXT_1131 = NL + "\t\t";
  protected final String TEXT_1132 = " ";
  protected final String TEXT_1133 = " = (";
  protected final String TEXT_1134 = ")eVirtualGet(";
  protected final String TEXT_1135 = ");";
  protected final String TEXT_1136 = NL + "\t\tif (";
  protected final String TEXT_1137 = " != null) ((";
  protected final String TEXT_1138 = ".Unsettable";
  protected final String TEXT_1139 = ")";
  protected final String TEXT_1140 = ").unset();";
  protected final String TEXT_1141 = NL + "\t\t";
  protected final String TEXT_1142 = " ";
  protected final String TEXT_1143 = " = (";
  protected final String TEXT_1144 = ")eVirtualGet(";
  protected final String TEXT_1145 = ");";
  protected final String TEXT_1146 = NL + "\t\tif (";
  protected final String TEXT_1147 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1148 = " msgs = null;";
  protected final String TEXT_1149 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1150 = ")";
  protected final String TEXT_1151 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1152 = ", null, msgs);";
  protected final String TEXT_1153 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1154 = ")";
  protected final String TEXT_1155 = ").eInverseRemove(this, ";
  protected final String TEXT_1156 = ", ";
  protected final String TEXT_1157 = ".class, msgs);";
  protected final String TEXT_1158 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1159 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1160 = NL + "\t\t\tboolean old";
  protected final String TEXT_1161 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1162 = ");";
  protected final String TEXT_1163 = NL + "\t\t\tboolean old";
  protected final String TEXT_1164 = "ESet = (";
  protected final String TEXT_1165 = " & ";
  protected final String TEXT_1166 = "_ESETFLAG) != 0;";
  protected final String TEXT_1167 = NL + "\t\t\t";
  protected final String TEXT_1168 = " &= ~";
  protected final String TEXT_1169 = "_ESETFLAG;";
  protected final String TEXT_1170 = NL + "\t\t\tboolean old";
  protected final String TEXT_1171 = "ESet = ";
  protected final String TEXT_1172 = "ESet;";
  protected final String TEXT_1173 = NL + "\t\t\t";
  protected final String TEXT_1174 = "ESet = false;";
  protected final String TEXT_1175 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1176 = "(this, ";
  protected final String TEXT_1177 = ".UNSET, ";
  protected final String TEXT_1178 = ", null, null, old";
  protected final String TEXT_1179 = "ESet));";
  protected final String TEXT_1180 = NL + "\t\t}";
  protected final String TEXT_1181 = NL + "\t\t";
  protected final String TEXT_1182 = " old";
  protected final String TEXT_1183 = " = (";
  protected final String TEXT_1184 = " & ";
  protected final String TEXT_1185 = "_EFLAG) != 0;";
  protected final String TEXT_1186 = NL + "\t\t";
  protected final String TEXT_1187 = " old";
  protected final String TEXT_1188 = " = ";
  protected final String TEXT_1189 = "_EFLAG_VALUES[(";
  protected final String TEXT_1190 = " & ";
  protected final String TEXT_1191 = "_EFLAG) >>> ";
  protected final String TEXT_1192 = "_EFLAG_OFFSET];";
  protected final String TEXT_1193 = NL + "\t\tObject old";
  protected final String TEXT_1194 = " = eVirtualUnset(";
  protected final String TEXT_1195 = ");";
  protected final String TEXT_1196 = NL + "\t\t";
  protected final String TEXT_1197 = " old";
  protected final String TEXT_1198 = " = ";
  protected final String TEXT_1199 = ";";
  protected final String TEXT_1200 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1201 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1202 = NL + "\t\tboolean old";
  protected final String TEXT_1203 = "ESet = (";
  protected final String TEXT_1204 = " & ";
  protected final String TEXT_1205 = "_ESETFLAG) != 0;";
  protected final String TEXT_1206 = NL + "\t\tboolean old";
  protected final String TEXT_1207 = "ESet = ";
  protected final String TEXT_1208 = "ESet;";
  protected final String TEXT_1209 = NL + "\t\t";
  protected final String TEXT_1210 = " = null;";
  protected final String TEXT_1211 = NL + "\t\t";
  protected final String TEXT_1212 = " &= ~";
  protected final String TEXT_1213 = "_ESETFLAG;";
  protected final String TEXT_1214 = NL + "\t\t";
  protected final String TEXT_1215 = "ESet = false;";
  protected final String TEXT_1216 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1217 = "(this, ";
  protected final String TEXT_1218 = ".UNSET, ";
  protected final String TEXT_1219 = ", ";
  protected final String TEXT_1220 = "isSetChange ? old";
  protected final String TEXT_1221 = " : null";
  protected final String TEXT_1222 = "old";
  protected final String TEXT_1223 = ", null, ";
  protected final String TEXT_1224 = "isSetChange";
  protected final String TEXT_1225 = "old";
  protected final String TEXT_1226 = "ESet";
  protected final String TEXT_1227 = "));";
  protected final String TEXT_1228 = NL + "\t\tif (";
  protected final String TEXT_1229 = ") ";
  protected final String TEXT_1230 = " |= ";
  protected final String TEXT_1231 = "_EFLAG; else ";
  protected final String TEXT_1232 = " &= ~";
  protected final String TEXT_1233 = "_EFLAG;";
  protected final String TEXT_1234 = NL + "\t\t";
  protected final String TEXT_1235 = " = ";
  protected final String TEXT_1236 = " & ~";
  protected final String TEXT_1237 = "_EFLAG | ";
  protected final String TEXT_1238 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1239 = NL + "\t\t";
  protected final String TEXT_1240 = " = ";
  protected final String TEXT_1241 = ";";
  protected final String TEXT_1242 = NL + "\t\t";
  protected final String TEXT_1243 = " &= ~";
  protected final String TEXT_1244 = "_ESETFLAG;";
  protected final String TEXT_1245 = NL + "\t\t";
  protected final String TEXT_1246 = "ESet = false;";
  protected final String TEXT_1247 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1248 = "(this, ";
  protected final String TEXT_1249 = ".UNSET, ";
  protected final String TEXT_1250 = ", ";
  protected final String TEXT_1251 = "isSetChange ? old";
  protected final String TEXT_1252 = " : ";
  protected final String TEXT_1253 = "old";
  protected final String TEXT_1254 = ", ";
  protected final String TEXT_1255 = ", ";
  protected final String TEXT_1256 = "isSetChange";
  protected final String TEXT_1257 = "old";
  protected final String TEXT_1258 = "ESet";
  protected final String TEXT_1259 = "));";
  protected final String TEXT_1260 = NL + "\t\t((";
  protected final String TEXT_1261 = ".Internal)((";
  protected final String TEXT_1262 = ".Internal.Wrapper)get";
  protected final String TEXT_1263 = "()).featureMap()).clear(";
  protected final String TEXT_1264 = ");";
  protected final String TEXT_1265 = NL + "\t\t((";
  protected final String TEXT_1266 = ".Internal)get";
  protected final String TEXT_1267 = "()).clear(";
  protected final String TEXT_1268 = ");";
  protected final String TEXT_1269 = NL + "\t\t";
  protected final String TEXT_1270 = NL + "\t\t";
  protected final String TEXT_1271 = ".";
  protected final String TEXT_1272 = "(this);";
  protected final String TEXT_1273 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1274 = "' ";
  protected final String TEXT_1275 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1276 = NL + "\t}" + NL;
  protected final String TEXT_1277 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1278 = "#";
  protected final String TEXT_1279 = " <em>";
  protected final String TEXT_1280 = "</em>}' ";
  protected final String TEXT_1281 = " is set.";
  protected final String TEXT_1282 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1283 = "</em>' ";
  protected final String TEXT_1284 = " is set.";
  protected final String TEXT_1285 = NL + "\t * @see #unset";
  protected final String TEXT_1286 = "()";
  protected final String TEXT_1287 = NL + "\t * @see #";
  protected final String TEXT_1288 = "()";
  protected final String TEXT_1289 = NL + "\t * @see #set";
  protected final String TEXT_1290 = "(";
  protected final String TEXT_1291 = ")";
  protected final String TEXT_1292 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1293 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1294 = NL + "\t@Override";
  protected final String TEXT_1295 = NL + "\tboolean isSet";
  protected final String TEXT_1296 = "();" + NL;
  protected final String TEXT_1297 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1298 = "_";
  protected final String TEXT_1299 = "()" + NL + "\t{";
  protected final String TEXT_1300 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1301 = ");";
  protected final String TEXT_1302 = NL + "\t\t";
  protected final String TEXT_1303 = " ";
  protected final String TEXT_1304 = " = (";
  protected final String TEXT_1305 = ")eVirtualGet(";
  protected final String TEXT_1306 = ");";
  protected final String TEXT_1307 = NL + "\t\treturn ";
  protected final String TEXT_1308 = " != null && ((";
  protected final String TEXT_1309 = ".Unsettable";
  protected final String TEXT_1310 = ")";
  protected final String TEXT_1311 = ").isSet();";
  protected final String TEXT_1312 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1313 = ");";
  protected final String TEXT_1314 = NL + "\t\treturn (";
  protected final String TEXT_1315 = " & ";
  protected final String TEXT_1316 = "_ESETFLAG) != 0;";
  protected final String TEXT_1317 = NL + "\t\treturn ";
  protected final String TEXT_1318 = "ESet;";
  protected final String TEXT_1319 = NL + "\t\treturn !((";
  protected final String TEXT_1320 = ".Internal)((";
  protected final String TEXT_1321 = ".Internal.Wrapper)get";
  protected final String TEXT_1322 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1323 = ");";
  protected final String TEXT_1324 = NL + "\t\treturn !((";
  protected final String TEXT_1325 = ".Internal)get";
  protected final String TEXT_1326 = "()).isEmpty(";
  protected final String TEXT_1327 = ");";
  protected final String TEXT_1328 = NL + "\t\t";
  protected final String TEXT_1329 = NL + "\t\treturn ";
  protected final String TEXT_1330 = ".";
  protected final String TEXT_1331 = "(this);";
  protected final String TEXT_1332 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1333 = "' ";
  protected final String TEXT_1334 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1335 = NL + "\t}" + NL;
  protected final String TEXT_1336 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1337 = "() <em>";
  protected final String TEXT_1338 = "</em>}' ";
  protected final String TEXT_1339 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1340 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1341 = "_ESUBSETS = ";
  protected final String TEXT_1342 = ";" + NL;
  protected final String TEXT_1343 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1344 = "() <em>";
  protected final String TEXT_1345 = "</em>}' ";
  protected final String TEXT_1346 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1347 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1348 = "_ESUPERSETS = ";
  protected final String TEXT_1349 = ";" + NL;
  protected final String TEXT_1350 = NL + "\t/**";
  protected final String TEXT_1351 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1352 = "}, with the specified ";
  protected final String TEXT_1353 = ", and appends it to the '<em><b>";
  protected final String TEXT_1354 = "</b></em>' ";
  protected final String TEXT_1355 = ".";
  protected final String TEXT_1356 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1357 = "}, with the specified ";
  protected final String TEXT_1358 = ", and sets the '<em><b>";
  protected final String TEXT_1359 = "</b></em>' ";
  protected final String TEXT_1360 = ".";
  protected final String TEXT_1361 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1362 = "} and appends it to the '<em><b>";
  protected final String TEXT_1363 = "</b></em>' ";
  protected final String TEXT_1364 = ".";
  protected final String TEXT_1365 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1366 = "} and sets the '<em><b>";
  protected final String TEXT_1367 = "</b></em>' ";
  protected final String TEXT_1368 = ".";
  protected final String TEXT_1369 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1370 = NL + "\t * @param ";
  protected final String TEXT_1371 = " The ";
  protected final String TEXT_1372 = " for the new {@link ";
  protected final String TEXT_1373 = "}, or <code>null</code>.";
  protected final String TEXT_1374 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1375 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1376 = "}." + NL + "\t * @see #";
  protected final String TEXT_1377 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1378 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1379 = NL + "\t";
  protected final String TEXT_1380 = " create";
  protected final String TEXT_1381 = "(";
  protected final String TEXT_1382 = ", ";
  protected final String TEXT_1383 = " eClass);" + NL;
  protected final String TEXT_1384 = NL + "\t@Override";
  protected final String TEXT_1385 = NL + "\tpublic ";
  protected final String TEXT_1386 = " create";
  protected final String TEXT_1387 = "(";
  protected final String TEXT_1388 = ", ";
  protected final String TEXT_1389 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1390 = " new";
  protected final String TEXT_1391 = " = (";
  protected final String TEXT_1392 = ") create(eClass);";
  protected final String TEXT_1393 = NL + "\t\t";
  protected final String TEXT_1394 = "().add(new";
  protected final String TEXT_1395 = ");";
  protected final String TEXT_1396 = NL + "\t\tset";
  protected final String TEXT_1397 = "(new";
  protected final String TEXT_1398 = ");";
  protected final String TEXT_1399 = NL + "\t\tint ";
  protected final String TEXT_1400 = "ListSize = 0;";
  protected final String TEXT_1401 = NL + "\t\tint ";
  protected final String TEXT_1402 = "Size = ";
  protected final String TEXT_1403 = " == null ? 0 : ";
  protected final String TEXT_1404 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1405 = "Size > ";
  protected final String TEXT_1406 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1407 = "ListSize = ";
  protected final String TEXT_1408 = "Size;";
  protected final String TEXT_1409 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1410 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1411 = ".create";
  protected final String TEXT_1412 = "(";
  protected final String TEXT_1413 = ", ";
  protected final String TEXT_1414 = "i < ";
  protected final String TEXT_1415 = "Size ? (";
  protected final String TEXT_1416 = ") ";
  protected final String TEXT_1417 = ".get(i) : null";
  protected final String TEXT_1418 = ");" + NL + "\t\t}";
  protected final String TEXT_1419 = NL + "\t\tnew";
  protected final String TEXT_1420 = ".create";
  protected final String TEXT_1421 = "(";
  protected final String TEXT_1422 = ", ";
  protected final String TEXT_1423 = ");";
  protected final String TEXT_1424 = NL + "\t\tif (";
  protected final String TEXT_1425 = " != null)";
  protected final String TEXT_1426 = NL + "\t\t\tnew";
  protected final String TEXT_1427 = ".";
  protected final String TEXT_1428 = "().addAll(";
  protected final String TEXT_1429 = ");";
  protected final String TEXT_1430 = NL + "\t\t\tnew";
  protected final String TEXT_1431 = ".set";
  protected final String TEXT_1432 = "(";
  protected final String TEXT_1433 = ");";
  protected final String TEXT_1434 = NL + "\t\treturn new";
  protected final String TEXT_1435 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1436 = NL + "\t/**";
  protected final String TEXT_1437 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1438 = "}, with the specified ";
  protected final String TEXT_1439 = ", and appends it to the '<em><b>";
  protected final String TEXT_1440 = "</b></em>' ";
  protected final String TEXT_1441 = ".";
  protected final String TEXT_1442 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1443 = "},with the specified ";
  protected final String TEXT_1444 = ", and sets the '<em><b>";
  protected final String TEXT_1445 = "</b></em>' ";
  protected final String TEXT_1446 = ".";
  protected final String TEXT_1447 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1448 = "} and appends it to the '<em><b>";
  protected final String TEXT_1449 = "</b></em>' ";
  protected final String TEXT_1450 = ".";
  protected final String TEXT_1451 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1452 = "} and sets the '<em><b>";
  protected final String TEXT_1453 = "</b></em>' ";
  protected final String TEXT_1454 = ".";
  protected final String TEXT_1455 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1456 = NL + "\t * @param ";
  protected final String TEXT_1457 = " The ";
  protected final String TEXT_1458 = " for the new {@link ";
  protected final String TEXT_1459 = "}, or <code>null</code>.";
  protected final String TEXT_1460 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1461 = "}." + NL + "\t * @see #";
  protected final String TEXT_1462 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1463 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1464 = NL + "\t";
  protected final String TEXT_1465 = " create";
  protected final String TEXT_1466 = "(";
  protected final String TEXT_1467 = ");" + NL;
  protected final String TEXT_1468 = NL + "\t@Override";
  protected final String TEXT_1469 = NL + "\tpublic ";
  protected final String TEXT_1470 = " create";
  protected final String TEXT_1471 = "(";
  protected final String TEXT_1472 = ")" + NL + "\t{";
  protected final String TEXT_1473 = NL + "\t\treturn create";
  protected final String TEXT_1474 = "(";
  protected final String TEXT_1475 = ", ";
  protected final String TEXT_1476 = ");";
  protected final String TEXT_1477 = NL + "\t\t";
  protected final String TEXT_1478 = " new";
  protected final String TEXT_1479 = " = (";
  protected final String TEXT_1480 = ") create(";
  protected final String TEXT_1481 = ");";
  protected final String TEXT_1482 = NL + "\t\t";
  protected final String TEXT_1483 = "().add(new";
  protected final String TEXT_1484 = ");";
  protected final String TEXT_1485 = NL + "\t\tset";
  protected final String TEXT_1486 = "(new";
  protected final String TEXT_1487 = ");";
  protected final String TEXT_1488 = NL + "\t\tint ";
  protected final String TEXT_1489 = "ListSize = 0;";
  protected final String TEXT_1490 = NL + "\t\tint ";
  protected final String TEXT_1491 = "Size = ";
  protected final String TEXT_1492 = " == null ? 0 : ";
  protected final String TEXT_1493 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1494 = "Size > ";
  protected final String TEXT_1495 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1496 = "ListSize = ";
  protected final String TEXT_1497 = "Size;";
  protected final String TEXT_1498 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1499 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1500 = ".create";
  protected final String TEXT_1501 = "(";
  protected final String TEXT_1502 = ", ";
  protected final String TEXT_1503 = "i < ";
  protected final String TEXT_1504 = "Size ? (";
  protected final String TEXT_1505 = ") ";
  protected final String TEXT_1506 = ".get(i) : null";
  protected final String TEXT_1507 = ");" + NL + "\t\t}";
  protected final String TEXT_1508 = NL + "\t\tnew";
  protected final String TEXT_1509 = ".create";
  protected final String TEXT_1510 = "(";
  protected final String TEXT_1511 = ", ";
  protected final String TEXT_1512 = ");";
  protected final String TEXT_1513 = NL + "\t\tif (";
  protected final String TEXT_1514 = " != null)";
  protected final String TEXT_1515 = NL + "\t\t\tnew";
  protected final String TEXT_1516 = ".";
  protected final String TEXT_1517 = "().addAll(";
  protected final String TEXT_1518 = ");";
  protected final String TEXT_1519 = NL + "\t\t\tnew";
  protected final String TEXT_1520 = ".set";
  protected final String TEXT_1521 = "(";
  protected final String TEXT_1522 = ");";
  protected final String TEXT_1523 = NL + "\t\treturn new";
  protected final String TEXT_1524 = ";";
  protected final String TEXT_1525 = NL + "\t}" + NL;
  protected final String TEXT_1526 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1527 = "} with the specified ";
  protected final String TEXT_1528 = " from the '<em><b>";
  protected final String TEXT_1529 = "</b></em>' ";
  protected final String TEXT_1530 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1531 = NL + "\t * @param ";
  protected final String TEXT_1532 = " The ";
  protected final String TEXT_1533 = " of the {@link ";
  protected final String TEXT_1534 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1535 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1536 = "} with the specified ";
  protected final String TEXT_1537 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1538 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1539 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1540 = NL + "\t";
  protected final String TEXT_1541 = " get";
  protected final String TEXT_1542 = "(";
  protected final String TEXT_1543 = ");" + NL;
  protected final String TEXT_1544 = NL + "\t@Override";
  protected final String TEXT_1545 = NL + "\tpublic ";
  protected final String TEXT_1546 = " get";
  protected final String TEXT_1547 = "(";
  protected final String TEXT_1548 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1549 = "(";
  protected final String TEXT_1550 = ", false";
  protected final String TEXT_1551 = ", null";
  protected final String TEXT_1552 = ", false";
  protected final String TEXT_1553 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1554 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1555 = "} with the specified ";
  protected final String TEXT_1556 = " from the '<em><b>";
  protected final String TEXT_1557 = "</b></em>' ";
  protected final String TEXT_1558 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1559 = NL + "\t * @param ";
  protected final String TEXT_1560 = " The ";
  protected final String TEXT_1561 = " of the {@link ";
  protected final String TEXT_1562 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1563 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1564 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1565 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1566 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1567 = "} on demand if not found.";
  protected final String TEXT_1568 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1569 = "} with the specified ";
  protected final String TEXT_1570 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1571 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1572 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1573 = NL + "\t";
  protected final String TEXT_1574 = " get";
  protected final String TEXT_1575 = "(";
  protected final String TEXT_1576 = ", boolean ignoreCase";
  protected final String TEXT_1577 = ", ";
  protected final String TEXT_1578 = " eClass";
  protected final String TEXT_1579 = ", boolean createOnDemand";
  protected final String TEXT_1580 = ");" + NL;
  protected final String TEXT_1581 = NL + "\t@Override";
  protected final String TEXT_1582 = NL + "\tpublic ";
  protected final String TEXT_1583 = " get";
  protected final String TEXT_1584 = "(";
  protected final String TEXT_1585 = ", boolean ignoreCase";
  protected final String TEXT_1586 = ", ";
  protected final String TEXT_1587 = " eClass";
  protected final String TEXT_1588 = ", boolean createOnDemand";
  protected final String TEXT_1589 = ")" + NL + "\t{";
  protected final String TEXT_1590 = NL + "\t\t";
  protected final String TEXT_1591 = "Loop: for (";
  protected final String TEXT_1592 = " ";
  protected final String TEXT_1593 = " : ";
  protected final String TEXT_1594 = "())" + NL + "\t\t{";
  protected final String TEXT_1595 = NL + "\t\t";
  protected final String TEXT_1596 = "Loop: for (";
  protected final String TEXT_1597 = " i = ";
  protected final String TEXT_1598 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1599 = " ";
  protected final String TEXT_1600 = " = (";
  protected final String TEXT_1601 = ") i.next();";
  protected final String TEXT_1602 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1603 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1604 = "Loop;";
  protected final String TEXT_1605 = NL + "\t\t\t";
  protected final String TEXT_1606 = " ";
  protected final String TEXT_1607 = "List = ";
  protected final String TEXT_1608 = ".";
  protected final String TEXT_1609 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1610 = "ListSize = ";
  protected final String TEXT_1611 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1612 = " || (";
  protected final String TEXT_1613 = " != null && ";
  protected final String TEXT_1614 = ".size() != ";
  protected final String TEXT_1615 = "ListSize";
  protected final String TEXT_1616 = ")";
  protected final String TEXT_1617 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1618 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1619 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1620 = " ";
  protected final String TEXT_1621 = " = ";
  protected final String TEXT_1622 = "(";
  protected final String TEXT_1623 = ") ";
  protected final String TEXT_1624 = "List.get(j);";
  protected final String TEXT_1625 = NL + "\t\t\t\tif (";
  protected final String TEXT_1626 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1627 = "(";
  protected final String TEXT_1628 = ")";
  protected final String TEXT_1629 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1630 = ".";
  protected final String TEXT_1631 = "()) : ";
  protected final String TEXT_1632 = ".get(j).equals(";
  protected final String TEXT_1633 = ".";
  protected final String TEXT_1634 = "())))";
  protected final String TEXT_1635 = NL + "\t\t\t\tif (";
  protected final String TEXT_1636 = " != null && !";
  protected final String TEXT_1637 = ".get(j).equals(";
  protected final String TEXT_1638 = ".";
  protected final String TEXT_1639 = "()))";
  protected final String TEXT_1640 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1641 = "Loop;";
  protected final String TEXT_1642 = NL + "\t\t\t}";
  protected final String TEXT_1643 = NL + "\t\t\t";
  protected final String TEXT_1644 = " ";
  protected final String TEXT_1645 = " = ";
  protected final String TEXT_1646 = ".";
  protected final String TEXT_1647 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1648 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1649 = "Loop;";
  protected final String TEXT_1650 = NL + "\t\t\tif (";
  protected final String TEXT_1651 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1652 = ".equalsIgnoreCase(";
  protected final String TEXT_1653 = ".";
  protected final String TEXT_1654 = "()) : ";
  protected final String TEXT_1655 = ".equals(";
  protected final String TEXT_1656 = ".";
  protected final String TEXT_1657 = "())))";
  protected final String TEXT_1658 = NL + "\t\t\tif (";
  protected final String TEXT_1659 = " != null && !";
  protected final String TEXT_1660 = ".equals(";
  protected final String TEXT_1661 = ".";
  protected final String TEXT_1662 = "()))";
  protected final String TEXT_1663 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1664 = "Loop;";
  protected final String TEXT_1665 = NL + "\t\t\tif (";
  protected final String TEXT_1666 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1667 = ".equalsIgnoreCase(";
  protected final String TEXT_1668 = ".";
  protected final String TEXT_1669 = "()) : ";
  protected final String TEXT_1670 = ".equals(";
  protected final String TEXT_1671 = ".";
  protected final String TEXT_1672 = "())))";
  protected final String TEXT_1673 = NL + "\t\t\tif (";
  protected final String TEXT_1674 = " != null && !";
  protected final String TEXT_1675 = ".equals(";
  protected final String TEXT_1676 = ".";
  protected final String TEXT_1677 = "()))";
  protected final String TEXT_1678 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1679 = "Loop;";
  protected final String TEXT_1680 = NL + "\t\t\treturn ";
  protected final String TEXT_1681 = ";" + NL + "\t\t}";
  protected final String TEXT_1682 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1683 = " && eClass != null";
  protected final String TEXT_1684 = " ? create";
  protected final String TEXT_1685 = "(";
  protected final String TEXT_1686 = ", eClass";
  protected final String TEXT_1687 = ") : null;";
  protected final String TEXT_1688 = NL + "\t\treturn null;";
  protected final String TEXT_1689 = NL + "\t}" + NL;
  protected final String TEXT_1690 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1691 = "()" + NL + "\t{";
  protected final String TEXT_1692 = NL + "  \t\treturn false;";
  protected final String TEXT_1693 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1694 = ");";
  protected final String TEXT_1695 = NL + "\t\treturn !((";
  protected final String TEXT_1696 = ".Internal.Wrapper)";
  protected final String TEXT_1697 = "()).featureMap().isEmpty();";
  protected final String TEXT_1698 = NL + "\t\treturn ";
  protected final String TEXT_1699 = " != null && !";
  protected final String TEXT_1700 = ".featureMap().isEmpty();";
  protected final String TEXT_1701 = NL + "\t\treturn ";
  protected final String TEXT_1702 = " != null && !";
  protected final String TEXT_1703 = ".isEmpty();";
  protected final String TEXT_1704 = NL + "\t\t";
  protected final String TEXT_1705 = " ";
  protected final String TEXT_1706 = " = (";
  protected final String TEXT_1707 = ")eVirtualGet(";
  protected final String TEXT_1708 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1709 = " != null && !";
  protected final String TEXT_1710 = ".isEmpty();";
  protected final String TEXT_1711 = NL + "\t\treturn !";
  protected final String TEXT_1712 = "().isEmpty();";
  protected final String TEXT_1713 = NL + "\t\treturn ";
  protected final String TEXT_1714 = " != null;";
  protected final String TEXT_1715 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1716 = ") != null;";
  protected final String TEXT_1717 = NL + "\t\treturn basicGet";
  protected final String TEXT_1718 = "() != null;";
  protected final String TEXT_1719 = NL + "\t\treturn ";
  protected final String TEXT_1720 = " != null;";
  protected final String TEXT_1721 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1722 = ") != null;";
  protected final String TEXT_1723 = NL + "\t\treturn ";
  protected final String TEXT_1724 = "() != null;";
  protected final String TEXT_1725 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1726 = " & ";
  protected final String TEXT_1727 = "_EFLAG) != 0) != ";
  protected final String TEXT_1728 = ";";
  protected final String TEXT_1729 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1730 = " & ";
  protected final String TEXT_1731 = "_EFLAG) != ";
  protected final String TEXT_1732 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1733 = NL + "\t\treturn ";
  protected final String TEXT_1734 = " != ";
  protected final String TEXT_1735 = ";";
  protected final String TEXT_1736 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1737 = ", ";
  protected final String TEXT_1738 = ") != ";
  protected final String TEXT_1739 = ";";
  protected final String TEXT_1740 = NL + "\t\treturn ";
  protected final String TEXT_1741 = "() != ";
  protected final String TEXT_1742 = ";";
  protected final String TEXT_1743 = NL + "\t\treturn ";
  protected final String TEXT_1744 = " == null ? ";
  protected final String TEXT_1745 = " != null : !";
  protected final String TEXT_1746 = ".equals(";
  protected final String TEXT_1747 = ");";
  protected final String TEXT_1748 = NL + "\t\t";
  protected final String TEXT_1749 = " ";
  protected final String TEXT_1750 = " = (";
  protected final String TEXT_1751 = ")eVirtualGet(";
  protected final String TEXT_1752 = ", ";
  protected final String TEXT_1753 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1754 = " == null ? ";
  protected final String TEXT_1755 = " != null : !";
  protected final String TEXT_1756 = ".equals(";
  protected final String TEXT_1757 = ");";
  protected final String TEXT_1758 = NL + "\t\treturn ";
  protected final String TEXT_1759 = " == null ? ";
  protected final String TEXT_1760 = "() != null : !";
  protected final String TEXT_1761 = ".equals(";
  protected final String TEXT_1762 = "());";
  protected final String TEXT_1763 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1764 = ");";
  protected final String TEXT_1765 = NL + "\t\t";
  protected final String TEXT_1766 = " ";
  protected final String TEXT_1767 = " = (";
  protected final String TEXT_1768 = ")eVirtualGet(";
  protected final String TEXT_1769 = ");";
  protected final String TEXT_1770 = NL + "\t\treturn ";
  protected final String TEXT_1771 = " != null && ((";
  protected final String TEXT_1772 = ".Unsettable";
  protected final String TEXT_1773 = ")";
  protected final String TEXT_1774 = ").isSet();";
  protected final String TEXT_1775 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1776 = ");";
  protected final String TEXT_1777 = NL + "\t\treturn (";
  protected final String TEXT_1778 = " & ";
  protected final String TEXT_1779 = "_ESETFLAG) != 0;";
  protected final String TEXT_1780 = NL + "\t\treturn ";
  protected final String TEXT_1781 = "ESet;";
  protected final String TEXT_1782 = NL + "\t\treturn !((";
  protected final String TEXT_1783 = ".Internal)((";
  protected final String TEXT_1784 = ".Internal.Wrapper)get";
  protected final String TEXT_1785 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1786 = ");";
  protected final String TEXT_1787 = NL + "\t\treturn !((";
  protected final String TEXT_1788 = ".Internal)get";
  protected final String TEXT_1789 = "()).isEmpty(";
  protected final String TEXT_1790 = ");";
  protected final String TEXT_1791 = NL + "\t\treturn ";
  protected final String TEXT_1792 = ".";
  protected final String TEXT_1793 = "(this);";
  protected final String TEXT_1794 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1795 = "' ";
  protected final String TEXT_1796 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1797 = NL + "\t}" + NL;
  protected final String TEXT_1798 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_1799 = "(";
  protected final String TEXT_1800 = ") <em>";
  protected final String TEXT_1801 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1802 = "(";
  protected final String TEXT_1803 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1804 = " ";
  protected final String TEXT_1805 = "__EOCL_EXP = \"";
  protected final String TEXT_1806 = "\";";
  protected final String TEXT_1807 = NL;
  protected final String TEXT_1808 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_1809 = "(";
  protected final String TEXT_1810 = ") <em>";
  protected final String TEXT_1811 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1812 = "(";
  protected final String TEXT_1813 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1814 = " ";
  protected final String TEXT_1815 = "__EOCL_INV;" + NL;
  protected final String TEXT_1816 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_1817 = "(";
  protected final String TEXT_1818 = ") <em>";
  protected final String TEXT_1819 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1820 = "(";
  protected final String TEXT_1821 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1822 = "<";
  protected final String TEXT_1823 = ">";
  protected final String TEXT_1824 = " ";
  protected final String TEXT_1825 = "__EOCL_QRY;" + NL;
  protected final String TEXT_1826 = NL + "\t/**";
  protected final String TEXT_1827 = NL + "\t * <p>" + NL + "\t * This operation redefines the following operations:" + NL + "\t * <ul>";
  protected final String TEXT_1828 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_1829 = "#";
  protected final String TEXT_1830 = "(";
  protected final String TEXT_1831 = ") <em>";
  protected final String TEXT_1832 = "</em>}' </li>";
  protected final String TEXT_1833 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_1834 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1835 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1836 = NL + "\t * ";
  protected final String TEXT_1837 = NL + "\t * @param ";
  protected final String TEXT_1838 = NL + "\t *   ";
  protected final String TEXT_1839 = NL + "\t * @param ";
  protected final String TEXT_1840 = " ";
  protected final String TEXT_1841 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1842 = NL + "\t * @model ";
  protected final String TEXT_1843 = NL + "\t *        ";
  protected final String TEXT_1844 = NL + "\t * @model";
  protected final String TEXT_1845 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1846 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1847 = NL + "\t@Override";
  protected final String TEXT_1848 = NL + "\t";
  protected final String TEXT_1849 = " ";
  protected final String TEXT_1850 = "(";
  protected final String TEXT_1851 = ")";
  protected final String TEXT_1852 = ";" + NL;
  protected final String TEXT_1853 = NL + "\tpublic ";
  protected final String TEXT_1854 = " ";
  protected final String TEXT_1855 = "(";
  protected final String TEXT_1856 = ")";
  protected final String TEXT_1857 = NL + "\t{";
  protected final String TEXT_1858 = NL + "\t\t";
  protected final String TEXT_1859 = NL + "\t\treturn ";
  protected final String TEXT_1860 = ".";
  protected final String TEXT_1861 = "(this, ";
  protected final String TEXT_1862 = ", ";
  protected final String TEXT_1863 = ");";
  protected final String TEXT_1864 = NL + "\t\tif (";
  protected final String TEXT_1865 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1866 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_1867 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1868 = " = helper.createInvariant(";
  protected final String TEXT_1869 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_1870 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_1871 = ").check(this))";
  protected final String TEXT_1872 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_1873 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1874 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1875 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1876 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1877 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1878 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1879 = ".";
  protected final String TEXT_1880 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1881 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1882 = "\", ";
  protected final String TEXT_1883 = ".getObjectLabel(this, ";
  protected final String TEXT_1884 = ") }),";
  protected final String TEXT_1885 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1886 = NL + "\t\t";
  protected final String TEXT_1887 = ".";
  protected final String TEXT_1888 = "(this";
  protected final String TEXT_1889 = ", ";
  protected final String TEXT_1890 = ");";
  protected final String TEXT_1891 = NL + "\t\t";
  protected final String TEXT_1892 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_1893 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1894 = NL + "\t\t\t";
  protected final String TEXT_1895 = " result = (";
  protected final String TEXT_1896 = ") cache.get(";
  protected final String TEXT_1897 = "eResource(), ";
  protected final String TEXT_1898 = "this, ";
  protected final String TEXT_1899 = ".getEOperations().get(";
  protected final String TEXT_1900 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1901 = "eResource(), ";
  protected final String TEXT_1902 = "this, ";
  protected final String TEXT_1903 = ".getEOperations().get(";
  protected final String TEXT_1904 = "), result = ";
  protected final String TEXT_1905 = "new ";
  protected final String TEXT_1906 = "(";
  protected final String TEXT_1907 = ".";
  protected final String TEXT_1908 = "(this";
  protected final String TEXT_1909 = ", ";
  protected final String TEXT_1910 = ")";
  protected final String TEXT_1911 = ")";
  protected final String TEXT_1912 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1913 = ".";
  protected final String TEXT_1914 = "()";
  protected final String TEXT_1915 = ";" + NL + "\t\t}";
  protected final String TEXT_1916 = NL + "\t\treturn ";
  protected final String TEXT_1917 = ".";
  protected final String TEXT_1918 = "(this";
  protected final String TEXT_1919 = ", ";
  protected final String TEXT_1920 = ");";
  protected final String TEXT_1921 = NL + "\t\tif (";
  protected final String TEXT_1922 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1923 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_1924 = ", ";
  protected final String TEXT_1925 = ".getEAllOperations().get(";
  protected final String TEXT_1926 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1927 = " = helper.createQuery(";
  protected final String TEXT_1928 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_1929 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_1930 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_1931 = ");";
  protected final String TEXT_1932 = NL + "\t\t";
  protected final String TEXT_1933 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_1934 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_1935 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_1936 = "\", ";
  protected final String TEXT_1937 = ");";
  protected final String TEXT_1938 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1939 = NL + "\t\t";
  protected final String TEXT_1940 = "<";
  protected final String TEXT_1941 = "> result = (";
  protected final String TEXT_1942 = "<";
  protected final String TEXT_1943 = ">) query.evaluate(this);" + NL + "\t\treturn new ";
  protected final String TEXT_1944 = ".UnmodifiableEList<";
  protected final String TEXT_1945 = ">(result.size(), result.toArray());";
  protected final String TEXT_1946 = NL + "\t\treturn ((";
  protected final String TEXT_1947 = ") query.evaluate(this)).";
  protected final String TEXT_1948 = "();";
  protected final String TEXT_1949 = NL + "\t\treturn (";
  protected final String TEXT_1950 = ") query.evaluate(this);";
  protected final String TEXT_1951 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1952 = NL + "\t}" + NL;
  protected final String TEXT_1953 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1954 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1955 = NL + "\t@Override";
  protected final String TEXT_1956 = NL + "\tpublic ";
  protected final String TEXT_1957 = " eInverseAdd(";
  protected final String TEXT_1958 = " otherEnd, int featureID, ";
  protected final String TEXT_1959 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_1960 = ")" + NL + "\t\t{";
  protected final String TEXT_1961 = NL + "\t\t\tcase ";
  protected final String TEXT_1962 = ":";
  protected final String TEXT_1963 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1964 = "(";
  protected final String TEXT_1965 = ".InternalMapView";
  protected final String TEXT_1966 = ")";
  protected final String TEXT_1967 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1968 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1969 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_1970 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_1971 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1972 = "((";
  protected final String TEXT_1973 = ")otherEnd, msgs);";
  protected final String TEXT_1974 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_1975 = ", msgs);";
  protected final String TEXT_1976 = NL + "\t\t\t\t";
  protected final String TEXT_1977 = " ";
  protected final String TEXT_1978 = " = (";
  protected final String TEXT_1979 = ")eVirtualGet(";
  protected final String TEXT_1980 = ");";
  protected final String TEXT_1981 = NL + "\t\t\t\t";
  protected final String TEXT_1982 = " ";
  protected final String TEXT_1983 = " = ";
  protected final String TEXT_1984 = "basicGet";
  protected final String TEXT_1985 = "();";
  protected final String TEXT_1986 = NL + "\t\t\t\tif (";
  protected final String TEXT_1987 = " != null)";
  protected final String TEXT_1988 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1989 = ")";
  protected final String TEXT_1990 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1991 = ", null, msgs);";
  protected final String TEXT_1992 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_1993 = ")";
  protected final String TEXT_1994 = ").eInverseRemove(this, ";
  protected final String TEXT_1995 = ", ";
  protected final String TEXT_1996 = ".class, msgs);";
  protected final String TEXT_1997 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_1998 = "((";
  protected final String TEXT_1999 = ")otherEnd, msgs);";
  protected final String TEXT_2000 = NL + "\t\t}";
  protected final String TEXT_2001 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2002 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2003 = NL + "\t}" + NL;
  protected final String TEXT_2004 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2005 = NL + "\t@Override";
  protected final String TEXT_2006 = NL + "\tpublic ";
  protected final String TEXT_2007 = " eInverseRemove(";
  protected final String TEXT_2008 = " otherEnd, int featureID, ";
  protected final String TEXT_2009 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2010 = ")" + NL + "\t\t{";
  protected final String TEXT_2011 = NL + "\t\t\tcase ";
  protected final String TEXT_2012 = ":";
  protected final String TEXT_2013 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2014 = ")((";
  protected final String TEXT_2015 = ".InternalMapView";
  protected final String TEXT_2016 = ")";
  protected final String TEXT_2017 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2018 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2019 = ")((";
  protected final String TEXT_2020 = ".Internal.Wrapper)";
  protected final String TEXT_2021 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2022 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2023 = ")";
  protected final String TEXT_2024 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2025 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_2026 = ", msgs);";
  protected final String TEXT_2027 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_2028 = "(msgs);";
  protected final String TEXT_2029 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2030 = "(null, msgs);";
  protected final String TEXT_2031 = NL + "\t\t}";
  protected final String TEXT_2032 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2033 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2034 = NL + "\t}" + NL;
  protected final String TEXT_2035 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2036 = NL + "\t@Override";
  protected final String TEXT_2037 = NL + "\tpublic ";
  protected final String TEXT_2038 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_2039 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID";
  protected final String TEXT_2040 = ")" + NL + "\t\t{";
  protected final String TEXT_2041 = NL + "\t\t\tcase ";
  protected final String TEXT_2042 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_2043 = ", ";
  protected final String TEXT_2044 = ".class, msgs);";
  protected final String TEXT_2045 = NL + "\t\t}";
  protected final String TEXT_2046 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_2047 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2048 = NL + "\t}" + NL;
  protected final String TEXT_2049 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2050 = NL + "\t@Override";
  protected final String TEXT_2051 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2052 = ")" + NL + "\t\t{";
  protected final String TEXT_2053 = NL + "\t\t\tcase ";
  protected final String TEXT_2054 = ":";
  protected final String TEXT_2055 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2056 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_2057 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_2058 = "(";
  protected final String TEXT_2059 = "());";
  protected final String TEXT_2060 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_2061 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2062 = "();";
  protected final String TEXT_2063 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2064 = ".InternalMapView";
  protected final String TEXT_2065 = ")";
  protected final String TEXT_2066 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2067 = "();";
  protected final String TEXT_2068 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2069 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2070 = "().map();";
  protected final String TEXT_2071 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2072 = ".Internal.Wrapper)";
  protected final String TEXT_2073 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2074 = "();";
  protected final String TEXT_2075 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2076 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_2077 = ".Internal)";
  protected final String TEXT_2078 = "()).getWrapper();";
  protected final String TEXT_2079 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2080 = "();";
  protected final String TEXT_2081 = NL + "\t\t}";
  protected final String TEXT_2082 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_2083 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_2084 = NL + "\t}" + NL;
  protected final String TEXT_2085 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2086 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2087 = NL + "\t@Override";
  protected final String TEXT_2088 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2089 = ")" + NL + "\t\t{";
  protected final String TEXT_2090 = NL + "\t\t\tcase ";
  protected final String TEXT_2091 = ":";
  protected final String TEXT_2092 = NL + "\t\t\t\t((";
  protected final String TEXT_2093 = ".Internal)((";
  protected final String TEXT_2094 = ".Internal.Wrapper)";
  protected final String TEXT_2095 = "()).featureMap()).set(newValue);";
  protected final String TEXT_2096 = NL + "\t\t\t\t((";
  protected final String TEXT_2097 = ".Internal)";
  protected final String TEXT_2098 = "()).set(newValue);";
  protected final String TEXT_2099 = NL + "\t\t\t\t((";
  protected final String TEXT_2100 = ".Setting)((";
  protected final String TEXT_2101 = ".InternalMapView";
  protected final String TEXT_2102 = ")";
  protected final String TEXT_2103 = "()).eMap()).set(newValue);";
  protected final String TEXT_2104 = NL + "\t\t\t\t((";
  protected final String TEXT_2105 = ".Setting)";
  protected final String TEXT_2106 = "()).set(newValue);";
  protected final String TEXT_2107 = NL + "\t\t\t\t";
  protected final String TEXT_2108 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_2109 = "().addAll((";
  protected final String TEXT_2110 = "<? extends ";
  protected final String TEXT_2111 = ">";
  protected final String TEXT_2112 = ")newValue);";
  protected final String TEXT_2113 = NL + "\t\t\t\tset";
  protected final String TEXT_2114 = "(((";
  protected final String TEXT_2115 = ")newValue).";
  protected final String TEXT_2116 = "());";
  protected final String TEXT_2117 = NL + "\t\t\t\tset";
  protected final String TEXT_2118 = "(";
  protected final String TEXT_2119 = "(";
  protected final String TEXT_2120 = ")";
  protected final String TEXT_2121 = "newValue);";
  protected final String TEXT_2122 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2123 = NL + "\t\t}";
  protected final String TEXT_2124 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_2125 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_2126 = NL + "\t}" + NL;
  protected final String TEXT_2127 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2128 = NL + "\t@Override";
  protected final String TEXT_2129 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2130 = ")" + NL + "\t\t{";
  protected final String TEXT_2131 = NL + "\t\t\tcase ";
  protected final String TEXT_2132 = ":";
  protected final String TEXT_2133 = NL + "\t\t\t\t((";
  protected final String TEXT_2134 = ".Internal.Wrapper)";
  protected final String TEXT_2135 = "()).featureMap().clear();";
  protected final String TEXT_2136 = NL + "\t\t\t\t";
  protected final String TEXT_2137 = "().clear();";
  protected final String TEXT_2138 = NL + "\t\t\t\tunset";
  protected final String TEXT_2139 = "();";
  protected final String TEXT_2140 = NL + "\t\t\t\tset";
  protected final String TEXT_2141 = "((";
  protected final String TEXT_2142 = ")null);";
  protected final String TEXT_2143 = NL + "\t\t\t\tset";
  protected final String TEXT_2144 = "(";
  protected final String TEXT_2145 = ");";
  protected final String TEXT_2146 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2147 = NL + "\t\t}";
  protected final String TEXT_2148 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_2149 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_2150 = NL + "\t}" + NL;
  protected final String TEXT_2151 = NL;
  protected final String TEXT_2152 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2153 = NL + "\t@Override";
  protected final String TEXT_2154 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_2155 = NL + "\t\t\tcase ";
  protected final String TEXT_2156 = ":";
  protected final String TEXT_2157 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2158 = "();";
  protected final String TEXT_2159 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_2160 = ".Internal.Wrapper)";
  protected final String TEXT_2161 = "()).featureMap().isEmpty();";
  protected final String TEXT_2162 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2163 = " != null && !";
  protected final String TEXT_2164 = ".featureMap().isEmpty();";
  protected final String TEXT_2165 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2166 = " != null && !";
  protected final String TEXT_2167 = ".isEmpty();";
  protected final String TEXT_2168 = NL + "\t\t\t\t";
  protected final String TEXT_2169 = " ";
  protected final String TEXT_2170 = " = (";
  protected final String TEXT_2171 = ")eVirtualGet(";
  protected final String TEXT_2172 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2173 = " != null && !";
  protected final String TEXT_2174 = ".isEmpty();";
  protected final String TEXT_2175 = NL + "\t\t\t\treturn !";
  protected final String TEXT_2176 = "().isEmpty();";
  protected final String TEXT_2177 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2178 = "();";
  protected final String TEXT_2179 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2180 = " != null;";
  protected final String TEXT_2181 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2182 = ") != null;";
  protected final String TEXT_2183 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2184 = "() != null;";
  protected final String TEXT_2185 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2186 = " != null;";
  protected final String TEXT_2187 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2188 = ") != null;";
  protected final String TEXT_2189 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2190 = "() != null;";
  protected final String TEXT_2191 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2192 = " & ";
  protected final String TEXT_2193 = "_EFLAG) != 0) != ";
  protected final String TEXT_2194 = ";";
  protected final String TEXT_2195 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2196 = " & ";
  protected final String TEXT_2197 = "_EFLAG) != ";
  protected final String TEXT_2198 = "_EFLAG_DEFAULT;";
  protected final String TEXT_2199 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2200 = " != ";
  protected final String TEXT_2201 = ";";
  protected final String TEXT_2202 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2203 = ", ";
  protected final String TEXT_2204 = ") != ";
  protected final String TEXT_2205 = ";";
  protected final String TEXT_2206 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2207 = "() != ";
  protected final String TEXT_2208 = ";";
  protected final String TEXT_2209 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2210 = " == null ? ";
  protected final String TEXT_2211 = " != null : !";
  protected final String TEXT_2212 = ".equals(";
  protected final String TEXT_2213 = ");";
  protected final String TEXT_2214 = NL + "\t\t\t\t";
  protected final String TEXT_2215 = " ";
  protected final String TEXT_2216 = " = (";
  protected final String TEXT_2217 = ")eVirtualGet(";
  protected final String TEXT_2218 = ", ";
  protected final String TEXT_2219 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2220 = " == null ? ";
  protected final String TEXT_2221 = " != null : !";
  protected final String TEXT_2222 = ".equals(";
  protected final String TEXT_2223 = ");";
  protected final String TEXT_2224 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2225 = " == null ? ";
  protected final String TEXT_2226 = "() != null : !";
  protected final String TEXT_2227 = ".equals(";
  protected final String TEXT_2228 = "());";
  protected final String TEXT_2229 = NL + "\t\t}";
  protected final String TEXT_2230 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2231 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2232 = NL + "\t}" + NL;
  protected final String TEXT_2233 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2234 = NL + "\t@Override";
  protected final String TEXT_2235 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2236 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2237 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2238 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_2239 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2240 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2241 = ": return ";
  protected final String TEXT_2242 = ";";
  protected final String TEXT_2243 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2244 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_2245 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2246 = NL + "\t@Override";
  protected final String TEXT_2247 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2248 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2249 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2250 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2251 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2252 = ": return ";
  protected final String TEXT_2253 = ";";
  protected final String TEXT_2254 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2255 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2256 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_2257 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2258 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2259 = ": return ";
  protected final String TEXT_2260 = ";";
  protected final String TEXT_2261 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2262 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2263 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2264 = NL + "\t@Override";
  protected final String TEXT_2265 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2266 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2267 = NL + "\t@Override";
  protected final String TEXT_2268 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2269 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2270 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2271 = NL + "\t@Override";
  protected final String TEXT_2272 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2273 = NL + "\t\t\tcase ";
  protected final String TEXT_2274 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2275 = ";";
  protected final String TEXT_2276 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2277 = NL + "\t@Override";
  protected final String TEXT_2278 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2279 = NL + "\t\t\tcase ";
  protected final String TEXT_2280 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2281 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2282 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2283 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2284 = NL + "\t@Override";
  protected final String TEXT_2285 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2286 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2287 = ": \");";
  protected final String TEXT_2288 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2289 = ": \");";
  protected final String TEXT_2290 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2291 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2292 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2293 = NL + "\t\tif (";
  protected final String TEXT_2294 = "(";
  protected final String TEXT_2295 = " & ";
  protected final String TEXT_2296 = "_ESETFLAG) != 0";
  protected final String TEXT_2297 = "ESet";
  protected final String TEXT_2298 = ") result.append((";
  protected final String TEXT_2299 = " & ";
  protected final String TEXT_2300 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2301 = NL + "\t\tif (";
  protected final String TEXT_2302 = "(";
  protected final String TEXT_2303 = " & ";
  protected final String TEXT_2304 = "_ESETFLAG) != 0";
  protected final String TEXT_2305 = "ESet";
  protected final String TEXT_2306 = ") result.append(";
  protected final String TEXT_2307 = "_EFLAG_VALUES[(";
  protected final String TEXT_2308 = " & ";
  protected final String TEXT_2309 = "_EFLAG) >>> ";
  protected final String TEXT_2310 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_2311 = NL + "\t\tif (";
  protected final String TEXT_2312 = "(";
  protected final String TEXT_2313 = " & ";
  protected final String TEXT_2314 = "_ESETFLAG) != 0";
  protected final String TEXT_2315 = "ESet";
  protected final String TEXT_2316 = ") result.append(";
  protected final String TEXT_2317 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2318 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2319 = ", ";
  protected final String TEXT_2320 = "));";
  protected final String TEXT_2321 = NL + "\t\tresult.append((";
  protected final String TEXT_2322 = " & ";
  protected final String TEXT_2323 = "_EFLAG) != 0);";
  protected final String TEXT_2324 = NL + "\t\tresult.append(";
  protected final String TEXT_2325 = "_EFLAG_VALUES[(";
  protected final String TEXT_2326 = " & ";
  protected final String TEXT_2327 = "_EFLAG) >>> ";
  protected final String TEXT_2328 = "_EFLAG_OFFSET]);";
  protected final String TEXT_2329 = NL + "\t\tresult.append(";
  protected final String TEXT_2330 = ");";
  protected final String TEXT_2331 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2332 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2333 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2334 = " getKey()" + NL + "\t{";
  protected final String TEXT_2335 = NL + "\t\treturn new ";
  protected final String TEXT_2336 = "(getTypedKey());";
  protected final String TEXT_2337 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2338 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2339 = " key)" + NL + "\t{";
  protected final String TEXT_2340 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2341 = "(";
  protected final String TEXT_2342 = ")";
  protected final String TEXT_2343 = "key);";
  protected final String TEXT_2344 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2345 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2346 = ")key).";
  protected final String TEXT_2347 = "());";
  protected final String TEXT_2348 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2349 = ")key);";
  protected final String TEXT_2350 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2351 = " getValue()" + NL + "\t{";
  protected final String TEXT_2352 = NL + "\t\treturn new ";
  protected final String TEXT_2353 = "(getTypedValue());";
  protected final String TEXT_2354 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2355 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2356 = " setValue(";
  protected final String TEXT_2357 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2358 = " oldValue = getValue();";
  protected final String TEXT_2359 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2360 = "(";
  protected final String TEXT_2361 = ")";
  protected final String TEXT_2362 = "value);";
  protected final String TEXT_2363 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2364 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2365 = ")value).";
  protected final String TEXT_2366 = "());";
  protected final String TEXT_2367 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2368 = ")value);";
  protected final String TEXT_2369 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2370 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2371 = NL + "\tpublic ";
  protected final String TEXT_2372 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2373 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2374 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2375 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2376 = " EOCL_ENV = ";
  protected final String TEXT_2377 = ".newInstance();" + NL;
  protected final String TEXT_2378 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2379 = " create(";
  protected final String TEXT_2380 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2381 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2382 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2383 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2384 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2385 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2386 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2387 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2388 = NL + "\t@Override";
  protected final String TEXT_2389 = NL + "\tprotected ";
  protected final String TEXT_2390 = " ";
  protected final String TEXT_2391 = "Helper(";
  protected final String TEXT_2392 = " ";
  protected final String TEXT_2393 = ")" + NL + "\t{";
  protected final String TEXT_2394 = NL + "\t\t";
  protected final String TEXT_2395 = ".addAll(super.";
  protected final String TEXT_2396 = "());";
  protected final String TEXT_2397 = NL + "\t\tsuper.";
  protected final String TEXT_2398 = "Helper(";
  protected final String TEXT_2399 = ");";
  protected final String TEXT_2400 = NL + "\t\tif (isSet";
  protected final String TEXT_2401 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2402 = "<";
  protected final String TEXT_2403 = ">";
  protected final String TEXT_2404 = " i = ((";
  protected final String TEXT_2405 = ") ";
  protected final String TEXT_2406 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2407 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2408 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2409 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2410 = "<";
  protected final String TEXT_2411 = ">";
  protected final String TEXT_2412 = " i = ((";
  protected final String TEXT_2413 = ") ";
  protected final String TEXT_2414 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2415 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2416 = NL + "\t\t";
  protected final String TEXT_2417 = " ";
  protected final String TEXT_2418 = " = ";
  protected final String TEXT_2419 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2420 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2421 = "<";
  protected final String TEXT_2422 = ">";
  protected final String TEXT_2423 = " i = ((";
  protected final String TEXT_2424 = ") ";
  protected final String TEXT_2425 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2426 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2427 = NL + "\t\tif (isSet";
  protected final String TEXT_2428 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2429 = ".addAll(";
  protected final String TEXT_2430 = "());" + NL + "\t\t}";
  protected final String TEXT_2431 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2432 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2433 = ".addAll(";
  protected final String TEXT_2434 = "());" + NL + "\t\t}";
  protected final String TEXT_2435 = NL + "\t\t";
  protected final String TEXT_2436 = " ";
  protected final String TEXT_2437 = " = ";
  protected final String TEXT_2438 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2439 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2440 = ".addAll(";
  protected final String TEXT_2441 = ");" + NL + "\t\t}";
  protected final String TEXT_2442 = NL + "\t\tif (isSet";
  protected final String TEXT_2443 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2444 = ".add(";
  protected final String TEXT_2445 = "basicGet";
  protected final String TEXT_2446 = "());" + NL + "\t\t}";
  protected final String TEXT_2447 = NL + "\t\t";
  protected final String TEXT_2448 = " ";
  protected final String TEXT_2449 = " = ";
  protected final String TEXT_2450 = "basicGet";
  protected final String TEXT_2451 = "();" + NL + "\t\tif (";
  protected final String TEXT_2452 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2453 = ".add(";
  protected final String TEXT_2454 = ");" + NL + "\t\t}";
  protected final String TEXT_2455 = NL + "\t\treturn ";
  protected final String TEXT_2456 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2457 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2458 = NL + "\t@Override";
  protected final String TEXT_2459 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2460 = "()" + NL + "\t{";
  protected final String TEXT_2461 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2462 = "()";
  protected final String TEXT_2463 = NL + "\t\treturn isSet";
  protected final String TEXT_2464 = "()";
  protected final String TEXT_2465 = ";";
  protected final String TEXT_2466 = NL + "\t\treturn !";
  protected final String TEXT_2467 = "().isEmpty()";
  protected final String TEXT_2468 = ";";
  protected final String TEXT_2469 = NL + "\t\treturn ";
  protected final String TEXT_2470 = "basicGet";
  protected final String TEXT_2471 = "() != null";
  protected final String TEXT_2472 = ";";
  protected final String TEXT_2473 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2474 = ")";
  protected final String TEXT_2475 = ";";
  protected final String TEXT_2476 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2477 = "()";
  protected final String TEXT_2478 = ";";
  protected final String TEXT_2479 = NL + "\t\t\t|| !";
  protected final String TEXT_2480 = "().isEmpty()";
  protected final String TEXT_2481 = ";";
  protected final String TEXT_2482 = NL + "\t\t\t|| ";
  protected final String TEXT_2483 = "basicGet";
  protected final String TEXT_2484 = "() != null";
  protected final String TEXT_2485 = ";";
  protected final String TEXT_2486 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2487 = ")";
  protected final String TEXT_2488 = ";";
  protected final String TEXT_2489 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2490 = "();";
  protected final String TEXT_2491 = NL + "\t\treturn false;";
  protected final String TEXT_2492 = NL + "\t}" + NL;
  protected final String TEXT_2493 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2494 = NL + "\t@Override";
  protected final String TEXT_2495 = NL + "\tpublic ";
  protected final String TEXT_2496 = " ";
  protected final String TEXT_2497 = "()" + NL + "\t{";
  protected final String TEXT_2498 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2499 = " ";
  protected final String TEXT_2500 = " = (";
  protected final String TEXT_2501 = ")((";
  protected final String TEXT_2502 = ")";
  protected final String TEXT_2503 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2504 = ";";
  protected final String TEXT_2505 = NL + "\t\treturn ";
  protected final String TEXT_2506 = "();";
  protected final String TEXT_2507 = NL + "\t\treturn new ";
  protected final String TEXT_2508 = ".UnmodifiableEList";
  protected final String TEXT_2509 = "(this, ";
  protected final String TEXT_2510 = "null";
  protected final String TEXT_2511 = ", 0, ";
  protected final String TEXT_2512 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2513 = NL + "\t\treturn null;";
  protected final String TEXT_2514 = NL + "\t\treturn ";
  protected final String TEXT_2515 = "();";
  protected final String TEXT_2516 = NL + "\t}" + NL;
  protected final String TEXT_2517 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2518 = NL + "\t@Override";
  protected final String TEXT_2519 = NL + "\tpublic ";
  protected final String TEXT_2520 = " basicGet";
  protected final String TEXT_2521 = "()" + NL + "\t{";
  protected final String TEXT_2522 = NL + "\t\treturn null;";
  protected final String TEXT_2523 = NL + "\t\treturn ";
  protected final String TEXT_2524 = "basicGet";
  protected final String TEXT_2525 = "();";
  protected final String TEXT_2526 = NL + "\t}" + NL;
  protected final String TEXT_2527 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2528 = NL + "\t@Override";
  protected final String TEXT_2529 = NL + "\tpublic ";
  protected final String TEXT_2530 = " basicSet";
  protected final String TEXT_2531 = "(";
  protected final String TEXT_2532 = " new";
  protected final String TEXT_2533 = ", ";
  protected final String TEXT_2534 = " msgs)" + NL + "\t{";
  protected final String TEXT_2535 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2536 = NL + "\t\tif (new";
  protected final String TEXT_2537 = " != null && !(new";
  protected final String TEXT_2538 = " instanceof ";
  protected final String TEXT_2539 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2540 = "));" + NL + "\t\t}";
  protected final String TEXT_2541 = NL + "\t\treturn basicSet";
  protected final String TEXT_2542 = "(";
  protected final String TEXT_2543 = "(";
  protected final String TEXT_2544 = ") ";
  protected final String TEXT_2545 = "new";
  protected final String TEXT_2546 = ", msgs);";
  protected final String TEXT_2547 = NL + "\t\tset";
  protected final String TEXT_2548 = "(";
  protected final String TEXT_2549 = "(";
  protected final String TEXT_2550 = ") ";
  protected final String TEXT_2551 = "new";
  protected final String TEXT_2552 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2553 = NL + "\t}" + NL;
  protected final String TEXT_2554 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2555 = NL + "\t@Override";
  protected final String TEXT_2556 = NL + "\tpublic void set";
  protected final String TEXT_2557 = "(";
  protected final String TEXT_2558 = " new";
  protected final String TEXT_2559 = ")" + NL + "\t{";
  protected final String TEXT_2560 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2561 = NL + "\t\tif (new";
  protected final String TEXT_2562 = " != null && !(new";
  protected final String TEXT_2563 = " instanceof ";
  protected final String TEXT_2564 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2565 = "));" + NL + "\t\t}";
  protected final String TEXT_2566 = NL + "\t\tset";
  protected final String TEXT_2567 = "(";
  protected final String TEXT_2568 = "(";
  protected final String TEXT_2569 = ") ";
  protected final String TEXT_2570 = "new";
  protected final String TEXT_2571 = ");";
  protected final String TEXT_2572 = NL + "\t}" + NL;
  protected final String TEXT_2573 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2574 = "() <em>";
  protected final String TEXT_2575 = "</em>}' ";
  protected final String TEXT_2576 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2577 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2578 = "_ESUBSETS = ";
  protected final String TEXT_2579 = ";" + NL;
  protected final String TEXT_2580 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2581 = "() <em>";
  protected final String TEXT_2582 = "</em>}' ";
  protected final String TEXT_2583 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2584 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2585 = "_ESUPERSETS = ";
  protected final String TEXT_2586 = ";" + NL;
  protected final String TEXT_2587 = NL + "\t/**";
  protected final String TEXT_2588 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2589 = "}, with the specified ";
  protected final String TEXT_2590 = ", and appends it to the '<em><b>";
  protected final String TEXT_2591 = "</b></em>' ";
  protected final String TEXT_2592 = ".";
  protected final String TEXT_2593 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2594 = "}, with the specified ";
  protected final String TEXT_2595 = ", and sets the '<em><b>";
  protected final String TEXT_2596 = "</b></em>' ";
  protected final String TEXT_2597 = ".";
  protected final String TEXT_2598 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2599 = "} and appends it to the '<em><b>";
  protected final String TEXT_2600 = "</b></em>' ";
  protected final String TEXT_2601 = ".";
  protected final String TEXT_2602 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2603 = "} and sets the '<em><b>";
  protected final String TEXT_2604 = "</b></em>' ";
  protected final String TEXT_2605 = ".";
  protected final String TEXT_2606 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2607 = NL + "\t * @param ";
  protected final String TEXT_2608 = " The ";
  protected final String TEXT_2609 = " for the new {@link ";
  protected final String TEXT_2610 = "}, or <code>null</code>.";
  protected final String TEXT_2611 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2612 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2613 = "}." + NL + "\t * @see #";
  protected final String TEXT_2614 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2615 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2616 = NL + "\t";
  protected final String TEXT_2617 = " create";
  protected final String TEXT_2618 = "(";
  protected final String TEXT_2619 = ", ";
  protected final String TEXT_2620 = " eClass);" + NL;
  protected final String TEXT_2621 = NL + "\t@Override";
  protected final String TEXT_2622 = NL + "\tpublic ";
  protected final String TEXT_2623 = " create";
  protected final String TEXT_2624 = "(";
  protected final String TEXT_2625 = ", ";
  protected final String TEXT_2626 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2627 = " new";
  protected final String TEXT_2628 = " = (";
  protected final String TEXT_2629 = ") create(eClass);";
  protected final String TEXT_2630 = NL + "\t\t";
  protected final String TEXT_2631 = "().add(new";
  protected final String TEXT_2632 = ");";
  protected final String TEXT_2633 = NL + "\t\tset";
  protected final String TEXT_2634 = "(new";
  protected final String TEXT_2635 = ");";
  protected final String TEXT_2636 = NL + "\t\tint ";
  protected final String TEXT_2637 = "ListSize = 0;";
  protected final String TEXT_2638 = NL + "\t\tint ";
  protected final String TEXT_2639 = "Size = ";
  protected final String TEXT_2640 = " == null ? 0 : ";
  protected final String TEXT_2641 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2642 = "Size > ";
  protected final String TEXT_2643 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2644 = "ListSize = ";
  protected final String TEXT_2645 = "Size;";
  protected final String TEXT_2646 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2647 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2648 = ".create";
  protected final String TEXT_2649 = "(";
  protected final String TEXT_2650 = ", ";
  protected final String TEXT_2651 = "i < ";
  protected final String TEXT_2652 = "Size ? (";
  protected final String TEXT_2653 = ") ";
  protected final String TEXT_2654 = ".get(i) : null";
  protected final String TEXT_2655 = ");" + NL + "\t\t}";
  protected final String TEXT_2656 = NL + "\t\tnew";
  protected final String TEXT_2657 = ".create";
  protected final String TEXT_2658 = "(";
  protected final String TEXT_2659 = ", ";
  protected final String TEXT_2660 = ");";
  protected final String TEXT_2661 = NL + "\t\tif (";
  protected final String TEXT_2662 = " != null)";
  protected final String TEXT_2663 = NL + "\t\t\tnew";
  protected final String TEXT_2664 = ".";
  protected final String TEXT_2665 = "().addAll(";
  protected final String TEXT_2666 = ");";
  protected final String TEXT_2667 = NL + "\t\t\tnew";
  protected final String TEXT_2668 = ".set";
  protected final String TEXT_2669 = "(";
  protected final String TEXT_2670 = ");";
  protected final String TEXT_2671 = NL + "\t\treturn new";
  protected final String TEXT_2672 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2673 = NL + "\t/**";
  protected final String TEXT_2674 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2675 = "}, with the specified ";
  protected final String TEXT_2676 = ", and appends it to the '<em><b>";
  protected final String TEXT_2677 = "</b></em>' ";
  protected final String TEXT_2678 = ".";
  protected final String TEXT_2679 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2680 = "},with the specified ";
  protected final String TEXT_2681 = ", and sets the '<em><b>";
  protected final String TEXT_2682 = "</b></em>' ";
  protected final String TEXT_2683 = ".";
  protected final String TEXT_2684 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2685 = "} and appends it to the '<em><b>";
  protected final String TEXT_2686 = "</b></em>' ";
  protected final String TEXT_2687 = ".";
  protected final String TEXT_2688 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2689 = "} and sets the '<em><b>";
  protected final String TEXT_2690 = "</b></em>' ";
  protected final String TEXT_2691 = ".";
  protected final String TEXT_2692 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2693 = NL + "\t * @param ";
  protected final String TEXT_2694 = " The ";
  protected final String TEXT_2695 = " for the new {@link ";
  protected final String TEXT_2696 = "}, or <code>null</code>.";
  protected final String TEXT_2697 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2698 = "}." + NL + "\t * @see #";
  protected final String TEXT_2699 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2700 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2701 = NL + "\t";
  protected final String TEXT_2702 = " create";
  protected final String TEXT_2703 = "(";
  protected final String TEXT_2704 = ");" + NL;
  protected final String TEXT_2705 = NL + "\t@Override";
  protected final String TEXT_2706 = NL + "\tpublic ";
  protected final String TEXT_2707 = " create";
  protected final String TEXT_2708 = "(";
  protected final String TEXT_2709 = ")" + NL + "\t{";
  protected final String TEXT_2710 = NL + "\t\treturn create";
  protected final String TEXT_2711 = "(";
  protected final String TEXT_2712 = ", ";
  protected final String TEXT_2713 = ");";
  protected final String TEXT_2714 = NL + "\t\t";
  protected final String TEXT_2715 = " new";
  protected final String TEXT_2716 = " = (";
  protected final String TEXT_2717 = ") create(";
  protected final String TEXT_2718 = ");";
  protected final String TEXT_2719 = NL + "\t\t";
  protected final String TEXT_2720 = "().add(new";
  protected final String TEXT_2721 = ");";
  protected final String TEXT_2722 = NL + "\t\tset";
  protected final String TEXT_2723 = "(new";
  protected final String TEXT_2724 = ");";
  protected final String TEXT_2725 = NL + "\t\tint ";
  protected final String TEXT_2726 = "ListSize = 0;";
  protected final String TEXT_2727 = NL + "\t\tint ";
  protected final String TEXT_2728 = "Size = ";
  protected final String TEXT_2729 = " == null ? 0 : ";
  protected final String TEXT_2730 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2731 = "Size > ";
  protected final String TEXT_2732 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2733 = "ListSize = ";
  protected final String TEXT_2734 = "Size;";
  protected final String TEXT_2735 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2736 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2737 = ".create";
  protected final String TEXT_2738 = "(";
  protected final String TEXT_2739 = ", ";
  protected final String TEXT_2740 = "i < ";
  protected final String TEXT_2741 = "Size ? (";
  protected final String TEXT_2742 = ") ";
  protected final String TEXT_2743 = ".get(i) : null";
  protected final String TEXT_2744 = ");" + NL + "\t\t}";
  protected final String TEXT_2745 = NL + "\t\tnew";
  protected final String TEXT_2746 = ".create";
  protected final String TEXT_2747 = "(";
  protected final String TEXT_2748 = ", ";
  protected final String TEXT_2749 = ");";
  protected final String TEXT_2750 = NL + "\t\tif (";
  protected final String TEXT_2751 = " != null)";
  protected final String TEXT_2752 = NL + "\t\t\tnew";
  protected final String TEXT_2753 = ".";
  protected final String TEXT_2754 = "().addAll(";
  protected final String TEXT_2755 = ");";
  protected final String TEXT_2756 = NL + "\t\t\tnew";
  protected final String TEXT_2757 = ".set";
  protected final String TEXT_2758 = "(";
  protected final String TEXT_2759 = ");";
  protected final String TEXT_2760 = NL + "\t\treturn new";
  protected final String TEXT_2761 = ";";
  protected final String TEXT_2762 = NL + "\t}" + NL;
  protected final String TEXT_2763 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2764 = "} with the specified ";
  protected final String TEXT_2765 = " from the '<em><b>";
  protected final String TEXT_2766 = "</b></em>' ";
  protected final String TEXT_2767 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2768 = NL + "\t * @param ";
  protected final String TEXT_2769 = " The ";
  protected final String TEXT_2770 = " of the {@link ";
  protected final String TEXT_2771 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2772 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2773 = "} with the specified ";
  protected final String TEXT_2774 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2775 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2776 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2777 = NL + "\t";
  protected final String TEXT_2778 = " get";
  protected final String TEXT_2779 = "(";
  protected final String TEXT_2780 = ");" + NL;
  protected final String TEXT_2781 = NL + "\t@Override";
  protected final String TEXT_2782 = NL + "\tpublic ";
  protected final String TEXT_2783 = " get";
  protected final String TEXT_2784 = "(";
  protected final String TEXT_2785 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2786 = "(";
  protected final String TEXT_2787 = ", false";
  protected final String TEXT_2788 = ", null";
  protected final String TEXT_2789 = ", false";
  protected final String TEXT_2790 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2791 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2792 = "} with the specified ";
  protected final String TEXT_2793 = " from the '<em><b>";
  protected final String TEXT_2794 = "</b></em>' ";
  protected final String TEXT_2795 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2796 = NL + "\t * @param ";
  protected final String TEXT_2797 = " The ";
  protected final String TEXT_2798 = " of the {@link ";
  protected final String TEXT_2799 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2800 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2801 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2802 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2803 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2804 = "} on demand if not found.";
  protected final String TEXT_2805 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2806 = "} with the specified ";
  protected final String TEXT_2807 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2808 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2809 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2810 = NL + "\t";
  protected final String TEXT_2811 = " get";
  protected final String TEXT_2812 = "(";
  protected final String TEXT_2813 = ", boolean ignoreCase";
  protected final String TEXT_2814 = ", ";
  protected final String TEXT_2815 = " eClass";
  protected final String TEXT_2816 = ", boolean createOnDemand";
  protected final String TEXT_2817 = ");" + NL;
  protected final String TEXT_2818 = NL + "\t@Override";
  protected final String TEXT_2819 = NL + "\tpublic ";
  protected final String TEXT_2820 = " get";
  protected final String TEXT_2821 = "(";
  protected final String TEXT_2822 = ", boolean ignoreCase";
  protected final String TEXT_2823 = ", ";
  protected final String TEXT_2824 = " eClass";
  protected final String TEXT_2825 = ", boolean createOnDemand";
  protected final String TEXT_2826 = ")" + NL + "\t{";
  protected final String TEXT_2827 = NL + "\t\t";
  protected final String TEXT_2828 = "Loop: for (";
  protected final String TEXT_2829 = " ";
  protected final String TEXT_2830 = " : ";
  protected final String TEXT_2831 = "())" + NL + "\t\t{";
  protected final String TEXT_2832 = NL + "\t\t";
  protected final String TEXT_2833 = "Loop: for (";
  protected final String TEXT_2834 = " i = ";
  protected final String TEXT_2835 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2836 = " ";
  protected final String TEXT_2837 = " = (";
  protected final String TEXT_2838 = ") i.next();";
  protected final String TEXT_2839 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2840 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2841 = "Loop;";
  protected final String TEXT_2842 = NL + "\t\t\t";
  protected final String TEXT_2843 = " ";
  protected final String TEXT_2844 = "List = ";
  protected final String TEXT_2845 = ".";
  protected final String TEXT_2846 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2847 = "ListSize = ";
  protected final String TEXT_2848 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2849 = " || (";
  protected final String TEXT_2850 = " != null && ";
  protected final String TEXT_2851 = ".size() != ";
  protected final String TEXT_2852 = "ListSize";
  protected final String TEXT_2853 = ")";
  protected final String TEXT_2854 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2855 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2856 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2857 = " ";
  protected final String TEXT_2858 = " = ";
  protected final String TEXT_2859 = "(";
  protected final String TEXT_2860 = ") ";
  protected final String TEXT_2861 = "List.get(j);";
  protected final String TEXT_2862 = NL + "\t\t\t\tif (";
  protected final String TEXT_2863 = " != null && !(ignoreCase ? (";
  protected final String TEXT_2864 = "(";
  protected final String TEXT_2865 = ")";
  protected final String TEXT_2866 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2867 = ".";
  protected final String TEXT_2868 = "()) : ";
  protected final String TEXT_2869 = ".get(j).equals(";
  protected final String TEXT_2870 = ".";
  protected final String TEXT_2871 = "())))";
  protected final String TEXT_2872 = NL + "\t\t\t\tif (";
  protected final String TEXT_2873 = " != null && !";
  protected final String TEXT_2874 = ".get(j).equals(";
  protected final String TEXT_2875 = ".";
  protected final String TEXT_2876 = "()))";
  protected final String TEXT_2877 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2878 = "Loop;";
  protected final String TEXT_2879 = NL + "\t\t\t}";
  protected final String TEXT_2880 = NL + "\t\t\t";
  protected final String TEXT_2881 = " ";
  protected final String TEXT_2882 = " = ";
  protected final String TEXT_2883 = ".";
  protected final String TEXT_2884 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2885 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2886 = "Loop;";
  protected final String TEXT_2887 = NL + "\t\t\tif (";
  protected final String TEXT_2888 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2889 = ".equalsIgnoreCase(";
  protected final String TEXT_2890 = ".";
  protected final String TEXT_2891 = "()) : ";
  protected final String TEXT_2892 = ".equals(";
  protected final String TEXT_2893 = ".";
  protected final String TEXT_2894 = "())))";
  protected final String TEXT_2895 = NL + "\t\t\tif (";
  protected final String TEXT_2896 = " != null && !";
  protected final String TEXT_2897 = ".equals(";
  protected final String TEXT_2898 = ".";
  protected final String TEXT_2899 = "()))";
  protected final String TEXT_2900 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2901 = "Loop;";
  protected final String TEXT_2902 = NL + "\t\t\tif (";
  protected final String TEXT_2903 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2904 = ".equalsIgnoreCase(";
  protected final String TEXT_2905 = ".";
  protected final String TEXT_2906 = "()) : ";
  protected final String TEXT_2907 = ".equals(";
  protected final String TEXT_2908 = ".";
  protected final String TEXT_2909 = "())))";
  protected final String TEXT_2910 = NL + "\t\t\tif (";
  protected final String TEXT_2911 = " != null && !";
  protected final String TEXT_2912 = ".equals(";
  protected final String TEXT_2913 = ".";
  protected final String TEXT_2914 = "()))";
  protected final String TEXT_2915 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2916 = "Loop;";
  protected final String TEXT_2917 = NL + "\t\t\treturn ";
  protected final String TEXT_2918 = ";" + NL + "\t\t}";
  protected final String TEXT_2919 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2920 = " && eClass != null";
  protected final String TEXT_2921 = " ? create";
  protected final String TEXT_2922 = "(";
  protected final String TEXT_2923 = ", eClass";
  protected final String TEXT_2924 = ") : null;";
  protected final String TEXT_2925 = NL + "\t\treturn null;";
  protected final String TEXT_2926 = NL + "\t}" + NL;
  protected final String TEXT_2927 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_2928 = "()" + NL + "\t{";
  protected final String TEXT_2929 = NL + "  \t\treturn false;";
  protected final String TEXT_2930 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2931 = ");";
  protected final String TEXT_2932 = NL + "\t\treturn !((";
  protected final String TEXT_2933 = ".Internal.Wrapper)";
  protected final String TEXT_2934 = "()).featureMap().isEmpty();";
  protected final String TEXT_2935 = NL + "\t\treturn ";
  protected final String TEXT_2936 = " != null && !";
  protected final String TEXT_2937 = ".featureMap().isEmpty();";
  protected final String TEXT_2938 = NL + "\t\treturn ";
  protected final String TEXT_2939 = " != null && !";
  protected final String TEXT_2940 = ".isEmpty();";
  protected final String TEXT_2941 = NL + "\t\t";
  protected final String TEXT_2942 = " ";
  protected final String TEXT_2943 = " = (";
  protected final String TEXT_2944 = ")eVirtualGet(";
  protected final String TEXT_2945 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2946 = " != null && !";
  protected final String TEXT_2947 = ".isEmpty();";
  protected final String TEXT_2948 = NL + "\t\treturn !";
  protected final String TEXT_2949 = "().isEmpty();";
  protected final String TEXT_2950 = NL + "\t\treturn ";
  protected final String TEXT_2951 = " != null;";
  protected final String TEXT_2952 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2953 = ") != null;";
  protected final String TEXT_2954 = NL + "\t\treturn basicGet";
  protected final String TEXT_2955 = "() != null;";
  protected final String TEXT_2956 = NL + "\t\treturn ";
  protected final String TEXT_2957 = " != null;";
  protected final String TEXT_2958 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2959 = ") != null;";
  protected final String TEXT_2960 = NL + "\t\treturn ";
  protected final String TEXT_2961 = "() != null;";
  protected final String TEXT_2962 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2963 = " & ";
  protected final String TEXT_2964 = "_EFLAG) != 0) != ";
  protected final String TEXT_2965 = ";";
  protected final String TEXT_2966 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2967 = " & ";
  protected final String TEXT_2968 = "_EFLAG) != ";
  protected final String TEXT_2969 = "_EFLAG_DEFAULT;";
  protected final String TEXT_2970 = NL + "\t\treturn ";
  protected final String TEXT_2971 = " != ";
  protected final String TEXT_2972 = ";";
  protected final String TEXT_2973 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_2974 = ", ";
  protected final String TEXT_2975 = ") != ";
  protected final String TEXT_2976 = ";";
  protected final String TEXT_2977 = NL + "\t\treturn ";
  protected final String TEXT_2978 = "() != ";
  protected final String TEXT_2979 = ";";
  protected final String TEXT_2980 = NL + "\t\treturn ";
  protected final String TEXT_2981 = " == null ? ";
  protected final String TEXT_2982 = " != null : !";
  protected final String TEXT_2983 = ".equals(";
  protected final String TEXT_2984 = ");";
  protected final String TEXT_2985 = NL + "\t\t";
  protected final String TEXT_2986 = " ";
  protected final String TEXT_2987 = " = (";
  protected final String TEXT_2988 = ")eVirtualGet(";
  protected final String TEXT_2989 = ", ";
  protected final String TEXT_2990 = ");" + NL + "\t\treturn ";
  protected final String TEXT_2991 = " == null ? ";
  protected final String TEXT_2992 = " != null : !";
  protected final String TEXT_2993 = ".equals(";
  protected final String TEXT_2994 = ");";
  protected final String TEXT_2995 = NL + "\t\treturn ";
  protected final String TEXT_2996 = " == null ? ";
  protected final String TEXT_2997 = "() != null : !";
  protected final String TEXT_2998 = ".equals(";
  protected final String TEXT_2999 = "());";
  protected final String TEXT_3000 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3001 = ");";
  protected final String TEXT_3002 = NL + "\t\t";
  protected final String TEXT_3003 = " ";
  protected final String TEXT_3004 = " = (";
  protected final String TEXT_3005 = ")eVirtualGet(";
  protected final String TEXT_3006 = ");";
  protected final String TEXT_3007 = NL + "\t\treturn ";
  protected final String TEXT_3008 = " != null && ((";
  protected final String TEXT_3009 = ".Unsettable";
  protected final String TEXT_3010 = ")";
  protected final String TEXT_3011 = ").isSet();";
  protected final String TEXT_3012 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_3013 = ");";
  protected final String TEXT_3014 = NL + "\t\treturn (";
  protected final String TEXT_3015 = " & ";
  protected final String TEXT_3016 = "_ESETFLAG) != 0;";
  protected final String TEXT_3017 = NL + "\t\treturn ";
  protected final String TEXT_3018 = "ESet;";
  protected final String TEXT_3019 = NL + "\t\treturn !((";
  protected final String TEXT_3020 = ".Internal)((";
  protected final String TEXT_3021 = ".Internal.Wrapper)get";
  protected final String TEXT_3022 = "()).featureMap()).isEmpty(";
  protected final String TEXT_3023 = ");";
  protected final String TEXT_3024 = NL + "\t\treturn !((";
  protected final String TEXT_3025 = ".Internal)get";
  protected final String TEXT_3026 = "()).isEmpty(";
  protected final String TEXT_3027 = ");";
  protected final String TEXT_3028 = NL + "\t\treturn ";
  protected final String TEXT_3029 = ".";
  protected final String TEXT_3030 = "(this);";
  protected final String TEXT_3031 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_3032 = "' ";
  protected final String TEXT_3033 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3034 = NL + "\t}" + NL;
  protected final String TEXT_3035 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3036 = NL + "\t@Override";
  protected final String TEXT_3037 = NL + "\tpublic ";
  protected final String TEXT_3038 = " ";
  protected final String TEXT_3039 = "(";
  protected final String TEXT_3040 = ")";
  protected final String TEXT_3041 = NL + "\t{";
  protected final String TEXT_3042 = NL + "\t\t";
  protected final String TEXT_3043 = "(";
  protected final String TEXT_3044 = ");";
  protected final String TEXT_3045 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3046 = NL + "\t\treturn ";
  protected final String TEXT_3047 = "(";
  protected final String TEXT_3048 = ");";
  protected final String TEXT_3049 = NL + "\t}" + NL;
  protected final String TEXT_3050 = NL + "} //";
  protected final String TEXT_3051 = NL;

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
    if (genClass.isFlag(genFeature)) { int flagIndex = genClass.getFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_94);
    }
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(flagIndex % 32);
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_104);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_105);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_107);
    }
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getTypeGenClassifier().getFormattedName());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_113);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_114);
    } else {
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_119);
    }
    stringBuffer.append(TEXT_120);
    }
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genClass.getFlagSize(genFeature) > 1 ? "s" : "");
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genClass.getFlagMask(genFeature));
    stringBuffer.append(TEXT_128);
    if (genFeature.isEnumType()) {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_129);
    } else {
    stringBuffer.append(flagIndex % 32);
    }
    stringBuffer.append(TEXT_130);
    } else {
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_138);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) { int flagIndex = genClass.getESetFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_140);
    }
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(flagIndex % 32 );
    stringBuffer.append(TEXT_145);
    } else {
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_149);
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genClass.getOffsetCorrectionField(null));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genClass.getQualifiedFeatureID(genClass.getImplementedGenFeatures().get(0)));
    stringBuffer.append(TEXT_154);
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genClass.getOffsetCorrectionField(genFeature));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(reverseFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_159);
    }
    }
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_160);
    if (genModel.isPublicConstructors()) {
    stringBuffer.append(TEXT_161);
    } else {
    stringBuffer.append(TEXT_162);
    }
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_164);
    for (GenFeature genFeature : genClass.getFlagGenFeaturesWithDefault()) {
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_167);
    if (!genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_168);
    }
    stringBuffer.append(TEXT_169);
    }
    stringBuffer.append(TEXT_170);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_171);
    }
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_174);
    }
    if (isImplementation && genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL && (genClass.getClassExtendsGenClass() == null || genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL)) {
    stringBuffer.append(TEXT_175);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_176);
    }
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_178);
    }
    //Class/reflectiveDelegation.override.javajetinc
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_179);
    if (!isImplementation) {
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_182);
    } else {
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_183);
    }
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_186);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_190);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_192);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_193);
    } else {
    stringBuffer.append(TEXT_194);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_196);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_197);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_198);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_202);
    }
    stringBuffer.append(TEXT_203);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_204);
    }
    stringBuffer.append(TEXT_205);
    if (!isImplementation) {
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_208);
    } else {
    stringBuffer.append(TEXT_209);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_211);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_213);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_214);
    }
    stringBuffer.append(TEXT_215);
    if (!isImplementation) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_217);
    } else {
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_219);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_221);
    } else {
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_224);
    }
    stringBuffer.append(TEXT_225);
    }
    stringBuffer.append(TEXT_226);
    if (!isImplementation) {
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_230);
    } else {
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_238);
    }
    stringBuffer.append(TEXT_239);
    if (!isImplementation) {
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_242);
    } else {
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_246);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_249);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_250);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_251);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_252);
    } else {
    stringBuffer.append(TEXT_253);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_254);
    }
    stringBuffer.append(TEXT_255);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_256);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_257);
    } else {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_259);
    }
    stringBuffer.append(TEXT_260);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

    stringBuffer.append(TEXT_261);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_262);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_263);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_265);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_267);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_268);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_270);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_271);
    }
    }
    if (!UML2GenModelUtil.getSubsettedGenFeatures(genFeature).isEmpty()) {
    stringBuffer.append(TEXT_272);
    for (GenFeature subsettedGenFeature : UML2GenModelUtil.getSubsettedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_273);
    stringBuffer.append(subsettedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_274);
    stringBuffer.append(subsettedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_275);
    stringBuffer.append(subsettedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_276);
    }
    stringBuffer.append(TEXT_277);
    }if (UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_278);
    for (GenFeature redefinedGenFeature : UML2GenModelUtil.getRedefinedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_279);
    stringBuffer.append(redefinedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_280);
    stringBuffer.append(redefinedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_281);
    stringBuffer.append(redefinedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_282);
    }
    stringBuffer.append(TEXT_283);
    }if(genFeature.isDerived() && UML2GenModelUtil.isUnion(genFeature)){
    stringBuffer.append(TEXT_284);
    }
    stringBuffer.append(TEXT_285);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_286);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_288);
    }
    stringBuffer.append(TEXT_289);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_291);
    }
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_294);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_297);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_299);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_302);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_305);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_306);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_307);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_308);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_309);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_310);
    }}
    stringBuffer.append(TEXT_311);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_312);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_313);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_316);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !genModel.isReflectiveDelegation() && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature())) {
    stringBuffer.append(TEXT_317);
    }
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_320);
    }
    stringBuffer.append(TEXT_321);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_322);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_323);
    }
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_326);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_328);
    }
    stringBuffer.append(TEXT_329);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_334);
    }
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_336);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_340);
    } else {
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_343);
    }
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_345);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_348);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_354);
    }
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_356);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_366);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_367);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_371);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_375);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_378);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_379);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_380);
    }
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_382);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_385);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_387);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_388);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_389);
    }
    stringBuffer.append(TEXT_390);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_393);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_399);
    }
    stringBuffer.append(TEXT_400);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_404);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_407);
    } else {
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_412);
    }
    } else {
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_414);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_424);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_428);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_429);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_431);
    } else {
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_433);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_434);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_436);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_438);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_440);
    } else {
    stringBuffer.append(TEXT_441);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_443);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_444);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_445);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_447);
    }
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_449);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_451);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_453);
    }
    stringBuffer.append(TEXT_454);
    } else {
    stringBuffer.append(TEXT_455);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_456);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_458);
    }
    stringBuffer.append(TEXT_459);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_461);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_463);
    }
    stringBuffer.append(TEXT_464);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_467);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_468);
    }
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_471);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_472);
    }
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_474);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_475);
    }
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_477);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_479);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_481);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_482);
    }
    stringBuffer.append(TEXT_483);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_485);
    }
    stringBuffer.append(TEXT_486);
    }
    stringBuffer.append(TEXT_487);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_489);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_492);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_493);
    }
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_503);
    }
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_505);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_507);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_511);
    }
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_521);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_522);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_525);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_526);
    }
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_534);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_538);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_539);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_541);
    }
    stringBuffer.append(TEXT_542);
    }
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_547);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_548);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_549);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_550);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_551);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_552);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_554);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_555);
    } else {
    stringBuffer.append(TEXT_556);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_557);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_558);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_559);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_560);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_561);
    }
    }
    }
    }
    stringBuffer.append(TEXT_562);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_564);
    } else {
    stringBuffer.append(TEXT_565);
    }
    stringBuffer.append(TEXT_566);
    }
    } else {
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_569);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_570);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_571);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_572);
    }
    }
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_575);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_578);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_581);
    } else {
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_583);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_586);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_588);
    } else {
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_590);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_592);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_593);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_595);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_596);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_597);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_598);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_599);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_601);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_602);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_603);
    } else {
    stringBuffer.append(TEXT_604);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_605);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_606);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_608);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_609);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_610);
    }
    }
    }
    }
    stringBuffer.append(TEXT_611);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_612);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_613);
    } else {
    stringBuffer.append(TEXT_614);
    }
    stringBuffer.append(TEXT_615);
    } else {
    stringBuffer.append(TEXT_616);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_618);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_619);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_620);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_621);
    }
    }
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_627);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_631);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_632);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_633);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_634);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_635);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_637);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_638);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_640);
    }
    stringBuffer.append(TEXT_641);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_642);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_644);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_645);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_647);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_648);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_649);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_650);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_651);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_653);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_655);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_656);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_657);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_658);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_659);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_660);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_662);
    }
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_664);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_665);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_667);
    }
    stringBuffer.append(TEXT_668);
    }
    stringBuffer.append(TEXT_669);
    }
    stringBuffer.append(TEXT_670);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_674);
    } else {
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_680);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_681);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_682);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_686);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_689);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_692);
    }
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_694);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_695);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_698);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_700);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_704);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_705);
    } else {
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_707);
    }
    stringBuffer.append(TEXT_708);
    } else {
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_712);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_713);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_718);
    }
    stringBuffer.append(TEXT_719);
    }
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_721);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_722);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_723);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_724);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_725);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_726);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_728);
    }
    stringBuffer.append(TEXT_729);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_730);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_732);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_733);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_735);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_736);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_737);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_738);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_739);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_741);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_743);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_744);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_745);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_746);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_747);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_748);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_750);
    }
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_752);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_753);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_755);
    }
    stringBuffer.append(TEXT_756);
    }
    stringBuffer.append(TEXT_757);
    }
    stringBuffer.append(TEXT_758);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_761);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_764);
    } else {
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_766);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_769);
    }
    } else {
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_772);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_773);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_778);
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_781);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_784);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_786);
    }
    }
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_788);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_789);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_790);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_793);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_795);
    }
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_797);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_798);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_803);
    }
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_805);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_807);
    }
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_809);
    }
    stringBuffer.append(TEXT_810);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_823);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_824);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_828);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_829);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_834);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_836);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_839);
    }
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_844);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_849);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_851);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_852);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_855);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_856);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_860);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_861);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_862);
    }
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_866);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_867);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_870);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_874);
    }
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_877);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_880);
    }
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_882);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_889);
    }
    stringBuffer.append(TEXT_890);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_896);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_901);
    } else {
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_908);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_914);
    } else {
    stringBuffer.append(TEXT_915);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_920);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_921);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_923);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_925);
    }
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_927);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_929);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_931);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_934);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_937);
    } else {
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_942);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_947);
    } else {
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_951);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_955);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_957);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_961);
    }
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_964);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_967);
    }
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_969);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_973);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_977);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_979);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_980);
    } else {
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_982);
    }
    stringBuffer.append(TEXT_983);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_987);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_992);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_994);
    }
    }
    }
    if (!genFeature.isBasicSet()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_996);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_997);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_998);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_999);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1000);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1003);
    }
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1008);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1010);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1018);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1022);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_1025);
    }
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1030);
    }
    stringBuffer.append(TEXT_1031);
    }
    stringBuffer.append(TEXT_1032);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1037);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1039);
    }
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1041);
    }
    stringBuffer.append(TEXT_1042);
    } else {
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1046);
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1048);
    }
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getCapName());
    if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1050);
    }
    stringBuffer.append(TEXT_1051);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1056);
    } else {
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1059);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1060);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_1061);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1062);
    }
    }
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1066);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1068);
    }
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1070);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1074);
    }
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1076);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1078);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1082);
    }
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1085);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1088);
    }
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1090);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1095);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1097);
    } else {
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1099);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1100);
    } else {
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1102);
    }
    stringBuffer.append(TEXT_1103);
    }
    } else {
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1106);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1107);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(TEXT_1113);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1115);
    }
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1117);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1120);
    }
    stringBuffer.append(TEXT_1121);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1122);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1123);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1125);
    } else {
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1127);
    }
    stringBuffer.append(TEXT_1128);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1130);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1135);
    }
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1140);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1145);
    }
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1148);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1152);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1157);
    }
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1159);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1162);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1166);
    }
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1169);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1172);
    }
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1174);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1179);
    }
    stringBuffer.append(TEXT_1180);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1185);
    } else {
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1192);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1195);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1199);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1201);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1205);
    } else {
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1208);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1210);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1213);
    } else {
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1215);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1219);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1221);
    } else {
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1223);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1224);
    } else {
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1226);
    }
    stringBuffer.append(TEXT_1227);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1233);
    } else {
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1238);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1241);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1244);
    } else {
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1246);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1250);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1255);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1256);
    } else {
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1258);
    }
    stringBuffer.append(TEXT_1259);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1264);
    } else {
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1268);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1272);
    } else {
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1275);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1276);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1284);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1286);
    }
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1288);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1291);
    }
    stringBuffer.append(TEXT_1292);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1293);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1294);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1296);
    } else {
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1298);
    }
    stringBuffer.append(TEXT_1299);
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1301);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1306);
    }
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1311);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1313);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1316);
    } else {
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1318);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1323);
    } else {
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1327);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1331);
    } else {
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1334);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1335);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1342);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1349);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1350);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1355);
    } else {
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1360);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1364);
    } else {
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1368);
    }
    }
    stringBuffer.append(TEXT_1369);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1373);
    }
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1377);
    } else {
    stringBuffer.append(TEXT_1378);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1381);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1382);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1383);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1384);
    }
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1387);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1388);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1392);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1395);
    } else {
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1398);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1400);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1408);
    index++;}
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1412);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1413);
    }
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1417);
    }
    stringBuffer.append(TEXT_1418);
    } else {
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1421);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1422);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1423);
    }
    } else {
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1425);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1429);
    } else {
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1433);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1435);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1436);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1441);
    } else {
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1446);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1450);
    } else {
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1454);
    }
    }
    stringBuffer.append(TEXT_1455);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1459);
    }
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1462);
    } else {
    stringBuffer.append(TEXT_1463);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1467);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1468);
    }
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1472);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1474);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_1475);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1476);
    } else {
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1481);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1484);
    } else {
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1487);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1489);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1497);
    index++;}
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1501);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1502);
    }
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1506);
    }
    stringBuffer.append(TEXT_1507);
    } else {
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1510);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1511);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1512);
    }
    } else {
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1514);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1518);
    } else {
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1522);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1524);
    }
    stringBuffer.append(TEXT_1525);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1530);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1534);
    }
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1538);
    } else {
    stringBuffer.append(TEXT_1539);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1543);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1544);
    }
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1550);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1551);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1552);
    }
    stringBuffer.append(TEXT_1553);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1558);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1562);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1563);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1565);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1567);
    }
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1571);
    } else {
    stringBuffer.append(TEXT_1572);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1576);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1578);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1579);
    }
    stringBuffer.append(TEXT_1580);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1581);
    }
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1585);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1587);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1588);
    }
    stringBuffer.append(TEXT_1589);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1594);
    } else {
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1601);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1604);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1609);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1611);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1612);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1615);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1616);
    }
    }
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1621);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1623);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1624);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1626);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1628);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1634);
    } else {
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1639);
    }
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1641);
    index++;}
    stringBuffer.append(TEXT_1642);
    } else {
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1649);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1657);
    } else {
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1662);
    }
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1664);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1672);
    } else {
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1677);
    }
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1679);
    index++;}
    }
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1681);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1682);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1683);
    }
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1686);
    }
    stringBuffer.append(TEXT_1687);
    } else {
    stringBuffer.append(TEXT_1688);
    }
    stringBuffer.append(TEXT_1689);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1691);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1692);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1694);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1697);
    } else {
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1700);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1703);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1710);
    } else {
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1712);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1714);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1716);
    } else {
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1718);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1720);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1722);
    } else {
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1724);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1728);
    } else {
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1732);
    }
    } else {
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1735);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1739);
    } else {
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1742);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1747);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1757);
    } else {
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1762);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1763);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1764);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1769);
    }
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1774);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1776);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1779);
    } else {
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1781);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1786);
    } else {
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1790);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1793);
    } else {
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1796);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1797);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation && !UML2GenModelUtil.hasOperationsClass(genClass, genOperation) && UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1807);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1815);
    } else {
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_1823);
    }
    stringBuffer.append(TEXT_1824);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1825);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1826);
    if (UML2GenModelUtil.isRedefinition(genOperation)) {
    stringBuffer.append(TEXT_1827);
    for (GenOperation redefinedGenOperation : UML2GenModelUtil.getRedefinedGenOperations(genOperation)) {
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(redefinedGenOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(redefinedGenOperation.getName());
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(redefinedGenOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(redefinedGenOperation.getFormattedName());
    stringBuffer.append(TEXT_1832);
    }
    stringBuffer.append(TEXT_1833);
    }
    stringBuffer.append(TEXT_1834);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1835);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1841);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1844);
    }}
    stringBuffer.append(TEXT_1845);
    } else {
    stringBuffer.append(TEXT_1846);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_1847);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1852);
    } else {
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1857);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1863);
    } else {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1871);
    } else {
    stringBuffer.append(TEXT_1872);
    }
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1884);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1885);
    }
    } else { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1888);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1890);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1892);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_1893);
    }
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1896);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1897);
    }
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1900);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1901);
    }
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1904);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1906);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1908);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1909);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1910);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1911);
    }
    stringBuffer.append(TEXT_1912);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1914);
    }
    stringBuffer.append(TEXT_1915);
    }
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1917);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1918);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1920);
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
    stringBuffer.append(TEXT_1921);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1924);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_1926);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_1927);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1930);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_1931);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_1932);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1933);
    }
    stringBuffer.append(TEXT_1934);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1938);
    }
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_1941);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_1945);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1948);
    } else {
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_1950);
    }
    } else {
    stringBuffer.append(TEXT_1951);
    }
    }
    stringBuffer.append(TEXT_1952);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_1953);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_1954);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_1955);
    }
    stringBuffer.append(TEXT_1956);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1960);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1962);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_1963);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1967);
    } else {
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1969);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_1970);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1972);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1973);
    } else {
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1975);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1976);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1980);
    } else if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1981);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1983);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_1984);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1985);
    }
    stringBuffer.append(TEXT_1986);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1987);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1989);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1991);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1992);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(targetClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_1996);
    }
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1998);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1999);
    }
    }
    stringBuffer.append(TEXT_2000);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2001);
    } else {
    stringBuffer.append(TEXT_2002);
    }
    stringBuffer.append(TEXT_2003);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_2004);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2005);
    }
    stringBuffer.append(TEXT_2006);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2008);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2010);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_2011);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2012);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2017);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2020);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2021);
    } else {
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2024);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2025);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2026);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2027);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2028);
    } else {
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2030);
    }
    }
    stringBuffer.append(TEXT_2031);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2032);
    } else {
    stringBuffer.append(TEXT_2033);
    }
    stringBuffer.append(TEXT_2034);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_2035);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2036);
    }
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2038);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2039);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2040);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_2041);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2042);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(targetClass.getImportedInterfaceName());
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
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_2049);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2050);
    }
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2052);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2054);
    if (genFeature.isPrimitiveType()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2055);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2056);
    } else {
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2059);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2061);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2062);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2063);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2064);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2065);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2066);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2067);
    } else {
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2070);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2071);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2072);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2074);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2075);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2076);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2078);
    } else {
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2080);
    }
    }
    stringBuffer.append(TEXT_2081);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2082);
    } else {
    stringBuffer.append(TEXT_2083);
    }
    stringBuffer.append(TEXT_2084);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_2085);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_2086);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2087);
    }
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2089);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2091);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2092);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2094);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2095);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2096);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2098);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2099);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2102);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2103);
    } else {
    stringBuffer.append(TEXT_2104);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2105);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2106);
    }
    } else {
    stringBuffer.append(TEXT_2107);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2108);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2109);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2110);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2111);
    }
    stringBuffer.append(TEXT_2112);
    }
    } else if (genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2115);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2116);
    } else {
    stringBuffer.append(TEXT_2117);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2118);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2120);
    }
    stringBuffer.append(TEXT_2121);
    }
    stringBuffer.append(TEXT_2122);
    }
    stringBuffer.append(TEXT_2123);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2124);
    } else {
    stringBuffer.append(TEXT_2125);
    }
    stringBuffer.append(TEXT_2126);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_2127);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2128);
    }
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2130);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_2131);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2132);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2134);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2135);
    } else {
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2137);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2139);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2141);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2142);
    } else {
    stringBuffer.append(TEXT_2143);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2145);
    }
    stringBuffer.append(TEXT_2146);
    }
    stringBuffer.append(TEXT_2147);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2148);
    } else {
    stringBuffer.append(TEXT_2149);
    }
    stringBuffer.append(TEXT_2150);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(TEXT_2152);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2153);
    }
    stringBuffer.append(TEXT_2154);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    stringBuffer.append(TEXT_2155);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2156);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2157);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2158);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2159);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2161);
    } else {
    stringBuffer.append(TEXT_2162);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2163);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2164);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2165);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2166);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2167);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2168);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2170);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2172);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2174);
    } else {
    stringBuffer.append(TEXT_2175);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2176);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2177);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2178);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2179);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2180);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2182);
    } else {
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2184);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2185);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2186);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2188);
    } else {
    stringBuffer.append(TEXT_2189);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2190);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2193);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2194);
    } else {
    stringBuffer.append(TEXT_2195);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2196);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2197);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2198);
    }
    } else {
    stringBuffer.append(TEXT_2199);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2200);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2201);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2202);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2203);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2204);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2205);
    } else {
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2207);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2208);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2209);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2210);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2212);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2213);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2215);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2216);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2217);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2218);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2219);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2220);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2221);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2222);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2223);
    } else {
    stringBuffer.append(TEXT_2224);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2225);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2226);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2227);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2228);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2229);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2230);
    } else {
    stringBuffer.append(TEXT_2231);
    }
    stringBuffer.append(TEXT_2232);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2233);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2234);
    }
    stringBuffer.append(TEXT_2235);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2236);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2237);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2238);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2239);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2241);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2242);
    }
    stringBuffer.append(TEXT_2243);
    }
    stringBuffer.append(TEXT_2244);
    }
    stringBuffer.append(TEXT_2245);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2246);
    }
    stringBuffer.append(TEXT_2247);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2248);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2249);
    stringBuffer.append(mixinGenClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2250);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2251);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2252);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2253);
    }
    stringBuffer.append(TEXT_2254);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2255);
    stringBuffer.append(genClass.getImportedInterfaceName());
    stringBuffer.append(TEXT_2256);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2257);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2258);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2259);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2260);
    }
    stringBuffer.append(TEXT_2261);
    }
    stringBuffer.append(TEXT_2262);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2263);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2264);
    }
    stringBuffer.append(TEXT_2265);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2266);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2267);
    }
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2269);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2270);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2271);
    }
    stringBuffer.append(TEXT_2272);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2273);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2275);
    }
    stringBuffer.append(TEXT_2276);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2277);
    }
    stringBuffer.append(TEXT_2278);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2279);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2280);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2281);
    }
    stringBuffer.append(TEXT_2282);
    }
    }
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2283);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2284);
    }
    stringBuffer.append(TEXT_2285);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2286);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2288);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2290);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2292);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2293);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2294);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2296);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2297);
    }
    stringBuffer.append(TEXT_2298);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2299);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2300);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2301);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2302);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2303);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2304);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2305);
    }
    stringBuffer.append(TEXT_2306);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2307);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2308);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2309);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2310);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_2311);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2313);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2314);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2315);
    }
    stringBuffer.append(TEXT_2316);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2317);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2319);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2320);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2321);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2322);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2323);
    } else {
    stringBuffer.append(TEXT_2324);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2325);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2326);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2327);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2328);
    }
    } else {
    stringBuffer.append(TEXT_2329);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2330);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2331);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2332);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2333);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2334);
    if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2335);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2336);
    } else {
    stringBuffer.append(TEXT_2337);
    }
    stringBuffer.append(TEXT_2338);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2339);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2340);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2341);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2342);
    }
    stringBuffer.append(TEXT_2343);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2344);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2346);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2347);
    } else {
    stringBuffer.append(TEXT_2348);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2349);
    }
    stringBuffer.append(TEXT_2350);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2351);
    if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2352);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2353);
    } else {
    stringBuffer.append(TEXT_2354);
    }
    stringBuffer.append(TEXT_2355);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2356);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2357);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2358);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2359);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2360);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2361);
    }
    stringBuffer.append(TEXT_2362);
    } else if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2363);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2366);
    } else {
    stringBuffer.append(TEXT_2367);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2368);
    }
    stringBuffer.append(TEXT_2369);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2370);
    }
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2374);
    }
    if (isImplementation) {
    if (!UML2GenModelUtil.isOperationsClasses(genPackage) && UML2GenModelUtil.hasOCLOperationBodies(genClass) && !UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass())) {
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2376);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2377);
    }
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2378);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2380);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2381);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2382);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2384);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2385);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2386);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2387);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2388);
    }
    stringBuffer.append(TEXT_2389);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2390);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2391);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2392);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2393);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2394);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2396);
    } else {
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2399);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2401);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2403);
    }
    stringBuffer.append(TEXT_2404);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2405);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2407);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2408);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2409);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2410);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2411);
    }
    stringBuffer.append(TEXT_2412);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2413);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2415);
    } else {
    stringBuffer.append(TEXT_2416);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2418);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2419);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2420);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2421);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2422);
    }
    stringBuffer.append(TEXT_2423);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2424);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2425);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2426);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2428);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2429);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2430);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2431);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2432);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2433);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2434);
    } else {
    stringBuffer.append(TEXT_2435);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2436);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2437);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2438);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2439);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2440);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2441);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2442);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2443);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2444);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2445);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2446);
    } else {
    stringBuffer.append(TEXT_2447);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2448);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2449);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2450);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2453);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2454);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2456);
    }
    }
    }
    stringBuffer.append(TEXT_2457);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2458);
    }
    }
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2460);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2461);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2462);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2463);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2464);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2465);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2466);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2467);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2468);
    }
    } else {
    stringBuffer.append(TEXT_2469);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2470);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2471);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2472);
    }
    }
    } else {
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2474);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2475);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2477);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2478);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2480);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2481);
    }
    } else {
    stringBuffer.append(TEXT_2482);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2484);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2485);
    }
    }
    } else {
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2487);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2488);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2489);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2490);
    } else {
    stringBuffer.append(TEXT_2491);
    }
    }
    stringBuffer.append(TEXT_2492);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2493);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2494);
    }
    }
    stringBuffer.append(TEXT_2495);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2496);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2497);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType(genClass).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2499);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2500);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2501);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2502);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2503);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2504);
    } else {
    stringBuffer.append(TEXT_2505);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2506);
    }
    } else {
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2508);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2509);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2510);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2512);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2513);
    } else {
    stringBuffer.append(TEXT_2514);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2515);
    }
    }
    stringBuffer.append(TEXT_2516);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2517);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2518);
    }
    }
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2520);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2521);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2522);
    } else {
    stringBuffer.append(TEXT_2523);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2524);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2525);
    }
    stringBuffer.append(TEXT_2526);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2527);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2528);
    }
    }
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2530);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_2532);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2533);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2534);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2535);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2537);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2539);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2540);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2541);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2542);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2543);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2544);
    }
    stringBuffer.append(TEXT_2545);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2546);
    } else {
    stringBuffer.append(TEXT_2547);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2548);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2549);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2550);
    }
    stringBuffer.append(TEXT_2551);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2552);
    }
    }
    stringBuffer.append(TEXT_2553);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2554);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2555);
    }
    }
    stringBuffer.append(TEXT_2556);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2557);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2558);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2559);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2560);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2561);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2562);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2563);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2564);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2565);
    }
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2567);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2568);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2569);
    }
    stringBuffer.append(TEXT_2570);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2571);
    }
    stringBuffer.append(TEXT_2572);
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2574);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2577);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2578);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2579);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2581);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2583);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2585);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2586);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2587);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2589);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2590);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2591);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2592);
    } else {
    stringBuffer.append(TEXT_2593);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2594);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2595);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2597);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2598);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2599);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2600);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2601);
    } else {
    stringBuffer.append(TEXT_2602);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2603);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2605);
    }
    }
    stringBuffer.append(TEXT_2606);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2607);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2608);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2609);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2610);
    }
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2612);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2613);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2614);
    } else {
    stringBuffer.append(TEXT_2615);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2616);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2617);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2618);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2619);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2620);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2621);
    }
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2623);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2624);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2625);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2626);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2627);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2628);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2629);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2631);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2632);
    } else {
    stringBuffer.append(TEXT_2633);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2635);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2636);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2637);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2638);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2639);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2640);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2641);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2642);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2644);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2645);
    index++;}
    stringBuffer.append(TEXT_2646);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2647);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2649);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2650);
    }
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2652);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2653);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2654);
    }
    stringBuffer.append(TEXT_2655);
    } else {
    stringBuffer.append(TEXT_2656);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2657);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2658);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2659);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2660);
    }
    } else {
    stringBuffer.append(TEXT_2661);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2662);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2664);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2665);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2666);
    } else {
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2668);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2670);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2672);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2673);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2674);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2675);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2676);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2678);
    } else {
    stringBuffer.append(TEXT_2679);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2680);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2682);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2683);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2684);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2687);
    } else {
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2690);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2691);
    }
    }
    stringBuffer.append(TEXT_2692);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2693);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2695);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2696);
    }
    stringBuffer.append(TEXT_2697);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2698);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2699);
    } else {
    stringBuffer.append(TEXT_2700);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2702);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2703);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2704);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2705);
    }
    stringBuffer.append(TEXT_2706);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2707);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2708);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2709);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2710);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2711);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_2712);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2713);
    } else {
    stringBuffer.append(TEXT_2714);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2715);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2716);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2717);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2718);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2719);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2720);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2721);
    } else {
    stringBuffer.append(TEXT_2722);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2723);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2724);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2725);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2726);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2727);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2728);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2729);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2730);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2731);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2732);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2733);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2734);
    index++;}
    stringBuffer.append(TEXT_2735);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2736);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2737);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2738);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2739);
    }
    stringBuffer.append(TEXT_2740);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2741);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2742);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2743);
    }
    stringBuffer.append(TEXT_2744);
    } else {
    stringBuffer.append(TEXT_2745);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2746);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2747);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2748);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2749);
    }
    } else {
    stringBuffer.append(TEXT_2750);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2751);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2752);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2753);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2754);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2755);
    } else {
    stringBuffer.append(TEXT_2756);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2757);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2758);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2759);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2760);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2761);
    }
    stringBuffer.append(TEXT_2762);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2763);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2764);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2765);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2767);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2768);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2769);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2770);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2771);
    }
    stringBuffer.append(TEXT_2772);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2773);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2774);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2775);
    } else {
    stringBuffer.append(TEXT_2776);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2777);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2780);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2781);
    }
    stringBuffer.append(TEXT_2782);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2784);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2786);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2787);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2788);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2789);
    }
    stringBuffer.append(TEXT_2790);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2791);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2792);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2793);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2794);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2795);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2796);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2797);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2798);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2799);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2800);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2801);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2802);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2803);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2804);
    }
    stringBuffer.append(TEXT_2805);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2806);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2807);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2808);
    } else {
    stringBuffer.append(TEXT_2809);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2811);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2812);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2813);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2814);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2815);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2816);
    }
    stringBuffer.append(TEXT_2817);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2818);
    }
    stringBuffer.append(TEXT_2819);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2820);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2821);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2822);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2823);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2824);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2825);
    }
    stringBuffer.append(TEXT_2826);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2827);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2828);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_2829);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2830);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2831);
    } else {
    stringBuffer.append(TEXT_2832);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2833);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2834);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2835);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2836);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2837);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2838);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2839);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2840);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2841);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2842);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2843);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2844);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2845);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2846);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2847);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2848);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_2849);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_2850);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_2851);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2852);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2853);
    }
    }
    stringBuffer.append(TEXT_2854);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2855);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2856);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2857);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2858);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2859);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2860);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2861);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2862);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2863);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2864);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2865);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2866);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2867);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2868);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2869);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2870);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2871);
    } else {
    stringBuffer.append(TEXT_2872);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2873);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2874);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2875);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2876);
    }
    stringBuffer.append(TEXT_2877);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2878);
    index++;}
    stringBuffer.append(TEXT_2879);
    } else {
    stringBuffer.append(TEXT_2880);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2881);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2882);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2883);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2884);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2885);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2886);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2887);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2888);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2889);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2890);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2891);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2892);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2893);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2894);
    } else {
    stringBuffer.append(TEXT_2895);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2896);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2897);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2898);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2899);
    }
    stringBuffer.append(TEXT_2900);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2901);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2902);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2903);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2904);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2905);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2906);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2907);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2908);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2909);
    } else {
    stringBuffer.append(TEXT_2910);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2911);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2912);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2913);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2914);
    }
    stringBuffer.append(TEXT_2915);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2916);
    index++;}
    }
    stringBuffer.append(TEXT_2917);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2918);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2919);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2920);
    }
    stringBuffer.append(TEXT_2921);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2922);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2923);
    }
    stringBuffer.append(TEXT_2924);
    } else {
    stringBuffer.append(TEXT_2925);
    }
    stringBuffer.append(TEXT_2926);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_2927);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2928);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2929);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2930);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2931);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2932);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2933);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2934);
    } else {
    stringBuffer.append(TEXT_2935);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2936);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2937);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2938);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2939);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2940);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2941);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2942);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2943);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2944);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2945);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2946);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2947);
    } else {
    stringBuffer.append(TEXT_2948);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2949);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2950);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2951);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2952);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2953);
    } else {
    stringBuffer.append(TEXT_2954);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2955);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2956);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2957);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2958);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2959);
    } else {
    stringBuffer.append(TEXT_2960);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2961);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2962);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2963);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2964);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2965);
    } else {
    stringBuffer.append(TEXT_2966);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2967);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2968);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2969);
    }
    } else {
    stringBuffer.append(TEXT_2970);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2971);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2972);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2973);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2974);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2975);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2976);
    } else {
    stringBuffer.append(TEXT_2977);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2978);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2979);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2980);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2981);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2982);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2983);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2984);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2985);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2986);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2987);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2988);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2989);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2990);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2991);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2992);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2993);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2994);
    } else {
    stringBuffer.append(TEXT_2995);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2996);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2997);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2998);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2999);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3000);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3001);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_3002);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3003);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3004);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3005);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3006);
    }
    stringBuffer.append(TEXT_3007);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3008);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_3009);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_3010);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3011);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_3012);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3013);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_3014);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_3015);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3016);
    } else {
    stringBuffer.append(TEXT_3017);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3018);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_3019);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3020);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3021);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3022);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3023);
    } else {
    stringBuffer.append(TEXT_3024);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3025);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3026);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3027);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_3028);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_3029);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3030);
    } else {
    stringBuffer.append(TEXT_3031);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3032);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3033);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_3034);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_3035);
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //genOperation.annotations.insert.javajetinc
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_3036);
    }
    }
    stringBuffer.append(TEXT_3037);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_3038);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3039);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_3040);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_3041);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_3042);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3043);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3044);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_3045);
    } else {
    stringBuffer.append(TEXT_3046);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3047);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3048);
    }
    }
    stringBuffer.append(TEXT_3049);
    }
    }
    stringBuffer.append(TEXT_3050);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_3051);
    return stringBuffer.toString();
  }
}
