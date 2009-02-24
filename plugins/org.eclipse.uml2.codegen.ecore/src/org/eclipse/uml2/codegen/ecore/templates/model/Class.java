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
  protected final String TEXT_183 = NL + "\tpublic ";
  protected final String TEXT_184 = "[] ";
  protected final String TEXT_185 = "()" + NL + "\t{";
  protected final String TEXT_186 = NL + "\t\t";
  protected final String TEXT_187 = " list = (";
  protected final String TEXT_188 = ")";
  protected final String TEXT_189 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_190 = "(";
  protected final String TEXT_191 = "[])";
  protected final String TEXT_192 = "_EEMPTY_ARRAY;";
  protected final String TEXT_193 = NL + "\t\tif (";
  protected final String TEXT_194 = " == null || ";
  protected final String TEXT_195 = ".isEmpty()) return ";
  protected final String TEXT_196 = "(";
  protected final String TEXT_197 = "[])";
  protected final String TEXT_198 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_199 = " list = (";
  protected final String TEXT_200 = ")";
  protected final String TEXT_201 = ";";
  protected final String TEXT_202 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_203 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_204 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_205 = NL + "\t";
  protected final String TEXT_206 = " get";
  protected final String TEXT_207 = "(int index);" + NL;
  protected final String TEXT_208 = NL + "\tpublic ";
  protected final String TEXT_209 = " get";
  protected final String TEXT_210 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_211 = "(";
  protected final String TEXT_212 = ")";
  protected final String TEXT_213 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_214 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_215 = NL + "\tint get";
  protected final String TEXT_216 = "Length();" + NL;
  protected final String TEXT_217 = NL + "\tpublic int get";
  protected final String TEXT_218 = "Length()" + NL + "\t{";
  protected final String TEXT_219 = NL + "\t\treturn ";
  protected final String TEXT_220 = "().size();";
  protected final String TEXT_221 = NL + "\t\treturn ";
  protected final String TEXT_222 = " == null ? 0 : ";
  protected final String TEXT_223 = ".size();";
  protected final String TEXT_224 = NL + "\t}" + NL;
  protected final String TEXT_225 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_226 = NL + "\tvoid set";
  protected final String TEXT_227 = "(";
  protected final String TEXT_228 = "[] new";
  protected final String TEXT_229 = ");" + NL;
  protected final String TEXT_230 = NL + "\tpublic void set";
  protected final String TEXT_231 = "(";
  protected final String TEXT_232 = "[] new";
  protected final String TEXT_233 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_234 = ")";
  protected final String TEXT_235 = "()).setData(new";
  protected final String TEXT_236 = ".length, new";
  protected final String TEXT_237 = ");" + NL + "\t}" + NL;
  protected final String TEXT_238 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_239 = NL + "\tvoid set";
  protected final String TEXT_240 = "(int index, ";
  protected final String TEXT_241 = " element);" + NL;
  protected final String TEXT_242 = NL + "\tpublic void set";
  protected final String TEXT_243 = "(int index, ";
  protected final String TEXT_244 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_245 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_246 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_247 = "</b></em>' ";
  protected final String TEXT_248 = ".";
  protected final String TEXT_249 = NL + "\t * The key is of type ";
  protected final String TEXT_250 = "list of {@link ";
  protected final String TEXT_251 = "}";
  protected final String TEXT_252 = "{@link ";
  protected final String TEXT_253 = "}";
  protected final String TEXT_254 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_255 = "list of {@link ";
  protected final String TEXT_256 = "}";
  protected final String TEXT_257 = "{@link ";
  protected final String TEXT_258 = "}";
  protected final String TEXT_259 = ",";
  protected final String TEXT_260 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_261 = "}";
  protected final String TEXT_262 = ".";
  protected final String TEXT_263 = NL + "\t * The default value is <code>";
  protected final String TEXT_264 = "</code>.";
  protected final String TEXT_265 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_266 = "}.";
  protected final String TEXT_267 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_268 = "#";
  protected final String TEXT_269 = " <em>";
  protected final String TEXT_270 = "</em>}'.";
  protected final String TEXT_271 = NL + "\t * <p>" + NL + "\t * This feature subsets the following features:" + NL + "\t * <ul>";
  protected final String TEXT_272 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_273 = "#";
  protected final String TEXT_274 = "() <em>";
  protected final String TEXT_275 = "</em>}'</li>";
  protected final String TEXT_276 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_277 = NL + "\t * <p>" + NL + "\t * This feature redefines the following features:" + NL + "\t * <ul>";
  protected final String TEXT_278 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_279 = "#";
  protected final String TEXT_280 = "() <em>";
  protected final String TEXT_281 = "</em>}'</li>";
  protected final String TEXT_282 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_283 = NL + "\t * This feature is a derived union.";
  protected final String TEXT_284 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_285 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_286 = "</em>' ";
  protected final String TEXT_287 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_288 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_289 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_290 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_291 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_292 = "</em>' ";
  protected final String TEXT_293 = ".";
  protected final String TEXT_294 = NL + "\t * @see ";
  protected final String TEXT_295 = NL + "\t * @see #isSet";
  protected final String TEXT_296 = "()";
  protected final String TEXT_297 = NL + "\t * @see #unset";
  protected final String TEXT_298 = "()";
  protected final String TEXT_299 = NL + "\t * @see #set";
  protected final String TEXT_300 = "(";
  protected final String TEXT_301 = ")";
  protected final String TEXT_302 = NL + "\t * @see ";
  protected final String TEXT_303 = "#get";
  protected final String TEXT_304 = "()";
  protected final String TEXT_305 = NL + "\t * @see ";
  protected final String TEXT_306 = "#";
  protected final String TEXT_307 = NL + "\t * @model ";
  protected final String TEXT_308 = NL + "\t *        ";
  protected final String TEXT_309 = NL + "\t * @model";
  protected final String TEXT_310 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_311 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_312 = NL + "\t@Override";
  protected final String TEXT_313 = NL + "\t";
  protected final String TEXT_314 = " ";
  protected final String TEXT_315 = "();" + NL;
  protected final String TEXT_316 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_317 = NL + "\tpublic ";
  protected final String TEXT_318 = " ";
  protected final String TEXT_319 = "_";
  protected final String TEXT_320 = "()" + NL + "\t{";
  protected final String TEXT_321 = NL + "\t\treturn ";
  protected final String TEXT_322 = "(";
  protected final String TEXT_323 = "(";
  protected final String TEXT_324 = ")eDynamicGet(";
  protected final String TEXT_325 = ", ";
  protected final String TEXT_326 = ", true, ";
  protected final String TEXT_327 = ")";
  protected final String TEXT_328 = ").";
  protected final String TEXT_329 = "()";
  protected final String TEXT_330 = ";";
  protected final String TEXT_331 = NL + "\t\treturn ";
  protected final String TEXT_332 = "(";
  protected final String TEXT_333 = "(";
  protected final String TEXT_334 = ")eGet(";
  protected final String TEXT_335 = ", true)";
  protected final String TEXT_336 = ").";
  protected final String TEXT_337 = "()";
  protected final String TEXT_338 = ";";
  protected final String TEXT_339 = NL + "\t\t";
  protected final String TEXT_340 = " ";
  protected final String TEXT_341 = " = (";
  protected final String TEXT_342 = ")eVirtualGet(";
  protected final String TEXT_343 = ");";
  protected final String TEXT_344 = NL + "\t\tif (";
  protected final String TEXT_345 = " == null)" + NL + "\t\t{";
  protected final String TEXT_346 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_347 = ", ";
  protected final String TEXT_348 = " = new ";
  protected final String TEXT_349 = ");";
  protected final String TEXT_350 = NL + "\t\t\t";
  protected final String TEXT_351 = " = new ";
  protected final String TEXT_352 = ";";
  protected final String TEXT_353 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_354 = ";";
  protected final String TEXT_355 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_356 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_357 = ")eContainer();";
  protected final String TEXT_358 = NL + "\t\t";
  protected final String TEXT_359 = " ";
  protected final String TEXT_360 = " = (";
  protected final String TEXT_361 = ")eVirtualGet(";
  protected final String TEXT_362 = ", ";
  protected final String TEXT_363 = ");";
  protected final String TEXT_364 = NL + "\t\tif (";
  protected final String TEXT_365 = " != null && ";
  protected final String TEXT_366 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_367 = " old";
  protected final String TEXT_368 = " = (";
  protected final String TEXT_369 = ")";
  protected final String TEXT_370 = ";" + NL + "\t\t\t";
  protected final String TEXT_371 = " = ";
  protected final String TEXT_372 = "eResolveProxy(old";
  protected final String TEXT_373 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_374 = " != old";
  protected final String TEXT_375 = ")" + NL + "\t\t\t{";
  protected final String TEXT_376 = NL + "\t\t\t\t";
  protected final String TEXT_377 = " new";
  protected final String TEXT_378 = " = (";
  protected final String TEXT_379 = ")";
  protected final String TEXT_380 = ";";
  protected final String TEXT_381 = NL + "\t\t\t\t";
  protected final String TEXT_382 = " msgs = old";
  protected final String TEXT_383 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_384 = ", null, null);";
  protected final String TEXT_385 = NL + "\t\t\t\t";
  protected final String TEXT_386 = " msgs =  old";
  protected final String TEXT_387 = ".eInverseRemove(this, ";
  protected final String TEXT_388 = ", ";
  protected final String TEXT_389 = ".class, null);";
  protected final String TEXT_390 = NL + "\t\t\t\tif (new";
  protected final String TEXT_391 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_392 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_393 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_394 = ", null, msgs);";
  protected final String TEXT_395 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_396 = ".eInverseAdd(this, ";
  protected final String TEXT_397 = ", ";
  protected final String TEXT_398 = ".class, msgs);";
  protected final String TEXT_399 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_400 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_401 = ", ";
  protected final String TEXT_402 = ");";
  protected final String TEXT_403 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_404 = "(this, ";
  protected final String TEXT_405 = ".RESOLVE, ";
  protected final String TEXT_406 = ", old";
  protected final String TEXT_407 = ", ";
  protected final String TEXT_408 = "));";
  protected final String TEXT_409 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_410 = NL + "\t\treturn (";
  protected final String TEXT_411 = ")eVirtualGet(";
  protected final String TEXT_412 = ", ";
  protected final String TEXT_413 = ");";
  protected final String TEXT_414 = NL + "\t\treturn (";
  protected final String TEXT_415 = " & ";
  protected final String TEXT_416 = "_EFLAG) != 0;";
  protected final String TEXT_417 = NL + "\t\treturn ";
  protected final String TEXT_418 = "_EFLAG_VALUES[(";
  protected final String TEXT_419 = " & ";
  protected final String TEXT_420 = "_EFLAG) >>> ";
  protected final String TEXT_421 = "_EFLAG_OFFSET];";
  protected final String TEXT_422 = NL + "\t\treturn ";
  protected final String TEXT_423 = ";";
  protected final String TEXT_424 = NL + "\t\t";
  protected final String TEXT_425 = " ";
  protected final String TEXT_426 = " = basicGet";
  protected final String TEXT_427 = "();" + NL + "\t\treturn ";
  protected final String TEXT_428 = " != null && ";
  protected final String TEXT_429 = ".eIsProxy() ? ";
  protected final String TEXT_430 = "eResolveProxy((";
  protected final String TEXT_431 = ")";
  protected final String TEXT_432 = ") : ";
  protected final String TEXT_433 = ";";
  protected final String TEXT_434 = NL + "\t\treturn new ";
  protected final String TEXT_435 = "((";
  protected final String TEXT_436 = ".Internal)((";
  protected final String TEXT_437 = ".Internal.Wrapper)get";
  protected final String TEXT_438 = "()).featureMap().";
  protected final String TEXT_439 = "list(";
  protected final String TEXT_440 = "));";
  protected final String TEXT_441 = NL + "\t\treturn (";
  protected final String TEXT_442 = ")get";
  protected final String TEXT_443 = "().";
  protected final String TEXT_444 = "list(";
  protected final String TEXT_445 = ");";
  protected final String TEXT_446 = NL + "\t\treturn ((";
  protected final String TEXT_447 = ".Internal.Wrapper)get";
  protected final String TEXT_448 = "()).featureMap().list(";
  protected final String TEXT_449 = ");";
  protected final String TEXT_450 = NL + "\t\treturn get";
  protected final String TEXT_451 = "().list(";
  protected final String TEXT_452 = ");";
  protected final String TEXT_453 = NL + "\t\treturn ";
  protected final String TEXT_454 = "(";
  protected final String TEXT_455 = "(";
  protected final String TEXT_456 = ")";
  protected final String TEXT_457 = "((";
  protected final String TEXT_458 = ".Internal.Wrapper)get";
  protected final String TEXT_459 = "()).featureMap().get(";
  protected final String TEXT_460 = ", true)";
  protected final String TEXT_461 = ").";
  protected final String TEXT_462 = "()";
  protected final String TEXT_463 = ";";
  protected final String TEXT_464 = NL + "\t\treturn ";
  protected final String TEXT_465 = "(";
  protected final String TEXT_466 = "(";
  protected final String TEXT_467 = ")";
  protected final String TEXT_468 = "get";
  protected final String TEXT_469 = "().get(";
  protected final String TEXT_470 = ", true)";
  protected final String TEXT_471 = ").";
  protected final String TEXT_472 = "()";
  protected final String TEXT_473 = ";";
  protected final String TEXT_474 = NL + "\t\t";
  protected final String TEXT_475 = NL + "\t\t";
  protected final String TEXT_476 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_477 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_478 = NL + "\t\t\t";
  protected final String TEXT_479 = " result = (";
  protected final String TEXT_480 = ") cache.get(";
  protected final String TEXT_481 = "eResource(), ";
  protected final String TEXT_482 = "this, ";
  protected final String TEXT_483 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_484 = "eResource(), ";
  protected final String TEXT_485 = "this, ";
  protected final String TEXT_486 = ", result = ";
  protected final String TEXT_487 = "new ";
  protected final String TEXT_488 = "(";
  protected final String TEXT_489 = ".";
  protected final String TEXT_490 = "(this)";
  protected final String TEXT_491 = ")";
  protected final String TEXT_492 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_493 = ".";
  protected final String TEXT_494 = "()";
  protected final String TEXT_495 = ";" + NL + "\t\t}";
  protected final String TEXT_496 = NL + "\t\treturn ";
  protected final String TEXT_497 = ".";
  protected final String TEXT_498 = "(this);";
  protected final String TEXT_499 = NL + "\t\t";
  protected final String TEXT_500 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_501 = " eResource = eResource();";
  protected final String TEXT_502 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_503 = NL + "\t\t\t";
  protected final String TEXT_504 = " ";
  protected final String TEXT_505 = " = (";
  protected final String TEXT_506 = ") cache.get(eResource, this, ";
  protected final String TEXT_507 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_508 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_509 = ", ";
  protected final String TEXT_510 = " = new ";
  protected final String TEXT_511 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_512 = ";" + NL + "\t\t}";
  protected final String TEXT_513 = NL + "\t\treturn new ";
  protected final String TEXT_514 = ";";
  protected final String TEXT_515 = NL + "\t\t";
  protected final String TEXT_516 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_517 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_518 = " method = getClass().getMethod(\"";
  protected final String TEXT_519 = "\", null);";
  protected final String TEXT_520 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_521 = NL + "\t\t\t\t";
  protected final String TEXT_522 = " ";
  protected final String TEXT_523 = " = (";
  protected final String TEXT_524 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_525 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_526 = " union = ";
  protected final String TEXT_527 = "Helper(new ";
  protected final String TEXT_528 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_529 = " = new ";
  protected final String TEXT_530 = "(this, ";
  protected final String TEXT_531 = "null";
  protected final String TEXT_532 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_533 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_534 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_535 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_536 = NL + "\t\t\t";
  protected final String TEXT_537 = " ";
  protected final String TEXT_538 = " = (";
  protected final String TEXT_539 = ") cache.get(eResource(), this, ";
  protected final String TEXT_540 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_541 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_542 = " union = ";
  protected final String TEXT_543 = "Helper(new ";
  protected final String TEXT_544 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_545 = ", ";
  protected final String TEXT_546 = " = new ";
  protected final String TEXT_547 = "(this, ";
  protected final String TEXT_548 = "null";
  protected final String TEXT_549 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_550 = ";";
  protected final String TEXT_551 = NL + "\t\t}";
  protected final String TEXT_552 = NL + "\t\t";
  protected final String TEXT_553 = " union = ";
  protected final String TEXT_554 = "Helper(new ";
  protected final String TEXT_555 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_556 = "(this, ";
  protected final String TEXT_557 = "null";
  protected final String TEXT_558 = ", union.size(), union.toArray());";
  protected final String TEXT_559 = NL + "\t\tif (isSet";
  protected final String TEXT_560 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_561 = "();" + NL + "\t\t}";
  protected final String TEXT_562 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_563 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_564 = "();" + NL + "\t\t}";
  protected final String TEXT_565 = NL + "\t\t";
  protected final String TEXT_566 = " ";
  protected final String TEXT_567 = " = ";
  protected final String TEXT_568 = "();" + NL + "\t\tif (";
  protected final String TEXT_569 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_570 = ";" + NL + "\t\t}";
  protected final String TEXT_571 = NL + "\t\treturn ";
  protected final String TEXT_572 = "super.";
  protected final String TEXT_573 = "()";
  protected final String TEXT_574 = "null";
  protected final String TEXT_575 = ";";
  protected final String TEXT_576 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_577 = "' ";
  protected final String TEXT_578 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_579 = NL + "\t}" + NL;
  protected final String TEXT_580 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_581 = NL + "\t@Override";
  protected final String TEXT_582 = NL + "\tpublic ";
  protected final String TEXT_583 = " basicGet";
  protected final String TEXT_584 = "()" + NL + "\t{";
  protected final String TEXT_585 = NL + "\t\treturn (";
  protected final String TEXT_586 = ")eDynamicGet(";
  protected final String TEXT_587 = ", ";
  protected final String TEXT_588 = ", false, ";
  protected final String TEXT_589 = ");";
  protected final String TEXT_590 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_591 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_592 = ")eInternalContainer();";
  protected final String TEXT_593 = NL + "\t\treturn (";
  protected final String TEXT_594 = ")eVirtualGet(";
  protected final String TEXT_595 = ");";
  protected final String TEXT_596 = NL + "\t\treturn ";
  protected final String TEXT_597 = ";";
  protected final String TEXT_598 = NL + "\t\treturn (";
  protected final String TEXT_599 = ")((";
  protected final String TEXT_600 = ".Internal.Wrapper)get";
  protected final String TEXT_601 = "()).featureMap().get(";
  protected final String TEXT_602 = ", false);";
  protected final String TEXT_603 = NL + "\t\treturn (";
  protected final String TEXT_604 = ")get";
  protected final String TEXT_605 = "().get(";
  protected final String TEXT_606 = ", false);";
  protected final String TEXT_607 = NL + "\t\treturn ";
  protected final String TEXT_608 = ".";
  protected final String TEXT_609 = "(this);";
  protected final String TEXT_610 = NL + "\t\tif (isSet";
  protected final String TEXT_611 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_612 = "basicGet";
  protected final String TEXT_613 = "();" + NL + "\t\t}";
  protected final String TEXT_614 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_615 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_616 = "basicGet";
  protected final String TEXT_617 = "();" + NL + "\t\t}";
  protected final String TEXT_618 = NL + "\t\t";
  protected final String TEXT_619 = " ";
  protected final String TEXT_620 = " = ";
  protected final String TEXT_621 = "basicGet";
  protected final String TEXT_622 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_623 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_624 = ";" + NL + "\t\t}";
  protected final String TEXT_625 = NL + "\t\treturn ";
  protected final String TEXT_626 = "super.basicGet";
  protected final String TEXT_627 = "()";
  protected final String TEXT_628 = "null";
  protected final String TEXT_629 = ";";
  protected final String TEXT_630 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_631 = "' ";
  protected final String TEXT_632 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_633 = NL + "\t}" + NL;
  protected final String TEXT_634 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_635 = NL + "\t@Override";
  protected final String TEXT_636 = NL + "\tpublic ";
  protected final String TEXT_637 = " basicSet";
  protected final String TEXT_638 = "(";
  protected final String TEXT_639 = " new";
  protected final String TEXT_640 = ", ";
  protected final String TEXT_641 = " msgs)" + NL + "\t{";
  protected final String TEXT_642 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_643 = ")new";
  protected final String TEXT_644 = ", ";
  protected final String TEXT_645 = ", msgs);";
  protected final String TEXT_646 = NL + "\t\t";
  protected final String TEXT_647 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_648 = NL + "\t\t\t";
  protected final String TEXT_649 = " ";
  protected final String TEXT_650 = " = ";
  protected final String TEXT_651 = "();";
  protected final String TEXT_652 = NL + "\t\t\tObject ";
  protected final String TEXT_653 = " = eVirtualGet(";
  protected final String TEXT_654 = ");";
  protected final String TEXT_655 = NL + "\t\t\tif (";
  protected final String TEXT_656 = " != null && ";
  protected final String TEXT_657 = " != new";
  protected final String TEXT_658 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_659 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_660 = NL + "\t\t\tif (new";
  protected final String TEXT_661 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_662 = NL + "\t\t\t\t";
  protected final String TEXT_663 = " ";
  protected final String TEXT_664 = " = ";
  protected final String TEXT_665 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_666 = ".contains(new";
  protected final String TEXT_667 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_668 = ".add(new";
  protected final String TEXT_669 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_670 = NL + "\t\t\t\t";
  protected final String TEXT_671 = " ";
  protected final String TEXT_672 = " = ";
  protected final String TEXT_673 = "();";
  protected final String TEXT_674 = NL + "\t\t\t\tObject ";
  protected final String TEXT_675 = " = eVirtualGet(";
  protected final String TEXT_676 = ");";
  protected final String TEXT_677 = NL + "\t\t\t\tif (new";
  protected final String TEXT_678 = " != ";
  protected final String TEXT_679 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_680 = "(new";
  protected final String TEXT_681 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_682 = NL + "\t\t\t}";
  protected final String TEXT_683 = NL + "\t\t}";
  protected final String TEXT_684 = NL + "\t\treturn msgs;";
  protected final String TEXT_685 = NL + "\t\tmsgs = eDynamicInverseAdd((";
  protected final String TEXT_686 = ")new";
  protected final String TEXT_687 = ", ";
  protected final String TEXT_688 = ", msgs);";
  protected final String TEXT_689 = NL + "\t\t";
  protected final String TEXT_690 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_691 = NL + "\t\t\t";
  protected final String TEXT_692 = " ";
  protected final String TEXT_693 = " = ";
  protected final String TEXT_694 = "();";
  protected final String TEXT_695 = NL + "\t\t\tObject ";
  protected final String TEXT_696 = " = eVirtualGet(";
  protected final String TEXT_697 = ");";
  protected final String TEXT_698 = NL + "\t\t\tif (";
  protected final String TEXT_699 = " != null && ";
  protected final String TEXT_700 = " != new";
  protected final String TEXT_701 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_702 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_703 = NL + "\t\t\tif (new";
  protected final String TEXT_704 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_705 = NL + "\t\t\t\t";
  protected final String TEXT_706 = " ";
  protected final String TEXT_707 = " = ";
  protected final String TEXT_708 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_709 = ".contains(new";
  protected final String TEXT_710 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_711 = ".add(new";
  protected final String TEXT_712 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_713 = NL + "\t\t\t\t";
  protected final String TEXT_714 = " ";
  protected final String TEXT_715 = " = ";
  protected final String TEXT_716 = "();";
  protected final String TEXT_717 = NL + "\t\t\t\tObject ";
  protected final String TEXT_718 = " = eVirtualGet(";
  protected final String TEXT_719 = ");";
  protected final String TEXT_720 = NL + "\t\t\t\tif (new";
  protected final String TEXT_721 = " != ";
  protected final String TEXT_722 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_723 = "(new";
  protected final String TEXT_724 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_725 = NL + "\t\t\t}";
  protected final String TEXT_726 = NL + "\t\t}";
  protected final String TEXT_727 = NL + "\t\treturn msgs;";
  protected final String TEXT_728 = NL + "\t\tObject old";
  protected final String TEXT_729 = " = eVirtualSet(";
  protected final String TEXT_730 = ", new";
  protected final String TEXT_731 = ");";
  protected final String TEXT_732 = NL + "\t\t";
  protected final String TEXT_733 = " old";
  protected final String TEXT_734 = " = ";
  protected final String TEXT_735 = ";" + NL + "\t\t";
  protected final String TEXT_736 = " = new";
  protected final String TEXT_737 = ";";
  protected final String TEXT_738 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_739 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_740 = NL + "\t\tboolean old";
  protected final String TEXT_741 = "ESet = (";
  protected final String TEXT_742 = " & ";
  protected final String TEXT_743 = "_ESETFLAG) != 0;";
  protected final String TEXT_744 = NL + "\t\t";
  protected final String TEXT_745 = " |= ";
  protected final String TEXT_746 = "_ESETFLAG;";
  protected final String TEXT_747 = NL + "\t\tboolean old";
  protected final String TEXT_748 = "ESet = ";
  protected final String TEXT_749 = "ESet;";
  protected final String TEXT_750 = NL + "\t\t";
  protected final String TEXT_751 = "ESet = true;";
  protected final String TEXT_752 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_753 = NL + "\t\t\t";
  protected final String TEXT_754 = " notification = new ";
  protected final String TEXT_755 = "(this, ";
  protected final String TEXT_756 = ".SET, ";
  protected final String TEXT_757 = ", ";
  protected final String TEXT_758 = "isSetChange ? null : old";
  protected final String TEXT_759 = "old";
  protected final String TEXT_760 = ", new";
  protected final String TEXT_761 = ", ";
  protected final String TEXT_762 = "isSetChange";
  protected final String TEXT_763 = "!old";
  protected final String TEXT_764 = "ESet";
  protected final String TEXT_765 = ");";
  protected final String TEXT_766 = NL + "\t\t\t";
  protected final String TEXT_767 = " notification = new ";
  protected final String TEXT_768 = "(this, ";
  protected final String TEXT_769 = ".SET, ";
  protected final String TEXT_770 = ", ";
  protected final String TEXT_771 = "old";
  protected final String TEXT_772 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_773 = "old";
  protected final String TEXT_774 = ", new";
  protected final String TEXT_775 = ");";
  protected final String TEXT_776 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_777 = NL + "\t\t";
  protected final String TEXT_778 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_779 = NL + "\t\t\t";
  protected final String TEXT_780 = " ";
  protected final String TEXT_781 = " = ";
  protected final String TEXT_782 = "();";
  protected final String TEXT_783 = NL + "\t\t\tObject ";
  protected final String TEXT_784 = " = eVirtualGet(";
  protected final String TEXT_785 = ");";
  protected final String TEXT_786 = NL + "\t\t\tif (";
  protected final String TEXT_787 = " != null && ";
  protected final String TEXT_788 = " != new";
  protected final String TEXT_789 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_790 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_791 = NL + "\t\t\tif (new";
  protected final String TEXT_792 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_793 = NL + "\t\t\t\t";
  protected final String TEXT_794 = " ";
  protected final String TEXT_795 = " = ";
  protected final String TEXT_796 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_797 = ".contains(new";
  protected final String TEXT_798 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_799 = ".add(new";
  protected final String TEXT_800 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_801 = NL + "\t\t\t\t";
  protected final String TEXT_802 = " ";
  protected final String TEXT_803 = " = ";
  protected final String TEXT_804 = "();";
  protected final String TEXT_805 = NL + "\t\t\t\tObject ";
  protected final String TEXT_806 = " = eVirtualGet(";
  protected final String TEXT_807 = ");";
  protected final String TEXT_808 = NL + "\t\t\t\tif (new";
  protected final String TEXT_809 = " != ";
  protected final String TEXT_810 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_811 = "(new";
  protected final String TEXT_812 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_813 = NL + "\t\t\t}";
  protected final String TEXT_814 = NL + "\t\t}";
  protected final String TEXT_815 = NL + "\t\treturn msgs;";
  protected final String TEXT_816 = NL + "\t\treturn ((";
  protected final String TEXT_817 = ".Internal)((";
  protected final String TEXT_818 = ".Internal.Wrapper)get";
  protected final String TEXT_819 = "()).featureMap()).basicAdd(";
  protected final String TEXT_820 = ", new";
  protected final String TEXT_821 = ", msgs);";
  protected final String TEXT_822 = NL + "\t\treturn ((";
  protected final String TEXT_823 = ".Internal)get";
  protected final String TEXT_824 = "()).basicAdd(";
  protected final String TEXT_825 = ", new";
  protected final String TEXT_826 = ", msgs);";
  protected final String TEXT_827 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_828 = "' ";
  protected final String TEXT_829 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_830 = NL + "\t}" + NL;
  protected final String TEXT_831 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_832 = "#";
  protected final String TEXT_833 = " <em>";
  protected final String TEXT_834 = "</em>}' ";
  protected final String TEXT_835 = ".";
  protected final String TEXT_836 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_837 = "</em>' ";
  protected final String TEXT_838 = ".";
  protected final String TEXT_839 = NL + "\t * @see ";
  protected final String TEXT_840 = NL + "\t * @see #isSet";
  protected final String TEXT_841 = "()";
  protected final String TEXT_842 = NL + "\t * @see #unset";
  protected final String TEXT_843 = "()";
  protected final String TEXT_844 = NL + "\t * @see #";
  protected final String TEXT_845 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_846 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_847 = NL + "\t@Override";
  protected final String TEXT_848 = NL + "\tvoid set";
  protected final String TEXT_849 = "(";
  protected final String TEXT_850 = " value);" + NL;
  protected final String TEXT_851 = NL + "\tpublic void set";
  protected final String TEXT_852 = "_";
  protected final String TEXT_853 = "(";
  protected final String TEXT_854 = " ";
  protected final String TEXT_855 = ")" + NL + "\t{";
  protected final String TEXT_856 = NL + "\t\tnew";
  protected final String TEXT_857 = " = new";
  protected final String TEXT_858 = " == null ? ";
  protected final String TEXT_859 = " : new";
  protected final String TEXT_860 = ";";
  protected final String TEXT_861 = NL + "\t\teDynamicSet(";
  protected final String TEXT_862 = ", ";
  protected final String TEXT_863 = ", ";
  protected final String TEXT_864 = "new ";
  protected final String TEXT_865 = "(";
  protected final String TEXT_866 = "new";
  protected final String TEXT_867 = ")";
  protected final String TEXT_868 = ");";
  protected final String TEXT_869 = NL + "\t\teSet(";
  protected final String TEXT_870 = ", ";
  protected final String TEXT_871 = "new ";
  protected final String TEXT_872 = "(";
  protected final String TEXT_873 = "new";
  protected final String TEXT_874 = ")";
  protected final String TEXT_875 = ");";
  protected final String TEXT_876 = NL + "\t\tif (new";
  protected final String TEXT_877 = " != eInternalContainer() || (eContainerFeatureID() != ";
  protected final String TEXT_878 = " && new";
  protected final String TEXT_879 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_880 = ".isAncestor(this, ";
  protected final String TEXT_881 = "new";
  protected final String TEXT_882 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_883 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_884 = NL + "\t\t\t";
  protected final String TEXT_885 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_886 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_887 = ")new";
  protected final String TEXT_888 = ").eInverseAdd(this, ";
  protected final String TEXT_889 = ", ";
  protected final String TEXT_890 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_891 = "(";
  protected final String TEXT_892 = "new";
  protected final String TEXT_893 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_894 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_895 = "(this, ";
  protected final String TEXT_896 = ".SET, ";
  protected final String TEXT_897 = ", new";
  protected final String TEXT_898 = ", new";
  protected final String TEXT_899 = "));";
  protected final String TEXT_900 = NL + "\t\t";
  protected final String TEXT_901 = " ";
  protected final String TEXT_902 = " = (";
  protected final String TEXT_903 = ")eVirtualGet(";
  protected final String TEXT_904 = ");";
  protected final String TEXT_905 = NL + "\t\tif (new";
  protected final String TEXT_906 = " != ";
  protected final String TEXT_907 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_908 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_909 = " != null)";
  protected final String TEXT_910 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_911 = ")";
  protected final String TEXT_912 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_913 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_914 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_915 = ")new";
  protected final String TEXT_916 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_917 = ", null, msgs);";
  protected final String TEXT_918 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_919 = ")";
  protected final String TEXT_920 = ").eInverseRemove(this, ";
  protected final String TEXT_921 = ", ";
  protected final String TEXT_922 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_923 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_924 = ")new";
  protected final String TEXT_925 = ").eInverseAdd(this, ";
  protected final String TEXT_926 = ", ";
  protected final String TEXT_927 = ".class, msgs);";
  protected final String TEXT_928 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_929 = "(";
  protected final String TEXT_930 = "new";
  protected final String TEXT_931 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_932 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_933 = NL + "\t\t\tboolean old";
  protected final String TEXT_934 = "ESet = eVirtualIsSet(";
  protected final String TEXT_935 = ");";
  protected final String TEXT_936 = NL + "\t\t\tboolean old";
  protected final String TEXT_937 = "ESet = (";
  protected final String TEXT_938 = " & ";
  protected final String TEXT_939 = "_ESETFLAG) != 0;";
  protected final String TEXT_940 = NL + "\t\t\t";
  protected final String TEXT_941 = " |= ";
  protected final String TEXT_942 = "_ESETFLAG;";
  protected final String TEXT_943 = NL + "\t\t\tboolean old";
  protected final String TEXT_944 = "ESet = ";
  protected final String TEXT_945 = "ESet;";
  protected final String TEXT_946 = NL + "\t\t\t";
  protected final String TEXT_947 = "ESet = true;";
  protected final String TEXT_948 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_949 = "(this, ";
  protected final String TEXT_950 = ".SET, ";
  protected final String TEXT_951 = ", new";
  protected final String TEXT_952 = ", new";
  protected final String TEXT_953 = ", !old";
  protected final String TEXT_954 = "ESet));";
  protected final String TEXT_955 = NL + "\t\t}";
  protected final String TEXT_956 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_957 = "(this, ";
  protected final String TEXT_958 = ".SET, ";
  protected final String TEXT_959 = ", new";
  protected final String TEXT_960 = ", new";
  protected final String TEXT_961 = "));";
  protected final String TEXT_962 = NL + "\t\t";
  protected final String TEXT_963 = " old";
  protected final String TEXT_964 = " = (";
  protected final String TEXT_965 = " & ";
  protected final String TEXT_966 = "_EFLAG) != 0;";
  protected final String TEXT_967 = NL + "\t\t";
  protected final String TEXT_968 = " old";
  protected final String TEXT_969 = " = ";
  protected final String TEXT_970 = "_EFLAG_VALUES[(";
  protected final String TEXT_971 = " & ";
  protected final String TEXT_972 = "_EFLAG) >>> ";
  protected final String TEXT_973 = "_EFLAG_OFFSET];";
  protected final String TEXT_974 = NL + "\t\tif (new";
  protected final String TEXT_975 = ") ";
  protected final String TEXT_976 = " |= ";
  protected final String TEXT_977 = "_EFLAG; else ";
  protected final String TEXT_978 = " &= ~";
  protected final String TEXT_979 = "_EFLAG;";
  protected final String TEXT_980 = NL + "\t\tif (new";
  protected final String TEXT_981 = " == null) new";
  protected final String TEXT_982 = " = ";
  protected final String TEXT_983 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_984 = " = ";
  protected final String TEXT_985 = " & ~";
  protected final String TEXT_986 = "_EFLAG | ";
  protected final String TEXT_987 = "new";
  protected final String TEXT_988 = ".ordinal()";
  protected final String TEXT_989 = ".VALUES.indexOf(new";
  protected final String TEXT_990 = ")";
  protected final String TEXT_991 = " << ";
  protected final String TEXT_992 = "_EFLAG_OFFSET;";
  protected final String TEXT_993 = NL + "\t\t";
  protected final String TEXT_994 = " old";
  protected final String TEXT_995 = " = ";
  protected final String TEXT_996 = ";";
  protected final String TEXT_997 = NL + "\t\t";
  protected final String TEXT_998 = " ";
  protected final String TEXT_999 = " = new";
  protected final String TEXT_1000 = " == null ? ";
  protected final String TEXT_1001 = " : new";
  protected final String TEXT_1002 = ";";
  protected final String TEXT_1003 = NL + "\t\t";
  protected final String TEXT_1004 = " = new";
  protected final String TEXT_1005 = " == null ? ";
  protected final String TEXT_1006 = " : new";
  protected final String TEXT_1007 = ";";
  protected final String TEXT_1008 = NL + "\t\t";
  protected final String TEXT_1009 = " ";
  protected final String TEXT_1010 = " = ";
  protected final String TEXT_1011 = "new";
  protected final String TEXT_1012 = ";";
  protected final String TEXT_1013 = NL + "\t\t";
  protected final String TEXT_1014 = " = ";
  protected final String TEXT_1015 = "new";
  protected final String TEXT_1016 = ";";
  protected final String TEXT_1017 = NL + "\t\tObject old";
  protected final String TEXT_1018 = " = eVirtualSet(";
  protected final String TEXT_1019 = ", ";
  protected final String TEXT_1020 = ");";
  protected final String TEXT_1021 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1022 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1023 = NL + "\t\tboolean old";
  protected final String TEXT_1024 = "ESet = (";
  protected final String TEXT_1025 = " & ";
  protected final String TEXT_1026 = "_ESETFLAG) != 0;";
  protected final String TEXT_1027 = NL + "\t\t";
  protected final String TEXT_1028 = " |= ";
  protected final String TEXT_1029 = "_ESETFLAG;";
  protected final String TEXT_1030 = NL + "\t\tboolean old";
  protected final String TEXT_1031 = "ESet = ";
  protected final String TEXT_1032 = "ESet;";
  protected final String TEXT_1033 = NL + "\t\t";
  protected final String TEXT_1034 = "ESet = true;";
  protected final String TEXT_1035 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1036 = "(this, ";
  protected final String TEXT_1037 = ".SET, ";
  protected final String TEXT_1038 = ", ";
  protected final String TEXT_1039 = "isSetChange ? ";
  protected final String TEXT_1040 = " : old";
  protected final String TEXT_1041 = "old";
  protected final String TEXT_1042 = ", ";
  protected final String TEXT_1043 = "new";
  protected final String TEXT_1044 = ", ";
  protected final String TEXT_1045 = "isSetChange";
  protected final String TEXT_1046 = "!old";
  protected final String TEXT_1047 = "ESet";
  protected final String TEXT_1048 = "));";
  protected final String TEXT_1049 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1050 = "(this, ";
  protected final String TEXT_1051 = ".SET, ";
  protected final String TEXT_1052 = ", ";
  protected final String TEXT_1053 = "old";
  protected final String TEXT_1054 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_1055 = " : old";
  protected final String TEXT_1056 = "old";
  protected final String TEXT_1057 = ", ";
  protected final String TEXT_1058 = "new";
  protected final String TEXT_1059 = "));";
  protected final String TEXT_1060 = NL + "\t\t";
  protected final String TEXT_1061 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_1062 = NL + "\t\t\t";
  protected final String TEXT_1063 = " ";
  protected final String TEXT_1064 = " = ";
  protected final String TEXT_1065 = "();";
  protected final String TEXT_1066 = NL + "\t\t\tObject ";
  protected final String TEXT_1067 = " = eVirtualGet(";
  protected final String TEXT_1068 = ");";
  protected final String TEXT_1069 = NL + "\t\t\tif (";
  protected final String TEXT_1070 = " != null && ";
  protected final String TEXT_1071 = " != new";
  protected final String TEXT_1072 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_1073 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_1074 = NL + "\t\t\tif (new";
  protected final String TEXT_1075 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_1076 = NL + "\t\t\t\t";
  protected final String TEXT_1077 = " ";
  protected final String TEXT_1078 = " = ";
  protected final String TEXT_1079 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_1080 = ".contains(new";
  protected final String TEXT_1081 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_1082 = ".add(new";
  protected final String TEXT_1083 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1084 = NL + "\t\t\t\t";
  protected final String TEXT_1085 = " ";
  protected final String TEXT_1086 = " = ";
  protected final String TEXT_1087 = "();";
  protected final String TEXT_1088 = NL + "\t\t\t\tObject ";
  protected final String TEXT_1089 = " = eVirtualGet(";
  protected final String TEXT_1090 = ");";
  protected final String TEXT_1091 = NL + "\t\t\t\tif (new";
  protected final String TEXT_1092 = " != ";
  protected final String TEXT_1093 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_1094 = "(new";
  protected final String TEXT_1095 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1096 = NL + "\t\t\t}";
  protected final String TEXT_1097 = NL + "\t\t}";
  protected final String TEXT_1098 = NL + "\t\t((";
  protected final String TEXT_1099 = ".Internal)((";
  protected final String TEXT_1100 = ".Internal.Wrapper)get";
  protected final String TEXT_1101 = "()).featureMap()).set(";
  protected final String TEXT_1102 = ", ";
  protected final String TEXT_1103 = "new ";
  protected final String TEXT_1104 = "(";
  protected final String TEXT_1105 = "new";
  protected final String TEXT_1106 = ")";
  protected final String TEXT_1107 = ");";
  protected final String TEXT_1108 = NL + "\t\t((";
  protected final String TEXT_1109 = ".Internal)get";
  protected final String TEXT_1110 = "()).set(";
  protected final String TEXT_1111 = ", ";
  protected final String TEXT_1112 = "new ";
  protected final String TEXT_1113 = "(";
  protected final String TEXT_1114 = "new";
  protected final String TEXT_1115 = ")";
  protected final String TEXT_1116 = ");";
  protected final String TEXT_1117 = NL + "\t\t";
  protected final String TEXT_1118 = NL + "\t\t";
  protected final String TEXT_1119 = ".";
  protected final String TEXT_1120 = "(this, ";
  protected final String TEXT_1121 = ");";
  protected final String TEXT_1122 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_1123 = "' ";
  protected final String TEXT_1124 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1125 = NL + "\t}" + NL;
  protected final String TEXT_1126 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1127 = NL + "\t@Override";
  protected final String TEXT_1128 = NL + "\tpublic ";
  protected final String TEXT_1129 = " basicUnset";
  protected final String TEXT_1130 = "(";
  protected final String TEXT_1131 = " msgs)" + NL + "\t{";
  protected final String TEXT_1132 = "Object old";
  protected final String TEXT_1133 = " = ";
  protected final String TEXT_1134 = "eVirtualUnset(";
  protected final String TEXT_1135 = ");";
  protected final String TEXT_1136 = NL + "\t\t";
  protected final String TEXT_1137 = " old";
  protected final String TEXT_1138 = " = ";
  protected final String TEXT_1139 = ";";
  protected final String TEXT_1140 = NL + "\t\t";
  protected final String TEXT_1141 = " = null;";
  protected final String TEXT_1142 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1143 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1144 = NL + "\t\tboolean old";
  protected final String TEXT_1145 = "ESet = (";
  protected final String TEXT_1146 = " & ";
  protected final String TEXT_1147 = "_ESETFLAG) != 0;";
  protected final String TEXT_1148 = NL + "\t\t";
  protected final String TEXT_1149 = " &= ~";
  protected final String TEXT_1150 = "_ESETFLAG;";
  protected final String TEXT_1151 = NL + "\t\tboolean old";
  protected final String TEXT_1152 = "ESet = ";
  protected final String TEXT_1153 = "ESet;";
  protected final String TEXT_1154 = NL + "\t\t";
  protected final String TEXT_1155 = "ESet = false;";
  protected final String TEXT_1156 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1157 = " notification = new ";
  protected final String TEXT_1158 = "(this, ";
  protected final String TEXT_1159 = ".UNSET, ";
  protected final String TEXT_1160 = ", ";
  protected final String TEXT_1161 = "isSetChange ? old";
  protected final String TEXT_1162 = " : null";
  protected final String TEXT_1163 = "old";
  protected final String TEXT_1164 = ", null, ";
  protected final String TEXT_1165 = "isSetChange";
  protected final String TEXT_1166 = "old";
  protected final String TEXT_1167 = "ESet";
  protected final String TEXT_1168 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1169 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1170 = "' ";
  protected final String TEXT_1171 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1172 = NL + "\t}" + NL;
  protected final String TEXT_1173 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1174 = "#";
  protected final String TEXT_1175 = " <em>";
  protected final String TEXT_1176 = "</em>}' ";
  protected final String TEXT_1177 = ".";
  protected final String TEXT_1178 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1179 = NL + "\t * @see #isSet";
  protected final String TEXT_1180 = "()";
  protected final String TEXT_1181 = NL + "\t * @see #";
  protected final String TEXT_1182 = "()";
  protected final String TEXT_1183 = NL + "\t * @see #set";
  protected final String TEXT_1184 = "(";
  protected final String TEXT_1185 = ")";
  protected final String TEXT_1186 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1187 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1188 = NL + "\t@Override";
  protected final String TEXT_1189 = NL + "\tvoid unset";
  protected final String TEXT_1190 = "();" + NL;
  protected final String TEXT_1191 = NL + "\tpublic void unset";
  protected final String TEXT_1192 = "_";
  protected final String TEXT_1193 = "()" + NL + "\t{";
  protected final String TEXT_1194 = NL + "\t\teDynamicUnset(";
  protected final String TEXT_1195 = ", ";
  protected final String TEXT_1196 = ");";
  protected final String TEXT_1197 = NL + "\t\teUnset(";
  protected final String TEXT_1198 = ");";
  protected final String TEXT_1199 = NL + "\t\t";
  protected final String TEXT_1200 = " ";
  protected final String TEXT_1201 = " = (";
  protected final String TEXT_1202 = ")eVirtualGet(";
  protected final String TEXT_1203 = ");";
  protected final String TEXT_1204 = NL + "\t\tif (";
  protected final String TEXT_1205 = " != null) ((";
  protected final String TEXT_1206 = ".Unsettable";
  protected final String TEXT_1207 = ")";
  protected final String TEXT_1208 = ").unset();";
  protected final String TEXT_1209 = NL + "\t\t";
  protected final String TEXT_1210 = " ";
  protected final String TEXT_1211 = " = (";
  protected final String TEXT_1212 = ")eVirtualGet(";
  protected final String TEXT_1213 = ");";
  protected final String TEXT_1214 = NL + "\t\tif (";
  protected final String TEXT_1215 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1216 = " msgs = null;";
  protected final String TEXT_1217 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1218 = ")";
  protected final String TEXT_1219 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1220 = ", null, msgs);";
  protected final String TEXT_1221 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1222 = ")";
  protected final String TEXT_1223 = ").eInverseRemove(this, ";
  protected final String TEXT_1224 = ", ";
  protected final String TEXT_1225 = ".class, msgs);";
  protected final String TEXT_1226 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1227 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1228 = NL + "\t\t\tboolean old";
  protected final String TEXT_1229 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1230 = ");";
  protected final String TEXT_1231 = NL + "\t\t\tboolean old";
  protected final String TEXT_1232 = "ESet = (";
  protected final String TEXT_1233 = " & ";
  protected final String TEXT_1234 = "_ESETFLAG) != 0;";
  protected final String TEXT_1235 = NL + "\t\t\t";
  protected final String TEXT_1236 = " &= ~";
  protected final String TEXT_1237 = "_ESETFLAG;";
  protected final String TEXT_1238 = NL + "\t\t\tboolean old";
  protected final String TEXT_1239 = "ESet = ";
  protected final String TEXT_1240 = "ESet;";
  protected final String TEXT_1241 = NL + "\t\t\t";
  protected final String TEXT_1242 = "ESet = false;";
  protected final String TEXT_1243 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1244 = "(this, ";
  protected final String TEXT_1245 = ".UNSET, ";
  protected final String TEXT_1246 = ", null, null, old";
  protected final String TEXT_1247 = "ESet));";
  protected final String TEXT_1248 = NL + "\t\t}";
  protected final String TEXT_1249 = NL + "\t\t";
  protected final String TEXT_1250 = " old";
  protected final String TEXT_1251 = " = (";
  protected final String TEXT_1252 = " & ";
  protected final String TEXT_1253 = "_EFLAG) != 0;";
  protected final String TEXT_1254 = NL + "\t\t";
  protected final String TEXT_1255 = " old";
  protected final String TEXT_1256 = " = ";
  protected final String TEXT_1257 = "_EFLAG_VALUES[(";
  protected final String TEXT_1258 = " & ";
  protected final String TEXT_1259 = "_EFLAG) >>> ";
  protected final String TEXT_1260 = "_EFLAG_OFFSET];";
  protected final String TEXT_1261 = NL + "\t\tObject old";
  protected final String TEXT_1262 = " = eVirtualUnset(";
  protected final String TEXT_1263 = ");";
  protected final String TEXT_1264 = NL + "\t\t";
  protected final String TEXT_1265 = " old";
  protected final String TEXT_1266 = " = ";
  protected final String TEXT_1267 = ";";
  protected final String TEXT_1268 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1269 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1270 = NL + "\t\tboolean old";
  protected final String TEXT_1271 = "ESet = (";
  protected final String TEXT_1272 = " & ";
  protected final String TEXT_1273 = "_ESETFLAG) != 0;";
  protected final String TEXT_1274 = NL + "\t\tboolean old";
  protected final String TEXT_1275 = "ESet = ";
  protected final String TEXT_1276 = "ESet;";
  protected final String TEXT_1277 = NL + "\t\t";
  protected final String TEXT_1278 = " = null;";
  protected final String TEXT_1279 = NL + "\t\t";
  protected final String TEXT_1280 = " &= ~";
  protected final String TEXT_1281 = "_ESETFLAG;";
  protected final String TEXT_1282 = NL + "\t\t";
  protected final String TEXT_1283 = "ESet = false;";
  protected final String TEXT_1284 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1285 = "(this, ";
  protected final String TEXT_1286 = ".UNSET, ";
  protected final String TEXT_1287 = ", ";
  protected final String TEXT_1288 = "isSetChange ? old";
  protected final String TEXT_1289 = " : null";
  protected final String TEXT_1290 = "old";
  protected final String TEXT_1291 = ", null, ";
  protected final String TEXT_1292 = "isSetChange";
  protected final String TEXT_1293 = "old";
  protected final String TEXT_1294 = "ESet";
  protected final String TEXT_1295 = "));";
  protected final String TEXT_1296 = NL + "\t\tif (";
  protected final String TEXT_1297 = ") ";
  protected final String TEXT_1298 = " |= ";
  protected final String TEXT_1299 = "_EFLAG; else ";
  protected final String TEXT_1300 = " &= ~";
  protected final String TEXT_1301 = "_EFLAG;";
  protected final String TEXT_1302 = NL + "\t\t";
  protected final String TEXT_1303 = " = ";
  protected final String TEXT_1304 = " & ~";
  protected final String TEXT_1305 = "_EFLAG | ";
  protected final String TEXT_1306 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1307 = NL + "\t\t";
  protected final String TEXT_1308 = " = ";
  protected final String TEXT_1309 = ";";
  protected final String TEXT_1310 = NL + "\t\t";
  protected final String TEXT_1311 = " &= ~";
  protected final String TEXT_1312 = "_ESETFLAG;";
  protected final String TEXT_1313 = NL + "\t\t";
  protected final String TEXT_1314 = "ESet = false;";
  protected final String TEXT_1315 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1316 = "(this, ";
  protected final String TEXT_1317 = ".UNSET, ";
  protected final String TEXT_1318 = ", ";
  protected final String TEXT_1319 = "isSetChange ? old";
  protected final String TEXT_1320 = " : ";
  protected final String TEXT_1321 = "old";
  protected final String TEXT_1322 = ", ";
  protected final String TEXT_1323 = ", ";
  protected final String TEXT_1324 = "isSetChange";
  protected final String TEXT_1325 = "old";
  protected final String TEXT_1326 = "ESet";
  protected final String TEXT_1327 = "));";
  protected final String TEXT_1328 = NL + "\t\t((";
  protected final String TEXT_1329 = ".Internal)((";
  protected final String TEXT_1330 = ".Internal.Wrapper)get";
  protected final String TEXT_1331 = "()).featureMap()).clear(";
  protected final String TEXT_1332 = ");";
  protected final String TEXT_1333 = NL + "\t\t((";
  protected final String TEXT_1334 = ".Internal)get";
  protected final String TEXT_1335 = "()).clear(";
  protected final String TEXT_1336 = ");";
  protected final String TEXT_1337 = NL + "\t\t";
  protected final String TEXT_1338 = NL + "\t\t";
  protected final String TEXT_1339 = ".";
  protected final String TEXT_1340 = "(this);";
  protected final String TEXT_1341 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1342 = "' ";
  protected final String TEXT_1343 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1344 = NL + "\t}" + NL;
  protected final String TEXT_1345 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1346 = "#";
  protected final String TEXT_1347 = " <em>";
  protected final String TEXT_1348 = "</em>}' ";
  protected final String TEXT_1349 = " is set.";
  protected final String TEXT_1350 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1351 = "</em>' ";
  protected final String TEXT_1352 = " is set.";
  protected final String TEXT_1353 = NL + "\t * @see #unset";
  protected final String TEXT_1354 = "()";
  protected final String TEXT_1355 = NL + "\t * @see #";
  protected final String TEXT_1356 = "()";
  protected final String TEXT_1357 = NL + "\t * @see #set";
  protected final String TEXT_1358 = "(";
  protected final String TEXT_1359 = ")";
  protected final String TEXT_1360 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1361 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1362 = NL + "\t@Override";
  protected final String TEXT_1363 = NL + "\tboolean isSet";
  protected final String TEXT_1364 = "();" + NL;
  protected final String TEXT_1365 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1366 = "_";
  protected final String TEXT_1367 = "()" + NL + "\t{";
  protected final String TEXT_1368 = NL + "\t\treturn eDynamicIsSet(";
  protected final String TEXT_1369 = ", ";
  protected final String TEXT_1370 = ");";
  protected final String TEXT_1371 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1372 = ");";
  protected final String TEXT_1373 = NL + "\t\t";
  protected final String TEXT_1374 = " ";
  protected final String TEXT_1375 = " = (";
  protected final String TEXT_1376 = ")eVirtualGet(";
  protected final String TEXT_1377 = ");";
  protected final String TEXT_1378 = NL + "\t\treturn ";
  protected final String TEXT_1379 = " != null && ((";
  protected final String TEXT_1380 = ".Unsettable";
  protected final String TEXT_1381 = ")";
  protected final String TEXT_1382 = ").isSet();";
  protected final String TEXT_1383 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1384 = ");";
  protected final String TEXT_1385 = NL + "\t\treturn (";
  protected final String TEXT_1386 = " & ";
  protected final String TEXT_1387 = "_ESETFLAG) != 0;";
  protected final String TEXT_1388 = NL + "\t\treturn ";
  protected final String TEXT_1389 = "ESet;";
  protected final String TEXT_1390 = NL + "\t\treturn !((";
  protected final String TEXT_1391 = ".Internal)((";
  protected final String TEXT_1392 = ".Internal.Wrapper)get";
  protected final String TEXT_1393 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1394 = ");";
  protected final String TEXT_1395 = NL + "\t\treturn !((";
  protected final String TEXT_1396 = ".Internal)get";
  protected final String TEXT_1397 = "()).isEmpty(";
  protected final String TEXT_1398 = ");";
  protected final String TEXT_1399 = NL + "\t\t";
  protected final String TEXT_1400 = NL + "\t\treturn ";
  protected final String TEXT_1401 = ".";
  protected final String TEXT_1402 = "(this);";
  protected final String TEXT_1403 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1404 = "' ";
  protected final String TEXT_1405 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1406 = NL + "\t}" + NL;
  protected final String TEXT_1407 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1408 = "() <em>";
  protected final String TEXT_1409 = "</em>}' ";
  protected final String TEXT_1410 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1411 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1412 = "_ESUBSETS = ";
  protected final String TEXT_1413 = ";" + NL;
  protected final String TEXT_1414 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1415 = "() <em>";
  protected final String TEXT_1416 = "</em>}' ";
  protected final String TEXT_1417 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1418 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1419 = "_ESUPERSETS = ";
  protected final String TEXT_1420 = ";" + NL;
  protected final String TEXT_1421 = NL + "\t/**";
  protected final String TEXT_1422 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1423 = "}, with the specified ";
  protected final String TEXT_1424 = ", and appends it to the '<em><b>";
  protected final String TEXT_1425 = "</b></em>' ";
  protected final String TEXT_1426 = ".";
  protected final String TEXT_1427 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1428 = "}, with the specified ";
  protected final String TEXT_1429 = ", and sets the '<em><b>";
  protected final String TEXT_1430 = "</b></em>' ";
  protected final String TEXT_1431 = ".";
  protected final String TEXT_1432 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1433 = "} and appends it to the '<em><b>";
  protected final String TEXT_1434 = "</b></em>' ";
  protected final String TEXT_1435 = ".";
  protected final String TEXT_1436 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1437 = "} and sets the '<em><b>";
  protected final String TEXT_1438 = "</b></em>' ";
  protected final String TEXT_1439 = ".";
  protected final String TEXT_1440 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1441 = NL + "\t * @param ";
  protected final String TEXT_1442 = " The ";
  protected final String TEXT_1443 = " for the new {@link ";
  protected final String TEXT_1444 = "}, or <code>null</code>.";
  protected final String TEXT_1445 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1446 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1447 = "}." + NL + "\t * @see #";
  protected final String TEXT_1448 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1449 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1450 = NL + "\t";
  protected final String TEXT_1451 = " create";
  protected final String TEXT_1452 = "(";
  protected final String TEXT_1453 = ", ";
  protected final String TEXT_1454 = " eClass);" + NL;
  protected final String TEXT_1455 = NL + "\t@Override";
  protected final String TEXT_1456 = NL + "\tpublic ";
  protected final String TEXT_1457 = " create";
  protected final String TEXT_1458 = "(";
  protected final String TEXT_1459 = ", ";
  protected final String TEXT_1460 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1461 = " new";
  protected final String TEXT_1462 = " = (";
  protected final String TEXT_1463 = ") create(eClass);";
  protected final String TEXT_1464 = NL + "\t\t";
  protected final String TEXT_1465 = "().add(new";
  protected final String TEXT_1466 = ");";
  protected final String TEXT_1467 = NL + "\t\tset";
  protected final String TEXT_1468 = "(new";
  protected final String TEXT_1469 = ");";
  protected final String TEXT_1470 = NL + "\t\tint ";
  protected final String TEXT_1471 = "ListSize = 0;";
  protected final String TEXT_1472 = NL + "\t\tint ";
  protected final String TEXT_1473 = "Size = ";
  protected final String TEXT_1474 = " == null ? 0 : ";
  protected final String TEXT_1475 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1476 = "Size > ";
  protected final String TEXT_1477 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1478 = "ListSize = ";
  protected final String TEXT_1479 = "Size;";
  protected final String TEXT_1480 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1481 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1482 = ".create";
  protected final String TEXT_1483 = "(";
  protected final String TEXT_1484 = ", ";
  protected final String TEXT_1485 = "i < ";
  protected final String TEXT_1486 = "Size ? (";
  protected final String TEXT_1487 = ") ";
  protected final String TEXT_1488 = ".get(i) : null";
  protected final String TEXT_1489 = ");" + NL + "\t\t}";
  protected final String TEXT_1490 = NL + "\t\tnew";
  protected final String TEXT_1491 = ".create";
  protected final String TEXT_1492 = "(";
  protected final String TEXT_1493 = ", ";
  protected final String TEXT_1494 = ");";
  protected final String TEXT_1495 = NL + "\t\tif (";
  protected final String TEXT_1496 = " != null)";
  protected final String TEXT_1497 = NL + "\t\t\tnew";
  protected final String TEXT_1498 = ".";
  protected final String TEXT_1499 = "().addAll(";
  protected final String TEXT_1500 = ");";
  protected final String TEXT_1501 = NL + "\t\t\tnew";
  protected final String TEXT_1502 = ".set";
  protected final String TEXT_1503 = "(";
  protected final String TEXT_1504 = ");";
  protected final String TEXT_1505 = NL + "\t\treturn new";
  protected final String TEXT_1506 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1507 = NL + "\t/**";
  protected final String TEXT_1508 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1509 = "}, with the specified ";
  protected final String TEXT_1510 = ", and appends it to the '<em><b>";
  protected final String TEXT_1511 = "</b></em>' ";
  protected final String TEXT_1512 = ".";
  protected final String TEXT_1513 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1514 = "},with the specified ";
  protected final String TEXT_1515 = ", and sets the '<em><b>";
  protected final String TEXT_1516 = "</b></em>' ";
  protected final String TEXT_1517 = ".";
  protected final String TEXT_1518 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1519 = "} and appends it to the '<em><b>";
  protected final String TEXT_1520 = "</b></em>' ";
  protected final String TEXT_1521 = ".";
  protected final String TEXT_1522 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1523 = "} and sets the '<em><b>";
  protected final String TEXT_1524 = "</b></em>' ";
  protected final String TEXT_1525 = ".";
  protected final String TEXT_1526 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1527 = NL + "\t * @param ";
  protected final String TEXT_1528 = " The ";
  protected final String TEXT_1529 = " for the new {@link ";
  protected final String TEXT_1530 = "}, or <code>null</code>.";
  protected final String TEXT_1531 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1532 = "}." + NL + "\t * @see #";
  protected final String TEXT_1533 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1534 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1535 = NL + "\t";
  protected final String TEXT_1536 = " create";
  protected final String TEXT_1537 = "(";
  protected final String TEXT_1538 = ");" + NL;
  protected final String TEXT_1539 = NL + "\t@Override";
  protected final String TEXT_1540 = NL + "\tpublic ";
  protected final String TEXT_1541 = " create";
  protected final String TEXT_1542 = "(";
  protected final String TEXT_1543 = ")" + NL + "\t{";
  protected final String TEXT_1544 = NL + "\t\treturn create";
  protected final String TEXT_1545 = "(";
  protected final String TEXT_1546 = ", ";
  protected final String TEXT_1547 = ");";
  protected final String TEXT_1548 = NL + "\t\t";
  protected final String TEXT_1549 = " new";
  protected final String TEXT_1550 = " = (";
  protected final String TEXT_1551 = ") create(";
  protected final String TEXT_1552 = ");";
  protected final String TEXT_1553 = NL + "\t\t";
  protected final String TEXT_1554 = "().add(new";
  protected final String TEXT_1555 = ");";
  protected final String TEXT_1556 = NL + "\t\tset";
  protected final String TEXT_1557 = "(new";
  protected final String TEXT_1558 = ");";
  protected final String TEXT_1559 = NL + "\t\tint ";
  protected final String TEXT_1560 = "ListSize = 0;";
  protected final String TEXT_1561 = NL + "\t\tint ";
  protected final String TEXT_1562 = "Size = ";
  protected final String TEXT_1563 = " == null ? 0 : ";
  protected final String TEXT_1564 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1565 = "Size > ";
  protected final String TEXT_1566 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1567 = "ListSize = ";
  protected final String TEXT_1568 = "Size;";
  protected final String TEXT_1569 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1570 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1571 = ".create";
  protected final String TEXT_1572 = "(";
  protected final String TEXT_1573 = ", ";
  protected final String TEXT_1574 = "i < ";
  protected final String TEXT_1575 = "Size ? (";
  protected final String TEXT_1576 = ") ";
  protected final String TEXT_1577 = ".get(i) : null";
  protected final String TEXT_1578 = ");" + NL + "\t\t}";
  protected final String TEXT_1579 = NL + "\t\tnew";
  protected final String TEXT_1580 = ".create";
  protected final String TEXT_1581 = "(";
  protected final String TEXT_1582 = ", ";
  protected final String TEXT_1583 = ");";
  protected final String TEXT_1584 = NL + "\t\tif (";
  protected final String TEXT_1585 = " != null)";
  protected final String TEXT_1586 = NL + "\t\t\tnew";
  protected final String TEXT_1587 = ".";
  protected final String TEXT_1588 = "().addAll(";
  protected final String TEXT_1589 = ");";
  protected final String TEXT_1590 = NL + "\t\t\tnew";
  protected final String TEXT_1591 = ".set";
  protected final String TEXT_1592 = "(";
  protected final String TEXT_1593 = ");";
  protected final String TEXT_1594 = NL + "\t\treturn new";
  protected final String TEXT_1595 = ";";
  protected final String TEXT_1596 = NL + "\t}" + NL;
  protected final String TEXT_1597 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1598 = "} with the specified ";
  protected final String TEXT_1599 = " from the '<em><b>";
  protected final String TEXT_1600 = "</b></em>' ";
  protected final String TEXT_1601 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1602 = NL + "\t * @param ";
  protected final String TEXT_1603 = " The ";
  protected final String TEXT_1604 = " of the {@link ";
  protected final String TEXT_1605 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1606 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1607 = "} with the specified ";
  protected final String TEXT_1608 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1609 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1610 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1611 = NL + "\t";
  protected final String TEXT_1612 = " get";
  protected final String TEXT_1613 = "(";
  protected final String TEXT_1614 = ");" + NL;
  protected final String TEXT_1615 = NL + "\t@Override";
  protected final String TEXT_1616 = NL + "\tpublic ";
  protected final String TEXT_1617 = " get";
  protected final String TEXT_1618 = "(";
  protected final String TEXT_1619 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1620 = "(";
  protected final String TEXT_1621 = ", false";
  protected final String TEXT_1622 = ", null";
  protected final String TEXT_1623 = ", false";
  protected final String TEXT_1624 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1625 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1626 = "} with the specified ";
  protected final String TEXT_1627 = " from the '<em><b>";
  protected final String TEXT_1628 = "</b></em>' ";
  protected final String TEXT_1629 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1630 = NL + "\t * @param ";
  protected final String TEXT_1631 = " The ";
  protected final String TEXT_1632 = " of the {@link ";
  protected final String TEXT_1633 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1634 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1635 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1636 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1637 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1638 = "} on demand if not found.";
  protected final String TEXT_1639 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1640 = "} with the specified ";
  protected final String TEXT_1641 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1642 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1643 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1644 = NL + "\t";
  protected final String TEXT_1645 = " get";
  protected final String TEXT_1646 = "(";
  protected final String TEXT_1647 = ", boolean ignoreCase";
  protected final String TEXT_1648 = ", ";
  protected final String TEXT_1649 = " eClass";
  protected final String TEXT_1650 = ", boolean createOnDemand";
  protected final String TEXT_1651 = ");" + NL;
  protected final String TEXT_1652 = NL + "\t@Override";
  protected final String TEXT_1653 = NL + "\tpublic ";
  protected final String TEXT_1654 = " get";
  protected final String TEXT_1655 = "(";
  protected final String TEXT_1656 = ", boolean ignoreCase";
  protected final String TEXT_1657 = ", ";
  protected final String TEXT_1658 = " eClass";
  protected final String TEXT_1659 = ", boolean createOnDemand";
  protected final String TEXT_1660 = ")" + NL + "\t{";
  protected final String TEXT_1661 = NL + "\t\t";
  protected final String TEXT_1662 = "Loop: for (";
  protected final String TEXT_1663 = " ";
  protected final String TEXT_1664 = " : ";
  protected final String TEXT_1665 = "())" + NL + "\t\t{";
  protected final String TEXT_1666 = NL + "\t\t";
  protected final String TEXT_1667 = "Loop: for (";
  protected final String TEXT_1668 = " i = ";
  protected final String TEXT_1669 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1670 = " ";
  protected final String TEXT_1671 = " = (";
  protected final String TEXT_1672 = ") i.next();";
  protected final String TEXT_1673 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1674 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1675 = "Loop;";
  protected final String TEXT_1676 = NL + "\t\t\t";
  protected final String TEXT_1677 = " ";
  protected final String TEXT_1678 = "List = ";
  protected final String TEXT_1679 = ".";
  protected final String TEXT_1680 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1681 = "ListSize = ";
  protected final String TEXT_1682 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1683 = " || (";
  protected final String TEXT_1684 = " != null && ";
  protected final String TEXT_1685 = ".size() != ";
  protected final String TEXT_1686 = "ListSize";
  protected final String TEXT_1687 = ")";
  protected final String TEXT_1688 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1689 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1690 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1691 = " ";
  protected final String TEXT_1692 = " = ";
  protected final String TEXT_1693 = "(";
  protected final String TEXT_1694 = ") ";
  protected final String TEXT_1695 = "List.get(j);";
  protected final String TEXT_1696 = NL + "\t\t\t\tif (";
  protected final String TEXT_1697 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1698 = "(";
  protected final String TEXT_1699 = ")";
  protected final String TEXT_1700 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1701 = ".";
  protected final String TEXT_1702 = "()) : ";
  protected final String TEXT_1703 = ".get(j).equals(";
  protected final String TEXT_1704 = ".";
  protected final String TEXT_1705 = "())))";
  protected final String TEXT_1706 = NL + "\t\t\t\tif (";
  protected final String TEXT_1707 = " != null && !";
  protected final String TEXT_1708 = ".get(j).equals(";
  protected final String TEXT_1709 = ".";
  protected final String TEXT_1710 = "()))";
  protected final String TEXT_1711 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1712 = "Loop;";
  protected final String TEXT_1713 = NL + "\t\t\t}";
  protected final String TEXT_1714 = NL + "\t\t\t";
  protected final String TEXT_1715 = " ";
  protected final String TEXT_1716 = " = ";
  protected final String TEXT_1717 = ".";
  protected final String TEXT_1718 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1719 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1720 = "Loop;";
  protected final String TEXT_1721 = NL + "\t\t\tif (";
  protected final String TEXT_1722 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1723 = ".equalsIgnoreCase(";
  protected final String TEXT_1724 = ".";
  protected final String TEXT_1725 = "()) : ";
  protected final String TEXT_1726 = ".equals(";
  protected final String TEXT_1727 = ".";
  protected final String TEXT_1728 = "())))";
  protected final String TEXT_1729 = NL + "\t\t\tif (";
  protected final String TEXT_1730 = " != null && !";
  protected final String TEXT_1731 = ".equals(";
  protected final String TEXT_1732 = ".";
  protected final String TEXT_1733 = "()))";
  protected final String TEXT_1734 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1735 = "Loop;";
  protected final String TEXT_1736 = NL + "\t\t\tif (";
  protected final String TEXT_1737 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1738 = ".equalsIgnoreCase(";
  protected final String TEXT_1739 = ".";
  protected final String TEXT_1740 = "()) : ";
  protected final String TEXT_1741 = ".equals(";
  protected final String TEXT_1742 = ".";
  protected final String TEXT_1743 = "())))";
  protected final String TEXT_1744 = NL + "\t\t\tif (";
  protected final String TEXT_1745 = " != null && !";
  protected final String TEXT_1746 = ".equals(";
  protected final String TEXT_1747 = ".";
  protected final String TEXT_1748 = "()))";
  protected final String TEXT_1749 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1750 = "Loop;";
  protected final String TEXT_1751 = NL + "\t\t\treturn ";
  protected final String TEXT_1752 = ";" + NL + "\t\t}";
  protected final String TEXT_1753 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1754 = " && eClass != null";
  protected final String TEXT_1755 = " ? create";
  protected final String TEXT_1756 = "(";
  protected final String TEXT_1757 = ", eClass";
  protected final String TEXT_1758 = ") : null;";
  protected final String TEXT_1759 = NL + "\t\treturn null;";
  protected final String TEXT_1760 = NL + "\t}" + NL;
  protected final String TEXT_1761 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1762 = "()" + NL + "\t{";
  protected final String TEXT_1763 = NL + "  \t\treturn false;";
  protected final String TEXT_1764 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1765 = ");";
  protected final String TEXT_1766 = NL + "\t\treturn !((";
  protected final String TEXT_1767 = ".Internal.Wrapper)";
  protected final String TEXT_1768 = "()).featureMap().isEmpty();";
  protected final String TEXT_1769 = NL + "\t\treturn ";
  protected final String TEXT_1770 = " != null && !";
  protected final String TEXT_1771 = ".featureMap().isEmpty();";
  protected final String TEXT_1772 = NL + "\t\treturn ";
  protected final String TEXT_1773 = " != null && !";
  protected final String TEXT_1774 = ".isEmpty();";
  protected final String TEXT_1775 = NL + "\t\t";
  protected final String TEXT_1776 = " ";
  protected final String TEXT_1777 = " = (";
  protected final String TEXT_1778 = ")eVirtualGet(";
  protected final String TEXT_1779 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1780 = " != null && !";
  protected final String TEXT_1781 = ".isEmpty();";
  protected final String TEXT_1782 = NL + "\t\treturn !";
  protected final String TEXT_1783 = "().isEmpty();";
  protected final String TEXT_1784 = NL + "\t\treturn ";
  protected final String TEXT_1785 = " != null;";
  protected final String TEXT_1786 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1787 = ") != null;";
  protected final String TEXT_1788 = NL + "\t\treturn basicGet";
  protected final String TEXT_1789 = "() != null;";
  protected final String TEXT_1790 = NL + "\t\treturn ";
  protected final String TEXT_1791 = " != null;";
  protected final String TEXT_1792 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1793 = ") != null;";
  protected final String TEXT_1794 = NL + "\t\treturn ";
  protected final String TEXT_1795 = "() != null;";
  protected final String TEXT_1796 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1797 = " & ";
  protected final String TEXT_1798 = "_EFLAG) != 0) != ";
  protected final String TEXT_1799 = ";";
  protected final String TEXT_1800 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1801 = " & ";
  protected final String TEXT_1802 = "_EFLAG) != ";
  protected final String TEXT_1803 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1804 = NL + "\t\treturn ";
  protected final String TEXT_1805 = " != ";
  protected final String TEXT_1806 = ";";
  protected final String TEXT_1807 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1808 = ", ";
  protected final String TEXT_1809 = ") != ";
  protected final String TEXT_1810 = ";";
  protected final String TEXT_1811 = NL + "\t\treturn ";
  protected final String TEXT_1812 = "() != ";
  protected final String TEXT_1813 = ";";
  protected final String TEXT_1814 = NL + "\t\treturn ";
  protected final String TEXT_1815 = " == null ? ";
  protected final String TEXT_1816 = " != null : !";
  protected final String TEXT_1817 = ".equals(";
  protected final String TEXT_1818 = ");";
  protected final String TEXT_1819 = NL + "\t\t";
  protected final String TEXT_1820 = " ";
  protected final String TEXT_1821 = " = (";
  protected final String TEXT_1822 = ")eVirtualGet(";
  protected final String TEXT_1823 = ", ";
  protected final String TEXT_1824 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1825 = " == null ? ";
  protected final String TEXT_1826 = " != null : !";
  protected final String TEXT_1827 = ".equals(";
  protected final String TEXT_1828 = ");";
  protected final String TEXT_1829 = NL + "\t\treturn ";
  protected final String TEXT_1830 = " == null ? ";
  protected final String TEXT_1831 = "() != null : !";
  protected final String TEXT_1832 = ".equals(";
  protected final String TEXT_1833 = "());";
  protected final String TEXT_1834 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1835 = ");";
  protected final String TEXT_1836 = NL + "\t\t";
  protected final String TEXT_1837 = " ";
  protected final String TEXT_1838 = " = (";
  protected final String TEXT_1839 = ")eVirtualGet(";
  protected final String TEXT_1840 = ");";
  protected final String TEXT_1841 = NL + "\t\treturn ";
  protected final String TEXT_1842 = " != null && ((";
  protected final String TEXT_1843 = ".Unsettable";
  protected final String TEXT_1844 = ")";
  protected final String TEXT_1845 = ").isSet();";
  protected final String TEXT_1846 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1847 = ");";
  protected final String TEXT_1848 = NL + "\t\treturn (";
  protected final String TEXT_1849 = " & ";
  protected final String TEXT_1850 = "_ESETFLAG) != 0;";
  protected final String TEXT_1851 = NL + "\t\treturn ";
  protected final String TEXT_1852 = "ESet;";
  protected final String TEXT_1853 = NL + "\t\treturn !((";
  protected final String TEXT_1854 = ".Internal)((";
  protected final String TEXT_1855 = ".Internal.Wrapper)get";
  protected final String TEXT_1856 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1857 = ");";
  protected final String TEXT_1858 = NL + "\t\treturn !((";
  protected final String TEXT_1859 = ".Internal)get";
  protected final String TEXT_1860 = "()).isEmpty(";
  protected final String TEXT_1861 = ");";
  protected final String TEXT_1862 = NL + "\t\treturn ";
  protected final String TEXT_1863 = ".";
  protected final String TEXT_1864 = "(this);";
  protected final String TEXT_1865 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1866 = "' ";
  protected final String TEXT_1867 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1868 = NL + "\t}" + NL;
  protected final String TEXT_1869 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_1870 = "(";
  protected final String TEXT_1871 = ") <em>";
  protected final String TEXT_1872 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1873 = "(";
  protected final String TEXT_1874 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1875 = " ";
  protected final String TEXT_1876 = "__EOCL_EXP = \"";
  protected final String TEXT_1877 = "\";";
  protected final String TEXT_1878 = NL;
  protected final String TEXT_1879 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_1880 = "(";
  protected final String TEXT_1881 = ") <em>";
  protected final String TEXT_1882 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1883 = "(";
  protected final String TEXT_1884 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1885 = " ";
  protected final String TEXT_1886 = "__EOCL_INV;" + NL;
  protected final String TEXT_1887 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_1888 = "(";
  protected final String TEXT_1889 = ") <em>";
  protected final String TEXT_1890 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1891 = "(";
  protected final String TEXT_1892 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1893 = "<";
  protected final String TEXT_1894 = ">";
  protected final String TEXT_1895 = " ";
  protected final String TEXT_1896 = "__EOCL_QRY;" + NL;
  protected final String TEXT_1897 = NL + "\t/**";
  protected final String TEXT_1898 = NL + "\t * <p>" + NL + "\t * This operation redefines the following operations:" + NL + "\t * <ul>";
  protected final String TEXT_1899 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_1900 = "#";
  protected final String TEXT_1901 = "(";
  protected final String TEXT_1902 = ") <em>";
  protected final String TEXT_1903 = "</em>}' </li>";
  protected final String TEXT_1904 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_1905 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1906 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1907 = NL + "\t * ";
  protected final String TEXT_1908 = NL + "\t * @param ";
  protected final String TEXT_1909 = NL + "\t *   ";
  protected final String TEXT_1910 = NL + "\t * @param ";
  protected final String TEXT_1911 = " ";
  protected final String TEXT_1912 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1913 = NL + "\t * @model ";
  protected final String TEXT_1914 = NL + "\t *        ";
  protected final String TEXT_1915 = NL + "\t * @model";
  protected final String TEXT_1916 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1917 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1918 = NL + "\t@Override";
  protected final String TEXT_1919 = NL + "\t";
  protected final String TEXT_1920 = " ";
  protected final String TEXT_1921 = "(";
  protected final String TEXT_1922 = ")";
  protected final String TEXT_1923 = ";" + NL;
  protected final String TEXT_1924 = NL + "\tpublic ";
  protected final String TEXT_1925 = " ";
  protected final String TEXT_1926 = "(";
  protected final String TEXT_1927 = ")";
  protected final String TEXT_1928 = NL + "\t{";
  protected final String TEXT_1929 = NL + "\t\t";
  protected final String TEXT_1930 = NL + "\t\treturn ";
  protected final String TEXT_1931 = ".";
  protected final String TEXT_1932 = "(this, ";
  protected final String TEXT_1933 = ", ";
  protected final String TEXT_1934 = ");";
  protected final String TEXT_1935 = NL + "\t\tif (";
  protected final String TEXT_1936 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1937 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_1938 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1939 = " = helper.createInvariant(";
  protected final String TEXT_1940 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_1941 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_1942 = ").check(this))";
  protected final String TEXT_1943 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_1944 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1945 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1946 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1947 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1948 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1949 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1950 = ".";
  protected final String TEXT_1951 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1952 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1953 = "\", ";
  protected final String TEXT_1954 = ".getObjectLabel(this, ";
  protected final String TEXT_1955 = ") }),";
  protected final String TEXT_1956 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1957 = NL + "\t\t";
  protected final String TEXT_1958 = ".";
  protected final String TEXT_1959 = "(this";
  protected final String TEXT_1960 = ", ";
  protected final String TEXT_1961 = ");";
  protected final String TEXT_1962 = NL + "\t\t";
  protected final String TEXT_1963 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_1964 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1965 = NL + "\t\t\t";
  protected final String TEXT_1966 = " result = (";
  protected final String TEXT_1967 = ") cache.get(";
  protected final String TEXT_1968 = "eResource(), ";
  protected final String TEXT_1969 = "this, ";
  protected final String TEXT_1970 = ".getEOperations().get(";
  protected final String TEXT_1971 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1972 = "eResource(), ";
  protected final String TEXT_1973 = "this, ";
  protected final String TEXT_1974 = ".getEOperations().get(";
  protected final String TEXT_1975 = "), result = ";
  protected final String TEXT_1976 = "new ";
  protected final String TEXT_1977 = "(";
  protected final String TEXT_1978 = ".";
  protected final String TEXT_1979 = "(this";
  protected final String TEXT_1980 = ", ";
  protected final String TEXT_1981 = ")";
  protected final String TEXT_1982 = ")";
  protected final String TEXT_1983 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1984 = ".";
  protected final String TEXT_1985 = "()";
  protected final String TEXT_1986 = ";" + NL + "\t\t}";
  protected final String TEXT_1987 = NL + "\t\treturn ";
  protected final String TEXT_1988 = ".";
  protected final String TEXT_1989 = "(this";
  protected final String TEXT_1990 = ", ";
  protected final String TEXT_1991 = ");";
  protected final String TEXT_1992 = NL + "\t\tif (";
  protected final String TEXT_1993 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1994 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_1995 = ", ";
  protected final String TEXT_1996 = ".getEAllOperations().get(";
  protected final String TEXT_1997 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1998 = " = helper.createQuery(";
  protected final String TEXT_1999 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2000 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_2001 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_2002 = ");";
  protected final String TEXT_2003 = NL + "\t\t";
  protected final String TEXT_2004 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_2005 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_2006 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_2007 = "\", ";
  protected final String TEXT_2008 = ");";
  protected final String TEXT_2009 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2010 = NL + "\t\t";
  protected final String TEXT_2011 = "<";
  protected final String TEXT_2012 = "> result = (";
  protected final String TEXT_2013 = "<";
  protected final String TEXT_2014 = ">) query.evaluate(this);" + NL + "\t\treturn new ";
  protected final String TEXT_2015 = ".UnmodifiableEList<";
  protected final String TEXT_2016 = ">(result.size(), result.toArray());";
  protected final String TEXT_2017 = NL + "\t\treturn ((";
  protected final String TEXT_2018 = ") query.evaluate(this)).";
  protected final String TEXT_2019 = "();";
  protected final String TEXT_2020 = NL + "\t\treturn (";
  protected final String TEXT_2021 = ") query.evaluate(this);";
  protected final String TEXT_2022 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2023 = NL + "\t}" + NL;
  protected final String TEXT_2024 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2025 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2026 = NL + "\t@Override";
  protected final String TEXT_2027 = NL + "\tpublic ";
  protected final String TEXT_2028 = " eInverseAdd(";
  protected final String TEXT_2029 = " otherEnd, int featureID, ";
  protected final String TEXT_2030 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2031 = ")" + NL + "\t\t{";
  protected final String TEXT_2032 = NL + "\t\t\tcase ";
  protected final String TEXT_2033 = ":";
  protected final String TEXT_2034 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2035 = "(";
  protected final String TEXT_2036 = ".InternalMapView";
  protected final String TEXT_2037 = ")";
  protected final String TEXT_2038 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2039 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2040 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2041 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2042 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2043 = "((";
  protected final String TEXT_2044 = ")otherEnd, msgs);";
  protected final String TEXT_2045 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_2046 = ", msgs);";
  protected final String TEXT_2047 = NL + "\t\t\t\t";
  protected final String TEXT_2048 = " ";
  protected final String TEXT_2049 = " = (";
  protected final String TEXT_2050 = ")eVirtualGet(";
  protected final String TEXT_2051 = ");";
  protected final String TEXT_2052 = NL + "\t\t\t\t";
  protected final String TEXT_2053 = " ";
  protected final String TEXT_2054 = " = ";
  protected final String TEXT_2055 = "basicGet";
  protected final String TEXT_2056 = "();";
  protected final String TEXT_2057 = NL + "\t\t\t\tif (";
  protected final String TEXT_2058 = " != null)";
  protected final String TEXT_2059 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2060 = ")";
  protected final String TEXT_2061 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_2062 = ", null, msgs);";
  protected final String TEXT_2063 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2064 = ")";
  protected final String TEXT_2065 = ").eInverseRemove(this, ";
  protected final String TEXT_2066 = ", ";
  protected final String TEXT_2067 = ".class, msgs);";
  protected final String TEXT_2068 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2069 = "((";
  protected final String TEXT_2070 = ")otherEnd, msgs);";
  protected final String TEXT_2071 = NL + "\t\t}";
  protected final String TEXT_2072 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2073 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2074 = NL + "\t}" + NL;
  protected final String TEXT_2075 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2076 = NL + "\t@Override";
  protected final String TEXT_2077 = NL + "\tpublic ";
  protected final String TEXT_2078 = " eInverseRemove(";
  protected final String TEXT_2079 = " otherEnd, int featureID, ";
  protected final String TEXT_2080 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2081 = ")" + NL + "\t\t{";
  protected final String TEXT_2082 = NL + "\t\t\tcase ";
  protected final String TEXT_2083 = ":";
  protected final String TEXT_2084 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2085 = ")((";
  protected final String TEXT_2086 = ".InternalMapView";
  protected final String TEXT_2087 = ")";
  protected final String TEXT_2088 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2089 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2090 = ")((";
  protected final String TEXT_2091 = ".Internal.Wrapper)";
  protected final String TEXT_2092 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2093 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2094 = ")";
  protected final String TEXT_2095 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2096 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_2097 = ", msgs);";
  protected final String TEXT_2098 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_2099 = "(msgs);";
  protected final String TEXT_2100 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2101 = "(null, msgs);";
  protected final String TEXT_2102 = NL + "\t\t}";
  protected final String TEXT_2103 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2104 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2105 = NL + "\t}" + NL;
  protected final String TEXT_2106 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2107 = NL + "\t@Override";
  protected final String TEXT_2108 = NL + "\tpublic ";
  protected final String TEXT_2109 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_2110 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID()";
  protected final String TEXT_2111 = ")" + NL + "\t\t{";
  protected final String TEXT_2112 = NL + "\t\t\tcase ";
  protected final String TEXT_2113 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_2114 = ", ";
  protected final String TEXT_2115 = ".class, msgs);";
  protected final String TEXT_2116 = NL + "\t\t}";
  protected final String TEXT_2117 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_2118 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2119 = NL + "\t}" + NL;
  protected final String TEXT_2120 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2121 = NL + "\t@Override";
  protected final String TEXT_2122 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2123 = ")" + NL + "\t\t{";
  protected final String TEXT_2124 = NL + "\t\t\tcase ";
  protected final String TEXT_2125 = ":";
  protected final String TEXT_2126 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2127 = "();";
  protected final String TEXT_2128 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2129 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_2130 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_2131 = "(";
  protected final String TEXT_2132 = "());";
  protected final String TEXT_2133 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_2134 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2135 = "();";
  protected final String TEXT_2136 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2137 = ".InternalMapView";
  protected final String TEXT_2138 = ")";
  protected final String TEXT_2139 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2140 = "();";
  protected final String TEXT_2141 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2142 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2143 = "().map();";
  protected final String TEXT_2144 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2145 = ".Internal.Wrapper)";
  protected final String TEXT_2146 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2147 = "();";
  protected final String TEXT_2148 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2149 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_2150 = ".Internal)";
  protected final String TEXT_2151 = "()).getWrapper();";
  protected final String TEXT_2152 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2153 = "();";
  protected final String TEXT_2154 = NL + "\t\t}";
  protected final String TEXT_2155 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_2156 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_2157 = NL + "\t}" + NL;
  protected final String TEXT_2158 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2159 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2160 = NL + "\t@Override";
  protected final String TEXT_2161 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2162 = ")" + NL + "\t\t{";
  protected final String TEXT_2163 = NL + "\t\t\tcase ";
  protected final String TEXT_2164 = ":";
  protected final String TEXT_2165 = NL + "\t\t\t\t((";
  protected final String TEXT_2166 = ".Internal)((";
  protected final String TEXT_2167 = ".Internal.Wrapper)";
  protected final String TEXT_2168 = "()).featureMap()).set(newValue);";
  protected final String TEXT_2169 = NL + "\t\t\t\t((";
  protected final String TEXT_2170 = ".Internal)";
  protected final String TEXT_2171 = "()).set(newValue);";
  protected final String TEXT_2172 = NL + "\t\t\t\t((";
  protected final String TEXT_2173 = ".Setting)((";
  protected final String TEXT_2174 = ".InternalMapView";
  protected final String TEXT_2175 = ")";
  protected final String TEXT_2176 = "()).eMap()).set(newValue);";
  protected final String TEXT_2177 = NL + "\t\t\t\t((";
  protected final String TEXT_2178 = ".Setting)";
  protected final String TEXT_2179 = "()).set(newValue);";
  protected final String TEXT_2180 = NL + "\t\t\t\t";
  protected final String TEXT_2181 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_2182 = "().addAll((";
  protected final String TEXT_2183 = "<? extends ";
  protected final String TEXT_2184 = ">";
  protected final String TEXT_2185 = ")newValue);";
  protected final String TEXT_2186 = NL + "\t\t\t\tset";
  protected final String TEXT_2187 = "(((";
  protected final String TEXT_2188 = ")newValue).";
  protected final String TEXT_2189 = "());";
  protected final String TEXT_2190 = NL + "\t\t\t\tset";
  protected final String TEXT_2191 = "(";
  protected final String TEXT_2192 = "(";
  protected final String TEXT_2193 = ")";
  protected final String TEXT_2194 = "newValue);";
  protected final String TEXT_2195 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2196 = NL + "\t\t}";
  protected final String TEXT_2197 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_2198 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_2199 = NL + "\t}" + NL;
  protected final String TEXT_2200 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2201 = NL + "\t@Override";
  protected final String TEXT_2202 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2203 = ")" + NL + "\t\t{";
  protected final String TEXT_2204 = NL + "\t\t\tcase ";
  protected final String TEXT_2205 = ":";
  protected final String TEXT_2206 = NL + "\t\t\t\t((";
  protected final String TEXT_2207 = ".Internal.Wrapper)";
  protected final String TEXT_2208 = "()).featureMap().clear();";
  protected final String TEXT_2209 = NL + "\t\t\t\t";
  protected final String TEXT_2210 = "().clear();";
  protected final String TEXT_2211 = NL + "\t\t\t\tunset";
  protected final String TEXT_2212 = "();";
  protected final String TEXT_2213 = NL + "\t\t\t\tset";
  protected final String TEXT_2214 = "((";
  protected final String TEXT_2215 = ")null);";
  protected final String TEXT_2216 = NL + "\t\t\t\tset";
  protected final String TEXT_2217 = "(";
  protected final String TEXT_2218 = ");";
  protected final String TEXT_2219 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2220 = NL + "\t\t}";
  protected final String TEXT_2221 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_2222 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_2223 = NL + "\t}" + NL;
  protected final String TEXT_2224 = NL;
  protected final String TEXT_2225 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2226 = NL + "\t@Override";
  protected final String TEXT_2227 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_2228 = NL + "\t\t\tcase ";
  protected final String TEXT_2229 = ":";
  protected final String TEXT_2230 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2231 = "();";
  protected final String TEXT_2232 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_2233 = ".Internal.Wrapper)";
  protected final String TEXT_2234 = "()).featureMap().isEmpty();";
  protected final String TEXT_2235 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2236 = " != null && !";
  protected final String TEXT_2237 = ".featureMap().isEmpty();";
  protected final String TEXT_2238 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2239 = " != null && !";
  protected final String TEXT_2240 = ".isEmpty();";
  protected final String TEXT_2241 = NL + "\t\t\t\t";
  protected final String TEXT_2242 = " ";
  protected final String TEXT_2243 = " = (";
  protected final String TEXT_2244 = ")eVirtualGet(";
  protected final String TEXT_2245 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2246 = " != null && !";
  protected final String TEXT_2247 = ".isEmpty();";
  protected final String TEXT_2248 = NL + "\t\t\t\treturn !";
  protected final String TEXT_2249 = "().isEmpty();";
  protected final String TEXT_2250 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2251 = "();";
  protected final String TEXT_2252 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2253 = " != null;";
  protected final String TEXT_2254 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2255 = ") != null;";
  protected final String TEXT_2256 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2257 = "() != null;";
  protected final String TEXT_2258 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2259 = " != null;";
  protected final String TEXT_2260 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2261 = ") != null;";
  protected final String TEXT_2262 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2263 = "() != null;";
  protected final String TEXT_2264 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2265 = " & ";
  protected final String TEXT_2266 = "_EFLAG) != 0) != ";
  protected final String TEXT_2267 = ";";
  protected final String TEXT_2268 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2269 = " & ";
  protected final String TEXT_2270 = "_EFLAG) != ";
  protected final String TEXT_2271 = "_EFLAG_DEFAULT;";
  protected final String TEXT_2272 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2273 = " != ";
  protected final String TEXT_2274 = ";";
  protected final String TEXT_2275 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2276 = ", ";
  protected final String TEXT_2277 = ") != ";
  protected final String TEXT_2278 = ";";
  protected final String TEXT_2279 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2280 = "() != ";
  protected final String TEXT_2281 = ";";
  protected final String TEXT_2282 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2283 = " == null ? ";
  protected final String TEXT_2284 = " != null : !";
  protected final String TEXT_2285 = ".equals(";
  protected final String TEXT_2286 = ");";
  protected final String TEXT_2287 = NL + "\t\t\t\t";
  protected final String TEXT_2288 = " ";
  protected final String TEXT_2289 = " = (";
  protected final String TEXT_2290 = ")eVirtualGet(";
  protected final String TEXT_2291 = ", ";
  protected final String TEXT_2292 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2293 = " == null ? ";
  protected final String TEXT_2294 = " != null : !";
  protected final String TEXT_2295 = ".equals(";
  protected final String TEXT_2296 = ");";
  protected final String TEXT_2297 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2298 = " == null ? ";
  protected final String TEXT_2299 = "() != null : !";
  protected final String TEXT_2300 = ".equals(";
  protected final String TEXT_2301 = "());";
  protected final String TEXT_2302 = NL + "\t\t}";
  protected final String TEXT_2303 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2304 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2305 = NL + "\t}" + NL;
  protected final String TEXT_2306 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2307 = NL + "\t@Override";
  protected final String TEXT_2308 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2309 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2310 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2311 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_2312 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2313 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2314 = ": return ";
  protected final String TEXT_2315 = ";";
  protected final String TEXT_2316 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2317 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_2318 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2319 = NL + "\t@Override";
  protected final String TEXT_2320 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2321 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2322 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2323 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2324 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2325 = ": return ";
  protected final String TEXT_2326 = ";";
  protected final String TEXT_2327 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2328 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2329 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_2330 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2331 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2332 = ": return ";
  protected final String TEXT_2333 = ";";
  protected final String TEXT_2334 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2335 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2336 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2337 = NL + "\t@Override";
  protected final String TEXT_2338 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2339 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2340 = NL + "\t@Override";
  protected final String TEXT_2341 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2342 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2343 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2344 = NL + "\t@Override";
  protected final String TEXT_2345 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2346 = NL + "\t\t\tcase ";
  protected final String TEXT_2347 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2348 = ";";
  protected final String TEXT_2349 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2350 = NL + "\t@Override";
  protected final String TEXT_2351 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2352 = NL + "\t\t\tcase ";
  protected final String TEXT_2353 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2354 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2355 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2356 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2357 = NL + "\t@Override";
  protected final String TEXT_2358 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2359 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2360 = ": \");";
  protected final String TEXT_2361 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2362 = ": \");";
  protected final String TEXT_2363 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2364 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2365 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2366 = NL + "\t\tif (";
  protected final String TEXT_2367 = "(";
  protected final String TEXT_2368 = " & ";
  protected final String TEXT_2369 = "_ESETFLAG) != 0";
  protected final String TEXT_2370 = "ESet";
  protected final String TEXT_2371 = ") result.append((";
  protected final String TEXT_2372 = " & ";
  protected final String TEXT_2373 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2374 = NL + "\t\tif (";
  protected final String TEXT_2375 = "(";
  protected final String TEXT_2376 = " & ";
  protected final String TEXT_2377 = "_ESETFLAG) != 0";
  protected final String TEXT_2378 = "ESet";
  protected final String TEXT_2379 = ") result.append(";
  protected final String TEXT_2380 = "_EFLAG_VALUES[(";
  protected final String TEXT_2381 = " & ";
  protected final String TEXT_2382 = "_EFLAG) >>> ";
  protected final String TEXT_2383 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_2384 = NL + "\t\tif (";
  protected final String TEXT_2385 = "(";
  protected final String TEXT_2386 = " & ";
  protected final String TEXT_2387 = "_ESETFLAG) != 0";
  protected final String TEXT_2388 = "ESet";
  protected final String TEXT_2389 = ") result.append(";
  protected final String TEXT_2390 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2391 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2392 = ", ";
  protected final String TEXT_2393 = "));";
  protected final String TEXT_2394 = NL + "\t\tresult.append((";
  protected final String TEXT_2395 = " & ";
  protected final String TEXT_2396 = "_EFLAG) != 0);";
  protected final String TEXT_2397 = NL + "\t\tresult.append(";
  protected final String TEXT_2398 = "_EFLAG_VALUES[(";
  protected final String TEXT_2399 = " & ";
  protected final String TEXT_2400 = "_EFLAG) >>> ";
  protected final String TEXT_2401 = "_EFLAG_OFFSET]);";
  protected final String TEXT_2402 = NL + "\t\tresult.append(";
  protected final String TEXT_2403 = ");";
  protected final String TEXT_2404 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2405 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2406 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2407 = " getKey()" + NL + "\t{";
  protected final String TEXT_2408 = NL + "\t\treturn new ";
  protected final String TEXT_2409 = "(getTypedKey());";
  protected final String TEXT_2410 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2411 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2412 = " key)" + NL + "\t{";
  protected final String TEXT_2413 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2414 = "(";
  protected final String TEXT_2415 = ")";
  protected final String TEXT_2416 = "key);";
  protected final String TEXT_2417 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2418 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2419 = ")key).";
  protected final String TEXT_2420 = "());";
  protected final String TEXT_2421 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2422 = ")key);";
  protected final String TEXT_2423 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2424 = " getValue()" + NL + "\t{";
  protected final String TEXT_2425 = NL + "\t\treturn new ";
  protected final String TEXT_2426 = "(getTypedValue());";
  protected final String TEXT_2427 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2428 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2429 = " setValue(";
  protected final String TEXT_2430 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2431 = " oldValue = getValue();";
  protected final String TEXT_2432 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2433 = "(";
  protected final String TEXT_2434 = ")";
  protected final String TEXT_2435 = "value);";
  protected final String TEXT_2436 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2437 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2438 = ")value).";
  protected final String TEXT_2439 = "());";
  protected final String TEXT_2440 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2441 = ")value);";
  protected final String TEXT_2442 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2443 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2444 = NL + "\tpublic ";
  protected final String TEXT_2445 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2446 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2447 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2448 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2449 = " EOCL_ENV = ";
  protected final String TEXT_2450 = ".newInstance();" + NL;
  protected final String TEXT_2451 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2452 = " create(";
  protected final String TEXT_2453 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2454 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2455 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2456 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2457 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2458 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2459 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2460 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2461 = NL + "\t@Override";
  protected final String TEXT_2462 = NL + "\tprotected ";
  protected final String TEXT_2463 = " ";
  protected final String TEXT_2464 = "Helper(";
  protected final String TEXT_2465 = " ";
  protected final String TEXT_2466 = ")" + NL + "\t{";
  protected final String TEXT_2467 = NL + "\t\t";
  protected final String TEXT_2468 = ".addAll(super.";
  protected final String TEXT_2469 = "());";
  protected final String TEXT_2470 = NL + "\t\tsuper.";
  protected final String TEXT_2471 = "Helper(";
  protected final String TEXT_2472 = ");";
  protected final String TEXT_2473 = NL + "\t\tif (isSet";
  protected final String TEXT_2474 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2475 = "<";
  protected final String TEXT_2476 = ">";
  protected final String TEXT_2477 = " i = ((";
  protected final String TEXT_2478 = ") ";
  protected final String TEXT_2479 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2480 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2481 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2482 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2483 = "<";
  protected final String TEXT_2484 = ">";
  protected final String TEXT_2485 = " i = ((";
  protected final String TEXT_2486 = ") ";
  protected final String TEXT_2487 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2488 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2489 = NL + "\t\t";
  protected final String TEXT_2490 = " ";
  protected final String TEXT_2491 = " = ";
  protected final String TEXT_2492 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2493 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2494 = "<";
  protected final String TEXT_2495 = ">";
  protected final String TEXT_2496 = " i = ((";
  protected final String TEXT_2497 = ") ";
  protected final String TEXT_2498 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2499 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2500 = NL + "\t\tif (isSet";
  protected final String TEXT_2501 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2502 = ".addAll(";
  protected final String TEXT_2503 = "());" + NL + "\t\t}";
  protected final String TEXT_2504 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2505 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2506 = ".addAll(";
  protected final String TEXT_2507 = "());" + NL + "\t\t}";
  protected final String TEXT_2508 = NL + "\t\t";
  protected final String TEXT_2509 = " ";
  protected final String TEXT_2510 = " = ";
  protected final String TEXT_2511 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2512 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2513 = ".addAll(";
  protected final String TEXT_2514 = ");" + NL + "\t\t}";
  protected final String TEXT_2515 = NL + "\t\tif (isSet";
  protected final String TEXT_2516 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2517 = ".add(";
  protected final String TEXT_2518 = "basicGet";
  protected final String TEXT_2519 = "());" + NL + "\t\t}";
  protected final String TEXT_2520 = NL + "\t\t";
  protected final String TEXT_2521 = " ";
  protected final String TEXT_2522 = " = ";
  protected final String TEXT_2523 = "basicGet";
  protected final String TEXT_2524 = "();" + NL + "\t\tif (";
  protected final String TEXT_2525 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2526 = ".add(";
  protected final String TEXT_2527 = ");" + NL + "\t\t}";
  protected final String TEXT_2528 = NL + "\t\treturn ";
  protected final String TEXT_2529 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2530 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2531 = NL + "\t@Override";
  protected final String TEXT_2532 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2533 = "()" + NL + "\t{";
  protected final String TEXT_2534 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2535 = "()";
  protected final String TEXT_2536 = NL + "\t\treturn isSet";
  protected final String TEXT_2537 = "()";
  protected final String TEXT_2538 = ";";
  protected final String TEXT_2539 = NL + "\t\treturn !";
  protected final String TEXT_2540 = "().isEmpty()";
  protected final String TEXT_2541 = ";";
  protected final String TEXT_2542 = NL + "\t\treturn ";
  protected final String TEXT_2543 = "basicGet";
  protected final String TEXT_2544 = "() != null";
  protected final String TEXT_2545 = ";";
  protected final String TEXT_2546 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2547 = ")";
  protected final String TEXT_2548 = ";";
  protected final String TEXT_2549 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2550 = "()";
  protected final String TEXT_2551 = ";";
  protected final String TEXT_2552 = NL + "\t\t\t|| !";
  protected final String TEXT_2553 = "().isEmpty()";
  protected final String TEXT_2554 = ";";
  protected final String TEXT_2555 = NL + "\t\t\t|| ";
  protected final String TEXT_2556 = "basicGet";
  protected final String TEXT_2557 = "() != null";
  protected final String TEXT_2558 = ";";
  protected final String TEXT_2559 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2560 = ")";
  protected final String TEXT_2561 = ";";
  protected final String TEXT_2562 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2563 = "();";
  protected final String TEXT_2564 = NL + "\t\treturn false;";
  protected final String TEXT_2565 = NL + "\t}" + NL;
  protected final String TEXT_2566 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2567 = NL + "\t@Override";
  protected final String TEXT_2568 = NL + "\tpublic ";
  protected final String TEXT_2569 = " ";
  protected final String TEXT_2570 = "()" + NL + "\t{";
  protected final String TEXT_2571 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2572 = " ";
  protected final String TEXT_2573 = " = (";
  protected final String TEXT_2574 = ")((";
  protected final String TEXT_2575 = ")";
  protected final String TEXT_2576 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2577 = ";";
  protected final String TEXT_2578 = NL + "\t\treturn ";
  protected final String TEXT_2579 = "();";
  protected final String TEXT_2580 = NL + "\t\treturn new ";
  protected final String TEXT_2581 = ".UnmodifiableEList";
  protected final String TEXT_2582 = "(this, ";
  protected final String TEXT_2583 = "null";
  protected final String TEXT_2584 = ", 0, ";
  protected final String TEXT_2585 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2586 = NL + "\t\treturn null;";
  protected final String TEXT_2587 = NL + "\t\treturn ";
  protected final String TEXT_2588 = "();";
  protected final String TEXT_2589 = NL + "\t}" + NL;
  protected final String TEXT_2590 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2591 = NL + "\t@Override";
  protected final String TEXT_2592 = NL + "\tpublic ";
  protected final String TEXT_2593 = " basicGet";
  protected final String TEXT_2594 = "()" + NL + "\t{";
  protected final String TEXT_2595 = NL + "\t\treturn null;";
  protected final String TEXT_2596 = NL + "\t\treturn ";
  protected final String TEXT_2597 = "basicGet";
  protected final String TEXT_2598 = "();";
  protected final String TEXT_2599 = NL + "\t}" + NL;
  protected final String TEXT_2600 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2601 = NL + "\t@Override";
  protected final String TEXT_2602 = NL + "\tpublic ";
  protected final String TEXT_2603 = " basicSet";
  protected final String TEXT_2604 = "(";
  protected final String TEXT_2605 = " new";
  protected final String TEXT_2606 = ", ";
  protected final String TEXT_2607 = " msgs)" + NL + "\t{";
  protected final String TEXT_2608 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2609 = NL + "\t\tif (new";
  protected final String TEXT_2610 = " != null && !(new";
  protected final String TEXT_2611 = " instanceof ";
  protected final String TEXT_2612 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2613 = "));" + NL + "\t\t}";
  protected final String TEXT_2614 = NL + "\t\treturn basicSet";
  protected final String TEXT_2615 = "(";
  protected final String TEXT_2616 = "(";
  protected final String TEXT_2617 = ") ";
  protected final String TEXT_2618 = "new";
  protected final String TEXT_2619 = ", msgs);";
  protected final String TEXT_2620 = NL + "\t\tset";
  protected final String TEXT_2621 = "(";
  protected final String TEXT_2622 = "(";
  protected final String TEXT_2623 = ") ";
  protected final String TEXT_2624 = "new";
  protected final String TEXT_2625 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2626 = NL + "\t}" + NL;
  protected final String TEXT_2627 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2628 = NL + "\t@Override";
  protected final String TEXT_2629 = NL + "\tpublic void set";
  protected final String TEXT_2630 = "(";
  protected final String TEXT_2631 = " new";
  protected final String TEXT_2632 = ")" + NL + "\t{";
  protected final String TEXT_2633 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2634 = NL + "\t\tif (new";
  protected final String TEXT_2635 = " != null && !(new";
  protected final String TEXT_2636 = " instanceof ";
  protected final String TEXT_2637 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2638 = "));" + NL + "\t\t}";
  protected final String TEXT_2639 = NL + "\t\tset";
  protected final String TEXT_2640 = "(";
  protected final String TEXT_2641 = "(";
  protected final String TEXT_2642 = ") ";
  protected final String TEXT_2643 = "new";
  protected final String TEXT_2644 = ");";
  protected final String TEXT_2645 = NL + "\t}" + NL;
  protected final String TEXT_2646 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2647 = "() <em>";
  protected final String TEXT_2648 = "</em>}' ";
  protected final String TEXT_2649 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2650 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2651 = "_ESUBSETS = ";
  protected final String TEXT_2652 = ";" + NL;
  protected final String TEXT_2653 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2654 = "() <em>";
  protected final String TEXT_2655 = "</em>}' ";
  protected final String TEXT_2656 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2657 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2658 = "_ESUPERSETS = ";
  protected final String TEXT_2659 = ";" + NL;
  protected final String TEXT_2660 = NL + "\t/**";
  protected final String TEXT_2661 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2662 = "}, with the specified ";
  protected final String TEXT_2663 = ", and appends it to the '<em><b>";
  protected final String TEXT_2664 = "</b></em>' ";
  protected final String TEXT_2665 = ".";
  protected final String TEXT_2666 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2667 = "}, with the specified ";
  protected final String TEXT_2668 = ", and sets the '<em><b>";
  protected final String TEXT_2669 = "</b></em>' ";
  protected final String TEXT_2670 = ".";
  protected final String TEXT_2671 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2672 = "} and appends it to the '<em><b>";
  protected final String TEXT_2673 = "</b></em>' ";
  protected final String TEXT_2674 = ".";
  protected final String TEXT_2675 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2676 = "} and sets the '<em><b>";
  protected final String TEXT_2677 = "</b></em>' ";
  protected final String TEXT_2678 = ".";
  protected final String TEXT_2679 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2680 = NL + "\t * @param ";
  protected final String TEXT_2681 = " The ";
  protected final String TEXT_2682 = " for the new {@link ";
  protected final String TEXT_2683 = "}, or <code>null</code>.";
  protected final String TEXT_2684 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2685 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2686 = "}." + NL + "\t * @see #";
  protected final String TEXT_2687 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2688 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2689 = NL + "\t";
  protected final String TEXT_2690 = " create";
  protected final String TEXT_2691 = "(";
  protected final String TEXT_2692 = ", ";
  protected final String TEXT_2693 = " eClass);" + NL;
  protected final String TEXT_2694 = NL + "\t@Override";
  protected final String TEXT_2695 = NL + "\tpublic ";
  protected final String TEXT_2696 = " create";
  protected final String TEXT_2697 = "(";
  protected final String TEXT_2698 = ", ";
  protected final String TEXT_2699 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2700 = " new";
  protected final String TEXT_2701 = " = (";
  protected final String TEXT_2702 = ") create(eClass);";
  protected final String TEXT_2703 = NL + "\t\t";
  protected final String TEXT_2704 = "().add(new";
  protected final String TEXT_2705 = ");";
  protected final String TEXT_2706 = NL + "\t\tset";
  protected final String TEXT_2707 = "(new";
  protected final String TEXT_2708 = ");";
  protected final String TEXT_2709 = NL + "\t\tint ";
  protected final String TEXT_2710 = "ListSize = 0;";
  protected final String TEXT_2711 = NL + "\t\tint ";
  protected final String TEXT_2712 = "Size = ";
  protected final String TEXT_2713 = " == null ? 0 : ";
  protected final String TEXT_2714 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2715 = "Size > ";
  protected final String TEXT_2716 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2717 = "ListSize = ";
  protected final String TEXT_2718 = "Size;";
  protected final String TEXT_2719 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2720 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2721 = ".create";
  protected final String TEXT_2722 = "(";
  protected final String TEXT_2723 = ", ";
  protected final String TEXT_2724 = "i < ";
  protected final String TEXT_2725 = "Size ? (";
  protected final String TEXT_2726 = ") ";
  protected final String TEXT_2727 = ".get(i) : null";
  protected final String TEXT_2728 = ");" + NL + "\t\t}";
  protected final String TEXT_2729 = NL + "\t\tnew";
  protected final String TEXT_2730 = ".create";
  protected final String TEXT_2731 = "(";
  protected final String TEXT_2732 = ", ";
  protected final String TEXT_2733 = ");";
  protected final String TEXT_2734 = NL + "\t\tif (";
  protected final String TEXT_2735 = " != null)";
  protected final String TEXT_2736 = NL + "\t\t\tnew";
  protected final String TEXT_2737 = ".";
  protected final String TEXT_2738 = "().addAll(";
  protected final String TEXT_2739 = ");";
  protected final String TEXT_2740 = NL + "\t\t\tnew";
  protected final String TEXT_2741 = ".set";
  protected final String TEXT_2742 = "(";
  protected final String TEXT_2743 = ");";
  protected final String TEXT_2744 = NL + "\t\treturn new";
  protected final String TEXT_2745 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2746 = NL + "\t/**";
  protected final String TEXT_2747 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2748 = "}, with the specified ";
  protected final String TEXT_2749 = ", and appends it to the '<em><b>";
  protected final String TEXT_2750 = "</b></em>' ";
  protected final String TEXT_2751 = ".";
  protected final String TEXT_2752 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2753 = "},with the specified ";
  protected final String TEXT_2754 = ", and sets the '<em><b>";
  protected final String TEXT_2755 = "</b></em>' ";
  protected final String TEXT_2756 = ".";
  protected final String TEXT_2757 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2758 = "} and appends it to the '<em><b>";
  protected final String TEXT_2759 = "</b></em>' ";
  protected final String TEXT_2760 = ".";
  protected final String TEXT_2761 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2762 = "} and sets the '<em><b>";
  protected final String TEXT_2763 = "</b></em>' ";
  protected final String TEXT_2764 = ".";
  protected final String TEXT_2765 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2766 = NL + "\t * @param ";
  protected final String TEXT_2767 = " The ";
  protected final String TEXT_2768 = " for the new {@link ";
  protected final String TEXT_2769 = "}, or <code>null</code>.";
  protected final String TEXT_2770 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2771 = "}." + NL + "\t * @see #";
  protected final String TEXT_2772 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2773 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2774 = NL + "\t";
  protected final String TEXT_2775 = " create";
  protected final String TEXT_2776 = "(";
  protected final String TEXT_2777 = ");" + NL;
  protected final String TEXT_2778 = NL + "\t@Override";
  protected final String TEXT_2779 = NL + "\tpublic ";
  protected final String TEXT_2780 = " create";
  protected final String TEXT_2781 = "(";
  protected final String TEXT_2782 = ")" + NL + "\t{";
  protected final String TEXT_2783 = NL + "\t\treturn create";
  protected final String TEXT_2784 = "(";
  protected final String TEXT_2785 = ", ";
  protected final String TEXT_2786 = ");";
  protected final String TEXT_2787 = NL + "\t\t";
  protected final String TEXT_2788 = " new";
  protected final String TEXT_2789 = " = (";
  protected final String TEXT_2790 = ") create(";
  protected final String TEXT_2791 = ");";
  protected final String TEXT_2792 = NL + "\t\t";
  protected final String TEXT_2793 = "().add(new";
  protected final String TEXT_2794 = ");";
  protected final String TEXT_2795 = NL + "\t\tset";
  protected final String TEXT_2796 = "(new";
  protected final String TEXT_2797 = ");";
  protected final String TEXT_2798 = NL + "\t\tint ";
  protected final String TEXT_2799 = "ListSize = 0;";
  protected final String TEXT_2800 = NL + "\t\tint ";
  protected final String TEXT_2801 = "Size = ";
  protected final String TEXT_2802 = " == null ? 0 : ";
  protected final String TEXT_2803 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2804 = "Size > ";
  protected final String TEXT_2805 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2806 = "ListSize = ";
  protected final String TEXT_2807 = "Size;";
  protected final String TEXT_2808 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2809 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2810 = ".create";
  protected final String TEXT_2811 = "(";
  protected final String TEXT_2812 = ", ";
  protected final String TEXT_2813 = "i < ";
  protected final String TEXT_2814 = "Size ? (";
  protected final String TEXT_2815 = ") ";
  protected final String TEXT_2816 = ".get(i) : null";
  protected final String TEXT_2817 = ");" + NL + "\t\t}";
  protected final String TEXT_2818 = NL + "\t\tnew";
  protected final String TEXT_2819 = ".create";
  protected final String TEXT_2820 = "(";
  protected final String TEXT_2821 = ", ";
  protected final String TEXT_2822 = ");";
  protected final String TEXT_2823 = NL + "\t\tif (";
  protected final String TEXT_2824 = " != null)";
  protected final String TEXT_2825 = NL + "\t\t\tnew";
  protected final String TEXT_2826 = ".";
  protected final String TEXT_2827 = "().addAll(";
  protected final String TEXT_2828 = ");";
  protected final String TEXT_2829 = NL + "\t\t\tnew";
  protected final String TEXT_2830 = ".set";
  protected final String TEXT_2831 = "(";
  protected final String TEXT_2832 = ");";
  protected final String TEXT_2833 = NL + "\t\treturn new";
  protected final String TEXT_2834 = ";";
  protected final String TEXT_2835 = NL + "\t}" + NL;
  protected final String TEXT_2836 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2837 = "} with the specified ";
  protected final String TEXT_2838 = " from the '<em><b>";
  protected final String TEXT_2839 = "</b></em>' ";
  protected final String TEXT_2840 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2841 = NL + "\t * @param ";
  protected final String TEXT_2842 = " The ";
  protected final String TEXT_2843 = " of the {@link ";
  protected final String TEXT_2844 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2845 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2846 = "} with the specified ";
  protected final String TEXT_2847 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2848 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2849 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2850 = NL + "\t";
  protected final String TEXT_2851 = " get";
  protected final String TEXT_2852 = "(";
  protected final String TEXT_2853 = ");" + NL;
  protected final String TEXT_2854 = NL + "\t@Override";
  protected final String TEXT_2855 = NL + "\tpublic ";
  protected final String TEXT_2856 = " get";
  protected final String TEXT_2857 = "(";
  protected final String TEXT_2858 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2859 = "(";
  protected final String TEXT_2860 = ", false";
  protected final String TEXT_2861 = ", null";
  protected final String TEXT_2862 = ", false";
  protected final String TEXT_2863 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2864 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2865 = "} with the specified ";
  protected final String TEXT_2866 = " from the '<em><b>";
  protected final String TEXT_2867 = "</b></em>' ";
  protected final String TEXT_2868 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2869 = NL + "\t * @param ";
  protected final String TEXT_2870 = " The ";
  protected final String TEXT_2871 = " of the {@link ";
  protected final String TEXT_2872 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2873 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2874 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2875 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2876 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2877 = "} on demand if not found.";
  protected final String TEXT_2878 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2879 = "} with the specified ";
  protected final String TEXT_2880 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2881 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2882 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2883 = NL + "\t";
  protected final String TEXT_2884 = " get";
  protected final String TEXT_2885 = "(";
  protected final String TEXT_2886 = ", boolean ignoreCase";
  protected final String TEXT_2887 = ", ";
  protected final String TEXT_2888 = " eClass";
  protected final String TEXT_2889 = ", boolean createOnDemand";
  protected final String TEXT_2890 = ");" + NL;
  protected final String TEXT_2891 = NL + "\t@Override";
  protected final String TEXT_2892 = NL + "\tpublic ";
  protected final String TEXT_2893 = " get";
  protected final String TEXT_2894 = "(";
  protected final String TEXT_2895 = ", boolean ignoreCase";
  protected final String TEXT_2896 = ", ";
  protected final String TEXT_2897 = " eClass";
  protected final String TEXT_2898 = ", boolean createOnDemand";
  protected final String TEXT_2899 = ")" + NL + "\t{";
  protected final String TEXT_2900 = NL + "\t\t";
  protected final String TEXT_2901 = "Loop: for (";
  protected final String TEXT_2902 = " ";
  protected final String TEXT_2903 = " : ";
  protected final String TEXT_2904 = "())" + NL + "\t\t{";
  protected final String TEXT_2905 = NL + "\t\t";
  protected final String TEXT_2906 = "Loop: for (";
  protected final String TEXT_2907 = " i = ";
  protected final String TEXT_2908 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2909 = " ";
  protected final String TEXT_2910 = " = (";
  protected final String TEXT_2911 = ") i.next();";
  protected final String TEXT_2912 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2913 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2914 = "Loop;";
  protected final String TEXT_2915 = NL + "\t\t\t";
  protected final String TEXT_2916 = " ";
  protected final String TEXT_2917 = "List = ";
  protected final String TEXT_2918 = ".";
  protected final String TEXT_2919 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2920 = "ListSize = ";
  protected final String TEXT_2921 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2922 = " || (";
  protected final String TEXT_2923 = " != null && ";
  protected final String TEXT_2924 = ".size() != ";
  protected final String TEXT_2925 = "ListSize";
  protected final String TEXT_2926 = ")";
  protected final String TEXT_2927 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2928 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2929 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2930 = " ";
  protected final String TEXT_2931 = " = ";
  protected final String TEXT_2932 = "(";
  protected final String TEXT_2933 = ") ";
  protected final String TEXT_2934 = "List.get(j);";
  protected final String TEXT_2935 = NL + "\t\t\t\tif (";
  protected final String TEXT_2936 = " != null && !(ignoreCase ? (";
  protected final String TEXT_2937 = "(";
  protected final String TEXT_2938 = ")";
  protected final String TEXT_2939 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2940 = ".";
  protected final String TEXT_2941 = "()) : ";
  protected final String TEXT_2942 = ".get(j).equals(";
  protected final String TEXT_2943 = ".";
  protected final String TEXT_2944 = "())))";
  protected final String TEXT_2945 = NL + "\t\t\t\tif (";
  protected final String TEXT_2946 = " != null && !";
  protected final String TEXT_2947 = ".get(j).equals(";
  protected final String TEXT_2948 = ".";
  protected final String TEXT_2949 = "()))";
  protected final String TEXT_2950 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2951 = "Loop;";
  protected final String TEXT_2952 = NL + "\t\t\t}";
  protected final String TEXT_2953 = NL + "\t\t\t";
  protected final String TEXT_2954 = " ";
  protected final String TEXT_2955 = " = ";
  protected final String TEXT_2956 = ".";
  protected final String TEXT_2957 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2958 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2959 = "Loop;";
  protected final String TEXT_2960 = NL + "\t\t\tif (";
  protected final String TEXT_2961 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2962 = ".equalsIgnoreCase(";
  protected final String TEXT_2963 = ".";
  protected final String TEXT_2964 = "()) : ";
  protected final String TEXT_2965 = ".equals(";
  protected final String TEXT_2966 = ".";
  protected final String TEXT_2967 = "())))";
  protected final String TEXT_2968 = NL + "\t\t\tif (";
  protected final String TEXT_2969 = " != null && !";
  protected final String TEXT_2970 = ".equals(";
  protected final String TEXT_2971 = ".";
  protected final String TEXT_2972 = "()))";
  protected final String TEXT_2973 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2974 = "Loop;";
  protected final String TEXT_2975 = NL + "\t\t\tif (";
  protected final String TEXT_2976 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2977 = ".equalsIgnoreCase(";
  protected final String TEXT_2978 = ".";
  protected final String TEXT_2979 = "()) : ";
  protected final String TEXT_2980 = ".equals(";
  protected final String TEXT_2981 = ".";
  protected final String TEXT_2982 = "())))";
  protected final String TEXT_2983 = NL + "\t\t\tif (";
  protected final String TEXT_2984 = " != null && !";
  protected final String TEXT_2985 = ".equals(";
  protected final String TEXT_2986 = ".";
  protected final String TEXT_2987 = "()))";
  protected final String TEXT_2988 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2989 = "Loop;";
  protected final String TEXT_2990 = NL + "\t\t\treturn ";
  protected final String TEXT_2991 = ";" + NL + "\t\t}";
  protected final String TEXT_2992 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2993 = " && eClass != null";
  protected final String TEXT_2994 = " ? create";
  protected final String TEXT_2995 = "(";
  protected final String TEXT_2996 = ", eClass";
  protected final String TEXT_2997 = ") : null;";
  protected final String TEXT_2998 = NL + "\t\treturn null;";
  protected final String TEXT_2999 = NL + "\t}" + NL;
  protected final String TEXT_3000 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_3001 = "()" + NL + "\t{";
  protected final String TEXT_3002 = NL + "  \t\treturn false;";
  protected final String TEXT_3003 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3004 = ");";
  protected final String TEXT_3005 = NL + "\t\treturn !((";
  protected final String TEXT_3006 = ".Internal.Wrapper)";
  protected final String TEXT_3007 = "()).featureMap().isEmpty();";
  protected final String TEXT_3008 = NL + "\t\treturn ";
  protected final String TEXT_3009 = " != null && !";
  protected final String TEXT_3010 = ".featureMap().isEmpty();";
  protected final String TEXT_3011 = NL + "\t\treturn ";
  protected final String TEXT_3012 = " != null && !";
  protected final String TEXT_3013 = ".isEmpty();";
  protected final String TEXT_3014 = NL + "\t\t";
  protected final String TEXT_3015 = " ";
  protected final String TEXT_3016 = " = (";
  protected final String TEXT_3017 = ")eVirtualGet(";
  protected final String TEXT_3018 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3019 = " != null && !";
  protected final String TEXT_3020 = ".isEmpty();";
  protected final String TEXT_3021 = NL + "\t\treturn !";
  protected final String TEXT_3022 = "().isEmpty();";
  protected final String TEXT_3023 = NL + "\t\treturn ";
  protected final String TEXT_3024 = " != null;";
  protected final String TEXT_3025 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3026 = ") != null;";
  protected final String TEXT_3027 = NL + "\t\treturn basicGet";
  protected final String TEXT_3028 = "() != null;";
  protected final String TEXT_3029 = NL + "\t\treturn ";
  protected final String TEXT_3030 = " != null;";
  protected final String TEXT_3031 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3032 = ") != null;";
  protected final String TEXT_3033 = NL + "\t\treturn ";
  protected final String TEXT_3034 = "() != null;";
  protected final String TEXT_3035 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_3036 = " & ";
  protected final String TEXT_3037 = "_EFLAG) != 0) != ";
  protected final String TEXT_3038 = ";";
  protected final String TEXT_3039 = NL + "\t\t\t\treturn (";
  protected final String TEXT_3040 = " & ";
  protected final String TEXT_3041 = "_EFLAG) != ";
  protected final String TEXT_3042 = "_EFLAG_DEFAULT;";
  protected final String TEXT_3043 = NL + "\t\treturn ";
  protected final String TEXT_3044 = " != ";
  protected final String TEXT_3045 = ";";
  protected final String TEXT_3046 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3047 = ", ";
  protected final String TEXT_3048 = ") != ";
  protected final String TEXT_3049 = ";";
  protected final String TEXT_3050 = NL + "\t\treturn ";
  protected final String TEXT_3051 = "() != ";
  protected final String TEXT_3052 = ";";
  protected final String TEXT_3053 = NL + "\t\treturn ";
  protected final String TEXT_3054 = " == null ? ";
  protected final String TEXT_3055 = " != null : !";
  protected final String TEXT_3056 = ".equals(";
  protected final String TEXT_3057 = ");";
  protected final String TEXT_3058 = NL + "\t\t";
  protected final String TEXT_3059 = " ";
  protected final String TEXT_3060 = " = (";
  protected final String TEXT_3061 = ")eVirtualGet(";
  protected final String TEXT_3062 = ", ";
  protected final String TEXT_3063 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3064 = " == null ? ";
  protected final String TEXT_3065 = " != null : !";
  protected final String TEXT_3066 = ".equals(";
  protected final String TEXT_3067 = ");";
  protected final String TEXT_3068 = NL + "\t\treturn ";
  protected final String TEXT_3069 = " == null ? ";
  protected final String TEXT_3070 = "() != null : !";
  protected final String TEXT_3071 = ".equals(";
  protected final String TEXT_3072 = "());";
  protected final String TEXT_3073 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3074 = ");";
  protected final String TEXT_3075 = NL + "\t\t";
  protected final String TEXT_3076 = " ";
  protected final String TEXT_3077 = " = (";
  protected final String TEXT_3078 = ")eVirtualGet(";
  protected final String TEXT_3079 = ");";
  protected final String TEXT_3080 = NL + "\t\treturn ";
  protected final String TEXT_3081 = " != null && ((";
  protected final String TEXT_3082 = ".Unsettable";
  protected final String TEXT_3083 = ")";
  protected final String TEXT_3084 = ").isSet();";
  protected final String TEXT_3085 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_3086 = ");";
  protected final String TEXT_3087 = NL + "\t\treturn (";
  protected final String TEXT_3088 = " & ";
  protected final String TEXT_3089 = "_ESETFLAG) != 0;";
  protected final String TEXT_3090 = NL + "\t\treturn ";
  protected final String TEXT_3091 = "ESet;";
  protected final String TEXT_3092 = NL + "\t\treturn !((";
  protected final String TEXT_3093 = ".Internal)((";
  protected final String TEXT_3094 = ".Internal.Wrapper)get";
  protected final String TEXT_3095 = "()).featureMap()).isEmpty(";
  protected final String TEXT_3096 = ");";
  protected final String TEXT_3097 = NL + "\t\treturn !((";
  protected final String TEXT_3098 = ".Internal)get";
  protected final String TEXT_3099 = "()).isEmpty(";
  protected final String TEXT_3100 = ");";
  protected final String TEXT_3101 = NL + "\t\treturn ";
  protected final String TEXT_3102 = ".";
  protected final String TEXT_3103 = "(this);";
  protected final String TEXT_3104 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_3105 = "' ";
  protected final String TEXT_3106 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3107 = NL + "\t}" + NL;
  protected final String TEXT_3108 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3109 = NL + "\t@Override";
  protected final String TEXT_3110 = NL + "\tpublic ";
  protected final String TEXT_3111 = " ";
  protected final String TEXT_3112 = "(";
  protected final String TEXT_3113 = ")";
  protected final String TEXT_3114 = NL + "\t{";
  protected final String TEXT_3115 = NL + "\t\t";
  protected final String TEXT_3116 = "(";
  protected final String TEXT_3117 = ");";
  protected final String TEXT_3118 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3119 = NL + "\t\treturn ";
  protected final String TEXT_3120 = "(";
  protected final String TEXT_3121 = ");";
  protected final String TEXT_3122 = NL + "\t}" + NL;
  protected final String TEXT_3123 = NL + "} //";
  protected final String TEXT_3124 = NL;

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
    final boolean isJDK50 = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50;
    final boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); final boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    final String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    final String singleWildcard = isJDK50 ? "<?>" : "";
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
    if (isImplementation) { genClass.addClassPsuedoImports(); }
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
    if (isJDK50) {
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
    if (isJDK50) {
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
    if (isImplementation && (genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL || genModel.isDynamicDelegation()) && (genClass.getClassExtendsGenClass() == null || (genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL && !genClass.getClassExtendsGenClass().getGenModel().isDynamicDelegation()))) {
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
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_185);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_189);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_190);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_191);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_192);
    } else {
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_194);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_195);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_197);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_201);
    }
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_203);
    }
    stringBuffer.append(TEXT_204);
    if (!isImplementation) {
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_207);
    } else {
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_209);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_210);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_212);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_213);
    }
    stringBuffer.append(TEXT_214);
    if (!isImplementation) {
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_216);
    } else {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_218);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_220);
    } else {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_223);
    }
    stringBuffer.append(TEXT_224);
    }
    stringBuffer.append(TEXT_225);
    if (!isImplementation) {
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_229);
    } else {
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_237);
    }
    stringBuffer.append(TEXT_238);
    if (!isImplementation) {
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_241);
    } else {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_245);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_248);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_249);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_250);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_251);
    } else {
    stringBuffer.append(TEXT_252);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_253);
    }
    stringBuffer.append(TEXT_254);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_255);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_256);
    } else {
    stringBuffer.append(TEXT_257);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_258);
    }
    stringBuffer.append(TEXT_259);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

    stringBuffer.append(TEXT_260);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_261);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_262);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_263);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_264);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_266);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_267);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_269);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_270);
    }
    }
    if (!UML2GenModelUtil.getSubsettedGenFeatures(genFeature).isEmpty()) {
    stringBuffer.append(TEXT_271);
    for (GenFeature subsettedGenFeature : UML2GenModelUtil.getSubsettedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_272);
    stringBuffer.append(subsettedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_273);
    stringBuffer.append(subsettedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_274);
    stringBuffer.append(subsettedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_275);
    }
    stringBuffer.append(TEXT_276);
    }if (UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_277);
    for (GenFeature redefinedGenFeature : UML2GenModelUtil.getRedefinedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_278);
    stringBuffer.append(redefinedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_279);
    stringBuffer.append(redefinedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_280);
    stringBuffer.append(redefinedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_281);
    }
    stringBuffer.append(TEXT_282);
    }if(genFeature.isDerived() && UML2GenModelUtil.isUnion(genFeature)){
    stringBuffer.append(TEXT_283);
    }
    stringBuffer.append(TEXT_284);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_286);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_287);
    }
    stringBuffer.append(TEXT_288);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_290);
    }
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_293);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_296);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_298);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_301);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_304);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_305);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_306);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_307);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_308);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_309);
    }}
    stringBuffer.append(TEXT_310);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_311);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_312);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_315);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !(genModel.isReflectiveDelegation() && genModel.isDynamicDelegation()) && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && !genFeature.isFeatureMapType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation() || genModel.isDynamicDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature())) {
    stringBuffer.append(TEXT_316);
    }
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_319);
    }
    stringBuffer.append(TEXT_320);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_321);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_322);
    }
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_326);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_327);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_329);
    }
    stringBuffer.append(TEXT_330);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_331);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_332);
    }
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_335);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_337);
    }
    stringBuffer.append(TEXT_338);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_343);
    }
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_345);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_349);
    } else {
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_352);
    }
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_354);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_356);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_357);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_363);
    }
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_367);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_375);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_380);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_384);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_387);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_388);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_389);
    }
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_391);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_394);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_396);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_397);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_398);
    }
    stringBuffer.append(TEXT_399);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_402);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_408);
    }
    stringBuffer.append(TEXT_409);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_413);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_416);
    } else {
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_421);
    }
    } else {
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_423);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_433);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = isJDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_437);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_440);
    } else {
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_442);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_443);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_445);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_447);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_449);
    } else {
    stringBuffer.append(TEXT_450);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_452);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_453);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_454);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_456);
    }
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_458);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_460);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_462);
    }
    stringBuffer.append(TEXT_463);
    } else {
    stringBuffer.append(TEXT_464);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_465);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_467);
    }
    stringBuffer.append(TEXT_468);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_470);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_472);
    }
    stringBuffer.append(TEXT_473);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_476);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_477);
    }
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_480);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_481);
    }
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_483);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_484);
    }
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_486);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_488);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_490);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_491);
    }
    stringBuffer.append(TEXT_492);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_494);
    }
    stringBuffer.append(TEXT_495);
    }
    stringBuffer.append(TEXT_496);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_498);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_501);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_502);
    }
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_512);
    }
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_514);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_516);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_520);
    }
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_530);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_531);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_534);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_535);
    }
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_547);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_548);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_550);
    }
    stringBuffer.append(TEXT_551);
    }
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_556);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_557);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_558);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_559);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_560);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_561);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_563);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_564);
    } else {
    stringBuffer.append(TEXT_565);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_566);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_567);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_570);
    }
    }
    }
    }
    stringBuffer.append(TEXT_571);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_573);
    } else {
    stringBuffer.append(TEXT_574);
    }
    stringBuffer.append(TEXT_575);
    }
    } else {
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_578);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_579);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_580);
    if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_581);
    }
    }
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_584);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_588);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_589);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_592);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_595);
    } else {
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_597);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_598);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_600);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_602);
    } else {
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_604);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_606);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_608);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_609);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_610);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_611);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_612);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_613);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_614);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_615);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_616);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_617);
    } else {
    stringBuffer.append(TEXT_618);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_619);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_620);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_621);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_622);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_623);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_624);
    }
    }
    }
    }
    stringBuffer.append(TEXT_625);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_627);
    } else {
    stringBuffer.append(TEXT_628);
    }
    stringBuffer.append(TEXT_629);
    } else {
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_632);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_633);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_634);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_635);
    }
    }
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_641);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_645);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_647);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_648);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_649);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_650);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_651);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_652);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_654);
    }
    stringBuffer.append(TEXT_655);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_656);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_658);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_659);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_661);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_662);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_663);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_664);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_665);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_667);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_669);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_670);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_671);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_672);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_673);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_674);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_675);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_676);
    }
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_678);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_679);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_681);
    }
    stringBuffer.append(TEXT_682);
    }
    stringBuffer.append(TEXT_683);
    }
    stringBuffer.append(TEXT_684);
    } else if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_688);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_690);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_691);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_692);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_693);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_694);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_695);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_697);
    }
    stringBuffer.append(TEXT_698);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_699);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_701);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_702);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_704);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_705);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_706);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_707);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_708);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_710);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_712);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_713);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_714);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_715);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_716);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_717);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_719);
    }
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_721);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_722);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_724);
    }
    stringBuffer.append(TEXT_725);
    }
    stringBuffer.append(TEXT_726);
    }
    stringBuffer.append(TEXT_727);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_731);
    } else {
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_737);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_738);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_739);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_743);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_745);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_746);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_749);
    }
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_751);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_752);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_757);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_761);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_762);
    } else {
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_764);
    }
    stringBuffer.append(TEXT_765);
    } else {
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_770);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_775);
    }
    stringBuffer.append(TEXT_776);
    }
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_778);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_779);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_780);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_781);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_782);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_783);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_785);
    }
    stringBuffer.append(TEXT_786);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_787);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_789);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_790);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_792);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_793);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_794);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_795);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_796);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_798);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_800);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_801);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_802);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_803);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_804);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_805);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_807);
    }
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_809);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_810);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_812);
    }
    stringBuffer.append(TEXT_813);
    }
    stringBuffer.append(TEXT_814);
    }
    stringBuffer.append(TEXT_815);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_818);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_821);
    } else {
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_823);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_826);
    }
    } else {
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_829);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_830);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_835);
    stringBuffer.append(TEXT_836);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_838);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_841);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_843);
    }
    }
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_845);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_846);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_847);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_849);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_850);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    stringBuffer.append(TEXT_851);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_852);
    }
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_854);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_855);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_860);
    }
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_863);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_865);
    }
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_867);
    }
    stringBuffer.append(TEXT_868);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_870);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_872);
    }
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_874);
    }
    stringBuffer.append(TEXT_875);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_888);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_889);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_893);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_899);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_904);
    }
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_909);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_915);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_917);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_920);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_921);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_925);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_926);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_927);
    }
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_929);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_931);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_932);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_934);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_935);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_939);
    }
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_942);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_945);
    }
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_947);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_954);
    }
    stringBuffer.append(TEXT_955);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_961);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_966);
    } else {
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_973);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_979);
    } else {
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_986);
    if (isJDK50) {
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_988);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_990);
    }
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_992);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_996);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1002);
    } else {
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1007);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1012);
    } else {
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1016);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1020);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1022);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1026);
    }
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1029);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1032);
    }
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1034);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1038);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1042);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1044);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1045);
    } else {
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1047);
    }
    stringBuffer.append(TEXT_1048);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1052);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1057);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1059);
    }
    }
    }
    if (!genFeature.isBasicSet()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_1061);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1065);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1068);
    }
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1073);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1075);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1083);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1087);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_1090);
    }
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1095);
    }
    stringBuffer.append(TEXT_1096);
    }
    stringBuffer.append(TEXT_1097);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1102);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1104);
    }
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1106);
    }
    stringBuffer.append(TEXT_1107);
    } else {
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1111);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1113);
    }
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1115);
    }
    stringBuffer.append(TEXT_1116);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1121);
    } else {
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1124);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1125);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_1126);
    if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1127);
    }
    }
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1131);
    if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1133);
    }
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1135);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1139);
    }
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1141);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1143);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1147);
    }
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1150);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1153);
    }
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1155);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1160);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1162);
    } else {
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1164);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1165);
    } else {
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1167);
    }
    stringBuffer.append(TEXT_1168);
    }
    } else {
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1171);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1172);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(TEXT_1178);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1180);
    }
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1182);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1185);
    }
    stringBuffer.append(TEXT_1186);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1187);
    if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1188);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1190);
    } else {
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1192);
    }
    stringBuffer.append(TEXT_1193);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1196);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1198);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1203);
    }
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1208);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1213);
    }
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1216);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1220);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1225);
    }
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1227);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1230);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1234);
    }
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1237);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1240);
    }
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1242);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1247);
    }
    stringBuffer.append(TEXT_1248);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1253);
    } else {
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1260);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1263);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1267);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1269);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1273);
    } else {
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1276);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1278);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1281);
    } else {
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1283);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1287);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1289);
    } else {
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1291);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1292);
    } else {
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1294);
    }
    stringBuffer.append(TEXT_1295);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1301);
    } else {
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1306);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1309);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1312);
    } else {
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1314);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1318);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1323);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1324);
    } else {
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1326);
    }
    stringBuffer.append(TEXT_1327);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1332);
    } else {
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1336);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1340);
    } else {
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1343);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1344);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1352);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1354);
    }
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1356);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1359);
    }
    stringBuffer.append(TEXT_1360);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1361);
    if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1362);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1364);
    } else {
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1366);
    }
    stringBuffer.append(TEXT_1367);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1370);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1372);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1377);
    }
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1382);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1384);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1387);
    } else {
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1389);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1394);
    } else {
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1398);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1402);
    } else {
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1405);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1406);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1413);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1420);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1421);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1426);
    } else {
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1431);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1435);
    } else {
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1439);
    }
    }
    stringBuffer.append(TEXT_1440);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1444);
    }
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1448);
    } else {
    stringBuffer.append(TEXT_1449);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1452);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1453);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1454);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1455);
    }
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1458);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1459);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1463);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1466);
    } else {
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1469);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1471);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1479);
    index++;}
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1483);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1484);
    }
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1488);
    }
    stringBuffer.append(TEXT_1489);
    } else {
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1492);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1493);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1494);
    }
    } else {
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1496);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1500);
    } else {
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1504);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1506);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1507);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1512);
    } else {
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1517);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1521);
    } else {
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1525);
    }
    }
    stringBuffer.append(TEXT_1526);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1530);
    }
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1533);
    } else {
    stringBuffer.append(TEXT_1534);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1538);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1539);
    }
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1543);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1545);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_1546);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1547);
    } else {
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1552);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1555);
    } else {
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1558);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1560);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1568);
    index++;}
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1572);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1573);
    }
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1577);
    }
    stringBuffer.append(TEXT_1578);
    } else {
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1581);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1582);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1583);
    }
    } else {
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1585);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1589);
    } else {
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1593);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1595);
    }
    stringBuffer.append(TEXT_1596);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1601);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1605);
    }
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1609);
    } else {
    stringBuffer.append(TEXT_1610);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1614);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1615);
    }
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1621);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1622);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1623);
    }
    stringBuffer.append(TEXT_1624);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1629);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1633);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1634);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1636);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1638);
    }
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1642);
    } else {
    stringBuffer.append(TEXT_1643);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1647);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1649);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1650);
    }
    stringBuffer.append(TEXT_1651);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1652);
    }
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1656);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1658);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1659);
    }
    stringBuffer.append(TEXT_1660);
    if (isJDK50) {
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1665);
    } else {
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1672);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1675);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1682);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1683);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1686);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1687);
    }
    }
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1692);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1694);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1695);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1697);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1699);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1700);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1705);
    } else {
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1710);
    }
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1712);
    index++;}
    stringBuffer.append(TEXT_1713);
    } else {
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1720);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1728);
    } else {
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1733);
    }
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1735);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1743);
    } else {
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1748);
    }
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1750);
    index++;}
    }
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1752);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1753);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1754);
    }
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1757);
    }
    stringBuffer.append(TEXT_1758);
    } else {
    stringBuffer.append(TEXT_1759);
    }
    stringBuffer.append(TEXT_1760);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1762);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1763);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1765);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1768);
    } else {
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1771);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1774);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1781);
    } else {
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1783);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1785);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1787);
    } else {
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1789);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1791);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1793);
    } else {
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1795);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1796);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1799);
    } else {
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1803);
    }
    } else {
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1806);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1810);
    } else {
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1813);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1818);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1824);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1826);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1828);
    } else {
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1833);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1835);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1840);
    }
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1845);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1847);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1850);
    } else {
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1852);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1857);
    } else {
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1861);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1864);
    } else {
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1867);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1868);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation && !UML2GenModelUtil.hasOperationsClass(genClass, genOperation) && UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1872);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1878);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1884);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1886);
    } else {
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (isJDK50) {
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_1894);
    }
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1896);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1897);
    if (UML2GenModelUtil.isRedefinition(genOperation)) {
    stringBuffer.append(TEXT_1898);
    for (GenOperation redefinedGenOperation : UML2GenModelUtil.getRedefinedGenOperations(genOperation)) {
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(redefinedGenOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(redefinedGenOperation.getName());
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(redefinedGenOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(redefinedGenOperation.getFormattedName());
    stringBuffer.append(TEXT_1903);
    }
    stringBuffer.append(TEXT_1904);
    }
    stringBuffer.append(TEXT_1905);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1906);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1909);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1911);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1912);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1915);
    }}
    stringBuffer.append(TEXT_1916);
    } else {
    stringBuffer.append(TEXT_1917);
    if (isJDK50) {
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_1918);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1920);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1921);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1923);
    } else {
    stringBuffer.append(TEXT_1924);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1926);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1927);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1928);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1930);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1931);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1932);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1933);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1934);
    } else {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1938);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_1941);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1942);
    } else {
    stringBuffer.append(TEXT_1943);
    }
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1948);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1953);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1956);
    }
    } else { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1959);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1960);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1961);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1962);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1963);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_1964);
    }
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1967);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1968);
    }
    stringBuffer.append(TEXT_1969);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1970);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1971);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1972);
    }
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1975);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1976);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1977);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1979);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1980);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1981);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1982);
    }
    stringBuffer.append(TEXT_1983);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1984);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1985);
    }
    stringBuffer.append(TEXT_1986);
    }
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1989);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1991);
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
    stringBuffer.append(TEXT_1992);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1996);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_1998);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1999);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2000);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2001);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2002);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2004);
    }
    stringBuffer.append(TEXT_2005);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_2006);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2008);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2009);
    }
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2011);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2012);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2016);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2017);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2019);
    } else {
    stringBuffer.append(TEXT_2020);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_2021);
    }
    } else {
    stringBuffer.append(TEXT_2022);
    }
    }
    stringBuffer.append(TEXT_2023);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_2024);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_2025);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2026);
    }
    stringBuffer.append(TEXT_2027);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2030);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2031);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_2032);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2033);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2034);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_2035);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2036);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2038);
    } else {
    stringBuffer.append(TEXT_2039);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2040);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_2041);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2042);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2044);
    } else {
    stringBuffer.append(TEXT_2045);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2046);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2048);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2051);
    } else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
    stringBuffer.append(TEXT_2052);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2054);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_2055);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2056);
    }
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2058);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_2059);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2061);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2062);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_2063);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2064);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2065);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2066);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2067);
    }
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2070);
    }
    }
    stringBuffer.append(TEXT_2071);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2072);
    } else {
    stringBuffer.append(TEXT_2073);
    }
    stringBuffer.append(TEXT_2074);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_2075);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2076);
    }
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2078);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2080);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2081);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2083);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2085);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2088);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2089);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2091);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2092);
    } else {
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2094);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2095);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2096);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2097);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2098);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2099);
    } else {
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2101);
    }
    }
    stringBuffer.append(TEXT_2102);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2103);
    } else {
    stringBuffer.append(TEXT_2104);
    }
    stringBuffer.append(TEXT_2105);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_2106);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2107);
    }
    stringBuffer.append(TEXT_2108);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2109);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2110);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2111);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_2112);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2115);
    }
    stringBuffer.append(TEXT_2116);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2117);
    } else {
    stringBuffer.append(TEXT_2118);
    }
    stringBuffer.append(TEXT_2119);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_2120);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2121);
    }
    stringBuffer.append(TEXT_2122);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2123);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_2124);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2125);
    if (genFeature.isPrimitiveType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2126);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2127);
    } else if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2129);
    } else {
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2131);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2132);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2134);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2135);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2139);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2140);
    } else {
    stringBuffer.append(TEXT_2141);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2142);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2143);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2146);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2147);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2148);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2149);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2150);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2151);
    } else {
    stringBuffer.append(TEXT_2152);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2153);
    }
    }
    stringBuffer.append(TEXT_2154);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2155);
    } else {
    stringBuffer.append(TEXT_2156);
    }
    stringBuffer.append(TEXT_2157);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_2158);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_2159);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2160);
    }
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2162);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_2163);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2164);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2165);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2166);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2168);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2170);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2171);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2172);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2174);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2175);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2176);
    } else {
    stringBuffer.append(TEXT_2177);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2179);
    }
    } else {
    stringBuffer.append(TEXT_2180);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2182);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2184);
    }
    stringBuffer.append(TEXT_2185);
    }
    } else if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2188);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2189);
    } else {
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2191);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2193);
    }
    stringBuffer.append(TEXT_2194);
    }
    stringBuffer.append(TEXT_2195);
    }
    stringBuffer.append(TEXT_2196);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2197);
    } else {
    stringBuffer.append(TEXT_2198);
    }
    stringBuffer.append(TEXT_2199);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_2200);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2201);
    }
    stringBuffer.append(TEXT_2202);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2203);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_2204);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2205);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2207);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2208);
    } else {
    stringBuffer.append(TEXT_2209);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2210);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2212);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_2213);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2215);
    } else {
    stringBuffer.append(TEXT_2216);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2217);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2218);
    }
    stringBuffer.append(TEXT_2219);
    }
    stringBuffer.append(TEXT_2220);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2221);
    } else {
    stringBuffer.append(TEXT_2222);
    }
    stringBuffer.append(TEXT_2223);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_2224);
    stringBuffer.append(TEXT_2225);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2226);
    }
    stringBuffer.append(TEXT_2227);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    stringBuffer.append(TEXT_2228);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2229);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2230);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2231);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2232);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2233);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2234);
    } else {
    stringBuffer.append(TEXT_2235);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2236);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2237);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2238);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2239);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2240);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2241);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2242);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2243);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2244);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2245);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2246);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2247);
    } else {
    stringBuffer.append(TEXT_2248);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2249);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2250);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2251);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2252);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2253);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2254);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2255);
    } else {
    stringBuffer.append(TEXT_2256);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2257);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2258);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2259);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2260);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2261);
    } else {
    stringBuffer.append(TEXT_2262);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2263);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2264);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2265);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2267);
    } else {
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2269);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2270);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2271);
    }
    } else {
    stringBuffer.append(TEXT_2272);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2273);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2274);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2275);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2277);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2278);
    } else {
    stringBuffer.append(TEXT_2279);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2280);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2281);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2282);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2283);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2284);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2286);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2288);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2290);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2292);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2293);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2294);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2296);
    } else {
    stringBuffer.append(TEXT_2297);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2298);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2299);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2300);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2301);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2302);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2303);
    } else {
    stringBuffer.append(TEXT_2304);
    }
    stringBuffer.append(TEXT_2305);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2306);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2307);
    }
    stringBuffer.append(TEXT_2308);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2309);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2310);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2311);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2312);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2313);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2315);
    }
    stringBuffer.append(TEXT_2316);
    }
    stringBuffer.append(TEXT_2317);
    }
    stringBuffer.append(TEXT_2318);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2319);
    }
    stringBuffer.append(TEXT_2320);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2321);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2322);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2323);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2324);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2325);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2326);
    }
    stringBuffer.append(TEXT_2327);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2328);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2329);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2330);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2331);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2332);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2333);
    }
    stringBuffer.append(TEXT_2334);
    }
    stringBuffer.append(TEXT_2335);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2336);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2337);
    }
    stringBuffer.append(TEXT_2338);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2339);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2340);
    }
    stringBuffer.append(TEXT_2341);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2342);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2343);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2344);
    }
    stringBuffer.append(TEXT_2345);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2346);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2347);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2348);
    }
    stringBuffer.append(TEXT_2349);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2350);
    }
    stringBuffer.append(TEXT_2351);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2352);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2353);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2354);
    }
    stringBuffer.append(TEXT_2355);
    }
    }
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2356);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2357);
    }
    stringBuffer.append(TEXT_2358);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2359);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2360);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2361);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2362);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2363);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2366);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2367);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2369);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2370);
    }
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2374);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2376);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2377);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2378);
    }
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2380);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2381);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2382);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_2384);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2385);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2386);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2387);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2388);
    }
    stringBuffer.append(TEXT_2389);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2390);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2391);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2392);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2393);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2394);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2396);
    } else {
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2399);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2401);
    }
    } else {
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2403);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2404);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2405);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2407);
    if (!isJDK50 && keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2408);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2409);
    } else {
    stringBuffer.append(TEXT_2410);
    }
    stringBuffer.append(TEXT_2411);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2412);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2413);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2415);
    }
    stringBuffer.append(TEXT_2416);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2417);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2418);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2419);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2420);
    } else {
    stringBuffer.append(TEXT_2421);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2422);
    }
    stringBuffer.append(TEXT_2423);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2424);
    if (!isJDK50 && valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2425);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2426);
    } else {
    stringBuffer.append(TEXT_2427);
    }
    stringBuffer.append(TEXT_2428);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2429);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2430);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2431);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2432);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2433);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2434);
    }
    stringBuffer.append(TEXT_2435);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2436);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2437);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2438);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2439);
    } else {
    stringBuffer.append(TEXT_2440);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2441);
    }
    stringBuffer.append(TEXT_2442);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2443);
    }
    stringBuffer.append(TEXT_2444);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2445);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2446);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2447);
    }
    if (isImplementation) {
    if (!UML2GenModelUtil.isOperationsClasses(genPackage) && UML2GenModelUtil.hasOCLOperationBodies(genClass) && !UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass())) {
    stringBuffer.append(TEXT_2448);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2449);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2450);
    }
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2453);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2454);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2456);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2457);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2458);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2459);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2460);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2461);
    }
    stringBuffer.append(TEXT_2462);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2463);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2464);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2465);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2466);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2467);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2468);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2469);
    } else {
    stringBuffer.append(TEXT_2470);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2471);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2472);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2474);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2475);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2476);
    }
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2478);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2480);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2481);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2482);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2484);
    }
    stringBuffer.append(TEXT_2485);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2487);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2488);
    } else {
    stringBuffer.append(TEXT_2489);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2490);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2491);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2492);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2493);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2494);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2495);
    }
    stringBuffer.append(TEXT_2496);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2497);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2499);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2500);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2501);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2502);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2503);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2504);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2505);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2506);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2507);
    } else {
    stringBuffer.append(TEXT_2508);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2509);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2510);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2512);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2513);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2514);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2515);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2516);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2517);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2518);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2519);
    } else {
    stringBuffer.append(TEXT_2520);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2521);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2522);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2523);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2524);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2525);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2526);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2527);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2528);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2529);
    }
    }
    }
    stringBuffer.append(TEXT_2530);
    if (isJDK50) { //isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2531);
    }
    }
    stringBuffer.append(TEXT_2532);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2533);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2534);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2535);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2537);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2538);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2539);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2540);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2541);
    }
    } else {
    stringBuffer.append(TEXT_2542);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2543);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2544);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2545);
    }
    }
    } else {
    stringBuffer.append(TEXT_2546);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2547);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2548);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2549);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2550);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2551);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2552);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2553);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2554);
    }
    } else {
    stringBuffer.append(TEXT_2555);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2556);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2557);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2558);
    }
    }
    } else {
    stringBuffer.append(TEXT_2559);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2560);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2561);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2562);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2563);
    } else {
    stringBuffer.append(TEXT_2564);
    }
    }
    stringBuffer.append(TEXT_2565);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2566);
    if (isJDK50) { //getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2567);
    }
    }
    stringBuffer.append(TEXT_2568);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2569);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2570);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType(genClass).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_2571);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2572);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2574);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2577);
    } else {
    stringBuffer.append(TEXT_2578);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2579);
    }
    } else {
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2581);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2582);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2583);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2585);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2586);
    } else {
    stringBuffer.append(TEXT_2587);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2588);
    }
    }
    stringBuffer.append(TEXT_2589);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2590);
    if (isJDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2591);
    }
    }
    stringBuffer.append(TEXT_2592);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2593);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2594);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2595);
    } else {
    stringBuffer.append(TEXT_2596);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2597);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2598);
    }
    stringBuffer.append(TEXT_2599);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2600);
    if (isJDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2601);
    }
    }
    stringBuffer.append(TEXT_2602);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2603);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_2605);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2606);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2607);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2608);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2609);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2610);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2612);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2613);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2614);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2615);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2616);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2617);
    }
    stringBuffer.append(TEXT_2618);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2619);
    } else {
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2621);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2623);
    }
    stringBuffer.append(TEXT_2624);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2625);
    }
    }
    stringBuffer.append(TEXT_2626);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2627);
    if (isJDK50) { //setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2628);
    }
    }
    stringBuffer.append(TEXT_2629);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2631);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2632);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2633);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2635);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2636);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2637);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2638);
    }
    stringBuffer.append(TEXT_2639);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2640);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2641);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2642);
    }
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2644);
    }
    stringBuffer.append(TEXT_2645);
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2646);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2647);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2649);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2650);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2652);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2653);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2654);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2655);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2656);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2657);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2659);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2660);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2661);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2662);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2664);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2665);
    } else {
    stringBuffer.append(TEXT_2666);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2668);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2670);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2672);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2674);
    } else {
    stringBuffer.append(TEXT_2675);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2676);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2678);
    }
    }
    stringBuffer.append(TEXT_2679);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2680);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2682);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2683);
    }
    stringBuffer.append(TEXT_2684);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2687);
    } else {
    stringBuffer.append(TEXT_2688);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2690);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2691);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2692);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2693);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2694);
    }
    stringBuffer.append(TEXT_2695);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2697);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2698);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2699);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2700);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2702);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2703);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2704);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2705);
    } else {
    stringBuffer.append(TEXT_2706);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2707);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2708);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2709);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2710);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2711);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2712);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2713);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2714);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2715);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2716);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2717);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2718);
    index++;}
    stringBuffer.append(TEXT_2719);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2720);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2721);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2722);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2723);
    }
    stringBuffer.append(TEXT_2724);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2725);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2726);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2727);
    }
    stringBuffer.append(TEXT_2728);
    } else {
    stringBuffer.append(TEXT_2729);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2730);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2731);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2732);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2733);
    }
    } else {
    stringBuffer.append(TEXT_2734);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2735);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2736);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2737);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2739);
    } else {
    stringBuffer.append(TEXT_2740);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2741);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2742);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2743);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2744);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2745);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2746);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2747);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2749);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2750);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2751);
    } else {
    stringBuffer.append(TEXT_2752);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2753);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2754);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2755);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2756);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2757);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2758);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2759);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2760);
    } else {
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2762);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2763);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2764);
    }
    }
    stringBuffer.append(TEXT_2765);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2768);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2769);
    }
    stringBuffer.append(TEXT_2770);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2771);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2772);
    } else {
    stringBuffer.append(TEXT_2773);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2774);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2775);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2776);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2777);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2778);
    }
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2780);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2781);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2782);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2784);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_2785);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2786);
    } else {
    stringBuffer.append(TEXT_2787);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2788);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2789);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2790);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2791);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2792);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2793);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2794);
    } else {
    stringBuffer.append(TEXT_2795);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2796);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2797);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2798);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2799);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2800);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2801);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2802);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2803);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2804);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2805);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2806);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2807);
    index++;}
    stringBuffer.append(TEXT_2808);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2809);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2811);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2812);
    }
    stringBuffer.append(TEXT_2813);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2814);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2815);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2816);
    }
    stringBuffer.append(TEXT_2817);
    } else {
    stringBuffer.append(TEXT_2818);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2819);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2820);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2821);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2822);
    }
    } else {
    stringBuffer.append(TEXT_2823);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2824);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2825);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2826);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2827);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2828);
    } else {
    stringBuffer.append(TEXT_2829);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2830);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2831);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2832);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2833);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2834);
    }
    stringBuffer.append(TEXT_2835);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2836);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2837);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2838);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2839);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2840);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2841);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2842);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2843);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2844);
    }
    stringBuffer.append(TEXT_2845);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2846);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2847);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2848);
    } else {
    stringBuffer.append(TEXT_2849);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2850);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2851);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2852);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2853);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2854);
    }
    stringBuffer.append(TEXT_2855);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2856);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2857);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2858);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2859);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2860);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2861);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2862);
    }
    stringBuffer.append(TEXT_2863);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2864);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2865);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2866);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2867);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2868);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2869);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2870);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2871);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2872);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2873);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2874);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2875);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2876);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2877);
    }
    stringBuffer.append(TEXT_2878);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2879);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2880);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2881);
    } else {
    stringBuffer.append(TEXT_2882);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2883);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2884);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2885);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2886);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2887);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2888);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2889);
    }
    stringBuffer.append(TEXT_2890);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2891);
    }
    stringBuffer.append(TEXT_2892);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2893);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2894);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2895);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2896);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2897);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2898);
    }
    stringBuffer.append(TEXT_2899);
    if (isJDK50) {
    stringBuffer.append(TEXT_2900);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2901);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_2902);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2903);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2904);
    } else {
    stringBuffer.append(TEXT_2905);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2906);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2907);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2908);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2909);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2910);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2911);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2912);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2913);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2914);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2915);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2916);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2917);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2918);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2919);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2920);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2921);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_2922);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_2923);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_2924);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2925);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2926);
    }
    }
    stringBuffer.append(TEXT_2927);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2928);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2929);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2930);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2931);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2932);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2933);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2934);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2935);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2936);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2937);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2938);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2939);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2940);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2941);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2942);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2943);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2944);
    } else {
    stringBuffer.append(TEXT_2945);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2946);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2947);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2948);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2949);
    }
    stringBuffer.append(TEXT_2950);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2951);
    index++;}
    stringBuffer.append(TEXT_2952);
    } else {
    stringBuffer.append(TEXT_2953);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2954);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2955);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2956);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2957);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2958);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2959);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2960);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2961);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2962);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2963);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2964);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2965);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2966);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2967);
    } else {
    stringBuffer.append(TEXT_2968);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2969);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2970);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2971);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2972);
    }
    stringBuffer.append(TEXT_2973);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2974);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2975);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2976);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2977);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2978);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2979);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2980);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2981);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2982);
    } else {
    stringBuffer.append(TEXT_2983);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2984);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2985);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2986);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2987);
    }
    stringBuffer.append(TEXT_2988);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2989);
    index++;}
    }
    stringBuffer.append(TEXT_2990);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2991);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2992);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2993);
    }
    stringBuffer.append(TEXT_2994);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2995);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2996);
    }
    stringBuffer.append(TEXT_2997);
    } else {
    stringBuffer.append(TEXT_2998);
    }
    stringBuffer.append(TEXT_2999);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_3000);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3001);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_3002);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3003);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3004);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_3005);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3006);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3007);
    } else {
    stringBuffer.append(TEXT_3008);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3009);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3010);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3011);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3012);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3013);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3014);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3015);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3016);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3017);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3018);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3019);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3020);
    } else {
    stringBuffer.append(TEXT_3021);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3022);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3023);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3024);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3025);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3026);
    } else {
    stringBuffer.append(TEXT_3027);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3028);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3029);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3030);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3031);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3032);
    } else {
    stringBuffer.append(TEXT_3033);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3034);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_3035);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3036);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3037);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3038);
    } else {
    stringBuffer.append(TEXT_3039);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3040);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3041);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3042);
    }
    } else {
    stringBuffer.append(TEXT_3043);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3044);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3045);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3046);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3047);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3048);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3049);
    } else {
    stringBuffer.append(TEXT_3050);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3051);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3052);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3053);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3054);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3055);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3056);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3057);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3058);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3059);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3060);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3061);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3062);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3063);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3064);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3065);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3066);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3067);
    } else {
    stringBuffer.append(TEXT_3068);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3069);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3070);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3071);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3072);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3073);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3074);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_3075);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3076);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3077);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3078);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3079);
    }
    stringBuffer.append(TEXT_3080);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3081);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_3082);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_3083);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3084);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_3085);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3086);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_3087);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_3088);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3089);
    } else {
    stringBuffer.append(TEXT_3090);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3091);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_3092);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3093);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3094);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3095);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3096);
    } else {
    stringBuffer.append(TEXT_3097);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3098);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3099);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3100);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_3101);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_3102);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3103);
    } else {
    stringBuffer.append(TEXT_3104);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3105);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3106);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_3107);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_3108);
    if (isJDK50) { //genOperation.annotations.insert.javajetinc
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_3109);
    }
    }
    stringBuffer.append(TEXT_3110);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_3111);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3112);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_3113);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_3114);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_3115);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3116);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3117);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_3118);
    } else {
    stringBuffer.append(TEXT_3119);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3120);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3121);
    }
    }
    stringBuffer.append(TEXT_3122);
    }
    }
    stringBuffer.append(TEXT_3123);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_3124);
    return stringBuffer.toString();
  }
}
