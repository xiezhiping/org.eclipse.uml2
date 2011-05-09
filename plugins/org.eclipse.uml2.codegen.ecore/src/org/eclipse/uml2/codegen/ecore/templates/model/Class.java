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
  protected final String TEXT_514 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_515 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_516 = NL + "\t\t\t";
  protected final String TEXT_517 = " result = (";
  protected final String TEXT_518 = ") cache.get(";
  protected final String TEXT_519 = "eResource(), ";
  protected final String TEXT_520 = "this, ";
  protected final String TEXT_521 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_522 = "eResource(), ";
  protected final String TEXT_523 = "this, ";
  protected final String TEXT_524 = ", result = ";
  protected final String TEXT_525 = "new ";
  protected final String TEXT_526 = "(";
  protected final String TEXT_527 = ".";
  protected final String TEXT_528 = "(this)";
  protected final String TEXT_529 = ")";
  protected final String TEXT_530 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_531 = ".";
  protected final String TEXT_532 = "()";
  protected final String TEXT_533 = ";" + NL + "\t\t}";
  protected final String TEXT_534 = NL + "\t\treturn ";
  protected final String TEXT_535 = ".";
  protected final String TEXT_536 = "(this);";
  protected final String TEXT_537 = NL + "\t\t";
  protected final String TEXT_538 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_539 = " eResource = eResource();";
  protected final String TEXT_540 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_541 = NL + "\t\t\t";
  protected final String TEXT_542 = " ";
  protected final String TEXT_543 = " = (";
  protected final String TEXT_544 = ") cache.get(eResource, this, ";
  protected final String TEXT_545 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_546 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_547 = ", ";
  protected final String TEXT_548 = " = new ";
  protected final String TEXT_549 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_550 = ";" + NL + "\t\t}";
  protected final String TEXT_551 = NL + "\t\treturn new ";
  protected final String TEXT_552 = ";";
  protected final String TEXT_553 = NL + "\t\t";
  protected final String TEXT_554 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_555 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_556 = " method = getClass().getMethod(\"";
  protected final String TEXT_557 = "\", null);";
  protected final String TEXT_558 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_559 = NL + "\t\t\t\t";
  protected final String TEXT_560 = " ";
  protected final String TEXT_561 = " = (";
  protected final String TEXT_562 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_563 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_564 = " union = ";
  protected final String TEXT_565 = "Helper(new ";
  protected final String TEXT_566 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_567 = " = new ";
  protected final String TEXT_568 = "(this, ";
  protected final String TEXT_569 = "null";
  protected final String TEXT_570 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_571 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_572 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_573 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_574 = NL + "\t\t\t";
  protected final String TEXT_575 = " ";
  protected final String TEXT_576 = " = (";
  protected final String TEXT_577 = ") cache.get(eResource(), this, ";
  protected final String TEXT_578 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_579 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_580 = " union = ";
  protected final String TEXT_581 = "Helper(new ";
  protected final String TEXT_582 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_583 = ", ";
  protected final String TEXT_584 = " = new ";
  protected final String TEXT_585 = "(this, ";
  protected final String TEXT_586 = "null";
  protected final String TEXT_587 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_588 = ";";
  protected final String TEXT_589 = NL + "\t\t}";
  protected final String TEXT_590 = NL + "\t\t";
  protected final String TEXT_591 = " union = ";
  protected final String TEXT_592 = "Helper(new ";
  protected final String TEXT_593 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_594 = "(this, ";
  protected final String TEXT_595 = "null";
  protected final String TEXT_596 = ", union.size(), union.toArray());";
  protected final String TEXT_597 = NL + "\t\tif (isSet";
  protected final String TEXT_598 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_599 = "();" + NL + "\t\t}";
  protected final String TEXT_600 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_601 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_602 = "();" + NL + "\t\t}";
  protected final String TEXT_603 = NL + "\t\t";
  protected final String TEXT_604 = " ";
  protected final String TEXT_605 = " = ";
  protected final String TEXT_606 = "();" + NL + "\t\tif (";
  protected final String TEXT_607 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_608 = ";" + NL + "\t\t}";
  protected final String TEXT_609 = NL + "\t\treturn ";
  protected final String TEXT_610 = "super.";
  protected final String TEXT_611 = "()";
  protected final String TEXT_612 = "null";
  protected final String TEXT_613 = ";";
  protected final String TEXT_614 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_615 = "' ";
  protected final String TEXT_616 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_617 = NL + "\t}" + NL;
  protected final String TEXT_618 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_619 = NL + "\t@Override";
  protected final String TEXT_620 = NL + "\tpublic ";
  protected final String TEXT_621 = " basicGet";
  protected final String TEXT_622 = "()" + NL + "\t{";
  protected final String TEXT_623 = NL + "\t\treturn (";
  protected final String TEXT_624 = ")eDynamicGet(";
  protected final String TEXT_625 = ", ";
  protected final String TEXT_626 = ", false, ";
  protected final String TEXT_627 = ");";
  protected final String TEXT_628 = NL + "\t\treturn ";
  protected final String TEXT_629 = "(";
  protected final String TEXT_630 = "(";
  protected final String TEXT_631 = ")";
  protected final String TEXT_632 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false)";
  protected final String TEXT_633 = ").";
  protected final String TEXT_634 = "()";
  protected final String TEXT_635 = ";";
  protected final String TEXT_636 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_637 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_638 = ")eInternalContainer();";
  protected final String TEXT_639 = NL + "\t\treturn (";
  protected final String TEXT_640 = ")eVirtualGet(";
  protected final String TEXT_641 = ");";
  protected final String TEXT_642 = NL + "\t\treturn ";
  protected final String TEXT_643 = ";";
  protected final String TEXT_644 = NL + "\t\treturn (";
  protected final String TEXT_645 = ")((";
  protected final String TEXT_646 = ".Internal.Wrapper)get";
  protected final String TEXT_647 = "()).featureMap().get(";
  protected final String TEXT_648 = ", false);";
  protected final String TEXT_649 = NL + "\t\treturn (";
  protected final String TEXT_650 = ")get";
  protected final String TEXT_651 = "().get(";
  protected final String TEXT_652 = ", false);";
  protected final String TEXT_653 = NL + "\t\treturn ";
  protected final String TEXT_654 = ".";
  protected final String TEXT_655 = "(this);";
  protected final String TEXT_656 = NL + "\t\tif (isSet";
  protected final String TEXT_657 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_658 = "basicGet";
  protected final String TEXT_659 = "();" + NL + "\t\t}";
  protected final String TEXT_660 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_661 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_662 = "basicGet";
  protected final String TEXT_663 = "();" + NL + "\t\t}";
  protected final String TEXT_664 = NL + "\t\t";
  protected final String TEXT_665 = " ";
  protected final String TEXT_666 = " = ";
  protected final String TEXT_667 = "basicGet";
  protected final String TEXT_668 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_669 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_670 = ";" + NL + "\t\t}";
  protected final String TEXT_671 = NL + "\t\treturn ";
  protected final String TEXT_672 = "super.basicGet";
  protected final String TEXT_673 = "()";
  protected final String TEXT_674 = "null";
  protected final String TEXT_675 = ";";
  protected final String TEXT_676 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_677 = "' ";
  protected final String TEXT_678 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_679 = NL + "\t}" + NL;
  protected final String TEXT_680 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_681 = NL + "\t@Override";
  protected final String TEXT_682 = NL + "\tpublic ";
  protected final String TEXT_683 = " basicSet";
  protected final String TEXT_684 = "(";
  protected final String TEXT_685 = " new";
  protected final String TEXT_686 = ", ";
  protected final String TEXT_687 = " msgs)" + NL + "\t{";
  protected final String TEXT_688 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_689 = ")new";
  protected final String TEXT_690 = ", ";
  protected final String TEXT_691 = ", msgs);";
  protected final String TEXT_692 = NL + "\t\t";
  protected final String TEXT_693 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_694 = NL + "\t\t\t";
  protected final String TEXT_695 = " ";
  protected final String TEXT_696 = " = ";
  protected final String TEXT_697 = "();";
  protected final String TEXT_698 = NL + "\t\t\tObject ";
  protected final String TEXT_699 = " = eVirtualGet(";
  protected final String TEXT_700 = ");";
  protected final String TEXT_701 = NL + "\t\t\tif (";
  protected final String TEXT_702 = " != null && ";
  protected final String TEXT_703 = " != new";
  protected final String TEXT_704 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_705 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_706 = NL + "\t\t\tif (new";
  protected final String TEXT_707 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_708 = NL + "\t\t\t\t";
  protected final String TEXT_709 = " ";
  protected final String TEXT_710 = " = ";
  protected final String TEXT_711 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_712 = ".contains(new";
  protected final String TEXT_713 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_714 = ".add(new";
  protected final String TEXT_715 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_716 = NL + "\t\t\t\t";
  protected final String TEXT_717 = " ";
  protected final String TEXT_718 = " = ";
  protected final String TEXT_719 = "();";
  protected final String TEXT_720 = NL + "\t\t\t\tObject ";
  protected final String TEXT_721 = " = eVirtualGet(";
  protected final String TEXT_722 = ");";
  protected final String TEXT_723 = NL + "\t\t\t\tif (new";
  protected final String TEXT_724 = " != ";
  protected final String TEXT_725 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_726 = "(new";
  protected final String TEXT_727 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_728 = NL + "\t\t\t}";
  protected final String TEXT_729 = NL + "\t\t}";
  protected final String TEXT_730 = NL + "\t\treturn msgs;";
  protected final String TEXT_731 = NL + "\t\tmsgs = eDynamicInverseAdd((";
  protected final String TEXT_732 = ")new";
  protected final String TEXT_733 = ", ";
  protected final String TEXT_734 = ", msgs);";
  protected final String TEXT_735 = NL + "\t\t";
  protected final String TEXT_736 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_737 = NL + "\t\t\t";
  protected final String TEXT_738 = " ";
  protected final String TEXT_739 = " = ";
  protected final String TEXT_740 = "();";
  protected final String TEXT_741 = NL + "\t\t\tObject ";
  protected final String TEXT_742 = " = eVirtualGet(";
  protected final String TEXT_743 = ");";
  protected final String TEXT_744 = NL + "\t\t\tif (";
  protected final String TEXT_745 = " != null && ";
  protected final String TEXT_746 = " != new";
  protected final String TEXT_747 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_748 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_749 = NL + "\t\t\tif (new";
  protected final String TEXT_750 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_751 = NL + "\t\t\t\t";
  protected final String TEXT_752 = " ";
  protected final String TEXT_753 = " = ";
  protected final String TEXT_754 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_755 = ".contains(new";
  protected final String TEXT_756 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_757 = ".add(new";
  protected final String TEXT_758 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_759 = NL + "\t\t\t\t";
  protected final String TEXT_760 = " ";
  protected final String TEXT_761 = " = ";
  protected final String TEXT_762 = "();";
  protected final String TEXT_763 = NL + "\t\t\t\tObject ";
  protected final String TEXT_764 = " = eVirtualGet(";
  protected final String TEXT_765 = ");";
  protected final String TEXT_766 = NL + "\t\t\t\tif (new";
  protected final String TEXT_767 = " != ";
  protected final String TEXT_768 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_769 = "(new";
  protected final String TEXT_770 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_771 = NL + "\t\t\t}";
  protected final String TEXT_772 = NL + "\t\t}";
  protected final String TEXT_773 = NL + "\t\treturn msgs;";
  protected final String TEXT_774 = NL + "\t\tObject old";
  protected final String TEXT_775 = " = eVirtualSet(";
  protected final String TEXT_776 = ", new";
  protected final String TEXT_777 = ");";
  protected final String TEXT_778 = NL + "\t\t";
  protected final String TEXT_779 = " old";
  protected final String TEXT_780 = " = ";
  protected final String TEXT_781 = ";" + NL + "\t\t";
  protected final String TEXT_782 = " = new";
  protected final String TEXT_783 = ";";
  protected final String TEXT_784 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_785 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_786 = NL + "\t\tboolean old";
  protected final String TEXT_787 = "ESet = (";
  protected final String TEXT_788 = " & ";
  protected final String TEXT_789 = "_ESETFLAG) != 0;";
  protected final String TEXT_790 = NL + "\t\t";
  protected final String TEXT_791 = " |= ";
  protected final String TEXT_792 = "_ESETFLAG;";
  protected final String TEXT_793 = NL + "\t\tboolean old";
  protected final String TEXT_794 = "ESet = ";
  protected final String TEXT_795 = "ESet;";
  protected final String TEXT_796 = NL + "\t\t";
  protected final String TEXT_797 = "ESet = true;";
  protected final String TEXT_798 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_799 = NL + "\t\t\t";
  protected final String TEXT_800 = " notification = new ";
  protected final String TEXT_801 = "(this, ";
  protected final String TEXT_802 = ".SET, ";
  protected final String TEXT_803 = ", ";
  protected final String TEXT_804 = "isSetChange ? null : old";
  protected final String TEXT_805 = "old";
  protected final String TEXT_806 = ", new";
  protected final String TEXT_807 = ", ";
  protected final String TEXT_808 = "isSetChange";
  protected final String TEXT_809 = "!old";
  protected final String TEXT_810 = "ESet";
  protected final String TEXT_811 = ");";
  protected final String TEXT_812 = NL + "\t\t\t";
  protected final String TEXT_813 = " notification = new ";
  protected final String TEXT_814 = "(this, ";
  protected final String TEXT_815 = ".SET, ";
  protected final String TEXT_816 = ", ";
  protected final String TEXT_817 = "old";
  protected final String TEXT_818 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_819 = "old";
  protected final String TEXT_820 = ", new";
  protected final String TEXT_821 = ");";
  protected final String TEXT_822 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_823 = NL + "\t\t";
  protected final String TEXT_824 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_825 = NL + "\t\t\t";
  protected final String TEXT_826 = " ";
  protected final String TEXT_827 = " = ";
  protected final String TEXT_828 = "();";
  protected final String TEXT_829 = NL + "\t\t\tObject ";
  protected final String TEXT_830 = " = eVirtualGet(";
  protected final String TEXT_831 = ");";
  protected final String TEXT_832 = NL + "\t\t\tif (";
  protected final String TEXT_833 = " != null && ";
  protected final String TEXT_834 = " != new";
  protected final String TEXT_835 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_836 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_837 = NL + "\t\t\tif (new";
  protected final String TEXT_838 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_839 = NL + "\t\t\t\t";
  protected final String TEXT_840 = " ";
  protected final String TEXT_841 = " = ";
  protected final String TEXT_842 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_843 = ".contains(new";
  protected final String TEXT_844 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_845 = ".add(new";
  protected final String TEXT_846 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_847 = NL + "\t\t\t\t";
  protected final String TEXT_848 = " ";
  protected final String TEXT_849 = " = ";
  protected final String TEXT_850 = "();";
  protected final String TEXT_851 = NL + "\t\t\t\tObject ";
  protected final String TEXT_852 = " = eVirtualGet(";
  protected final String TEXT_853 = ");";
  protected final String TEXT_854 = NL + "\t\t\t\tif (new";
  protected final String TEXT_855 = " != ";
  protected final String TEXT_856 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_857 = "(new";
  protected final String TEXT_858 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_859 = NL + "\t\t\t}";
  protected final String TEXT_860 = NL + "\t\t}";
  protected final String TEXT_861 = NL + "\t\treturn msgs;";
  protected final String TEXT_862 = NL + "\t\treturn ((";
  protected final String TEXT_863 = ".Internal)((";
  protected final String TEXT_864 = ".Internal.Wrapper)get";
  protected final String TEXT_865 = "()).featureMap()).basicAdd(";
  protected final String TEXT_866 = ", new";
  protected final String TEXT_867 = ", msgs);";
  protected final String TEXT_868 = NL + "\t\treturn ((";
  protected final String TEXT_869 = ".Internal)get";
  protected final String TEXT_870 = "()).basicAdd(";
  protected final String TEXT_871 = ", new";
  protected final String TEXT_872 = ", msgs);";
  protected final String TEXT_873 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_874 = "' ";
  protected final String TEXT_875 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_876 = NL + "\t}" + NL;
  protected final String TEXT_877 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_878 = "#";
  protected final String TEXT_879 = " <em>";
  protected final String TEXT_880 = "</em>}' ";
  protected final String TEXT_881 = ".";
  protected final String TEXT_882 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_883 = "</em>' ";
  protected final String TEXT_884 = ".";
  protected final String TEXT_885 = NL + "\t * @see ";
  protected final String TEXT_886 = NL + "\t * @see #isSet";
  protected final String TEXT_887 = "()";
  protected final String TEXT_888 = NL + "\t * @see #unset";
  protected final String TEXT_889 = "()";
  protected final String TEXT_890 = NL + "\t * @see #";
  protected final String TEXT_891 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_892 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_893 = NL + "\t@Override";
  protected final String TEXT_894 = NL + "\tvoid set";
  protected final String TEXT_895 = "(";
  protected final String TEXT_896 = " value);" + NL;
  protected final String TEXT_897 = NL + "\tpublic void set";
  protected final String TEXT_898 = "_";
  protected final String TEXT_899 = "(";
  protected final String TEXT_900 = " ";
  protected final String TEXT_901 = ")" + NL + "\t{";
  protected final String TEXT_902 = NL + "\t\tnew";
  protected final String TEXT_903 = " = new";
  protected final String TEXT_904 = " == null ? ";
  protected final String TEXT_905 = " : new";
  protected final String TEXT_906 = ";";
  protected final String TEXT_907 = NL + "\t\teDynamicSet(";
  protected final String TEXT_908 = ", ";
  protected final String TEXT_909 = ", ";
  protected final String TEXT_910 = "new ";
  protected final String TEXT_911 = "(";
  protected final String TEXT_912 = "new";
  protected final String TEXT_913 = ")";
  protected final String TEXT_914 = ");";
  protected final String TEXT_915 = NL + "\t\teSet(";
  protected final String TEXT_916 = ", ";
  protected final String TEXT_917 = "new ";
  protected final String TEXT_918 = "(";
  protected final String TEXT_919 = "new";
  protected final String TEXT_920 = ")";
  protected final String TEXT_921 = ");";
  protected final String TEXT_922 = NL + "\t\t";
  protected final String TEXT_923 = "__ESETTING_DELEGATE.dynamicSet(this, null, 0, ";
  protected final String TEXT_924 = "new ";
  protected final String TEXT_925 = "(";
  protected final String TEXT_926 = "new";
  protected final String TEXT_927 = ")";
  protected final String TEXT_928 = ");";
  protected final String TEXT_929 = NL + "\t\tif (new";
  protected final String TEXT_930 = " != eInternalContainer() || (eContainerFeatureID() != ";
  protected final String TEXT_931 = " && new";
  protected final String TEXT_932 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_933 = ".isAncestor(this, ";
  protected final String TEXT_934 = "new";
  protected final String TEXT_935 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_936 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_937 = NL + "\t\t\t";
  protected final String TEXT_938 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_939 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_940 = ")new";
  protected final String TEXT_941 = ").eInverseAdd(this, ";
  protected final String TEXT_942 = ", ";
  protected final String TEXT_943 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_944 = "(";
  protected final String TEXT_945 = "new";
  protected final String TEXT_946 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_947 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_948 = "(this, ";
  protected final String TEXT_949 = ".SET, ";
  protected final String TEXT_950 = ", new";
  protected final String TEXT_951 = ", new";
  protected final String TEXT_952 = "));";
  protected final String TEXT_953 = NL + "\t\t";
  protected final String TEXT_954 = " ";
  protected final String TEXT_955 = " = (";
  protected final String TEXT_956 = ")eVirtualGet(";
  protected final String TEXT_957 = ");";
  protected final String TEXT_958 = NL + "\t\tif (new";
  protected final String TEXT_959 = " != ";
  protected final String TEXT_960 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_961 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_962 = " != null)";
  protected final String TEXT_963 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_964 = ")";
  protected final String TEXT_965 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_966 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_967 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_968 = ")new";
  protected final String TEXT_969 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_970 = ", null, msgs);";
  protected final String TEXT_971 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_972 = ")";
  protected final String TEXT_973 = ").eInverseRemove(this, ";
  protected final String TEXT_974 = ", ";
  protected final String TEXT_975 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_976 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_977 = ")new";
  protected final String TEXT_978 = ").eInverseAdd(this, ";
  protected final String TEXT_979 = ", ";
  protected final String TEXT_980 = ".class, msgs);";
  protected final String TEXT_981 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_982 = "(";
  protected final String TEXT_983 = "new";
  protected final String TEXT_984 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_985 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_986 = NL + "\t\t\tboolean old";
  protected final String TEXT_987 = "ESet = eVirtualIsSet(";
  protected final String TEXT_988 = ");";
  protected final String TEXT_989 = NL + "\t\t\tboolean old";
  protected final String TEXT_990 = "ESet = (";
  protected final String TEXT_991 = " & ";
  protected final String TEXT_992 = "_ESETFLAG) != 0;";
  protected final String TEXT_993 = NL + "\t\t\t";
  protected final String TEXT_994 = " |= ";
  protected final String TEXT_995 = "_ESETFLAG;";
  protected final String TEXT_996 = NL + "\t\t\tboolean old";
  protected final String TEXT_997 = "ESet = ";
  protected final String TEXT_998 = "ESet;";
  protected final String TEXT_999 = NL + "\t\t\t";
  protected final String TEXT_1000 = "ESet = true;";
  protected final String TEXT_1001 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1002 = "(this, ";
  protected final String TEXT_1003 = ".SET, ";
  protected final String TEXT_1004 = ", new";
  protected final String TEXT_1005 = ", new";
  protected final String TEXT_1006 = ", !old";
  protected final String TEXT_1007 = "ESet));";
  protected final String TEXT_1008 = NL + "\t\t}";
  protected final String TEXT_1009 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1010 = "(this, ";
  protected final String TEXT_1011 = ".SET, ";
  protected final String TEXT_1012 = ", new";
  protected final String TEXT_1013 = ", new";
  protected final String TEXT_1014 = "));";
  protected final String TEXT_1015 = NL + "\t\t";
  protected final String TEXT_1016 = " old";
  protected final String TEXT_1017 = " = (";
  protected final String TEXT_1018 = " & ";
  protected final String TEXT_1019 = "_EFLAG) != 0;";
  protected final String TEXT_1020 = NL + "\t\t";
  protected final String TEXT_1021 = " old";
  protected final String TEXT_1022 = " = ";
  protected final String TEXT_1023 = "_EFLAG_VALUES[(";
  protected final String TEXT_1024 = " & ";
  protected final String TEXT_1025 = "_EFLAG) >>> ";
  protected final String TEXT_1026 = "_EFLAG_OFFSET];";
  protected final String TEXT_1027 = NL + "\t\tif (new";
  protected final String TEXT_1028 = ") ";
  protected final String TEXT_1029 = " |= ";
  protected final String TEXT_1030 = "_EFLAG; else ";
  protected final String TEXT_1031 = " &= ~";
  protected final String TEXT_1032 = "_EFLAG;";
  protected final String TEXT_1033 = NL + "\t\tif (new";
  protected final String TEXT_1034 = " == null) new";
  protected final String TEXT_1035 = " = ";
  protected final String TEXT_1036 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_1037 = " = ";
  protected final String TEXT_1038 = " & ~";
  protected final String TEXT_1039 = "_EFLAG | ";
  protected final String TEXT_1040 = "new";
  protected final String TEXT_1041 = ".ordinal()";
  protected final String TEXT_1042 = ".VALUES.indexOf(new";
  protected final String TEXT_1043 = ")";
  protected final String TEXT_1044 = " << ";
  protected final String TEXT_1045 = "_EFLAG_OFFSET;";
  protected final String TEXT_1046 = NL + "\t\t";
  protected final String TEXT_1047 = " old";
  protected final String TEXT_1048 = " = ";
  protected final String TEXT_1049 = ";";
  protected final String TEXT_1050 = NL + "\t\t";
  protected final String TEXT_1051 = " ";
  protected final String TEXT_1052 = " = new";
  protected final String TEXT_1053 = " == null ? ";
  protected final String TEXT_1054 = " : new";
  protected final String TEXT_1055 = ";";
  protected final String TEXT_1056 = NL + "\t\t";
  protected final String TEXT_1057 = " = new";
  protected final String TEXT_1058 = " == null ? ";
  protected final String TEXT_1059 = " : new";
  protected final String TEXT_1060 = ";";
  protected final String TEXT_1061 = NL + "\t\t";
  protected final String TEXT_1062 = " ";
  protected final String TEXT_1063 = " = ";
  protected final String TEXT_1064 = "new";
  protected final String TEXT_1065 = ";";
  protected final String TEXT_1066 = NL + "\t\t";
  protected final String TEXT_1067 = " = ";
  protected final String TEXT_1068 = "new";
  protected final String TEXT_1069 = ";";
  protected final String TEXT_1070 = NL + "\t\tObject old";
  protected final String TEXT_1071 = " = eVirtualSet(";
  protected final String TEXT_1072 = ", ";
  protected final String TEXT_1073 = ");";
  protected final String TEXT_1074 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1075 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1076 = NL + "\t\tboolean old";
  protected final String TEXT_1077 = "ESet = (";
  protected final String TEXT_1078 = " & ";
  protected final String TEXT_1079 = "_ESETFLAG) != 0;";
  protected final String TEXT_1080 = NL + "\t\t";
  protected final String TEXT_1081 = " |= ";
  protected final String TEXT_1082 = "_ESETFLAG;";
  protected final String TEXT_1083 = NL + "\t\tboolean old";
  protected final String TEXT_1084 = "ESet = ";
  protected final String TEXT_1085 = "ESet;";
  protected final String TEXT_1086 = NL + "\t\t";
  protected final String TEXT_1087 = "ESet = true;";
  protected final String TEXT_1088 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1089 = "(this, ";
  protected final String TEXT_1090 = ".SET, ";
  protected final String TEXT_1091 = ", ";
  protected final String TEXT_1092 = "isSetChange ? ";
  protected final String TEXT_1093 = " : old";
  protected final String TEXT_1094 = "old";
  protected final String TEXT_1095 = ", ";
  protected final String TEXT_1096 = "new";
  protected final String TEXT_1097 = ", ";
  protected final String TEXT_1098 = "isSetChange";
  protected final String TEXT_1099 = "!old";
  protected final String TEXT_1100 = "ESet";
  protected final String TEXT_1101 = "));";
  protected final String TEXT_1102 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1103 = "(this, ";
  protected final String TEXT_1104 = ".SET, ";
  protected final String TEXT_1105 = ", ";
  protected final String TEXT_1106 = "old";
  protected final String TEXT_1107 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_1108 = " : old";
  protected final String TEXT_1109 = "old";
  protected final String TEXT_1110 = ", ";
  protected final String TEXT_1111 = "new";
  protected final String TEXT_1112 = "));";
  protected final String TEXT_1113 = NL + "\t\t";
  protected final String TEXT_1114 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_1115 = NL + "\t\t\t";
  protected final String TEXT_1116 = " ";
  protected final String TEXT_1117 = " = ";
  protected final String TEXT_1118 = "();";
  protected final String TEXT_1119 = NL + "\t\t\tObject ";
  protected final String TEXT_1120 = " = eVirtualGet(";
  protected final String TEXT_1121 = ");";
  protected final String TEXT_1122 = NL + "\t\t\tif (";
  protected final String TEXT_1123 = " != null && ";
  protected final String TEXT_1124 = " != new";
  protected final String TEXT_1125 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_1126 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_1127 = NL + "\t\t\tif (new";
  protected final String TEXT_1128 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_1129 = NL + "\t\t\t\t";
  protected final String TEXT_1130 = " ";
  protected final String TEXT_1131 = " = ";
  protected final String TEXT_1132 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_1133 = ".contains(new";
  protected final String TEXT_1134 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_1135 = ".add(new";
  protected final String TEXT_1136 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1137 = NL + "\t\t\t\t";
  protected final String TEXT_1138 = " ";
  protected final String TEXT_1139 = " = ";
  protected final String TEXT_1140 = "();";
  protected final String TEXT_1141 = NL + "\t\t\t\tObject ";
  protected final String TEXT_1142 = " = eVirtualGet(";
  protected final String TEXT_1143 = ");";
  protected final String TEXT_1144 = NL + "\t\t\t\tif (new";
  protected final String TEXT_1145 = " != ";
  protected final String TEXT_1146 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_1147 = "(new";
  protected final String TEXT_1148 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1149 = NL + "\t\t\t}";
  protected final String TEXT_1150 = NL + "\t\t}";
  protected final String TEXT_1151 = NL + "\t\t((";
  protected final String TEXT_1152 = ".Internal)((";
  protected final String TEXT_1153 = ".Internal.Wrapper)get";
  protected final String TEXT_1154 = "()).featureMap()).set(";
  protected final String TEXT_1155 = ", ";
  protected final String TEXT_1156 = "new ";
  protected final String TEXT_1157 = "(";
  protected final String TEXT_1158 = "new";
  protected final String TEXT_1159 = ")";
  protected final String TEXT_1160 = ");";
  protected final String TEXT_1161 = NL + "\t\t((";
  protected final String TEXT_1162 = ".Internal)get";
  protected final String TEXT_1163 = "()).set(";
  protected final String TEXT_1164 = ", ";
  protected final String TEXT_1165 = "new ";
  protected final String TEXT_1166 = "(";
  protected final String TEXT_1167 = "new";
  protected final String TEXT_1168 = ")";
  protected final String TEXT_1169 = ");";
  protected final String TEXT_1170 = NL + "\t\t";
  protected final String TEXT_1171 = NL + "\t\t";
  protected final String TEXT_1172 = ".";
  protected final String TEXT_1173 = "(this, ";
  protected final String TEXT_1174 = ");";
  protected final String TEXT_1175 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_1176 = "' ";
  protected final String TEXT_1177 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1178 = NL + "\t}" + NL;
  protected final String TEXT_1179 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1180 = NL + "\t@Override";
  protected final String TEXT_1181 = NL + "\tpublic ";
  protected final String TEXT_1182 = " basicUnset";
  protected final String TEXT_1183 = "(";
  protected final String TEXT_1184 = " msgs)" + NL + "\t{";
  protected final String TEXT_1185 = NL + "\t\treturn eDynamicInverseRemove((";
  protected final String TEXT_1186 = ")";
  protected final String TEXT_1187 = "basicGet";
  protected final String TEXT_1188 = "(), ";
  protected final String TEXT_1189 = ", msgs);";
  protected final String TEXT_1190 = "Object old";
  protected final String TEXT_1191 = " = ";
  protected final String TEXT_1192 = "eVirtualUnset(";
  protected final String TEXT_1193 = ");";
  protected final String TEXT_1194 = NL + "\t\t";
  protected final String TEXT_1195 = " old";
  protected final String TEXT_1196 = " = ";
  protected final String TEXT_1197 = ";";
  protected final String TEXT_1198 = NL + "\t\t";
  protected final String TEXT_1199 = " = null;";
  protected final String TEXT_1200 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1201 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1202 = NL + "\t\tboolean old";
  protected final String TEXT_1203 = "ESet = (";
  protected final String TEXT_1204 = " & ";
  protected final String TEXT_1205 = "_ESETFLAG) != 0;";
  protected final String TEXT_1206 = NL + "\t\t";
  protected final String TEXT_1207 = " &= ~";
  protected final String TEXT_1208 = "_ESETFLAG;";
  protected final String TEXT_1209 = NL + "\t\tboolean old";
  protected final String TEXT_1210 = "ESet = ";
  protected final String TEXT_1211 = "ESet;";
  protected final String TEXT_1212 = NL + "\t\t";
  protected final String TEXT_1213 = "ESet = false;";
  protected final String TEXT_1214 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1215 = " notification = new ";
  protected final String TEXT_1216 = "(this, ";
  protected final String TEXT_1217 = ".UNSET, ";
  protected final String TEXT_1218 = ", ";
  protected final String TEXT_1219 = "isSetChange ? old";
  protected final String TEXT_1220 = " : null";
  protected final String TEXT_1221 = "old";
  protected final String TEXT_1222 = ", null, ";
  protected final String TEXT_1223 = "isSetChange";
  protected final String TEXT_1224 = "old";
  protected final String TEXT_1225 = "ESet";
  protected final String TEXT_1226 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1227 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1228 = "' ";
  protected final String TEXT_1229 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1230 = NL + "\t}" + NL;
  protected final String TEXT_1231 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1232 = "#";
  protected final String TEXT_1233 = " <em>";
  protected final String TEXT_1234 = "</em>}' ";
  protected final String TEXT_1235 = ".";
  protected final String TEXT_1236 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1237 = NL + "\t * @see #isSet";
  protected final String TEXT_1238 = "()";
  protected final String TEXT_1239 = NL + "\t * @see #";
  protected final String TEXT_1240 = "()";
  protected final String TEXT_1241 = NL + "\t * @see #set";
  protected final String TEXT_1242 = "(";
  protected final String TEXT_1243 = ")";
  protected final String TEXT_1244 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1245 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1246 = NL + "\t@Override";
  protected final String TEXT_1247 = NL + "\tvoid unset";
  protected final String TEXT_1248 = "();" + NL;
  protected final String TEXT_1249 = NL + "\tpublic void unset";
  protected final String TEXT_1250 = "_";
  protected final String TEXT_1251 = "()" + NL + "\t{";
  protected final String TEXT_1252 = NL + "\t\teDynamicUnset(";
  protected final String TEXT_1253 = ", ";
  protected final String TEXT_1254 = ");";
  protected final String TEXT_1255 = NL + "\t\teUnset(";
  protected final String TEXT_1256 = ");";
  protected final String TEXT_1257 = NL + "\t\t";
  protected final String TEXT_1258 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_1259 = NL + "\t\t";
  protected final String TEXT_1260 = " ";
  protected final String TEXT_1261 = " = (";
  protected final String TEXT_1262 = ")eVirtualGet(";
  protected final String TEXT_1263 = ");";
  protected final String TEXT_1264 = NL + "\t\tif (";
  protected final String TEXT_1265 = " != null) ((";
  protected final String TEXT_1266 = ".Unsettable";
  protected final String TEXT_1267 = ")";
  protected final String TEXT_1268 = ").unset();";
  protected final String TEXT_1269 = NL + "\t\t";
  protected final String TEXT_1270 = " ";
  protected final String TEXT_1271 = " = (";
  protected final String TEXT_1272 = ")eVirtualGet(";
  protected final String TEXT_1273 = ");";
  protected final String TEXT_1274 = NL + "\t\tif (";
  protected final String TEXT_1275 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1276 = " msgs = null;";
  protected final String TEXT_1277 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1278 = ")";
  protected final String TEXT_1279 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1280 = ", null, msgs);";
  protected final String TEXT_1281 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1282 = ")";
  protected final String TEXT_1283 = ").eInverseRemove(this, ";
  protected final String TEXT_1284 = ", ";
  protected final String TEXT_1285 = ".class, msgs);";
  protected final String TEXT_1286 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1287 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1288 = NL + "\t\t\tboolean old";
  protected final String TEXT_1289 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1290 = ");";
  protected final String TEXT_1291 = NL + "\t\t\tboolean old";
  protected final String TEXT_1292 = "ESet = (";
  protected final String TEXT_1293 = " & ";
  protected final String TEXT_1294 = "_ESETFLAG) != 0;";
  protected final String TEXT_1295 = NL + "\t\t\t";
  protected final String TEXT_1296 = " &= ~";
  protected final String TEXT_1297 = "_ESETFLAG;";
  protected final String TEXT_1298 = NL + "\t\t\tboolean old";
  protected final String TEXT_1299 = "ESet = ";
  protected final String TEXT_1300 = "ESet;";
  protected final String TEXT_1301 = NL + "\t\t\t";
  protected final String TEXT_1302 = "ESet = false;";
  protected final String TEXT_1303 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1304 = "(this, ";
  protected final String TEXT_1305 = ".UNSET, ";
  protected final String TEXT_1306 = ", null, null, old";
  protected final String TEXT_1307 = "ESet));";
  protected final String TEXT_1308 = NL + "\t\t}";
  protected final String TEXT_1309 = NL + "\t\t";
  protected final String TEXT_1310 = " old";
  protected final String TEXT_1311 = " = (";
  protected final String TEXT_1312 = " & ";
  protected final String TEXT_1313 = "_EFLAG) != 0;";
  protected final String TEXT_1314 = NL + "\t\t";
  protected final String TEXT_1315 = " old";
  protected final String TEXT_1316 = " = ";
  protected final String TEXT_1317 = "_EFLAG_VALUES[(";
  protected final String TEXT_1318 = " & ";
  protected final String TEXT_1319 = "_EFLAG) >>> ";
  protected final String TEXT_1320 = "_EFLAG_OFFSET];";
  protected final String TEXT_1321 = NL + "\t\tObject old";
  protected final String TEXT_1322 = " = eVirtualUnset(";
  protected final String TEXT_1323 = ");";
  protected final String TEXT_1324 = NL + "\t\t";
  protected final String TEXT_1325 = " old";
  protected final String TEXT_1326 = " = ";
  protected final String TEXT_1327 = ";";
  protected final String TEXT_1328 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1329 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1330 = NL + "\t\tboolean old";
  protected final String TEXT_1331 = "ESet = (";
  protected final String TEXT_1332 = " & ";
  protected final String TEXT_1333 = "_ESETFLAG) != 0;";
  protected final String TEXT_1334 = NL + "\t\tboolean old";
  protected final String TEXT_1335 = "ESet = ";
  protected final String TEXT_1336 = "ESet;";
  protected final String TEXT_1337 = NL + "\t\t";
  protected final String TEXT_1338 = " = null;";
  protected final String TEXT_1339 = NL + "\t\t";
  protected final String TEXT_1340 = " &= ~";
  protected final String TEXT_1341 = "_ESETFLAG;";
  protected final String TEXT_1342 = NL + "\t\t";
  protected final String TEXT_1343 = "ESet = false;";
  protected final String TEXT_1344 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1345 = "(this, ";
  protected final String TEXT_1346 = ".UNSET, ";
  protected final String TEXT_1347 = ", ";
  protected final String TEXT_1348 = "isSetChange ? old";
  protected final String TEXT_1349 = " : null";
  protected final String TEXT_1350 = "old";
  protected final String TEXT_1351 = ", null, ";
  protected final String TEXT_1352 = "isSetChange";
  protected final String TEXT_1353 = "old";
  protected final String TEXT_1354 = "ESet";
  protected final String TEXT_1355 = "));";
  protected final String TEXT_1356 = NL + "\t\tif (";
  protected final String TEXT_1357 = ") ";
  protected final String TEXT_1358 = " |= ";
  protected final String TEXT_1359 = "_EFLAG; else ";
  protected final String TEXT_1360 = " &= ~";
  protected final String TEXT_1361 = "_EFLAG;";
  protected final String TEXT_1362 = NL + "\t\t";
  protected final String TEXT_1363 = " = ";
  protected final String TEXT_1364 = " & ~";
  protected final String TEXT_1365 = "_EFLAG | ";
  protected final String TEXT_1366 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1367 = NL + "\t\t";
  protected final String TEXT_1368 = " = ";
  protected final String TEXT_1369 = ";";
  protected final String TEXT_1370 = NL + "\t\t";
  protected final String TEXT_1371 = " &= ~";
  protected final String TEXT_1372 = "_ESETFLAG;";
  protected final String TEXT_1373 = NL + "\t\t";
  protected final String TEXT_1374 = "ESet = false;";
  protected final String TEXT_1375 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1376 = "(this, ";
  protected final String TEXT_1377 = ".UNSET, ";
  protected final String TEXT_1378 = ", ";
  protected final String TEXT_1379 = "isSetChange ? old";
  protected final String TEXT_1380 = " : ";
  protected final String TEXT_1381 = "old";
  protected final String TEXT_1382 = ", ";
  protected final String TEXT_1383 = ", ";
  protected final String TEXT_1384 = "isSetChange";
  protected final String TEXT_1385 = "old";
  protected final String TEXT_1386 = "ESet";
  protected final String TEXT_1387 = "));";
  protected final String TEXT_1388 = NL + "\t\t((";
  protected final String TEXT_1389 = ".Internal)((";
  protected final String TEXT_1390 = ".Internal.Wrapper)get";
  protected final String TEXT_1391 = "()).featureMap()).clear(";
  protected final String TEXT_1392 = ");";
  protected final String TEXT_1393 = NL + "\t\t((";
  protected final String TEXT_1394 = ".Internal)get";
  protected final String TEXT_1395 = "()).clear(";
  protected final String TEXT_1396 = ");";
  protected final String TEXT_1397 = NL + "\t\t";
  protected final String TEXT_1398 = NL + "\t\t";
  protected final String TEXT_1399 = ".";
  protected final String TEXT_1400 = "(this);";
  protected final String TEXT_1401 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1402 = "' ";
  protected final String TEXT_1403 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1404 = NL + "\t}" + NL;
  protected final String TEXT_1405 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1406 = "#";
  protected final String TEXT_1407 = " <em>";
  protected final String TEXT_1408 = "</em>}' ";
  protected final String TEXT_1409 = " is set.";
  protected final String TEXT_1410 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1411 = "</em>' ";
  protected final String TEXT_1412 = " is set.";
  protected final String TEXT_1413 = NL + "\t * @see #unset";
  protected final String TEXT_1414 = "()";
  protected final String TEXT_1415 = NL + "\t * @see #";
  protected final String TEXT_1416 = "()";
  protected final String TEXT_1417 = NL + "\t * @see #set";
  protected final String TEXT_1418 = "(";
  protected final String TEXT_1419 = ")";
  protected final String TEXT_1420 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1421 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1422 = NL + "\t@Override";
  protected final String TEXT_1423 = NL + "\tboolean isSet";
  protected final String TEXT_1424 = "();" + NL;
  protected final String TEXT_1425 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1426 = "_";
  protected final String TEXT_1427 = "()" + NL + "\t{";
  protected final String TEXT_1428 = NL + "\t\treturn eDynamicIsSet(";
  protected final String TEXT_1429 = ", ";
  protected final String TEXT_1430 = ");";
  protected final String TEXT_1431 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1432 = ");";
  protected final String TEXT_1433 = NL + "\t\treturn ";
  protected final String TEXT_1434 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_1435 = NL + "\t\t";
  protected final String TEXT_1436 = " ";
  protected final String TEXT_1437 = " = (";
  protected final String TEXT_1438 = ")eVirtualGet(";
  protected final String TEXT_1439 = ");";
  protected final String TEXT_1440 = NL + "\t\treturn ";
  protected final String TEXT_1441 = " != null && ((";
  protected final String TEXT_1442 = ".Unsettable";
  protected final String TEXT_1443 = ")";
  protected final String TEXT_1444 = ").isSet();";
  protected final String TEXT_1445 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1446 = ");";
  protected final String TEXT_1447 = NL + "\t\treturn (";
  protected final String TEXT_1448 = " & ";
  protected final String TEXT_1449 = "_ESETFLAG) != 0;";
  protected final String TEXT_1450 = NL + "\t\treturn ";
  protected final String TEXT_1451 = "ESet;";
  protected final String TEXT_1452 = NL + "\t\treturn !((";
  protected final String TEXT_1453 = ".Internal)((";
  protected final String TEXT_1454 = ".Internal.Wrapper)get";
  protected final String TEXT_1455 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1456 = ");";
  protected final String TEXT_1457 = NL + "\t\treturn !((";
  protected final String TEXT_1458 = ".Internal)get";
  protected final String TEXT_1459 = "()).isEmpty(";
  protected final String TEXT_1460 = ");";
  protected final String TEXT_1461 = NL + "\t\t";
  protected final String TEXT_1462 = NL + "\t\treturn ";
  protected final String TEXT_1463 = ".";
  protected final String TEXT_1464 = "(this);";
  protected final String TEXT_1465 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1466 = "' ";
  protected final String TEXT_1467 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1468 = NL + "\t}" + NL;
  protected final String TEXT_1469 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1470 = "() <em>";
  protected final String TEXT_1471 = "</em>}' ";
  protected final String TEXT_1472 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1473 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1474 = "_ESUBSETS = ";
  protected final String TEXT_1475 = ";" + NL;
  protected final String TEXT_1476 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1477 = "() <em>";
  protected final String TEXT_1478 = "</em>}' ";
  protected final String TEXT_1479 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1480 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1481 = "_ESUPERSETS = ";
  protected final String TEXT_1482 = ";" + NL;
  protected final String TEXT_1483 = NL + "\t/**";
  protected final String TEXT_1484 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1485 = "}, with the specified ";
  protected final String TEXT_1486 = ", and appends it to the '<em><b>";
  protected final String TEXT_1487 = "</b></em>' ";
  protected final String TEXT_1488 = ".";
  protected final String TEXT_1489 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1490 = "}, with the specified ";
  protected final String TEXT_1491 = ", and sets the '<em><b>";
  protected final String TEXT_1492 = "</b></em>' ";
  protected final String TEXT_1493 = ".";
  protected final String TEXT_1494 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1495 = "} and appends it to the '<em><b>";
  protected final String TEXT_1496 = "</b></em>' ";
  protected final String TEXT_1497 = ".";
  protected final String TEXT_1498 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1499 = "} and sets the '<em><b>";
  protected final String TEXT_1500 = "</b></em>' ";
  protected final String TEXT_1501 = ".";
  protected final String TEXT_1502 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1503 = NL + "\t * @param ";
  protected final String TEXT_1504 = " The ";
  protected final String TEXT_1505 = " for the new {@link ";
  protected final String TEXT_1506 = "}, or <code>null</code>.";
  protected final String TEXT_1507 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1508 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1509 = "}." + NL + "\t * @see #";
  protected final String TEXT_1510 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1511 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1512 = NL + "\t";
  protected final String TEXT_1513 = " create";
  protected final String TEXT_1514 = "(";
  protected final String TEXT_1515 = ", ";
  protected final String TEXT_1516 = " eClass);" + NL;
  protected final String TEXT_1517 = NL + "\t@Override";
  protected final String TEXT_1518 = NL + "\tpublic ";
  protected final String TEXT_1519 = " create";
  protected final String TEXT_1520 = "(";
  protected final String TEXT_1521 = ", ";
  protected final String TEXT_1522 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1523 = " new";
  protected final String TEXT_1524 = " = (";
  protected final String TEXT_1525 = ") create(eClass);";
  protected final String TEXT_1526 = NL + "\t\t";
  protected final String TEXT_1527 = "().add(new";
  protected final String TEXT_1528 = ");";
  protected final String TEXT_1529 = NL + "\t\tset";
  protected final String TEXT_1530 = "(new";
  protected final String TEXT_1531 = ");";
  protected final String TEXT_1532 = NL + "\t\tint ";
  protected final String TEXT_1533 = "ListSize = 0;";
  protected final String TEXT_1534 = NL + "\t\tint ";
  protected final String TEXT_1535 = "Size = ";
  protected final String TEXT_1536 = " == null ? 0 : ";
  protected final String TEXT_1537 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1538 = "Size > ";
  protected final String TEXT_1539 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1540 = "ListSize = ";
  protected final String TEXT_1541 = "Size;";
  protected final String TEXT_1542 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1543 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1544 = ".create";
  protected final String TEXT_1545 = "(";
  protected final String TEXT_1546 = ", ";
  protected final String TEXT_1547 = "i < ";
  protected final String TEXT_1548 = "Size ? (";
  protected final String TEXT_1549 = ") ";
  protected final String TEXT_1550 = ".get(i) : null";
  protected final String TEXT_1551 = ");" + NL + "\t\t}";
  protected final String TEXT_1552 = NL + "\t\tnew";
  protected final String TEXT_1553 = ".create";
  protected final String TEXT_1554 = "(";
  protected final String TEXT_1555 = ", ";
  protected final String TEXT_1556 = ");";
  protected final String TEXT_1557 = NL + "\t\tif (";
  protected final String TEXT_1558 = " != null)";
  protected final String TEXT_1559 = NL + "\t\t\tnew";
  protected final String TEXT_1560 = ".";
  protected final String TEXT_1561 = "().addAll(";
  protected final String TEXT_1562 = ");";
  protected final String TEXT_1563 = NL + "\t\t\tnew";
  protected final String TEXT_1564 = ".set";
  protected final String TEXT_1565 = "(";
  protected final String TEXT_1566 = ");";
  protected final String TEXT_1567 = NL + "\t\treturn new";
  protected final String TEXT_1568 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1569 = NL + "\t/**";
  protected final String TEXT_1570 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1571 = "}, with the specified ";
  protected final String TEXT_1572 = ", and appends it to the '<em><b>";
  protected final String TEXT_1573 = "</b></em>' ";
  protected final String TEXT_1574 = ".";
  protected final String TEXT_1575 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1576 = "},with the specified ";
  protected final String TEXT_1577 = ", and sets the '<em><b>";
  protected final String TEXT_1578 = "</b></em>' ";
  protected final String TEXT_1579 = ".";
  protected final String TEXT_1580 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1581 = "} and appends it to the '<em><b>";
  protected final String TEXT_1582 = "</b></em>' ";
  protected final String TEXT_1583 = ".";
  protected final String TEXT_1584 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1585 = "} and sets the '<em><b>";
  protected final String TEXT_1586 = "</b></em>' ";
  protected final String TEXT_1587 = ".";
  protected final String TEXT_1588 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1589 = NL + "\t * @param ";
  protected final String TEXT_1590 = " The ";
  protected final String TEXT_1591 = " for the new {@link ";
  protected final String TEXT_1592 = "}, or <code>null</code>.";
  protected final String TEXT_1593 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1594 = "}." + NL + "\t * @see #";
  protected final String TEXT_1595 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1596 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1597 = NL + "\t";
  protected final String TEXT_1598 = " create";
  protected final String TEXT_1599 = "(";
  protected final String TEXT_1600 = ");" + NL;
  protected final String TEXT_1601 = NL + "\t@Override";
  protected final String TEXT_1602 = NL + "\tpublic ";
  protected final String TEXT_1603 = " create";
  protected final String TEXT_1604 = "(";
  protected final String TEXT_1605 = ")" + NL + "\t{";
  protected final String TEXT_1606 = NL + "\t\treturn create";
  protected final String TEXT_1607 = "(";
  protected final String TEXT_1608 = ", ";
  protected final String TEXT_1609 = ");";
  protected final String TEXT_1610 = NL + "\t\t";
  protected final String TEXT_1611 = " new";
  protected final String TEXT_1612 = " = (";
  protected final String TEXT_1613 = ") create(";
  protected final String TEXT_1614 = ");";
  protected final String TEXT_1615 = NL + "\t\t";
  protected final String TEXT_1616 = "().add(new";
  protected final String TEXT_1617 = ");";
  protected final String TEXT_1618 = NL + "\t\tset";
  protected final String TEXT_1619 = "(new";
  protected final String TEXT_1620 = ");";
  protected final String TEXT_1621 = NL + "\t\tint ";
  protected final String TEXT_1622 = "ListSize = 0;";
  protected final String TEXT_1623 = NL + "\t\tint ";
  protected final String TEXT_1624 = "Size = ";
  protected final String TEXT_1625 = " == null ? 0 : ";
  protected final String TEXT_1626 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1627 = "Size > ";
  protected final String TEXT_1628 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1629 = "ListSize = ";
  protected final String TEXT_1630 = "Size;";
  protected final String TEXT_1631 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1632 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1633 = ".create";
  protected final String TEXT_1634 = "(";
  protected final String TEXT_1635 = ", ";
  protected final String TEXT_1636 = "i < ";
  protected final String TEXT_1637 = "Size ? (";
  protected final String TEXT_1638 = ") ";
  protected final String TEXT_1639 = ".get(i) : null";
  protected final String TEXT_1640 = ");" + NL + "\t\t}";
  protected final String TEXT_1641 = NL + "\t\tnew";
  protected final String TEXT_1642 = ".create";
  protected final String TEXT_1643 = "(";
  protected final String TEXT_1644 = ", ";
  protected final String TEXT_1645 = ");";
  protected final String TEXT_1646 = NL + "\t\tif (";
  protected final String TEXT_1647 = " != null)";
  protected final String TEXT_1648 = NL + "\t\t\tnew";
  protected final String TEXT_1649 = ".";
  protected final String TEXT_1650 = "().addAll(";
  protected final String TEXT_1651 = ");";
  protected final String TEXT_1652 = NL + "\t\t\tnew";
  protected final String TEXT_1653 = ".set";
  protected final String TEXT_1654 = "(";
  protected final String TEXT_1655 = ");";
  protected final String TEXT_1656 = NL + "\t\treturn new";
  protected final String TEXT_1657 = ";";
  protected final String TEXT_1658 = NL + "\t}" + NL;
  protected final String TEXT_1659 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1660 = "} with the specified ";
  protected final String TEXT_1661 = " from the '<em><b>";
  protected final String TEXT_1662 = "</b></em>' ";
  protected final String TEXT_1663 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1664 = NL + "\t * @param ";
  protected final String TEXT_1665 = " The ";
  protected final String TEXT_1666 = " of the {@link ";
  protected final String TEXT_1667 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1668 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1669 = "} with the specified ";
  protected final String TEXT_1670 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1671 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1672 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1673 = NL + "\t";
  protected final String TEXT_1674 = " get";
  protected final String TEXT_1675 = "(";
  protected final String TEXT_1676 = ");" + NL;
  protected final String TEXT_1677 = NL + "\t@Override";
  protected final String TEXT_1678 = NL + "\tpublic ";
  protected final String TEXT_1679 = " get";
  protected final String TEXT_1680 = "(";
  protected final String TEXT_1681 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1682 = "(";
  protected final String TEXT_1683 = ", false";
  protected final String TEXT_1684 = ", null";
  protected final String TEXT_1685 = ", false";
  protected final String TEXT_1686 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1687 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1688 = "} with the specified ";
  protected final String TEXT_1689 = " from the '<em><b>";
  protected final String TEXT_1690 = "</b></em>' ";
  protected final String TEXT_1691 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1692 = NL + "\t * @param ";
  protected final String TEXT_1693 = " The ";
  protected final String TEXT_1694 = " of the {@link ";
  protected final String TEXT_1695 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1696 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1697 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1698 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1699 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1700 = "} on demand if not found.";
  protected final String TEXT_1701 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1702 = "} with the specified ";
  protected final String TEXT_1703 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1704 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1705 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1706 = NL + "\t";
  protected final String TEXT_1707 = " get";
  protected final String TEXT_1708 = "(";
  protected final String TEXT_1709 = ", boolean ignoreCase";
  protected final String TEXT_1710 = ", ";
  protected final String TEXT_1711 = " eClass";
  protected final String TEXT_1712 = ", boolean createOnDemand";
  protected final String TEXT_1713 = ");" + NL;
  protected final String TEXT_1714 = NL + "\t@Override";
  protected final String TEXT_1715 = NL + "\tpublic ";
  protected final String TEXT_1716 = " get";
  protected final String TEXT_1717 = "(";
  protected final String TEXT_1718 = ", boolean ignoreCase";
  protected final String TEXT_1719 = ", ";
  protected final String TEXT_1720 = " eClass";
  protected final String TEXT_1721 = ", boolean createOnDemand";
  protected final String TEXT_1722 = ")" + NL + "\t{";
  protected final String TEXT_1723 = NL + "\t\t";
  protected final String TEXT_1724 = "Loop: for (";
  protected final String TEXT_1725 = " ";
  protected final String TEXT_1726 = " : ";
  protected final String TEXT_1727 = "())" + NL + "\t\t{";
  protected final String TEXT_1728 = NL + "\t\t";
  protected final String TEXT_1729 = "Loop: for (";
  protected final String TEXT_1730 = " i = ";
  protected final String TEXT_1731 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1732 = " ";
  protected final String TEXT_1733 = " = (";
  protected final String TEXT_1734 = ") i.next();";
  protected final String TEXT_1735 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1736 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1737 = "Loop;";
  protected final String TEXT_1738 = NL + "\t\t\t";
  protected final String TEXT_1739 = " ";
  protected final String TEXT_1740 = "List = ";
  protected final String TEXT_1741 = ".";
  protected final String TEXT_1742 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1743 = "ListSize = ";
  protected final String TEXT_1744 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1745 = " || (";
  protected final String TEXT_1746 = " != null && ";
  protected final String TEXT_1747 = ".size() != ";
  protected final String TEXT_1748 = "ListSize";
  protected final String TEXT_1749 = ")";
  protected final String TEXT_1750 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1751 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1752 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1753 = " ";
  protected final String TEXT_1754 = " = ";
  protected final String TEXT_1755 = "(";
  protected final String TEXT_1756 = ") ";
  protected final String TEXT_1757 = "List.get(j);";
  protected final String TEXT_1758 = NL + "\t\t\t\tif (";
  protected final String TEXT_1759 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1760 = "(";
  protected final String TEXT_1761 = ")";
  protected final String TEXT_1762 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1763 = ".";
  protected final String TEXT_1764 = "()) : ";
  protected final String TEXT_1765 = ".get(j).equals(";
  protected final String TEXT_1766 = ".";
  protected final String TEXT_1767 = "())))";
  protected final String TEXT_1768 = NL + "\t\t\t\tif (";
  protected final String TEXT_1769 = " != null && !";
  protected final String TEXT_1770 = ".get(j).equals(";
  protected final String TEXT_1771 = ".";
  protected final String TEXT_1772 = "()))";
  protected final String TEXT_1773 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1774 = "Loop;";
  protected final String TEXT_1775 = NL + "\t\t\t}";
  protected final String TEXT_1776 = NL + "\t\t\t";
  protected final String TEXT_1777 = " ";
  protected final String TEXT_1778 = " = ";
  protected final String TEXT_1779 = ".";
  protected final String TEXT_1780 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1781 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1782 = "Loop;";
  protected final String TEXT_1783 = NL + "\t\t\tif (";
  protected final String TEXT_1784 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1785 = ".equalsIgnoreCase(";
  protected final String TEXT_1786 = ".";
  protected final String TEXT_1787 = "()) : ";
  protected final String TEXT_1788 = ".equals(";
  protected final String TEXT_1789 = ".";
  protected final String TEXT_1790 = "())))";
  protected final String TEXT_1791 = NL + "\t\t\tif (";
  protected final String TEXT_1792 = " != null && !";
  protected final String TEXT_1793 = ".equals(";
  protected final String TEXT_1794 = ".";
  protected final String TEXT_1795 = "()))";
  protected final String TEXT_1796 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1797 = "Loop;";
  protected final String TEXT_1798 = NL + "\t\t\tif (";
  protected final String TEXT_1799 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1800 = ".equalsIgnoreCase(";
  protected final String TEXT_1801 = ".";
  protected final String TEXT_1802 = "()) : ";
  protected final String TEXT_1803 = ".equals(";
  protected final String TEXT_1804 = ".";
  protected final String TEXT_1805 = "())))";
  protected final String TEXT_1806 = NL + "\t\t\tif (";
  protected final String TEXT_1807 = " != null && !";
  protected final String TEXT_1808 = ".equals(";
  protected final String TEXT_1809 = ".";
  protected final String TEXT_1810 = "()))";
  protected final String TEXT_1811 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1812 = "Loop;";
  protected final String TEXT_1813 = NL + "\t\t\treturn ";
  protected final String TEXT_1814 = ";" + NL + "\t\t}";
  protected final String TEXT_1815 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1816 = " && eClass != null";
  protected final String TEXT_1817 = " ? create";
  protected final String TEXT_1818 = "(";
  protected final String TEXT_1819 = ", eClass";
  protected final String TEXT_1820 = ") : null;";
  protected final String TEXT_1821 = NL + "\t\treturn null;";
  protected final String TEXT_1822 = NL + "\t}" + NL;
  protected final String TEXT_1823 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1824 = "()" + NL + "\t{";
  protected final String TEXT_1825 = NL + "  \t\treturn false;";
  protected final String TEXT_1826 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1827 = ");";
  protected final String TEXT_1828 = NL + "\t\treturn !((";
  protected final String TEXT_1829 = ".Internal.Wrapper)";
  protected final String TEXT_1830 = "()).featureMap().isEmpty();";
  protected final String TEXT_1831 = NL + "\t\treturn ";
  protected final String TEXT_1832 = " != null && !";
  protected final String TEXT_1833 = ".featureMap().isEmpty();";
  protected final String TEXT_1834 = NL + "\t\treturn ";
  protected final String TEXT_1835 = " != null && !";
  protected final String TEXT_1836 = ".isEmpty();";
  protected final String TEXT_1837 = NL + "\t\t";
  protected final String TEXT_1838 = " ";
  protected final String TEXT_1839 = " = (";
  protected final String TEXT_1840 = ")eVirtualGet(";
  protected final String TEXT_1841 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1842 = " != null && !";
  protected final String TEXT_1843 = ".isEmpty();";
  protected final String TEXT_1844 = NL + "\t\treturn !";
  protected final String TEXT_1845 = "().isEmpty();";
  protected final String TEXT_1846 = NL + "\t\treturn ";
  protected final String TEXT_1847 = " != null;";
  protected final String TEXT_1848 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1849 = ") != null;";
  protected final String TEXT_1850 = NL + "\t\treturn basicGet";
  protected final String TEXT_1851 = "() != null;";
  protected final String TEXT_1852 = NL + "\t\treturn ";
  protected final String TEXT_1853 = " != null;";
  protected final String TEXT_1854 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1855 = ") != null;";
  protected final String TEXT_1856 = NL + "\t\treturn ";
  protected final String TEXT_1857 = "() != null;";
  protected final String TEXT_1858 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1859 = " & ";
  protected final String TEXT_1860 = "_EFLAG) != 0) != ";
  protected final String TEXT_1861 = ";";
  protected final String TEXT_1862 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1863 = " & ";
  protected final String TEXT_1864 = "_EFLAG) != ";
  protected final String TEXT_1865 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1866 = NL + "\t\treturn ";
  protected final String TEXT_1867 = " != ";
  protected final String TEXT_1868 = ";";
  protected final String TEXT_1869 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1870 = ", ";
  protected final String TEXT_1871 = ") != ";
  protected final String TEXT_1872 = ";";
  protected final String TEXT_1873 = NL + "\t\treturn ";
  protected final String TEXT_1874 = "() != ";
  protected final String TEXT_1875 = ";";
  protected final String TEXT_1876 = NL + "\t\treturn ";
  protected final String TEXT_1877 = " == null ? ";
  protected final String TEXT_1878 = " != null : !";
  protected final String TEXT_1879 = ".equals(";
  protected final String TEXT_1880 = ");";
  protected final String TEXT_1881 = NL + "\t\t";
  protected final String TEXT_1882 = " ";
  protected final String TEXT_1883 = " = (";
  protected final String TEXT_1884 = ")eVirtualGet(";
  protected final String TEXT_1885 = ", ";
  protected final String TEXT_1886 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1887 = " == null ? ";
  protected final String TEXT_1888 = " != null : !";
  protected final String TEXT_1889 = ".equals(";
  protected final String TEXT_1890 = ");";
  protected final String TEXT_1891 = NL + "\t\treturn ";
  protected final String TEXT_1892 = " == null ? ";
  protected final String TEXT_1893 = "() != null : !";
  protected final String TEXT_1894 = ".equals(";
  protected final String TEXT_1895 = "());";
  protected final String TEXT_1896 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1897 = ");";
  protected final String TEXT_1898 = NL + "\t\t";
  protected final String TEXT_1899 = " ";
  protected final String TEXT_1900 = " = (";
  protected final String TEXT_1901 = ")eVirtualGet(";
  protected final String TEXT_1902 = ");";
  protected final String TEXT_1903 = NL + "\t\treturn ";
  protected final String TEXT_1904 = " != null && ((";
  protected final String TEXT_1905 = ".Unsettable";
  protected final String TEXT_1906 = ")";
  protected final String TEXT_1907 = ").isSet();";
  protected final String TEXT_1908 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1909 = ");";
  protected final String TEXT_1910 = NL + "\t\treturn (";
  protected final String TEXT_1911 = " & ";
  protected final String TEXT_1912 = "_ESETFLAG) != 0;";
  protected final String TEXT_1913 = NL + "\t\treturn ";
  protected final String TEXT_1914 = "ESet;";
  protected final String TEXT_1915 = NL + "\t\treturn !((";
  protected final String TEXT_1916 = ".Internal)((";
  protected final String TEXT_1917 = ".Internal.Wrapper)get";
  protected final String TEXT_1918 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1919 = ");";
  protected final String TEXT_1920 = NL + "\t\treturn !((";
  protected final String TEXT_1921 = ".Internal)get";
  protected final String TEXT_1922 = "()).isEmpty(";
  protected final String TEXT_1923 = ");";
  protected final String TEXT_1924 = NL + "\t\treturn ";
  protected final String TEXT_1925 = ".";
  protected final String TEXT_1926 = "(this);";
  protected final String TEXT_1927 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1928 = "' ";
  protected final String TEXT_1929 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1930 = NL + "\t}" + NL;
  protected final String TEXT_1931 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_1932 = "(";
  protected final String TEXT_1933 = ") <em>";
  protected final String TEXT_1934 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1935 = "(";
  protected final String TEXT_1936 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1937 = " ";
  protected final String TEXT_1938 = "__EOCL_EXP = \"";
  protected final String TEXT_1939 = "\";";
  protected final String TEXT_1940 = NL;
  protected final String TEXT_1941 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_1942 = "(";
  protected final String TEXT_1943 = ") <em>";
  protected final String TEXT_1944 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1945 = "(";
  protected final String TEXT_1946 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1947 = " ";
  protected final String TEXT_1948 = "__EOCL_INV;" + NL;
  protected final String TEXT_1949 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_1950 = "(";
  protected final String TEXT_1951 = ") <em>";
  protected final String TEXT_1952 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1953 = "(";
  protected final String TEXT_1954 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1955 = "<";
  protected final String TEXT_1956 = ">";
  protected final String TEXT_1957 = " ";
  protected final String TEXT_1958 = "__EOCL_QRY;" + NL;
  protected final String TEXT_1959 = NL + "\t/**" + NL + "\t * The cached validation expression for the '{@link #";
  protected final String TEXT_1960 = "(";
  protected final String TEXT_1961 = ") <em>";
  protected final String TEXT_1962 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1963 = "(";
  protected final String TEXT_1964 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1965 = " ";
  protected final String TEXT_1966 = "__EEXPRESSION = \"";
  protected final String TEXT_1967 = "\";";
  protected final String TEXT_1968 = NL;
  protected final String TEXT_1969 = NL + "\t/**" + NL + "\t * The cached invocation delegate for the '{@link #";
  protected final String TEXT_1970 = "(";
  protected final String TEXT_1971 = ") <em>";
  protected final String TEXT_1972 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1973 = "(";
  protected final String TEXT_1974 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1975 = ".Internal.InvocationDelegate ";
  protected final String TEXT_1976 = "__EINVOCATION_DELEGATE = ((";
  protected final String TEXT_1977 = ".Internal)";
  protected final String TEXT_1978 = ").getInvocationDelegate();" + NL;
  protected final String TEXT_1979 = NL + "\t/**";
  protected final String TEXT_1980 = NL + "\t * <p>" + NL + "\t * This operation redefines the following operations:" + NL + "\t * <ul>";
  protected final String TEXT_1981 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_1982 = "#";
  protected final String TEXT_1983 = "(";
  protected final String TEXT_1984 = ") <em>";
  protected final String TEXT_1985 = "</em>}' </li>";
  protected final String TEXT_1986 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_1987 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1988 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1989 = NL + "\t * ";
  protected final String TEXT_1990 = NL + "\t * @param ";
  protected final String TEXT_1991 = NL + "\t *   ";
  protected final String TEXT_1992 = NL + "\t * @param ";
  protected final String TEXT_1993 = " ";
  protected final String TEXT_1994 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1995 = NL + "\t * @model ";
  protected final String TEXT_1996 = NL + "\t *        ";
  protected final String TEXT_1997 = NL + "\t * @model";
  protected final String TEXT_1998 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1999 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2000 = NL + "\t@Override";
  protected final String TEXT_2001 = NL + "\t";
  protected final String TEXT_2002 = " ";
  protected final String TEXT_2003 = "(";
  protected final String TEXT_2004 = ")";
  protected final String TEXT_2005 = ";" + NL;
  protected final String TEXT_2006 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2007 = NL + "\tpublic ";
  protected final String TEXT_2008 = " ";
  protected final String TEXT_2009 = "(";
  protected final String TEXT_2010 = ")";
  protected final String TEXT_2011 = NL + "\t{";
  protected final String TEXT_2012 = NL + "\t\t";
  protected final String TEXT_2013 = NL + "\t\treturn" + NL + "\t\t\t";
  protected final String TEXT_2014 = ".validate" + NL + "\t\t\t\t(";
  protected final String TEXT_2015 = "," + NL + "\t\t\t\t this," + NL + "\t\t\t\t ";
  protected final String TEXT_2016 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_2017 = "," + NL + "\t\t\t\t \"";
  protected final String TEXT_2018 = "\",";
  protected final String TEXT_2019 = NL + "\t\t\t\t ";
  protected final String TEXT_2020 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_2021 = "__EEXPRESSION," + NL + "\t\t\t\t ";
  protected final String TEXT_2022 = ".ERROR," + NL + "\t\t\t\t ";
  protected final String TEXT_2023 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t ";
  protected final String TEXT_2024 = ".";
  protected final String TEXT_2025 = ");";
  protected final String TEXT_2026 = NL + "\t\treturn ";
  protected final String TEXT_2027 = ".";
  protected final String TEXT_2028 = "(this, ";
  protected final String TEXT_2029 = ", ";
  protected final String TEXT_2030 = ");";
  protected final String TEXT_2031 = NL + "\t\tif (";
  protected final String TEXT_2032 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2033 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_2034 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2035 = " = helper.createInvariant(";
  protected final String TEXT_2036 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2037 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_2038 = ").check(this))";
  protected final String TEXT_2039 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_2040 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_2041 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_2042 = NL + "\t\t\t\t";
  protected final String TEXT_2043 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_2044 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_2045 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2046 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2047 = ".";
  protected final String TEXT_2048 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2049 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_2050 = "\", ";
  protected final String TEXT_2051 = ".getObjectLabel(this, ";
  protected final String TEXT_2052 = ") }),";
  protected final String TEXT_2053 = NL + "\t\t\t\t\t\t new Object [] { this }));";
  protected final String TEXT_2054 = NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_2055 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_2056 = NL + "\t\t\t";
  protected final String TEXT_2057 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_2058 = "new ";
  protected final String TEXT_2059 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_2060 = ", ";
  protected final String TEXT_2061 = ")";
  protected final String TEXT_2062 = "null";
  protected final String TEXT_2063 = ");";
  protected final String TEXT_2064 = NL + "\t\t\treturn ";
  protected final String TEXT_2065 = "(";
  protected final String TEXT_2066 = "(";
  protected final String TEXT_2067 = ")";
  protected final String TEXT_2068 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_2069 = "new ";
  protected final String TEXT_2070 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_2071 = ", ";
  protected final String TEXT_2072 = ")";
  protected final String TEXT_2073 = "null";
  protected final String TEXT_2074 = ")";
  protected final String TEXT_2075 = ").";
  protected final String TEXT_2076 = "()";
  protected final String TEXT_2077 = ";";
  protected final String TEXT_2078 = NL + "\t\t}" + NL + "\t\tcatch (";
  protected final String TEXT_2079 = " ite)" + NL + "\t\t{" + NL + "\t\t\tthrow new ";
  protected final String TEXT_2080 = "(ite);" + NL + "\t\t}";
  protected final String TEXT_2081 = NL + "\t\t";
  protected final String TEXT_2082 = ".";
  protected final String TEXT_2083 = "(this";
  protected final String TEXT_2084 = ", ";
  protected final String TEXT_2085 = ");";
  protected final String TEXT_2086 = NL + "\t\t";
  protected final String TEXT_2087 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_2088 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2089 = NL + "\t\t\t";
  protected final String TEXT_2090 = " result = (";
  protected final String TEXT_2091 = ") cache.get(";
  protected final String TEXT_2092 = "eResource(), ";
  protected final String TEXT_2093 = "this, ";
  protected final String TEXT_2094 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_2095 = "eResource(), ";
  protected final String TEXT_2096 = "this, ";
  protected final String TEXT_2097 = ", result = ";
  protected final String TEXT_2098 = "new ";
  protected final String TEXT_2099 = "(";
  protected final String TEXT_2100 = ".";
  protected final String TEXT_2101 = "(this";
  protected final String TEXT_2102 = ", ";
  protected final String TEXT_2103 = ")";
  protected final String TEXT_2104 = ")";
  protected final String TEXT_2105 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_2106 = ".";
  protected final String TEXT_2107 = "()";
  protected final String TEXT_2108 = ";" + NL + "\t\t}";
  protected final String TEXT_2109 = NL + "\t\treturn ";
  protected final String TEXT_2110 = ".";
  protected final String TEXT_2111 = "(this";
  protected final String TEXT_2112 = ", ";
  protected final String TEXT_2113 = ");";
  protected final String TEXT_2114 = NL + "\t\tif (";
  protected final String TEXT_2115 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2116 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_2117 = ", ";
  protected final String TEXT_2118 = ".getEAllOperations().get(";
  protected final String TEXT_2119 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2120 = " = helper.createQuery(";
  protected final String TEXT_2121 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2122 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_2123 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_2124 = ");";
  protected final String TEXT_2125 = NL + "\t\t";
  protected final String TEXT_2126 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_2127 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_2128 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_2129 = "\", ";
  protected final String TEXT_2130 = ");";
  protected final String TEXT_2131 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2132 = NL + "\t\t";
  protected final String TEXT_2133 = "<";
  protected final String TEXT_2134 = "> result = (";
  protected final String TEXT_2135 = "<";
  protected final String TEXT_2136 = ">) query.evaluate(this);" + NL + "\t\treturn new ";
  protected final String TEXT_2137 = ".UnmodifiableEList<";
  protected final String TEXT_2138 = ">(result.size(), result.toArray());";
  protected final String TEXT_2139 = NL + "\t\treturn ((";
  protected final String TEXT_2140 = ") query.evaluate(this)).";
  protected final String TEXT_2141 = "();";
  protected final String TEXT_2142 = NL + "\t\treturn (";
  protected final String TEXT_2143 = ") query.evaluate(this);";
  protected final String TEXT_2144 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2145 = NL + "\t}" + NL;
  protected final String TEXT_2146 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2147 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2148 = NL + "\t@Override";
  protected final String TEXT_2149 = NL + "\tpublic ";
  protected final String TEXT_2150 = " eInverseAdd(";
  protected final String TEXT_2151 = " otherEnd, int featureID, ";
  protected final String TEXT_2152 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2153 = ")" + NL + "\t\t{";
  protected final String TEXT_2154 = NL + "\t\t\tcase ";
  protected final String TEXT_2155 = ":";
  protected final String TEXT_2156 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2157 = "(";
  protected final String TEXT_2158 = ".InternalMapView";
  protected final String TEXT_2159 = ")";
  protected final String TEXT_2160 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2161 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2162 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2163 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2164 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2165 = "((";
  protected final String TEXT_2166 = ")otherEnd, msgs);";
  protected final String TEXT_2167 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_2168 = ", msgs);";
  protected final String TEXT_2169 = NL + "\t\t\t\t";
  protected final String TEXT_2170 = " ";
  protected final String TEXT_2171 = " = (";
  protected final String TEXT_2172 = ")eVirtualGet(";
  protected final String TEXT_2173 = ");";
  protected final String TEXT_2174 = NL + "\t\t\t\t";
  protected final String TEXT_2175 = " ";
  protected final String TEXT_2176 = " = ";
  protected final String TEXT_2177 = "basicGet";
  protected final String TEXT_2178 = "();";
  protected final String TEXT_2179 = NL + "\t\t\t\tif (";
  protected final String TEXT_2180 = " != null)";
  protected final String TEXT_2181 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2182 = ")";
  protected final String TEXT_2183 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_2184 = ", null, msgs);";
  protected final String TEXT_2185 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2186 = ")";
  protected final String TEXT_2187 = ").eInverseRemove(this, ";
  protected final String TEXT_2188 = ", ";
  protected final String TEXT_2189 = ".class, msgs);";
  protected final String TEXT_2190 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2191 = "((";
  protected final String TEXT_2192 = ")otherEnd, msgs);";
  protected final String TEXT_2193 = NL + "\t\t}";
  protected final String TEXT_2194 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2195 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2196 = NL + "\t}" + NL;
  protected final String TEXT_2197 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2198 = NL + "\t@Override";
  protected final String TEXT_2199 = NL + "\tpublic ";
  protected final String TEXT_2200 = " eInverseRemove(";
  protected final String TEXT_2201 = " otherEnd, int featureID, ";
  protected final String TEXT_2202 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2203 = ")" + NL + "\t\t{";
  protected final String TEXT_2204 = NL + "\t\t\tcase ";
  protected final String TEXT_2205 = ":";
  protected final String TEXT_2206 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2207 = ")((";
  protected final String TEXT_2208 = ".InternalMapView";
  protected final String TEXT_2209 = ")";
  protected final String TEXT_2210 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2211 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2212 = ")((";
  protected final String TEXT_2213 = ".Internal.Wrapper)";
  protected final String TEXT_2214 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2215 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2216 = ")";
  protected final String TEXT_2217 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2218 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_2219 = ", msgs);";
  protected final String TEXT_2220 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_2221 = "(msgs);";
  protected final String TEXT_2222 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2223 = "(null, msgs);";
  protected final String TEXT_2224 = NL + "\t\t}";
  protected final String TEXT_2225 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2226 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2227 = NL + "\t}" + NL;
  protected final String TEXT_2228 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2229 = NL + "\t@Override";
  protected final String TEXT_2230 = NL + "\tpublic ";
  protected final String TEXT_2231 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_2232 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID()";
  protected final String TEXT_2233 = ")" + NL + "\t\t{";
  protected final String TEXT_2234 = NL + "\t\t\tcase ";
  protected final String TEXT_2235 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_2236 = ", ";
  protected final String TEXT_2237 = ".class, msgs);";
  protected final String TEXT_2238 = NL + "\t\t}";
  protected final String TEXT_2239 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_2240 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2241 = NL + "\t}" + NL;
  protected final String TEXT_2242 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2243 = NL + "\t@Override";
  protected final String TEXT_2244 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2245 = ")" + NL + "\t\t{";
  protected final String TEXT_2246 = NL + "\t\t\tcase ";
  protected final String TEXT_2247 = ":";
  protected final String TEXT_2248 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2249 = "();";
  protected final String TEXT_2250 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2251 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_2252 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_2253 = "(";
  protected final String TEXT_2254 = "());";
  protected final String TEXT_2255 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_2256 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2257 = "();";
  protected final String TEXT_2258 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2259 = ".InternalMapView";
  protected final String TEXT_2260 = ")";
  protected final String TEXT_2261 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2262 = "();";
  protected final String TEXT_2263 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2264 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2265 = "().map();";
  protected final String TEXT_2266 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2267 = ".Internal.Wrapper)";
  protected final String TEXT_2268 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2269 = "();";
  protected final String TEXT_2270 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2271 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_2272 = ".Internal)";
  protected final String TEXT_2273 = "()).getWrapper();";
  protected final String TEXT_2274 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2275 = "();";
  protected final String TEXT_2276 = NL + "\t\t}";
  protected final String TEXT_2277 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_2278 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_2279 = NL + "\t}" + NL;
  protected final String TEXT_2280 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2281 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2282 = NL + "\t@Override";
  protected final String TEXT_2283 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2284 = ")" + NL + "\t\t{";
  protected final String TEXT_2285 = NL + "\t\t\tcase ";
  protected final String TEXT_2286 = ":";
  protected final String TEXT_2287 = NL + "\t\t\t\t((";
  protected final String TEXT_2288 = ".Internal)((";
  protected final String TEXT_2289 = ".Internal.Wrapper)";
  protected final String TEXT_2290 = "()).featureMap()).set(newValue);";
  protected final String TEXT_2291 = NL + "\t\t\t\t((";
  protected final String TEXT_2292 = ".Internal)";
  protected final String TEXT_2293 = "()).set(newValue);";
  protected final String TEXT_2294 = NL + "\t\t\t\t((";
  protected final String TEXT_2295 = ".Setting)((";
  protected final String TEXT_2296 = ".InternalMapView";
  protected final String TEXT_2297 = ")";
  protected final String TEXT_2298 = "()).eMap()).set(newValue);";
  protected final String TEXT_2299 = NL + "\t\t\t\t((";
  protected final String TEXT_2300 = ".Setting)";
  protected final String TEXT_2301 = "()).set(newValue);";
  protected final String TEXT_2302 = NL + "\t\t\t\t";
  protected final String TEXT_2303 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_2304 = "().addAll((";
  protected final String TEXT_2305 = "<? extends ";
  protected final String TEXT_2306 = ">";
  protected final String TEXT_2307 = ")newValue);";
  protected final String TEXT_2308 = NL + "\t\t\t\tset";
  protected final String TEXT_2309 = "(((";
  protected final String TEXT_2310 = ")newValue).";
  protected final String TEXT_2311 = "());";
  protected final String TEXT_2312 = NL + "\t\t\t\tset";
  protected final String TEXT_2313 = "(";
  protected final String TEXT_2314 = "(";
  protected final String TEXT_2315 = ")";
  protected final String TEXT_2316 = "newValue);";
  protected final String TEXT_2317 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2318 = NL + "\t\t}";
  protected final String TEXT_2319 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_2320 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_2321 = NL + "\t}" + NL;
  protected final String TEXT_2322 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2323 = NL + "\t@Override";
  protected final String TEXT_2324 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2325 = ")" + NL + "\t\t{";
  protected final String TEXT_2326 = NL + "\t\t\tcase ";
  protected final String TEXT_2327 = ":";
  protected final String TEXT_2328 = NL + "\t\t\t\t((";
  protected final String TEXT_2329 = ".Internal.Wrapper)";
  protected final String TEXT_2330 = "()).featureMap().clear();";
  protected final String TEXT_2331 = NL + "\t\t\t\t";
  protected final String TEXT_2332 = "().clear();";
  protected final String TEXT_2333 = NL + "\t\t\t\tunset";
  protected final String TEXT_2334 = "();";
  protected final String TEXT_2335 = NL + "\t\t\t\tset";
  protected final String TEXT_2336 = "((";
  protected final String TEXT_2337 = ")null);";
  protected final String TEXT_2338 = NL + "\t\t\t\tset";
  protected final String TEXT_2339 = "(";
  protected final String TEXT_2340 = ");";
  protected final String TEXT_2341 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2342 = NL + "\t\t}";
  protected final String TEXT_2343 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_2344 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_2345 = NL + "\t}" + NL;
  protected final String TEXT_2346 = NL;
  protected final String TEXT_2347 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2348 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2349 = NL + "\t@Override";
  protected final String TEXT_2350 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_2351 = NL + "\t\t\tcase ";
  protected final String TEXT_2352 = ":";
  protected final String TEXT_2353 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2354 = "();";
  protected final String TEXT_2355 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2356 = "();";
  protected final String TEXT_2357 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2358 = "_ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_2359 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_2360 = ".Internal.Wrapper)";
  protected final String TEXT_2361 = "()).featureMap().isEmpty();";
  protected final String TEXT_2362 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2363 = " != null && !";
  protected final String TEXT_2364 = ".featureMap().isEmpty();";
  protected final String TEXT_2365 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2366 = " != null && !";
  protected final String TEXT_2367 = ".isEmpty();";
  protected final String TEXT_2368 = NL + "\t\t\t\t";
  protected final String TEXT_2369 = " ";
  protected final String TEXT_2370 = " = (";
  protected final String TEXT_2371 = ")eVirtualGet(";
  protected final String TEXT_2372 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2373 = " != null && !";
  protected final String TEXT_2374 = ".isEmpty();";
  protected final String TEXT_2375 = NL + "\t\t\t\treturn !";
  protected final String TEXT_2376 = "().isEmpty();";
  protected final String TEXT_2377 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2378 = "();";
  protected final String TEXT_2379 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2380 = " != null;";
  protected final String TEXT_2381 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2382 = ") != null;";
  protected final String TEXT_2383 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2384 = "() != null;";
  protected final String TEXT_2385 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2386 = " != null;";
  protected final String TEXT_2387 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2388 = ") != null;";
  protected final String TEXT_2389 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2390 = "() != null;";
  protected final String TEXT_2391 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2392 = " & ";
  protected final String TEXT_2393 = "_EFLAG) != 0) != ";
  protected final String TEXT_2394 = ";";
  protected final String TEXT_2395 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2396 = " & ";
  protected final String TEXT_2397 = "_EFLAG) != ";
  protected final String TEXT_2398 = "_EFLAG_DEFAULT;";
  protected final String TEXT_2399 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2400 = " != ";
  protected final String TEXT_2401 = ";";
  protected final String TEXT_2402 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2403 = ", ";
  protected final String TEXT_2404 = ") != ";
  protected final String TEXT_2405 = ";";
  protected final String TEXT_2406 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2407 = "() != ";
  protected final String TEXT_2408 = ";";
  protected final String TEXT_2409 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2410 = " == null ? ";
  protected final String TEXT_2411 = " != null : !";
  protected final String TEXT_2412 = ".equals(";
  protected final String TEXT_2413 = ");";
  protected final String TEXT_2414 = NL + "\t\t\t\t";
  protected final String TEXT_2415 = " ";
  protected final String TEXT_2416 = " = (";
  protected final String TEXT_2417 = ")eVirtualGet(";
  protected final String TEXT_2418 = ", ";
  protected final String TEXT_2419 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2420 = " == null ? ";
  protected final String TEXT_2421 = " != null : !";
  protected final String TEXT_2422 = ".equals(";
  protected final String TEXT_2423 = ");";
  protected final String TEXT_2424 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2425 = " == null ? ";
  protected final String TEXT_2426 = "() != null : !";
  protected final String TEXT_2427 = ".equals(";
  protected final String TEXT_2428 = "());";
  protected final String TEXT_2429 = NL + "\t\t}";
  protected final String TEXT_2430 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2431 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2432 = NL + "\t}" + NL;
  protected final String TEXT_2433 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2434 = NL + "\t@Override";
  protected final String TEXT_2435 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2436 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2437 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2438 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_2439 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2440 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2441 = ": return ";
  protected final String TEXT_2442 = ";";
  protected final String TEXT_2443 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2444 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_2445 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2446 = NL + "\t@Override";
  protected final String TEXT_2447 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2448 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2449 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2450 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2451 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2452 = ": return ";
  protected final String TEXT_2453 = ";";
  protected final String TEXT_2454 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2455 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2456 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_2457 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2458 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2459 = ": return ";
  protected final String TEXT_2460 = ";";
  protected final String TEXT_2461 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2462 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2463 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2464 = NL + "\t@Override";
  protected final String TEXT_2465 = NL + "\tpublic int eDerivedOperationID(int baseOperationID, Class";
  protected final String TEXT_2466 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2467 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2468 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_2469 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2470 = ": return ";
  protected final String TEXT_2471 = ";";
  protected final String TEXT_2472 = NL + "\t\t\t\tdefault: return super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2473 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2474 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_2475 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2476 = ": return ";
  protected final String TEXT_2477 = ";";
  protected final String TEXT_2478 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2479 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2480 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID";
  protected final String TEXT_2481 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2482 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2483 = ": return ";
  protected final String TEXT_2484 = ";";
  protected final String TEXT_2485 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2486 = NL + "\t\treturn super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2487 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2488 = NL + "\t@Override";
  protected final String TEXT_2489 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2490 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2491 = NL + "\t@Override";
  protected final String TEXT_2492 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2493 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2494 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2495 = NL + "\t@Override";
  protected final String TEXT_2496 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2497 = NL + "\t\t\tcase ";
  protected final String TEXT_2498 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2499 = ";";
  protected final String TEXT_2500 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2501 = NL + "\t@Override";
  protected final String TEXT_2502 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2503 = NL + "\t\t\tcase ";
  protected final String TEXT_2504 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2505 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2506 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2507 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2508 = NL + "\t@Override";
  protected final String TEXT_2509 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2510 = NL + "\tpublic Object eInvoke(int operationID, ";
  protected final String TEXT_2511 = " arguments) throws ";
  protected final String TEXT_2512 = NL + "\t{" + NL + "\t\tswitch (operationID";
  protected final String TEXT_2513 = ")" + NL + "\t\t{";
  protected final String TEXT_2514 = NL + "\t\t\tcase ";
  protected final String TEXT_2515 = ":";
  protected final String TEXT_2516 = NL + "\t\t\t\t";
  protected final String TEXT_2517 = "(";
  protected final String TEXT_2518 = "(";
  protected final String TEXT_2519 = "(";
  protected final String TEXT_2520 = ")";
  protected final String TEXT_2521 = "arguments.get(";
  protected final String TEXT_2522 = ")";
  protected final String TEXT_2523 = ").";
  protected final String TEXT_2524 = "()";
  protected final String TEXT_2525 = ", ";
  protected final String TEXT_2526 = ");" + NL + "\t\t\t\treturn null;";
  protected final String TEXT_2527 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2528 = "new ";
  protected final String TEXT_2529 = "(";
  protected final String TEXT_2530 = "(";
  protected final String TEXT_2531 = "(";
  protected final String TEXT_2532 = "(";
  protected final String TEXT_2533 = ")";
  protected final String TEXT_2534 = "arguments.get(";
  protected final String TEXT_2535 = ")";
  protected final String TEXT_2536 = ").";
  protected final String TEXT_2537 = "()";
  protected final String TEXT_2538 = ", ";
  protected final String TEXT_2539 = ")";
  protected final String TEXT_2540 = ")";
  protected final String TEXT_2541 = ";";
  protected final String TEXT_2542 = NL + "\t\t}";
  protected final String TEXT_2543 = NL + "\t\treturn super.eInvoke(operationID, arguments);";
  protected final String TEXT_2544 = NL + "\t\treturn eDynamicInvoke(operationID, arguments);";
  protected final String TEXT_2545 = NL + "\t}" + NL;
  protected final String TEXT_2546 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2547 = NL + "\t@Override";
  protected final String TEXT_2548 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2549 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2550 = ": \");";
  protected final String TEXT_2551 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2552 = ": \");";
  protected final String TEXT_2553 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2554 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2555 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2556 = NL + "\t\tif (";
  protected final String TEXT_2557 = "(";
  protected final String TEXT_2558 = " & ";
  protected final String TEXT_2559 = "_ESETFLAG) != 0";
  protected final String TEXT_2560 = "ESet";
  protected final String TEXT_2561 = ") result.append((";
  protected final String TEXT_2562 = " & ";
  protected final String TEXT_2563 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2564 = NL + "\t\tif (";
  protected final String TEXT_2565 = "(";
  protected final String TEXT_2566 = " & ";
  protected final String TEXT_2567 = "_ESETFLAG) != 0";
  protected final String TEXT_2568 = "ESet";
  protected final String TEXT_2569 = ") result.append(";
  protected final String TEXT_2570 = "_EFLAG_VALUES[(";
  protected final String TEXT_2571 = " & ";
  protected final String TEXT_2572 = "_EFLAG) >>> ";
  protected final String TEXT_2573 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_2574 = NL + "\t\tif (";
  protected final String TEXT_2575 = "(";
  protected final String TEXT_2576 = " & ";
  protected final String TEXT_2577 = "_ESETFLAG) != 0";
  protected final String TEXT_2578 = "ESet";
  protected final String TEXT_2579 = ") result.append(";
  protected final String TEXT_2580 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2581 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2582 = ", ";
  protected final String TEXT_2583 = "));";
  protected final String TEXT_2584 = NL + "\t\tresult.append((";
  protected final String TEXT_2585 = " & ";
  protected final String TEXT_2586 = "_EFLAG) != 0);";
  protected final String TEXT_2587 = NL + "\t\tresult.append(";
  protected final String TEXT_2588 = "_EFLAG_VALUES[(";
  protected final String TEXT_2589 = " & ";
  protected final String TEXT_2590 = "_EFLAG) >>> ";
  protected final String TEXT_2591 = "_EFLAG_OFFSET]);";
  protected final String TEXT_2592 = NL + "\t\tresult.append(";
  protected final String TEXT_2593 = ");";
  protected final String TEXT_2594 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2595 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2596 = NL + "\t@";
  protected final String TEXT_2597 = NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2598 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2599 = " getKey()" + NL + "\t{";
  protected final String TEXT_2600 = NL + "\t\treturn new ";
  protected final String TEXT_2601 = "(getTypedKey());";
  protected final String TEXT_2602 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2603 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2604 = " key)" + NL + "\t{";
  protected final String TEXT_2605 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2606 = "(";
  protected final String TEXT_2607 = ")";
  protected final String TEXT_2608 = "key);";
  protected final String TEXT_2609 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2610 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2611 = ")key).";
  protected final String TEXT_2612 = "());";
  protected final String TEXT_2613 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2614 = ")key);";
  protected final String TEXT_2615 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2616 = " getValue()" + NL + "\t{";
  protected final String TEXT_2617 = NL + "\t\treturn new ";
  protected final String TEXT_2618 = "(getTypedValue());";
  protected final String TEXT_2619 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2620 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2621 = " setValue(";
  protected final String TEXT_2622 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2623 = " oldValue = getValue();";
  protected final String TEXT_2624 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2625 = "(";
  protected final String TEXT_2626 = ")";
  protected final String TEXT_2627 = "value);";
  protected final String TEXT_2628 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2629 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2630 = ")value).";
  protected final String TEXT_2631 = "());";
  protected final String TEXT_2632 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2633 = ")value);";
  protected final String TEXT_2634 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2635 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2636 = NL + "\tpublic ";
  protected final String TEXT_2637 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2638 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2639 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2640 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2641 = " EOCL_ENV = ";
  protected final String TEXT_2642 = ".newInstance();" + NL;
  protected final String TEXT_2643 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2644 = " create(";
  protected final String TEXT_2645 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2646 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2647 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2648 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2649 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2650 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2651 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2652 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2653 = NL + "\t@Override";
  protected final String TEXT_2654 = NL + "\tprotected ";
  protected final String TEXT_2655 = " ";
  protected final String TEXT_2656 = "Helper(";
  protected final String TEXT_2657 = " ";
  protected final String TEXT_2658 = ")" + NL + "\t{";
  protected final String TEXT_2659 = NL + "\t\t";
  protected final String TEXT_2660 = ".addAll(super.";
  protected final String TEXT_2661 = "());";
  protected final String TEXT_2662 = NL + "\t\tsuper.";
  protected final String TEXT_2663 = "Helper(";
  protected final String TEXT_2664 = ");";
  protected final String TEXT_2665 = NL + "\t\tif (isSet";
  protected final String TEXT_2666 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2667 = "<";
  protected final String TEXT_2668 = ">";
  protected final String TEXT_2669 = " i = ((";
  protected final String TEXT_2670 = ") ";
  protected final String TEXT_2671 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2672 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2673 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2674 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2675 = "<";
  protected final String TEXT_2676 = ">";
  protected final String TEXT_2677 = " i = ((";
  protected final String TEXT_2678 = ") ";
  protected final String TEXT_2679 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2680 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2681 = NL + "\t\t";
  protected final String TEXT_2682 = " ";
  protected final String TEXT_2683 = " = ";
  protected final String TEXT_2684 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2685 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2686 = "<";
  protected final String TEXT_2687 = ">";
  protected final String TEXT_2688 = " i = ((";
  protected final String TEXT_2689 = ") ";
  protected final String TEXT_2690 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2691 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2692 = NL + "\t\tif (isSet";
  protected final String TEXT_2693 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2694 = ".addAll(";
  protected final String TEXT_2695 = "());" + NL + "\t\t}";
  protected final String TEXT_2696 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2697 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2698 = ".addAll(";
  protected final String TEXT_2699 = "());" + NL + "\t\t}";
  protected final String TEXT_2700 = NL + "\t\t";
  protected final String TEXT_2701 = " ";
  protected final String TEXT_2702 = " = ";
  protected final String TEXT_2703 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2704 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2705 = ".addAll(";
  protected final String TEXT_2706 = ");" + NL + "\t\t}";
  protected final String TEXT_2707 = NL + "\t\tif (isSet";
  protected final String TEXT_2708 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2709 = ".add(";
  protected final String TEXT_2710 = "basicGet";
  protected final String TEXT_2711 = "());" + NL + "\t\t}";
  protected final String TEXT_2712 = NL + "\t\t";
  protected final String TEXT_2713 = " ";
  protected final String TEXT_2714 = " = ";
  protected final String TEXT_2715 = "basicGet";
  protected final String TEXT_2716 = "();" + NL + "\t\tif (";
  protected final String TEXT_2717 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2718 = ".add(";
  protected final String TEXT_2719 = ");" + NL + "\t\t}";
  protected final String TEXT_2720 = NL + "\t\treturn ";
  protected final String TEXT_2721 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2722 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2723 = NL + "\t@Override";
  protected final String TEXT_2724 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2725 = "()" + NL + "\t{";
  protected final String TEXT_2726 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2727 = "()";
  protected final String TEXT_2728 = NL + "\t\treturn isSet";
  protected final String TEXT_2729 = "()";
  protected final String TEXT_2730 = ";";
  protected final String TEXT_2731 = NL + "\t\treturn !";
  protected final String TEXT_2732 = "().isEmpty()";
  protected final String TEXT_2733 = ";";
  protected final String TEXT_2734 = NL + "\t\treturn ";
  protected final String TEXT_2735 = "basicGet";
  protected final String TEXT_2736 = "() != null";
  protected final String TEXT_2737 = ";";
  protected final String TEXT_2738 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2739 = ")";
  protected final String TEXT_2740 = ";";
  protected final String TEXT_2741 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2742 = "()";
  protected final String TEXT_2743 = ";";
  protected final String TEXT_2744 = NL + "\t\t\t|| !";
  protected final String TEXT_2745 = "().isEmpty()";
  protected final String TEXT_2746 = ";";
  protected final String TEXT_2747 = NL + "\t\t\t|| ";
  protected final String TEXT_2748 = "basicGet";
  protected final String TEXT_2749 = "() != null";
  protected final String TEXT_2750 = ";";
  protected final String TEXT_2751 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2752 = ")";
  protected final String TEXT_2753 = ";";
  protected final String TEXT_2754 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2755 = "();";
  protected final String TEXT_2756 = NL + "\t\treturn false;";
  protected final String TEXT_2757 = NL + "\t}" + NL;
  protected final String TEXT_2758 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2759 = NL + "\t@Override";
  protected final String TEXT_2760 = NL + "\tpublic ";
  protected final String TEXT_2761 = " ";
  protected final String TEXT_2762 = "()" + NL + "\t{";
  protected final String TEXT_2763 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2764 = " ";
  protected final String TEXT_2765 = " = (";
  protected final String TEXT_2766 = ")((";
  protected final String TEXT_2767 = ")";
  protected final String TEXT_2768 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2769 = ";";
  protected final String TEXT_2770 = NL + "\t\treturn ";
  protected final String TEXT_2771 = "();";
  protected final String TEXT_2772 = NL + "\t\treturn new ";
  protected final String TEXT_2773 = ".UnmodifiableEList";
  protected final String TEXT_2774 = "(this, ";
  protected final String TEXT_2775 = "null";
  protected final String TEXT_2776 = ", 0, ";
  protected final String TEXT_2777 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2778 = NL + "\t\treturn null;";
  protected final String TEXT_2779 = NL + "\t\treturn ";
  protected final String TEXT_2780 = "();";
  protected final String TEXT_2781 = NL + "\t}" + NL;
  protected final String TEXT_2782 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2783 = NL + "\t@Override";
  protected final String TEXT_2784 = NL + "\tpublic ";
  protected final String TEXT_2785 = " basicGet";
  protected final String TEXT_2786 = "()" + NL + "\t{";
  protected final String TEXT_2787 = NL + "\t\treturn null;";
  protected final String TEXT_2788 = NL + "\t\treturn ";
  protected final String TEXT_2789 = "basicGet";
  protected final String TEXT_2790 = "();";
  protected final String TEXT_2791 = NL + "\t}" + NL;
  protected final String TEXT_2792 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2793 = NL + "\t@Override";
  protected final String TEXT_2794 = NL + "\tpublic ";
  protected final String TEXT_2795 = " basicSet";
  protected final String TEXT_2796 = "(";
  protected final String TEXT_2797 = " new";
  protected final String TEXT_2798 = ", ";
  protected final String TEXT_2799 = " msgs)" + NL + "\t{";
  protected final String TEXT_2800 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2801 = NL + "\t\tif (new";
  protected final String TEXT_2802 = " != null && !(new";
  protected final String TEXT_2803 = " instanceof ";
  protected final String TEXT_2804 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2805 = "));" + NL + "\t\t}";
  protected final String TEXT_2806 = NL + "\t\treturn basicSet";
  protected final String TEXT_2807 = "(";
  protected final String TEXT_2808 = "(";
  protected final String TEXT_2809 = ") ";
  protected final String TEXT_2810 = "new";
  protected final String TEXT_2811 = ", msgs);";
  protected final String TEXT_2812 = NL + "\t\tset";
  protected final String TEXT_2813 = "(";
  protected final String TEXT_2814 = "(";
  protected final String TEXT_2815 = ") ";
  protected final String TEXT_2816 = "new";
  protected final String TEXT_2817 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2818 = NL + "\t}" + NL;
  protected final String TEXT_2819 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2820 = NL + "\t@Override";
  protected final String TEXT_2821 = NL + "\tpublic void set";
  protected final String TEXT_2822 = "(";
  protected final String TEXT_2823 = " new";
  protected final String TEXT_2824 = ")" + NL + "\t{";
  protected final String TEXT_2825 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2826 = NL + "\t\tif (new";
  protected final String TEXT_2827 = " != null && !(new";
  protected final String TEXT_2828 = " instanceof ";
  protected final String TEXT_2829 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2830 = "));" + NL + "\t\t}";
  protected final String TEXT_2831 = NL + "\t\tset";
  protected final String TEXT_2832 = "(";
  protected final String TEXT_2833 = "(";
  protected final String TEXT_2834 = ") ";
  protected final String TEXT_2835 = "new";
  protected final String TEXT_2836 = ");";
  protected final String TEXT_2837 = NL + "\t}" + NL;
  protected final String TEXT_2838 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2839 = "() <em>";
  protected final String TEXT_2840 = "</em>}' ";
  protected final String TEXT_2841 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2842 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2843 = "_ESUBSETS = ";
  protected final String TEXT_2844 = ";" + NL;
  protected final String TEXT_2845 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2846 = "() <em>";
  protected final String TEXT_2847 = "</em>}' ";
  protected final String TEXT_2848 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2849 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2850 = "_ESUPERSETS = ";
  protected final String TEXT_2851 = ";" + NL;
  protected final String TEXT_2852 = NL + "\t/**";
  protected final String TEXT_2853 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2854 = "}, with the specified ";
  protected final String TEXT_2855 = ", and appends it to the '<em><b>";
  protected final String TEXT_2856 = "</b></em>' ";
  protected final String TEXT_2857 = ".";
  protected final String TEXT_2858 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2859 = "}, with the specified ";
  protected final String TEXT_2860 = ", and sets the '<em><b>";
  protected final String TEXT_2861 = "</b></em>' ";
  protected final String TEXT_2862 = ".";
  protected final String TEXT_2863 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2864 = "} and appends it to the '<em><b>";
  protected final String TEXT_2865 = "</b></em>' ";
  protected final String TEXT_2866 = ".";
  protected final String TEXT_2867 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2868 = "} and sets the '<em><b>";
  protected final String TEXT_2869 = "</b></em>' ";
  protected final String TEXT_2870 = ".";
  protected final String TEXT_2871 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2872 = NL + "\t * @param ";
  protected final String TEXT_2873 = " The ";
  protected final String TEXT_2874 = " for the new {@link ";
  protected final String TEXT_2875 = "}, or <code>null</code>.";
  protected final String TEXT_2876 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2877 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2878 = "}." + NL + "\t * @see #";
  protected final String TEXT_2879 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2880 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2881 = NL + "\t";
  protected final String TEXT_2882 = " create";
  protected final String TEXT_2883 = "(";
  protected final String TEXT_2884 = ", ";
  protected final String TEXT_2885 = " eClass);" + NL;
  protected final String TEXT_2886 = NL + "\t@Override";
  protected final String TEXT_2887 = NL + "\tpublic ";
  protected final String TEXT_2888 = " create";
  protected final String TEXT_2889 = "(";
  protected final String TEXT_2890 = ", ";
  protected final String TEXT_2891 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2892 = " new";
  protected final String TEXT_2893 = " = (";
  protected final String TEXT_2894 = ") create(eClass);";
  protected final String TEXT_2895 = NL + "\t\t";
  protected final String TEXT_2896 = "().add(new";
  protected final String TEXT_2897 = ");";
  protected final String TEXT_2898 = NL + "\t\tset";
  protected final String TEXT_2899 = "(new";
  protected final String TEXT_2900 = ");";
  protected final String TEXT_2901 = NL + "\t\tint ";
  protected final String TEXT_2902 = "ListSize = 0;";
  protected final String TEXT_2903 = NL + "\t\tint ";
  protected final String TEXT_2904 = "Size = ";
  protected final String TEXT_2905 = " == null ? 0 : ";
  protected final String TEXT_2906 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2907 = "Size > ";
  protected final String TEXT_2908 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2909 = "ListSize = ";
  protected final String TEXT_2910 = "Size;";
  protected final String TEXT_2911 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2912 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2913 = ".create";
  protected final String TEXT_2914 = "(";
  protected final String TEXT_2915 = ", ";
  protected final String TEXT_2916 = "i < ";
  protected final String TEXT_2917 = "Size ? (";
  protected final String TEXT_2918 = ") ";
  protected final String TEXT_2919 = ".get(i) : null";
  protected final String TEXT_2920 = ");" + NL + "\t\t}";
  protected final String TEXT_2921 = NL + "\t\tnew";
  protected final String TEXT_2922 = ".create";
  protected final String TEXT_2923 = "(";
  protected final String TEXT_2924 = ", ";
  protected final String TEXT_2925 = ");";
  protected final String TEXT_2926 = NL + "\t\tif (";
  protected final String TEXT_2927 = " != null)";
  protected final String TEXT_2928 = NL + "\t\t\tnew";
  protected final String TEXT_2929 = ".";
  protected final String TEXT_2930 = "().addAll(";
  protected final String TEXT_2931 = ");";
  protected final String TEXT_2932 = NL + "\t\t\tnew";
  protected final String TEXT_2933 = ".set";
  protected final String TEXT_2934 = "(";
  protected final String TEXT_2935 = ");";
  protected final String TEXT_2936 = NL + "\t\treturn new";
  protected final String TEXT_2937 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2938 = NL + "\t/**";
  protected final String TEXT_2939 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2940 = "}, with the specified ";
  protected final String TEXT_2941 = ", and appends it to the '<em><b>";
  protected final String TEXT_2942 = "</b></em>' ";
  protected final String TEXT_2943 = ".";
  protected final String TEXT_2944 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2945 = "},with the specified ";
  protected final String TEXT_2946 = ", and sets the '<em><b>";
  protected final String TEXT_2947 = "</b></em>' ";
  protected final String TEXT_2948 = ".";
  protected final String TEXT_2949 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2950 = "} and appends it to the '<em><b>";
  protected final String TEXT_2951 = "</b></em>' ";
  protected final String TEXT_2952 = ".";
  protected final String TEXT_2953 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2954 = "} and sets the '<em><b>";
  protected final String TEXT_2955 = "</b></em>' ";
  protected final String TEXT_2956 = ".";
  protected final String TEXT_2957 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2958 = NL + "\t * @param ";
  protected final String TEXT_2959 = " The ";
  protected final String TEXT_2960 = " for the new {@link ";
  protected final String TEXT_2961 = "}, or <code>null</code>.";
  protected final String TEXT_2962 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2963 = "}." + NL + "\t * @see #";
  protected final String TEXT_2964 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2965 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2966 = NL + "\t";
  protected final String TEXT_2967 = " create";
  protected final String TEXT_2968 = "(";
  protected final String TEXT_2969 = ");" + NL;
  protected final String TEXT_2970 = NL + "\t@Override";
  protected final String TEXT_2971 = NL + "\tpublic ";
  protected final String TEXT_2972 = " create";
  protected final String TEXT_2973 = "(";
  protected final String TEXT_2974 = ")" + NL + "\t{";
  protected final String TEXT_2975 = NL + "\t\treturn create";
  protected final String TEXT_2976 = "(";
  protected final String TEXT_2977 = ", ";
  protected final String TEXT_2978 = ");";
  protected final String TEXT_2979 = NL + "\t\t";
  protected final String TEXT_2980 = " new";
  protected final String TEXT_2981 = " = (";
  protected final String TEXT_2982 = ") create(";
  protected final String TEXT_2983 = ");";
  protected final String TEXT_2984 = NL + "\t\t";
  protected final String TEXT_2985 = "().add(new";
  protected final String TEXT_2986 = ");";
  protected final String TEXT_2987 = NL + "\t\tset";
  protected final String TEXT_2988 = "(new";
  protected final String TEXT_2989 = ");";
  protected final String TEXT_2990 = NL + "\t\tint ";
  protected final String TEXT_2991 = "ListSize = 0;";
  protected final String TEXT_2992 = NL + "\t\tint ";
  protected final String TEXT_2993 = "Size = ";
  protected final String TEXT_2994 = " == null ? 0 : ";
  protected final String TEXT_2995 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2996 = "Size > ";
  protected final String TEXT_2997 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2998 = "ListSize = ";
  protected final String TEXT_2999 = "Size;";
  protected final String TEXT_3000 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_3001 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_3002 = ".create";
  protected final String TEXT_3003 = "(";
  protected final String TEXT_3004 = ", ";
  protected final String TEXT_3005 = "i < ";
  protected final String TEXT_3006 = "Size ? (";
  protected final String TEXT_3007 = ") ";
  protected final String TEXT_3008 = ".get(i) : null";
  protected final String TEXT_3009 = ");" + NL + "\t\t}";
  protected final String TEXT_3010 = NL + "\t\tnew";
  protected final String TEXT_3011 = ".create";
  protected final String TEXT_3012 = "(";
  protected final String TEXT_3013 = ", ";
  protected final String TEXT_3014 = ");";
  protected final String TEXT_3015 = NL + "\t\tif (";
  protected final String TEXT_3016 = " != null)";
  protected final String TEXT_3017 = NL + "\t\t\tnew";
  protected final String TEXT_3018 = ".";
  protected final String TEXT_3019 = "().addAll(";
  protected final String TEXT_3020 = ");";
  protected final String TEXT_3021 = NL + "\t\t\tnew";
  protected final String TEXT_3022 = ".set";
  protected final String TEXT_3023 = "(";
  protected final String TEXT_3024 = ");";
  protected final String TEXT_3025 = NL + "\t\treturn new";
  protected final String TEXT_3026 = ";";
  protected final String TEXT_3027 = NL + "\t}" + NL;
  protected final String TEXT_3028 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_3029 = "} with the specified ";
  protected final String TEXT_3030 = " from the '<em><b>";
  protected final String TEXT_3031 = "</b></em>' ";
  protected final String TEXT_3032 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3033 = NL + "\t * @param ";
  protected final String TEXT_3034 = " The ";
  protected final String TEXT_3035 = " of the {@link ";
  protected final String TEXT_3036 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3037 = NL + "\t * @return The first {@link ";
  protected final String TEXT_3038 = "} with the specified ";
  protected final String TEXT_3039 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_3040 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3041 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3042 = NL + "\t";
  protected final String TEXT_3043 = " get";
  protected final String TEXT_3044 = "(";
  protected final String TEXT_3045 = ");" + NL;
  protected final String TEXT_3046 = NL + "\t@Override";
  protected final String TEXT_3047 = NL + "\tpublic ";
  protected final String TEXT_3048 = " get";
  protected final String TEXT_3049 = "(";
  protected final String TEXT_3050 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_3051 = "(";
  protected final String TEXT_3052 = ", false";
  protected final String TEXT_3053 = ", null";
  protected final String TEXT_3054 = ", false";
  protected final String TEXT_3055 = ");" + NL + "\t}" + NL;
  protected final String TEXT_3056 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_3057 = "} with the specified ";
  protected final String TEXT_3058 = " from the '<em><b>";
  protected final String TEXT_3059 = "</b></em>' ";
  protected final String TEXT_3060 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3061 = NL + "\t * @param ";
  protected final String TEXT_3062 = " The ";
  protected final String TEXT_3063 = " of the {@link ";
  protected final String TEXT_3064 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3065 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_3066 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_3067 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3068 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_3069 = "} on demand if not found.";
  protected final String TEXT_3070 = NL + "\t * @return The first {@link ";
  protected final String TEXT_3071 = "} with the specified ";
  protected final String TEXT_3072 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_3073 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3074 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3075 = NL + "\t";
  protected final String TEXT_3076 = " get";
  protected final String TEXT_3077 = "(";
  protected final String TEXT_3078 = ", boolean ignoreCase";
  protected final String TEXT_3079 = ", ";
  protected final String TEXT_3080 = " eClass";
  protected final String TEXT_3081 = ", boolean createOnDemand";
  protected final String TEXT_3082 = ");" + NL;
  protected final String TEXT_3083 = NL + "\t@Override";
  protected final String TEXT_3084 = NL + "\tpublic ";
  protected final String TEXT_3085 = " get";
  protected final String TEXT_3086 = "(";
  protected final String TEXT_3087 = ", boolean ignoreCase";
  protected final String TEXT_3088 = ", ";
  protected final String TEXT_3089 = " eClass";
  protected final String TEXT_3090 = ", boolean createOnDemand";
  protected final String TEXT_3091 = ")" + NL + "\t{";
  protected final String TEXT_3092 = NL + "\t\t";
  protected final String TEXT_3093 = "Loop: for (";
  protected final String TEXT_3094 = " ";
  protected final String TEXT_3095 = " : ";
  protected final String TEXT_3096 = "())" + NL + "\t\t{";
  protected final String TEXT_3097 = NL + "\t\t";
  protected final String TEXT_3098 = "Loop: for (";
  protected final String TEXT_3099 = " i = ";
  protected final String TEXT_3100 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_3101 = " ";
  protected final String TEXT_3102 = " = (";
  protected final String TEXT_3103 = ") i.next();";
  protected final String TEXT_3104 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_3105 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3106 = "Loop;";
  protected final String TEXT_3107 = NL + "\t\t\t";
  protected final String TEXT_3108 = " ";
  protected final String TEXT_3109 = "List = ";
  protected final String TEXT_3110 = ".";
  protected final String TEXT_3111 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_3112 = "ListSize = ";
  protected final String TEXT_3113 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_3114 = " || (";
  protected final String TEXT_3115 = " != null && ";
  protected final String TEXT_3116 = ".size() != ";
  protected final String TEXT_3117 = "ListSize";
  protected final String TEXT_3118 = ")";
  protected final String TEXT_3119 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_3120 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_3121 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_3122 = " ";
  protected final String TEXT_3123 = " = ";
  protected final String TEXT_3124 = "(";
  protected final String TEXT_3125 = ") ";
  protected final String TEXT_3126 = "List.get(j);";
  protected final String TEXT_3127 = NL + "\t\t\t\tif (";
  protected final String TEXT_3128 = " != null && !(ignoreCase ? (";
  protected final String TEXT_3129 = "(";
  protected final String TEXT_3130 = ")";
  protected final String TEXT_3131 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_3132 = ".";
  protected final String TEXT_3133 = "()) : ";
  protected final String TEXT_3134 = ".get(j).equals(";
  protected final String TEXT_3135 = ".";
  protected final String TEXT_3136 = "())))";
  protected final String TEXT_3137 = NL + "\t\t\t\tif (";
  protected final String TEXT_3138 = " != null && !";
  protected final String TEXT_3139 = ".get(j).equals(";
  protected final String TEXT_3140 = ".";
  protected final String TEXT_3141 = "()))";
  protected final String TEXT_3142 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_3143 = "Loop;";
  protected final String TEXT_3144 = NL + "\t\t\t}";
  protected final String TEXT_3145 = NL + "\t\t\t";
  protected final String TEXT_3146 = " ";
  protected final String TEXT_3147 = " = ";
  protected final String TEXT_3148 = ".";
  protected final String TEXT_3149 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_3150 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3151 = "Loop;";
  protected final String TEXT_3152 = NL + "\t\t\tif (";
  protected final String TEXT_3153 = " != null && !(ignoreCase ? ";
  protected final String TEXT_3154 = ".equalsIgnoreCase(";
  protected final String TEXT_3155 = ".";
  protected final String TEXT_3156 = "()) : ";
  protected final String TEXT_3157 = ".equals(";
  protected final String TEXT_3158 = ".";
  protected final String TEXT_3159 = "())))";
  protected final String TEXT_3160 = NL + "\t\t\tif (";
  protected final String TEXT_3161 = " != null && !";
  protected final String TEXT_3162 = ".equals(";
  protected final String TEXT_3163 = ".";
  protected final String TEXT_3164 = "()))";
  protected final String TEXT_3165 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3166 = "Loop;";
  protected final String TEXT_3167 = NL + "\t\t\tif (";
  protected final String TEXT_3168 = " != null && !(ignoreCase ? ";
  protected final String TEXT_3169 = ".equalsIgnoreCase(";
  protected final String TEXT_3170 = ".";
  protected final String TEXT_3171 = "()) : ";
  protected final String TEXT_3172 = ".equals(";
  protected final String TEXT_3173 = ".";
  protected final String TEXT_3174 = "())))";
  protected final String TEXT_3175 = NL + "\t\t\tif (";
  protected final String TEXT_3176 = " != null && !";
  protected final String TEXT_3177 = ".equals(";
  protected final String TEXT_3178 = ".";
  protected final String TEXT_3179 = "()))";
  protected final String TEXT_3180 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3181 = "Loop;";
  protected final String TEXT_3182 = NL + "\t\t\treturn ";
  protected final String TEXT_3183 = ";" + NL + "\t\t}";
  protected final String TEXT_3184 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_3185 = " && eClass != null";
  protected final String TEXT_3186 = " ? create";
  protected final String TEXT_3187 = "(";
  protected final String TEXT_3188 = ", eClass";
  protected final String TEXT_3189 = ") : null;";
  protected final String TEXT_3190 = NL + "\t\treturn null;";
  protected final String TEXT_3191 = NL + "\t}" + NL;
  protected final String TEXT_3192 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_3193 = "()" + NL + "\t{";
  protected final String TEXT_3194 = NL + "  \t\treturn false;";
  protected final String TEXT_3195 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3196 = ");";
  protected final String TEXT_3197 = NL + "\t\treturn !((";
  protected final String TEXT_3198 = ".Internal.Wrapper)";
  protected final String TEXT_3199 = "()).featureMap().isEmpty();";
  protected final String TEXT_3200 = NL + "\t\treturn ";
  protected final String TEXT_3201 = " != null && !";
  protected final String TEXT_3202 = ".featureMap().isEmpty();";
  protected final String TEXT_3203 = NL + "\t\treturn ";
  protected final String TEXT_3204 = " != null && !";
  protected final String TEXT_3205 = ".isEmpty();";
  protected final String TEXT_3206 = NL + "\t\t";
  protected final String TEXT_3207 = " ";
  protected final String TEXT_3208 = " = (";
  protected final String TEXT_3209 = ")eVirtualGet(";
  protected final String TEXT_3210 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3211 = " != null && !";
  protected final String TEXT_3212 = ".isEmpty();";
  protected final String TEXT_3213 = NL + "\t\treturn !";
  protected final String TEXT_3214 = "().isEmpty();";
  protected final String TEXT_3215 = NL + "\t\treturn ";
  protected final String TEXT_3216 = " != null;";
  protected final String TEXT_3217 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3218 = ") != null;";
  protected final String TEXT_3219 = NL + "\t\treturn basicGet";
  protected final String TEXT_3220 = "() != null;";
  protected final String TEXT_3221 = NL + "\t\treturn ";
  protected final String TEXT_3222 = " != null;";
  protected final String TEXT_3223 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3224 = ") != null;";
  protected final String TEXT_3225 = NL + "\t\treturn ";
  protected final String TEXT_3226 = "() != null;";
  protected final String TEXT_3227 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_3228 = " & ";
  protected final String TEXT_3229 = "_EFLAG) != 0) != ";
  protected final String TEXT_3230 = ";";
  protected final String TEXT_3231 = NL + "\t\t\t\treturn (";
  protected final String TEXT_3232 = " & ";
  protected final String TEXT_3233 = "_EFLAG) != ";
  protected final String TEXT_3234 = "_EFLAG_DEFAULT;";
  protected final String TEXT_3235 = NL + "\t\treturn ";
  protected final String TEXT_3236 = " != ";
  protected final String TEXT_3237 = ";";
  protected final String TEXT_3238 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3239 = ", ";
  protected final String TEXT_3240 = ") != ";
  protected final String TEXT_3241 = ";";
  protected final String TEXT_3242 = NL + "\t\treturn ";
  protected final String TEXT_3243 = "() != ";
  protected final String TEXT_3244 = ";";
  protected final String TEXT_3245 = NL + "\t\treturn ";
  protected final String TEXT_3246 = " == null ? ";
  protected final String TEXT_3247 = " != null : !";
  protected final String TEXT_3248 = ".equals(";
  protected final String TEXT_3249 = ");";
  protected final String TEXT_3250 = NL + "\t\t";
  protected final String TEXT_3251 = " ";
  protected final String TEXT_3252 = " = (";
  protected final String TEXT_3253 = ")eVirtualGet(";
  protected final String TEXT_3254 = ", ";
  protected final String TEXT_3255 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3256 = " == null ? ";
  protected final String TEXT_3257 = " != null : !";
  protected final String TEXT_3258 = ".equals(";
  protected final String TEXT_3259 = ");";
  protected final String TEXT_3260 = NL + "\t\treturn ";
  protected final String TEXT_3261 = " == null ? ";
  protected final String TEXT_3262 = "() != null : !";
  protected final String TEXT_3263 = ".equals(";
  protected final String TEXT_3264 = "());";
  protected final String TEXT_3265 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3266 = ");";
  protected final String TEXT_3267 = NL + "\t\t";
  protected final String TEXT_3268 = " ";
  protected final String TEXT_3269 = " = (";
  protected final String TEXT_3270 = ")eVirtualGet(";
  protected final String TEXT_3271 = ");";
  protected final String TEXT_3272 = NL + "\t\treturn ";
  protected final String TEXT_3273 = " != null && ((";
  protected final String TEXT_3274 = ".Unsettable";
  protected final String TEXT_3275 = ")";
  protected final String TEXT_3276 = ").isSet();";
  protected final String TEXT_3277 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_3278 = ");";
  protected final String TEXT_3279 = NL + "\t\treturn (";
  protected final String TEXT_3280 = " & ";
  protected final String TEXT_3281 = "_ESETFLAG) != 0;";
  protected final String TEXT_3282 = NL + "\t\treturn ";
  protected final String TEXT_3283 = "ESet;";
  protected final String TEXT_3284 = NL + "\t\treturn !((";
  protected final String TEXT_3285 = ".Internal)((";
  protected final String TEXT_3286 = ".Internal.Wrapper)get";
  protected final String TEXT_3287 = "()).featureMap()).isEmpty(";
  protected final String TEXT_3288 = ");";
  protected final String TEXT_3289 = NL + "\t\treturn !((";
  protected final String TEXT_3290 = ".Internal)get";
  protected final String TEXT_3291 = "()).isEmpty(";
  protected final String TEXT_3292 = ");";
  protected final String TEXT_3293 = NL + "\t\treturn ";
  protected final String TEXT_3294 = ".";
  protected final String TEXT_3295 = "(this);";
  protected final String TEXT_3296 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_3297 = "' ";
  protected final String TEXT_3298 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3299 = NL + "\t}" + NL;
  protected final String TEXT_3300 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3301 = NL + "\t@Override";
  protected final String TEXT_3302 = NL + "\tpublic ";
  protected final String TEXT_3303 = " ";
  protected final String TEXT_3304 = "(";
  protected final String TEXT_3305 = ")";
  protected final String TEXT_3306 = NL + "\t{";
  protected final String TEXT_3307 = NL + "\t\t";
  protected final String TEXT_3308 = "(";
  protected final String TEXT_3309 = ");";
  protected final String TEXT_3310 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3311 = NL + "\t\treturn ";
  protected final String TEXT_3312 = "(";
  protected final String TEXT_3313 = ");";
  protected final String TEXT_3314 = NL + "\t}" + NL;
  protected final String TEXT_3315 = NL + "} //";
  protected final String TEXT_3316 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2010 IBM Corporation and others.
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
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_514);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_515);
    }
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_518);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_519);
    }
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_521);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_522);
    }
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_524);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_526);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_528);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_529);
    }
    stringBuffer.append(TEXT_530);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_532);
    }
    stringBuffer.append(TEXT_533);
    }
    stringBuffer.append(TEXT_534);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_536);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_539);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_540);
    }
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_550);
    }
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_552);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_554);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_556);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_558);
    }
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_568);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_569);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_570);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_572);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_573);
    }
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_585);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_586);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_588);
    }
    stringBuffer.append(TEXT_589);
    }
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_594);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_595);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_596);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_597);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_598);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_599);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_601);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_602);
    } else {
    stringBuffer.append(TEXT_603);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_604);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_605);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_606);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_607);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_608);
    }
    }
    }
    }
    stringBuffer.append(TEXT_609);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_611);
    } else {
    stringBuffer.append(TEXT_612);
    }
    stringBuffer.append(TEXT_613);
    }
    } else {
    stringBuffer.append(TEXT_614);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_616);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_617);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_618);
    if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_619);
    }
    }
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_622);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_627);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_628);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_629);
    }
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_632);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_634);
    }
    stringBuffer.append(TEXT_635);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_638);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_641);
    } else {
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_643);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_646);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_648);
    } else {
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_650);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_652);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_653);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_655);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_656);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_657);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_658);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_659);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_661);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_662);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_663);
    } else {
    stringBuffer.append(TEXT_664);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_665);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_666);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_667);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_668);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_669);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_670);
    }
    }
    }
    }
    stringBuffer.append(TEXT_671);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_673);
    } else {
    stringBuffer.append(TEXT_674);
    }
    stringBuffer.append(TEXT_675);
    } else {
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_677);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_678);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_679);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_680);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_681);
    }
    }
    stringBuffer.append(TEXT_682);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_683);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_687);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_691);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_693);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_694);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_695);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_696);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_697);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_698);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_700);
    }
    stringBuffer.append(TEXT_701);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_702);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_704);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_705);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_707);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_708);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_709);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_710);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_711);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_712);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_713);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_715);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_716);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_717);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_718);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_719);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_720);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_722);
    }
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_724);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_725);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_726);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_727);
    }
    stringBuffer.append(TEXT_728);
    }
    stringBuffer.append(TEXT_729);
    }
    stringBuffer.append(TEXT_730);
    } else if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_734);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_736);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_737);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_738);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_739);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_740);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_741);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_742);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_743);
    }
    stringBuffer.append(TEXT_744);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_745);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_747);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_748);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_750);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_751);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_752);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_753);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_754);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_756);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_758);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_759);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_760);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_761);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_762);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_763);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_765);
    }
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_767);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_768);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_770);
    }
    stringBuffer.append(TEXT_771);
    }
    stringBuffer.append(TEXT_772);
    }
    stringBuffer.append(TEXT_773);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_777);
    } else {
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_783);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_785);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_789);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_792);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_795);
    }
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_797);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_798);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_803);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_807);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_808);
    } else {
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_810);
    }
    stringBuffer.append(TEXT_811);
    } else {
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_816);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_821);
    }
    stringBuffer.append(TEXT_822);
    }
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_824);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_825);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_826);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_827);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_828);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_829);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_831);
    }
    stringBuffer.append(TEXT_832);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_833);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_835);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_836);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_838);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_839);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_840);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_841);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_842);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_844);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_846);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_847);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_848);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_849);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_850);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_851);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_853);
    }
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_855);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_856);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_858);
    }
    stringBuffer.append(TEXT_859);
    }
    stringBuffer.append(TEXT_860);
    }
    stringBuffer.append(TEXT_861);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_864);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_867);
    } else {
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_869);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_871);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_872);
    }
    } else {
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_875);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_876);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_881);
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_884);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_887);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_889);
    }
    }
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_891);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_892);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_893);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_896);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_898);
    }
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_900);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_901);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_906);
    }
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_909);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_911);
    }
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_913);
    }
    stringBuffer.append(TEXT_914);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_915);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_916);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_918);
    }
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_920);
    }
    stringBuffer.append(TEXT_921);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_923);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_925);
    }
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_927);
    }
    stringBuffer.append(TEXT_928);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_929);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_931);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_934);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_941);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_942);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_946);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_952);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_955);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_957);
    }
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_962);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_970);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_973);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_974);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_978);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_979);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_980);
    }
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_984);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_985);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_988);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_992);
    }
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_995);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_998);
    }
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1000);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1007);
    }
    stringBuffer.append(TEXT_1008);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1014);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1019);
    } else {
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1026);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1032);
    } else {
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1039);
    if (isJDK50) {
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1041);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1043);
    }
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1045);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1049);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1055);
    } else {
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1060);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1065);
    } else {
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1069);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1073);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1075);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1079);
    }
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1082);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1085);
    }
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1087);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1091);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1095);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1097);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1098);
    } else {
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1100);
    }
    stringBuffer.append(TEXT_1101);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1105);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1110);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1112);
    }
    }
    }
    if (!genFeature.isBasicSet()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_1114);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1118);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1121);
    }
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1126);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1128);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1136);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1140);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_1143);
    }
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1148);
    }
    stringBuffer.append(TEXT_1149);
    }
    stringBuffer.append(TEXT_1150);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1155);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1157);
    }
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1159);
    }
    stringBuffer.append(TEXT_1160);
    } else {
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1164);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1166);
    }
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1168);
    }
    stringBuffer.append(TEXT_1169);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1174);
    } else {
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1177);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1178);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_1179);
    if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1180);
    }
    }
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1184);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1186);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1189);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1191);
    }
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1193);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1197);
    }
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1199);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1201);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1205);
    }
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1208);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1211);
    }
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1213);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1218);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1220);
    } else {
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1222);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1223);
    } else {
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1225);
    }
    stringBuffer.append(TEXT_1226);
    }
    } else {
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1229);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1230);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(TEXT_1236);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1238);
    }
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1240);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1243);
    }
    stringBuffer.append(TEXT_1244);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1245);
    if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1246);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1248);
    } else {
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1250);
    }
    stringBuffer.append(TEXT_1251);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1254);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1256);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1258);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1263);
    }
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1268);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1273);
    }
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1276);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1280);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1285);
    }
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1287);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1290);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1294);
    }
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1297);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1300);
    }
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1302);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1307);
    }
    stringBuffer.append(TEXT_1308);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1313);
    } else {
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1320);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1323);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1327);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1329);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1333);
    } else {
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1336);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1338);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1341);
    } else {
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1343);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1347);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1349);
    } else {
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1351);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1352);
    } else {
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1354);
    }
    stringBuffer.append(TEXT_1355);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1361);
    } else {
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1366);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1369);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1372);
    } else {
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1374);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1378);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1383);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1384);
    } else {
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1386);
    }
    stringBuffer.append(TEXT_1387);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1392);
    } else {
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1396);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1400);
    } else {
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1403);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1404);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1412);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1414);
    }
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1416);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1419);
    }
    stringBuffer.append(TEXT_1420);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1421);
    if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1422);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1424);
    } else {
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1426);
    }
    stringBuffer.append(TEXT_1427);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1430);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1432);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1434);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1439);
    }
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1444);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1446);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1449);
    } else {
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1451);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1456);
    } else {
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1460);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1464);
    } else {
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1467);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1468);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1475);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1482);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1483);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1488);
    } else {
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1493);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1497);
    } else {
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1501);
    }
    }
    stringBuffer.append(TEXT_1502);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1506);
    }
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1510);
    } else {
    stringBuffer.append(TEXT_1511);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1514);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1515);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1516);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1517);
    }
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1520);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1521);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1525);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1528);
    } else {
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1531);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1533);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1541);
    index++;}
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1545);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1546);
    }
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1550);
    }
    stringBuffer.append(TEXT_1551);
    } else {
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1554);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1555);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1556);
    }
    } else {
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1558);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1562);
    } else {
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1566);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1568);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1569);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1574);
    } else {
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1579);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1583);
    } else {
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1587);
    }
    }
    stringBuffer.append(TEXT_1588);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1592);
    }
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1595);
    } else {
    stringBuffer.append(TEXT_1596);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1600);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1601);
    }
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1605);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1607);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_1608);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1609);
    } else {
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1614);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1617);
    } else {
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1620);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1622);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1630);
    index++;}
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1634);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1635);
    }
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1639);
    }
    stringBuffer.append(TEXT_1640);
    } else {
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1642);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1643);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1644);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1645);
    }
    } else {
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1647);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1651);
    } else {
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1655);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1657);
    }
    stringBuffer.append(TEXT_1658);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1663);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1667);
    }
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1671);
    } else {
    stringBuffer.append(TEXT_1672);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1676);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1677);
    }
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1683);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1684);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1685);
    }
    stringBuffer.append(TEXT_1686);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1691);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1695);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1696);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1698);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1700);
    }
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1704);
    } else {
    stringBuffer.append(TEXT_1705);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1709);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1711);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1712);
    }
    stringBuffer.append(TEXT_1713);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1714);
    }
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1718);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1720);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1721);
    }
    stringBuffer.append(TEXT_1722);
    if (isJDK50) {
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1727);
    } else {
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1734);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1737);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1744);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1745);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1748);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1749);
    }
    }
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1754);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1756);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1757);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1759);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1761);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1763);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1767);
    } else {
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1772);
    }
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1774);
    index++;}
    stringBuffer.append(TEXT_1775);
    } else {
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1782);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1790);
    } else {
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1795);
    }
    stringBuffer.append(TEXT_1796);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1797);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1805);
    } else {
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1810);
    }
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1812);
    index++;}
    }
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1814);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1815);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1816);
    }
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1819);
    }
    stringBuffer.append(TEXT_1820);
    } else {
    stringBuffer.append(TEXT_1821);
    }
    stringBuffer.append(TEXT_1822);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1824);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1825);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1826);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1827);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1830);
    } else {
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1833);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1836);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1843);
    } else {
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1845);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1847);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1849);
    } else {
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1851);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1853);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1855);
    } else {
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1857);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1861);
    } else {
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1865);
    }
    } else {
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1868);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1872);
    } else {
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1875);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1880);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1884);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1890);
    } else {
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1895);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1896);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1897);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1902);
    }
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1907);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1909);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1911);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1912);
    } else {
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1914);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1915);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1917);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1919);
    } else {
    stringBuffer.append(TEXT_1920);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1921);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1923);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1924);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1926);
    } else {
    stringBuffer.append(TEXT_1927);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1929);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1930);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation && !UML2GenModelUtil.hasOperationsClass(genClass, genOperation) && UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_1931);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1932);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1933);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1934);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1938);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1940);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_1941);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1948);
    } else {
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1953);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (isJDK50) {
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_1956);
    }
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1958);
    }
    }
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && isImplementation) {
    if (genOperation.isInvariant() && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1960);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1962);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1963);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(genOperation.getInvariantExpression("\t\t"));
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1968);
    } else if (genOperation.hasInvocationDelegate()) {
    stringBuffer.append(TEXT_1969);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1970);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1972);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1976);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_1978);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1979);
    if (UML2GenModelUtil.isRedefinition(genOperation)) {
    stringBuffer.append(TEXT_1980);
    for (GenOperation redefinedGenOperation : UML2GenModelUtil.getRedefinedGenOperations(genOperation)) {
    stringBuffer.append(TEXT_1981);
    stringBuffer.append(redefinedGenOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(redefinedGenOperation.getName());
    stringBuffer.append(TEXT_1983);
    stringBuffer.append(redefinedGenOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1984);
    stringBuffer.append(redefinedGenOperation.getFormattedName());
    stringBuffer.append(TEXT_1985);
    }
    stringBuffer.append(TEXT_1986);
    }
    stringBuffer.append(TEXT_1987);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1988);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1989);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1992);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1994);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1996);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1997);
    }}
    stringBuffer.append(TEXT_1998);
    } else {
    stringBuffer.append(TEXT_1999);
    if (isJDK50) {
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_2000);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2001);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_2002);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_2004);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_2005);
    } else {
    if (genModel.useGenerics() && !genOperation.hasBody() && !genOperation.isInvariant() && genOperation.hasInvocationDelegate() && genOperation.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_2006);
    }
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_2008);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_2011);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_2012);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2017);
    stringBuffer.append(genOperation.getValidationDelegate());
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2020);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2024);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_2025);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_2026);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2027);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2030);
    } else {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_2031);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2032);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2033);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2034);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2035);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2036);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2038);
    } else {
    stringBuffer.append(TEXT_2039);
    }
    stringBuffer.append(TEXT_2040);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2041);
    stringBuffer.append(TEXT_2042);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_2044);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_2045);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2046);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_2048);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2052);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_2053);
    //genOperation.diagnostics.override.javajetinc
    stringBuffer.append(TEXT_2054);
    }
    }
    } else if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvocationDelegate()) { int size = genOperation.getGenParameters().size();
    stringBuffer.append(TEXT_2055);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2056);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2057);
    if (size > 0) {
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2059);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_2061);
    } else {
    stringBuffer.append(TEXT_2062);
    }
    stringBuffer.append(TEXT_2063);
    } else {
    stringBuffer.append(TEXT_2064);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2065);
    }
    stringBuffer.append(TEXT_2066);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2067);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2068);
    if (size > 0) {
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2070);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_2071);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_2072);
    } else {
    stringBuffer.append(TEXT_2073);
    }
    stringBuffer.append(TEXT_2074);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2075);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2076);
    }
    stringBuffer.append(TEXT_2077);
    }
    stringBuffer.append(TEXT_2078);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.WrappedException"));
    stringBuffer.append(TEXT_2080);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2083);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2085);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2087);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_2088);
    }
    stringBuffer.append(TEXT_2089);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2091);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_2092);
    }
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2094);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_2095);
    }
    stringBuffer.append(TEXT_2096);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2097);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2098);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2099);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2101);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2102);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2103);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2104);
    }
    stringBuffer.append(TEXT_2105);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2106);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2107);
    }
    stringBuffer.append(TEXT_2108);
    }
    stringBuffer.append(TEXT_2109);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2110);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2111);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2112);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2113);
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
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2115);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2117);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2118);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2122);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2123);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2124);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_2125);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2126);
    }
    stringBuffer.append(TEXT_2127);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2131);
    }
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2134);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2138);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2139);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2141);
    } else {
    stringBuffer.append(TEXT_2142);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_2143);
    }
    } else {
    stringBuffer.append(TEXT_2144);
    }
    }
    stringBuffer.append(TEXT_2145);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_2146);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_2147);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2148);
    }
    stringBuffer.append(TEXT_2149);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2150);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2152);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2153);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_2154);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2155);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2156);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_2157);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2159);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2160);
    } else {
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2162);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_2163);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2164);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2165);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2166);
    } else {
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2168);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2170);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2172);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2173);
    } else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
    stringBuffer.append(TEXT_2174);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2175);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2176);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_2177);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2178);
    }
    stringBuffer.append(TEXT_2179);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2180);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2182);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2184);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_2185);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2188);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2189);
    }
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2192);
    }
    }
    stringBuffer.append(TEXT_2193);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2194);
    } else {
    stringBuffer.append(TEXT_2195);
    }
    stringBuffer.append(TEXT_2196);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_2197);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2198);
    }
    stringBuffer.append(TEXT_2199);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2200);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2202);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2203);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_2204);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2205);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2207);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2208);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2209);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2210);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2212);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2213);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2214);
    } else {
    stringBuffer.append(TEXT_2215);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2216);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2217);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2218);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2219);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2220);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2221);
    } else {
    stringBuffer.append(TEXT_2222);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2223);
    }
    }
    stringBuffer.append(TEXT_2224);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2225);
    } else {
    stringBuffer.append(TEXT_2226);
    }
    stringBuffer.append(TEXT_2227);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_2228);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2229);
    }
    stringBuffer.append(TEXT_2230);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2231);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2232);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2233);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_2234);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2235);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2236);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2237);
    }
    stringBuffer.append(TEXT_2238);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2239);
    } else {
    stringBuffer.append(TEXT_2240);
    }
    stringBuffer.append(TEXT_2241);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_2242);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2243);
    }
    stringBuffer.append(TEXT_2244);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2245);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_2246);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2247);
    if (genFeature.isPrimitiveType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2248);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2249);
    } else if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2250);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2251);
    } else {
    stringBuffer.append(TEXT_2252);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2253);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2254);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_2255);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2256);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2257);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2258);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2259);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2260);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2261);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2262);
    } else {
    stringBuffer.append(TEXT_2263);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2264);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2265);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2267);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2269);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2270);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2271);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2272);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2273);
    } else {
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2275);
    }
    }
    stringBuffer.append(TEXT_2276);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2277);
    } else {
    stringBuffer.append(TEXT_2278);
    }
    stringBuffer.append(TEXT_2279);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_2280);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_2281);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2282);
    }
    stringBuffer.append(TEXT_2283);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2284);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2286);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2288);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2290);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2292);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2293);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2294);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2296);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2297);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2298);
    } else {
    stringBuffer.append(TEXT_2299);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2300);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2301);
    }
    } else {
    stringBuffer.append(TEXT_2302);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2303);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2305);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2306);
    }
    stringBuffer.append(TEXT_2307);
    }
    } else if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2308);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2309);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2310);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2311);
    } else {
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2313);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2315);
    }
    stringBuffer.append(TEXT_2316);
    }
    stringBuffer.append(TEXT_2317);
    }
    stringBuffer.append(TEXT_2318);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2319);
    } else {
    stringBuffer.append(TEXT_2320);
    }
    stringBuffer.append(TEXT_2321);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_2322);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2323);
    }
    stringBuffer.append(TEXT_2324);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2325);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_2326);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2327);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2328);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2329);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2330);
    } else {
    stringBuffer.append(TEXT_2331);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2332);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2333);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2334);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_2335);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2336);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2337);
    } else {
    stringBuffer.append(TEXT_2338);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2339);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2340);
    }
    stringBuffer.append(TEXT_2341);
    }
    stringBuffer.append(TEXT_2342);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2343);
    } else {
    stringBuffer.append(TEXT_2344);
    }
    stringBuffer.append(TEXT_2345);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_2346);
    stringBuffer.append(TEXT_2347);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2348);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2349);
    }
    stringBuffer.append(TEXT_2350);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) { String safeNameAccessor = genFeature.getSafeName(); if ("featureID".equals(safeNameAccessor)) { safeNameAccessor = "this." + safeNameAccessor; }
    stringBuffer.append(TEXT_2351);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2352);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2353);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2354);
    } else {
    if (genFeature.hasSettingDelegate()) {
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2355);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2356);
    } else {
    stringBuffer.append(TEXT_2357);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2358);
    }
    } else if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2359);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2360);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2361);
    } else {
    stringBuffer.append(TEXT_2362);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2363);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2364);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2366);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2367);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2369);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2370);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2374);
    } else {
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2376);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2377);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2378);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2380);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2381);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2382);
    } else {
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2384);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2385);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2386);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2387);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2388);
    } else {
    stringBuffer.append(TEXT_2389);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2390);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2391);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2392);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2393);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2394);
    } else {
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2398);
    }
    } else {
    stringBuffer.append(TEXT_2399);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2401);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2403);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2404);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2405);
    } else {
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2407);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2408);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2409);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2410);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2411);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2412);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2413);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2415);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2416);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2418);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2419);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2420);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2421);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2423);
    } else {
    stringBuffer.append(TEXT_2424);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2425);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2426);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2428);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2429);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2430);
    } else {
    stringBuffer.append(TEXT_2431);
    }
    stringBuffer.append(TEXT_2432);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2433);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2434);
    }
    stringBuffer.append(TEXT_2435);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2436);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2437);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2438);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2439);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2440);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2441);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2442);
    }
    stringBuffer.append(TEXT_2443);
    }
    stringBuffer.append(TEXT_2444);
    }
    stringBuffer.append(TEXT_2445);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2446);
    }
    stringBuffer.append(TEXT_2447);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2448);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2449);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2450);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2453);
    }
    stringBuffer.append(TEXT_2454);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2456);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2457);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2458);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2460);
    }
    stringBuffer.append(TEXT_2461);
    }
    stringBuffer.append(TEXT_2462);
    }
    if (genModel.isOperationReflection() && isImplementation && (!genClass.getMixinGenOperations().isEmpty() || !genClass.getOverrideGenOperations(genClass.getExtendedGenOperations(), genClass.getImplementedGenOperations()).isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty())) {
    stringBuffer.append(TEXT_2463);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2464);
    }
    stringBuffer.append(TEXT_2465);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2466);
    for (GenClass extendedGenClass : genClass.getExtendedGenClasses()) { List<GenOperation> extendedImplementedGenOperations = extendedGenClass.getImplementedGenOperations(); List<GenOperation> implementedGenOperations = genClass.getImplementedGenOperations();
    if (!genClass.getOverrideGenOperations(extendedImplementedGenOperations, implementedGenOperations).isEmpty()) {
    stringBuffer.append(TEXT_2467);
    stringBuffer.append(extendedGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2468);
    for (GenOperation genOperation : extendedImplementedGenOperations) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    if (implementedGenOperations.contains(overrideGenOperation)) {
    stringBuffer.append(TEXT_2469);
    stringBuffer.append(extendedGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2470);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2471);
    }
    }
    stringBuffer.append(TEXT_2472);
    }
    }
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2474);
    for (GenOperation genOperation : mixinGenClass.getGenOperations()) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_2475);
    stringBuffer.append(mixinGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2477);
    }
    stringBuffer.append(TEXT_2478);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2480);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_2481);
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_2482);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2484);
    }
    stringBuffer.append(TEXT_2485);
    }
    stringBuffer.append(TEXT_2486);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2487);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2488);
    }
    stringBuffer.append(TEXT_2489);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2490);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2491);
    }
    stringBuffer.append(TEXT_2492);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2493);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2494);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2495);
    }
    stringBuffer.append(TEXT_2496);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2497);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2499);
    }
    stringBuffer.append(TEXT_2500);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2501);
    }
    stringBuffer.append(TEXT_2502);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2503);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2504);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2505);
    }
    stringBuffer.append(TEXT_2506);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_2507);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2508);
    }
    if (genModel.useGenerics()) {
    LOOP: for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) {
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.isUncheckedCast()) {
    stringBuffer.append(TEXT_2509);
    break LOOP;}
    }
    }
    }
    stringBuffer.append(TEXT_2510);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2512);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_2513);
    for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { List<GenParameter> genParameters = genOperation.getGenParameters(); int size = genParameters.size();
    stringBuffer.append(TEXT_2514);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2515);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2516);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2517);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2518);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_2520);
    }
    stringBuffer.append(TEXT_2521);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2522);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2523);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2524);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_2525);
    }
    }
    stringBuffer.append(TEXT_2526);
    } else {
    stringBuffer.append(TEXT_2527);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2528);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2529);
    }
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2530);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2531);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_2532);
    stringBuffer.append(genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_2533);
    }
    stringBuffer.append(TEXT_2534);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2535);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2537);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_2538);
    }
    }
    stringBuffer.append(TEXT_2539);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2540);
    }
    stringBuffer.append(TEXT_2541);
    }
    }
    stringBuffer.append(TEXT_2542);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2543);
    } else {
    stringBuffer.append(TEXT_2544);
    }
    stringBuffer.append(TEXT_2545);
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2546);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2547);
    }
    stringBuffer.append(TEXT_2548);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2549);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2550);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2551);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2552);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2553);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2554);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2555);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2556);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2557);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2558);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2559);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2560);
    }
    stringBuffer.append(TEXT_2561);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2562);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2563);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2564);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2565);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2567);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2568);
    }
    stringBuffer.append(TEXT_2569);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2570);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2571);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2572);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_2574);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2577);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2578);
    }
    stringBuffer.append(TEXT_2579);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2581);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2583);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2585);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2586);
    } else {
    stringBuffer.append(TEXT_2587);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2589);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2590);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2591);
    }
    } else {
    stringBuffer.append(TEXT_2592);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2593);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2594);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2595);
    if (isGWT) {
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_2597);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2598);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2599);
    if (!isJDK50 && keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2600);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2601);
    } else {
    stringBuffer.append(TEXT_2602);
    }
    stringBuffer.append(TEXT_2603);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2604);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2605);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2606);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2607);
    }
    stringBuffer.append(TEXT_2608);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2609);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2610);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2612);
    } else {
    stringBuffer.append(TEXT_2613);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2614);
    }
    stringBuffer.append(TEXT_2615);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2616);
    if (!isJDK50 && valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2617);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2618);
    } else {
    stringBuffer.append(TEXT_2619);
    }
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2621);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2623);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2624);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2625);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2626);
    }
    stringBuffer.append(TEXT_2627);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2628);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2629);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2631);
    } else {
    stringBuffer.append(TEXT_2632);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2633);
    }
    stringBuffer.append(TEXT_2634);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2635);
    }
    stringBuffer.append(TEXT_2636);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2637);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2638);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2639);
    }
    if (isImplementation) {
    if (!UML2GenModelUtil.isOperationsClasses(genPackage) && UML2GenModelUtil.hasOCLOperationBodies(genClass) && (!UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass()) || !UML2GenModelUtil.isOperationsClasses(genClass.getClassExtendsGenClass().getGenPackage()))) {
    stringBuffer.append(TEXT_2640);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2641);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2642);
    }
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2644);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2646);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2647);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2649);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2650);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2651);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2652);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2653);
    }
    stringBuffer.append(TEXT_2654);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2655);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2656);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2657);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2658);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2659);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2660);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2661);
    } else {
    stringBuffer.append(TEXT_2662);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2664);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2665);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2666);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2668);
    }
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2670);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2672);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2674);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2675);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2676);
    }
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2679);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2680);
    } else {
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2682);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2683);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2684);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2687);
    }
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2690);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2691);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2692);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2693);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2695);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2697);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2698);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2699);
    } else {
    stringBuffer.append(TEXT_2700);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2702);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2703);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2704);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2706);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2707);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2708);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2709);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2710);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2711);
    } else {
    stringBuffer.append(TEXT_2712);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2713);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2714);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2715);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2716);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2717);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2718);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2719);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2720);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2721);
    }
    }
    }
    stringBuffer.append(TEXT_2722);
    if (isJDK50) { //isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2723);
    }
    }
    stringBuffer.append(TEXT_2724);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2725);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2726);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2727);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2728);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2729);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2730);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2731);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2732);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2733);
    }
    } else {
    stringBuffer.append(TEXT_2734);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2735);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2736);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2737);
    }
    }
    } else {
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2739);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2740);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2741);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2742);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2743);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2744);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2745);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2746);
    }
    } else {
    stringBuffer.append(TEXT_2747);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2749);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2750);
    }
    }
    } else {
    stringBuffer.append(TEXT_2751);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2752);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2753);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2754);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2755);
    } else {
    stringBuffer.append(TEXT_2756);
    }
    }
    stringBuffer.append(TEXT_2757);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2758);
    if (isJDK50) { //getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2759);
    }
    }
    stringBuffer.append(TEXT_2760);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2762);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType(genClass).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_2763);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2764);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2765);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2768);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2769);
    } else {
    stringBuffer.append(TEXT_2770);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2771);
    }
    } else {
    stringBuffer.append(TEXT_2772);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2773);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2774);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2775);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2776);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2777);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2778);
    } else {
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2780);
    }
    }
    stringBuffer.append(TEXT_2781);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2782);
    if (isJDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2783);
    }
    }
    stringBuffer.append(TEXT_2784);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2786);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2787);
    } else {
    stringBuffer.append(TEXT_2788);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2789);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2790);
    }
    stringBuffer.append(TEXT_2791);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2792);
    if (isJDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2793);
    }
    }
    stringBuffer.append(TEXT_2794);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2795);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2796);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_2797);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2798);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2799);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2800);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2801);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2802);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2803);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2804);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2805);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2806);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2807);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2808);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2809);
    }
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2811);
    } else {
    stringBuffer.append(TEXT_2812);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2813);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2814);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2815);
    }
    stringBuffer.append(TEXT_2816);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2817);
    }
    }
    stringBuffer.append(TEXT_2818);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2819);
    if (isJDK50) { //setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2820);
    }
    }
    stringBuffer.append(TEXT_2821);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2822);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2823);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2824);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2825);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2826);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2827);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2828);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2829);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2830);
    }
    stringBuffer.append(TEXT_2831);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2832);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2833);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2834);
    }
    stringBuffer.append(TEXT_2835);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2836);
    }
    stringBuffer.append(TEXT_2837);
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2838);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2839);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2840);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2841);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2842);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2843);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2844);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2845);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2846);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2847);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2848);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2849);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2850);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2851);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2852);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2853);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2854);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2855);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2856);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2857);
    } else {
    stringBuffer.append(TEXT_2858);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2859);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2860);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2861);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2862);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2863);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2864);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2865);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2866);
    } else {
    stringBuffer.append(TEXT_2867);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2868);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2869);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2870);
    }
    }
    stringBuffer.append(TEXT_2871);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2872);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2873);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2874);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2875);
    }
    stringBuffer.append(TEXT_2876);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2877);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2878);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2879);
    } else {
    stringBuffer.append(TEXT_2880);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2881);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2882);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2883);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2884);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2885);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2886);
    }
    stringBuffer.append(TEXT_2887);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2888);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2889);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2890);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2891);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2892);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2893);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2894);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2895);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2896);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2897);
    } else {
    stringBuffer.append(TEXT_2898);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2899);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2900);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2901);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2902);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2903);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2904);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2905);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2906);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2907);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2908);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2909);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2910);
    index++;}
    stringBuffer.append(TEXT_2911);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2912);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2913);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2914);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2915);
    }
    stringBuffer.append(TEXT_2916);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2917);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2918);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2919);
    }
    stringBuffer.append(TEXT_2920);
    } else {
    stringBuffer.append(TEXT_2921);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2922);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2923);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2924);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2925);
    }
    } else {
    stringBuffer.append(TEXT_2926);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2927);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2928);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2929);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2930);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2931);
    } else {
    stringBuffer.append(TEXT_2932);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2933);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2934);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2935);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2936);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2937);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2938);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2939);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2940);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2941);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2942);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2943);
    } else {
    stringBuffer.append(TEXT_2944);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2945);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2946);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2947);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2948);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2949);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2950);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2951);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2952);
    } else {
    stringBuffer.append(TEXT_2953);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2954);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2955);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2956);
    }
    }
    stringBuffer.append(TEXT_2957);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2958);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2959);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2960);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2961);
    }
    stringBuffer.append(TEXT_2962);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2963);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2964);
    } else {
    stringBuffer.append(TEXT_2965);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2966);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2967);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2968);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2969);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2970);
    }
    stringBuffer.append(TEXT_2971);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2972);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2973);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2974);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2975);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2976);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_2977);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2978);
    } else {
    stringBuffer.append(TEXT_2979);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2980);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2981);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2982);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2983);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2984);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2985);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2986);
    } else {
    stringBuffer.append(TEXT_2987);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2988);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2989);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2990);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2991);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2992);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2993);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2994);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2995);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2996);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2997);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2998);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2999);
    index++;}
    stringBuffer.append(TEXT_3000);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3001);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3002);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3003);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3004);
    }
    stringBuffer.append(TEXT_3005);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3006);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3007);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3008);
    }
    stringBuffer.append(TEXT_3009);
    } else {
    stringBuffer.append(TEXT_3010);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3011);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3012);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3013);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_3014);
    }
    } else {
    stringBuffer.append(TEXT_3015);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3016);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3017);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3018);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3019);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3020);
    } else {
    stringBuffer.append(TEXT_3021);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3022);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_3023);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3024);
    }
    index++;}
    }
    stringBuffer.append(TEXT_3025);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3026);
    }
    stringBuffer.append(TEXT_3027);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_3028);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3029);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3030);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3031);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3032);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3033);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3034);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3035);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3036);
    }
    stringBuffer.append(TEXT_3037);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3038);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3039);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3040);
    } else {
    stringBuffer.append(TEXT_3041);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_3042);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3043);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3044);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3045);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3046);
    }
    stringBuffer.append(TEXT_3047);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3048);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3049);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3050);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3051);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3052);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3053);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3054);
    }
    stringBuffer.append(TEXT_3055);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_3056);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3057);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3058);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3059);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3060);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3061);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3062);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3063);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3064);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3065);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3066);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3067);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3068);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3069);
    }
    stringBuffer.append(TEXT_3070);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3071);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3072);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3073);
    } else {
    stringBuffer.append(TEXT_3074);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_3075);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3076);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3077);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3078);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3079);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3080);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3081);
    }
    stringBuffer.append(TEXT_3082);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3083);
    }
    stringBuffer.append(TEXT_3084);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3085);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3086);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3087);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3088);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3089);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3090);
    }
    stringBuffer.append(TEXT_3091);
    if (isJDK50) {
    stringBuffer.append(TEXT_3092);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3093);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_3094);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3095);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3096);
    } else {
    stringBuffer.append(TEXT_3097);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3098);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_3099);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3100);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3101);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3102);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3103);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3104);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3105);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3106);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3107);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3108);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3109);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3110);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3111);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3112);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3113);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_3114);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_3115);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_3116);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3117);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_3118);
    }
    }
    stringBuffer.append(TEXT_3119);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3120);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3121);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3122);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3123);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_3124);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3125);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3126);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3127);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3128);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_3129);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_3130);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3131);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3132);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3133);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3134);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3135);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3136);
    } else {
    stringBuffer.append(TEXT_3137);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3138);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3139);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3140);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3141);
    }
    stringBuffer.append(TEXT_3142);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3143);
    index++;}
    stringBuffer.append(TEXT_3144);
    } else {
    stringBuffer.append(TEXT_3145);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3146);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3147);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3148);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3149);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3150);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3151);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3152);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3153);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3154);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3155);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3156);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3157);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3158);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3159);
    } else {
    stringBuffer.append(TEXT_3160);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3161);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3162);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3163);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3164);
    }
    stringBuffer.append(TEXT_3165);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3166);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3167);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3168);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3169);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3170);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3171);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3172);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3173);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3174);
    } else {
    stringBuffer.append(TEXT_3175);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3176);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3177);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3178);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3179);
    }
    stringBuffer.append(TEXT_3180);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3181);
    index++;}
    }
    stringBuffer.append(TEXT_3182);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3183);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3184);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3185);
    }
    stringBuffer.append(TEXT_3186);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3187);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3188);
    }
    stringBuffer.append(TEXT_3189);
    } else {
    stringBuffer.append(TEXT_3190);
    }
    stringBuffer.append(TEXT_3191);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_3192);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3193);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_3194);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3195);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3196);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_3197);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3198);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3199);
    } else {
    stringBuffer.append(TEXT_3200);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3201);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3202);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3203);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3204);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3205);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3206);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3207);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3208);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3209);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3210);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3211);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3212);
    } else {
    stringBuffer.append(TEXT_3213);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3214);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3215);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3216);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3217);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3218);
    } else {
    stringBuffer.append(TEXT_3219);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3220);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3221);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3222);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3223);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3224);
    } else {
    stringBuffer.append(TEXT_3225);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3226);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_3227);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3228);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3229);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3230);
    } else {
    stringBuffer.append(TEXT_3231);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3232);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3233);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3234);
    }
    } else {
    stringBuffer.append(TEXT_3235);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3236);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3237);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3238);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3239);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3240);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3241);
    } else {
    stringBuffer.append(TEXT_3242);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3243);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3244);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3245);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3246);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3247);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3248);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3249);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3250);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3251);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3252);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3253);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3254);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3255);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3256);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3257);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3258);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3259);
    } else {
    stringBuffer.append(TEXT_3260);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3261);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3262);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3263);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3264);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3265);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3266);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_3267);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3268);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3269);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3270);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3271);
    }
    stringBuffer.append(TEXT_3272);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3273);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_3274);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_3275);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3276);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_3277);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3278);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_3279);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_3280);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3281);
    } else {
    stringBuffer.append(TEXT_3282);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3283);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_3284);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3285);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3286);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3287);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3288);
    } else {
    stringBuffer.append(TEXT_3289);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3290);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3291);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3292);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_3293);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_3294);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3295);
    } else {
    stringBuffer.append(TEXT_3296);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3297);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3298);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_3299);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_3300);
    if (isJDK50) { //genOperation.annotations.insert.javajetinc
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_3301);
    }
    }
    stringBuffer.append(TEXT_3302);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_3303);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3304);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_3305);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_3306);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_3307);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3308);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3309);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_3310);
    } else {
    stringBuffer.append(TEXT_3311);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3312);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3313);
    }
    }
    stringBuffer.append(TEXT_3314);
    }
    }
    stringBuffer.append(TEXT_3315);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_3316);
    return stringBuffer.toString();
  }
}
