package org.eclipse.uml2.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.codegen.util.CodeGenUtil;
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
  protected final String TEXT_4 = NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_5 = "Id";
  protected final String TEXT_6 = NL + " */";
  protected final String TEXT_7 = NL + "package ";
  protected final String TEXT_8 = ";";
  protected final String TEXT_9 = NL + "package ";
  protected final String TEXT_10 = ";";
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the model object '<em><b>";
  protected final String TEXT_14 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_15 = NL + " *" + NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_16 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_17 = NL + " *";
  protected final String TEXT_18 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * <ul>";
  protected final String TEXT_19 = NL + " *   <li>{@link ";
  protected final String TEXT_20 = "#";
  protected final String TEXT_21 = " <em>";
  protected final String TEXT_22 = "</em>}</li>";
  protected final String TEXT_23 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_24 = NL + " *";
  protected final String TEXT_25 = NL + " * @see ";
  protected final String TEXT_26 = "#get";
  protected final String TEXT_27 = "()";
  protected final String TEXT_28 = NL + " * @model ";
  protected final String TEXT_29 = NL + " *        ";
  protected final String TEXT_30 = NL + " * @model";
  protected final String TEXT_31 = NL + " * @extends ";
  protected final String TEXT_32 = NL + " * @generated" + NL + " */";
  protected final String TEXT_33 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_34 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " * <p>";
  protected final String TEXT_35 = NL + " * The following features are implemented:" + NL + " * <ul>";
  protected final String TEXT_36 = NL + " *   <li>{@link ";
  protected final String TEXT_37 = "#";
  protected final String TEXT_38 = " <em>";
  protected final String TEXT_39 = "</em>}</li>";
  protected final String TEXT_40 = NL + " * </ul>";
  protected final String TEXT_41 = NL + " * </p>" + NL + " *" + NL + " * @generated" + NL + " */";
  protected final String TEXT_42 = NL + "public";
  protected final String TEXT_43 = " abstract";
  protected final String TEXT_44 = " class ";
  protected final String TEXT_45 = NL + "public interface ";
  protected final String TEXT_46 = NL + "{";
  protected final String TEXT_47 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_48 = " copyright = ";
  protected final String TEXT_49 = ";";
  protected final String TEXT_50 = NL;
  protected final String TEXT_51 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_52 = " mofDriverNumber = \"";
  protected final String TEXT_53 = "\";";
  protected final String TEXT_54 = NL;
  protected final String TEXT_55 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL;
  protected final String TEXT_56 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_57 = NL + "\t@";
  protected final String TEXT_58 = NL + "\tprotected Object[] ";
  protected final String TEXT_59 = ";" + NL;
  protected final String TEXT_60 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_61 = NL + "\t@";
  protected final String TEXT_62 = NL + "\tprotected int ";
  protected final String TEXT_63 = ";" + NL;
  protected final String TEXT_64 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_65 = NL + "\t@";
  protected final String TEXT_66 = NL + "\tprotected int ";
  protected final String TEXT_67 = " = 0;" + NL;
  protected final String TEXT_68 = NL + "\t/**" + NL + "\t * The cached setting delegate for the '{@link #";
  protected final String TEXT_69 = "() <em>";
  protected final String TEXT_70 = "</em>}' ";
  protected final String TEXT_71 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_72 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_73 = NL + "\t@";
  protected final String TEXT_74 = NL + "\tprotected ";
  protected final String TEXT_75 = ".Internal.SettingDelegate ";
  protected final String TEXT_76 = "__ESETTING_DELEGATE = ((";
  protected final String TEXT_77 = ".Internal)";
  protected final String TEXT_78 = ").getSettingDelegate();" + NL;
  protected final String TEXT_79 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_80 = "() <em>";
  protected final String TEXT_81 = "</em>}' ";
  protected final String TEXT_82 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_83 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_84 = NL + "\t@";
  protected final String TEXT_85 = NL + "\tprotected ";
  protected final String TEXT_86 = " ";
  protected final String TEXT_87 = ";" + NL;
  protected final String TEXT_88 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_89 = "() <em>";
  protected final String TEXT_90 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_91 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_92 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_93 = NL + "\tprotected static final ";
  protected final String TEXT_94 = "[] ";
  protected final String TEXT_95 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_96 = " [0]";
  protected final String TEXT_97 = ";" + NL;
  protected final String TEXT_98 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_99 = "() <em>";
  protected final String TEXT_100 = "</em>}' ";
  protected final String TEXT_101 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_102 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_103 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_104 = NL + "\tprotected static final ";
  protected final String TEXT_105 = " ";
  protected final String TEXT_106 = "; // TODO The default value literal \"";
  protected final String TEXT_107 = "\" is not valid.";
  protected final String TEXT_108 = " = ";
  protected final String TEXT_109 = ";";
  protected final String TEXT_110 = NL;
  protected final String TEXT_111 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_112 = NL + "\t@";
  protected final String TEXT_113 = NL + "\tprotected int ";
  protected final String TEXT_114 = " = 0;" + NL;
  protected final String TEXT_115 = NL + "\t/**" + NL + "\t * The offset of the flags representing the value of the '{@link #";
  protected final String TEXT_116 = "() <em>";
  protected final String TEXT_117 = "</em>}' ";
  protected final String TEXT_118 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_119 = "_EFLAG_OFFSET = ";
  protected final String TEXT_120 = ";" + NL + "" + NL + "\t/**" + NL + "\t * The flags representing the default value of the '{@link #";
  protected final String TEXT_121 = "() <em>";
  protected final String TEXT_122 = "</em>}' ";
  protected final String TEXT_123 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_124 = "_EFLAG_DEFAULT = ";
  protected final String TEXT_125 = ".ordinal()";
  protected final String TEXT_126 = ".VALUES.indexOf(";
  protected final String TEXT_127 = ")";
  protected final String TEXT_128 = " << ";
  protected final String TEXT_129 = "_EFLAG_OFFSET;" + NL + "" + NL + "\t/**" + NL + "\t * The array of enumeration values for '{@link ";
  protected final String TEXT_130 = " ";
  protected final String TEXT_131 = "}'" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprivate static final ";
  protected final String TEXT_132 = "[] ";
  protected final String TEXT_133 = "_EFLAG_VALUES = ";
  protected final String TEXT_134 = ".values()";
  protected final String TEXT_135 = "(";
  protected final String TEXT_136 = "[])";
  protected final String TEXT_137 = ".VALUES.toArray(new ";
  protected final String TEXT_138 = "[";
  protected final String TEXT_139 = ".VALUES.size()])";
  protected final String TEXT_140 = ";" + NL;
  protected final String TEXT_141 = NL + "\t/**" + NL + "\t * The flag";
  protected final String TEXT_142 = " representing the value of the '{@link #";
  protected final String TEXT_143 = "() <em>";
  protected final String TEXT_144 = "</em>}' ";
  protected final String TEXT_145 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_146 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_147 = "_EFLAG = ";
  protected final String TEXT_148 = " << ";
  protected final String TEXT_149 = "_EFLAG_OFFSET";
  protected final String TEXT_150 = ";" + NL;
  protected final String TEXT_151 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_152 = "() <em>";
  protected final String TEXT_153 = "</em>}' ";
  protected final String TEXT_154 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_155 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_156 = NL + "\t@";
  protected final String TEXT_157 = NL + "\tprotected ";
  protected final String TEXT_158 = " ";
  protected final String TEXT_159 = " = ";
  protected final String TEXT_160 = ";" + NL;
  protected final String TEXT_161 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_162 = NL + "\t@";
  protected final String TEXT_163 = NL + "\tprotected int ";
  protected final String TEXT_164 = " = 0;" + NL;
  protected final String TEXT_165 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_166 = " ";
  protected final String TEXT_167 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_168 = "_ESETFLAG = 1 << ";
  protected final String TEXT_169 = ";" + NL;
  protected final String TEXT_170 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_171 = " ";
  protected final String TEXT_172 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_173 = NL + "\t@";
  protected final String TEXT_174 = NL + "\tprotected boolean ";
  protected final String TEXT_175 = "ESet;" + NL;
  protected final String TEXT_176 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_177 = " = ";
  protected final String TEXT_178 = ".getFeatureID(";
  protected final String TEXT_179 = ") - ";
  protected final String TEXT_180 = ";" + NL;
  protected final String TEXT_181 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_182 = " = ";
  protected final String TEXT_183 = ".getFeatureID(";
  protected final String TEXT_184 = ") - ";
  protected final String TEXT_185 = ";" + NL;
  protected final String TEXT_186 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int \"EOPERATION_OFFSET_CORRECTION\" = ";
  protected final String TEXT_187 = ".getOperationID(";
  protected final String TEXT_188 = ") - ";
  protected final String TEXT_189 = ";" + NL;
  protected final String TEXT_190 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_191 = "public";
  protected final String TEXT_192 = "protected";
  protected final String TEXT_193 = " ";
  protected final String TEXT_194 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_195 = NL + "\t\t";
  protected final String TEXT_196 = " |= ";
  protected final String TEXT_197 = "_EFLAG";
  protected final String TEXT_198 = "_DEFAULT";
  protected final String TEXT_199 = ";";
  protected final String TEXT_200 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_201 = NL + "\t@Override";
  protected final String TEXT_202 = NL + "\tprotected ";
  protected final String TEXT_203 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_204 = ";" + NL + "\t}" + NL;
  protected final String TEXT_205 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_206 = NL + "\t@Override";
  protected final String TEXT_207 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_208 = ";" + NL + "\t}" + NL;
  protected final String TEXT_209 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_210 = NL + "\t";
  protected final String TEXT_211 = "[] ";
  protected final String TEXT_212 = "();" + NL;
  protected final String TEXT_213 = NL + "\tpublic ";
  protected final String TEXT_214 = "[] ";
  protected final String TEXT_215 = "()" + NL + "\t{";
  protected final String TEXT_216 = NL + "\t\t";
  protected final String TEXT_217 = " list = (";
  protected final String TEXT_218 = ")";
  protected final String TEXT_219 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_220 = "(";
  protected final String TEXT_221 = "[])";
  protected final String TEXT_222 = "_EEMPTY_ARRAY;";
  protected final String TEXT_223 = NL + "\t\tif (";
  protected final String TEXT_224 = " == null || ";
  protected final String TEXT_225 = ".isEmpty()) return ";
  protected final String TEXT_226 = "(";
  protected final String TEXT_227 = "[])";
  protected final String TEXT_228 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_229 = " list = (";
  protected final String TEXT_230 = ")";
  protected final String TEXT_231 = ";";
  protected final String TEXT_232 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_233 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_234 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_235 = NL + "\t";
  protected final String TEXT_236 = " get";
  protected final String TEXT_237 = "(int index);" + NL;
  protected final String TEXT_238 = NL + "\tpublic ";
  protected final String TEXT_239 = " get";
  protected final String TEXT_240 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_241 = "(";
  protected final String TEXT_242 = ")";
  protected final String TEXT_243 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_244 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_245 = NL + "\tint get";
  protected final String TEXT_246 = "Length();" + NL;
  protected final String TEXT_247 = NL + "\tpublic int get";
  protected final String TEXT_248 = "Length()" + NL + "\t{";
  protected final String TEXT_249 = NL + "\t\treturn ";
  protected final String TEXT_250 = "().size();";
  protected final String TEXT_251 = NL + "\t\treturn ";
  protected final String TEXT_252 = " == null ? 0 : ";
  protected final String TEXT_253 = ".size();";
  protected final String TEXT_254 = NL + "\t}" + NL;
  protected final String TEXT_255 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_256 = NL + "\tvoid set";
  protected final String TEXT_257 = "(";
  protected final String TEXT_258 = "[] new";
  protected final String TEXT_259 = ");" + NL;
  protected final String TEXT_260 = NL + "\tpublic void set";
  protected final String TEXT_261 = "(";
  protected final String TEXT_262 = "[] new";
  protected final String TEXT_263 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_264 = ")";
  protected final String TEXT_265 = "()).setData(new";
  protected final String TEXT_266 = ".length, new";
  protected final String TEXT_267 = ");" + NL + "\t}" + NL;
  protected final String TEXT_268 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_269 = NL + "\tvoid set";
  protected final String TEXT_270 = "(int index, ";
  protected final String TEXT_271 = " element);" + NL;
  protected final String TEXT_272 = NL + "\tpublic void set";
  protected final String TEXT_273 = "(int index, ";
  protected final String TEXT_274 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_275 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_276 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_277 = "</b></em>' ";
  protected final String TEXT_278 = ".";
  protected final String TEXT_279 = NL + "\t * The key is of type ";
  protected final String TEXT_280 = "list of {@link ";
  protected final String TEXT_281 = "}";
  protected final String TEXT_282 = "{@link ";
  protected final String TEXT_283 = "}";
  protected final String TEXT_284 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_285 = "list of {@link ";
  protected final String TEXT_286 = "}";
  protected final String TEXT_287 = "{@link ";
  protected final String TEXT_288 = "}";
  protected final String TEXT_289 = ",";
  protected final String TEXT_290 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_291 = "}";
  protected final String TEXT_292 = ".";
  protected final String TEXT_293 = NL + "\t * The default value is <code>";
  protected final String TEXT_294 = "</code>.";
  protected final String TEXT_295 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_296 = "}.";
  protected final String TEXT_297 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_298 = "#";
  protected final String TEXT_299 = " <em>";
  protected final String TEXT_300 = "</em>}'.";
  protected final String TEXT_301 = NL + "\t * <p>" + NL + "\t * This feature subsets the following features:" + NL + "\t * <ul>";
  protected final String TEXT_302 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_303 = "#";
  protected final String TEXT_304 = "() <em>";
  protected final String TEXT_305 = "</em>}'</li>";
  protected final String TEXT_306 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_307 = NL + "\t * <p>" + NL + "\t * This feature redefines the following features:" + NL + "\t * <ul>";
  protected final String TEXT_308 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_309 = "#";
  protected final String TEXT_310 = "() <em>";
  protected final String TEXT_311 = "</em>}'</li>";
  protected final String TEXT_312 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_313 = NL + "\t * This feature is a derived union.";
  protected final String TEXT_314 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_315 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_316 = "</em>' ";
  protected final String TEXT_317 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_318 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_319 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_320 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_321 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_322 = "</em>' ";
  protected final String TEXT_323 = ".";
  protected final String TEXT_324 = NL + "\t * @see ";
  protected final String TEXT_325 = NL + "\t * @see #isSet";
  protected final String TEXT_326 = "()";
  protected final String TEXT_327 = NL + "\t * @see #unset";
  protected final String TEXT_328 = "()";
  protected final String TEXT_329 = NL + "\t * @see #set";
  protected final String TEXT_330 = "(";
  protected final String TEXT_331 = ")";
  protected final String TEXT_332 = NL + "\t * @see ";
  protected final String TEXT_333 = "#get";
  protected final String TEXT_334 = "()";
  protected final String TEXT_335 = NL + "\t * @see ";
  protected final String TEXT_336 = "#";
  protected final String TEXT_337 = NL + "\t * @model ";
  protected final String TEXT_338 = NL + "\t *        ";
  protected final String TEXT_339 = NL + "\t * @model";
  protected final String TEXT_340 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_341 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_342 = NL + "\t@Override";
  protected final String TEXT_343 = NL + "\t";
  protected final String TEXT_344 = " ";
  protected final String TEXT_345 = "();" + NL;
  protected final String TEXT_346 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_347 = NL + "\tpublic ";
  protected final String TEXT_348 = " ";
  protected final String TEXT_349 = "_";
  protected final String TEXT_350 = "()" + NL + "\t{";
  protected final String TEXT_351 = NL + "\t\treturn ";
  protected final String TEXT_352 = "(";
  protected final String TEXT_353 = "(";
  protected final String TEXT_354 = ")eDynamicGet(";
  protected final String TEXT_355 = ", ";
  protected final String TEXT_356 = ", true, ";
  protected final String TEXT_357 = ")";
  protected final String TEXT_358 = ").";
  protected final String TEXT_359 = "()";
  protected final String TEXT_360 = ";";
  protected final String TEXT_361 = NL + "\t\treturn ";
  protected final String TEXT_362 = "(";
  protected final String TEXT_363 = "(";
  protected final String TEXT_364 = ")eGet(";
  protected final String TEXT_365 = ", true)";
  protected final String TEXT_366 = ").";
  protected final String TEXT_367 = "()";
  protected final String TEXT_368 = ";";
  protected final String TEXT_369 = NL + "\t\treturn ";
  protected final String TEXT_370 = "(";
  protected final String TEXT_371 = "(";
  protected final String TEXT_372 = ")";
  protected final String TEXT_373 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false)";
  protected final String TEXT_374 = ").";
  protected final String TEXT_375 = "()";
  protected final String TEXT_376 = ";";
  protected final String TEXT_377 = NL + "\t\t";
  protected final String TEXT_378 = " ";
  protected final String TEXT_379 = " = (";
  protected final String TEXT_380 = ")eVirtualGet(";
  protected final String TEXT_381 = ");";
  protected final String TEXT_382 = NL + "\t\tif (";
  protected final String TEXT_383 = " == null)" + NL + "\t\t{";
  protected final String TEXT_384 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_385 = ", ";
  protected final String TEXT_386 = " = new ";
  protected final String TEXT_387 = ");";
  protected final String TEXT_388 = NL + "\t\t\t";
  protected final String TEXT_389 = " = new ";
  protected final String TEXT_390 = ";";
  protected final String TEXT_391 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_392 = ";";
  protected final String TEXT_393 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_394 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_395 = ")eContainer();";
  protected final String TEXT_396 = NL + "\t\t";
  protected final String TEXT_397 = " ";
  protected final String TEXT_398 = " = (";
  protected final String TEXT_399 = ")eVirtualGet(";
  protected final String TEXT_400 = ", ";
  protected final String TEXT_401 = ");";
  protected final String TEXT_402 = NL + "\t\tif (";
  protected final String TEXT_403 = " != null && ";
  protected final String TEXT_404 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_405 = " old";
  protected final String TEXT_406 = " = (";
  protected final String TEXT_407 = ")";
  protected final String TEXT_408 = ";" + NL + "\t\t\t";
  protected final String TEXT_409 = " = ";
  protected final String TEXT_410 = "eResolveProxy(old";
  protected final String TEXT_411 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_412 = " != old";
  protected final String TEXT_413 = ")" + NL + "\t\t\t{";
  protected final String TEXT_414 = NL + "\t\t\t\t";
  protected final String TEXT_415 = " new";
  protected final String TEXT_416 = " = (";
  protected final String TEXT_417 = ")";
  protected final String TEXT_418 = ";";
  protected final String TEXT_419 = NL + "\t\t\t\t";
  protected final String TEXT_420 = " msgs = old";
  protected final String TEXT_421 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_422 = ", null, null);";
  protected final String TEXT_423 = NL + "\t\t\t\t";
  protected final String TEXT_424 = " msgs =  old";
  protected final String TEXT_425 = ".eInverseRemove(this, ";
  protected final String TEXT_426 = ", ";
  protected final String TEXT_427 = ".class, null);";
  protected final String TEXT_428 = NL + "\t\t\t\tif (new";
  protected final String TEXT_429 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_430 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_431 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_432 = ", null, msgs);";
  protected final String TEXT_433 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_434 = ".eInverseAdd(this, ";
  protected final String TEXT_435 = ", ";
  protected final String TEXT_436 = ".class, msgs);";
  protected final String TEXT_437 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_438 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_439 = ", ";
  protected final String TEXT_440 = ");";
  protected final String TEXT_441 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_442 = "(this, ";
  protected final String TEXT_443 = ".RESOLVE, ";
  protected final String TEXT_444 = ", old";
  protected final String TEXT_445 = ", ";
  protected final String TEXT_446 = "));";
  protected final String TEXT_447 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_448 = NL + "\t\treturn (";
  protected final String TEXT_449 = ")eVirtualGet(";
  protected final String TEXT_450 = ", ";
  protected final String TEXT_451 = ");";
  protected final String TEXT_452 = NL + "\t\treturn (";
  protected final String TEXT_453 = " & ";
  protected final String TEXT_454 = "_EFLAG) != 0;";
  protected final String TEXT_455 = NL + "\t\treturn ";
  protected final String TEXT_456 = "_EFLAG_VALUES[(";
  protected final String TEXT_457 = " & ";
  protected final String TEXT_458 = "_EFLAG) >>> ";
  protected final String TEXT_459 = "_EFLAG_OFFSET];";
  protected final String TEXT_460 = NL + "\t\treturn ";
  protected final String TEXT_461 = ";";
  protected final String TEXT_462 = NL + "\t\t";
  protected final String TEXT_463 = " ";
  protected final String TEXT_464 = " = basicGet";
  protected final String TEXT_465 = "();" + NL + "\t\treturn ";
  protected final String TEXT_466 = " != null && ";
  protected final String TEXT_467 = ".eIsProxy() ? ";
  protected final String TEXT_468 = "eResolveProxy((";
  protected final String TEXT_469 = ")";
  protected final String TEXT_470 = ") : ";
  protected final String TEXT_471 = ";";
  protected final String TEXT_472 = NL + "\t\treturn new ";
  protected final String TEXT_473 = "((";
  protected final String TEXT_474 = ".Internal)((";
  protected final String TEXT_475 = ".Internal.Wrapper)get";
  protected final String TEXT_476 = "()).featureMap().";
  protected final String TEXT_477 = "list(";
  protected final String TEXT_478 = "));";
  protected final String TEXT_479 = NL + "\t\treturn (";
  protected final String TEXT_480 = ")get";
  protected final String TEXT_481 = "().";
  protected final String TEXT_482 = "list(";
  protected final String TEXT_483 = ");";
  protected final String TEXT_484 = NL + "\t\treturn ((";
  protected final String TEXT_485 = ".Internal.Wrapper)get";
  protected final String TEXT_486 = "()).featureMap().list(";
  protected final String TEXT_487 = ");";
  protected final String TEXT_488 = NL + "\t\treturn get";
  protected final String TEXT_489 = "().list(";
  protected final String TEXT_490 = ");";
  protected final String TEXT_491 = NL + "\t\treturn ";
  protected final String TEXT_492 = "(";
  protected final String TEXT_493 = "(";
  protected final String TEXT_494 = ")";
  protected final String TEXT_495 = "((";
  protected final String TEXT_496 = ".Internal.Wrapper)get";
  protected final String TEXT_497 = "()).featureMap().get(";
  protected final String TEXT_498 = ", true)";
  protected final String TEXT_499 = ").";
  protected final String TEXT_500 = "()";
  protected final String TEXT_501 = ";";
  protected final String TEXT_502 = NL + "\t\treturn ";
  protected final String TEXT_503 = "(";
  protected final String TEXT_504 = "(";
  protected final String TEXT_505 = ")";
  protected final String TEXT_506 = "get";
  protected final String TEXT_507 = "().get(";
  protected final String TEXT_508 = ", true)";
  protected final String TEXT_509 = ").";
  protected final String TEXT_510 = "()";
  protected final String TEXT_511 = ";";
  protected final String TEXT_512 = NL + "\t\t";
  protected final String TEXT_513 = NL + "\t\t";
  protected final String TEXT_514 = NL + "\t\t";
  protected final String TEXT_515 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_516 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_517 = NL + "\t\t\t";
  protected final String TEXT_518 = " result = (";
  protected final String TEXT_519 = ") cache.get(";
  protected final String TEXT_520 = "eResource(), ";
  protected final String TEXT_521 = "this, ";
  protected final String TEXT_522 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_523 = "eResource(), ";
  protected final String TEXT_524 = "this, ";
  protected final String TEXT_525 = ", result = ";
  protected final String TEXT_526 = "new ";
  protected final String TEXT_527 = "(";
  protected final String TEXT_528 = ".";
  protected final String TEXT_529 = "(this)";
  protected final String TEXT_530 = ")";
  protected final String TEXT_531 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_532 = ".";
  protected final String TEXT_533 = "()";
  protected final String TEXT_534 = ";" + NL + "\t\t}";
  protected final String TEXT_535 = NL + "\t\treturn ";
  protected final String TEXT_536 = ".";
  protected final String TEXT_537 = "(this);";
  protected final String TEXT_538 = NL + "\t\t";
  protected final String TEXT_539 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_540 = " eResource = eResource();";
  protected final String TEXT_541 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_542 = NL + "\t\t\t";
  protected final String TEXT_543 = " ";
  protected final String TEXT_544 = " = (";
  protected final String TEXT_545 = ") cache.get(eResource, this, ";
  protected final String TEXT_546 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_547 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_548 = ", ";
  protected final String TEXT_549 = " = new ";
  protected final String TEXT_550 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_551 = ";" + NL + "\t\t}";
  protected final String TEXT_552 = NL + "\t\treturn new ";
  protected final String TEXT_553 = ";";
  protected final String TEXT_554 = NL + "\t\t";
  protected final String TEXT_555 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_556 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_557 = " method = getClass().getMethod(\"";
  protected final String TEXT_558 = "\", null);";
  protected final String TEXT_559 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_560 = NL + "\t\t\t\t";
  protected final String TEXT_561 = " ";
  protected final String TEXT_562 = " = (";
  protected final String TEXT_563 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_564 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_565 = " union = ";
  protected final String TEXT_566 = "Helper(new ";
  protected final String TEXT_567 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_568 = " = new ";
  protected final String TEXT_569 = "(this, ";
  protected final String TEXT_570 = "null";
  protected final String TEXT_571 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_572 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_573 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_574 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_575 = NL + "\t\t\t";
  protected final String TEXT_576 = " ";
  protected final String TEXT_577 = " = (";
  protected final String TEXT_578 = ") cache.get(eResource(), this, ";
  protected final String TEXT_579 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_580 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_581 = " union = ";
  protected final String TEXT_582 = "Helper(new ";
  protected final String TEXT_583 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_584 = ", ";
  protected final String TEXT_585 = " = new ";
  protected final String TEXT_586 = "(this, ";
  protected final String TEXT_587 = "null";
  protected final String TEXT_588 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_589 = ";";
  protected final String TEXT_590 = NL + "\t\t}";
  protected final String TEXT_591 = NL + "\t\t";
  protected final String TEXT_592 = " union = ";
  protected final String TEXT_593 = "Helper(new ";
  protected final String TEXT_594 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_595 = "(this, ";
  protected final String TEXT_596 = "null";
  protected final String TEXT_597 = ", union.size(), union.toArray());";
  protected final String TEXT_598 = NL + "\t\tif (isSet";
  protected final String TEXT_599 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_600 = "();" + NL + "\t\t}";
  protected final String TEXT_601 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_602 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_603 = "();" + NL + "\t\t}";
  protected final String TEXT_604 = NL + "\t\t";
  protected final String TEXT_605 = " ";
  protected final String TEXT_606 = " = ";
  protected final String TEXT_607 = "();" + NL + "\t\tif (";
  protected final String TEXT_608 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_609 = ";" + NL + "\t\t}";
  protected final String TEXT_610 = NL + "\t\treturn ";
  protected final String TEXT_611 = "super.";
  protected final String TEXT_612 = "()";
  protected final String TEXT_613 = "null";
  protected final String TEXT_614 = ";";
  protected final String TEXT_615 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_616 = "' ";
  protected final String TEXT_617 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_618 = NL + "\t}" + NL;
  protected final String TEXT_619 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_620 = NL + "\t@Override";
  protected final String TEXT_621 = NL + "\tpublic ";
  protected final String TEXT_622 = " basicGet";
  protected final String TEXT_623 = "()" + NL + "\t{";
  protected final String TEXT_624 = NL + "\t\treturn (";
  protected final String TEXT_625 = ")eDynamicGet(";
  protected final String TEXT_626 = ", ";
  protected final String TEXT_627 = ", false, ";
  protected final String TEXT_628 = ");";
  protected final String TEXT_629 = NL + "\t\treturn ";
  protected final String TEXT_630 = "(";
  protected final String TEXT_631 = "(";
  protected final String TEXT_632 = ")";
  protected final String TEXT_633 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false)";
  protected final String TEXT_634 = ").";
  protected final String TEXT_635 = "()";
  protected final String TEXT_636 = ";";
  protected final String TEXT_637 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_638 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_639 = ")eInternalContainer();";
  protected final String TEXT_640 = NL + "\t\treturn (";
  protected final String TEXT_641 = ")eVirtualGet(";
  protected final String TEXT_642 = ");";
  protected final String TEXT_643 = NL + "\t\treturn ";
  protected final String TEXT_644 = ";";
  protected final String TEXT_645 = NL + "\t\treturn (";
  protected final String TEXT_646 = ")((";
  protected final String TEXT_647 = ".Internal.Wrapper)get";
  protected final String TEXT_648 = "()).featureMap().get(";
  protected final String TEXT_649 = ", false);";
  protected final String TEXT_650 = NL + "\t\treturn (";
  protected final String TEXT_651 = ")get";
  protected final String TEXT_652 = "().get(";
  protected final String TEXT_653 = ", false);";
  protected final String TEXT_654 = NL + "\t\treturn ";
  protected final String TEXT_655 = ".";
  protected final String TEXT_656 = "(this);";
  protected final String TEXT_657 = NL + "\t\tif (isSet";
  protected final String TEXT_658 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_659 = "basicGet";
  protected final String TEXT_660 = "();" + NL + "\t\t}";
  protected final String TEXT_661 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_662 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_663 = "basicGet";
  protected final String TEXT_664 = "();" + NL + "\t\t}";
  protected final String TEXT_665 = NL + "\t\t";
  protected final String TEXT_666 = " ";
  protected final String TEXT_667 = " = ";
  protected final String TEXT_668 = "basicGet";
  protected final String TEXT_669 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_670 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_671 = ";" + NL + "\t\t}";
  protected final String TEXT_672 = NL + "\t\treturn ";
  protected final String TEXT_673 = "super.basicGet";
  protected final String TEXT_674 = "()";
  protected final String TEXT_675 = "null";
  protected final String TEXT_676 = ";";
  protected final String TEXT_677 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_678 = "' ";
  protected final String TEXT_679 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_680 = NL + "\t}" + NL;
  protected final String TEXT_681 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_682 = NL + "\t@Override";
  protected final String TEXT_683 = NL + "\tpublic ";
  protected final String TEXT_684 = " basicSet";
  protected final String TEXT_685 = "(";
  protected final String TEXT_686 = " new";
  protected final String TEXT_687 = ", ";
  protected final String TEXT_688 = " msgs)" + NL + "\t{";
  protected final String TEXT_689 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_690 = ")new";
  protected final String TEXT_691 = ", ";
  protected final String TEXT_692 = ", msgs);";
  protected final String TEXT_693 = NL + "\t\t";
  protected final String TEXT_694 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_695 = NL + "\t\t\t";
  protected final String TEXT_696 = " ";
  protected final String TEXT_697 = " = ";
  protected final String TEXT_698 = "();";
  protected final String TEXT_699 = NL + "\t\t\tObject ";
  protected final String TEXT_700 = " = eVirtualGet(";
  protected final String TEXT_701 = ");";
  protected final String TEXT_702 = NL + "\t\t\tif (";
  protected final String TEXT_703 = " != null && ";
  protected final String TEXT_704 = " != new";
  protected final String TEXT_705 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_706 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_707 = NL + "\t\t\tif (new";
  protected final String TEXT_708 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_709 = NL + "\t\t\t\t";
  protected final String TEXT_710 = " ";
  protected final String TEXT_711 = " = ";
  protected final String TEXT_712 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_713 = ".contains(new";
  protected final String TEXT_714 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_715 = ".add(new";
  protected final String TEXT_716 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_717 = NL + "\t\t\t\t";
  protected final String TEXT_718 = " ";
  protected final String TEXT_719 = " = ";
  protected final String TEXT_720 = "();";
  protected final String TEXT_721 = NL + "\t\t\t\tObject ";
  protected final String TEXT_722 = " = eVirtualGet(";
  protected final String TEXT_723 = ");";
  protected final String TEXT_724 = NL + "\t\t\t\tif (new";
  protected final String TEXT_725 = " != ";
  protected final String TEXT_726 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_727 = "(new";
  protected final String TEXT_728 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_729 = NL + "\t\t\t}";
  protected final String TEXT_730 = NL + "\t\t}";
  protected final String TEXT_731 = NL + "\t\treturn msgs;";
  protected final String TEXT_732 = NL + "\t\tmsgs = eDynamicInverseAdd((";
  protected final String TEXT_733 = ")new";
  protected final String TEXT_734 = ", ";
  protected final String TEXT_735 = ", msgs);";
  protected final String TEXT_736 = NL + "\t\t";
  protected final String TEXT_737 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_738 = NL + "\t\t\t";
  protected final String TEXT_739 = " ";
  protected final String TEXT_740 = " = ";
  protected final String TEXT_741 = "();";
  protected final String TEXT_742 = NL + "\t\t\tObject ";
  protected final String TEXT_743 = " = eVirtualGet(";
  protected final String TEXT_744 = ");";
  protected final String TEXT_745 = NL + "\t\t\tif (";
  protected final String TEXT_746 = " != null && ";
  protected final String TEXT_747 = " != new";
  protected final String TEXT_748 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_749 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_750 = NL + "\t\t\tif (new";
  protected final String TEXT_751 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_752 = NL + "\t\t\t\t";
  protected final String TEXT_753 = " ";
  protected final String TEXT_754 = " = ";
  protected final String TEXT_755 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_756 = ".contains(new";
  protected final String TEXT_757 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_758 = ".add(new";
  protected final String TEXT_759 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_760 = NL + "\t\t\t\t";
  protected final String TEXT_761 = " ";
  protected final String TEXT_762 = " = ";
  protected final String TEXT_763 = "();";
  protected final String TEXT_764 = NL + "\t\t\t\tObject ";
  protected final String TEXT_765 = " = eVirtualGet(";
  protected final String TEXT_766 = ");";
  protected final String TEXT_767 = NL + "\t\t\t\tif (new";
  protected final String TEXT_768 = " != ";
  protected final String TEXT_769 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_770 = "(new";
  protected final String TEXT_771 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_772 = NL + "\t\t\t}";
  protected final String TEXT_773 = NL + "\t\t}";
  protected final String TEXT_774 = NL + "\t\treturn msgs;";
  protected final String TEXT_775 = NL + "\t\tObject old";
  protected final String TEXT_776 = " = eVirtualSet(";
  protected final String TEXT_777 = ", new";
  protected final String TEXT_778 = ");";
  protected final String TEXT_779 = NL + "\t\t";
  protected final String TEXT_780 = " old";
  protected final String TEXT_781 = " = ";
  protected final String TEXT_782 = ";" + NL + "\t\t";
  protected final String TEXT_783 = " = new";
  protected final String TEXT_784 = ";";
  protected final String TEXT_785 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_786 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_787 = NL + "\t\tboolean old";
  protected final String TEXT_788 = "ESet = (";
  protected final String TEXT_789 = " & ";
  protected final String TEXT_790 = "_ESETFLAG) != 0;";
  protected final String TEXT_791 = NL + "\t\t";
  protected final String TEXT_792 = " |= ";
  protected final String TEXT_793 = "_ESETFLAG;";
  protected final String TEXT_794 = NL + "\t\tboolean old";
  protected final String TEXT_795 = "ESet = ";
  protected final String TEXT_796 = "ESet;";
  protected final String TEXT_797 = NL + "\t\t";
  protected final String TEXT_798 = "ESet = true;";
  protected final String TEXT_799 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_800 = NL + "\t\t\t";
  protected final String TEXT_801 = " notification = new ";
  protected final String TEXT_802 = "(this, ";
  protected final String TEXT_803 = ".SET, ";
  protected final String TEXT_804 = ", ";
  protected final String TEXT_805 = "isSetChange ? null : old";
  protected final String TEXT_806 = "old";
  protected final String TEXT_807 = ", new";
  protected final String TEXT_808 = ", ";
  protected final String TEXT_809 = "isSetChange";
  protected final String TEXT_810 = "!old";
  protected final String TEXT_811 = "ESet";
  protected final String TEXT_812 = ");";
  protected final String TEXT_813 = NL + "\t\t\t";
  protected final String TEXT_814 = " notification = new ";
  protected final String TEXT_815 = "(this, ";
  protected final String TEXT_816 = ".SET, ";
  protected final String TEXT_817 = ", ";
  protected final String TEXT_818 = "old";
  protected final String TEXT_819 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_820 = "old";
  protected final String TEXT_821 = ", new";
  protected final String TEXT_822 = ");";
  protected final String TEXT_823 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_824 = NL + "\t\t";
  protected final String TEXT_825 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_826 = NL + "\t\t\t";
  protected final String TEXT_827 = " ";
  protected final String TEXT_828 = " = ";
  protected final String TEXT_829 = "();";
  protected final String TEXT_830 = NL + "\t\t\tObject ";
  protected final String TEXT_831 = " = eVirtualGet(";
  protected final String TEXT_832 = ");";
  protected final String TEXT_833 = NL + "\t\t\tif (";
  protected final String TEXT_834 = " != null && ";
  protected final String TEXT_835 = " != new";
  protected final String TEXT_836 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_837 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_838 = NL + "\t\t\tif (new";
  protected final String TEXT_839 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_840 = NL + "\t\t\t\t";
  protected final String TEXT_841 = " ";
  protected final String TEXT_842 = " = ";
  protected final String TEXT_843 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_844 = ".contains(new";
  protected final String TEXT_845 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_846 = ".add(new";
  protected final String TEXT_847 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_848 = NL + "\t\t\t\t";
  protected final String TEXT_849 = " ";
  protected final String TEXT_850 = " = ";
  protected final String TEXT_851 = "();";
  protected final String TEXT_852 = NL + "\t\t\t\tObject ";
  protected final String TEXT_853 = " = eVirtualGet(";
  protected final String TEXT_854 = ");";
  protected final String TEXT_855 = NL + "\t\t\t\tif (new";
  protected final String TEXT_856 = " != ";
  protected final String TEXT_857 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_858 = "(new";
  protected final String TEXT_859 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_860 = NL + "\t\t\t}";
  protected final String TEXT_861 = NL + "\t\t}";
  protected final String TEXT_862 = NL + "\t\treturn msgs;";
  protected final String TEXT_863 = NL + "\t\treturn ((";
  protected final String TEXT_864 = ".Internal)((";
  protected final String TEXT_865 = ".Internal.Wrapper)get";
  protected final String TEXT_866 = "()).featureMap()).basicAdd(";
  protected final String TEXT_867 = ", new";
  protected final String TEXT_868 = ", msgs);";
  protected final String TEXT_869 = NL + "\t\treturn ((";
  protected final String TEXT_870 = ".Internal)get";
  protected final String TEXT_871 = "()).basicAdd(";
  protected final String TEXT_872 = ", new";
  protected final String TEXT_873 = ", msgs);";
  protected final String TEXT_874 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_875 = "' ";
  protected final String TEXT_876 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_877 = NL + "\t}" + NL;
  protected final String TEXT_878 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_879 = "#";
  protected final String TEXT_880 = " <em>";
  protected final String TEXT_881 = "</em>}' ";
  protected final String TEXT_882 = ".";
  protected final String TEXT_883 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_884 = "</em>' ";
  protected final String TEXT_885 = ".";
  protected final String TEXT_886 = NL + "\t * @see ";
  protected final String TEXT_887 = NL + "\t * @see #isSet";
  protected final String TEXT_888 = "()";
  protected final String TEXT_889 = NL + "\t * @see #unset";
  protected final String TEXT_890 = "()";
  protected final String TEXT_891 = NL + "\t * @see #";
  protected final String TEXT_892 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_893 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_894 = NL + "\t@Override";
  protected final String TEXT_895 = NL + "\tvoid set";
  protected final String TEXT_896 = "(";
  protected final String TEXT_897 = " value);" + NL;
  protected final String TEXT_898 = NL + "\tpublic void set";
  protected final String TEXT_899 = "_";
  protected final String TEXT_900 = "(";
  protected final String TEXT_901 = " ";
  protected final String TEXT_902 = ")" + NL + "\t{";
  protected final String TEXT_903 = NL + "\t\tnew";
  protected final String TEXT_904 = " = new";
  protected final String TEXT_905 = " == null ? ";
  protected final String TEXT_906 = " : new";
  protected final String TEXT_907 = ";";
  protected final String TEXT_908 = NL + "\t\teDynamicSet(";
  protected final String TEXT_909 = ", ";
  protected final String TEXT_910 = ", ";
  protected final String TEXT_911 = "new ";
  protected final String TEXT_912 = "(";
  protected final String TEXT_913 = "new";
  protected final String TEXT_914 = ")";
  protected final String TEXT_915 = ");";
  protected final String TEXT_916 = NL + "\t\teSet(";
  protected final String TEXT_917 = ", ";
  protected final String TEXT_918 = "new ";
  protected final String TEXT_919 = "(";
  protected final String TEXT_920 = "new";
  protected final String TEXT_921 = ")";
  protected final String TEXT_922 = ");";
  protected final String TEXT_923 = NL + "\t\t";
  protected final String TEXT_924 = "__ESETTING_DELEGATE.dynamicSet(this, null, 0, ";
  protected final String TEXT_925 = "new ";
  protected final String TEXT_926 = "(";
  protected final String TEXT_927 = "new";
  protected final String TEXT_928 = ")";
  protected final String TEXT_929 = ");";
  protected final String TEXT_930 = NL + "\t\tif (new";
  protected final String TEXT_931 = " != eInternalContainer() || (eContainerFeatureID() != ";
  protected final String TEXT_932 = " && new";
  protected final String TEXT_933 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_934 = ".isAncestor(this, ";
  protected final String TEXT_935 = "new";
  protected final String TEXT_936 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_937 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_938 = NL + "\t\t\t";
  protected final String TEXT_939 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_940 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_941 = ")new";
  protected final String TEXT_942 = ").eInverseAdd(this, ";
  protected final String TEXT_943 = ", ";
  protected final String TEXT_944 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_945 = "(";
  protected final String TEXT_946 = "new";
  protected final String TEXT_947 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_948 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_949 = "(this, ";
  protected final String TEXT_950 = ".SET, ";
  protected final String TEXT_951 = ", new";
  protected final String TEXT_952 = ", new";
  protected final String TEXT_953 = "));";
  protected final String TEXT_954 = NL + "\t\t";
  protected final String TEXT_955 = " ";
  protected final String TEXT_956 = " = (";
  protected final String TEXT_957 = ")eVirtualGet(";
  protected final String TEXT_958 = ");";
  protected final String TEXT_959 = NL + "\t\tif (new";
  protected final String TEXT_960 = " != ";
  protected final String TEXT_961 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_962 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_963 = " != null)";
  protected final String TEXT_964 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_965 = ")";
  protected final String TEXT_966 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_967 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_968 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_969 = ")new";
  protected final String TEXT_970 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_971 = ", null, msgs);";
  protected final String TEXT_972 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_973 = ")";
  protected final String TEXT_974 = ").eInverseRemove(this, ";
  protected final String TEXT_975 = ", ";
  protected final String TEXT_976 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_977 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_978 = ")new";
  protected final String TEXT_979 = ").eInverseAdd(this, ";
  protected final String TEXT_980 = ", ";
  protected final String TEXT_981 = ".class, msgs);";
  protected final String TEXT_982 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_983 = "(";
  protected final String TEXT_984 = "new";
  protected final String TEXT_985 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_986 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_987 = NL + "\t\t\tboolean old";
  protected final String TEXT_988 = "ESet = eVirtualIsSet(";
  protected final String TEXT_989 = ");";
  protected final String TEXT_990 = NL + "\t\t\tboolean old";
  protected final String TEXT_991 = "ESet = (";
  protected final String TEXT_992 = " & ";
  protected final String TEXT_993 = "_ESETFLAG) != 0;";
  protected final String TEXT_994 = NL + "\t\t\t";
  protected final String TEXT_995 = " |= ";
  protected final String TEXT_996 = "_ESETFLAG;";
  protected final String TEXT_997 = NL + "\t\t\tboolean old";
  protected final String TEXT_998 = "ESet = ";
  protected final String TEXT_999 = "ESet;";
  protected final String TEXT_1000 = NL + "\t\t\t";
  protected final String TEXT_1001 = "ESet = true;";
  protected final String TEXT_1002 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1003 = "(this, ";
  protected final String TEXT_1004 = ".SET, ";
  protected final String TEXT_1005 = ", new";
  protected final String TEXT_1006 = ", new";
  protected final String TEXT_1007 = ", !old";
  protected final String TEXT_1008 = "ESet));";
  protected final String TEXT_1009 = NL + "\t\t}";
  protected final String TEXT_1010 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1011 = "(this, ";
  protected final String TEXT_1012 = ".SET, ";
  protected final String TEXT_1013 = ", new";
  protected final String TEXT_1014 = ", new";
  protected final String TEXT_1015 = "));";
  protected final String TEXT_1016 = NL + "\t\t";
  protected final String TEXT_1017 = " old";
  protected final String TEXT_1018 = " = (";
  protected final String TEXT_1019 = " & ";
  protected final String TEXT_1020 = "_EFLAG) != 0;";
  protected final String TEXT_1021 = NL + "\t\t";
  protected final String TEXT_1022 = " old";
  protected final String TEXT_1023 = " = ";
  protected final String TEXT_1024 = "_EFLAG_VALUES[(";
  protected final String TEXT_1025 = " & ";
  protected final String TEXT_1026 = "_EFLAG) >>> ";
  protected final String TEXT_1027 = "_EFLAG_OFFSET];";
  protected final String TEXT_1028 = NL + "\t\tif (new";
  protected final String TEXT_1029 = ") ";
  protected final String TEXT_1030 = " |= ";
  protected final String TEXT_1031 = "_EFLAG; else ";
  protected final String TEXT_1032 = " &= ~";
  protected final String TEXT_1033 = "_EFLAG;";
  protected final String TEXT_1034 = NL + "\t\tif (new";
  protected final String TEXT_1035 = " == null) new";
  protected final String TEXT_1036 = " = ";
  protected final String TEXT_1037 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_1038 = " = ";
  protected final String TEXT_1039 = " & ~";
  protected final String TEXT_1040 = "_EFLAG | ";
  protected final String TEXT_1041 = "new";
  protected final String TEXT_1042 = ".ordinal()";
  protected final String TEXT_1043 = ".VALUES.indexOf(new";
  protected final String TEXT_1044 = ")";
  protected final String TEXT_1045 = " << ";
  protected final String TEXT_1046 = "_EFLAG_OFFSET;";
  protected final String TEXT_1047 = NL + "\t\t";
  protected final String TEXT_1048 = " old";
  protected final String TEXT_1049 = " = ";
  protected final String TEXT_1050 = ";";
  protected final String TEXT_1051 = NL + "\t\t";
  protected final String TEXT_1052 = " ";
  protected final String TEXT_1053 = " = new";
  protected final String TEXT_1054 = " == null ? ";
  protected final String TEXT_1055 = " : new";
  protected final String TEXT_1056 = ";";
  protected final String TEXT_1057 = NL + "\t\t";
  protected final String TEXT_1058 = " = new";
  protected final String TEXT_1059 = " == null ? ";
  protected final String TEXT_1060 = " : new";
  protected final String TEXT_1061 = ";";
  protected final String TEXT_1062 = NL + "\t\t";
  protected final String TEXT_1063 = " ";
  protected final String TEXT_1064 = " = ";
  protected final String TEXT_1065 = "new";
  protected final String TEXT_1066 = ";";
  protected final String TEXT_1067 = NL + "\t\t";
  protected final String TEXT_1068 = " = ";
  protected final String TEXT_1069 = "new";
  protected final String TEXT_1070 = ";";
  protected final String TEXT_1071 = NL + "\t\tObject old";
  protected final String TEXT_1072 = " = eVirtualSet(";
  protected final String TEXT_1073 = ", ";
  protected final String TEXT_1074 = ");";
  protected final String TEXT_1075 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1076 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1077 = NL + "\t\tboolean old";
  protected final String TEXT_1078 = "ESet = (";
  protected final String TEXT_1079 = " & ";
  protected final String TEXT_1080 = "_ESETFLAG) != 0;";
  protected final String TEXT_1081 = NL + "\t\t";
  protected final String TEXT_1082 = " |= ";
  protected final String TEXT_1083 = "_ESETFLAG;";
  protected final String TEXT_1084 = NL + "\t\tboolean old";
  protected final String TEXT_1085 = "ESet = ";
  protected final String TEXT_1086 = "ESet;";
  protected final String TEXT_1087 = NL + "\t\t";
  protected final String TEXT_1088 = "ESet = true;";
  protected final String TEXT_1089 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1090 = "(this, ";
  protected final String TEXT_1091 = ".SET, ";
  protected final String TEXT_1092 = ", ";
  protected final String TEXT_1093 = "isSetChange ? ";
  protected final String TEXT_1094 = " : old";
  protected final String TEXT_1095 = "old";
  protected final String TEXT_1096 = ", ";
  protected final String TEXT_1097 = "new";
  protected final String TEXT_1098 = ", ";
  protected final String TEXT_1099 = "isSetChange";
  protected final String TEXT_1100 = "!old";
  protected final String TEXT_1101 = "ESet";
  protected final String TEXT_1102 = "));";
  protected final String TEXT_1103 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1104 = "(this, ";
  protected final String TEXT_1105 = ".SET, ";
  protected final String TEXT_1106 = ", ";
  protected final String TEXT_1107 = "old";
  protected final String TEXT_1108 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_1109 = " : old";
  protected final String TEXT_1110 = "old";
  protected final String TEXT_1111 = ", ";
  protected final String TEXT_1112 = "new";
  protected final String TEXT_1113 = "));";
  protected final String TEXT_1114 = NL + "\t\t";
  protected final String TEXT_1115 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_1116 = NL + "\t\t\t";
  protected final String TEXT_1117 = " ";
  protected final String TEXT_1118 = " = ";
  protected final String TEXT_1119 = "();";
  protected final String TEXT_1120 = NL + "\t\t\tObject ";
  protected final String TEXT_1121 = " = eVirtualGet(";
  protected final String TEXT_1122 = ");";
  protected final String TEXT_1123 = NL + "\t\t\tif (";
  protected final String TEXT_1124 = " != null && ";
  protected final String TEXT_1125 = " != new";
  protected final String TEXT_1126 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_1127 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_1128 = NL + "\t\t\tif (new";
  protected final String TEXT_1129 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_1130 = NL + "\t\t\t\t";
  protected final String TEXT_1131 = " ";
  protected final String TEXT_1132 = " = ";
  protected final String TEXT_1133 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_1134 = ".contains(new";
  protected final String TEXT_1135 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_1136 = ".add(new";
  protected final String TEXT_1137 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1138 = NL + "\t\t\t\t";
  protected final String TEXT_1139 = " ";
  protected final String TEXT_1140 = " = ";
  protected final String TEXT_1141 = "();";
  protected final String TEXT_1142 = NL + "\t\t\t\tObject ";
  protected final String TEXT_1143 = " = eVirtualGet(";
  protected final String TEXT_1144 = ");";
  protected final String TEXT_1145 = NL + "\t\t\t\tif (new";
  protected final String TEXT_1146 = " != ";
  protected final String TEXT_1147 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_1148 = "(new";
  protected final String TEXT_1149 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1150 = NL + "\t\t\t}";
  protected final String TEXT_1151 = NL + "\t\t}";
  protected final String TEXT_1152 = NL + "\t\t((";
  protected final String TEXT_1153 = ".Internal)((";
  protected final String TEXT_1154 = ".Internal.Wrapper)get";
  protected final String TEXT_1155 = "()).featureMap()).set(";
  protected final String TEXT_1156 = ", ";
  protected final String TEXT_1157 = "new ";
  protected final String TEXT_1158 = "(";
  protected final String TEXT_1159 = "new";
  protected final String TEXT_1160 = ")";
  protected final String TEXT_1161 = ");";
  protected final String TEXT_1162 = NL + "\t\t((";
  protected final String TEXT_1163 = ".Internal)get";
  protected final String TEXT_1164 = "()).set(";
  protected final String TEXT_1165 = ", ";
  protected final String TEXT_1166 = "new ";
  protected final String TEXT_1167 = "(";
  protected final String TEXT_1168 = "new";
  protected final String TEXT_1169 = ")";
  protected final String TEXT_1170 = ");";
  protected final String TEXT_1171 = NL + "\t\t";
  protected final String TEXT_1172 = NL + "\t\t";
  protected final String TEXT_1173 = ".";
  protected final String TEXT_1174 = "(this, ";
  protected final String TEXT_1175 = ");";
  protected final String TEXT_1176 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_1177 = "' ";
  protected final String TEXT_1178 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1179 = NL + "\t}" + NL;
  protected final String TEXT_1180 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1181 = NL + "\t@Override";
  protected final String TEXT_1182 = NL + "\tpublic ";
  protected final String TEXT_1183 = " basicUnset";
  protected final String TEXT_1184 = "(";
  protected final String TEXT_1185 = " msgs)" + NL + "\t{";
  protected final String TEXT_1186 = NL + "\t\treturn eDynamicInverseRemove((";
  protected final String TEXT_1187 = ")";
  protected final String TEXT_1188 = "basicGet";
  protected final String TEXT_1189 = "(), ";
  protected final String TEXT_1190 = ", msgs);";
  protected final String TEXT_1191 = "Object old";
  protected final String TEXT_1192 = " = ";
  protected final String TEXT_1193 = "eVirtualUnset(";
  protected final String TEXT_1194 = ");";
  protected final String TEXT_1195 = NL + "\t\t";
  protected final String TEXT_1196 = " old";
  protected final String TEXT_1197 = " = ";
  protected final String TEXT_1198 = ";";
  protected final String TEXT_1199 = NL + "\t\t";
  protected final String TEXT_1200 = " = null;";
  protected final String TEXT_1201 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1202 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1203 = NL + "\t\tboolean old";
  protected final String TEXT_1204 = "ESet = (";
  protected final String TEXT_1205 = " & ";
  protected final String TEXT_1206 = "_ESETFLAG) != 0;";
  protected final String TEXT_1207 = NL + "\t\t";
  protected final String TEXT_1208 = " &= ~";
  protected final String TEXT_1209 = "_ESETFLAG;";
  protected final String TEXT_1210 = NL + "\t\tboolean old";
  protected final String TEXT_1211 = "ESet = ";
  protected final String TEXT_1212 = "ESet;";
  protected final String TEXT_1213 = NL + "\t\t";
  protected final String TEXT_1214 = "ESet = false;";
  protected final String TEXT_1215 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1216 = " notification = new ";
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
  protected final String TEXT_1227 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1228 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1229 = "' ";
  protected final String TEXT_1230 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1231 = NL + "\t}" + NL;
  protected final String TEXT_1232 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1233 = "#";
  protected final String TEXT_1234 = " <em>";
  protected final String TEXT_1235 = "</em>}' ";
  protected final String TEXT_1236 = ".";
  protected final String TEXT_1237 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1238 = NL + "\t * @see #isSet";
  protected final String TEXT_1239 = "()";
  protected final String TEXT_1240 = NL + "\t * @see #";
  protected final String TEXT_1241 = "()";
  protected final String TEXT_1242 = NL + "\t * @see #set";
  protected final String TEXT_1243 = "(";
  protected final String TEXT_1244 = ")";
  protected final String TEXT_1245 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1246 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1247 = NL + "\t@Override";
  protected final String TEXT_1248 = NL + "\tvoid unset";
  protected final String TEXT_1249 = "();" + NL;
  protected final String TEXT_1250 = NL + "\tpublic void unset";
  protected final String TEXT_1251 = "_";
  protected final String TEXT_1252 = "()" + NL + "\t{";
  protected final String TEXT_1253 = NL + "\t\teDynamicUnset(";
  protected final String TEXT_1254 = ", ";
  protected final String TEXT_1255 = ");";
  protected final String TEXT_1256 = NL + "\t\teUnset(";
  protected final String TEXT_1257 = ");";
  protected final String TEXT_1258 = NL + "\t\t";
  protected final String TEXT_1259 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_1260 = NL + "\t\t";
  protected final String TEXT_1261 = " ";
  protected final String TEXT_1262 = " = (";
  protected final String TEXT_1263 = ")eVirtualGet(";
  protected final String TEXT_1264 = ");";
  protected final String TEXT_1265 = NL + "\t\tif (";
  protected final String TEXT_1266 = " != null) ((";
  protected final String TEXT_1267 = ".Unsettable";
  protected final String TEXT_1268 = ")";
  protected final String TEXT_1269 = ").unset();";
  protected final String TEXT_1270 = NL + "\t\t";
  protected final String TEXT_1271 = " ";
  protected final String TEXT_1272 = " = (";
  protected final String TEXT_1273 = ")eVirtualGet(";
  protected final String TEXT_1274 = ");";
  protected final String TEXT_1275 = NL + "\t\tif (";
  protected final String TEXT_1276 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1277 = " msgs = null;";
  protected final String TEXT_1278 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1279 = ")";
  protected final String TEXT_1280 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1281 = ", null, msgs);";
  protected final String TEXT_1282 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1283 = ")";
  protected final String TEXT_1284 = ").eInverseRemove(this, ";
  protected final String TEXT_1285 = ", ";
  protected final String TEXT_1286 = ".class, msgs);";
  protected final String TEXT_1287 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1288 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1289 = NL + "\t\t\tboolean old";
  protected final String TEXT_1290 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1291 = ");";
  protected final String TEXT_1292 = NL + "\t\t\tboolean old";
  protected final String TEXT_1293 = "ESet = (";
  protected final String TEXT_1294 = " & ";
  protected final String TEXT_1295 = "_ESETFLAG) != 0;";
  protected final String TEXT_1296 = NL + "\t\t\t";
  protected final String TEXT_1297 = " &= ~";
  protected final String TEXT_1298 = "_ESETFLAG;";
  protected final String TEXT_1299 = NL + "\t\t\tboolean old";
  protected final String TEXT_1300 = "ESet = ";
  protected final String TEXT_1301 = "ESet;";
  protected final String TEXT_1302 = NL + "\t\t\t";
  protected final String TEXT_1303 = "ESet = false;";
  protected final String TEXT_1304 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1305 = "(this, ";
  protected final String TEXT_1306 = ".UNSET, ";
  protected final String TEXT_1307 = ", null, null, old";
  protected final String TEXT_1308 = "ESet));";
  protected final String TEXT_1309 = NL + "\t\t}";
  protected final String TEXT_1310 = NL + "\t\t";
  protected final String TEXT_1311 = " old";
  protected final String TEXT_1312 = " = (";
  protected final String TEXT_1313 = " & ";
  protected final String TEXT_1314 = "_EFLAG) != 0;";
  protected final String TEXT_1315 = NL + "\t\t";
  protected final String TEXT_1316 = " old";
  protected final String TEXT_1317 = " = ";
  protected final String TEXT_1318 = "_EFLAG_VALUES[(";
  protected final String TEXT_1319 = " & ";
  protected final String TEXT_1320 = "_EFLAG) >>> ";
  protected final String TEXT_1321 = "_EFLAG_OFFSET];";
  protected final String TEXT_1322 = NL + "\t\tObject old";
  protected final String TEXT_1323 = " = eVirtualUnset(";
  protected final String TEXT_1324 = ");";
  protected final String TEXT_1325 = NL + "\t\t";
  protected final String TEXT_1326 = " old";
  protected final String TEXT_1327 = " = ";
  protected final String TEXT_1328 = ";";
  protected final String TEXT_1329 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1330 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1331 = NL + "\t\tboolean old";
  protected final String TEXT_1332 = "ESet = (";
  protected final String TEXT_1333 = " & ";
  protected final String TEXT_1334 = "_ESETFLAG) != 0;";
  protected final String TEXT_1335 = NL + "\t\tboolean old";
  protected final String TEXT_1336 = "ESet = ";
  protected final String TEXT_1337 = "ESet;";
  protected final String TEXT_1338 = NL + "\t\t";
  protected final String TEXT_1339 = " = null;";
  protected final String TEXT_1340 = NL + "\t\t";
  protected final String TEXT_1341 = " &= ~";
  protected final String TEXT_1342 = "_ESETFLAG;";
  protected final String TEXT_1343 = NL + "\t\t";
  protected final String TEXT_1344 = "ESet = false;";
  protected final String TEXT_1345 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1346 = "(this, ";
  protected final String TEXT_1347 = ".UNSET, ";
  protected final String TEXT_1348 = ", ";
  protected final String TEXT_1349 = "isSetChange ? old";
  protected final String TEXT_1350 = " : null";
  protected final String TEXT_1351 = "old";
  protected final String TEXT_1352 = ", null, ";
  protected final String TEXT_1353 = "isSetChange";
  protected final String TEXT_1354 = "old";
  protected final String TEXT_1355 = "ESet";
  protected final String TEXT_1356 = "));";
  protected final String TEXT_1357 = NL + "\t\tif (";
  protected final String TEXT_1358 = ") ";
  protected final String TEXT_1359 = " |= ";
  protected final String TEXT_1360 = "_EFLAG; else ";
  protected final String TEXT_1361 = " &= ~";
  protected final String TEXT_1362 = "_EFLAG;";
  protected final String TEXT_1363 = NL + "\t\t";
  protected final String TEXT_1364 = " = ";
  protected final String TEXT_1365 = " & ~";
  protected final String TEXT_1366 = "_EFLAG | ";
  protected final String TEXT_1367 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1368 = NL + "\t\t";
  protected final String TEXT_1369 = " = ";
  protected final String TEXT_1370 = ";";
  protected final String TEXT_1371 = NL + "\t\t";
  protected final String TEXT_1372 = " &= ~";
  protected final String TEXT_1373 = "_ESETFLAG;";
  protected final String TEXT_1374 = NL + "\t\t";
  protected final String TEXT_1375 = "ESet = false;";
  protected final String TEXT_1376 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1377 = "(this, ";
  protected final String TEXT_1378 = ".UNSET, ";
  protected final String TEXT_1379 = ", ";
  protected final String TEXT_1380 = "isSetChange ? old";
  protected final String TEXT_1381 = " : ";
  protected final String TEXT_1382 = "old";
  protected final String TEXT_1383 = ", ";
  protected final String TEXT_1384 = ", ";
  protected final String TEXT_1385 = "isSetChange";
  protected final String TEXT_1386 = "old";
  protected final String TEXT_1387 = "ESet";
  protected final String TEXT_1388 = "));";
  protected final String TEXT_1389 = NL + "\t\t((";
  protected final String TEXT_1390 = ".Internal)((";
  protected final String TEXT_1391 = ".Internal.Wrapper)get";
  protected final String TEXT_1392 = "()).featureMap()).clear(";
  protected final String TEXT_1393 = ");";
  protected final String TEXT_1394 = NL + "\t\t((";
  protected final String TEXT_1395 = ".Internal)get";
  protected final String TEXT_1396 = "()).clear(";
  protected final String TEXT_1397 = ");";
  protected final String TEXT_1398 = NL + "\t\t";
  protected final String TEXT_1399 = NL + "\t\t";
  protected final String TEXT_1400 = ".";
  protected final String TEXT_1401 = "(this);";
  protected final String TEXT_1402 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1403 = "' ";
  protected final String TEXT_1404 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1405 = NL + "\t}" + NL;
  protected final String TEXT_1406 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1407 = "#";
  protected final String TEXT_1408 = " <em>";
  protected final String TEXT_1409 = "</em>}' ";
  protected final String TEXT_1410 = " is set.";
  protected final String TEXT_1411 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1412 = "</em>' ";
  protected final String TEXT_1413 = " is set.";
  protected final String TEXT_1414 = NL + "\t * @see #unset";
  protected final String TEXT_1415 = "()";
  protected final String TEXT_1416 = NL + "\t * @see #";
  protected final String TEXT_1417 = "()";
  protected final String TEXT_1418 = NL + "\t * @see #set";
  protected final String TEXT_1419 = "(";
  protected final String TEXT_1420 = ")";
  protected final String TEXT_1421 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1422 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1423 = NL + "\t@Override";
  protected final String TEXT_1424 = NL + "\tboolean isSet";
  protected final String TEXT_1425 = "();" + NL;
  protected final String TEXT_1426 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1427 = "_";
  protected final String TEXT_1428 = "()" + NL + "\t{";
  protected final String TEXT_1429 = NL + "\t\treturn eDynamicIsSet(";
  protected final String TEXT_1430 = ", ";
  protected final String TEXT_1431 = ");";
  protected final String TEXT_1432 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1433 = ");";
  protected final String TEXT_1434 = NL + "\t\treturn ";
  protected final String TEXT_1435 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_1436 = NL + "\t\t";
  protected final String TEXT_1437 = " ";
  protected final String TEXT_1438 = " = (";
  protected final String TEXT_1439 = ")eVirtualGet(";
  protected final String TEXT_1440 = ");";
  protected final String TEXT_1441 = NL + "\t\treturn ";
  protected final String TEXT_1442 = " != null && ((";
  protected final String TEXT_1443 = ".Unsettable";
  protected final String TEXT_1444 = ")";
  protected final String TEXT_1445 = ").isSet();";
  protected final String TEXT_1446 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1447 = ");";
  protected final String TEXT_1448 = NL + "\t\treturn (";
  protected final String TEXT_1449 = " & ";
  protected final String TEXT_1450 = "_ESETFLAG) != 0;";
  protected final String TEXT_1451 = NL + "\t\treturn ";
  protected final String TEXT_1452 = "ESet;";
  protected final String TEXT_1453 = NL + "\t\treturn !((";
  protected final String TEXT_1454 = ".Internal)((";
  protected final String TEXT_1455 = ".Internal.Wrapper)get";
  protected final String TEXT_1456 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1457 = ");";
  protected final String TEXT_1458 = NL + "\t\treturn !((";
  protected final String TEXT_1459 = ".Internal)get";
  protected final String TEXT_1460 = "()).isEmpty(";
  protected final String TEXT_1461 = ");";
  protected final String TEXT_1462 = NL + "\t\t";
  protected final String TEXT_1463 = NL + "\t\treturn ";
  protected final String TEXT_1464 = ".";
  protected final String TEXT_1465 = "(this);";
  protected final String TEXT_1466 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1467 = "' ";
  protected final String TEXT_1468 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1469 = NL + "\t}" + NL;
  protected final String TEXT_1470 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1471 = "() <em>";
  protected final String TEXT_1472 = "</em>}' ";
  protected final String TEXT_1473 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1474 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1475 = "_ESUBSETS = ";
  protected final String TEXT_1476 = ";" + NL;
  protected final String TEXT_1477 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1478 = "() <em>";
  protected final String TEXT_1479 = "</em>}' ";
  protected final String TEXT_1480 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1481 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1482 = "_ESUPERSETS = ";
  protected final String TEXT_1483 = ";" + NL;
  protected final String TEXT_1484 = NL + "\t/**";
  protected final String TEXT_1485 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1486 = "}, with the specified ";
  protected final String TEXT_1487 = ", and appends it to the '<em><b>";
  protected final String TEXT_1488 = "</b></em>' ";
  protected final String TEXT_1489 = ".";
  protected final String TEXT_1490 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1491 = "}, with the specified ";
  protected final String TEXT_1492 = ", and sets the '<em><b>";
  protected final String TEXT_1493 = "</b></em>' ";
  protected final String TEXT_1494 = ".";
  protected final String TEXT_1495 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1496 = "} and appends it to the '<em><b>";
  protected final String TEXT_1497 = "</b></em>' ";
  protected final String TEXT_1498 = ".";
  protected final String TEXT_1499 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1500 = "} and sets the '<em><b>";
  protected final String TEXT_1501 = "</b></em>' ";
  protected final String TEXT_1502 = ".";
  protected final String TEXT_1503 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1504 = NL + "\t * @param ";
  protected final String TEXT_1505 = " The ";
  protected final String TEXT_1506 = " for the new {@link ";
  protected final String TEXT_1507 = "}, or <code>null</code>.";
  protected final String TEXT_1508 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1509 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1510 = "}." + NL + "\t * @see #";
  protected final String TEXT_1511 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1512 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1513 = NL + "\t";
  protected final String TEXT_1514 = " create";
  protected final String TEXT_1515 = "(";
  protected final String TEXT_1516 = ", ";
  protected final String TEXT_1517 = " eClass);" + NL;
  protected final String TEXT_1518 = NL + "\t@Override";
  protected final String TEXT_1519 = NL + "\tpublic ";
  protected final String TEXT_1520 = " create";
  protected final String TEXT_1521 = "(";
  protected final String TEXT_1522 = ", ";
  protected final String TEXT_1523 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1524 = " new";
  protected final String TEXT_1525 = " = (";
  protected final String TEXT_1526 = ") create(eClass);";
  protected final String TEXT_1527 = NL + "\t\t";
  protected final String TEXT_1528 = "().add(new";
  protected final String TEXT_1529 = ");";
  protected final String TEXT_1530 = NL + "\t\tset";
  protected final String TEXT_1531 = "(new";
  protected final String TEXT_1532 = ");";
  protected final String TEXT_1533 = NL + "\t\tint ";
  protected final String TEXT_1534 = "ListSize = 0;";
  protected final String TEXT_1535 = NL + "\t\tint ";
  protected final String TEXT_1536 = "Size = ";
  protected final String TEXT_1537 = " == null ? 0 : ";
  protected final String TEXT_1538 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1539 = "Size > ";
  protected final String TEXT_1540 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1541 = "ListSize = ";
  protected final String TEXT_1542 = "Size;";
  protected final String TEXT_1543 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1544 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1545 = ".create";
  protected final String TEXT_1546 = "(";
  protected final String TEXT_1547 = ", ";
  protected final String TEXT_1548 = "i < ";
  protected final String TEXT_1549 = "Size ? (";
  protected final String TEXT_1550 = ") ";
  protected final String TEXT_1551 = ".get(i) : null";
  protected final String TEXT_1552 = ");" + NL + "\t\t}";
  protected final String TEXT_1553 = NL + "\t\tnew";
  protected final String TEXT_1554 = ".create";
  protected final String TEXT_1555 = "(";
  protected final String TEXT_1556 = ", ";
  protected final String TEXT_1557 = ");";
  protected final String TEXT_1558 = NL + "\t\tif (";
  protected final String TEXT_1559 = " != null)";
  protected final String TEXT_1560 = NL + "\t\t\tnew";
  protected final String TEXT_1561 = ".";
  protected final String TEXT_1562 = "().addAll(";
  protected final String TEXT_1563 = ");";
  protected final String TEXT_1564 = NL + "\t\t\tnew";
  protected final String TEXT_1565 = ".set";
  protected final String TEXT_1566 = "(";
  protected final String TEXT_1567 = ");";
  protected final String TEXT_1568 = NL + "\t\treturn new";
  protected final String TEXT_1569 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1570 = NL + "\t/**";
  protected final String TEXT_1571 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1572 = "}, with the specified ";
  protected final String TEXT_1573 = ", and appends it to the '<em><b>";
  protected final String TEXT_1574 = "</b></em>' ";
  protected final String TEXT_1575 = ".";
  protected final String TEXT_1576 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1577 = "},with the specified ";
  protected final String TEXT_1578 = ", and sets the '<em><b>";
  protected final String TEXT_1579 = "</b></em>' ";
  protected final String TEXT_1580 = ".";
  protected final String TEXT_1581 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1582 = "} and appends it to the '<em><b>";
  protected final String TEXT_1583 = "</b></em>' ";
  protected final String TEXT_1584 = ".";
  protected final String TEXT_1585 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1586 = "} and sets the '<em><b>";
  protected final String TEXT_1587 = "</b></em>' ";
  protected final String TEXT_1588 = ".";
  protected final String TEXT_1589 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1590 = NL + "\t * @param ";
  protected final String TEXT_1591 = " The ";
  protected final String TEXT_1592 = " for the new {@link ";
  protected final String TEXT_1593 = "}, or <code>null</code>.";
  protected final String TEXT_1594 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1595 = "}." + NL + "\t * @see #";
  protected final String TEXT_1596 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1597 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1598 = NL + "\t";
  protected final String TEXT_1599 = " create";
  protected final String TEXT_1600 = "(";
  protected final String TEXT_1601 = ");" + NL;
  protected final String TEXT_1602 = NL + "\t@Override";
  protected final String TEXT_1603 = NL + "\tpublic ";
  protected final String TEXT_1604 = " create";
  protected final String TEXT_1605 = "(";
  protected final String TEXT_1606 = ")" + NL + "\t{";
  protected final String TEXT_1607 = NL + "\t\treturn create";
  protected final String TEXT_1608 = "(";
  protected final String TEXT_1609 = ", ";
  protected final String TEXT_1610 = ");";
  protected final String TEXT_1611 = NL + "\t\t";
  protected final String TEXT_1612 = " new";
  protected final String TEXT_1613 = " = (";
  protected final String TEXT_1614 = ") create(";
  protected final String TEXT_1615 = ");";
  protected final String TEXT_1616 = NL + "\t\t";
  protected final String TEXT_1617 = "().add(new";
  protected final String TEXT_1618 = ");";
  protected final String TEXT_1619 = NL + "\t\tset";
  protected final String TEXT_1620 = "(new";
  protected final String TEXT_1621 = ");";
  protected final String TEXT_1622 = NL + "\t\tint ";
  protected final String TEXT_1623 = "ListSize = 0;";
  protected final String TEXT_1624 = NL + "\t\tint ";
  protected final String TEXT_1625 = "Size = ";
  protected final String TEXT_1626 = " == null ? 0 : ";
  protected final String TEXT_1627 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1628 = "Size > ";
  protected final String TEXT_1629 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1630 = "ListSize = ";
  protected final String TEXT_1631 = "Size;";
  protected final String TEXT_1632 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1633 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1634 = ".create";
  protected final String TEXT_1635 = "(";
  protected final String TEXT_1636 = ", ";
  protected final String TEXT_1637 = "i < ";
  protected final String TEXT_1638 = "Size ? (";
  protected final String TEXT_1639 = ") ";
  protected final String TEXT_1640 = ".get(i) : null";
  protected final String TEXT_1641 = ");" + NL + "\t\t}";
  protected final String TEXT_1642 = NL + "\t\tnew";
  protected final String TEXT_1643 = ".create";
  protected final String TEXT_1644 = "(";
  protected final String TEXT_1645 = ", ";
  protected final String TEXT_1646 = ");";
  protected final String TEXT_1647 = NL + "\t\tif (";
  protected final String TEXT_1648 = " != null)";
  protected final String TEXT_1649 = NL + "\t\t\tnew";
  protected final String TEXT_1650 = ".";
  protected final String TEXT_1651 = "().addAll(";
  protected final String TEXT_1652 = ");";
  protected final String TEXT_1653 = NL + "\t\t\tnew";
  protected final String TEXT_1654 = ".set";
  protected final String TEXT_1655 = "(";
  protected final String TEXT_1656 = ");";
  protected final String TEXT_1657 = NL + "\t\treturn new";
  protected final String TEXT_1658 = ";";
  protected final String TEXT_1659 = NL + "\t}" + NL;
  protected final String TEXT_1660 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1661 = "} with the specified ";
  protected final String TEXT_1662 = " from the '<em><b>";
  protected final String TEXT_1663 = "</b></em>' ";
  protected final String TEXT_1664 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1665 = NL + "\t * @param ";
  protected final String TEXT_1666 = " The ";
  protected final String TEXT_1667 = " of the {@link ";
  protected final String TEXT_1668 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1669 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1670 = "} with the specified ";
  protected final String TEXT_1671 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1672 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1673 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1674 = NL + "\t";
  protected final String TEXT_1675 = " get";
  protected final String TEXT_1676 = "(";
  protected final String TEXT_1677 = ");" + NL;
  protected final String TEXT_1678 = NL + "\t@Override";
  protected final String TEXT_1679 = NL + "\tpublic ";
  protected final String TEXT_1680 = " get";
  protected final String TEXT_1681 = "(";
  protected final String TEXT_1682 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1683 = "(";
  protected final String TEXT_1684 = ", false";
  protected final String TEXT_1685 = ", null";
  protected final String TEXT_1686 = ", false";
  protected final String TEXT_1687 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1688 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1689 = "} with the specified ";
  protected final String TEXT_1690 = " from the '<em><b>";
  protected final String TEXT_1691 = "</b></em>' ";
  protected final String TEXT_1692 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1693 = NL + "\t * @param ";
  protected final String TEXT_1694 = " The ";
  protected final String TEXT_1695 = " of the {@link ";
  protected final String TEXT_1696 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1697 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1698 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1699 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1700 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1701 = "} on demand if not found.";
  protected final String TEXT_1702 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1703 = "} with the specified ";
  protected final String TEXT_1704 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1705 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1706 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1707 = NL + "\t";
  protected final String TEXT_1708 = " get";
  protected final String TEXT_1709 = "(";
  protected final String TEXT_1710 = ", boolean ignoreCase";
  protected final String TEXT_1711 = ", ";
  protected final String TEXT_1712 = " eClass";
  protected final String TEXT_1713 = ", boolean createOnDemand";
  protected final String TEXT_1714 = ");" + NL;
  protected final String TEXT_1715 = NL + "\t@Override";
  protected final String TEXT_1716 = NL + "\tpublic ";
  protected final String TEXT_1717 = " get";
  protected final String TEXT_1718 = "(";
  protected final String TEXT_1719 = ", boolean ignoreCase";
  protected final String TEXT_1720 = ", ";
  protected final String TEXT_1721 = " eClass";
  protected final String TEXT_1722 = ", boolean createOnDemand";
  protected final String TEXT_1723 = ")" + NL + "\t{";
  protected final String TEXT_1724 = NL + "\t\t";
  protected final String TEXT_1725 = "Loop: for (";
  protected final String TEXT_1726 = " ";
  protected final String TEXT_1727 = " : ";
  protected final String TEXT_1728 = "())" + NL + "\t\t{";
  protected final String TEXT_1729 = NL + "\t\t";
  protected final String TEXT_1730 = "Loop: for (";
  protected final String TEXT_1731 = " i = ";
  protected final String TEXT_1732 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1733 = " ";
  protected final String TEXT_1734 = " = (";
  protected final String TEXT_1735 = ") i.next();";
  protected final String TEXT_1736 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1737 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1738 = "Loop;";
  protected final String TEXT_1739 = NL + "\t\t\t";
  protected final String TEXT_1740 = " ";
  protected final String TEXT_1741 = "List = ";
  protected final String TEXT_1742 = ".";
  protected final String TEXT_1743 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1744 = "ListSize = ";
  protected final String TEXT_1745 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1746 = " || (";
  protected final String TEXT_1747 = " != null && ";
  protected final String TEXT_1748 = ".size() != ";
  protected final String TEXT_1749 = "ListSize";
  protected final String TEXT_1750 = ")";
  protected final String TEXT_1751 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1752 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1753 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1754 = " ";
  protected final String TEXT_1755 = " = ";
  protected final String TEXT_1756 = "(";
  protected final String TEXT_1757 = ") ";
  protected final String TEXT_1758 = "List.get(j);";
  protected final String TEXT_1759 = NL + "\t\t\t\tif (";
  protected final String TEXT_1760 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1761 = "(";
  protected final String TEXT_1762 = ")";
  protected final String TEXT_1763 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1764 = ".";
  protected final String TEXT_1765 = "()) : ";
  protected final String TEXT_1766 = ".get(j).equals(";
  protected final String TEXT_1767 = ".";
  protected final String TEXT_1768 = "())))";
  protected final String TEXT_1769 = NL + "\t\t\t\tif (";
  protected final String TEXT_1770 = " != null && !";
  protected final String TEXT_1771 = ".get(j).equals(";
  protected final String TEXT_1772 = ".";
  protected final String TEXT_1773 = "()))";
  protected final String TEXT_1774 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1775 = "Loop;";
  protected final String TEXT_1776 = NL + "\t\t\t}";
  protected final String TEXT_1777 = NL + "\t\t\t";
  protected final String TEXT_1778 = " ";
  protected final String TEXT_1779 = " = ";
  protected final String TEXT_1780 = ".";
  protected final String TEXT_1781 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1782 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1783 = "Loop;";
  protected final String TEXT_1784 = NL + "\t\t\tif (";
  protected final String TEXT_1785 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1786 = ".equalsIgnoreCase(";
  protected final String TEXT_1787 = ".";
  protected final String TEXT_1788 = "()) : ";
  protected final String TEXT_1789 = ".equals(";
  protected final String TEXT_1790 = ".";
  protected final String TEXT_1791 = "())))";
  protected final String TEXT_1792 = NL + "\t\t\tif (";
  protected final String TEXT_1793 = " != null && !";
  protected final String TEXT_1794 = ".equals(";
  protected final String TEXT_1795 = ".";
  protected final String TEXT_1796 = "()))";
  protected final String TEXT_1797 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1798 = "Loop;";
  protected final String TEXT_1799 = NL + "\t\t\tif (";
  protected final String TEXT_1800 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1801 = ".equalsIgnoreCase(";
  protected final String TEXT_1802 = ".";
  protected final String TEXT_1803 = "()) : ";
  protected final String TEXT_1804 = ".equals(";
  protected final String TEXT_1805 = ".";
  protected final String TEXT_1806 = "())))";
  protected final String TEXT_1807 = NL + "\t\t\tif (";
  protected final String TEXT_1808 = " != null && !";
  protected final String TEXT_1809 = ".equals(";
  protected final String TEXT_1810 = ".";
  protected final String TEXT_1811 = "()))";
  protected final String TEXT_1812 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1813 = "Loop;";
  protected final String TEXT_1814 = NL + "\t\t\treturn ";
  protected final String TEXT_1815 = ";" + NL + "\t\t}";
  protected final String TEXT_1816 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1817 = " && eClass != null";
  protected final String TEXT_1818 = " ? create";
  protected final String TEXT_1819 = "(";
  protected final String TEXT_1820 = ", eClass";
  protected final String TEXT_1821 = ") : null;";
  protected final String TEXT_1822 = NL + "\t\treturn null;";
  protected final String TEXT_1823 = NL + "\t}" + NL;
  protected final String TEXT_1824 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1825 = "()" + NL + "\t{";
  protected final String TEXT_1826 = NL + "  \t\treturn false;";
  protected final String TEXT_1827 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1828 = ");";
  protected final String TEXT_1829 = NL + "\t\treturn !((";
  protected final String TEXT_1830 = ".Internal.Wrapper)";
  protected final String TEXT_1831 = "()).featureMap().isEmpty();";
  protected final String TEXT_1832 = NL + "\t\treturn ";
  protected final String TEXT_1833 = " != null && !";
  protected final String TEXT_1834 = ".featureMap().isEmpty();";
  protected final String TEXT_1835 = NL + "\t\treturn ";
  protected final String TEXT_1836 = " != null && !";
  protected final String TEXT_1837 = ".isEmpty();";
  protected final String TEXT_1838 = NL + "\t\t";
  protected final String TEXT_1839 = " ";
  protected final String TEXT_1840 = " = (";
  protected final String TEXT_1841 = ")eVirtualGet(";
  protected final String TEXT_1842 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1843 = " != null && !";
  protected final String TEXT_1844 = ".isEmpty();";
  protected final String TEXT_1845 = NL + "\t\treturn !";
  protected final String TEXT_1846 = "().isEmpty();";
  protected final String TEXT_1847 = NL + "\t\treturn ";
  protected final String TEXT_1848 = " != null;";
  protected final String TEXT_1849 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1850 = ") != null;";
  protected final String TEXT_1851 = NL + "\t\treturn basicGet";
  protected final String TEXT_1852 = "() != null;";
  protected final String TEXT_1853 = NL + "\t\treturn ";
  protected final String TEXT_1854 = " != null;";
  protected final String TEXT_1855 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1856 = ") != null;";
  protected final String TEXT_1857 = NL + "\t\treturn ";
  protected final String TEXT_1858 = "() != null;";
  protected final String TEXT_1859 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1860 = " & ";
  protected final String TEXT_1861 = "_EFLAG) != 0) != ";
  protected final String TEXT_1862 = ";";
  protected final String TEXT_1863 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1864 = " & ";
  protected final String TEXT_1865 = "_EFLAG) != ";
  protected final String TEXT_1866 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1867 = NL + "\t\treturn ";
  protected final String TEXT_1868 = " != ";
  protected final String TEXT_1869 = ";";
  protected final String TEXT_1870 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1871 = ", ";
  protected final String TEXT_1872 = ") != ";
  protected final String TEXT_1873 = ";";
  protected final String TEXT_1874 = NL + "\t\treturn ";
  protected final String TEXT_1875 = "() != ";
  protected final String TEXT_1876 = ";";
  protected final String TEXT_1877 = NL + "\t\treturn ";
  protected final String TEXT_1878 = " == null ? ";
  protected final String TEXT_1879 = " != null : !";
  protected final String TEXT_1880 = ".equals(";
  protected final String TEXT_1881 = ");";
  protected final String TEXT_1882 = NL + "\t\t";
  protected final String TEXT_1883 = " ";
  protected final String TEXT_1884 = " = (";
  protected final String TEXT_1885 = ")eVirtualGet(";
  protected final String TEXT_1886 = ", ";
  protected final String TEXT_1887 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1888 = " == null ? ";
  protected final String TEXT_1889 = " != null : !";
  protected final String TEXT_1890 = ".equals(";
  protected final String TEXT_1891 = ");";
  protected final String TEXT_1892 = NL + "\t\treturn ";
  protected final String TEXT_1893 = " == null ? ";
  protected final String TEXT_1894 = "() != null : !";
  protected final String TEXT_1895 = ".equals(";
  protected final String TEXT_1896 = "());";
  protected final String TEXT_1897 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1898 = ");";
  protected final String TEXT_1899 = NL + "\t\t";
  protected final String TEXT_1900 = " ";
  protected final String TEXT_1901 = " = (";
  protected final String TEXT_1902 = ")eVirtualGet(";
  protected final String TEXT_1903 = ");";
  protected final String TEXT_1904 = NL + "\t\treturn ";
  protected final String TEXT_1905 = " != null && ((";
  protected final String TEXT_1906 = ".Unsettable";
  protected final String TEXT_1907 = ")";
  protected final String TEXT_1908 = ").isSet();";
  protected final String TEXT_1909 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1910 = ");";
  protected final String TEXT_1911 = NL + "\t\treturn (";
  protected final String TEXT_1912 = " & ";
  protected final String TEXT_1913 = "_ESETFLAG) != 0;";
  protected final String TEXT_1914 = NL + "\t\treturn ";
  protected final String TEXT_1915 = "ESet;";
  protected final String TEXT_1916 = NL + "\t\treturn !((";
  protected final String TEXT_1917 = ".Internal)((";
  protected final String TEXT_1918 = ".Internal.Wrapper)get";
  protected final String TEXT_1919 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1920 = ");";
  protected final String TEXT_1921 = NL + "\t\treturn !((";
  protected final String TEXT_1922 = ".Internal)get";
  protected final String TEXT_1923 = "()).isEmpty(";
  protected final String TEXT_1924 = ");";
  protected final String TEXT_1925 = NL + "\t\treturn ";
  protected final String TEXT_1926 = ".";
  protected final String TEXT_1927 = "(this);";
  protected final String TEXT_1928 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1929 = "' ";
  protected final String TEXT_1930 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1931 = NL + "\t}" + NL;
  protected final String TEXT_1932 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_1933 = "(";
  protected final String TEXT_1934 = ") <em>";
  protected final String TEXT_1935 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1936 = "(";
  protected final String TEXT_1937 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1938 = " ";
  protected final String TEXT_1939 = "__EOCL_EXP = \"";
  protected final String TEXT_1940 = "\";";
  protected final String TEXT_1941 = NL;
  protected final String TEXT_1942 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_1943 = "(";
  protected final String TEXT_1944 = ") <em>";
  protected final String TEXT_1945 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1946 = "(";
  protected final String TEXT_1947 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1948 = " ";
  protected final String TEXT_1949 = "__EOCL_INV;" + NL;
  protected final String TEXT_1950 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_1951 = "(";
  protected final String TEXT_1952 = ") <em>";
  protected final String TEXT_1953 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1954 = "(";
  protected final String TEXT_1955 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1956 = "<";
  protected final String TEXT_1957 = ">";
  protected final String TEXT_1958 = " ";
  protected final String TEXT_1959 = "__EOCL_QRY;" + NL;
  protected final String TEXT_1960 = NL + "\t/**" + NL + "\t * The cached validation expression for the '{@link #";
  protected final String TEXT_1961 = "(";
  protected final String TEXT_1962 = ") <em>";
  protected final String TEXT_1963 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1964 = "(";
  protected final String TEXT_1965 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1966 = " ";
  protected final String TEXT_1967 = "__EEXPRESSION = \"";
  protected final String TEXT_1968 = "\";";
  protected final String TEXT_1969 = NL;
  protected final String TEXT_1970 = NL + "\t/**" + NL + "\t * The cached invocation delegate for the '{@link #";
  protected final String TEXT_1971 = "(";
  protected final String TEXT_1972 = ") <em>";
  protected final String TEXT_1973 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1974 = "(";
  protected final String TEXT_1975 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1976 = ".Internal.InvocationDelegate ";
  protected final String TEXT_1977 = "__EINVOCATION_DELEGATE = ((";
  protected final String TEXT_1978 = ".Internal)";
  protected final String TEXT_1979 = ").getInvocationDelegate();" + NL;
  protected final String TEXT_1980 = NL + "\t/**";
  protected final String TEXT_1981 = NL + "\t * <p>" + NL + "\t * This operation redefines the following operations:" + NL + "\t * <ul>";
  protected final String TEXT_1982 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_1983 = "#";
  protected final String TEXT_1984 = "(";
  protected final String TEXT_1985 = ") <em>";
  protected final String TEXT_1986 = "</em>}' </li>";
  protected final String TEXT_1987 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_1988 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1989 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1990 = NL + "\t * ";
  protected final String TEXT_1991 = NL + "\t * @param ";
  protected final String TEXT_1992 = NL + "\t *   ";
  protected final String TEXT_1993 = NL + "\t * @param ";
  protected final String TEXT_1994 = " ";
  protected final String TEXT_1995 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1996 = NL + "\t * @model ";
  protected final String TEXT_1997 = NL + "\t *        ";
  protected final String TEXT_1998 = NL + "\t * @model";
  protected final String TEXT_1999 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2000 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2001 = NL + "\t@Override";
  protected final String TEXT_2002 = NL + "\t";
  protected final String TEXT_2003 = " ";
  protected final String TEXT_2004 = "(";
  protected final String TEXT_2005 = ")";
  protected final String TEXT_2006 = ";" + NL;
  protected final String TEXT_2007 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2008 = NL + "\tpublic ";
  protected final String TEXT_2009 = " ";
  protected final String TEXT_2010 = "(";
  protected final String TEXT_2011 = ")";
  protected final String TEXT_2012 = NL + "\t{";
  protected final String TEXT_2013 = NL + "\t\t";
  protected final String TEXT_2014 = NL + "\t\treturn" + NL + "\t\t\t";
  protected final String TEXT_2015 = ".validate" + NL + "\t\t\t\t(";
  protected final String TEXT_2016 = "," + NL + "\t\t\t\t this," + NL + "\t\t\t\t ";
  protected final String TEXT_2017 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_2018 = "," + NL + "\t\t\t\t \"";
  protected final String TEXT_2019 = "\",";
  protected final String TEXT_2020 = NL + "\t\t\t\t ";
  protected final String TEXT_2021 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_2022 = "__EEXPRESSION," + NL + "\t\t\t\t ";
  protected final String TEXT_2023 = ".ERROR," + NL + "\t\t\t\t ";
  protected final String TEXT_2024 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t ";
  protected final String TEXT_2025 = ".";
  protected final String TEXT_2026 = ");";
  protected final String TEXT_2027 = NL + "\t\treturn ";
  protected final String TEXT_2028 = ".";
  protected final String TEXT_2029 = "(this, ";
  protected final String TEXT_2030 = ", ";
  protected final String TEXT_2031 = ");";
  protected final String TEXT_2032 = NL + "\t\tif (";
  protected final String TEXT_2033 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2034 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_2035 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2036 = " = helper.createInvariant(";
  protected final String TEXT_2037 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2038 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_2039 = ").check(this))";
  protected final String TEXT_2040 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_2041 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_2042 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_2043 = NL + "\t\t\t\t";
  protected final String TEXT_2044 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_2045 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_2046 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2047 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2048 = ".";
  protected final String TEXT_2049 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2050 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_2051 = "\", ";
  protected final String TEXT_2052 = ".getObjectLabel(this, ";
  protected final String TEXT_2053 = ") }),";
  protected final String TEXT_2054 = NL + "\t\t\t\t\t\t new Object [] { this }));";
  protected final String TEXT_2055 = NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_2056 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_2057 = NL + "\t\t\t";
  protected final String TEXT_2058 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_2059 = "new ";
  protected final String TEXT_2060 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_2061 = ", ";
  protected final String TEXT_2062 = ")";
  protected final String TEXT_2063 = "null";
  protected final String TEXT_2064 = ");";
  protected final String TEXT_2065 = NL + "\t\t\treturn ";
  protected final String TEXT_2066 = "(";
  protected final String TEXT_2067 = "(";
  protected final String TEXT_2068 = ")";
  protected final String TEXT_2069 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_2070 = "new ";
  protected final String TEXT_2071 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_2072 = ", ";
  protected final String TEXT_2073 = ")";
  protected final String TEXT_2074 = "null";
  protected final String TEXT_2075 = ")";
  protected final String TEXT_2076 = ").";
  protected final String TEXT_2077 = "()";
  protected final String TEXT_2078 = ";";
  protected final String TEXT_2079 = NL + "\t\t}" + NL + "\t\tcatch (";
  protected final String TEXT_2080 = " ite)" + NL + "\t\t{" + NL + "\t\t\tthrow new ";
  protected final String TEXT_2081 = "(ite);" + NL + "\t\t}";
  protected final String TEXT_2082 = NL + "\t\t";
  protected final String TEXT_2083 = ".";
  protected final String TEXT_2084 = "(this";
  protected final String TEXT_2085 = ", ";
  protected final String TEXT_2086 = ");";
  protected final String TEXT_2087 = NL + "\t\t";
  protected final String TEXT_2088 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_2089 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2090 = NL + "\t\t\t";
  protected final String TEXT_2091 = " result = (";
  protected final String TEXT_2092 = ") cache.get(";
  protected final String TEXT_2093 = "eResource(), ";
  protected final String TEXT_2094 = "this, ";
  protected final String TEXT_2095 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_2096 = "eResource(), ";
  protected final String TEXT_2097 = "this, ";
  protected final String TEXT_2098 = ", result = ";
  protected final String TEXT_2099 = "new ";
  protected final String TEXT_2100 = "(";
  protected final String TEXT_2101 = ".";
  protected final String TEXT_2102 = "(this";
  protected final String TEXT_2103 = ", ";
  protected final String TEXT_2104 = ")";
  protected final String TEXT_2105 = ")";
  protected final String TEXT_2106 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_2107 = ".";
  protected final String TEXT_2108 = "()";
  protected final String TEXT_2109 = ";" + NL + "\t\t}";
  protected final String TEXT_2110 = NL + "\t\treturn ";
  protected final String TEXT_2111 = ".";
  protected final String TEXT_2112 = "(this";
  protected final String TEXT_2113 = ", ";
  protected final String TEXT_2114 = ");";
  protected final String TEXT_2115 = NL + "\t\tif (";
  protected final String TEXT_2116 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2117 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_2118 = ", ";
  protected final String TEXT_2119 = ".getEAllOperations().get(";
  protected final String TEXT_2120 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2121 = " = helper.createQuery(";
  protected final String TEXT_2122 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2123 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_2124 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_2125 = ");";
  protected final String TEXT_2126 = NL + "\t\t";
  protected final String TEXT_2127 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_2128 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_2129 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_2130 = "\", ";
  protected final String TEXT_2131 = ");";
  protected final String TEXT_2132 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2133 = NL + "\t\t";
  protected final String TEXT_2134 = "<";
  protected final String TEXT_2135 = "> result = (";
  protected final String TEXT_2136 = "<";
  protected final String TEXT_2137 = ">) query.evaluate(this);" + NL + "\t\treturn new ";
  protected final String TEXT_2138 = ".UnmodifiableEList<";
  protected final String TEXT_2139 = ">(result.size(), result.toArray());";
  protected final String TEXT_2140 = NL + "\t\treturn ((";
  protected final String TEXT_2141 = ") query.evaluate(this)).";
  protected final String TEXT_2142 = "();";
  protected final String TEXT_2143 = NL + "\t\treturn (";
  protected final String TEXT_2144 = ") query.evaluate(this);";
  protected final String TEXT_2145 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2146 = NL + "\t}" + NL;
  protected final String TEXT_2147 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2148 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2149 = NL + "\t@Override";
  protected final String TEXT_2150 = NL + "\tpublic ";
  protected final String TEXT_2151 = " eInverseAdd(";
  protected final String TEXT_2152 = " otherEnd, int featureID, ";
  protected final String TEXT_2153 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2154 = ")" + NL + "\t\t{";
  protected final String TEXT_2155 = NL + "\t\t\tcase ";
  protected final String TEXT_2156 = ":";
  protected final String TEXT_2157 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2158 = "(";
  protected final String TEXT_2159 = ".InternalMapView";
  protected final String TEXT_2160 = ")";
  protected final String TEXT_2161 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2162 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2163 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2164 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2165 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2166 = "((";
  protected final String TEXT_2167 = ")otherEnd, msgs);";
  protected final String TEXT_2168 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_2169 = ", msgs);";
  protected final String TEXT_2170 = NL + "\t\t\t\t";
  protected final String TEXT_2171 = " ";
  protected final String TEXT_2172 = " = (";
  protected final String TEXT_2173 = ")eVirtualGet(";
  protected final String TEXT_2174 = ");";
  protected final String TEXT_2175 = NL + "\t\t\t\t";
  protected final String TEXT_2176 = " ";
  protected final String TEXT_2177 = " = ";
  protected final String TEXT_2178 = "basicGet";
  protected final String TEXT_2179 = "();";
  protected final String TEXT_2180 = NL + "\t\t\t\tif (";
  protected final String TEXT_2181 = " != null)";
  protected final String TEXT_2182 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2183 = ")";
  protected final String TEXT_2184 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_2185 = ", null, msgs);";
  protected final String TEXT_2186 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2187 = ")";
  protected final String TEXT_2188 = ").eInverseRemove(this, ";
  protected final String TEXT_2189 = ", ";
  protected final String TEXT_2190 = ".class, msgs);";
  protected final String TEXT_2191 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2192 = "((";
  protected final String TEXT_2193 = ")otherEnd, msgs);";
  protected final String TEXT_2194 = NL + "\t\t}";
  protected final String TEXT_2195 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2196 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2197 = NL + "\t}" + NL;
  protected final String TEXT_2198 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2199 = NL + "\t@Override";
  protected final String TEXT_2200 = NL + "\tpublic ";
  protected final String TEXT_2201 = " eInverseRemove(";
  protected final String TEXT_2202 = " otherEnd, int featureID, ";
  protected final String TEXT_2203 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2204 = ")" + NL + "\t\t{";
  protected final String TEXT_2205 = NL + "\t\t\tcase ";
  protected final String TEXT_2206 = ":";
  protected final String TEXT_2207 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2208 = ")((";
  protected final String TEXT_2209 = ".InternalMapView";
  protected final String TEXT_2210 = ")";
  protected final String TEXT_2211 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2212 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2213 = ")((";
  protected final String TEXT_2214 = ".Internal.Wrapper)";
  protected final String TEXT_2215 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2216 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2217 = ")";
  protected final String TEXT_2218 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2219 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_2220 = ", msgs);";
  protected final String TEXT_2221 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_2222 = "(msgs);";
  protected final String TEXT_2223 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2224 = "(null, msgs);";
  protected final String TEXT_2225 = NL + "\t\t}";
  protected final String TEXT_2226 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2227 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2228 = NL + "\t}" + NL;
  protected final String TEXT_2229 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2230 = NL + "\t@Override";
  protected final String TEXT_2231 = NL + "\tpublic ";
  protected final String TEXT_2232 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_2233 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID()";
  protected final String TEXT_2234 = ")" + NL + "\t\t{";
  protected final String TEXT_2235 = NL + "\t\t\tcase ";
  protected final String TEXT_2236 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_2237 = ", ";
  protected final String TEXT_2238 = ".class, msgs);";
  protected final String TEXT_2239 = NL + "\t\t}";
  protected final String TEXT_2240 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_2241 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2242 = NL + "\t}" + NL;
  protected final String TEXT_2243 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2244 = NL + "\t@Override";
  protected final String TEXT_2245 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2246 = ")" + NL + "\t\t{";
  protected final String TEXT_2247 = NL + "\t\t\tcase ";
  protected final String TEXT_2248 = ":";
  protected final String TEXT_2249 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2250 = "();";
  protected final String TEXT_2251 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2252 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_2253 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_2254 = "(";
  protected final String TEXT_2255 = "());";
  protected final String TEXT_2256 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_2257 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2258 = "();";
  protected final String TEXT_2259 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2260 = ".InternalMapView";
  protected final String TEXT_2261 = ")";
  protected final String TEXT_2262 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2263 = "();";
  protected final String TEXT_2264 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2265 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2266 = "().map();";
  protected final String TEXT_2267 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2268 = ".Internal.Wrapper)";
  protected final String TEXT_2269 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2270 = "();";
  protected final String TEXT_2271 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2272 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_2273 = ".Internal)";
  protected final String TEXT_2274 = "()).getWrapper();";
  protected final String TEXT_2275 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2276 = "();";
  protected final String TEXT_2277 = NL + "\t\t}";
  protected final String TEXT_2278 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_2279 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_2280 = NL + "\t}" + NL;
  protected final String TEXT_2281 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2282 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2283 = NL + "\t@Override";
  protected final String TEXT_2284 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2285 = ")" + NL + "\t\t{";
  protected final String TEXT_2286 = NL + "\t\t\tcase ";
  protected final String TEXT_2287 = ":";
  protected final String TEXT_2288 = NL + "\t\t\t\t((";
  protected final String TEXT_2289 = ".Internal)((";
  protected final String TEXT_2290 = ".Internal.Wrapper)";
  protected final String TEXT_2291 = "()).featureMap()).set(newValue);";
  protected final String TEXT_2292 = NL + "\t\t\t\t((";
  protected final String TEXT_2293 = ".Internal)";
  protected final String TEXT_2294 = "()).set(newValue);";
  protected final String TEXT_2295 = NL + "\t\t\t\t((";
  protected final String TEXT_2296 = ".Setting)((";
  protected final String TEXT_2297 = ".InternalMapView";
  protected final String TEXT_2298 = ")";
  protected final String TEXT_2299 = "()).eMap()).set(newValue);";
  protected final String TEXT_2300 = NL + "\t\t\t\t((";
  protected final String TEXT_2301 = ".Setting)";
  protected final String TEXT_2302 = "()).set(newValue);";
  protected final String TEXT_2303 = NL + "\t\t\t\t";
  protected final String TEXT_2304 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_2305 = "().addAll((";
  protected final String TEXT_2306 = "<? extends ";
  protected final String TEXT_2307 = ">";
  protected final String TEXT_2308 = ")newValue);";
  protected final String TEXT_2309 = NL + "\t\t\t\tset";
  protected final String TEXT_2310 = "(((";
  protected final String TEXT_2311 = ")newValue).";
  protected final String TEXT_2312 = "());";
  protected final String TEXT_2313 = NL + "\t\t\t\tset";
  protected final String TEXT_2314 = "(";
  protected final String TEXT_2315 = "(";
  protected final String TEXT_2316 = ")";
  protected final String TEXT_2317 = "newValue);";
  protected final String TEXT_2318 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2319 = NL + "\t\t}";
  protected final String TEXT_2320 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_2321 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_2322 = NL + "\t}" + NL;
  protected final String TEXT_2323 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2324 = NL + "\t@Override";
  protected final String TEXT_2325 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2326 = ")" + NL + "\t\t{";
  protected final String TEXT_2327 = NL + "\t\t\tcase ";
  protected final String TEXT_2328 = ":";
  protected final String TEXT_2329 = NL + "\t\t\t\t((";
  protected final String TEXT_2330 = ".Internal.Wrapper)";
  protected final String TEXT_2331 = "()).featureMap().clear();";
  protected final String TEXT_2332 = NL + "\t\t\t\t";
  protected final String TEXT_2333 = "().clear();";
  protected final String TEXT_2334 = NL + "\t\t\t\tunset";
  protected final String TEXT_2335 = "();";
  protected final String TEXT_2336 = NL + "\t\t\t\tset";
  protected final String TEXT_2337 = "((";
  protected final String TEXT_2338 = ")null);";
  protected final String TEXT_2339 = NL + "\t\t\t\tset";
  protected final String TEXT_2340 = "(";
  protected final String TEXT_2341 = ");";
  protected final String TEXT_2342 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2343 = NL + "\t\t}";
  protected final String TEXT_2344 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_2345 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_2346 = NL + "\t}" + NL;
  protected final String TEXT_2347 = NL;
  protected final String TEXT_2348 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2349 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2350 = NL + "\t@Override";
  protected final String TEXT_2351 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_2352 = NL + "\t\t\tcase ";
  protected final String TEXT_2353 = ":";
  protected final String TEXT_2354 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2355 = "();";
  protected final String TEXT_2356 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2357 = "();";
  protected final String TEXT_2358 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2359 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_2360 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_2361 = ".Internal.Wrapper)";
  protected final String TEXT_2362 = "()).featureMap().isEmpty();";
  protected final String TEXT_2363 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2364 = " != null && !";
  protected final String TEXT_2365 = ".featureMap().isEmpty();";
  protected final String TEXT_2366 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2367 = " != null && !";
  protected final String TEXT_2368 = ".isEmpty();";
  protected final String TEXT_2369 = NL + "\t\t\t\t";
  protected final String TEXT_2370 = " ";
  protected final String TEXT_2371 = " = (";
  protected final String TEXT_2372 = ")eVirtualGet(";
  protected final String TEXT_2373 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2374 = " != null && !";
  protected final String TEXT_2375 = ".isEmpty();";
  protected final String TEXT_2376 = NL + "\t\t\t\treturn !";
  protected final String TEXT_2377 = "().isEmpty();";
  protected final String TEXT_2378 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2379 = "();";
  protected final String TEXT_2380 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2381 = " != null;";
  protected final String TEXT_2382 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2383 = ") != null;";
  protected final String TEXT_2384 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2385 = "() != null;";
  protected final String TEXT_2386 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2387 = " != null;";
  protected final String TEXT_2388 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2389 = ") != null;";
  protected final String TEXT_2390 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2391 = "() != null;";
  protected final String TEXT_2392 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2393 = " & ";
  protected final String TEXT_2394 = "_EFLAG) != 0) != ";
  protected final String TEXT_2395 = ";";
  protected final String TEXT_2396 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2397 = " & ";
  protected final String TEXT_2398 = "_EFLAG) != ";
  protected final String TEXT_2399 = "_EFLAG_DEFAULT;";
  protected final String TEXT_2400 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2401 = " != ";
  protected final String TEXT_2402 = ";";
  protected final String TEXT_2403 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2404 = ", ";
  protected final String TEXT_2405 = ") != ";
  protected final String TEXT_2406 = ";";
  protected final String TEXT_2407 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2408 = "() != ";
  protected final String TEXT_2409 = ";";
  protected final String TEXT_2410 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2411 = " == null ? ";
  protected final String TEXT_2412 = " != null : !";
  protected final String TEXT_2413 = ".equals(";
  protected final String TEXT_2414 = ");";
  protected final String TEXT_2415 = NL + "\t\t\t\t";
  protected final String TEXT_2416 = " ";
  protected final String TEXT_2417 = " = (";
  protected final String TEXT_2418 = ")eVirtualGet(";
  protected final String TEXT_2419 = ", ";
  protected final String TEXT_2420 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2421 = " == null ? ";
  protected final String TEXT_2422 = " != null : !";
  protected final String TEXT_2423 = ".equals(";
  protected final String TEXT_2424 = ");";
  protected final String TEXT_2425 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2426 = " == null ? ";
  protected final String TEXT_2427 = "() != null : !";
  protected final String TEXT_2428 = ".equals(";
  protected final String TEXT_2429 = "());";
  protected final String TEXT_2430 = NL + "\t\t}";
  protected final String TEXT_2431 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2432 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2433 = NL + "\t}" + NL;
  protected final String TEXT_2434 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2435 = NL + "\t@Override";
  protected final String TEXT_2436 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2437 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2438 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2439 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_2440 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2441 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2442 = ": return ";
  protected final String TEXT_2443 = ";";
  protected final String TEXT_2444 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2445 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_2446 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2447 = NL + "\t@Override";
  protected final String TEXT_2448 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2449 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2450 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2451 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2452 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2453 = ": return ";
  protected final String TEXT_2454 = ";";
  protected final String TEXT_2455 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2456 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2457 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_2458 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2459 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2460 = ": return ";
  protected final String TEXT_2461 = ";";
  protected final String TEXT_2462 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2463 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2464 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2465 = NL + "\t@Override";
  protected final String TEXT_2466 = NL + "\tpublic int eDerivedOperationID(int baseOperationID, Class";
  protected final String TEXT_2467 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2468 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2469 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_2470 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2471 = ": return ";
  protected final String TEXT_2472 = ";";
  protected final String TEXT_2473 = NL + "\t\t\t\tdefault: return super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2474 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2475 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_2476 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2477 = ": return ";
  protected final String TEXT_2478 = ";";
  protected final String TEXT_2479 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2480 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2481 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID";
  protected final String TEXT_2482 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2483 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2484 = ": return ";
  protected final String TEXT_2485 = ";";
  protected final String TEXT_2486 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2487 = NL + "\t\treturn super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2488 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2489 = NL + "\t@Override";
  protected final String TEXT_2490 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2491 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2492 = NL + "\t@Override";
  protected final String TEXT_2493 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2494 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2495 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2496 = NL + "\t@Override";
  protected final String TEXT_2497 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2498 = NL + "\t\t\tcase ";
  protected final String TEXT_2499 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2500 = ";";
  protected final String TEXT_2501 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2502 = NL + "\t@Override";
  protected final String TEXT_2503 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2504 = NL + "\t\t\tcase ";
  protected final String TEXT_2505 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2506 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2507 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2508 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2509 = NL + "\t@Override";
  protected final String TEXT_2510 = NL + "\t@SuppressWarnings(";
  protected final String TEXT_2511 = "\"unchecked\"";
  protected final String TEXT_2512 = "{\"rawtypes\", \"unchecked\" }";
  protected final String TEXT_2513 = ")";
  protected final String TEXT_2514 = NL + "\tpublic Object eInvoke(int operationID, ";
  protected final String TEXT_2515 = " arguments) throws ";
  protected final String TEXT_2516 = NL + "\t{" + NL + "\t\tswitch (operationID";
  protected final String TEXT_2517 = ")" + NL + "\t\t{";
  protected final String TEXT_2518 = NL + "\t\t\tcase ";
  protected final String TEXT_2519 = ":";
  protected final String TEXT_2520 = NL + "\t\t\t\t";
  protected final String TEXT_2521 = "(";
  protected final String TEXT_2522 = "(";
  protected final String TEXT_2523 = "(";
  protected final String TEXT_2524 = ")";
  protected final String TEXT_2525 = "arguments.get(";
  protected final String TEXT_2526 = ")";
  protected final String TEXT_2527 = ").";
  protected final String TEXT_2528 = "()";
  protected final String TEXT_2529 = ", ";
  protected final String TEXT_2530 = ");" + NL + "\t\t\t\treturn null;";
  protected final String TEXT_2531 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2532 = "new ";
  protected final String TEXT_2533 = "(";
  protected final String TEXT_2534 = "(";
  protected final String TEXT_2535 = "(";
  protected final String TEXT_2536 = "(";
  protected final String TEXT_2537 = ")";
  protected final String TEXT_2538 = "arguments.get(";
  protected final String TEXT_2539 = ")";
  protected final String TEXT_2540 = ").";
  protected final String TEXT_2541 = "()";
  protected final String TEXT_2542 = ", ";
  protected final String TEXT_2543 = ")";
  protected final String TEXT_2544 = ")";
  protected final String TEXT_2545 = ";";
  protected final String TEXT_2546 = NL + "\t\t}";
  protected final String TEXT_2547 = NL + "\t\treturn super.eInvoke(operationID, arguments);";
  protected final String TEXT_2548 = NL + "\t\treturn eDynamicInvoke(operationID, arguments);";
  protected final String TEXT_2549 = NL + "\t}" + NL;
  protected final String TEXT_2550 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2551 = NL + "\t@Override";
  protected final String TEXT_2552 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2553 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2554 = ": \");";
  protected final String TEXT_2555 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2556 = ": \");";
  protected final String TEXT_2557 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2558 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2559 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2560 = NL + "\t\tif (";
  protected final String TEXT_2561 = "(";
  protected final String TEXT_2562 = " & ";
  protected final String TEXT_2563 = "_ESETFLAG) != 0";
  protected final String TEXT_2564 = "ESet";
  protected final String TEXT_2565 = ") result.append((";
  protected final String TEXT_2566 = " & ";
  protected final String TEXT_2567 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2568 = NL + "\t\tif (";
  protected final String TEXT_2569 = "(";
  protected final String TEXT_2570 = " & ";
  protected final String TEXT_2571 = "_ESETFLAG) != 0";
  protected final String TEXT_2572 = "ESet";
  protected final String TEXT_2573 = ") result.append(";
  protected final String TEXT_2574 = "_EFLAG_VALUES[(";
  protected final String TEXT_2575 = " & ";
  protected final String TEXT_2576 = "_EFLAG) >>> ";
  protected final String TEXT_2577 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_2578 = NL + "\t\tif (";
  protected final String TEXT_2579 = "(";
  protected final String TEXT_2580 = " & ";
  protected final String TEXT_2581 = "_ESETFLAG) != 0";
  protected final String TEXT_2582 = "ESet";
  protected final String TEXT_2583 = ") result.append(";
  protected final String TEXT_2584 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2585 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2586 = ", ";
  protected final String TEXT_2587 = "));";
  protected final String TEXT_2588 = NL + "\t\tresult.append((";
  protected final String TEXT_2589 = " & ";
  protected final String TEXT_2590 = "_EFLAG) != 0);";
  protected final String TEXT_2591 = NL + "\t\tresult.append(";
  protected final String TEXT_2592 = "_EFLAG_VALUES[(";
  protected final String TEXT_2593 = " & ";
  protected final String TEXT_2594 = "_EFLAG) >>> ";
  protected final String TEXT_2595 = "_EFLAG_OFFSET]);";
  protected final String TEXT_2596 = NL + "\t\tresult.append(";
  protected final String TEXT_2597 = ");";
  protected final String TEXT_2598 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2599 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2600 = NL + "\t@";
  protected final String TEXT_2601 = NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2602 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2603 = " getKey()" + NL + "\t{";
  protected final String TEXT_2604 = NL + "\t\treturn new ";
  protected final String TEXT_2605 = "(getTypedKey());";
  protected final String TEXT_2606 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2607 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2608 = " key)" + NL + "\t{";
  protected final String TEXT_2609 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2610 = "(";
  protected final String TEXT_2611 = ")";
  protected final String TEXT_2612 = "key);";
  protected final String TEXT_2613 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2614 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2615 = ")key).";
  protected final String TEXT_2616 = "());";
  protected final String TEXT_2617 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2618 = ")key);";
  protected final String TEXT_2619 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2620 = " getValue()" + NL + "\t{";
  protected final String TEXT_2621 = NL + "\t\treturn new ";
  protected final String TEXT_2622 = "(getTypedValue());";
  protected final String TEXT_2623 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2624 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2625 = " setValue(";
  protected final String TEXT_2626 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2627 = " oldValue = getValue();";
  protected final String TEXT_2628 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2629 = "(";
  protected final String TEXT_2630 = ")";
  protected final String TEXT_2631 = "value);";
  protected final String TEXT_2632 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2633 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2634 = ")value).";
  protected final String TEXT_2635 = "());";
  protected final String TEXT_2636 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2637 = ")value);";
  protected final String TEXT_2638 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2639 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2640 = NL + "\tpublic ";
  protected final String TEXT_2641 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2642 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2643 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2644 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2645 = " EOCL_ENV = ";
  protected final String TEXT_2646 = ".newInstance();" + NL;
  protected final String TEXT_2647 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2648 = " create(";
  protected final String TEXT_2649 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2650 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2651 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2652 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2653 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2654 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2655 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2656 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2657 = NL + "\t@Override";
  protected final String TEXT_2658 = NL + "\tprotected ";
  protected final String TEXT_2659 = " ";
  protected final String TEXT_2660 = "Helper(";
  protected final String TEXT_2661 = " ";
  protected final String TEXT_2662 = ")" + NL + "\t{";
  protected final String TEXT_2663 = NL + "\t\t";
  protected final String TEXT_2664 = ".addAll(super.";
  protected final String TEXT_2665 = "());";
  protected final String TEXT_2666 = NL + "\t\tsuper.";
  protected final String TEXT_2667 = "Helper(";
  protected final String TEXT_2668 = ");";
  protected final String TEXT_2669 = NL + "\t\tif (isSet";
  protected final String TEXT_2670 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2671 = "<";
  protected final String TEXT_2672 = ">";
  protected final String TEXT_2673 = " i = ((";
  protected final String TEXT_2674 = ") ";
  protected final String TEXT_2675 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2676 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2677 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2678 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2679 = "<";
  protected final String TEXT_2680 = ">";
  protected final String TEXT_2681 = " i = ((";
  protected final String TEXT_2682 = ") ";
  protected final String TEXT_2683 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2684 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2685 = NL + "\t\t";
  protected final String TEXT_2686 = " ";
  protected final String TEXT_2687 = " = ";
  protected final String TEXT_2688 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2689 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2690 = "<";
  protected final String TEXT_2691 = ">";
  protected final String TEXT_2692 = " i = ((";
  protected final String TEXT_2693 = ") ";
  protected final String TEXT_2694 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2695 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2696 = NL + "\t\tif (isSet";
  protected final String TEXT_2697 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2698 = ".addAll(";
  protected final String TEXT_2699 = "());" + NL + "\t\t}";
  protected final String TEXT_2700 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2701 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2702 = ".addAll(";
  protected final String TEXT_2703 = "());" + NL + "\t\t}";
  protected final String TEXT_2704 = NL + "\t\t";
  protected final String TEXT_2705 = " ";
  protected final String TEXT_2706 = " = ";
  protected final String TEXT_2707 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2708 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2709 = ".addAll(";
  protected final String TEXT_2710 = ");" + NL + "\t\t}";
  protected final String TEXT_2711 = NL + "\t\tif (isSet";
  protected final String TEXT_2712 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2713 = ".add(";
  protected final String TEXT_2714 = "basicGet";
  protected final String TEXT_2715 = "());" + NL + "\t\t}";
  protected final String TEXT_2716 = NL + "\t\t";
  protected final String TEXT_2717 = " ";
  protected final String TEXT_2718 = " = ";
  protected final String TEXT_2719 = "basicGet";
  protected final String TEXT_2720 = "();" + NL + "\t\tif (";
  protected final String TEXT_2721 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2722 = ".add(";
  protected final String TEXT_2723 = ");" + NL + "\t\t}";
  protected final String TEXT_2724 = NL + "\t\treturn ";
  protected final String TEXT_2725 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2726 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2727 = NL + "\t@Override";
  protected final String TEXT_2728 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2729 = "()" + NL + "\t{";
  protected final String TEXT_2730 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2731 = "()";
  protected final String TEXT_2732 = NL + "\t\treturn isSet";
  protected final String TEXT_2733 = "()";
  protected final String TEXT_2734 = ";";
  protected final String TEXT_2735 = NL + "\t\treturn !";
  protected final String TEXT_2736 = "().isEmpty()";
  protected final String TEXT_2737 = ";";
  protected final String TEXT_2738 = NL + "\t\treturn ";
  protected final String TEXT_2739 = "basicGet";
  protected final String TEXT_2740 = "() != null";
  protected final String TEXT_2741 = ";";
  protected final String TEXT_2742 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2743 = ")";
  protected final String TEXT_2744 = ";";
  protected final String TEXT_2745 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2746 = "()";
  protected final String TEXT_2747 = ";";
  protected final String TEXT_2748 = NL + "\t\t\t|| !";
  protected final String TEXT_2749 = "().isEmpty()";
  protected final String TEXT_2750 = ";";
  protected final String TEXT_2751 = NL + "\t\t\t|| ";
  protected final String TEXT_2752 = "basicGet";
  protected final String TEXT_2753 = "() != null";
  protected final String TEXT_2754 = ";";
  protected final String TEXT_2755 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2756 = ")";
  protected final String TEXT_2757 = ";";
  protected final String TEXT_2758 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2759 = "();";
  protected final String TEXT_2760 = NL + "\t\treturn false;";
  protected final String TEXT_2761 = NL + "\t}" + NL;
  protected final String TEXT_2762 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2763 = NL + "\t@Override";
  protected final String TEXT_2764 = NL + "\tpublic ";
  protected final String TEXT_2765 = " ";
  protected final String TEXT_2766 = "()" + NL + "\t{";
  protected final String TEXT_2767 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2768 = " ";
  protected final String TEXT_2769 = " = (";
  protected final String TEXT_2770 = ")((";
  protected final String TEXT_2771 = ")";
  protected final String TEXT_2772 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2773 = ";";
  protected final String TEXT_2774 = NL + "\t\treturn ";
  protected final String TEXT_2775 = "();";
  protected final String TEXT_2776 = NL + "\t\treturn new ";
  protected final String TEXT_2777 = ".UnmodifiableEList";
  protected final String TEXT_2778 = "(this, ";
  protected final String TEXT_2779 = "null";
  protected final String TEXT_2780 = ", 0, ";
  protected final String TEXT_2781 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2782 = NL + "\t\treturn null;";
  protected final String TEXT_2783 = NL + "\t\treturn ";
  protected final String TEXT_2784 = "();";
  protected final String TEXT_2785 = NL + "\t}" + NL;
  protected final String TEXT_2786 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2787 = NL + "\t@Override";
  protected final String TEXT_2788 = NL + "\tpublic ";
  protected final String TEXT_2789 = " basicGet";
  protected final String TEXT_2790 = "()" + NL + "\t{";
  protected final String TEXT_2791 = NL + "\t\treturn null;";
  protected final String TEXT_2792 = NL + "\t\treturn ";
  protected final String TEXT_2793 = "basicGet";
  protected final String TEXT_2794 = "();";
  protected final String TEXT_2795 = NL + "\t}" + NL;
  protected final String TEXT_2796 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2797 = NL + "\t@Override";
  protected final String TEXT_2798 = NL + "\tpublic ";
  protected final String TEXT_2799 = " basicSet";
  protected final String TEXT_2800 = "(";
  protected final String TEXT_2801 = " new";
  protected final String TEXT_2802 = ", ";
  protected final String TEXT_2803 = " msgs)" + NL + "\t{";
  protected final String TEXT_2804 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2805 = NL + "\t\tif (new";
  protected final String TEXT_2806 = " != null && !(new";
  protected final String TEXT_2807 = " instanceof ";
  protected final String TEXT_2808 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2809 = "));" + NL + "\t\t}";
  protected final String TEXT_2810 = NL + "\t\treturn basicSet";
  protected final String TEXT_2811 = "(";
  protected final String TEXT_2812 = "(";
  protected final String TEXT_2813 = ") ";
  protected final String TEXT_2814 = "new";
  protected final String TEXT_2815 = ", msgs);";
  protected final String TEXT_2816 = NL + "\t\tset";
  protected final String TEXT_2817 = "(";
  protected final String TEXT_2818 = "(";
  protected final String TEXT_2819 = ") ";
  protected final String TEXT_2820 = "new";
  protected final String TEXT_2821 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2822 = NL + "\t}" + NL;
  protected final String TEXT_2823 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2824 = NL + "\t@Override";
  protected final String TEXT_2825 = NL + "\tpublic void set";
  protected final String TEXT_2826 = "(";
  protected final String TEXT_2827 = " new";
  protected final String TEXT_2828 = ")" + NL + "\t{";
  protected final String TEXT_2829 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2830 = NL + "\t\tif (new";
  protected final String TEXT_2831 = " != null && !(new";
  protected final String TEXT_2832 = " instanceof ";
  protected final String TEXT_2833 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2834 = "));" + NL + "\t\t}";
  protected final String TEXT_2835 = NL + "\t\tset";
  protected final String TEXT_2836 = "(";
  protected final String TEXT_2837 = "(";
  protected final String TEXT_2838 = ") ";
  protected final String TEXT_2839 = "new";
  protected final String TEXT_2840 = ");";
  protected final String TEXT_2841 = NL + "\t}" + NL;
  protected final String TEXT_2842 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2843 = "() <em>";
  protected final String TEXT_2844 = "</em>}' ";
  protected final String TEXT_2845 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2846 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2847 = "_ESUBSETS = ";
  protected final String TEXT_2848 = ";" + NL;
  protected final String TEXT_2849 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2850 = "() <em>";
  protected final String TEXT_2851 = "</em>}' ";
  protected final String TEXT_2852 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2853 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2854 = "_ESUPERSETS = ";
  protected final String TEXT_2855 = ";" + NL;
  protected final String TEXT_2856 = NL + "\t/**";
  protected final String TEXT_2857 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2858 = "}, with the specified ";
  protected final String TEXT_2859 = ", and appends it to the '<em><b>";
  protected final String TEXT_2860 = "</b></em>' ";
  protected final String TEXT_2861 = ".";
  protected final String TEXT_2862 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2863 = "}, with the specified ";
  protected final String TEXT_2864 = ", and sets the '<em><b>";
  protected final String TEXT_2865 = "</b></em>' ";
  protected final String TEXT_2866 = ".";
  protected final String TEXT_2867 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2868 = "} and appends it to the '<em><b>";
  protected final String TEXT_2869 = "</b></em>' ";
  protected final String TEXT_2870 = ".";
  protected final String TEXT_2871 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2872 = "} and sets the '<em><b>";
  protected final String TEXT_2873 = "</b></em>' ";
  protected final String TEXT_2874 = ".";
  protected final String TEXT_2875 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2876 = NL + "\t * @param ";
  protected final String TEXT_2877 = " The ";
  protected final String TEXT_2878 = " for the new {@link ";
  protected final String TEXT_2879 = "}, or <code>null</code>.";
  protected final String TEXT_2880 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2881 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2882 = "}." + NL + "\t * @see #";
  protected final String TEXT_2883 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2884 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2885 = NL + "\t";
  protected final String TEXT_2886 = " create";
  protected final String TEXT_2887 = "(";
  protected final String TEXT_2888 = ", ";
  protected final String TEXT_2889 = " eClass);" + NL;
  protected final String TEXT_2890 = NL + "\t@Override";
  protected final String TEXT_2891 = NL + "\tpublic ";
  protected final String TEXT_2892 = " create";
  protected final String TEXT_2893 = "(";
  protected final String TEXT_2894 = ", ";
  protected final String TEXT_2895 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2896 = " new";
  protected final String TEXT_2897 = " = (";
  protected final String TEXT_2898 = ") create(eClass);";
  protected final String TEXT_2899 = NL + "\t\t";
  protected final String TEXT_2900 = "().add(new";
  protected final String TEXT_2901 = ");";
  protected final String TEXT_2902 = NL + "\t\tset";
  protected final String TEXT_2903 = "(new";
  protected final String TEXT_2904 = ");";
  protected final String TEXT_2905 = NL + "\t\tint ";
  protected final String TEXT_2906 = "ListSize = 0;";
  protected final String TEXT_2907 = NL + "\t\tint ";
  protected final String TEXT_2908 = "Size = ";
  protected final String TEXT_2909 = " == null ? 0 : ";
  protected final String TEXT_2910 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2911 = "Size > ";
  protected final String TEXT_2912 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2913 = "ListSize = ";
  protected final String TEXT_2914 = "Size;";
  protected final String TEXT_2915 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2916 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2917 = ".create";
  protected final String TEXT_2918 = "(";
  protected final String TEXT_2919 = ", ";
  protected final String TEXT_2920 = "i < ";
  protected final String TEXT_2921 = "Size ? (";
  protected final String TEXT_2922 = ") ";
  protected final String TEXT_2923 = ".get(i) : null";
  protected final String TEXT_2924 = ");" + NL + "\t\t}";
  protected final String TEXT_2925 = NL + "\t\tnew";
  protected final String TEXT_2926 = ".create";
  protected final String TEXT_2927 = "(";
  protected final String TEXT_2928 = ", ";
  protected final String TEXT_2929 = ");";
  protected final String TEXT_2930 = NL + "\t\tif (";
  protected final String TEXT_2931 = " != null)";
  protected final String TEXT_2932 = NL + "\t\t\tnew";
  protected final String TEXT_2933 = ".";
  protected final String TEXT_2934 = "().addAll(";
  protected final String TEXT_2935 = ");";
  protected final String TEXT_2936 = NL + "\t\t\tnew";
  protected final String TEXT_2937 = ".set";
  protected final String TEXT_2938 = "(";
  protected final String TEXT_2939 = ");";
  protected final String TEXT_2940 = NL + "\t\treturn new";
  protected final String TEXT_2941 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2942 = NL + "\t/**";
  protected final String TEXT_2943 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2944 = "}, with the specified ";
  protected final String TEXT_2945 = ", and appends it to the '<em><b>";
  protected final String TEXT_2946 = "</b></em>' ";
  protected final String TEXT_2947 = ".";
  protected final String TEXT_2948 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2949 = "},with the specified ";
  protected final String TEXT_2950 = ", and sets the '<em><b>";
  protected final String TEXT_2951 = "</b></em>' ";
  protected final String TEXT_2952 = ".";
  protected final String TEXT_2953 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2954 = "} and appends it to the '<em><b>";
  protected final String TEXT_2955 = "</b></em>' ";
  protected final String TEXT_2956 = ".";
  protected final String TEXT_2957 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2958 = "} and sets the '<em><b>";
  protected final String TEXT_2959 = "</b></em>' ";
  protected final String TEXT_2960 = ".";
  protected final String TEXT_2961 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2962 = NL + "\t * @param ";
  protected final String TEXT_2963 = " The ";
  protected final String TEXT_2964 = " for the new {@link ";
  protected final String TEXT_2965 = "}, or <code>null</code>.";
  protected final String TEXT_2966 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2967 = "}." + NL + "\t * @see #";
  protected final String TEXT_2968 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2969 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2970 = NL + "\t";
  protected final String TEXT_2971 = " create";
  protected final String TEXT_2972 = "(";
  protected final String TEXT_2973 = ");" + NL;
  protected final String TEXT_2974 = NL + "\t@Override";
  protected final String TEXT_2975 = NL + "\tpublic ";
  protected final String TEXT_2976 = " create";
  protected final String TEXT_2977 = "(";
  protected final String TEXT_2978 = ")" + NL + "\t{";
  protected final String TEXT_2979 = NL + "\t\treturn create";
  protected final String TEXT_2980 = "(";
  protected final String TEXT_2981 = ", ";
  protected final String TEXT_2982 = ");";
  protected final String TEXT_2983 = NL + "\t\t";
  protected final String TEXT_2984 = " new";
  protected final String TEXT_2985 = " = (";
  protected final String TEXT_2986 = ") create(";
  protected final String TEXT_2987 = ");";
  protected final String TEXT_2988 = NL + "\t\t";
  protected final String TEXT_2989 = "().add(new";
  protected final String TEXT_2990 = ");";
  protected final String TEXT_2991 = NL + "\t\tset";
  protected final String TEXT_2992 = "(new";
  protected final String TEXT_2993 = ");";
  protected final String TEXT_2994 = NL + "\t\tint ";
  protected final String TEXT_2995 = "ListSize = 0;";
  protected final String TEXT_2996 = NL + "\t\tint ";
  protected final String TEXT_2997 = "Size = ";
  protected final String TEXT_2998 = " == null ? 0 : ";
  protected final String TEXT_2999 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_3000 = "Size > ";
  protected final String TEXT_3001 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_3002 = "ListSize = ";
  protected final String TEXT_3003 = "Size;";
  protected final String TEXT_3004 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_3005 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_3006 = ".create";
  protected final String TEXT_3007 = "(";
  protected final String TEXT_3008 = ", ";
  protected final String TEXT_3009 = "i < ";
  protected final String TEXT_3010 = "Size ? (";
  protected final String TEXT_3011 = ") ";
  protected final String TEXT_3012 = ".get(i) : null";
  protected final String TEXT_3013 = ");" + NL + "\t\t}";
  protected final String TEXT_3014 = NL + "\t\tnew";
  protected final String TEXT_3015 = ".create";
  protected final String TEXT_3016 = "(";
  protected final String TEXT_3017 = ", ";
  protected final String TEXT_3018 = ");";
  protected final String TEXT_3019 = NL + "\t\tif (";
  protected final String TEXT_3020 = " != null)";
  protected final String TEXT_3021 = NL + "\t\t\tnew";
  protected final String TEXT_3022 = ".";
  protected final String TEXT_3023 = "().addAll(";
  protected final String TEXT_3024 = ");";
  protected final String TEXT_3025 = NL + "\t\t\tnew";
  protected final String TEXT_3026 = ".set";
  protected final String TEXT_3027 = "(";
  protected final String TEXT_3028 = ");";
  protected final String TEXT_3029 = NL + "\t\treturn new";
  protected final String TEXT_3030 = ";";
  protected final String TEXT_3031 = NL + "\t}" + NL;
  protected final String TEXT_3032 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_3033 = "} with the specified ";
  protected final String TEXT_3034 = " from the '<em><b>";
  protected final String TEXT_3035 = "</b></em>' ";
  protected final String TEXT_3036 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3037 = NL + "\t * @param ";
  protected final String TEXT_3038 = " The ";
  protected final String TEXT_3039 = " of the {@link ";
  protected final String TEXT_3040 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3041 = NL + "\t * @return The first {@link ";
  protected final String TEXT_3042 = "} with the specified ";
  protected final String TEXT_3043 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_3044 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3045 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3046 = NL + "\t";
  protected final String TEXT_3047 = " get";
  protected final String TEXT_3048 = "(";
  protected final String TEXT_3049 = ");" + NL;
  protected final String TEXT_3050 = NL + "\t@Override";
  protected final String TEXT_3051 = NL + "\tpublic ";
  protected final String TEXT_3052 = " get";
  protected final String TEXT_3053 = "(";
  protected final String TEXT_3054 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_3055 = "(";
  protected final String TEXT_3056 = ", false";
  protected final String TEXT_3057 = ", null";
  protected final String TEXT_3058 = ", false";
  protected final String TEXT_3059 = ");" + NL + "\t}" + NL;
  protected final String TEXT_3060 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_3061 = "} with the specified ";
  protected final String TEXT_3062 = " from the '<em><b>";
  protected final String TEXT_3063 = "</b></em>' ";
  protected final String TEXT_3064 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3065 = NL + "\t * @param ";
  protected final String TEXT_3066 = " The ";
  protected final String TEXT_3067 = " of the {@link ";
  protected final String TEXT_3068 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3069 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_3070 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_3071 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3072 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_3073 = "} on demand if not found.";
  protected final String TEXT_3074 = NL + "\t * @return The first {@link ";
  protected final String TEXT_3075 = "} with the specified ";
  protected final String TEXT_3076 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_3077 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3078 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3079 = NL + "\t";
  protected final String TEXT_3080 = " get";
  protected final String TEXT_3081 = "(";
  protected final String TEXT_3082 = ", boolean ignoreCase";
  protected final String TEXT_3083 = ", ";
  protected final String TEXT_3084 = " eClass";
  protected final String TEXT_3085 = ", boolean createOnDemand";
  protected final String TEXT_3086 = ");" + NL;
  protected final String TEXT_3087 = NL + "\t@Override";
  protected final String TEXT_3088 = NL + "\tpublic ";
  protected final String TEXT_3089 = " get";
  protected final String TEXT_3090 = "(";
  protected final String TEXT_3091 = ", boolean ignoreCase";
  protected final String TEXT_3092 = ", ";
  protected final String TEXT_3093 = " eClass";
  protected final String TEXT_3094 = ", boolean createOnDemand";
  protected final String TEXT_3095 = ")" + NL + "\t{";
  protected final String TEXT_3096 = NL + "\t\t";
  protected final String TEXT_3097 = "Loop: for (";
  protected final String TEXT_3098 = " ";
  protected final String TEXT_3099 = " : ";
  protected final String TEXT_3100 = "())" + NL + "\t\t{";
  protected final String TEXT_3101 = NL + "\t\t";
  protected final String TEXT_3102 = "Loop: for (";
  protected final String TEXT_3103 = " i = ";
  protected final String TEXT_3104 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_3105 = " ";
  protected final String TEXT_3106 = " = (";
  protected final String TEXT_3107 = ") i.next();";
  protected final String TEXT_3108 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_3109 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3110 = "Loop;";
  protected final String TEXT_3111 = NL + "\t\t\t";
  protected final String TEXT_3112 = " ";
  protected final String TEXT_3113 = "List = ";
  protected final String TEXT_3114 = ".";
  protected final String TEXT_3115 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_3116 = "ListSize = ";
  protected final String TEXT_3117 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_3118 = " || (";
  protected final String TEXT_3119 = " != null && ";
  protected final String TEXT_3120 = ".size() != ";
  protected final String TEXT_3121 = "ListSize";
  protected final String TEXT_3122 = ")";
  protected final String TEXT_3123 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_3124 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_3125 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_3126 = " ";
  protected final String TEXT_3127 = " = ";
  protected final String TEXT_3128 = "(";
  protected final String TEXT_3129 = ") ";
  protected final String TEXT_3130 = "List.get(j);";
  protected final String TEXT_3131 = NL + "\t\t\t\tif (";
  protected final String TEXT_3132 = " != null && !(ignoreCase ? (";
  protected final String TEXT_3133 = "(";
  protected final String TEXT_3134 = ")";
  protected final String TEXT_3135 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_3136 = ".";
  protected final String TEXT_3137 = "()) : ";
  protected final String TEXT_3138 = ".get(j).equals(";
  protected final String TEXT_3139 = ".";
  protected final String TEXT_3140 = "())))";
  protected final String TEXT_3141 = NL + "\t\t\t\tif (";
  protected final String TEXT_3142 = " != null && !";
  protected final String TEXT_3143 = ".get(j).equals(";
  protected final String TEXT_3144 = ".";
  protected final String TEXT_3145 = "()))";
  protected final String TEXT_3146 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_3147 = "Loop;";
  protected final String TEXT_3148 = NL + "\t\t\t}";
  protected final String TEXT_3149 = NL + "\t\t\t";
  protected final String TEXT_3150 = " ";
  protected final String TEXT_3151 = " = ";
  protected final String TEXT_3152 = ".";
  protected final String TEXT_3153 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_3154 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3155 = "Loop;";
  protected final String TEXT_3156 = NL + "\t\t\tif (";
  protected final String TEXT_3157 = " != null && !(ignoreCase ? ";
  protected final String TEXT_3158 = ".equalsIgnoreCase(";
  protected final String TEXT_3159 = ".";
  protected final String TEXT_3160 = "()) : ";
  protected final String TEXT_3161 = ".equals(";
  protected final String TEXT_3162 = ".";
  protected final String TEXT_3163 = "())))";
  protected final String TEXT_3164 = NL + "\t\t\tif (";
  protected final String TEXT_3165 = " != null && !";
  protected final String TEXT_3166 = ".equals(";
  protected final String TEXT_3167 = ".";
  protected final String TEXT_3168 = "()))";
  protected final String TEXT_3169 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3170 = "Loop;";
  protected final String TEXT_3171 = NL + "\t\t\tif (";
  protected final String TEXT_3172 = " != null && !(ignoreCase ? ";
  protected final String TEXT_3173 = ".equalsIgnoreCase(";
  protected final String TEXT_3174 = ".";
  protected final String TEXT_3175 = "()) : ";
  protected final String TEXT_3176 = ".equals(";
  protected final String TEXT_3177 = ".";
  protected final String TEXT_3178 = "())))";
  protected final String TEXT_3179 = NL + "\t\t\tif (";
  protected final String TEXT_3180 = " != null && !";
  protected final String TEXT_3181 = ".equals(";
  protected final String TEXT_3182 = ".";
  protected final String TEXT_3183 = "()))";
  protected final String TEXT_3184 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3185 = "Loop;";
  protected final String TEXT_3186 = NL + "\t\t\treturn ";
  protected final String TEXT_3187 = ";" + NL + "\t\t}";
  protected final String TEXT_3188 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_3189 = " && eClass != null";
  protected final String TEXT_3190 = " ? create";
  protected final String TEXT_3191 = "(";
  protected final String TEXT_3192 = ", eClass";
  protected final String TEXT_3193 = ") : null;";
  protected final String TEXT_3194 = NL + "\t\treturn null;";
  protected final String TEXT_3195 = NL + "\t}" + NL;
  protected final String TEXT_3196 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_3197 = "()" + NL + "\t{";
  protected final String TEXT_3198 = NL + "  \t\treturn false;";
  protected final String TEXT_3199 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3200 = ");";
  protected final String TEXT_3201 = NL + "\t\treturn !((";
  protected final String TEXT_3202 = ".Internal.Wrapper)";
  protected final String TEXT_3203 = "()).featureMap().isEmpty();";
  protected final String TEXT_3204 = NL + "\t\treturn ";
  protected final String TEXT_3205 = " != null && !";
  protected final String TEXT_3206 = ".featureMap().isEmpty();";
  protected final String TEXT_3207 = NL + "\t\treturn ";
  protected final String TEXT_3208 = " != null && !";
  protected final String TEXT_3209 = ".isEmpty();";
  protected final String TEXT_3210 = NL + "\t\t";
  protected final String TEXT_3211 = " ";
  protected final String TEXT_3212 = " = (";
  protected final String TEXT_3213 = ")eVirtualGet(";
  protected final String TEXT_3214 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3215 = " != null && !";
  protected final String TEXT_3216 = ".isEmpty();";
  protected final String TEXT_3217 = NL + "\t\treturn !";
  protected final String TEXT_3218 = "().isEmpty();";
  protected final String TEXT_3219 = NL + "\t\treturn ";
  protected final String TEXT_3220 = " != null;";
  protected final String TEXT_3221 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3222 = ") != null;";
  protected final String TEXT_3223 = NL + "\t\treturn basicGet";
  protected final String TEXT_3224 = "() != null;";
  protected final String TEXT_3225 = NL + "\t\treturn ";
  protected final String TEXT_3226 = " != null;";
  protected final String TEXT_3227 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3228 = ") != null;";
  protected final String TEXT_3229 = NL + "\t\treturn ";
  protected final String TEXT_3230 = "() != null;";
  protected final String TEXT_3231 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_3232 = " & ";
  protected final String TEXT_3233 = "_EFLAG) != 0) != ";
  protected final String TEXT_3234 = ";";
  protected final String TEXT_3235 = NL + "\t\t\t\treturn (";
  protected final String TEXT_3236 = " & ";
  protected final String TEXT_3237 = "_EFLAG) != ";
  protected final String TEXT_3238 = "_EFLAG_DEFAULT;";
  protected final String TEXT_3239 = NL + "\t\treturn ";
  protected final String TEXT_3240 = " != ";
  protected final String TEXT_3241 = ";";
  protected final String TEXT_3242 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3243 = ", ";
  protected final String TEXT_3244 = ") != ";
  protected final String TEXT_3245 = ";";
  protected final String TEXT_3246 = NL + "\t\treturn ";
  protected final String TEXT_3247 = "() != ";
  protected final String TEXT_3248 = ";";
  protected final String TEXT_3249 = NL + "\t\treturn ";
  protected final String TEXT_3250 = " == null ? ";
  protected final String TEXT_3251 = " != null : !";
  protected final String TEXT_3252 = ".equals(";
  protected final String TEXT_3253 = ");";
  protected final String TEXT_3254 = NL + "\t\t";
  protected final String TEXT_3255 = " ";
  protected final String TEXT_3256 = " = (";
  protected final String TEXT_3257 = ")eVirtualGet(";
  protected final String TEXT_3258 = ", ";
  protected final String TEXT_3259 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3260 = " == null ? ";
  protected final String TEXT_3261 = " != null : !";
  protected final String TEXT_3262 = ".equals(";
  protected final String TEXT_3263 = ");";
  protected final String TEXT_3264 = NL + "\t\treturn ";
  protected final String TEXT_3265 = " == null ? ";
  protected final String TEXT_3266 = "() != null : !";
  protected final String TEXT_3267 = ".equals(";
  protected final String TEXT_3268 = "());";
  protected final String TEXT_3269 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3270 = ");";
  protected final String TEXT_3271 = NL + "\t\t";
  protected final String TEXT_3272 = " ";
  protected final String TEXT_3273 = " = (";
  protected final String TEXT_3274 = ")eVirtualGet(";
  protected final String TEXT_3275 = ");";
  protected final String TEXT_3276 = NL + "\t\treturn ";
  protected final String TEXT_3277 = " != null && ((";
  protected final String TEXT_3278 = ".Unsettable";
  protected final String TEXT_3279 = ")";
  protected final String TEXT_3280 = ").isSet();";
  protected final String TEXT_3281 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_3282 = ");";
  protected final String TEXT_3283 = NL + "\t\treturn (";
  protected final String TEXT_3284 = " & ";
  protected final String TEXT_3285 = "_ESETFLAG) != 0;";
  protected final String TEXT_3286 = NL + "\t\treturn ";
  protected final String TEXT_3287 = "ESet;";
  protected final String TEXT_3288 = NL + "\t\treturn !((";
  protected final String TEXT_3289 = ".Internal)((";
  protected final String TEXT_3290 = ".Internal.Wrapper)get";
  protected final String TEXT_3291 = "()).featureMap()).isEmpty(";
  protected final String TEXT_3292 = ");";
  protected final String TEXT_3293 = NL + "\t\treturn !((";
  protected final String TEXT_3294 = ".Internal)get";
  protected final String TEXT_3295 = "()).isEmpty(";
  protected final String TEXT_3296 = ");";
  protected final String TEXT_3297 = NL + "\t\treturn ";
  protected final String TEXT_3298 = ".";
  protected final String TEXT_3299 = "(this);";
  protected final String TEXT_3300 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_3301 = "' ";
  protected final String TEXT_3302 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3303 = NL + "\t}" + NL;
  protected final String TEXT_3304 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3305 = NL + "\t@Override";
  protected final String TEXT_3306 = NL + "\tpublic ";
  protected final String TEXT_3307 = " ";
  protected final String TEXT_3308 = "(";
  protected final String TEXT_3309 = ")";
  protected final String TEXT_3310 = NL + "\t{";
  protected final String TEXT_3311 = NL + "\t\t";
  protected final String TEXT_3312 = "(";
  protected final String TEXT_3313 = ");";
  protected final String TEXT_3314 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3315 = NL + "\t\treturn ";
  protected final String TEXT_3316 = "(";
  protected final String TEXT_3317 = ");";
  protected final String TEXT_3318 = NL + "\t}" + NL;
  protected final String TEXT_3319 = NL + "} //";
  protected final String TEXT_3320 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2011 IBM Corporation and others.
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
    final boolean isGWT = genModel.getRuntimePlatform() == GenRuntimePlatform.GWT;
    final String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    final String singleWildcard = isJDK50 ? "<?>" : "";
    final String negativeOffsetCorrection = genClass.hasOffsetCorrection() ? " - " + genClass.getOffsetCorrectionField(null) : "";
    final String positiveOffsetCorrection = genClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(null) : "";
    final String negativeOperationOffsetCorrection = genClass.hasOffsetCorrection() ? " - EOPERATION_OFFSET_CORRECTION" : "";
    final String positiveOperationOffsetCorrection = genClass.hasOffsetCorrection() ? " + EOPERATION_OFFSET_CORRECTION" : "";
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_4);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_5);
    stringBuffer.append("$");
    }}
    stringBuffer.append(TEXT_6);
    if (isInterface) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_8);
    } else {
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_10);
    }
    stringBuffer.append(TEXT_11);
    genModel.markImportLocation(stringBuffer, genPackage);
    if (isImplementation) { genClass.addClassPsuedoImports(); }
    stringBuffer.append(TEXT_12);
    if (isInterface) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_14);
    if (genClass.hasDocumentation()) {
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genClass.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    if (!genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_18);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_22);
    }
    }
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_24);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_27);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_28);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_30);
    }}
    if (genClass.needsRootExtendsInterfaceExtendsTag()) {
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genModel.getImportedName(genModel.getRootExtendsInterface()));
    }
    stringBuffer.append(TEXT_32);
    //Class/interface.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_34);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_35);
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_39);
    }
    stringBuffer.append(TEXT_40);
    }
    stringBuffer.append(TEXT_41);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_42);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_43);
    }
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    } else {
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getInterfaceExtends());
    }
    stringBuffer.append(TEXT_46);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_47);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_50);
    }
    if (isImplementation && genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_54);
    }
    if (isImplementation && genClass.isJavaIOSerializable()) {
    stringBuffer.append(TEXT_55);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_56);
    if (isGWT) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_58);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_59);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
    stringBuffer.append(TEXT_60);
    if (isGWT) {
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_62);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_63);
    }
    }
    }
    }
    if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_64);
    if (isGWT) {
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_67);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
    if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_72);
    if (isGWT) {
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_78);
    } else if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_83);
    if (isGWT) {
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_87);
    }
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_91);
    if (genFeature.getQualifiedListItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_93);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_96);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_97);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_102);
    if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_103);
    }
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_107);
    } else {
    stringBuffer.append(TEXT_108);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_110);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) { int flagIndex = genClass.getFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_111);
    if (isGWT) {
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_114);
    }
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(flagIndex % 32);
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_124);
    if (isJDK50) {
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_125);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_127);
    }
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getTypeGenClassifier().getFormattedName());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_133);
    if (isJDK50) {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_134);
    } else {
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_139);
    }
    stringBuffer.append(TEXT_140);
    }
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genClass.getFlagSize(genFeature) > 1 ? "s" : "");
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genClass.getFlagMask(genFeature));
    stringBuffer.append(TEXT_148);
    if (genFeature.isEnumType()) {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_149);
    } else {
    stringBuffer.append(flagIndex % 32);
    }
    stringBuffer.append(TEXT_150);
    } else {
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_155);
    if (isGWT) {
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_160);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) { int flagIndex = genClass.getESetFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_161);
    if (isGWT) {
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_164);
    }
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_168);
    stringBuffer.append(flagIndex % 32 );
    stringBuffer.append(TEXT_169);
    } else {
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_172);
    if (isGWT) {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_175);
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genClass.getOffsetCorrectionField(null));
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genClass.getQualifiedFeatureID(genClass.getImplementedGenFeatures().get(0)));
    stringBuffer.append(TEXT_180);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genClass.getOffsetCorrectionField(genFeature));
    stringBuffer.append(TEXT_182);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(reverseFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_185);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genClass.getImplementedGenOperations().get(0).getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_188);
    stringBuffer.append(genClass.getQualifiedOperationID(genClass.getImplementedGenOperations().get(0)));
    stringBuffer.append(TEXT_189);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_190);
    if (genModel.isPublicConstructors()) {
    stringBuffer.append(TEXT_191);
    } else {
    stringBuffer.append(TEXT_192);
    }
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_194);
    for (GenFeature genFeature : genClass.getFlagGenFeaturesWithDefault()) {
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_197);
    if (!genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_198);
    }
    stringBuffer.append(TEXT_199);
    }
    stringBuffer.append(TEXT_200);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_201);
    }
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_203);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_204);
    }
    if (isImplementation && (genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL || genModel.isDynamicDelegation()) && (genClass.getClassExtendsGenClass() == null || (genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL && !genClass.getClassExtendsGenClass().getGenModel().isDynamicDelegation()))) {
    stringBuffer.append(TEXT_205);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_206);
    }
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_208);
    }
    //Class/reflectiveDelegation.override.javajetinc
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_209);
    if (!isImplementation) {
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_212);
    } else {
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_215);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_219);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_221);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_222);
    } else {
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_225);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_227);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_231);
    }
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_233);
    }
    stringBuffer.append(TEXT_234);
    if (!isImplementation) {
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_237);
    } else {
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_240);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_242);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_243);
    }
    stringBuffer.append(TEXT_244);
    if (!isImplementation) {
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_246);
    } else {
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_248);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_249);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_250);
    } else {
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_253);
    }
    stringBuffer.append(TEXT_254);
    }
    stringBuffer.append(TEXT_255);
    if (!isImplementation) {
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_259);
    } else {
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_263);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_267);
    }
    stringBuffer.append(TEXT_268);
    if (!isImplementation) {
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_271);
    } else {
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_273);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_275);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_276);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_278);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_279);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_280);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_281);
    } else {
    stringBuffer.append(TEXT_282);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_283);
    }
    stringBuffer.append(TEXT_284);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_285);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_286);
    } else {
    stringBuffer.append(TEXT_287);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_288);
    }
    stringBuffer.append(TEXT_289);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

    stringBuffer.append(TEXT_290);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_291);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_292);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_294);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_296);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_297);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_298);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_299);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_300);
    }
    }
    if (!UML2GenModelUtil.getSubsettedGenFeatures(genFeature).isEmpty()) {
    stringBuffer.append(TEXT_301);
    for (GenFeature subsettedGenFeature : UML2GenModelUtil.getSubsettedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_302);
    stringBuffer.append(subsettedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_303);
    stringBuffer.append(subsettedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_304);
    stringBuffer.append(subsettedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_305);
    }
    stringBuffer.append(TEXT_306);
    }if (UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_307);
    for (GenFeature redefinedGenFeature : UML2GenModelUtil.getRedefinedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_308);
    stringBuffer.append(redefinedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_309);
    stringBuffer.append(redefinedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_310);
    stringBuffer.append(redefinedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_311);
    }
    stringBuffer.append(TEXT_312);
    }if(genFeature.isDerived() && UML2GenModelUtil.isUnion(genFeature)){
    stringBuffer.append(TEXT_313);
    }
    stringBuffer.append(TEXT_314);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_317);
    }
    stringBuffer.append(TEXT_318);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_320);
    }
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_323);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_326);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_328);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_331);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_334);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_335);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_337);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_338);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_339);
    }}
    stringBuffer.append(TEXT_340);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_341);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_342);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_345);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !(genModel.isReflectiveDelegation() && genModel.isDynamicDelegation()) && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && !genFeature.isFeatureMapType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation() || genModel.isDynamicDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature() || genFeature.isListType() && genFeature.hasSettingDelegate())) {
    stringBuffer.append(TEXT_346);
    }
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_349);
    }
    stringBuffer.append(TEXT_350);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_351);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_352);
    }
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_356);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_357);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_359);
    }
    stringBuffer.append(TEXT_360);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_361);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_362);
    }
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_365);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_367);
    }
    stringBuffer.append(TEXT_368);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_369);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_370);
    }
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_373);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_374);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_375);
    }
    stringBuffer.append(TEXT_376);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_381);
    }
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_383);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_387);
    } else {
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_390);
    }
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_392);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_395);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_401);
    }
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_413);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_418);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_422);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_426);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_427);
    }
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_429);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_432);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_434);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_435);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_436);
    }
    stringBuffer.append(TEXT_437);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_440);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_446);
    }
    stringBuffer.append(TEXT_447);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_451);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_454);
    } else {
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_459);
    }
    } else {
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_461);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_467);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_471);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = isJDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_475);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_476);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_478);
    } else {
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_480);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_481);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_483);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_485);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_487);
    } else {
    stringBuffer.append(TEXT_488);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_490);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_491);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_492);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_494);
    }
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_496);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_498);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_500);
    }
    stringBuffer.append(TEXT_501);
    } else {
    stringBuffer.append(TEXT_502);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_503);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_505);
    }
    stringBuffer.append(TEXT_506);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_508);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_510);
    }
    stringBuffer.append(TEXT_511);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_515);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_516);
    }
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_519);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_520);
    }
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_522);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_523);
    }
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_525);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_527);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_529);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_530);
    }
    stringBuffer.append(TEXT_531);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_533);
    }
    stringBuffer.append(TEXT_534);
    }
    stringBuffer.append(TEXT_535);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_537);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_540);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_541);
    }
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_550);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_551);
    }
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_553);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_555);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_556);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_559);
    }
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_569);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_570);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_573);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_574);
    }
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_586);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_587);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_589);
    }
    stringBuffer.append(TEXT_590);
    }
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_595);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_596);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_597);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_598);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_599);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_600);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_602);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_603);
    } else {
    stringBuffer.append(TEXT_604);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_605);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_606);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_607);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_608);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_609);
    }
    }
    }
    }
    stringBuffer.append(TEXT_610);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_612);
    } else {
    stringBuffer.append(TEXT_613);
    }
    stringBuffer.append(TEXT_614);
    }
    } else {
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_616);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_617);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_618);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_619);
    if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_620);
    }
    }
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_623);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_627);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_628);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_629);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_630);
    }
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_632);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_633);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_635);
    }
    stringBuffer.append(TEXT_636);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_639);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_642);
    } else {
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_644);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_647);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_649);
    } else {
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_651);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_653);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_654);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_656);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_657);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_658);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_659);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_660);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_662);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_663);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_664);
    } else {
    stringBuffer.append(TEXT_665);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_666);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_667);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_668);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_669);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_670);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_671);
    }
    }
    }
    }
    stringBuffer.append(TEXT_672);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_673);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_674);
    } else {
    stringBuffer.append(TEXT_675);
    }
    stringBuffer.append(TEXT_676);
    } else {
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_679);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_680);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_681);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_682);
    }
    }
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_688);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_692);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_694);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_695);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_696);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_697);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_698);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_699);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_701);
    }
    stringBuffer.append(TEXT_702);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_703);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_704);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_705);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_706);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_708);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_709);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_710);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_711);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_712);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_716);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_717);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_718);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_719);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_720);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_721);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_723);
    }
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_725);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_726);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_728);
    }
    stringBuffer.append(TEXT_729);
    }
    stringBuffer.append(TEXT_730);
    }
    stringBuffer.append(TEXT_731);
    } else if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_735);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_737);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_738);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_739);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_740);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_741);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_742);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_744);
    }
    stringBuffer.append(TEXT_745);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_746);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_748);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_749);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_751);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_752);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_753);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_754);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_755);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_757);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_759);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_760);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_761);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_762);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_763);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_764);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_766);
    }
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_768);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_769);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_771);
    }
    stringBuffer.append(TEXT_772);
    }
    stringBuffer.append(TEXT_773);
    }
    stringBuffer.append(TEXT_774);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_778);
    } else {
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_784);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_786);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_790);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_793);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_796);
    }
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_798);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_799);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_803);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_804);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_808);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_809);
    } else {
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_811);
    }
    stringBuffer.append(TEXT_812);
    } else {
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_817);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_822);
    }
    stringBuffer.append(TEXT_823);
    }
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_825);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_826);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_827);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_828);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_829);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_830);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_832);
    }
    stringBuffer.append(TEXT_833);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_834);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_836);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_837);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_839);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_840);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_841);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_842);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_843);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_845);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_847);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_848);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_849);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_850);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_851);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_852);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_854);
    }
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_856);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_857);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_859);
    }
    stringBuffer.append(TEXT_860);
    }
    stringBuffer.append(TEXT_861);
    }
    stringBuffer.append(TEXT_862);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_865);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_868);
    } else {
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_870);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_873);
    }
    } else {
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_876);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_877);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_882);
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_885);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_888);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_890);
    }
    }
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_892);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_893);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_894);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_897);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_899);
    }
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_901);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_902);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_907);
    }
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_910);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_912);
    }
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_914);
    }
    stringBuffer.append(TEXT_915);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_917);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_919);
    }
    stringBuffer.append(TEXT_920);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_921);
    }
    stringBuffer.append(TEXT_922);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_924);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_925);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_926);
    }
    stringBuffer.append(TEXT_927);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_928);
    }
    stringBuffer.append(TEXT_929);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_931);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_934);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_942);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_943);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_947);
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
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_955);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_958);
    }
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_963);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_971);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_974);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_975);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_979);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_980);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_981);
    }
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_985);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_986);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_989);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_993);
    }
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_996);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_999);
    }
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1001);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1008);
    }
    stringBuffer.append(TEXT_1009);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1015);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1020);
    } else {
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1027);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1033);
    } else {
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1040);
    if (isJDK50) {
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1042);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1044);
    }
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1046);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1050);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1056);
    } else {
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1061);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1066);
    } else {
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1070);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1074);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1076);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1080);
    }
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1083);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1086);
    }
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1088);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1092);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1096);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1098);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1099);
    } else {
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1101);
    }
    stringBuffer.append(TEXT_1102);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1106);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1111);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1113);
    }
    }
    }
    if (!genFeature.isBasicSet()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_1115);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1119);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1122);
    }
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1127);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1129);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1137);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1141);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_1144);
    }
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1149);
    }
    stringBuffer.append(TEXT_1150);
    }
    stringBuffer.append(TEXT_1151);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1156);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1158);
    }
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1160);
    }
    stringBuffer.append(TEXT_1161);
    } else {
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1165);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1167);
    }
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1169);
    }
    stringBuffer.append(TEXT_1170);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1175);
    } else {
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1178);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1179);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_1180);
    if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1181);
    }
    }
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1185);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1187);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1190);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1192);
    }
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1194);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1198);
    }
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1200);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1202);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1206);
    }
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1209);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1212);
    }
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1214);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
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
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1230);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1231);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(TEXT_1237);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1239);
    }
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1241);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1244);
    }
    stringBuffer.append(TEXT_1245);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1246);
    if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1247);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1249);
    } else {
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1251);
    }
    stringBuffer.append(TEXT_1252);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1255);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1257);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1259);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1264);
    }
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1269);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1274);
    }
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1277);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1281);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1286);
    }
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1288);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1291);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1295);
    }
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1298);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1301);
    }
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1303);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1308);
    }
    stringBuffer.append(TEXT_1309);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1314);
    } else {
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1321);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1324);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1328);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1330);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1334);
    } else {
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1337);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1339);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1342);
    } else {
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1344);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1348);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1350);
    } else {
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1352);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1353);
    } else {
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1355);
    }
    stringBuffer.append(TEXT_1356);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1362);
    } else {
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1367);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1370);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1373);
    } else {
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1375);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1379);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1384);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1385);
    } else {
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1387);
    }
    stringBuffer.append(TEXT_1388);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1393);
    } else {
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1397);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1401);
    } else {
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1404);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1405);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1413);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1415);
    }
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1417);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1420);
    }
    stringBuffer.append(TEXT_1421);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1422);
    if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1423);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1425);
    } else {
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1427);
    }
    stringBuffer.append(TEXT_1428);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1431);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1433);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1435);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1440);
    }
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1445);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1447);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1450);
    } else {
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1452);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1457);
    } else {
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1461);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1465);
    } else {
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1468);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1469);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1476);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1483);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1484);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1489);
    } else {
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1494);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1498);
    } else {
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1502);
    }
    }
    stringBuffer.append(TEXT_1503);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1507);
    }
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1511);
    }
    } else {
    stringBuffer.append(TEXT_1512);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1515);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1516);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1517);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1518);
    }
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1521);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1522);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1526);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1529);
    } else {
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1532);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1534);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1542);
    index++;}
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1546);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1547);
    }
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1551);
    }
    stringBuffer.append(TEXT_1552);
    } else {
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1555);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1556);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1557);
    }
    } else {
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1559);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1563);
    } else {
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1567);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1569);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1570);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1575);
    } else {
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1580);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1584);
    } else {
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1588);
    }
    }
    stringBuffer.append(TEXT_1589);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1593);
    }
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1596);
    }
    } else {
    stringBuffer.append(TEXT_1597);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1601);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1602);
    }
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1606);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1608);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_1609);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1610);
    } else {
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1615);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1618);
    } else {
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1621);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1623);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1631);
    index++;}
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1635);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1636);
    }
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1640);
    }
    stringBuffer.append(TEXT_1641);
    } else {
    stringBuffer.append(TEXT_1642);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1644);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1645);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1646);
    }
    } else {
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1648);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1652);
    } else {
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1656);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1658);
    }
    stringBuffer.append(TEXT_1659);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1664);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1668);
    }
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1672);
    }
    } else {
    stringBuffer.append(TEXT_1673);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1677);
    }
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1678);
    }
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1684);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1685);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1686);
    }
    stringBuffer.append(TEXT_1687);
    }
    }
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1692);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1696);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1697);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1699);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1700);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1701);
    }
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1705);
    }
    } else {
    stringBuffer.append(TEXT_1706);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1710);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1712);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1713);
    }
    stringBuffer.append(TEXT_1714);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1715);
    }
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1719);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1721);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1722);
    }
    stringBuffer.append(TEXT_1723);
    if (isJDK50) {
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1728);
    } else {
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1735);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1738);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1745);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1746);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1749);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1750);
    }
    }
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1755);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1757);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1758);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1760);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1762);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1763);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1768);
    } else {
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1773);
    }
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1775);
    index++;}
    stringBuffer.append(TEXT_1776);
    } else {
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1783);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1791);
    } else {
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1796);
    }
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1798);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1806);
    } else {
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1811);
    }
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1813);
    index++;}
    }
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1815);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1816);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1817);
    }
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1820);
    }
    stringBuffer.append(TEXT_1821);
    } else {
    stringBuffer.append(TEXT_1822);
    }
    stringBuffer.append(TEXT_1823);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1824);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1825);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1826);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1828);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1831);
    } else {
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1834);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1837);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1844);
    } else {
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1846);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1848);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1850);
    } else {
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1852);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1854);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1856);
    } else {
    stringBuffer.append(TEXT_1857);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1858);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1862);
    } else {
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1866);
    }
    } else {
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1869);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1872);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1873);
    } else {
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1876);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1881);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1884);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1891);
    } else {
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1896);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1898);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1903);
    }
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1908);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1909);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1910);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1911);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1913);
    } else {
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1915);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1917);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1920);
    } else {
    stringBuffer.append(TEXT_1921);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1924);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1926);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1927);
    } else {
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1930);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1931);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation && !UML2GenModelUtil.hasOperationsClass(genClass, genOperation) && UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_1932);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1933);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1934);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1938);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1941);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_1948);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1949);
    } else {
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1953);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (isJDK50) {
    stringBuffer.append(TEXT_1956);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_1957);
    }
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1959);
    }
    }
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && isImplementation) {
    if (genOperation.isInvariant() && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_1960);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1962);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1963);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(genOperation.getInvariantExpression("\t\t"));
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1969);
    } else if (genOperation.hasInvocationDelegate()) {
    stringBuffer.append(TEXT_1970);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1972);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_1976);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_1979);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1980);
    if (UML2GenModelUtil.isRedefinition(genOperation)) {
    stringBuffer.append(TEXT_1981);
    for (GenOperation redefinedGenOperation : UML2GenModelUtil.getRedefinedGenOperations(genOperation)) {
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(redefinedGenOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1983);
    stringBuffer.append(redefinedGenOperation.getName());
    stringBuffer.append(TEXT_1984);
    stringBuffer.append(redefinedGenOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1985);
    stringBuffer.append(redefinedGenOperation.getFormattedName());
    stringBuffer.append(TEXT_1986);
    }
    stringBuffer.append(TEXT_1987);
    }
    stringBuffer.append(TEXT_1988);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1989);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1992);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1995);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1996);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1998);
    }}
    stringBuffer.append(TEXT_1999);
    } else {
    stringBuffer.append(TEXT_2000);
    if (isJDK50) {
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_2001);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2002);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2004);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_2005);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_2006);
    } else {
    if (genModel.useGenerics() && !genOperation.hasBody() && !genOperation.isInvariant() && genOperation.hasInvocationDelegate() && genOperation.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_2007);
    }
    stringBuffer.append(TEXT_2008);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_2011);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_2012);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2017);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(genOperation.getValidationDelegate());
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2020);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2024);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2025);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_2026);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_2027);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2030);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2031);
    } else {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_2032);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2033);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2034);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2035);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2036);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2038);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2039);
    } else {
    stringBuffer.append(TEXT_2040);
    }
    stringBuffer.append(TEXT_2041);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2042);
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2044);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_2045);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_2046);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2048);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_2052);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_2054);
    //genOperation.diagnostics.override.javajetinc
    stringBuffer.append(TEXT_2055);
    }
    }
    } else if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvocationDelegate()) { int size = genOperation.getGenParameters().size();
    stringBuffer.append(TEXT_2056);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2058);
    if (size > 0) {
    stringBuffer.append(TEXT_2059);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_2061);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_2062);
    } else {
    stringBuffer.append(TEXT_2063);
    }
    stringBuffer.append(TEXT_2064);
    } else {
    stringBuffer.append(TEXT_2065);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2066);
    }
    stringBuffer.append(TEXT_2067);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2069);
    if (size > 0) {
    stringBuffer.append(TEXT_2070);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2071);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_2072);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_2073);
    } else {
    stringBuffer.append(TEXT_2074);
    }
    stringBuffer.append(TEXT_2075);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2076);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2077);
    }
    stringBuffer.append(TEXT_2078);
    }
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2080);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.WrappedException"));
    stringBuffer.append(TEXT_2081);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2083);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2084);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2085);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2086);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2088);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_2089);
    }
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2091);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2092);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_2093);
    }
    stringBuffer.append(TEXT_2094);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2095);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_2096);
    }
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2098);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2099);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2100);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2102);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2103);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2104);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2105);
    }
    stringBuffer.append(TEXT_2106);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2107);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2108);
    }
    stringBuffer.append(TEXT_2109);
    }
    stringBuffer.append(TEXT_2110);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2111);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2112);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2114);
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
    stringBuffer.append(TEXT_2115);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2117);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2118);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2122);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2123);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2124);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2125);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_2126);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2127);
    }
    stringBuffer.append(TEXT_2128);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2131);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2132);
    }
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2134);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2139);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_2141);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2142);
    } else {
    stringBuffer.append(TEXT_2143);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_2144);
    }
    } else {
    stringBuffer.append(TEXT_2145);
    }
    }
    stringBuffer.append(TEXT_2146);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_2147);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_2148);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2149);
    }
    stringBuffer.append(TEXT_2150);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2152);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2154);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_2155);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2156);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2157);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2159);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2161);
    } else {
    stringBuffer.append(TEXT_2162);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2163);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_2164);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2165);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2166);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2167);
    } else {
    stringBuffer.append(TEXT_2168);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2169);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2170);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2172);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2174);
    } else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
    stringBuffer.append(TEXT_2175);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2177);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2179);
    }
    stringBuffer.append(TEXT_2180);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2181);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_2182);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2185);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2188);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2189);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2190);
    }
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2193);
    }
    }
    stringBuffer.append(TEXT_2194);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2195);
    } else {
    stringBuffer.append(TEXT_2196);
    }
    stringBuffer.append(TEXT_2197);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_2198);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2199);
    }
    stringBuffer.append(TEXT_2200);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2202);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2203);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2204);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_2205);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2206);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2207);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2208);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2209);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2210);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2211);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2212);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2213);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2215);
    } else {
    stringBuffer.append(TEXT_2216);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2217);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2218);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2219);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2220);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2221);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2222);
    } else {
    stringBuffer.append(TEXT_2223);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2224);
    }
    }
    stringBuffer.append(TEXT_2225);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2226);
    } else {
    stringBuffer.append(TEXT_2227);
    }
    stringBuffer.append(TEXT_2228);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_2229);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2230);
    }
    stringBuffer.append(TEXT_2231);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2232);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2233);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2234);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_2235);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2236);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2237);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2238);
    }
    stringBuffer.append(TEXT_2239);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2240);
    } else {
    stringBuffer.append(TEXT_2241);
    }
    stringBuffer.append(TEXT_2242);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_2243);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2244);
    }
    stringBuffer.append(TEXT_2245);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2246);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_2247);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2248);
    if (genFeature.isPrimitiveType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2249);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2250);
    } else if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2251);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2252);
    } else {
    stringBuffer.append(TEXT_2253);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2254);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2255);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_2256);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2257);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2258);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2260);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2261);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2262);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2263);
    } else {
    stringBuffer.append(TEXT_2264);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2265);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2266);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2267);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2269);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2270);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2271);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2272);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2273);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2274);
    } else {
    stringBuffer.append(TEXT_2275);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2276);
    }
    }
    stringBuffer.append(TEXT_2277);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2278);
    } else {
    stringBuffer.append(TEXT_2279);
    }
    stringBuffer.append(TEXT_2280);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_2281);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_2282);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2283);
    }
    stringBuffer.append(TEXT_2284);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2285);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_2286);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2287);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2288);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2290);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2291);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2292);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2293);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2294);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2296);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2297);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2298);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2299);
    } else {
    stringBuffer.append(TEXT_2300);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2301);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2302);
    }
    } else {
    stringBuffer.append(TEXT_2303);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2305);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2306);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2307);
    }
    stringBuffer.append(TEXT_2308);
    }
    } else if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2309);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2310);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2311);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2312);
    } else {
    stringBuffer.append(TEXT_2313);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2314);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2315);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2316);
    }
    stringBuffer.append(TEXT_2317);
    }
    stringBuffer.append(TEXT_2318);
    }
    stringBuffer.append(TEXT_2319);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2320);
    } else {
    stringBuffer.append(TEXT_2321);
    }
    stringBuffer.append(TEXT_2322);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_2323);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2324);
    }
    stringBuffer.append(TEXT_2325);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2326);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_2327);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2328);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2329);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2330);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2331);
    } else {
    stringBuffer.append(TEXT_2332);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2333);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2334);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2335);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_2336);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2337);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2338);
    } else {
    stringBuffer.append(TEXT_2339);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2340);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2341);
    }
    stringBuffer.append(TEXT_2342);
    }
    stringBuffer.append(TEXT_2343);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2344);
    } else {
    stringBuffer.append(TEXT_2345);
    }
    stringBuffer.append(TEXT_2346);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_2347);
    stringBuffer.append(TEXT_2348);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2349);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2350);
    }
    stringBuffer.append(TEXT_2351);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) { String safeNameAccessor = genFeature.getSafeName(); if ("featureID".equals(safeNameAccessor)) { safeNameAccessor = "this." + safeNameAccessor; }
    stringBuffer.append(TEXT_2352);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2353);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2354);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2355);
    } else {
    if (genFeature.hasSettingDelegate()) {
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2356);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2357);
    } else {
    stringBuffer.append(TEXT_2358);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2359);
    }
    } else if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2360);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2361);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2362);
    } else {
    stringBuffer.append(TEXT_2363);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2365);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2366);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2367);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2368);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2369);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2370);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2374);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2375);
    } else {
    stringBuffer.append(TEXT_2376);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2377);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2378);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2379);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2380);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2381);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2382);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2383);
    } else {
    stringBuffer.append(TEXT_2384);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2385);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2386);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2387);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2388);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2389);
    } else {
    stringBuffer.append(TEXT_2390);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2391);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2392);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2393);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2394);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2395);
    } else {
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2399);
    }
    } else {
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2401);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2402);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2403);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2404);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2405);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2406);
    } else {
    stringBuffer.append(TEXT_2407);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2408);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2409);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2410);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2411);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2412);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2413);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2414);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2415);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2416);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2418);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2419);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2420);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2421);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2423);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2424);
    } else {
    stringBuffer.append(TEXT_2425);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2426);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2428);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2429);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2430);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2431);
    } else {
    stringBuffer.append(TEXT_2432);
    }
    stringBuffer.append(TEXT_2433);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2434);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2435);
    }
    stringBuffer.append(TEXT_2436);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2437);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2438);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2439);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2440);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2441);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2442);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2443);
    }
    stringBuffer.append(TEXT_2444);
    }
    stringBuffer.append(TEXT_2445);
    }
    stringBuffer.append(TEXT_2446);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2447);
    }
    stringBuffer.append(TEXT_2448);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2449);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2450);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2451);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2453);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2454);
    }
    stringBuffer.append(TEXT_2455);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2456);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2457);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2458);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2461);
    }
    stringBuffer.append(TEXT_2462);
    }
    stringBuffer.append(TEXT_2463);
    }
    if (genModel.isOperationReflection() && isImplementation && (!genClass.getMixinGenOperations().isEmpty() || !genClass.getOverrideGenOperations(genClass.getExtendedGenOperations(), genClass.getImplementedGenOperations()).isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty())) {
    stringBuffer.append(TEXT_2464);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2465);
    }
    stringBuffer.append(TEXT_2466);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2467);
    for (GenClass extendedGenClass : genClass.getExtendedGenClasses()) { List<GenOperation> extendedImplementedGenOperations = extendedGenClass.getImplementedGenOperations(); List<GenOperation> implementedGenOperations = genClass.getImplementedGenOperations();
    if (!genClass.getOverrideGenOperations(extendedImplementedGenOperations, implementedGenOperations).isEmpty()) {
    stringBuffer.append(TEXT_2468);
    stringBuffer.append(extendedGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2469);
    for (GenOperation genOperation : extendedImplementedGenOperations) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    if (implementedGenOperations.contains(overrideGenOperation)) {
    stringBuffer.append(TEXT_2470);
    stringBuffer.append(extendedGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2471);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2472);
    }
    }
    stringBuffer.append(TEXT_2473);
    }
    }
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2474);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2475);
    for (GenOperation genOperation : mixinGenClass.getGenOperations()) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(mixinGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2478);
    }
    stringBuffer.append(TEXT_2479);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_2480);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2481);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_2482);
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2484);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2485);
    }
    stringBuffer.append(TEXT_2486);
    }
    stringBuffer.append(TEXT_2487);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2488);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2489);
    }
    stringBuffer.append(TEXT_2490);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2491);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2492);
    }
    stringBuffer.append(TEXT_2493);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2494);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2495);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2496);
    }
    stringBuffer.append(TEXT_2497);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2499);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2500);
    }
    stringBuffer.append(TEXT_2501);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2502);
    }
    stringBuffer.append(TEXT_2503);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2504);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2505);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2506);
    }
    stringBuffer.append(TEXT_2507);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_2508);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2509);
    }
    if (genModel.useGenerics()) {
    boolean isUnchecked = false; boolean isRaw = false; LOOP: for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { for (GenParameter genParameter : genOperation.getGenParameters()) { if (genParameter.isUncheckedCast()) { if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType()) { isUnchecked = true; } if (genParameter.usesOperationTypeParameters() && !genParameter.getEcoreParameter().getEGenericType().getETypeArguments().isEmpty()) { isRaw = true; break LOOP; }}}}
    if (isUnchecked) {
    stringBuffer.append(TEXT_2510);
    if (!isRaw) {
    stringBuffer.append(TEXT_2511);
    } else {
    stringBuffer.append(TEXT_2512);
    }
    stringBuffer.append(TEXT_2513);
    }
    }
    stringBuffer.append(TEXT_2514);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2515);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2516);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_2517);
    for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { List<GenParameter> genParameters = genOperation.getGenParameters(); int size = genParameters.size();
    stringBuffer.append(TEXT_2518);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2519);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2520);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2521);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2522);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_2523);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_2524);
    }
    stringBuffer.append(TEXT_2525);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2526);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2527);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2528);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_2529);
    }
    }
    stringBuffer.append(TEXT_2530);
    } else {
    stringBuffer.append(TEXT_2531);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2532);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2533);
    }
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2534);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2535);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_2537);
    }
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2539);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2540);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2541);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_2542);
    }
    }
    stringBuffer.append(TEXT_2543);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2544);
    }
    stringBuffer.append(TEXT_2545);
    }
    }
    stringBuffer.append(TEXT_2546);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2547);
    } else {
    stringBuffer.append(TEXT_2548);
    }
    stringBuffer.append(TEXT_2549);
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2550);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2551);
    }
    stringBuffer.append(TEXT_2552);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2553);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2554);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2555);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2556);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2557);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2558);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2559);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2560);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2561);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2562);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2563);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2564);
    }
    stringBuffer.append(TEXT_2565);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2567);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2568);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2569);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2570);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2571);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2572);
    }
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2574);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2577);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_2578);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2579);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2581);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2582);
    }
    stringBuffer.append(TEXT_2583);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2585);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2586);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2587);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2589);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2590);
    } else {
    stringBuffer.append(TEXT_2591);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2592);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2593);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2594);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2595);
    }
    } else {
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2597);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2598);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2599);
    if (isGWT) {
    stringBuffer.append(TEXT_2600);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_2601);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2602);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2603);
    if (!isJDK50 && keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2605);
    } else {
    stringBuffer.append(TEXT_2606);
    }
    stringBuffer.append(TEXT_2607);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2608);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2609);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2610);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2611);
    }
    stringBuffer.append(TEXT_2612);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2613);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2614);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2615);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2616);
    } else {
    stringBuffer.append(TEXT_2617);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2618);
    }
    stringBuffer.append(TEXT_2619);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2620);
    if (!isJDK50 && valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2621);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2622);
    } else {
    stringBuffer.append(TEXT_2623);
    }
    stringBuffer.append(TEXT_2624);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2625);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2626);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2627);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2628);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2629);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2630);
    }
    stringBuffer.append(TEXT_2631);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2632);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2633);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2635);
    } else {
    stringBuffer.append(TEXT_2636);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2637);
    }
    stringBuffer.append(TEXT_2638);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2639);
    }
    stringBuffer.append(TEXT_2640);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2641);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2642);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2643);
    }
    if (isImplementation) {
    if (!UML2GenModelUtil.isOperationsClasses(genPackage) && UML2GenModelUtil.hasOCLOperationBodies(genClass) && (!UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass()) || UML2GenModelUtil.isOperationsClasses(genClass.getClassExtendsGenClass().getGenPackage()))) {
    stringBuffer.append(TEXT_2644);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2646);
    }
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2647);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2650);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2652);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2653);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2654);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2655);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2656);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2657);
    }
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2659);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2660);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2661);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2662);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2664);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2665);
    } else {
    stringBuffer.append(TEXT_2666);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2668);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2670);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2672);
    }
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2674);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2675);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2676);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2679);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2680);
    }
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2682);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2683);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2684);
    } else {
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2687);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2690);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2691);
    }
    stringBuffer.append(TEXT_2692);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2693);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2695);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2697);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2698);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2699);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2700);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2702);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2703);
    } else {
    stringBuffer.append(TEXT_2704);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2706);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2707);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2708);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2709);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2710);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2711);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2712);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2713);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2714);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2715);
    } else {
    stringBuffer.append(TEXT_2716);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2717);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2718);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2719);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2720);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2721);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2722);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2723);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2724);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2725);
    }
    }
    }
    stringBuffer.append(TEXT_2726);
    if (isJDK50) { //isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2727);
    }
    }
    stringBuffer.append(TEXT_2728);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2729);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2730);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2731);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2732);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2733);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2734);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2735);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2736);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2737);
    }
    } else {
    stringBuffer.append(TEXT_2738);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2739);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2740);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2741);
    }
    }
    } else {
    stringBuffer.append(TEXT_2742);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2743);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2744);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2745);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2746);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2747);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2749);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2750);
    }
    } else {
    stringBuffer.append(TEXT_2751);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2752);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2753);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2754);
    }
    }
    } else {
    stringBuffer.append(TEXT_2755);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2756);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2757);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2758);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2759);
    } else {
    stringBuffer.append(TEXT_2760);
    }
    }
    stringBuffer.append(TEXT_2761);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2762);
    if (isJDK50) { //getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2763);
    }
    }
    stringBuffer.append(TEXT_2764);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2765);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2766);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType(genClass).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2768);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2769);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2770);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2771);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2772);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2773);
    } else {
    stringBuffer.append(TEXT_2774);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2775);
    }
    } else {
    stringBuffer.append(TEXT_2776);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2777);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2778);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2779);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2780);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2781);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2782);
    } else {
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2784);
    }
    }
    stringBuffer.append(TEXT_2785);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2786);
    if (isJDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2787);
    }
    }
    stringBuffer.append(TEXT_2788);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2789);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2790);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2791);
    } else {
    stringBuffer.append(TEXT_2792);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2793);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2794);
    }
    stringBuffer.append(TEXT_2795);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2796);
    if (isJDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2797);
    }
    }
    stringBuffer.append(TEXT_2798);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2799);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2800);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_2801);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2802);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2803);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2804);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2805);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2806);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2807);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2808);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2809);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2811);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2812);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2813);
    }
    stringBuffer.append(TEXT_2814);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2815);
    } else {
    stringBuffer.append(TEXT_2816);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2817);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2818);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2819);
    }
    stringBuffer.append(TEXT_2820);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2821);
    }
    }
    stringBuffer.append(TEXT_2822);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2823);
    if (isJDK50) { //setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2824);
    }
    }
    stringBuffer.append(TEXT_2825);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2826);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2827);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2828);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2829);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2830);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2831);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2832);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2833);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2834);
    }
    stringBuffer.append(TEXT_2835);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2836);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2837);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2838);
    }
    stringBuffer.append(TEXT_2839);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2840);
    }
    stringBuffer.append(TEXT_2841);
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2842);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2843);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2844);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2845);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2846);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2847);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2848);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2849);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2850);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2851);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2852);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2853);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2854);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2855);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_2856);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2857);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2858);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2859);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2860);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2861);
    } else {
    stringBuffer.append(TEXT_2862);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2863);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2864);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2865);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2866);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2867);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2868);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2869);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2870);
    } else {
    stringBuffer.append(TEXT_2871);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2872);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2873);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2874);
    }
    }
    stringBuffer.append(TEXT_2875);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2876);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2877);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2878);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2879);
    }
    stringBuffer.append(TEXT_2880);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2881);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2882);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2883);
    }
    } else {
    stringBuffer.append(TEXT_2884);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_2885);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2886);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2887);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2888);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2889);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2890);
    }
    stringBuffer.append(TEXT_2891);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2892);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2893);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2894);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2895);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2896);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2897);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2898);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2899);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2900);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2901);
    } else {
    stringBuffer.append(TEXT_2902);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2903);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2904);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2905);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2906);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2907);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2908);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2909);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2910);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2911);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2912);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2913);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2914);
    index++;}
    stringBuffer.append(TEXT_2915);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2916);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2917);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2918);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2919);
    }
    stringBuffer.append(TEXT_2920);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2921);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2922);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2923);
    }
    stringBuffer.append(TEXT_2924);
    } else {
    stringBuffer.append(TEXT_2925);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2926);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2927);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2928);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2929);
    }
    } else {
    stringBuffer.append(TEXT_2930);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2931);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2932);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2933);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2934);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2935);
    } else {
    stringBuffer.append(TEXT_2936);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2937);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2938);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2939);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2940);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2941);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_2942);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2943);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2944);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2945);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2946);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2947);
    } else {
    stringBuffer.append(TEXT_2948);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2949);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2950);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2951);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2952);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2953);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2954);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2955);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2956);
    } else {
    stringBuffer.append(TEXT_2957);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2958);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2959);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2960);
    }
    }
    stringBuffer.append(TEXT_2961);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2962);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2963);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2964);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2965);
    }
    stringBuffer.append(TEXT_2966);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2967);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2968);
    }
    } else {
    stringBuffer.append(TEXT_2969);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_2970);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2971);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2972);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2973);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2974);
    }
    stringBuffer.append(TEXT_2975);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2976);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2977);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2978);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2979);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2980);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_2981);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2982);
    } else {
    stringBuffer.append(TEXT_2983);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2984);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2985);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2986);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2987);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2988);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2989);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2990);
    } else {
    stringBuffer.append(TEXT_2991);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2992);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2993);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2994);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2995);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2996);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2997);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2998);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2999);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3000);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3001);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3002);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3003);
    index++;}
    stringBuffer.append(TEXT_3004);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3005);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3006);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3007);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3008);
    }
    stringBuffer.append(TEXT_3009);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3010);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3011);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3012);
    }
    stringBuffer.append(TEXT_3013);
    } else {
    stringBuffer.append(TEXT_3014);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3015);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3016);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3017);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_3018);
    }
    } else {
    stringBuffer.append(TEXT_3019);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3020);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3021);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3022);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3023);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3024);
    } else {
    stringBuffer.append(TEXT_3025);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3026);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_3027);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3028);
    }
    index++;}
    }
    stringBuffer.append(TEXT_3029);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3030);
    }
    stringBuffer.append(TEXT_3031);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3032);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3033);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3034);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3035);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3036);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3037);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3038);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3039);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3040);
    }
    stringBuffer.append(TEXT_3041);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3042);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3043);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3044);
    }
    } else {
    stringBuffer.append(TEXT_3045);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3046);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3047);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3048);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3049);
    }
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3050);
    }
    stringBuffer.append(TEXT_3051);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3052);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3053);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3054);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3055);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3056);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3057);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3058);
    }
    stringBuffer.append(TEXT_3059);
    }
    }
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3060);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3061);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3062);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3063);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3064);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3065);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3066);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3067);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3068);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3069);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3070);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3071);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3072);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3073);
    }
    stringBuffer.append(TEXT_3074);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3075);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3076);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3077);
    }
    } else {
    stringBuffer.append(TEXT_3078);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3079);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3080);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3081);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3082);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3083);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3084);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3085);
    }
    stringBuffer.append(TEXT_3086);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3087);
    }
    stringBuffer.append(TEXT_3088);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3089);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3090);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3091);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3092);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3093);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3094);
    }
    stringBuffer.append(TEXT_3095);
    if (isJDK50) {
    stringBuffer.append(TEXT_3096);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3097);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_3098);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3099);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3100);
    } else {
    stringBuffer.append(TEXT_3101);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3102);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_3103);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3104);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3105);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3106);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3107);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3108);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3109);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3110);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3111);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3112);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3113);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3114);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3115);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3116);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3117);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_3118);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_3119);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_3120);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3121);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_3122);
    }
    }
    stringBuffer.append(TEXT_3123);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3124);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3125);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3126);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3127);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_3128);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3129);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3130);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3131);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3132);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_3133);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_3134);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3135);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3136);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3137);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3138);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3139);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3140);
    } else {
    stringBuffer.append(TEXT_3141);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3142);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3143);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3144);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3145);
    }
    stringBuffer.append(TEXT_3146);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3147);
    index++;}
    stringBuffer.append(TEXT_3148);
    } else {
    stringBuffer.append(TEXT_3149);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3150);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3151);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3152);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3153);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3154);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3155);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3156);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3157);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3158);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3159);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3160);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3161);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3162);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3163);
    } else {
    stringBuffer.append(TEXT_3164);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3165);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3166);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3167);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3168);
    }
    stringBuffer.append(TEXT_3169);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3170);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3171);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3172);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3173);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3174);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3175);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3176);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3177);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3178);
    } else {
    stringBuffer.append(TEXT_3179);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3180);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3181);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3182);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3183);
    }
    stringBuffer.append(TEXT_3184);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3185);
    index++;}
    }
    stringBuffer.append(TEXT_3186);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3187);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3188);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3189);
    }
    stringBuffer.append(TEXT_3190);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3191);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3192);
    }
    stringBuffer.append(TEXT_3193);
    } else {
    stringBuffer.append(TEXT_3194);
    }
    stringBuffer.append(TEXT_3195);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_3196);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3197);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_3198);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3199);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3200);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_3201);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3202);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3203);
    } else {
    stringBuffer.append(TEXT_3204);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3205);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3206);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3207);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3208);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3209);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3210);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3211);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3212);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3213);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3214);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3215);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3216);
    } else {
    stringBuffer.append(TEXT_3217);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3218);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3219);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3220);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3221);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3222);
    } else {
    stringBuffer.append(TEXT_3223);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3224);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3225);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3226);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3227);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3228);
    } else {
    stringBuffer.append(TEXT_3229);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3230);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_3231);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3232);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3233);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3234);
    } else {
    stringBuffer.append(TEXT_3235);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3236);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3237);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3238);
    }
    } else {
    stringBuffer.append(TEXT_3239);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3240);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3241);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3242);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3243);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3244);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3245);
    } else {
    stringBuffer.append(TEXT_3246);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3247);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3248);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3249);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3250);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3251);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3252);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3253);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3254);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3255);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3256);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3257);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3258);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3259);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3260);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3261);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3262);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3263);
    } else {
    stringBuffer.append(TEXT_3264);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3265);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3266);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3267);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3268);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3269);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3270);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_3271);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3272);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3273);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3274);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3275);
    }
    stringBuffer.append(TEXT_3276);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_3278);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_3279);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3280);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_3281);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3282);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_3283);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_3284);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3285);
    } else {
    stringBuffer.append(TEXT_3286);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3287);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_3288);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3289);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3290);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3291);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3292);
    } else {
    stringBuffer.append(TEXT_3293);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3294);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3295);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3296);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_3297);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_3298);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3299);
    } else {
    stringBuffer.append(TEXT_3300);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3301);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3302);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_3303);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_3304);
    if (isJDK50) { //genOperation.annotations.insert.javajetinc
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_3305);
    }
    }
    stringBuffer.append(TEXT_3306);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_3307);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3308);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_3309);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_3310);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_3311);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3312);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3313);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_3314);
    } else {
    stringBuffer.append(TEXT_3315);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3316);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3317);
    }
    }
    stringBuffer.append(TEXT_3318);
    }
    }
    stringBuffer.append(TEXT_3319);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_3320);
    return stringBuffer.toString();
  }
}
