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
  protected final String TEXT_4 = NL + " */";
  protected final String TEXT_5 = NL + "package ";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL + "package ";
  protected final String TEXT_8 = ";";
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the model object '<em><b>";
  protected final String TEXT_12 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_13 = NL + " *" + NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_14 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_15 = NL + " *";
  protected final String TEXT_16 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * <ul>";
  protected final String TEXT_17 = NL + " *   <li>{@link ";
  protected final String TEXT_18 = "#";
  protected final String TEXT_19 = " <em>";
  protected final String TEXT_20 = "</em>}</li>";
  protected final String TEXT_21 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_22 = NL + " *";
  protected final String TEXT_23 = NL + " * @see ";
  protected final String TEXT_24 = "#get";
  protected final String TEXT_25 = "()";
  protected final String TEXT_26 = NL + " * @model ";
  protected final String TEXT_27 = NL + " *        ";
  protected final String TEXT_28 = NL + " * @model";
  protected final String TEXT_29 = NL + " * @extends ";
  protected final String TEXT_30 = NL + " * @generated" + NL + " */";
  protected final String TEXT_31 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_32 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " * <p>";
  protected final String TEXT_33 = NL + " * The following features are implemented:" + NL + " * <ul>";
  protected final String TEXT_34 = NL + " *   <li>{@link ";
  protected final String TEXT_35 = "#";
  protected final String TEXT_36 = " <em>";
  protected final String TEXT_37 = "</em>}</li>";
  protected final String TEXT_38 = NL + " * </ul>";
  protected final String TEXT_39 = NL + " * </p>" + NL + " *" + NL + " * @generated" + NL + " */";
  protected final String TEXT_40 = NL + "public";
  protected final String TEXT_41 = " abstract";
  protected final String TEXT_42 = " class ";
  protected final String TEXT_43 = NL + "public interface ";
  protected final String TEXT_44 = NL + "{";
  protected final String TEXT_45 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_46 = " copyright = ";
  protected final String TEXT_47 = ";";
  protected final String TEXT_48 = NL;
  protected final String TEXT_49 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_50 = " mofDriverNumber = \"";
  protected final String TEXT_51 = "\";";
  protected final String TEXT_52 = NL;
  protected final String TEXT_53 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL;
  protected final String TEXT_54 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_55 = NL + "\t@";
  protected final String TEXT_56 = NL + "\tprotected Object[] ";
  protected final String TEXT_57 = ";" + NL;
  protected final String TEXT_58 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_59 = NL + "\t@";
  protected final String TEXT_60 = NL + "\tprotected int ";
  protected final String TEXT_61 = ";" + NL;
  protected final String TEXT_62 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_63 = NL + "\t@";
  protected final String TEXT_64 = NL + "\tprotected int ";
  protected final String TEXT_65 = " = 0;" + NL;
  protected final String TEXT_66 = NL + "\t/**" + NL + "\t * The cached setting delegate for the '{@link #";
  protected final String TEXT_67 = "() <em>";
  protected final String TEXT_68 = "</em>}' ";
  protected final String TEXT_69 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_70 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_71 = NL + "\t@";
  protected final String TEXT_72 = NL + "\tprotected ";
  protected final String TEXT_73 = ".Internal.SettingDelegate ";
  protected final String TEXT_74 = "__ESETTING_DELEGATE = ((";
  protected final String TEXT_75 = ".Internal)";
  protected final String TEXT_76 = ").getSettingDelegate();" + NL;
  protected final String TEXT_77 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_78 = "() <em>";
  protected final String TEXT_79 = "</em>}' ";
  protected final String TEXT_80 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_81 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_82 = NL + "\t@";
  protected final String TEXT_83 = NL + "\tprotected ";
  protected final String TEXT_84 = " ";
  protected final String TEXT_85 = ";" + NL;
  protected final String TEXT_86 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_87 = "() <em>";
  protected final String TEXT_88 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_89 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_90 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_91 = NL + "\tprotected static final ";
  protected final String TEXT_92 = "[] ";
  protected final String TEXT_93 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_94 = " [0]";
  protected final String TEXT_95 = ";" + NL;
  protected final String TEXT_96 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_97 = "() <em>";
  protected final String TEXT_98 = "</em>}' ";
  protected final String TEXT_99 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_100 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_101 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_102 = NL + "\tprotected static final ";
  protected final String TEXT_103 = " ";
  protected final String TEXT_104 = "; // TODO The default value literal \"";
  protected final String TEXT_105 = "\" is not valid.";
  protected final String TEXT_106 = " = ";
  protected final String TEXT_107 = ";";
  protected final String TEXT_108 = NL;
  protected final String TEXT_109 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_110 = NL + "\t@";
  protected final String TEXT_111 = NL + "\tprotected int ";
  protected final String TEXT_112 = " = 0;" + NL;
  protected final String TEXT_113 = NL + "\t/**" + NL + "\t * The offset of the flags representing the value of the '{@link #";
  protected final String TEXT_114 = "() <em>";
  protected final String TEXT_115 = "</em>}' ";
  protected final String TEXT_116 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_117 = "_EFLAG_OFFSET = ";
  protected final String TEXT_118 = ";" + NL + "" + NL + "\t/**" + NL + "\t * The flags representing the default value of the '{@link #";
  protected final String TEXT_119 = "() <em>";
  protected final String TEXT_120 = "</em>}' ";
  protected final String TEXT_121 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_122 = "_EFLAG_DEFAULT = ";
  protected final String TEXT_123 = ".ordinal()";
  protected final String TEXT_124 = ".VALUES.indexOf(";
  protected final String TEXT_125 = ")";
  protected final String TEXT_126 = " << ";
  protected final String TEXT_127 = "_EFLAG_OFFSET;" + NL + "" + NL + "\t/**" + NL + "\t * The array of enumeration values for '{@link ";
  protected final String TEXT_128 = " ";
  protected final String TEXT_129 = "}'" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprivate static final ";
  protected final String TEXT_130 = "[] ";
  protected final String TEXT_131 = "_EFLAG_VALUES = ";
  protected final String TEXT_132 = ".values()";
  protected final String TEXT_133 = "(";
  protected final String TEXT_134 = "[])";
  protected final String TEXT_135 = ".VALUES.toArray(new ";
  protected final String TEXT_136 = "[";
  protected final String TEXT_137 = ".VALUES.size()])";
  protected final String TEXT_138 = ";" + NL;
  protected final String TEXT_139 = NL + "\t/**" + NL + "\t * The flag";
  protected final String TEXT_140 = " representing the value of the '{@link #";
  protected final String TEXT_141 = "() <em>";
  protected final String TEXT_142 = "</em>}' ";
  protected final String TEXT_143 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_144 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_145 = "_EFLAG = ";
  protected final String TEXT_146 = " << ";
  protected final String TEXT_147 = "_EFLAG_OFFSET";
  protected final String TEXT_148 = ";" + NL;
  protected final String TEXT_149 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_150 = "() <em>";
  protected final String TEXT_151 = "</em>}' ";
  protected final String TEXT_152 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_153 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_154 = NL + "\t@";
  protected final String TEXT_155 = NL + "\tprotected ";
  protected final String TEXT_156 = " ";
  protected final String TEXT_157 = " = ";
  protected final String TEXT_158 = ";" + NL;
  protected final String TEXT_159 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_160 = NL + "\t@";
  protected final String TEXT_161 = NL + "\tprotected int ";
  protected final String TEXT_162 = " = 0;" + NL;
  protected final String TEXT_163 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_164 = " ";
  protected final String TEXT_165 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_166 = "_ESETFLAG = 1 << ";
  protected final String TEXT_167 = ";" + NL;
  protected final String TEXT_168 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_169 = " ";
  protected final String TEXT_170 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_171 = NL + "\t@";
  protected final String TEXT_172 = NL + "\tprotected boolean ";
  protected final String TEXT_173 = "ESet;" + NL;
  protected final String TEXT_174 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_175 = " = ";
  protected final String TEXT_176 = ".getFeatureID(";
  protected final String TEXT_177 = ") - ";
  protected final String TEXT_178 = ";" + NL;
  protected final String TEXT_179 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_180 = " = ";
  protected final String TEXT_181 = ".getFeatureID(";
  protected final String TEXT_182 = ") - ";
  protected final String TEXT_183 = ";" + NL;
  protected final String TEXT_184 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int \"EOPERATION_OFFSET_CORRECTION\" = ";
  protected final String TEXT_185 = ".getOperationID(";
  protected final String TEXT_186 = ") - ";
  protected final String TEXT_187 = ";" + NL;
  protected final String TEXT_188 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_189 = "public";
  protected final String TEXT_190 = "protected";
  protected final String TEXT_191 = " ";
  protected final String TEXT_192 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_193 = NL + "\t\t";
  protected final String TEXT_194 = " |= ";
  protected final String TEXT_195 = "_EFLAG";
  protected final String TEXT_196 = "_DEFAULT";
  protected final String TEXT_197 = ";";
  protected final String TEXT_198 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_199 = NL + "\t@Override";
  protected final String TEXT_200 = NL + "\tprotected ";
  protected final String TEXT_201 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_202 = ";" + NL + "\t}" + NL;
  protected final String TEXT_203 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_204 = NL + "\t@Override";
  protected final String TEXT_205 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_206 = ";" + NL + "\t}" + NL;
  protected final String TEXT_207 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_208 = NL + "\t";
  protected final String TEXT_209 = "[] ";
  protected final String TEXT_210 = "();" + NL;
  protected final String TEXT_211 = NL + "\tpublic ";
  protected final String TEXT_212 = "[] ";
  protected final String TEXT_213 = "()" + NL + "\t{";
  protected final String TEXT_214 = NL + "\t\t";
  protected final String TEXT_215 = " list = (";
  protected final String TEXT_216 = ")";
  protected final String TEXT_217 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_218 = "(";
  protected final String TEXT_219 = "[])";
  protected final String TEXT_220 = "_EEMPTY_ARRAY;";
  protected final String TEXT_221 = NL + "\t\tif (";
  protected final String TEXT_222 = " == null || ";
  protected final String TEXT_223 = ".isEmpty()) return ";
  protected final String TEXT_224 = "(";
  protected final String TEXT_225 = "[])";
  protected final String TEXT_226 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_227 = " list = (";
  protected final String TEXT_228 = ")";
  protected final String TEXT_229 = ";";
  protected final String TEXT_230 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_231 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_232 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_233 = NL + "\t";
  protected final String TEXT_234 = " get";
  protected final String TEXT_235 = "(int index);" + NL;
  protected final String TEXT_236 = NL + "\tpublic ";
  protected final String TEXT_237 = " get";
  protected final String TEXT_238 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_239 = "(";
  protected final String TEXT_240 = ")";
  protected final String TEXT_241 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_242 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_243 = NL + "\tint get";
  protected final String TEXT_244 = "Length();" + NL;
  protected final String TEXT_245 = NL + "\tpublic int get";
  protected final String TEXT_246 = "Length()" + NL + "\t{";
  protected final String TEXT_247 = NL + "\t\treturn ";
  protected final String TEXT_248 = "().size();";
  protected final String TEXT_249 = NL + "\t\treturn ";
  protected final String TEXT_250 = " == null ? 0 : ";
  protected final String TEXT_251 = ".size();";
  protected final String TEXT_252 = NL + "\t}" + NL;
  protected final String TEXT_253 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_254 = NL + "\tvoid set";
  protected final String TEXT_255 = "(";
  protected final String TEXT_256 = "[] new";
  protected final String TEXT_257 = ");" + NL;
  protected final String TEXT_258 = NL + "\tpublic void set";
  protected final String TEXT_259 = "(";
  protected final String TEXT_260 = "[] new";
  protected final String TEXT_261 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_262 = ")";
  protected final String TEXT_263 = "()).setData(new";
  protected final String TEXT_264 = ".length, new";
  protected final String TEXT_265 = ");" + NL + "\t}" + NL;
  protected final String TEXT_266 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_267 = NL + "\tvoid set";
  protected final String TEXT_268 = "(int index, ";
  protected final String TEXT_269 = " element);" + NL;
  protected final String TEXT_270 = NL + "\tpublic void set";
  protected final String TEXT_271 = "(int index, ";
  protected final String TEXT_272 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_273 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_274 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_275 = "</b></em>' ";
  protected final String TEXT_276 = ".";
  protected final String TEXT_277 = NL + "\t * The key is of type ";
  protected final String TEXT_278 = "list of {@link ";
  protected final String TEXT_279 = "}";
  protected final String TEXT_280 = "{@link ";
  protected final String TEXT_281 = "}";
  protected final String TEXT_282 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_283 = "list of {@link ";
  protected final String TEXT_284 = "}";
  protected final String TEXT_285 = "{@link ";
  protected final String TEXT_286 = "}";
  protected final String TEXT_287 = ",";
  protected final String TEXT_288 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_289 = "}";
  protected final String TEXT_290 = ".";
  protected final String TEXT_291 = NL + "\t * The default value is <code>";
  protected final String TEXT_292 = "</code>.";
  protected final String TEXT_293 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_294 = "}.";
  protected final String TEXT_295 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_296 = "#";
  protected final String TEXT_297 = " <em>";
  protected final String TEXT_298 = "</em>}'.";
  protected final String TEXT_299 = NL + "\t * <p>" + NL + "\t * This feature subsets the following features:" + NL + "\t * <ul>";
  protected final String TEXT_300 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_301 = "#";
  protected final String TEXT_302 = "() <em>";
  protected final String TEXT_303 = "</em>}'</li>";
  protected final String TEXT_304 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_305 = NL + "\t * <p>" + NL + "\t * This feature redefines the following features:" + NL + "\t * <ul>";
  protected final String TEXT_306 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_307 = "#";
  protected final String TEXT_308 = "() <em>";
  protected final String TEXT_309 = "</em>}'</li>";
  protected final String TEXT_310 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_311 = NL + "\t * This feature is a derived union.";
  protected final String TEXT_312 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_313 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_314 = "</em>' ";
  protected final String TEXT_315 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_316 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_317 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_318 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_319 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_320 = "</em>' ";
  protected final String TEXT_321 = ".";
  protected final String TEXT_322 = NL + "\t * @see ";
  protected final String TEXT_323 = NL + "\t * @see #isSet";
  protected final String TEXT_324 = "()";
  protected final String TEXT_325 = NL + "\t * @see #unset";
  protected final String TEXT_326 = "()";
  protected final String TEXT_327 = NL + "\t * @see #set";
  protected final String TEXT_328 = "(";
  protected final String TEXT_329 = ")";
  protected final String TEXT_330 = NL + "\t * @see ";
  protected final String TEXT_331 = "#get";
  protected final String TEXT_332 = "()";
  protected final String TEXT_333 = NL + "\t * @see ";
  protected final String TEXT_334 = "#";
  protected final String TEXT_335 = NL + "\t * @model ";
  protected final String TEXT_336 = NL + "\t *        ";
  protected final String TEXT_337 = NL + "\t * @model";
  protected final String TEXT_338 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_339 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_340 = NL + "\t@Override";
  protected final String TEXT_341 = NL + "\t";
  protected final String TEXT_342 = " ";
  protected final String TEXT_343 = "();" + NL;
  protected final String TEXT_344 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_345 = NL + "\tpublic ";
  protected final String TEXT_346 = " ";
  protected final String TEXT_347 = "_";
  protected final String TEXT_348 = "()" + NL + "\t{";
  protected final String TEXT_349 = NL + "\t\treturn ";
  protected final String TEXT_350 = "(";
  protected final String TEXT_351 = "(";
  protected final String TEXT_352 = ")eDynamicGet(";
  protected final String TEXT_353 = ", ";
  protected final String TEXT_354 = ", true, ";
  protected final String TEXT_355 = ")";
  protected final String TEXT_356 = ").";
  protected final String TEXT_357 = "()";
  protected final String TEXT_358 = ";";
  protected final String TEXT_359 = NL + "\t\t";
  protected final String TEXT_360 = NL + "\t\treturn ";
  protected final String TEXT_361 = "(";
  protected final String TEXT_362 = "(";
  protected final String TEXT_363 = ")eGet(";
  protected final String TEXT_364 = ", true)";
  protected final String TEXT_365 = ").";
  protected final String TEXT_366 = "()";
  protected final String TEXT_367 = ";";
  protected final String TEXT_368 = NL + "\t\treturn ";
  protected final String TEXT_369 = "(";
  protected final String TEXT_370 = "(";
  protected final String TEXT_371 = ")";
  protected final String TEXT_372 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false)";
  protected final String TEXT_373 = ").";
  protected final String TEXT_374 = "()";
  protected final String TEXT_375 = ";";
  protected final String TEXT_376 = NL + "\t\t";
  protected final String TEXT_377 = " ";
  protected final String TEXT_378 = " = (";
  protected final String TEXT_379 = ")eVirtualGet(";
  protected final String TEXT_380 = ");";
  protected final String TEXT_381 = NL + "\t\tif (";
  protected final String TEXT_382 = " == null)" + NL + "\t\t{";
  protected final String TEXT_383 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_384 = ", ";
  protected final String TEXT_385 = " = new ";
  protected final String TEXT_386 = ");";
  protected final String TEXT_387 = NL + "\t\t\t";
  protected final String TEXT_388 = " = new ";
  protected final String TEXT_389 = ";";
  protected final String TEXT_390 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_391 = ";";
  protected final String TEXT_392 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_393 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_394 = ")";
  protected final String TEXT_395 = "eContainer";
  protected final String TEXT_396 = "eInternalContainer";
  protected final String TEXT_397 = "();";
  protected final String TEXT_398 = NL + "\t\t";
  protected final String TEXT_399 = " ";
  protected final String TEXT_400 = " = (";
  protected final String TEXT_401 = ")eVirtualGet(";
  protected final String TEXT_402 = ", ";
  protected final String TEXT_403 = ");";
  protected final String TEXT_404 = NL + "\t\tif (";
  protected final String TEXT_405 = " != null && ";
  protected final String TEXT_406 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_407 = " old";
  protected final String TEXT_408 = " = (";
  protected final String TEXT_409 = ")";
  protected final String TEXT_410 = ";" + NL + "\t\t\t";
  protected final String TEXT_411 = " = ";
  protected final String TEXT_412 = "eResolveProxy(old";
  protected final String TEXT_413 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_414 = " != old";
  protected final String TEXT_415 = ")" + NL + "\t\t\t{";
  protected final String TEXT_416 = NL + "\t\t\t\t";
  protected final String TEXT_417 = " new";
  protected final String TEXT_418 = " = (";
  protected final String TEXT_419 = ")";
  protected final String TEXT_420 = ";";
  protected final String TEXT_421 = NL + "\t\t\t\t";
  protected final String TEXT_422 = " msgs = old";
  protected final String TEXT_423 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_424 = ", null, null);";
  protected final String TEXT_425 = NL + "\t\t\t\t";
  protected final String TEXT_426 = " msgs =  old";
  protected final String TEXT_427 = ".eInverseRemove(this, ";
  protected final String TEXT_428 = ", ";
  protected final String TEXT_429 = ".class, null);";
  protected final String TEXT_430 = NL + "\t\t\t\tif (new";
  protected final String TEXT_431 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_432 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_433 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_434 = ", null, msgs);";
  protected final String TEXT_435 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_436 = ".eInverseAdd(this, ";
  protected final String TEXT_437 = ", ";
  protected final String TEXT_438 = ".class, msgs);";
  protected final String TEXT_439 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_440 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_441 = ", ";
  protected final String TEXT_442 = ");";
  protected final String TEXT_443 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_444 = "(this, ";
  protected final String TEXT_445 = ".RESOLVE, ";
  protected final String TEXT_446 = ", old";
  protected final String TEXT_447 = ", ";
  protected final String TEXT_448 = "));";
  protected final String TEXT_449 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_450 = NL + "\t\treturn (";
  protected final String TEXT_451 = ")eVirtualGet(";
  protected final String TEXT_452 = ", ";
  protected final String TEXT_453 = ");";
  protected final String TEXT_454 = NL + "\t\treturn (";
  protected final String TEXT_455 = " & ";
  protected final String TEXT_456 = "_EFLAG) != 0;";
  protected final String TEXT_457 = NL + "\t\treturn ";
  protected final String TEXT_458 = "_EFLAG_VALUES[(";
  protected final String TEXT_459 = " & ";
  protected final String TEXT_460 = "_EFLAG) >>> ";
  protected final String TEXT_461 = "_EFLAG_OFFSET];";
  protected final String TEXT_462 = NL + "\t\treturn ";
  protected final String TEXT_463 = ";";
  protected final String TEXT_464 = NL + "\t\t";
  protected final String TEXT_465 = " ";
  protected final String TEXT_466 = " = basicGet";
  protected final String TEXT_467 = "();" + NL + "\t\treturn ";
  protected final String TEXT_468 = " != null && ";
  protected final String TEXT_469 = ".eIsProxy() ? ";
  protected final String TEXT_470 = "eResolveProxy((";
  protected final String TEXT_471 = ")";
  protected final String TEXT_472 = ") : ";
  protected final String TEXT_473 = ";";
  protected final String TEXT_474 = NL + "\t\treturn new ";
  protected final String TEXT_475 = "((";
  protected final String TEXT_476 = ".Internal)((";
  protected final String TEXT_477 = ".Internal.Wrapper)get";
  protected final String TEXT_478 = "()).featureMap().";
  protected final String TEXT_479 = "list(";
  protected final String TEXT_480 = "));";
  protected final String TEXT_481 = NL + "\t\treturn (";
  protected final String TEXT_482 = ")get";
  protected final String TEXT_483 = "().";
  protected final String TEXT_484 = "list(";
  protected final String TEXT_485 = ");";
  protected final String TEXT_486 = NL + "\t\treturn ((";
  protected final String TEXT_487 = ".Internal.Wrapper)get";
  protected final String TEXT_488 = "()).featureMap().list(";
  protected final String TEXT_489 = ");";
  protected final String TEXT_490 = NL + "\t\treturn get";
  protected final String TEXT_491 = "().list(";
  protected final String TEXT_492 = ");";
  protected final String TEXT_493 = NL + "\t\treturn ";
  protected final String TEXT_494 = "(";
  protected final String TEXT_495 = "(";
  protected final String TEXT_496 = ")";
  protected final String TEXT_497 = "((";
  protected final String TEXT_498 = ".Internal.Wrapper)get";
  protected final String TEXT_499 = "()).featureMap().get(";
  protected final String TEXT_500 = ", true)";
  protected final String TEXT_501 = ").";
  protected final String TEXT_502 = "()";
  protected final String TEXT_503 = ";";
  protected final String TEXT_504 = NL + "\t\treturn ";
  protected final String TEXT_505 = "(";
  protected final String TEXT_506 = "(";
  protected final String TEXT_507 = ")";
  protected final String TEXT_508 = "get";
  protected final String TEXT_509 = "().get(";
  protected final String TEXT_510 = ", true)";
  protected final String TEXT_511 = ").";
  protected final String TEXT_512 = "()";
  protected final String TEXT_513 = ";";
  protected final String TEXT_514 = NL + "\t\t";
  protected final String TEXT_515 = NL + "\t\t";
  protected final String TEXT_516 = NL + "\t\t";
  protected final String TEXT_517 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_518 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_519 = NL + "\t\t\t";
  protected final String TEXT_520 = " result = (";
  protected final String TEXT_521 = ") cache.get(";
  protected final String TEXT_522 = "eResource(), ";
  protected final String TEXT_523 = "this, ";
  protected final String TEXT_524 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_525 = "eResource(), ";
  protected final String TEXT_526 = "this, ";
  protected final String TEXT_527 = ", result = ";
  protected final String TEXT_528 = "new ";
  protected final String TEXT_529 = "(";
  protected final String TEXT_530 = ".";
  protected final String TEXT_531 = "(this)";
  protected final String TEXT_532 = ")";
  protected final String TEXT_533 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_534 = ".";
  protected final String TEXT_535 = "()";
  protected final String TEXT_536 = ";" + NL + "\t\t}";
  protected final String TEXT_537 = NL + "\t\treturn ";
  protected final String TEXT_538 = ".";
  protected final String TEXT_539 = "(this);";
  protected final String TEXT_540 = NL + "\t\t";
  protected final String TEXT_541 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_542 = " eResource = eResource();";
  protected final String TEXT_543 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_544 = NL + "\t\t\t";
  protected final String TEXT_545 = " ";
  protected final String TEXT_546 = " = (";
  protected final String TEXT_547 = ") cache.get(eResource, this, ";
  protected final String TEXT_548 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_549 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_550 = ", ";
  protected final String TEXT_551 = " = new ";
  protected final String TEXT_552 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_553 = ";" + NL + "\t\t}";
  protected final String TEXT_554 = NL + "\t\treturn new ";
  protected final String TEXT_555 = ";";
  protected final String TEXT_556 = NL + "\t\t";
  protected final String TEXT_557 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_558 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_559 = " method = getClass().getMethod(\"";
  protected final String TEXT_560 = "\", null);";
  protected final String TEXT_561 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_562 = NL + "\t\t\t\t";
  protected final String TEXT_563 = " ";
  protected final String TEXT_564 = " = (";
  protected final String TEXT_565 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_566 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_567 = " union = ";
  protected final String TEXT_568 = "Helper(new ";
  protected final String TEXT_569 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_570 = " = new ";
  protected final String TEXT_571 = "(this, ";
  protected final String TEXT_572 = "null";
  protected final String TEXT_573 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_574 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_575 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_576 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_577 = NL + "\t\t\t";
  protected final String TEXT_578 = " ";
  protected final String TEXT_579 = " = (";
  protected final String TEXT_580 = ") cache.get(eResource(), this, ";
  protected final String TEXT_581 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_582 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_583 = " union = ";
  protected final String TEXT_584 = "Helper(new ";
  protected final String TEXT_585 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_586 = ", ";
  protected final String TEXT_587 = " = new ";
  protected final String TEXT_588 = "(this, ";
  protected final String TEXT_589 = "null";
  protected final String TEXT_590 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_591 = ";";
  protected final String TEXT_592 = NL + "\t\t}";
  protected final String TEXT_593 = NL + "\t\t";
  protected final String TEXT_594 = " union = ";
  protected final String TEXT_595 = "Helper(new ";
  protected final String TEXT_596 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_597 = "(this, ";
  protected final String TEXT_598 = "null";
  protected final String TEXT_599 = ", union.size(), union.toArray());";
  protected final String TEXT_600 = NL + "\t\tif (isSet";
  protected final String TEXT_601 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_602 = "();" + NL + "\t\t}";
  protected final String TEXT_603 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_604 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_605 = "();" + NL + "\t\t}";
  protected final String TEXT_606 = NL + "\t\t";
  protected final String TEXT_607 = " ";
  protected final String TEXT_608 = " = ";
  protected final String TEXT_609 = "();" + NL + "\t\tif (";
  protected final String TEXT_610 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_611 = ";" + NL + "\t\t}";
  protected final String TEXT_612 = NL + "\t\treturn ";
  protected final String TEXT_613 = "super.";
  protected final String TEXT_614 = "()";
  protected final String TEXT_615 = "null";
  protected final String TEXT_616 = ";";
  protected final String TEXT_617 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_618 = "' ";
  protected final String TEXT_619 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_620 = NL + "\t}" + NL;
  protected final String TEXT_621 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_622 = NL + "\t@Override";
  protected final String TEXT_623 = NL + "\tpublic ";
  protected final String TEXT_624 = " basicGet";
  protected final String TEXT_625 = "()" + NL + "\t{";
  protected final String TEXT_626 = NL + "\t\treturn (";
  protected final String TEXT_627 = ")eDynamicGet(";
  protected final String TEXT_628 = ", ";
  protected final String TEXT_629 = ", false, ";
  protected final String TEXT_630 = ");";
  protected final String TEXT_631 = NL + "\t\treturn ";
  protected final String TEXT_632 = "(";
  protected final String TEXT_633 = "(";
  protected final String TEXT_634 = ")";
  protected final String TEXT_635 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false)";
  protected final String TEXT_636 = ").";
  protected final String TEXT_637 = "()";
  protected final String TEXT_638 = ";";
  protected final String TEXT_639 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_640 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_641 = ")eInternalContainer();";
  protected final String TEXT_642 = NL + "\t\treturn (";
  protected final String TEXT_643 = ")eVirtualGet(";
  protected final String TEXT_644 = ");";
  protected final String TEXT_645 = NL + "\t\treturn ";
  protected final String TEXT_646 = ";";
  protected final String TEXT_647 = NL + "\t\treturn (";
  protected final String TEXT_648 = ")((";
  protected final String TEXT_649 = ".Internal.Wrapper)get";
  protected final String TEXT_650 = "()).featureMap().get(";
  protected final String TEXT_651 = ", false);";
  protected final String TEXT_652 = NL + "\t\treturn (";
  protected final String TEXT_653 = ")get";
  protected final String TEXT_654 = "().get(";
  protected final String TEXT_655 = ", false);";
  protected final String TEXT_656 = NL + "\t\t";
  protected final String TEXT_657 = NL + "\t\treturn ";
  protected final String TEXT_658 = ".";
  protected final String TEXT_659 = "(this);";
  protected final String TEXT_660 = NL + "\t\tif (isSet";
  protected final String TEXT_661 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_662 = "basicGet";
  protected final String TEXT_663 = "();" + NL + "\t\t}";
  protected final String TEXT_664 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_665 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_666 = "basicGet";
  protected final String TEXT_667 = "();" + NL + "\t\t}";
  protected final String TEXT_668 = NL + "\t\t";
  protected final String TEXT_669 = " ";
  protected final String TEXT_670 = " = ";
  protected final String TEXT_671 = "basicGet";
  protected final String TEXT_672 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_673 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_674 = ";" + NL + "\t\t}";
  protected final String TEXT_675 = NL + "\t\treturn ";
  protected final String TEXT_676 = "super.basicGet";
  protected final String TEXT_677 = "()";
  protected final String TEXT_678 = "null";
  protected final String TEXT_679 = ";";
  protected final String TEXT_680 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_681 = "' ";
  protected final String TEXT_682 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_683 = NL + "\t}" + NL;
  protected final String TEXT_684 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_685 = NL + "\t@Override";
  protected final String TEXT_686 = NL + "\tpublic ";
  protected final String TEXT_687 = " basicSet";
  protected final String TEXT_688 = "(";
  protected final String TEXT_689 = " new";
  protected final String TEXT_690 = ", ";
  protected final String TEXT_691 = " msgs)" + NL + "\t{";
  protected final String TEXT_692 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_693 = ")new";
  protected final String TEXT_694 = ", ";
  protected final String TEXT_695 = ", msgs);";
  protected final String TEXT_696 = NL + "\t\t";
  protected final String TEXT_697 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_698 = NL + "\t\t\t";
  protected final String TEXT_699 = " ";
  protected final String TEXT_700 = " = ";
  protected final String TEXT_701 = "();";
  protected final String TEXT_702 = NL + "\t\t\tObject ";
  protected final String TEXT_703 = " = eVirtualGet(";
  protected final String TEXT_704 = ");";
  protected final String TEXT_705 = NL + "\t\t\tif (";
  protected final String TEXT_706 = " != null && ";
  protected final String TEXT_707 = " != new";
  protected final String TEXT_708 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_709 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_710 = NL + "\t\t\tif (new";
  protected final String TEXT_711 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_712 = NL + "\t\t\t\t";
  protected final String TEXT_713 = " ";
  protected final String TEXT_714 = " = ";
  protected final String TEXT_715 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_716 = ".contains(new";
  protected final String TEXT_717 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_718 = ".add(new";
  protected final String TEXT_719 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_720 = NL + "\t\t\t\t";
  protected final String TEXT_721 = " ";
  protected final String TEXT_722 = " = ";
  protected final String TEXT_723 = "();";
  protected final String TEXT_724 = NL + "\t\t\t\tObject ";
  protected final String TEXT_725 = " = eVirtualGet(";
  protected final String TEXT_726 = ");";
  protected final String TEXT_727 = NL + "\t\t\t\tif (new";
  protected final String TEXT_728 = " != ";
  protected final String TEXT_729 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_730 = "(new";
  protected final String TEXT_731 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_732 = NL + "\t\t\t}";
  protected final String TEXT_733 = NL + "\t\t}";
  protected final String TEXT_734 = NL + "\t\treturn msgs;";
  protected final String TEXT_735 = NL + "\t\tmsgs = eDynamicInverseAdd((";
  protected final String TEXT_736 = ")new";
  protected final String TEXT_737 = ", ";
  protected final String TEXT_738 = ", msgs);";
  protected final String TEXT_739 = NL + "\t\t";
  protected final String TEXT_740 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_741 = NL + "\t\t\t";
  protected final String TEXT_742 = " ";
  protected final String TEXT_743 = " = ";
  protected final String TEXT_744 = "();";
  protected final String TEXT_745 = NL + "\t\t\tObject ";
  protected final String TEXT_746 = " = eVirtualGet(";
  protected final String TEXT_747 = ");";
  protected final String TEXT_748 = NL + "\t\t\tif (";
  protected final String TEXT_749 = " != null && ";
  protected final String TEXT_750 = " != new";
  protected final String TEXT_751 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_752 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_753 = NL + "\t\t\tif (new";
  protected final String TEXT_754 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_755 = NL + "\t\t\t\t";
  protected final String TEXT_756 = " ";
  protected final String TEXT_757 = " = ";
  protected final String TEXT_758 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_759 = ".contains(new";
  protected final String TEXT_760 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_761 = ".add(new";
  protected final String TEXT_762 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_763 = NL + "\t\t\t\t";
  protected final String TEXT_764 = " ";
  protected final String TEXT_765 = " = ";
  protected final String TEXT_766 = "();";
  protected final String TEXT_767 = NL + "\t\t\t\tObject ";
  protected final String TEXT_768 = " = eVirtualGet(";
  protected final String TEXT_769 = ");";
  protected final String TEXT_770 = NL + "\t\t\t\tif (new";
  protected final String TEXT_771 = " != ";
  protected final String TEXT_772 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_773 = "(new";
  protected final String TEXT_774 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_775 = NL + "\t\t\t}";
  protected final String TEXT_776 = NL + "\t\t}";
  protected final String TEXT_777 = NL + "\t\treturn msgs;";
  protected final String TEXT_778 = NL + "\t\tObject old";
  protected final String TEXT_779 = " = eVirtualSet(";
  protected final String TEXT_780 = ", new";
  protected final String TEXT_781 = ");";
  protected final String TEXT_782 = NL + "\t\t";
  protected final String TEXT_783 = " old";
  protected final String TEXT_784 = " = ";
  protected final String TEXT_785 = ";" + NL + "\t\t";
  protected final String TEXT_786 = " = new";
  protected final String TEXT_787 = ";";
  protected final String TEXT_788 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_789 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_790 = NL + "\t\tboolean old";
  protected final String TEXT_791 = "ESet = (";
  protected final String TEXT_792 = " & ";
  protected final String TEXT_793 = "_ESETFLAG) != 0;";
  protected final String TEXT_794 = NL + "\t\t";
  protected final String TEXT_795 = " |= ";
  protected final String TEXT_796 = "_ESETFLAG;";
  protected final String TEXT_797 = NL + "\t\tboolean old";
  protected final String TEXT_798 = "ESet = ";
  protected final String TEXT_799 = "ESet;";
  protected final String TEXT_800 = NL + "\t\t";
  protected final String TEXT_801 = "ESet = true;";
  protected final String TEXT_802 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_803 = NL + "\t\t\t";
  protected final String TEXT_804 = " notification = new ";
  protected final String TEXT_805 = "(this, ";
  protected final String TEXT_806 = ".SET, ";
  protected final String TEXT_807 = ", ";
  protected final String TEXT_808 = "isSetChange ? null : old";
  protected final String TEXT_809 = "old";
  protected final String TEXT_810 = ", new";
  protected final String TEXT_811 = ", ";
  protected final String TEXT_812 = "isSetChange";
  protected final String TEXT_813 = "!old";
  protected final String TEXT_814 = "ESet";
  protected final String TEXT_815 = ");";
  protected final String TEXT_816 = NL + "\t\t\t";
  protected final String TEXT_817 = " notification = new ";
  protected final String TEXT_818 = "(this, ";
  protected final String TEXT_819 = ".SET, ";
  protected final String TEXT_820 = ", ";
  protected final String TEXT_821 = "old";
  protected final String TEXT_822 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_823 = "old";
  protected final String TEXT_824 = ", new";
  protected final String TEXT_825 = ");";
  protected final String TEXT_826 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_827 = NL + "\t\t";
  protected final String TEXT_828 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_829 = NL + "\t\t\t";
  protected final String TEXT_830 = " ";
  protected final String TEXT_831 = " = ";
  protected final String TEXT_832 = "();";
  protected final String TEXT_833 = NL + "\t\t\tObject ";
  protected final String TEXT_834 = " = eVirtualGet(";
  protected final String TEXT_835 = ");";
  protected final String TEXT_836 = NL + "\t\t\tif (";
  protected final String TEXT_837 = " != null && ";
  protected final String TEXT_838 = " != new";
  protected final String TEXT_839 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_840 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_841 = NL + "\t\t\tif (new";
  protected final String TEXT_842 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_843 = NL + "\t\t\t\t";
  protected final String TEXT_844 = " ";
  protected final String TEXT_845 = " = ";
  protected final String TEXT_846 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_847 = ".contains(new";
  protected final String TEXT_848 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_849 = ".add(new";
  protected final String TEXT_850 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_851 = NL + "\t\t\t\t";
  protected final String TEXT_852 = " ";
  protected final String TEXT_853 = " = ";
  protected final String TEXT_854 = "();";
  protected final String TEXT_855 = NL + "\t\t\t\tObject ";
  protected final String TEXT_856 = " = eVirtualGet(";
  protected final String TEXT_857 = ");";
  protected final String TEXT_858 = NL + "\t\t\t\tif (new";
  protected final String TEXT_859 = " != ";
  protected final String TEXT_860 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_861 = "(new";
  protected final String TEXT_862 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_863 = NL + "\t\t\t}";
  protected final String TEXT_864 = NL + "\t\t}";
  protected final String TEXT_865 = NL + "\t\treturn msgs;";
  protected final String TEXT_866 = NL + "\t\treturn ((";
  protected final String TEXT_867 = ".Internal)((";
  protected final String TEXT_868 = ".Internal.Wrapper)get";
  protected final String TEXT_869 = "()).featureMap()).basicAdd(";
  protected final String TEXT_870 = ", new";
  protected final String TEXT_871 = ", msgs);";
  protected final String TEXT_872 = NL + "\t\treturn ((";
  protected final String TEXT_873 = ".Internal)get";
  protected final String TEXT_874 = "()).basicAdd(";
  protected final String TEXT_875 = ", new";
  protected final String TEXT_876 = ", msgs);";
  protected final String TEXT_877 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_878 = "' ";
  protected final String TEXT_879 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_880 = NL + "\t}" + NL;
  protected final String TEXT_881 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_882 = "#";
  protected final String TEXT_883 = " <em>";
  protected final String TEXT_884 = "</em>}' ";
  protected final String TEXT_885 = ".";
  protected final String TEXT_886 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_887 = "</em>' ";
  protected final String TEXT_888 = ".";
  protected final String TEXT_889 = NL + "\t * @see ";
  protected final String TEXT_890 = NL + "\t * @see #isSet";
  protected final String TEXT_891 = "()";
  protected final String TEXT_892 = NL + "\t * @see #unset";
  protected final String TEXT_893 = "()";
  protected final String TEXT_894 = NL + "\t * @see #";
  protected final String TEXT_895 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_896 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_897 = NL + "\t@Override";
  protected final String TEXT_898 = NL + "\tvoid set";
  protected final String TEXT_899 = "(";
  protected final String TEXT_900 = " value);" + NL;
  protected final String TEXT_901 = NL + "\tpublic void set";
  protected final String TEXT_902 = "_";
  protected final String TEXT_903 = "(";
  protected final String TEXT_904 = " ";
  protected final String TEXT_905 = ")" + NL + "\t{";
  protected final String TEXT_906 = NL + "\t\tnew";
  protected final String TEXT_907 = " = new";
  protected final String TEXT_908 = " == null ? ";
  protected final String TEXT_909 = " : new";
  protected final String TEXT_910 = ";";
  protected final String TEXT_911 = NL + "\t\teDynamicSet(";
  protected final String TEXT_912 = ", ";
  protected final String TEXT_913 = ", ";
  protected final String TEXT_914 = "new ";
  protected final String TEXT_915 = "(";
  protected final String TEXT_916 = "new";
  protected final String TEXT_917 = ")";
  protected final String TEXT_918 = ");";
  protected final String TEXT_919 = NL + "\t\teSet(";
  protected final String TEXT_920 = ", ";
  protected final String TEXT_921 = "new ";
  protected final String TEXT_922 = "(";
  protected final String TEXT_923 = "new";
  protected final String TEXT_924 = ")";
  protected final String TEXT_925 = ");";
  protected final String TEXT_926 = NL + "\t\t";
  protected final String TEXT_927 = "__ESETTING_DELEGATE.dynamicSet(this, null, 0, ";
  protected final String TEXT_928 = "new ";
  protected final String TEXT_929 = "(";
  protected final String TEXT_930 = "new";
  protected final String TEXT_931 = ")";
  protected final String TEXT_932 = ");";
  protected final String TEXT_933 = NL + "\t\tif (new";
  protected final String TEXT_934 = " != eInternalContainer() || (eContainerFeatureID() != ";
  protected final String TEXT_935 = " && new";
  protected final String TEXT_936 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_937 = ".isAncestor(this, ";
  protected final String TEXT_938 = "new";
  protected final String TEXT_939 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_940 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_941 = NL + "\t\t\t";
  protected final String TEXT_942 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_943 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_944 = ")new";
  protected final String TEXT_945 = ").eInverseAdd(this, ";
  protected final String TEXT_946 = ", ";
  protected final String TEXT_947 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_948 = "(";
  protected final String TEXT_949 = "new";
  protected final String TEXT_950 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_951 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_952 = "(this, ";
  protected final String TEXT_953 = ".SET, ";
  protected final String TEXT_954 = ", new";
  protected final String TEXT_955 = ", new";
  protected final String TEXT_956 = "));";
  protected final String TEXT_957 = NL + "\t\t";
  protected final String TEXT_958 = " ";
  protected final String TEXT_959 = " = (";
  protected final String TEXT_960 = ")eVirtualGet(";
  protected final String TEXT_961 = ");";
  protected final String TEXT_962 = NL + "\t\tif (new";
  protected final String TEXT_963 = " != ";
  protected final String TEXT_964 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_965 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_966 = " != null)";
  protected final String TEXT_967 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_968 = ")";
  protected final String TEXT_969 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_970 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_971 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_972 = ")new";
  protected final String TEXT_973 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_974 = ", null, msgs);";
  protected final String TEXT_975 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_976 = ")";
  protected final String TEXT_977 = ").eInverseRemove(this, ";
  protected final String TEXT_978 = ", ";
  protected final String TEXT_979 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_980 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_981 = ")new";
  protected final String TEXT_982 = ").eInverseAdd(this, ";
  protected final String TEXT_983 = ", ";
  protected final String TEXT_984 = ".class, msgs);";
  protected final String TEXT_985 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_986 = "(";
  protected final String TEXT_987 = "new";
  protected final String TEXT_988 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_989 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_990 = NL + "\t\t\tboolean old";
  protected final String TEXT_991 = "ESet = eVirtualIsSet(";
  protected final String TEXT_992 = ");";
  protected final String TEXT_993 = NL + "\t\t\tboolean old";
  protected final String TEXT_994 = "ESet = (";
  protected final String TEXT_995 = " & ";
  protected final String TEXT_996 = "_ESETFLAG) != 0;";
  protected final String TEXT_997 = NL + "\t\t\t";
  protected final String TEXT_998 = " |= ";
  protected final String TEXT_999 = "_ESETFLAG;";
  protected final String TEXT_1000 = NL + "\t\t\tboolean old";
  protected final String TEXT_1001 = "ESet = ";
  protected final String TEXT_1002 = "ESet;";
  protected final String TEXT_1003 = NL + "\t\t\t";
  protected final String TEXT_1004 = "ESet = true;";
  protected final String TEXT_1005 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1006 = "(this, ";
  protected final String TEXT_1007 = ".SET, ";
  protected final String TEXT_1008 = ", new";
  protected final String TEXT_1009 = ", new";
  protected final String TEXT_1010 = ", !old";
  protected final String TEXT_1011 = "ESet));";
  protected final String TEXT_1012 = NL + "\t\t}";
  protected final String TEXT_1013 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1014 = "(this, ";
  protected final String TEXT_1015 = ".SET, ";
  protected final String TEXT_1016 = ", new";
  protected final String TEXT_1017 = ", new";
  protected final String TEXT_1018 = "));";
  protected final String TEXT_1019 = NL + "\t\t";
  protected final String TEXT_1020 = " old";
  protected final String TEXT_1021 = " = (";
  protected final String TEXT_1022 = " & ";
  protected final String TEXT_1023 = "_EFLAG) != 0;";
  protected final String TEXT_1024 = NL + "\t\t";
  protected final String TEXT_1025 = " old";
  protected final String TEXT_1026 = " = ";
  protected final String TEXT_1027 = "_EFLAG_VALUES[(";
  protected final String TEXT_1028 = " & ";
  protected final String TEXT_1029 = "_EFLAG) >>> ";
  protected final String TEXT_1030 = "_EFLAG_OFFSET];";
  protected final String TEXT_1031 = NL + "\t\tif (new";
  protected final String TEXT_1032 = ") ";
  protected final String TEXT_1033 = " |= ";
  protected final String TEXT_1034 = "_EFLAG; else ";
  protected final String TEXT_1035 = " &= ~";
  protected final String TEXT_1036 = "_EFLAG;";
  protected final String TEXT_1037 = NL + "\t\tif (new";
  protected final String TEXT_1038 = " == null) new";
  protected final String TEXT_1039 = " = ";
  protected final String TEXT_1040 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_1041 = " = ";
  protected final String TEXT_1042 = " & ~";
  protected final String TEXT_1043 = "_EFLAG | ";
  protected final String TEXT_1044 = "new";
  protected final String TEXT_1045 = ".ordinal()";
  protected final String TEXT_1046 = ".VALUES.indexOf(new";
  protected final String TEXT_1047 = ")";
  protected final String TEXT_1048 = " << ";
  protected final String TEXT_1049 = "_EFLAG_OFFSET;";
  protected final String TEXT_1050 = NL + "\t\t";
  protected final String TEXT_1051 = " old";
  protected final String TEXT_1052 = " = ";
  protected final String TEXT_1053 = ";";
  protected final String TEXT_1054 = NL + "\t\t";
  protected final String TEXT_1055 = " ";
  protected final String TEXT_1056 = " = new";
  protected final String TEXT_1057 = " == null ? ";
  protected final String TEXT_1058 = " : new";
  protected final String TEXT_1059 = ";";
  protected final String TEXT_1060 = NL + "\t\t";
  protected final String TEXT_1061 = " = new";
  protected final String TEXT_1062 = " == null ? ";
  protected final String TEXT_1063 = " : new";
  protected final String TEXT_1064 = ";";
  protected final String TEXT_1065 = NL + "\t\t";
  protected final String TEXT_1066 = " ";
  protected final String TEXT_1067 = " = ";
  protected final String TEXT_1068 = "new";
  protected final String TEXT_1069 = ";";
  protected final String TEXT_1070 = NL + "\t\t";
  protected final String TEXT_1071 = " = ";
  protected final String TEXT_1072 = "new";
  protected final String TEXT_1073 = ";";
  protected final String TEXT_1074 = NL + "\t\tObject old";
  protected final String TEXT_1075 = " = eVirtualSet(";
  protected final String TEXT_1076 = ", ";
  protected final String TEXT_1077 = ");";
  protected final String TEXT_1078 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1079 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1080 = NL + "\t\tboolean old";
  protected final String TEXT_1081 = "ESet = (";
  protected final String TEXT_1082 = " & ";
  protected final String TEXT_1083 = "_ESETFLAG) != 0;";
  protected final String TEXT_1084 = NL + "\t\t";
  protected final String TEXT_1085 = " |= ";
  protected final String TEXT_1086 = "_ESETFLAG;";
  protected final String TEXT_1087 = NL + "\t\tboolean old";
  protected final String TEXT_1088 = "ESet = ";
  protected final String TEXT_1089 = "ESet;";
  protected final String TEXT_1090 = NL + "\t\t";
  protected final String TEXT_1091 = "ESet = true;";
  protected final String TEXT_1092 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1093 = "(this, ";
  protected final String TEXT_1094 = ".SET, ";
  protected final String TEXT_1095 = ", ";
  protected final String TEXT_1096 = "isSetChange ? ";
  protected final String TEXT_1097 = " : old";
  protected final String TEXT_1098 = "old";
  protected final String TEXT_1099 = ", ";
  protected final String TEXT_1100 = "new";
  protected final String TEXT_1101 = ", ";
  protected final String TEXT_1102 = "isSetChange";
  protected final String TEXT_1103 = "!old";
  protected final String TEXT_1104 = "ESet";
  protected final String TEXT_1105 = "));";
  protected final String TEXT_1106 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1107 = "(this, ";
  protected final String TEXT_1108 = ".SET, ";
  protected final String TEXT_1109 = ", ";
  protected final String TEXT_1110 = "old";
  protected final String TEXT_1111 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_1112 = " : old";
  protected final String TEXT_1113 = "old";
  protected final String TEXT_1114 = ", ";
  protected final String TEXT_1115 = "new";
  protected final String TEXT_1116 = "));";
  protected final String TEXT_1117 = NL + "\t\t";
  protected final String TEXT_1118 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_1119 = NL + "\t\t\t";
  protected final String TEXT_1120 = " ";
  protected final String TEXT_1121 = " = ";
  protected final String TEXT_1122 = "();";
  protected final String TEXT_1123 = NL + "\t\t\tObject ";
  protected final String TEXT_1124 = " = eVirtualGet(";
  protected final String TEXT_1125 = ");";
  protected final String TEXT_1126 = NL + "\t\t\tif (";
  protected final String TEXT_1127 = " != null && ";
  protected final String TEXT_1128 = " != new";
  protected final String TEXT_1129 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_1130 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_1131 = NL + "\t\t\tif (new";
  protected final String TEXT_1132 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_1133 = NL + "\t\t\t\t";
  protected final String TEXT_1134 = " ";
  protected final String TEXT_1135 = " = ";
  protected final String TEXT_1136 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_1137 = ".contains(new";
  protected final String TEXT_1138 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_1139 = ".add(new";
  protected final String TEXT_1140 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1141 = NL + "\t\t\t\t";
  protected final String TEXT_1142 = " ";
  protected final String TEXT_1143 = " = ";
  protected final String TEXT_1144 = "();";
  protected final String TEXT_1145 = NL + "\t\t\t\tObject ";
  protected final String TEXT_1146 = " = eVirtualGet(";
  protected final String TEXT_1147 = ");";
  protected final String TEXT_1148 = NL + "\t\t\t\tif (new";
  protected final String TEXT_1149 = " != ";
  protected final String TEXT_1150 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_1151 = "(new";
  protected final String TEXT_1152 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1153 = NL + "\t\t\t}";
  protected final String TEXT_1154 = NL + "\t\t}";
  protected final String TEXT_1155 = NL + "\t\t((";
  protected final String TEXT_1156 = ".Internal)((";
  protected final String TEXT_1157 = ".Internal.Wrapper)get";
  protected final String TEXT_1158 = "()).featureMap()).set(";
  protected final String TEXT_1159 = ", ";
  protected final String TEXT_1160 = "new ";
  protected final String TEXT_1161 = "(";
  protected final String TEXT_1162 = "new";
  protected final String TEXT_1163 = ")";
  protected final String TEXT_1164 = ");";
  protected final String TEXT_1165 = NL + "\t\t((";
  protected final String TEXT_1166 = ".Internal)get";
  protected final String TEXT_1167 = "()).set(";
  protected final String TEXT_1168 = ", ";
  protected final String TEXT_1169 = "new ";
  protected final String TEXT_1170 = "(";
  protected final String TEXT_1171 = "new";
  protected final String TEXT_1172 = ")";
  protected final String TEXT_1173 = ");";
  protected final String TEXT_1174 = NL + "\t\t";
  protected final String TEXT_1175 = NL + "\t\t";
  protected final String TEXT_1176 = ".";
  protected final String TEXT_1177 = "(this, ";
  protected final String TEXT_1178 = ");";
  protected final String TEXT_1179 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_1180 = "' ";
  protected final String TEXT_1181 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1182 = NL + "\t}" + NL;
  protected final String TEXT_1183 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1184 = NL + "\t@Override";
  protected final String TEXT_1185 = NL + "\tpublic ";
  protected final String TEXT_1186 = " basicUnset";
  protected final String TEXT_1187 = "(";
  protected final String TEXT_1188 = " msgs)" + NL + "\t{";
  protected final String TEXT_1189 = NL + "\t\treturn eDynamicInverseRemove((";
  protected final String TEXT_1190 = ")";
  protected final String TEXT_1191 = "basicGet";
  protected final String TEXT_1192 = "(), ";
  protected final String TEXT_1193 = ", msgs);";
  protected final String TEXT_1194 = "Object old";
  protected final String TEXT_1195 = " = ";
  protected final String TEXT_1196 = "eVirtualUnset(";
  protected final String TEXT_1197 = ");";
  protected final String TEXT_1198 = NL + "\t\t";
  protected final String TEXT_1199 = " old";
  protected final String TEXT_1200 = " = ";
  protected final String TEXT_1201 = ";";
  protected final String TEXT_1202 = NL + "\t\t";
  protected final String TEXT_1203 = " = null;";
  protected final String TEXT_1204 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1205 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1206 = NL + "\t\tboolean old";
  protected final String TEXT_1207 = "ESet = (";
  protected final String TEXT_1208 = " & ";
  protected final String TEXT_1209 = "_ESETFLAG) != 0;";
  protected final String TEXT_1210 = NL + "\t\t";
  protected final String TEXT_1211 = " &= ~";
  protected final String TEXT_1212 = "_ESETFLAG;";
  protected final String TEXT_1213 = NL + "\t\tboolean old";
  protected final String TEXT_1214 = "ESet = ";
  protected final String TEXT_1215 = "ESet;";
  protected final String TEXT_1216 = NL + "\t\t";
  protected final String TEXT_1217 = "ESet = false;";
  protected final String TEXT_1218 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1219 = " notification = new ";
  protected final String TEXT_1220 = "(this, ";
  protected final String TEXT_1221 = ".UNSET, ";
  protected final String TEXT_1222 = ", ";
  protected final String TEXT_1223 = "isSetChange ? old";
  protected final String TEXT_1224 = " : null";
  protected final String TEXT_1225 = "old";
  protected final String TEXT_1226 = ", null, ";
  protected final String TEXT_1227 = "isSetChange";
  protected final String TEXT_1228 = "old";
  protected final String TEXT_1229 = "ESet";
  protected final String TEXT_1230 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1231 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1232 = "' ";
  protected final String TEXT_1233 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1234 = NL + "\t}" + NL;
  protected final String TEXT_1235 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1236 = "#";
  protected final String TEXT_1237 = " <em>";
  protected final String TEXT_1238 = "</em>}' ";
  protected final String TEXT_1239 = ".";
  protected final String TEXT_1240 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1241 = NL + "\t * @see #isSet";
  protected final String TEXT_1242 = "()";
  protected final String TEXT_1243 = NL + "\t * @see #";
  protected final String TEXT_1244 = "()";
  protected final String TEXT_1245 = NL + "\t * @see #set";
  protected final String TEXT_1246 = "(";
  protected final String TEXT_1247 = ")";
  protected final String TEXT_1248 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1249 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1250 = NL + "\t@Override";
  protected final String TEXT_1251 = NL + "\tvoid unset";
  protected final String TEXT_1252 = "();" + NL;
  protected final String TEXT_1253 = NL + "\tpublic void unset";
  protected final String TEXT_1254 = "_";
  protected final String TEXT_1255 = "()" + NL + "\t{";
  protected final String TEXT_1256 = NL + "\t\teDynamicUnset(";
  protected final String TEXT_1257 = ", ";
  protected final String TEXT_1258 = ");";
  protected final String TEXT_1259 = NL + "\t\teUnset(";
  protected final String TEXT_1260 = ");";
  protected final String TEXT_1261 = NL + "\t\t";
  protected final String TEXT_1262 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_1263 = NL + "\t\t";
  protected final String TEXT_1264 = " ";
  protected final String TEXT_1265 = " = (";
  protected final String TEXT_1266 = ")eVirtualGet(";
  protected final String TEXT_1267 = ");";
  protected final String TEXT_1268 = NL + "\t\tif (";
  protected final String TEXT_1269 = " != null) ((";
  protected final String TEXT_1270 = ".Unsettable";
  protected final String TEXT_1271 = ")";
  protected final String TEXT_1272 = ").unset();";
  protected final String TEXT_1273 = NL + "\t\t";
  protected final String TEXT_1274 = " ";
  protected final String TEXT_1275 = " = (";
  protected final String TEXT_1276 = ")eVirtualGet(";
  protected final String TEXT_1277 = ");";
  protected final String TEXT_1278 = NL + "\t\tif (";
  protected final String TEXT_1279 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1280 = " msgs = null;";
  protected final String TEXT_1281 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1282 = ")";
  protected final String TEXT_1283 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1284 = ", null, msgs);";
  protected final String TEXT_1285 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1286 = ")";
  protected final String TEXT_1287 = ").eInverseRemove(this, ";
  protected final String TEXT_1288 = ", ";
  protected final String TEXT_1289 = ".class, msgs);";
  protected final String TEXT_1290 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1291 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1292 = NL + "\t\t\tboolean old";
  protected final String TEXT_1293 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1294 = ");";
  protected final String TEXT_1295 = NL + "\t\t\tboolean old";
  protected final String TEXT_1296 = "ESet = (";
  protected final String TEXT_1297 = " & ";
  protected final String TEXT_1298 = "_ESETFLAG) != 0;";
  protected final String TEXT_1299 = NL + "\t\t\t";
  protected final String TEXT_1300 = " &= ~";
  protected final String TEXT_1301 = "_ESETFLAG;";
  protected final String TEXT_1302 = NL + "\t\t\tboolean old";
  protected final String TEXT_1303 = "ESet = ";
  protected final String TEXT_1304 = "ESet;";
  protected final String TEXT_1305 = NL + "\t\t\t";
  protected final String TEXT_1306 = "ESet = false;";
  protected final String TEXT_1307 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1308 = "(this, ";
  protected final String TEXT_1309 = ".UNSET, ";
  protected final String TEXT_1310 = ", null, null, old";
  protected final String TEXT_1311 = "ESet));";
  protected final String TEXT_1312 = NL + "\t\t}";
  protected final String TEXT_1313 = NL + "\t\t";
  protected final String TEXT_1314 = " old";
  protected final String TEXT_1315 = " = (";
  protected final String TEXT_1316 = " & ";
  protected final String TEXT_1317 = "_EFLAG) != 0;";
  protected final String TEXT_1318 = NL + "\t\t";
  protected final String TEXT_1319 = " old";
  protected final String TEXT_1320 = " = ";
  protected final String TEXT_1321 = "_EFLAG_VALUES[(";
  protected final String TEXT_1322 = " & ";
  protected final String TEXT_1323 = "_EFLAG) >>> ";
  protected final String TEXT_1324 = "_EFLAG_OFFSET];";
  protected final String TEXT_1325 = NL + "\t\tObject old";
  protected final String TEXT_1326 = " = eVirtualUnset(";
  protected final String TEXT_1327 = ");";
  protected final String TEXT_1328 = NL + "\t\t";
  protected final String TEXT_1329 = " old";
  protected final String TEXT_1330 = " = ";
  protected final String TEXT_1331 = ";";
  protected final String TEXT_1332 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1333 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1334 = NL + "\t\tboolean old";
  protected final String TEXT_1335 = "ESet = (";
  protected final String TEXT_1336 = " & ";
  protected final String TEXT_1337 = "_ESETFLAG) != 0;";
  protected final String TEXT_1338 = NL + "\t\tboolean old";
  protected final String TEXT_1339 = "ESet = ";
  protected final String TEXT_1340 = "ESet;";
  protected final String TEXT_1341 = NL + "\t\t";
  protected final String TEXT_1342 = " = null;";
  protected final String TEXT_1343 = NL + "\t\t";
  protected final String TEXT_1344 = " &= ~";
  protected final String TEXT_1345 = "_ESETFLAG;";
  protected final String TEXT_1346 = NL + "\t\t";
  protected final String TEXT_1347 = "ESet = false;";
  protected final String TEXT_1348 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1349 = "(this, ";
  protected final String TEXT_1350 = ".UNSET, ";
  protected final String TEXT_1351 = ", ";
  protected final String TEXT_1352 = "isSetChange ? old";
  protected final String TEXT_1353 = " : null";
  protected final String TEXT_1354 = "old";
  protected final String TEXT_1355 = ", null, ";
  protected final String TEXT_1356 = "isSetChange";
  protected final String TEXT_1357 = "old";
  protected final String TEXT_1358 = "ESet";
  protected final String TEXT_1359 = "));";
  protected final String TEXT_1360 = NL + "\t\tif (";
  protected final String TEXT_1361 = ") ";
  protected final String TEXT_1362 = " |= ";
  protected final String TEXT_1363 = "_EFLAG; else ";
  protected final String TEXT_1364 = " &= ~";
  protected final String TEXT_1365 = "_EFLAG;";
  protected final String TEXT_1366 = NL + "\t\t";
  protected final String TEXT_1367 = " = ";
  protected final String TEXT_1368 = " & ~";
  protected final String TEXT_1369 = "_EFLAG | ";
  protected final String TEXT_1370 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1371 = NL + "\t\t";
  protected final String TEXT_1372 = " = ";
  protected final String TEXT_1373 = ";";
  protected final String TEXT_1374 = NL + "\t\t";
  protected final String TEXT_1375 = " &= ~";
  protected final String TEXT_1376 = "_ESETFLAG;";
  protected final String TEXT_1377 = NL + "\t\t";
  protected final String TEXT_1378 = "ESet = false;";
  protected final String TEXT_1379 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1380 = "(this, ";
  protected final String TEXT_1381 = ".UNSET, ";
  protected final String TEXT_1382 = ", ";
  protected final String TEXT_1383 = "isSetChange ? old";
  protected final String TEXT_1384 = " : ";
  protected final String TEXT_1385 = "old";
  protected final String TEXT_1386 = ", ";
  protected final String TEXT_1387 = ", ";
  protected final String TEXT_1388 = "isSetChange";
  protected final String TEXT_1389 = "old";
  protected final String TEXT_1390 = "ESet";
  protected final String TEXT_1391 = "));";
  protected final String TEXT_1392 = NL + "\t\t((";
  protected final String TEXT_1393 = ".Internal)((";
  protected final String TEXT_1394 = ".Internal.Wrapper)get";
  protected final String TEXT_1395 = "()).featureMap()).clear(";
  protected final String TEXT_1396 = ");";
  protected final String TEXT_1397 = NL + "\t\t((";
  protected final String TEXT_1398 = ".Internal)get";
  protected final String TEXT_1399 = "()).clear(";
  protected final String TEXT_1400 = ");";
  protected final String TEXT_1401 = NL + "\t\t";
  protected final String TEXT_1402 = NL + "\t\t";
  protected final String TEXT_1403 = ".";
  protected final String TEXT_1404 = "(this);";
  protected final String TEXT_1405 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1406 = "' ";
  protected final String TEXT_1407 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1408 = NL + "\t}" + NL;
  protected final String TEXT_1409 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1410 = "#";
  protected final String TEXT_1411 = " <em>";
  protected final String TEXT_1412 = "</em>}' ";
  protected final String TEXT_1413 = " is set.";
  protected final String TEXT_1414 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1415 = "</em>' ";
  protected final String TEXT_1416 = " is set.";
  protected final String TEXT_1417 = NL + "\t * @see #unset";
  protected final String TEXT_1418 = "()";
  protected final String TEXT_1419 = NL + "\t * @see #";
  protected final String TEXT_1420 = "()";
  protected final String TEXT_1421 = NL + "\t * @see #set";
  protected final String TEXT_1422 = "(";
  protected final String TEXT_1423 = ")";
  protected final String TEXT_1424 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1425 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1426 = NL + "\t@Override";
  protected final String TEXT_1427 = NL + "\tboolean isSet";
  protected final String TEXT_1428 = "();" + NL;
  protected final String TEXT_1429 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1430 = "_";
  protected final String TEXT_1431 = "()" + NL + "\t{";
  protected final String TEXT_1432 = NL + "\t\treturn eDynamicIsSet(";
  protected final String TEXT_1433 = ", ";
  protected final String TEXT_1434 = ");";
  protected final String TEXT_1435 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1436 = ");";
  protected final String TEXT_1437 = NL + "\t\treturn ";
  protected final String TEXT_1438 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_1439 = NL + "\t\t";
  protected final String TEXT_1440 = " ";
  protected final String TEXT_1441 = " = (";
  protected final String TEXT_1442 = ")eVirtualGet(";
  protected final String TEXT_1443 = ");";
  protected final String TEXT_1444 = NL + "\t\treturn ";
  protected final String TEXT_1445 = " != null && ((";
  protected final String TEXT_1446 = ".Unsettable";
  protected final String TEXT_1447 = ")";
  protected final String TEXT_1448 = ").isSet();";
  protected final String TEXT_1449 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1450 = ");";
  protected final String TEXT_1451 = NL + "\t\treturn (";
  protected final String TEXT_1452 = " & ";
  protected final String TEXT_1453 = "_ESETFLAG) != 0;";
  protected final String TEXT_1454 = NL + "\t\treturn ";
  protected final String TEXT_1455 = "ESet;";
  protected final String TEXT_1456 = NL + "\t\treturn !((";
  protected final String TEXT_1457 = ".Internal)((";
  protected final String TEXT_1458 = ".Internal.Wrapper)get";
  protected final String TEXT_1459 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1460 = ");";
  protected final String TEXT_1461 = NL + "\t\treturn !((";
  protected final String TEXT_1462 = ".Internal)get";
  protected final String TEXT_1463 = "()).isEmpty(";
  protected final String TEXT_1464 = ");";
  protected final String TEXT_1465 = NL + "\t\t";
  protected final String TEXT_1466 = NL + "\t\treturn ";
  protected final String TEXT_1467 = ".";
  protected final String TEXT_1468 = "(this);";
  protected final String TEXT_1469 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1470 = "' ";
  protected final String TEXT_1471 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1472 = NL + "\t}" + NL;
  protected final String TEXT_1473 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1474 = "() <em>";
  protected final String TEXT_1475 = "</em>}' ";
  protected final String TEXT_1476 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1477 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1478 = "_ESUBSETS = ";
  protected final String TEXT_1479 = ";" + NL;
  protected final String TEXT_1480 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1481 = "() <em>";
  protected final String TEXT_1482 = "</em>}' ";
  protected final String TEXT_1483 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1484 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1485 = "_ESUPERSETS = ";
  protected final String TEXT_1486 = ";" + NL;
  protected final String TEXT_1487 = NL + "\t/**";
  protected final String TEXT_1488 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1489 = "}, with the specified ";
  protected final String TEXT_1490 = ", and appends it to the '<em><b>";
  protected final String TEXT_1491 = "</b></em>' ";
  protected final String TEXT_1492 = ".";
  protected final String TEXT_1493 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1494 = "}, with the specified ";
  protected final String TEXT_1495 = ", and sets the '<em><b>";
  protected final String TEXT_1496 = "</b></em>' ";
  protected final String TEXT_1497 = ".";
  protected final String TEXT_1498 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1499 = "} and appends it to the '<em><b>";
  protected final String TEXT_1500 = "</b></em>' ";
  protected final String TEXT_1501 = ".";
  protected final String TEXT_1502 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1503 = "} and sets the '<em><b>";
  protected final String TEXT_1504 = "</b></em>' ";
  protected final String TEXT_1505 = ".";
  protected final String TEXT_1506 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1507 = NL + "\t * @param ";
  protected final String TEXT_1508 = " The ";
  protected final String TEXT_1509 = " for the new {@link ";
  protected final String TEXT_1510 = "}, or <code>null</code>.";
  protected final String TEXT_1511 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1512 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1513 = "}." + NL + "\t * @see #";
  protected final String TEXT_1514 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1515 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1516 = NL + "\t";
  protected final String TEXT_1517 = " create";
  protected final String TEXT_1518 = "(";
  protected final String TEXT_1519 = ", ";
  protected final String TEXT_1520 = " eClass);" + NL;
  protected final String TEXT_1521 = NL + "\t@Override";
  protected final String TEXT_1522 = NL + "\tpublic ";
  protected final String TEXT_1523 = " create";
  protected final String TEXT_1524 = "(";
  protected final String TEXT_1525 = ", ";
  protected final String TEXT_1526 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1527 = " new";
  protected final String TEXT_1528 = " = (";
  protected final String TEXT_1529 = ") create(eClass);";
  protected final String TEXT_1530 = NL + "\t\t";
  protected final String TEXT_1531 = "().add(new";
  protected final String TEXT_1532 = ");";
  protected final String TEXT_1533 = NL + "\t\tset";
  protected final String TEXT_1534 = "(new";
  protected final String TEXT_1535 = ");";
  protected final String TEXT_1536 = NL + "\t\tint ";
  protected final String TEXT_1537 = "ListSize = 0;";
  protected final String TEXT_1538 = NL + "\t\tint ";
  protected final String TEXT_1539 = "Size = ";
  protected final String TEXT_1540 = " == null ? 0 : ";
  protected final String TEXT_1541 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1542 = "Size > ";
  protected final String TEXT_1543 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1544 = "ListSize = ";
  protected final String TEXT_1545 = "Size;";
  protected final String TEXT_1546 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1547 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1548 = ".create";
  protected final String TEXT_1549 = "(";
  protected final String TEXT_1550 = ", ";
  protected final String TEXT_1551 = "i < ";
  protected final String TEXT_1552 = "Size ? (";
  protected final String TEXT_1553 = ") ";
  protected final String TEXT_1554 = ".get(i) : null";
  protected final String TEXT_1555 = ");" + NL + "\t\t}";
  protected final String TEXT_1556 = NL + "\t\tnew";
  protected final String TEXT_1557 = ".create";
  protected final String TEXT_1558 = "(";
  protected final String TEXT_1559 = ", ";
  protected final String TEXT_1560 = ");";
  protected final String TEXT_1561 = NL + "\t\tif (";
  protected final String TEXT_1562 = " != null)";
  protected final String TEXT_1563 = NL + "\t\t\tnew";
  protected final String TEXT_1564 = ".";
  protected final String TEXT_1565 = "().addAll(";
  protected final String TEXT_1566 = ");";
  protected final String TEXT_1567 = NL + "\t\t\tnew";
  protected final String TEXT_1568 = ".set";
  protected final String TEXT_1569 = "(";
  protected final String TEXT_1570 = ");";
  protected final String TEXT_1571 = NL + "\t\treturn new";
  protected final String TEXT_1572 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1573 = NL + "\t/**";
  protected final String TEXT_1574 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1575 = "}, with the specified ";
  protected final String TEXT_1576 = ", and appends it to the '<em><b>";
  protected final String TEXT_1577 = "</b></em>' ";
  protected final String TEXT_1578 = ".";
  protected final String TEXT_1579 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1580 = "},with the specified ";
  protected final String TEXT_1581 = ", and sets the '<em><b>";
  protected final String TEXT_1582 = "</b></em>' ";
  protected final String TEXT_1583 = ".";
  protected final String TEXT_1584 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1585 = "} and appends it to the '<em><b>";
  protected final String TEXT_1586 = "</b></em>' ";
  protected final String TEXT_1587 = ".";
  protected final String TEXT_1588 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1589 = "} and sets the '<em><b>";
  protected final String TEXT_1590 = "</b></em>' ";
  protected final String TEXT_1591 = ".";
  protected final String TEXT_1592 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1593 = NL + "\t * @param ";
  protected final String TEXT_1594 = " The ";
  protected final String TEXT_1595 = " for the new {@link ";
  protected final String TEXT_1596 = "}, or <code>null</code>.";
  protected final String TEXT_1597 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1598 = "}." + NL + "\t * @see #";
  protected final String TEXT_1599 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1600 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1601 = NL + "\t";
  protected final String TEXT_1602 = " create";
  protected final String TEXT_1603 = "(";
  protected final String TEXT_1604 = ");" + NL;
  protected final String TEXT_1605 = NL + "\t@Override";
  protected final String TEXT_1606 = NL + "\tpublic ";
  protected final String TEXT_1607 = " create";
  protected final String TEXT_1608 = "(";
  protected final String TEXT_1609 = ")" + NL + "\t{";
  protected final String TEXT_1610 = NL + "\t\treturn create";
  protected final String TEXT_1611 = "(";
  protected final String TEXT_1612 = ", ";
  protected final String TEXT_1613 = ");";
  protected final String TEXT_1614 = NL + "\t\t";
  protected final String TEXT_1615 = " new";
  protected final String TEXT_1616 = " = (";
  protected final String TEXT_1617 = ") create(";
  protected final String TEXT_1618 = ");";
  protected final String TEXT_1619 = NL + "\t\t";
  protected final String TEXT_1620 = "().add(new";
  protected final String TEXT_1621 = ");";
  protected final String TEXT_1622 = NL + "\t\tset";
  protected final String TEXT_1623 = "(new";
  protected final String TEXT_1624 = ");";
  protected final String TEXT_1625 = NL + "\t\tint ";
  protected final String TEXT_1626 = "ListSize = 0;";
  protected final String TEXT_1627 = NL + "\t\tint ";
  protected final String TEXT_1628 = "Size = ";
  protected final String TEXT_1629 = " == null ? 0 : ";
  protected final String TEXT_1630 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1631 = "Size > ";
  protected final String TEXT_1632 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1633 = "ListSize = ";
  protected final String TEXT_1634 = "Size;";
  protected final String TEXT_1635 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1636 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1637 = ".create";
  protected final String TEXT_1638 = "(";
  protected final String TEXT_1639 = ", ";
  protected final String TEXT_1640 = "i < ";
  protected final String TEXT_1641 = "Size ? (";
  protected final String TEXT_1642 = ") ";
  protected final String TEXT_1643 = ".get(i) : null";
  protected final String TEXT_1644 = ");" + NL + "\t\t}";
  protected final String TEXT_1645 = NL + "\t\tnew";
  protected final String TEXT_1646 = ".create";
  protected final String TEXT_1647 = "(";
  protected final String TEXT_1648 = ", ";
  protected final String TEXT_1649 = ");";
  protected final String TEXT_1650 = NL + "\t\tif (";
  protected final String TEXT_1651 = " != null)";
  protected final String TEXT_1652 = NL + "\t\t\tnew";
  protected final String TEXT_1653 = ".";
  protected final String TEXT_1654 = "().addAll(";
  protected final String TEXT_1655 = ");";
  protected final String TEXT_1656 = NL + "\t\t\tnew";
  protected final String TEXT_1657 = ".set";
  protected final String TEXT_1658 = "(";
  protected final String TEXT_1659 = ");";
  protected final String TEXT_1660 = NL + "\t\treturn new";
  protected final String TEXT_1661 = ";";
  protected final String TEXT_1662 = NL + "\t}" + NL;
  protected final String TEXT_1663 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1664 = "} with the specified ";
  protected final String TEXT_1665 = " from the '<em><b>";
  protected final String TEXT_1666 = "</b></em>' ";
  protected final String TEXT_1667 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1668 = NL + "\t * @param ";
  protected final String TEXT_1669 = " The ";
  protected final String TEXT_1670 = " of the {@link ";
  protected final String TEXT_1671 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1672 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1673 = "} with the specified ";
  protected final String TEXT_1674 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1675 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1676 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1677 = NL + "\t";
  protected final String TEXT_1678 = " get";
  protected final String TEXT_1679 = "(";
  protected final String TEXT_1680 = ");" + NL;
  protected final String TEXT_1681 = NL + "\t@Override";
  protected final String TEXT_1682 = NL + "\tpublic ";
  protected final String TEXT_1683 = " get";
  protected final String TEXT_1684 = "(";
  protected final String TEXT_1685 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1686 = "(";
  protected final String TEXT_1687 = ", false";
  protected final String TEXT_1688 = ", null";
  protected final String TEXT_1689 = ", false";
  protected final String TEXT_1690 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1691 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1692 = "} with the specified ";
  protected final String TEXT_1693 = " from the '<em><b>";
  protected final String TEXT_1694 = "</b></em>' ";
  protected final String TEXT_1695 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1696 = NL + "\t * @param ";
  protected final String TEXT_1697 = " The ";
  protected final String TEXT_1698 = " of the {@link ";
  protected final String TEXT_1699 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1700 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1701 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1702 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1703 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1704 = "} on demand if not found.";
  protected final String TEXT_1705 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1706 = "} with the specified ";
  protected final String TEXT_1707 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1708 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1709 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1710 = NL + "\t";
  protected final String TEXT_1711 = " get";
  protected final String TEXT_1712 = "(";
  protected final String TEXT_1713 = ", boolean ignoreCase";
  protected final String TEXT_1714 = ", ";
  protected final String TEXT_1715 = " eClass";
  protected final String TEXT_1716 = ", boolean createOnDemand";
  protected final String TEXT_1717 = ");" + NL;
  protected final String TEXT_1718 = NL + "\t@Override";
  protected final String TEXT_1719 = NL + "\tpublic ";
  protected final String TEXT_1720 = " get";
  protected final String TEXT_1721 = "(";
  protected final String TEXT_1722 = ", boolean ignoreCase";
  protected final String TEXT_1723 = ", ";
  protected final String TEXT_1724 = " eClass";
  protected final String TEXT_1725 = ", boolean createOnDemand";
  protected final String TEXT_1726 = ")" + NL + "\t{";
  protected final String TEXT_1727 = NL + "\t\t";
  protected final String TEXT_1728 = "Loop: for (";
  protected final String TEXT_1729 = " ";
  protected final String TEXT_1730 = " : ";
  protected final String TEXT_1731 = "())" + NL + "\t\t{";
  protected final String TEXT_1732 = NL + "\t\t";
  protected final String TEXT_1733 = "Loop: for (";
  protected final String TEXT_1734 = " i = ";
  protected final String TEXT_1735 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1736 = " ";
  protected final String TEXT_1737 = " = (";
  protected final String TEXT_1738 = ") i.next();";
  protected final String TEXT_1739 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1740 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1741 = "Loop;";
  protected final String TEXT_1742 = NL + "\t\t\t";
  protected final String TEXT_1743 = " ";
  protected final String TEXT_1744 = "List = ";
  protected final String TEXT_1745 = ".";
  protected final String TEXT_1746 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1747 = "ListSize = ";
  protected final String TEXT_1748 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1749 = " || (";
  protected final String TEXT_1750 = " != null && ";
  protected final String TEXT_1751 = ".size() != ";
  protected final String TEXT_1752 = "ListSize";
  protected final String TEXT_1753 = ")";
  protected final String TEXT_1754 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1755 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1756 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1757 = " ";
  protected final String TEXT_1758 = " = ";
  protected final String TEXT_1759 = "(";
  protected final String TEXT_1760 = ") ";
  protected final String TEXT_1761 = "List.get(j);";
  protected final String TEXT_1762 = NL + "\t\t\t\tif (";
  protected final String TEXT_1763 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1764 = "(";
  protected final String TEXT_1765 = ")";
  protected final String TEXT_1766 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1767 = ".";
  protected final String TEXT_1768 = "()) : ";
  protected final String TEXT_1769 = ".get(j).equals(";
  protected final String TEXT_1770 = ".";
  protected final String TEXT_1771 = "())))";
  protected final String TEXT_1772 = NL + "\t\t\t\tif (";
  protected final String TEXT_1773 = " != null && !";
  protected final String TEXT_1774 = ".get(j).equals(";
  protected final String TEXT_1775 = ".";
  protected final String TEXT_1776 = "()))";
  protected final String TEXT_1777 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1778 = "Loop;";
  protected final String TEXT_1779 = NL + "\t\t\t}";
  protected final String TEXT_1780 = NL + "\t\t\t";
  protected final String TEXT_1781 = " ";
  protected final String TEXT_1782 = " = ";
  protected final String TEXT_1783 = ".";
  protected final String TEXT_1784 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1785 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1786 = "Loop;";
  protected final String TEXT_1787 = NL + "\t\t\tif (";
  protected final String TEXT_1788 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1789 = ".equalsIgnoreCase(";
  protected final String TEXT_1790 = ".";
  protected final String TEXT_1791 = "()) : ";
  protected final String TEXT_1792 = ".equals(";
  protected final String TEXT_1793 = ".";
  protected final String TEXT_1794 = "())))";
  protected final String TEXT_1795 = NL + "\t\t\tif (";
  protected final String TEXT_1796 = " != null && !";
  protected final String TEXT_1797 = ".equals(";
  protected final String TEXT_1798 = ".";
  protected final String TEXT_1799 = "()))";
  protected final String TEXT_1800 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1801 = "Loop;";
  protected final String TEXT_1802 = NL + "\t\t\tif (";
  protected final String TEXT_1803 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1804 = ".equalsIgnoreCase(";
  protected final String TEXT_1805 = ".";
  protected final String TEXT_1806 = "()) : ";
  protected final String TEXT_1807 = ".equals(";
  protected final String TEXT_1808 = ".";
  protected final String TEXT_1809 = "())))";
  protected final String TEXT_1810 = NL + "\t\t\tif (";
  protected final String TEXT_1811 = " != null && !";
  protected final String TEXT_1812 = ".equals(";
  protected final String TEXT_1813 = ".";
  protected final String TEXT_1814 = "()))";
  protected final String TEXT_1815 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1816 = "Loop;";
  protected final String TEXT_1817 = NL + "\t\t\treturn ";
  protected final String TEXT_1818 = ";" + NL + "\t\t}";
  protected final String TEXT_1819 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1820 = " && eClass != null";
  protected final String TEXT_1821 = " ? create";
  protected final String TEXT_1822 = "(";
  protected final String TEXT_1823 = ", eClass";
  protected final String TEXT_1824 = ") : null;";
  protected final String TEXT_1825 = NL + "\t\treturn null;";
  protected final String TEXT_1826 = NL + "\t}" + NL;
  protected final String TEXT_1827 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1828 = "()" + NL + "\t{";
  protected final String TEXT_1829 = NL + "  \t\treturn false;";
  protected final String TEXT_1830 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1831 = ");";
  protected final String TEXT_1832 = NL + "\t\treturn !((";
  protected final String TEXT_1833 = ".Internal.Wrapper)";
  protected final String TEXT_1834 = "()).featureMap().isEmpty();";
  protected final String TEXT_1835 = NL + "\t\treturn ";
  protected final String TEXT_1836 = " != null && !";
  protected final String TEXT_1837 = ".featureMap().isEmpty();";
  protected final String TEXT_1838 = NL + "\t\treturn ";
  protected final String TEXT_1839 = " != null && !";
  protected final String TEXT_1840 = ".isEmpty();";
  protected final String TEXT_1841 = NL + "\t\t";
  protected final String TEXT_1842 = " ";
  protected final String TEXT_1843 = " = (";
  protected final String TEXT_1844 = ")eVirtualGet(";
  protected final String TEXT_1845 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1846 = " != null && !";
  protected final String TEXT_1847 = ".isEmpty();";
  protected final String TEXT_1848 = NL + "\t\treturn !";
  protected final String TEXT_1849 = "().isEmpty();";
  protected final String TEXT_1850 = NL + "\t\treturn ";
  protected final String TEXT_1851 = " != null;";
  protected final String TEXT_1852 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1853 = ") != null;";
  protected final String TEXT_1854 = NL + "\t\treturn basicGet";
  protected final String TEXT_1855 = "() != null;";
  protected final String TEXT_1856 = NL + "\t\treturn ";
  protected final String TEXT_1857 = " != null;";
  protected final String TEXT_1858 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1859 = ") != null;";
  protected final String TEXT_1860 = NL + "\t\treturn ";
  protected final String TEXT_1861 = "() != null;";
  protected final String TEXT_1862 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1863 = " & ";
  protected final String TEXT_1864 = "_EFLAG) != 0) != ";
  protected final String TEXT_1865 = ";";
  protected final String TEXT_1866 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1867 = " & ";
  protected final String TEXT_1868 = "_EFLAG) != ";
  protected final String TEXT_1869 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1870 = NL + "\t\treturn ";
  protected final String TEXT_1871 = " != ";
  protected final String TEXT_1872 = ";";
  protected final String TEXT_1873 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1874 = ", ";
  protected final String TEXT_1875 = ") != ";
  protected final String TEXT_1876 = ";";
  protected final String TEXT_1877 = NL + "\t\treturn ";
  protected final String TEXT_1878 = "() != ";
  protected final String TEXT_1879 = ";";
  protected final String TEXT_1880 = NL + "\t\treturn ";
  protected final String TEXT_1881 = " == null ? ";
  protected final String TEXT_1882 = " != null : !";
  protected final String TEXT_1883 = ".equals(";
  protected final String TEXT_1884 = ");";
  protected final String TEXT_1885 = NL + "\t\t";
  protected final String TEXT_1886 = " ";
  protected final String TEXT_1887 = " = (";
  protected final String TEXT_1888 = ")eVirtualGet(";
  protected final String TEXT_1889 = ", ";
  protected final String TEXT_1890 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1891 = " == null ? ";
  protected final String TEXT_1892 = " != null : !";
  protected final String TEXT_1893 = ".equals(";
  protected final String TEXT_1894 = ");";
  protected final String TEXT_1895 = NL + "\t\treturn ";
  protected final String TEXT_1896 = " == null ? ";
  protected final String TEXT_1897 = "() != null : !";
  protected final String TEXT_1898 = ".equals(";
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
  protected final String TEXT_1909 = ".Unsettable";
  protected final String TEXT_1910 = ")";
  protected final String TEXT_1911 = ").isSet();";
  protected final String TEXT_1912 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1913 = ");";
  protected final String TEXT_1914 = NL + "\t\treturn (";
  protected final String TEXT_1915 = " & ";
  protected final String TEXT_1916 = "_ESETFLAG) != 0;";
  protected final String TEXT_1917 = NL + "\t\treturn ";
  protected final String TEXT_1918 = "ESet;";
  protected final String TEXT_1919 = NL + "\t\treturn !((";
  protected final String TEXT_1920 = ".Internal)((";
  protected final String TEXT_1921 = ".Internal.Wrapper)get";
  protected final String TEXT_1922 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1923 = ");";
  protected final String TEXT_1924 = NL + "\t\treturn !((";
  protected final String TEXT_1925 = ".Internal)get";
  protected final String TEXT_1926 = "()).isEmpty(";
  protected final String TEXT_1927 = ");";
  protected final String TEXT_1928 = NL + "\t\treturn ";
  protected final String TEXT_1929 = ".";
  protected final String TEXT_1930 = "(this);";
  protected final String TEXT_1931 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1932 = "' ";
  protected final String TEXT_1933 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1934 = NL + "\t}" + NL;
  protected final String TEXT_1935 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_1936 = "(";
  protected final String TEXT_1937 = ") <em>";
  protected final String TEXT_1938 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1939 = "(";
  protected final String TEXT_1940 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1941 = " ";
  protected final String TEXT_1942 = "__EOCL_EXP = \"";
  protected final String TEXT_1943 = "\";";
  protected final String TEXT_1944 = NL;
  protected final String TEXT_1945 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_1946 = "(";
  protected final String TEXT_1947 = ") <em>";
  protected final String TEXT_1948 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1949 = "(";
  protected final String TEXT_1950 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1951 = " ";
  protected final String TEXT_1952 = "__EOCL_INV;" + NL;
  protected final String TEXT_1953 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_1954 = "(";
  protected final String TEXT_1955 = ") <em>";
  protected final String TEXT_1956 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1957 = "(";
  protected final String TEXT_1958 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1959 = "<";
  protected final String TEXT_1960 = ">";
  protected final String TEXT_1961 = " ";
  protected final String TEXT_1962 = "__EOCL_QRY;" + NL;
  protected final String TEXT_1963 = NL + "\t/**" + NL + "\t * The cached validation expression for the '{@link #";
  protected final String TEXT_1964 = "(";
  protected final String TEXT_1965 = ") <em>";
  protected final String TEXT_1966 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1967 = "(";
  protected final String TEXT_1968 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1969 = " ";
  protected final String TEXT_1970 = "__EEXPRESSION = \"";
  protected final String TEXT_1971 = "\";";
  protected final String TEXT_1972 = NL;
  protected final String TEXT_1973 = NL + "\t/**" + NL + "\t * The cached invocation delegate for the '{@link #";
  protected final String TEXT_1974 = "(";
  protected final String TEXT_1975 = ") <em>";
  protected final String TEXT_1976 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1977 = "(";
  protected final String TEXT_1978 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1979 = ".Internal.InvocationDelegate ";
  protected final String TEXT_1980 = "__EINVOCATION_DELEGATE = ((";
  protected final String TEXT_1981 = ".Internal)";
  protected final String TEXT_1982 = ").getInvocationDelegate();" + NL;
  protected final String TEXT_1983 = NL + "\t/**";
  protected final String TEXT_1984 = NL + "\t * <p>" + NL + "\t * This operation redefines the following operations:" + NL + "\t * <ul>";
  protected final String TEXT_1985 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_1986 = "#";
  protected final String TEXT_1987 = "(";
  protected final String TEXT_1988 = ") <em>";
  protected final String TEXT_1989 = "</em>}' </li>";
  protected final String TEXT_1990 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_1991 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1992 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1993 = NL + "\t * ";
  protected final String TEXT_1994 = NL + "\t * @param ";
  protected final String TEXT_1995 = NL + "\t *   ";
  protected final String TEXT_1996 = NL + "\t * @param ";
  protected final String TEXT_1997 = " ";
  protected final String TEXT_1998 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1999 = NL + "\t * @model ";
  protected final String TEXT_2000 = NL + "\t *        ";
  protected final String TEXT_2001 = NL + "\t * @model";
  protected final String TEXT_2002 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2003 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2004 = NL + "\t@Override";
  protected final String TEXT_2005 = NL + "\t";
  protected final String TEXT_2006 = " ";
  protected final String TEXT_2007 = "(";
  protected final String TEXT_2008 = ")";
  protected final String TEXT_2009 = ";" + NL;
  protected final String TEXT_2010 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2011 = NL + "\tpublic ";
  protected final String TEXT_2012 = " ";
  protected final String TEXT_2013 = "(";
  protected final String TEXT_2014 = ")";
  protected final String TEXT_2015 = NL + "\t{";
  protected final String TEXT_2016 = NL + "\t\t";
  protected final String TEXT_2017 = NL + "\t\treturn" + NL + "\t\t\t";
  protected final String TEXT_2018 = ".validate" + NL + "\t\t\t\t(";
  protected final String TEXT_2019 = "," + NL + "\t\t\t\t this," + NL + "\t\t\t\t ";
  protected final String TEXT_2020 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_2021 = "," + NL + "\t\t\t\t \"";
  protected final String TEXT_2022 = "\",";
  protected final String TEXT_2023 = NL + "\t\t\t\t ";
  protected final String TEXT_2024 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_2025 = "__EEXPRESSION," + NL + "\t\t\t\t ";
  protected final String TEXT_2026 = ".ERROR," + NL + "\t\t\t\t ";
  protected final String TEXT_2027 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t ";
  protected final String TEXT_2028 = ".";
  protected final String TEXT_2029 = ");";
  protected final String TEXT_2030 = NL + "\t\treturn ";
  protected final String TEXT_2031 = ".";
  protected final String TEXT_2032 = "(this, ";
  protected final String TEXT_2033 = ", ";
  protected final String TEXT_2034 = ");";
  protected final String TEXT_2035 = NL + "\t\tif (";
  protected final String TEXT_2036 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2037 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_2038 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2039 = " = helper.createInvariant(";
  protected final String TEXT_2040 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2041 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_2042 = ").check(this))";
  protected final String TEXT_2043 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_2044 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_2045 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_2046 = NL + "\t\t\t\t";
  protected final String TEXT_2047 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_2048 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_2049 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2050 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2051 = ".";
  protected final String TEXT_2052 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2053 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_2054 = "\", ";
  protected final String TEXT_2055 = ".getObjectLabel(this, ";
  protected final String TEXT_2056 = ") }),";
  protected final String TEXT_2057 = NL + "\t\t\t\t\t\t new Object [] { this }));";
  protected final String TEXT_2058 = NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_2059 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_2060 = NL + "\t\t\t";
  protected final String TEXT_2061 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_2062 = "new ";
  protected final String TEXT_2063 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_2064 = ", ";
  protected final String TEXT_2065 = ")";
  protected final String TEXT_2066 = "null";
  protected final String TEXT_2067 = ");";
  protected final String TEXT_2068 = NL + "\t\t\treturn ";
  protected final String TEXT_2069 = "(";
  protected final String TEXT_2070 = "(";
  protected final String TEXT_2071 = ")";
  protected final String TEXT_2072 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_2073 = "new ";
  protected final String TEXT_2074 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_2075 = ", ";
  protected final String TEXT_2076 = ")";
  protected final String TEXT_2077 = "null";
  protected final String TEXT_2078 = ")";
  protected final String TEXT_2079 = ").";
  protected final String TEXT_2080 = "()";
  protected final String TEXT_2081 = ";";
  protected final String TEXT_2082 = NL + "\t\t}" + NL + "\t\tcatch (";
  protected final String TEXT_2083 = " ite)" + NL + "\t\t{" + NL + "\t\t\tthrow new ";
  protected final String TEXT_2084 = "(ite);" + NL + "\t\t}";
  protected final String TEXT_2085 = NL + "\t\t";
  protected final String TEXT_2086 = ".";
  protected final String TEXT_2087 = "(this";
  protected final String TEXT_2088 = ", ";
  protected final String TEXT_2089 = ");";
  protected final String TEXT_2090 = NL + "\t\t";
  protected final String TEXT_2091 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_2092 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2093 = NL + "\t\t\t";
  protected final String TEXT_2094 = " result = (";
  protected final String TEXT_2095 = ") cache.get(";
  protected final String TEXT_2096 = "eResource(), ";
  protected final String TEXT_2097 = "this, ";
  protected final String TEXT_2098 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_2099 = "eResource(), ";
  protected final String TEXT_2100 = "this, ";
  protected final String TEXT_2101 = ", result = ";
  protected final String TEXT_2102 = "new ";
  protected final String TEXT_2103 = "(";
  protected final String TEXT_2104 = ".";
  protected final String TEXT_2105 = "(this";
  protected final String TEXT_2106 = ", ";
  protected final String TEXT_2107 = ")";
  protected final String TEXT_2108 = ")";
  protected final String TEXT_2109 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_2110 = ".";
  protected final String TEXT_2111 = "()";
  protected final String TEXT_2112 = ";" + NL + "\t\t}";
  protected final String TEXT_2113 = NL + "\t\treturn ";
  protected final String TEXT_2114 = ".";
  protected final String TEXT_2115 = "(this";
  protected final String TEXT_2116 = ", ";
  protected final String TEXT_2117 = ");";
  protected final String TEXT_2118 = NL + "\t\tif (";
  protected final String TEXT_2119 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2120 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_2121 = ", ";
  protected final String TEXT_2122 = ".getEAllOperations().get(";
  protected final String TEXT_2123 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2124 = " = helper.createQuery(";
  protected final String TEXT_2125 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2126 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_2127 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_2128 = ");";
  protected final String TEXT_2129 = NL + "\t\t";
  protected final String TEXT_2130 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_2131 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_2132 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_2133 = "\", ";
  protected final String TEXT_2134 = ");";
  protected final String TEXT_2135 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2136 = NL + "\t\t";
  protected final String TEXT_2137 = "<";
  protected final String TEXT_2138 = "> result = (";
  protected final String TEXT_2139 = "<";
  protected final String TEXT_2140 = ">) query.evaluate(this);" + NL + "\t\treturn new ";
  protected final String TEXT_2141 = ".UnmodifiableEList<";
  protected final String TEXT_2142 = ">(result.size(), result.toArray());";
  protected final String TEXT_2143 = NL + "\t\treturn ((";
  protected final String TEXT_2144 = ") query.evaluate(this)).";
  protected final String TEXT_2145 = "();";
  protected final String TEXT_2146 = NL + "\t\treturn (";
  protected final String TEXT_2147 = ") query.evaluate(this);";
  protected final String TEXT_2148 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2149 = NL + "\t}" + NL;
  protected final String TEXT_2150 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2151 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2152 = NL + "\t@Override";
  protected final String TEXT_2153 = NL + "\tpublic ";
  protected final String TEXT_2154 = " eInverseAdd(";
  protected final String TEXT_2155 = " otherEnd, int featureID, ";
  protected final String TEXT_2156 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2157 = ")" + NL + "\t\t{";
  protected final String TEXT_2158 = NL + "\t\t\tcase ";
  protected final String TEXT_2159 = ":";
  protected final String TEXT_2160 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2161 = "(";
  protected final String TEXT_2162 = ".InternalMapView";
  protected final String TEXT_2163 = ")";
  protected final String TEXT_2164 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2165 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2166 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2167 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2168 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2169 = "((";
  protected final String TEXT_2170 = ")otherEnd, msgs);";
  protected final String TEXT_2171 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_2172 = ", msgs);";
  protected final String TEXT_2173 = NL + "\t\t\t\t";
  protected final String TEXT_2174 = " ";
  protected final String TEXT_2175 = " = (";
  protected final String TEXT_2176 = ")eVirtualGet(";
  protected final String TEXT_2177 = ");";
  protected final String TEXT_2178 = NL + "\t\t\t\t";
  protected final String TEXT_2179 = " ";
  protected final String TEXT_2180 = " = ";
  protected final String TEXT_2181 = "basicGet";
  protected final String TEXT_2182 = "();";
  protected final String TEXT_2183 = NL + "\t\t\t\tif (";
  protected final String TEXT_2184 = " != null)";
  protected final String TEXT_2185 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2186 = ")";
  protected final String TEXT_2187 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_2188 = ", null, msgs);";
  protected final String TEXT_2189 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2190 = ")";
  protected final String TEXT_2191 = ").eInverseRemove(this, ";
  protected final String TEXT_2192 = ", ";
  protected final String TEXT_2193 = ".class, msgs);";
  protected final String TEXT_2194 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2195 = "((";
  protected final String TEXT_2196 = ")otherEnd, msgs);";
  protected final String TEXT_2197 = NL + "\t\t}";
  protected final String TEXT_2198 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2199 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2200 = NL + "\t}" + NL;
  protected final String TEXT_2201 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2202 = NL + "\t@Override";
  protected final String TEXT_2203 = NL + "\tpublic ";
  protected final String TEXT_2204 = " eInverseRemove(";
  protected final String TEXT_2205 = " otherEnd, int featureID, ";
  protected final String TEXT_2206 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2207 = ")" + NL + "\t\t{";
  protected final String TEXT_2208 = NL + "\t\t\tcase ";
  protected final String TEXT_2209 = ":";
  protected final String TEXT_2210 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2211 = ")((";
  protected final String TEXT_2212 = ".InternalMapView";
  protected final String TEXT_2213 = ")";
  protected final String TEXT_2214 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2215 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2216 = ")((";
  protected final String TEXT_2217 = ".Internal.Wrapper)";
  protected final String TEXT_2218 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2219 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2220 = ")";
  protected final String TEXT_2221 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2222 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_2223 = ", msgs);";
  protected final String TEXT_2224 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_2225 = "(msgs);";
  protected final String TEXT_2226 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2227 = "(null, msgs);";
  protected final String TEXT_2228 = NL + "\t\t}";
  protected final String TEXT_2229 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2230 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2231 = NL + "\t}" + NL;
  protected final String TEXT_2232 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2233 = NL + "\t@Override";
  protected final String TEXT_2234 = NL + "\tpublic ";
  protected final String TEXT_2235 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_2236 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID()";
  protected final String TEXT_2237 = ")" + NL + "\t\t{";
  protected final String TEXT_2238 = NL + "\t\t\tcase ";
  protected final String TEXT_2239 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_2240 = ", ";
  protected final String TEXT_2241 = ".class, msgs);";
  protected final String TEXT_2242 = NL + "\t\t}";
  protected final String TEXT_2243 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_2244 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2245 = NL + "\t}" + NL;
  protected final String TEXT_2246 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2247 = NL + "\t@Override";
  protected final String TEXT_2248 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2249 = ")" + NL + "\t\t{";
  protected final String TEXT_2250 = NL + "\t\t\tcase ";
  protected final String TEXT_2251 = ":";
  protected final String TEXT_2252 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2253 = "();";
  protected final String TEXT_2254 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2255 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_2256 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_2257 = "(";
  protected final String TEXT_2258 = "());";
  protected final String TEXT_2259 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_2260 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2261 = "();";
  protected final String TEXT_2262 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2263 = ".InternalMapView";
  protected final String TEXT_2264 = ")";
  protected final String TEXT_2265 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2266 = "();";
  protected final String TEXT_2267 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2268 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2269 = "().map();";
  protected final String TEXT_2270 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2271 = ".Internal.Wrapper)";
  protected final String TEXT_2272 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2273 = "();";
  protected final String TEXT_2274 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2275 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_2276 = ".Internal)";
  protected final String TEXT_2277 = "()).getWrapper();";
  protected final String TEXT_2278 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2279 = "();";
  protected final String TEXT_2280 = NL + "\t\t}";
  protected final String TEXT_2281 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_2282 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_2283 = NL + "\t}" + NL;
  protected final String TEXT_2284 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2285 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2286 = NL + "\t@Override";
  protected final String TEXT_2287 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2288 = ")" + NL + "\t\t{";
  protected final String TEXT_2289 = NL + "\t\t\tcase ";
  protected final String TEXT_2290 = ":";
  protected final String TEXT_2291 = NL + "\t\t\t\t((";
  protected final String TEXT_2292 = ".Internal)((";
  protected final String TEXT_2293 = ".Internal.Wrapper)";
  protected final String TEXT_2294 = "()).featureMap()).set(newValue);";
  protected final String TEXT_2295 = NL + "\t\t\t\t((";
  protected final String TEXT_2296 = ".Internal)";
  protected final String TEXT_2297 = "()).set(newValue);";
  protected final String TEXT_2298 = NL + "\t\t\t\t((";
  protected final String TEXT_2299 = ".Setting)((";
  protected final String TEXT_2300 = ".InternalMapView";
  protected final String TEXT_2301 = ")";
  protected final String TEXT_2302 = "()).eMap()).set(newValue);";
  protected final String TEXT_2303 = NL + "\t\t\t\t((";
  protected final String TEXT_2304 = ".Setting)";
  protected final String TEXT_2305 = "()).set(newValue);";
  protected final String TEXT_2306 = NL + "\t\t\t\t";
  protected final String TEXT_2307 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_2308 = "().addAll((";
  protected final String TEXT_2309 = "<? extends ";
  protected final String TEXT_2310 = ">";
  protected final String TEXT_2311 = ")newValue);";
  protected final String TEXT_2312 = NL + "\t\t\t\tset";
  protected final String TEXT_2313 = "(((";
  protected final String TEXT_2314 = ")newValue).";
  protected final String TEXT_2315 = "());";
  protected final String TEXT_2316 = NL + "\t\t\t\tset";
  protected final String TEXT_2317 = "(";
  protected final String TEXT_2318 = "(";
  protected final String TEXT_2319 = ")";
  protected final String TEXT_2320 = "newValue);";
  protected final String TEXT_2321 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2322 = NL + "\t\t}";
  protected final String TEXT_2323 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_2324 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_2325 = NL + "\t}" + NL;
  protected final String TEXT_2326 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2327 = NL + "\t@Override";
  protected final String TEXT_2328 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2329 = ")" + NL + "\t\t{";
  protected final String TEXT_2330 = NL + "\t\t\tcase ";
  protected final String TEXT_2331 = ":";
  protected final String TEXT_2332 = NL + "\t\t\t\t((";
  protected final String TEXT_2333 = ".Internal.Wrapper)";
  protected final String TEXT_2334 = "()).featureMap().clear();";
  protected final String TEXT_2335 = NL + "\t\t\t\t";
  protected final String TEXT_2336 = "().clear();";
  protected final String TEXT_2337 = NL + "\t\t\t\tunset";
  protected final String TEXT_2338 = "();";
  protected final String TEXT_2339 = NL + "\t\t\t\tset";
  protected final String TEXT_2340 = "((";
  protected final String TEXT_2341 = ")null);";
  protected final String TEXT_2342 = NL + "\t\t\t\t";
  protected final String TEXT_2343 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_2344 = NL + "\t\t\t\tset";
  protected final String TEXT_2345 = "(";
  protected final String TEXT_2346 = ");";
  protected final String TEXT_2347 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2348 = NL + "\t\t}";
  protected final String TEXT_2349 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_2350 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_2351 = NL + "\t}" + NL;
  protected final String TEXT_2352 = NL;
  protected final String TEXT_2353 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2354 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2355 = NL + "\t@Override";
  protected final String TEXT_2356 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_2357 = NL + "\t\t\tcase ";
  protected final String TEXT_2358 = ":";
  protected final String TEXT_2359 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2360 = "();";
  protected final String TEXT_2361 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2362 = "();";
  protected final String TEXT_2363 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2364 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_2365 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_2366 = ".Internal.Wrapper)";
  protected final String TEXT_2367 = "()).featureMap().isEmpty();";
  protected final String TEXT_2368 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2369 = " != null && !";
  protected final String TEXT_2370 = ".featureMap().isEmpty();";
  protected final String TEXT_2371 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2372 = " != null && !";
  protected final String TEXT_2373 = ".isEmpty();";
  protected final String TEXT_2374 = NL + "\t\t\t\t";
  protected final String TEXT_2375 = " ";
  protected final String TEXT_2376 = " = (";
  protected final String TEXT_2377 = ")eVirtualGet(";
  protected final String TEXT_2378 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2379 = " != null && !";
  protected final String TEXT_2380 = ".isEmpty();";
  protected final String TEXT_2381 = NL + "\t\t\t\treturn !";
  protected final String TEXT_2382 = "().isEmpty();";
  protected final String TEXT_2383 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2384 = "();";
  protected final String TEXT_2385 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2386 = " != null;";
  protected final String TEXT_2387 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2388 = ") != null;";
  protected final String TEXT_2389 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2390 = "() != null;";
  protected final String TEXT_2391 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2392 = " != null;";
  protected final String TEXT_2393 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2394 = ") != null;";
  protected final String TEXT_2395 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2396 = "() != null;";
  protected final String TEXT_2397 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2398 = " & ";
  protected final String TEXT_2399 = "_EFLAG) != 0) != ";
  protected final String TEXT_2400 = ";";
  protected final String TEXT_2401 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2402 = " & ";
  protected final String TEXT_2403 = "_EFLAG) != ";
  protected final String TEXT_2404 = "_EFLAG_DEFAULT;";
  protected final String TEXT_2405 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2406 = " != ";
  protected final String TEXT_2407 = ";";
  protected final String TEXT_2408 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2409 = ", ";
  protected final String TEXT_2410 = ") != ";
  protected final String TEXT_2411 = ";";
  protected final String TEXT_2412 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2413 = "() != ";
  protected final String TEXT_2414 = ";";
  protected final String TEXT_2415 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2416 = " == null ? ";
  protected final String TEXT_2417 = " != null : !";
  protected final String TEXT_2418 = ".equals(";
  protected final String TEXT_2419 = ");";
  protected final String TEXT_2420 = NL + "\t\t\t\t";
  protected final String TEXT_2421 = " ";
  protected final String TEXT_2422 = " = (";
  protected final String TEXT_2423 = ")eVirtualGet(";
  protected final String TEXT_2424 = ", ";
  protected final String TEXT_2425 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2426 = " == null ? ";
  protected final String TEXT_2427 = " != null : !";
  protected final String TEXT_2428 = ".equals(";
  protected final String TEXT_2429 = ");";
  protected final String TEXT_2430 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2431 = " == null ? ";
  protected final String TEXT_2432 = "() != null : !";
  protected final String TEXT_2433 = ".equals(";
  protected final String TEXT_2434 = "());";
  protected final String TEXT_2435 = NL + "\t\t}";
  protected final String TEXT_2436 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2437 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2438 = NL + "\t}" + NL;
  protected final String TEXT_2439 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2440 = NL + "\t@Override";
  protected final String TEXT_2441 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2442 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2443 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2444 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_2445 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2446 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2447 = ": return ";
  protected final String TEXT_2448 = ";";
  protected final String TEXT_2449 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2450 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_2451 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2452 = NL + "\t@Override";
  protected final String TEXT_2453 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2454 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2455 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2456 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2457 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2458 = ": return ";
  protected final String TEXT_2459 = ";";
  protected final String TEXT_2460 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2461 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2462 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_2463 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2464 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2465 = ": return ";
  protected final String TEXT_2466 = ";";
  protected final String TEXT_2467 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2468 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2469 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2470 = NL + "\t@Override";
  protected final String TEXT_2471 = NL + "\tpublic int eDerivedOperationID(int baseOperationID, Class";
  protected final String TEXT_2472 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2473 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2474 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_2475 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2476 = ": return ";
  protected final String TEXT_2477 = ";";
  protected final String TEXT_2478 = NL + "\t\t\t\tdefault: return super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2479 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2480 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_2481 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2482 = ": return ";
  protected final String TEXT_2483 = ";";
  protected final String TEXT_2484 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2485 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2486 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID";
  protected final String TEXT_2487 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2488 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2489 = ": return ";
  protected final String TEXT_2490 = ";";
  protected final String TEXT_2491 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2492 = NL + "\t\treturn super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2493 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2494 = NL + "\t@Override";
  protected final String TEXT_2495 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2496 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2497 = NL + "\t@Override";
  protected final String TEXT_2498 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2499 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2500 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2501 = NL + "\t@Override";
  protected final String TEXT_2502 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2503 = NL + "\t\t\tcase ";
  protected final String TEXT_2504 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2505 = ";";
  protected final String TEXT_2506 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2507 = NL + "\t@Override";
  protected final String TEXT_2508 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2509 = NL + "\t\t\tcase ";
  protected final String TEXT_2510 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2511 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2512 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2513 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2514 = NL + "\t@Override";
  protected final String TEXT_2515 = NL + "\t@SuppressWarnings(";
  protected final String TEXT_2516 = "\"unchecked\"";
  protected final String TEXT_2517 = "{\"rawtypes\", \"unchecked\" }";
  protected final String TEXT_2518 = ")";
  protected final String TEXT_2519 = NL + "\tpublic Object eInvoke(int operationID, ";
  protected final String TEXT_2520 = " arguments) throws ";
  protected final String TEXT_2521 = NL + "\t{" + NL + "\t\tswitch (operationID";
  protected final String TEXT_2522 = ")" + NL + "\t\t{";
  protected final String TEXT_2523 = NL + "\t\t\tcase ";
  protected final String TEXT_2524 = ":";
  protected final String TEXT_2525 = NL + "\t\t\t\ttry" + NL + "\t\t\t\t{";
  protected final String TEXT_2526 = NL + "\t\t\t\t";
  protected final String TEXT_2527 = "(";
  protected final String TEXT_2528 = "(";
  protected final String TEXT_2529 = "(";
  protected final String TEXT_2530 = ")";
  protected final String TEXT_2531 = "arguments.get(";
  protected final String TEXT_2532 = ")";
  protected final String TEXT_2533 = ").";
  protected final String TEXT_2534 = "()";
  protected final String TEXT_2535 = ", ";
  protected final String TEXT_2536 = ");" + NL + "\t\t\t\t";
  protected final String TEXT_2537 = "return null;";
  protected final String TEXT_2538 = NL + "\t\t\t\t";
  protected final String TEXT_2539 = "return ";
  protected final String TEXT_2540 = "new ";
  protected final String TEXT_2541 = "(";
  protected final String TEXT_2542 = "(";
  protected final String TEXT_2543 = "(";
  protected final String TEXT_2544 = "(";
  protected final String TEXT_2545 = ")";
  protected final String TEXT_2546 = "arguments.get(";
  protected final String TEXT_2547 = ")";
  protected final String TEXT_2548 = ").";
  protected final String TEXT_2549 = "()";
  protected final String TEXT_2550 = ", ";
  protected final String TEXT_2551 = ")";
  protected final String TEXT_2552 = ")";
  protected final String TEXT_2553 = ";";
  protected final String TEXT_2554 = NL + "\t\t\t\t}" + NL + "\t\t\t\tcatch (";
  protected final String TEXT_2555 = " throwable)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tthrow new ";
  protected final String TEXT_2556 = "(throwable);" + NL + "\t\t\t\t}";
  protected final String TEXT_2557 = NL + "\t\t}";
  protected final String TEXT_2558 = NL + "\t\treturn super.eInvoke(operationID, arguments);";
  protected final String TEXT_2559 = NL + "\t\treturn eDynamicInvoke(operationID, arguments);";
  protected final String TEXT_2560 = NL + "\t}" + NL;
  protected final String TEXT_2561 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2562 = NL + "\t@Override";
  protected final String TEXT_2563 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2564 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2565 = ": \");";
  protected final String TEXT_2566 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2567 = ": \");";
  protected final String TEXT_2568 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2569 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2570 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2571 = NL + "\t\tif (";
  protected final String TEXT_2572 = "(";
  protected final String TEXT_2573 = " & ";
  protected final String TEXT_2574 = "_ESETFLAG) != 0";
  protected final String TEXT_2575 = "ESet";
  protected final String TEXT_2576 = ") result.append((";
  protected final String TEXT_2577 = " & ";
  protected final String TEXT_2578 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2579 = NL + "\t\tif (";
  protected final String TEXT_2580 = "(";
  protected final String TEXT_2581 = " & ";
  protected final String TEXT_2582 = "_ESETFLAG) != 0";
  protected final String TEXT_2583 = "ESet";
  protected final String TEXT_2584 = ") result.append(";
  protected final String TEXT_2585 = "_EFLAG_VALUES[(";
  protected final String TEXT_2586 = " & ";
  protected final String TEXT_2587 = "_EFLAG) >>> ";
  protected final String TEXT_2588 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_2589 = NL + "\t\tif (";
  protected final String TEXT_2590 = "(";
  protected final String TEXT_2591 = " & ";
  protected final String TEXT_2592 = "_ESETFLAG) != 0";
  protected final String TEXT_2593 = "ESet";
  protected final String TEXT_2594 = ") result.append(";
  protected final String TEXT_2595 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2596 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2597 = ", ";
  protected final String TEXT_2598 = "));";
  protected final String TEXT_2599 = NL + "\t\tresult.append((";
  protected final String TEXT_2600 = " & ";
  protected final String TEXT_2601 = "_EFLAG) != 0);";
  protected final String TEXT_2602 = NL + "\t\tresult.append(";
  protected final String TEXT_2603 = "_EFLAG_VALUES[(";
  protected final String TEXT_2604 = " & ";
  protected final String TEXT_2605 = "_EFLAG) >>> ";
  protected final String TEXT_2606 = "_EFLAG_OFFSET]);";
  protected final String TEXT_2607 = NL + "\t\tresult.append(";
  protected final String TEXT_2608 = ");";
  protected final String TEXT_2609 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2610 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2611 = NL + "\t@";
  protected final String TEXT_2612 = NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2613 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2614 = " getKey()" + NL + "\t{";
  protected final String TEXT_2615 = NL + "\t\treturn new ";
  protected final String TEXT_2616 = "(getTypedKey());";
  protected final String TEXT_2617 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2618 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2619 = " key)" + NL + "\t{";
  protected final String TEXT_2620 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2621 = "(";
  protected final String TEXT_2622 = ")";
  protected final String TEXT_2623 = "key);";
  protected final String TEXT_2624 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2625 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2626 = ")key).";
  protected final String TEXT_2627 = "());";
  protected final String TEXT_2628 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2629 = ")key);";
  protected final String TEXT_2630 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2631 = " getValue()" + NL + "\t{";
  protected final String TEXT_2632 = NL + "\t\treturn new ";
  protected final String TEXT_2633 = "(getTypedValue());";
  protected final String TEXT_2634 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2635 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2636 = " setValue(";
  protected final String TEXT_2637 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2638 = " oldValue = getValue();";
  protected final String TEXT_2639 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2640 = "(";
  protected final String TEXT_2641 = ")";
  protected final String TEXT_2642 = "value);";
  protected final String TEXT_2643 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2644 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2645 = ")value).";
  protected final String TEXT_2646 = "());";
  protected final String TEXT_2647 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2648 = ")value);";
  protected final String TEXT_2649 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2650 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2651 = NL + "\tpublic ";
  protected final String TEXT_2652 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2653 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2654 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2655 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2656 = " EOCL_ENV = ";
  protected final String TEXT_2657 = ".newInstance();" + NL;
  protected final String TEXT_2658 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2659 = " create(";
  protected final String TEXT_2660 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2661 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2662 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2663 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2664 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2665 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2666 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2667 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2668 = NL + "\t@Override";
  protected final String TEXT_2669 = NL + "\tprotected ";
  protected final String TEXT_2670 = " ";
  protected final String TEXT_2671 = "Helper(";
  protected final String TEXT_2672 = " ";
  protected final String TEXT_2673 = ")" + NL + "\t{";
  protected final String TEXT_2674 = NL + "\t\t";
  protected final String TEXT_2675 = ".addAll(super.";
  protected final String TEXT_2676 = "());";
  protected final String TEXT_2677 = NL + "\t\tsuper.";
  protected final String TEXT_2678 = "Helper(";
  protected final String TEXT_2679 = ");";
  protected final String TEXT_2680 = NL + "\t\tif (isSet";
  protected final String TEXT_2681 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2682 = "<";
  protected final String TEXT_2683 = ">";
  protected final String TEXT_2684 = " i = ((";
  protected final String TEXT_2685 = ") ";
  protected final String TEXT_2686 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2687 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2688 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2689 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2690 = "<";
  protected final String TEXT_2691 = ">";
  protected final String TEXT_2692 = " i = ((";
  protected final String TEXT_2693 = ") ";
  protected final String TEXT_2694 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2695 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2696 = NL + "\t\t";
  protected final String TEXT_2697 = " ";
  protected final String TEXT_2698 = " = ";
  protected final String TEXT_2699 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2700 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2701 = "<";
  protected final String TEXT_2702 = ">";
  protected final String TEXT_2703 = " i = ((";
  protected final String TEXT_2704 = ") ";
  protected final String TEXT_2705 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2706 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2707 = NL + "\t\tif (isSet";
  protected final String TEXT_2708 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2709 = ".addAll(";
  protected final String TEXT_2710 = "());" + NL + "\t\t}";
  protected final String TEXT_2711 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2712 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2713 = ".addAll(";
  protected final String TEXT_2714 = "());" + NL + "\t\t}";
  protected final String TEXT_2715 = NL + "\t\t";
  protected final String TEXT_2716 = " ";
  protected final String TEXT_2717 = " = ";
  protected final String TEXT_2718 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2719 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2720 = ".addAll(";
  protected final String TEXT_2721 = ");" + NL + "\t\t}";
  protected final String TEXT_2722 = NL + "\t\tif (isSet";
  protected final String TEXT_2723 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2724 = ".add(";
  protected final String TEXT_2725 = "basicGet";
  protected final String TEXT_2726 = "());" + NL + "\t\t}";
  protected final String TEXT_2727 = NL + "\t\t";
  protected final String TEXT_2728 = " ";
  protected final String TEXT_2729 = " = ";
  protected final String TEXT_2730 = "basicGet";
  protected final String TEXT_2731 = "();" + NL + "\t\tif (";
  protected final String TEXT_2732 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2733 = ".add(";
  protected final String TEXT_2734 = ");" + NL + "\t\t}";
  protected final String TEXT_2735 = NL + "\t\treturn ";
  protected final String TEXT_2736 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2737 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2738 = NL + "\t@Override";
  protected final String TEXT_2739 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2740 = "()" + NL + "\t{";
  protected final String TEXT_2741 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2742 = "()";
  protected final String TEXT_2743 = NL + "\t\treturn isSet";
  protected final String TEXT_2744 = "()";
  protected final String TEXT_2745 = ";";
  protected final String TEXT_2746 = NL + "\t\treturn !";
  protected final String TEXT_2747 = "().isEmpty()";
  protected final String TEXT_2748 = ";";
  protected final String TEXT_2749 = NL + "\t\treturn ";
  protected final String TEXT_2750 = "basicGet";
  protected final String TEXT_2751 = "() != null";
  protected final String TEXT_2752 = ";";
  protected final String TEXT_2753 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2754 = ")";
  protected final String TEXT_2755 = ";";
  protected final String TEXT_2756 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2757 = "()";
  protected final String TEXT_2758 = ";";
  protected final String TEXT_2759 = NL + "\t\t\t|| !";
  protected final String TEXT_2760 = "().isEmpty()";
  protected final String TEXT_2761 = ";";
  protected final String TEXT_2762 = NL + "\t\t\t|| ";
  protected final String TEXT_2763 = "basicGet";
  protected final String TEXT_2764 = "() != null";
  protected final String TEXT_2765 = ";";
  protected final String TEXT_2766 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2767 = ")";
  protected final String TEXT_2768 = ";";
  protected final String TEXT_2769 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2770 = "();";
  protected final String TEXT_2771 = NL + "\t\treturn false;";
  protected final String TEXT_2772 = NL + "\t}" + NL;
  protected final String TEXT_2773 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2774 = NL + "\t@Override";
  protected final String TEXT_2775 = NL + "\tpublic ";
  protected final String TEXT_2776 = " ";
  protected final String TEXT_2777 = "()" + NL + "\t{";
  protected final String TEXT_2778 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2779 = " ";
  protected final String TEXT_2780 = " = (";
  protected final String TEXT_2781 = ")((";
  protected final String TEXT_2782 = ")";
  protected final String TEXT_2783 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2784 = ";";
  protected final String TEXT_2785 = NL + "\t\treturn ";
  protected final String TEXT_2786 = "();";
  protected final String TEXT_2787 = NL + "\t\treturn new ";
  protected final String TEXT_2788 = ".UnmodifiableEList";
  protected final String TEXT_2789 = "(this, ";
  protected final String TEXT_2790 = "null";
  protected final String TEXT_2791 = ", 0, ";
  protected final String TEXT_2792 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2793 = NL + "\t\treturn null;";
  protected final String TEXT_2794 = NL + "\t\treturn ";
  protected final String TEXT_2795 = "();";
  protected final String TEXT_2796 = NL + "\t}" + NL;
  protected final String TEXT_2797 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2798 = NL + "\t@Override";
  protected final String TEXT_2799 = NL + "\tpublic ";
  protected final String TEXT_2800 = " basicGet";
  protected final String TEXT_2801 = "()" + NL + "\t{";
  protected final String TEXT_2802 = NL + "\t\treturn null;";
  protected final String TEXT_2803 = NL + "\t\treturn ";
  protected final String TEXT_2804 = "basicGet";
  protected final String TEXT_2805 = "();";
  protected final String TEXT_2806 = NL + "\t}" + NL;
  protected final String TEXT_2807 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2808 = NL + "\t@Override";
  protected final String TEXT_2809 = NL + "\tpublic ";
  protected final String TEXT_2810 = " basicSet";
  protected final String TEXT_2811 = "(";
  protected final String TEXT_2812 = " new";
  protected final String TEXT_2813 = ", ";
  protected final String TEXT_2814 = " msgs)" + NL + "\t{";
  protected final String TEXT_2815 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2816 = NL + "\t\tif (new";
  protected final String TEXT_2817 = " != null && !(new";
  protected final String TEXT_2818 = " instanceof ";
  protected final String TEXT_2819 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2820 = "));" + NL + "\t\t}";
  protected final String TEXT_2821 = NL + "\t\treturn basicSet";
  protected final String TEXT_2822 = "(";
  protected final String TEXT_2823 = "(";
  protected final String TEXT_2824 = ") ";
  protected final String TEXT_2825 = "new";
  protected final String TEXT_2826 = ", msgs);";
  protected final String TEXT_2827 = NL + "\t\tset";
  protected final String TEXT_2828 = "(";
  protected final String TEXT_2829 = "(";
  protected final String TEXT_2830 = ") ";
  protected final String TEXT_2831 = "new";
  protected final String TEXT_2832 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2833 = NL + "\t}" + NL;
  protected final String TEXT_2834 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2835 = NL + "\t@Override";
  protected final String TEXT_2836 = NL + "\tpublic void set";
  protected final String TEXT_2837 = "(";
  protected final String TEXT_2838 = " new";
  protected final String TEXT_2839 = ")" + NL + "\t{";
  protected final String TEXT_2840 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2841 = NL + "\t\tif (new";
  protected final String TEXT_2842 = " != null && !(new";
  protected final String TEXT_2843 = " instanceof ";
  protected final String TEXT_2844 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2845 = "));" + NL + "\t\t}";
  protected final String TEXT_2846 = NL + "\t\tset";
  protected final String TEXT_2847 = "(";
  protected final String TEXT_2848 = "(";
  protected final String TEXT_2849 = ") ";
  protected final String TEXT_2850 = "new";
  protected final String TEXT_2851 = ");";
  protected final String TEXT_2852 = NL + "\t}" + NL;
  protected final String TEXT_2853 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2854 = "() <em>";
  protected final String TEXT_2855 = "</em>}' ";
  protected final String TEXT_2856 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2857 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2858 = "_ESUBSETS = ";
  protected final String TEXT_2859 = ";" + NL;
  protected final String TEXT_2860 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2861 = "() <em>";
  protected final String TEXT_2862 = "</em>}' ";
  protected final String TEXT_2863 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2864 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2865 = "_ESUPERSETS = ";
  protected final String TEXT_2866 = ";" + NL;
  protected final String TEXT_2867 = NL + "\t/**";
  protected final String TEXT_2868 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2869 = "}, with the specified ";
  protected final String TEXT_2870 = ", and appends it to the '<em><b>";
  protected final String TEXT_2871 = "</b></em>' ";
  protected final String TEXT_2872 = ".";
  protected final String TEXT_2873 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2874 = "}, with the specified ";
  protected final String TEXT_2875 = ", and sets the '<em><b>";
  protected final String TEXT_2876 = "</b></em>' ";
  protected final String TEXT_2877 = ".";
  protected final String TEXT_2878 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2879 = "} and appends it to the '<em><b>";
  protected final String TEXT_2880 = "</b></em>' ";
  protected final String TEXT_2881 = ".";
  protected final String TEXT_2882 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2883 = "} and sets the '<em><b>";
  protected final String TEXT_2884 = "</b></em>' ";
  protected final String TEXT_2885 = ".";
  protected final String TEXT_2886 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2887 = NL + "\t * @param ";
  protected final String TEXT_2888 = " The ";
  protected final String TEXT_2889 = " for the new {@link ";
  protected final String TEXT_2890 = "}, or <code>null</code>.";
  protected final String TEXT_2891 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2892 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2893 = "}." + NL + "\t * @see #";
  protected final String TEXT_2894 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2895 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2896 = NL + "\t";
  protected final String TEXT_2897 = " create";
  protected final String TEXT_2898 = "(";
  protected final String TEXT_2899 = ", ";
  protected final String TEXT_2900 = " eClass);" + NL;
  protected final String TEXT_2901 = NL + "\t@Override";
  protected final String TEXT_2902 = NL + "\tpublic ";
  protected final String TEXT_2903 = " create";
  protected final String TEXT_2904 = "(";
  protected final String TEXT_2905 = ", ";
  protected final String TEXT_2906 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2907 = " new";
  protected final String TEXT_2908 = " = (";
  protected final String TEXT_2909 = ") create(eClass);";
  protected final String TEXT_2910 = NL + "\t\t";
  protected final String TEXT_2911 = "().add(new";
  protected final String TEXT_2912 = ");";
  protected final String TEXT_2913 = NL + "\t\tset";
  protected final String TEXT_2914 = "(new";
  protected final String TEXT_2915 = ");";
  protected final String TEXT_2916 = NL + "\t\tint ";
  protected final String TEXT_2917 = "ListSize = 0;";
  protected final String TEXT_2918 = NL + "\t\tint ";
  protected final String TEXT_2919 = "Size = ";
  protected final String TEXT_2920 = " == null ? 0 : ";
  protected final String TEXT_2921 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2922 = "Size > ";
  protected final String TEXT_2923 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2924 = "ListSize = ";
  protected final String TEXT_2925 = "Size;";
  protected final String TEXT_2926 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2927 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2928 = ".create";
  protected final String TEXT_2929 = "(";
  protected final String TEXT_2930 = ", ";
  protected final String TEXT_2931 = "i < ";
  protected final String TEXT_2932 = "Size ? (";
  protected final String TEXT_2933 = ") ";
  protected final String TEXT_2934 = ".get(i) : null";
  protected final String TEXT_2935 = ");" + NL + "\t\t}";
  protected final String TEXT_2936 = NL + "\t\tnew";
  protected final String TEXT_2937 = ".create";
  protected final String TEXT_2938 = "(";
  protected final String TEXT_2939 = ", ";
  protected final String TEXT_2940 = ");";
  protected final String TEXT_2941 = NL + "\t\tif (";
  protected final String TEXT_2942 = " != null)";
  protected final String TEXT_2943 = NL + "\t\t\tnew";
  protected final String TEXT_2944 = ".";
  protected final String TEXT_2945 = "().addAll(";
  protected final String TEXT_2946 = ");";
  protected final String TEXT_2947 = NL + "\t\t\tnew";
  protected final String TEXT_2948 = ".set";
  protected final String TEXT_2949 = "(";
  protected final String TEXT_2950 = ");";
  protected final String TEXT_2951 = NL + "\t\treturn new";
  protected final String TEXT_2952 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2953 = NL + "\t/**";
  protected final String TEXT_2954 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2955 = "}, with the specified ";
  protected final String TEXT_2956 = ", and appends it to the '<em><b>";
  protected final String TEXT_2957 = "</b></em>' ";
  protected final String TEXT_2958 = ".";
  protected final String TEXT_2959 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2960 = "},with the specified ";
  protected final String TEXT_2961 = ", and sets the '<em><b>";
  protected final String TEXT_2962 = "</b></em>' ";
  protected final String TEXT_2963 = ".";
  protected final String TEXT_2964 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2965 = "} and appends it to the '<em><b>";
  protected final String TEXT_2966 = "</b></em>' ";
  protected final String TEXT_2967 = ".";
  protected final String TEXT_2968 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2969 = "} and sets the '<em><b>";
  protected final String TEXT_2970 = "</b></em>' ";
  protected final String TEXT_2971 = ".";
  protected final String TEXT_2972 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2973 = NL + "\t * @param ";
  protected final String TEXT_2974 = " The ";
  protected final String TEXT_2975 = " for the new {@link ";
  protected final String TEXT_2976 = "}, or <code>null</code>.";
  protected final String TEXT_2977 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2978 = "}." + NL + "\t * @see #";
  protected final String TEXT_2979 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2980 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2981 = NL + "\t";
  protected final String TEXT_2982 = " create";
  protected final String TEXT_2983 = "(";
  protected final String TEXT_2984 = ");" + NL;
  protected final String TEXT_2985 = NL + "\t@Override";
  protected final String TEXT_2986 = NL + "\tpublic ";
  protected final String TEXT_2987 = " create";
  protected final String TEXT_2988 = "(";
  protected final String TEXT_2989 = ")" + NL + "\t{";
  protected final String TEXT_2990 = NL + "\t\treturn create";
  protected final String TEXT_2991 = "(";
  protected final String TEXT_2992 = ", ";
  protected final String TEXT_2993 = ");";
  protected final String TEXT_2994 = NL + "\t\t";
  protected final String TEXT_2995 = " new";
  protected final String TEXT_2996 = " = (";
  protected final String TEXT_2997 = ") create(";
  protected final String TEXT_2998 = ");";
  protected final String TEXT_2999 = NL + "\t\t";
  protected final String TEXT_3000 = "().add(new";
  protected final String TEXT_3001 = ");";
  protected final String TEXT_3002 = NL + "\t\tset";
  protected final String TEXT_3003 = "(new";
  protected final String TEXT_3004 = ");";
  protected final String TEXT_3005 = NL + "\t\tint ";
  protected final String TEXT_3006 = "ListSize = 0;";
  protected final String TEXT_3007 = NL + "\t\tint ";
  protected final String TEXT_3008 = "Size = ";
  protected final String TEXT_3009 = " == null ? 0 : ";
  protected final String TEXT_3010 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_3011 = "Size > ";
  protected final String TEXT_3012 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_3013 = "ListSize = ";
  protected final String TEXT_3014 = "Size;";
  protected final String TEXT_3015 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_3016 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_3017 = ".create";
  protected final String TEXT_3018 = "(";
  protected final String TEXT_3019 = ", ";
  protected final String TEXT_3020 = "i < ";
  protected final String TEXT_3021 = "Size ? (";
  protected final String TEXT_3022 = ") ";
  protected final String TEXT_3023 = ".get(i) : null";
  protected final String TEXT_3024 = ");" + NL + "\t\t}";
  protected final String TEXT_3025 = NL + "\t\tnew";
  protected final String TEXT_3026 = ".create";
  protected final String TEXT_3027 = "(";
  protected final String TEXT_3028 = ", ";
  protected final String TEXT_3029 = ");";
  protected final String TEXT_3030 = NL + "\t\tif (";
  protected final String TEXT_3031 = " != null)";
  protected final String TEXT_3032 = NL + "\t\t\tnew";
  protected final String TEXT_3033 = ".";
  protected final String TEXT_3034 = "().addAll(";
  protected final String TEXT_3035 = ");";
  protected final String TEXT_3036 = NL + "\t\t\tnew";
  protected final String TEXT_3037 = ".set";
  protected final String TEXT_3038 = "(";
  protected final String TEXT_3039 = ");";
  protected final String TEXT_3040 = NL + "\t\treturn new";
  protected final String TEXT_3041 = ";";
  protected final String TEXT_3042 = NL + "\t}" + NL;
  protected final String TEXT_3043 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_3044 = "} with the specified ";
  protected final String TEXT_3045 = " from the '<em><b>";
  protected final String TEXT_3046 = "</b></em>' ";
  protected final String TEXT_3047 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3048 = NL + "\t * @param ";
  protected final String TEXT_3049 = " The ";
  protected final String TEXT_3050 = " of the {@link ";
  protected final String TEXT_3051 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3052 = NL + "\t * @return The first {@link ";
  protected final String TEXT_3053 = "} with the specified ";
  protected final String TEXT_3054 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_3055 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3056 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3057 = NL + "\t";
  protected final String TEXT_3058 = " get";
  protected final String TEXT_3059 = "(";
  protected final String TEXT_3060 = ");" + NL;
  protected final String TEXT_3061 = NL + "\t@Override";
  protected final String TEXT_3062 = NL + "\tpublic ";
  protected final String TEXT_3063 = " get";
  protected final String TEXT_3064 = "(";
  protected final String TEXT_3065 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_3066 = "(";
  protected final String TEXT_3067 = ", false";
  protected final String TEXT_3068 = ", null";
  protected final String TEXT_3069 = ", false";
  protected final String TEXT_3070 = ");" + NL + "\t}" + NL;
  protected final String TEXT_3071 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_3072 = "} with the specified ";
  protected final String TEXT_3073 = " from the '<em><b>";
  protected final String TEXT_3074 = "</b></em>' ";
  protected final String TEXT_3075 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3076 = NL + "\t * @param ";
  protected final String TEXT_3077 = " The ";
  protected final String TEXT_3078 = " of the {@link ";
  protected final String TEXT_3079 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3080 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_3081 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_3082 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3083 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_3084 = "} on demand if not found.";
  protected final String TEXT_3085 = NL + "\t * @return The first {@link ";
  protected final String TEXT_3086 = "} with the specified ";
  protected final String TEXT_3087 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_3088 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3089 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3090 = NL + "\t";
  protected final String TEXT_3091 = " get";
  protected final String TEXT_3092 = "(";
  protected final String TEXT_3093 = ", boolean ignoreCase";
  protected final String TEXT_3094 = ", ";
  protected final String TEXT_3095 = " eClass";
  protected final String TEXT_3096 = ", boolean createOnDemand";
  protected final String TEXT_3097 = ");" + NL;
  protected final String TEXT_3098 = NL + "\t@Override";
  protected final String TEXT_3099 = NL + "\tpublic ";
  protected final String TEXT_3100 = " get";
  protected final String TEXT_3101 = "(";
  protected final String TEXT_3102 = ", boolean ignoreCase";
  protected final String TEXT_3103 = ", ";
  protected final String TEXT_3104 = " eClass";
  protected final String TEXT_3105 = ", boolean createOnDemand";
  protected final String TEXT_3106 = ")" + NL + "\t{";
  protected final String TEXT_3107 = NL + "\t\t";
  protected final String TEXT_3108 = "Loop: for (";
  protected final String TEXT_3109 = " ";
  protected final String TEXT_3110 = " : ";
  protected final String TEXT_3111 = "())" + NL + "\t\t{";
  protected final String TEXT_3112 = NL + "\t\t";
  protected final String TEXT_3113 = "Loop: for (";
  protected final String TEXT_3114 = " i = ";
  protected final String TEXT_3115 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_3116 = " ";
  protected final String TEXT_3117 = " = (";
  protected final String TEXT_3118 = ") i.next();";
  protected final String TEXT_3119 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_3120 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3121 = "Loop;";
  protected final String TEXT_3122 = NL + "\t\t\t";
  protected final String TEXT_3123 = " ";
  protected final String TEXT_3124 = "List = ";
  protected final String TEXT_3125 = ".";
  protected final String TEXT_3126 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_3127 = "ListSize = ";
  protected final String TEXT_3128 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_3129 = " || (";
  protected final String TEXT_3130 = " != null && ";
  protected final String TEXT_3131 = ".size() != ";
  protected final String TEXT_3132 = "ListSize";
  protected final String TEXT_3133 = ")";
  protected final String TEXT_3134 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_3135 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_3136 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_3137 = " ";
  protected final String TEXT_3138 = " = ";
  protected final String TEXT_3139 = "(";
  protected final String TEXT_3140 = ") ";
  protected final String TEXT_3141 = "List.get(j);";
  protected final String TEXT_3142 = NL + "\t\t\t\tif (";
  protected final String TEXT_3143 = " != null && !(ignoreCase ? (";
  protected final String TEXT_3144 = "(";
  protected final String TEXT_3145 = ")";
  protected final String TEXT_3146 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_3147 = ".";
  protected final String TEXT_3148 = "()) : ";
  protected final String TEXT_3149 = ".get(j).equals(";
  protected final String TEXT_3150 = ".";
  protected final String TEXT_3151 = "())))";
  protected final String TEXT_3152 = NL + "\t\t\t\tif (";
  protected final String TEXT_3153 = " != null && !";
  protected final String TEXT_3154 = ".get(j).equals(";
  protected final String TEXT_3155 = ".";
  protected final String TEXT_3156 = "()))";
  protected final String TEXT_3157 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_3158 = "Loop;";
  protected final String TEXT_3159 = NL + "\t\t\t}";
  protected final String TEXT_3160 = NL + "\t\t\t";
  protected final String TEXT_3161 = " ";
  protected final String TEXT_3162 = " = ";
  protected final String TEXT_3163 = ".";
  protected final String TEXT_3164 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_3165 = " == null)" + NL + "\t\t\t\tcontinue ";
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
  protected final String TEXT_3182 = NL + "\t\t\tif (";
  protected final String TEXT_3183 = " != null && !(ignoreCase ? ";
  protected final String TEXT_3184 = ".equalsIgnoreCase(";
  protected final String TEXT_3185 = ".";
  protected final String TEXT_3186 = "()) : ";
  protected final String TEXT_3187 = ".equals(";
  protected final String TEXT_3188 = ".";
  protected final String TEXT_3189 = "())))";
  protected final String TEXT_3190 = NL + "\t\t\tif (";
  protected final String TEXT_3191 = " != null && !";
  protected final String TEXT_3192 = ".equals(";
  protected final String TEXT_3193 = ".";
  protected final String TEXT_3194 = "()))";
  protected final String TEXT_3195 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3196 = "Loop;";
  protected final String TEXT_3197 = NL + "\t\t\treturn ";
  protected final String TEXT_3198 = ";" + NL + "\t\t}";
  protected final String TEXT_3199 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_3200 = " && eClass != null";
  protected final String TEXT_3201 = " ? create";
  protected final String TEXT_3202 = "(";
  protected final String TEXT_3203 = ", eClass";
  protected final String TEXT_3204 = ") : null;";
  protected final String TEXT_3205 = NL + "\t\treturn null;";
  protected final String TEXT_3206 = NL + "\t}" + NL;
  protected final String TEXT_3207 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_3208 = "()" + NL + "\t{";
  protected final String TEXT_3209 = NL + "  \t\treturn false;";
  protected final String TEXT_3210 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3211 = ");";
  protected final String TEXT_3212 = NL + "\t\treturn !((";
  protected final String TEXT_3213 = ".Internal.Wrapper)";
  protected final String TEXT_3214 = "()).featureMap().isEmpty();";
  protected final String TEXT_3215 = NL + "\t\treturn ";
  protected final String TEXT_3216 = " != null && !";
  protected final String TEXT_3217 = ".featureMap().isEmpty();";
  protected final String TEXT_3218 = NL + "\t\treturn ";
  protected final String TEXT_3219 = " != null && !";
  protected final String TEXT_3220 = ".isEmpty();";
  protected final String TEXT_3221 = NL + "\t\t";
  protected final String TEXT_3222 = " ";
  protected final String TEXT_3223 = " = (";
  protected final String TEXT_3224 = ")eVirtualGet(";
  protected final String TEXT_3225 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3226 = " != null && !";
  protected final String TEXT_3227 = ".isEmpty();";
  protected final String TEXT_3228 = NL + "\t\treturn !";
  protected final String TEXT_3229 = "().isEmpty();";
  protected final String TEXT_3230 = NL + "\t\treturn ";
  protected final String TEXT_3231 = " != null;";
  protected final String TEXT_3232 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3233 = ") != null;";
  protected final String TEXT_3234 = NL + "\t\treturn basicGet";
  protected final String TEXT_3235 = "() != null;";
  protected final String TEXT_3236 = NL + "\t\treturn ";
  protected final String TEXT_3237 = " != null;";
  protected final String TEXT_3238 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3239 = ") != null;";
  protected final String TEXT_3240 = NL + "\t\treturn ";
  protected final String TEXT_3241 = "() != null;";
  protected final String TEXT_3242 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_3243 = " & ";
  protected final String TEXT_3244 = "_EFLAG) != 0) != ";
  protected final String TEXT_3245 = ";";
  protected final String TEXT_3246 = NL + "\t\t\t\treturn (";
  protected final String TEXT_3247 = " & ";
  protected final String TEXT_3248 = "_EFLAG) != ";
  protected final String TEXT_3249 = "_EFLAG_DEFAULT;";
  protected final String TEXT_3250 = NL + "\t\treturn ";
  protected final String TEXT_3251 = " != ";
  protected final String TEXT_3252 = ";";
  protected final String TEXT_3253 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3254 = ", ";
  protected final String TEXT_3255 = ") != ";
  protected final String TEXT_3256 = ";";
  protected final String TEXT_3257 = NL + "\t\treturn ";
  protected final String TEXT_3258 = "() != ";
  protected final String TEXT_3259 = ";";
  protected final String TEXT_3260 = NL + "\t\treturn ";
  protected final String TEXT_3261 = " == null ? ";
  protected final String TEXT_3262 = " != null : !";
  protected final String TEXT_3263 = ".equals(";
  protected final String TEXT_3264 = ");";
  protected final String TEXT_3265 = NL + "\t\t";
  protected final String TEXT_3266 = " ";
  protected final String TEXT_3267 = " = (";
  protected final String TEXT_3268 = ")eVirtualGet(";
  protected final String TEXT_3269 = ", ";
  protected final String TEXT_3270 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3271 = " == null ? ";
  protected final String TEXT_3272 = " != null : !";
  protected final String TEXT_3273 = ".equals(";
  protected final String TEXT_3274 = ");";
  protected final String TEXT_3275 = NL + "\t\treturn ";
  protected final String TEXT_3276 = " == null ? ";
  protected final String TEXT_3277 = "() != null : !";
  protected final String TEXT_3278 = ".equals(";
  protected final String TEXT_3279 = "());";
  protected final String TEXT_3280 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3281 = ");";
  protected final String TEXT_3282 = NL + "\t\t";
  protected final String TEXT_3283 = " ";
  protected final String TEXT_3284 = " = (";
  protected final String TEXT_3285 = ")eVirtualGet(";
  protected final String TEXT_3286 = ");";
  protected final String TEXT_3287 = NL + "\t\treturn ";
  protected final String TEXT_3288 = " != null && ((";
  protected final String TEXT_3289 = ".Unsettable";
  protected final String TEXT_3290 = ")";
  protected final String TEXT_3291 = ").isSet();";
  protected final String TEXT_3292 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_3293 = ");";
  protected final String TEXT_3294 = NL + "\t\treturn (";
  protected final String TEXT_3295 = " & ";
  protected final String TEXT_3296 = "_ESETFLAG) != 0;";
  protected final String TEXT_3297 = NL + "\t\treturn ";
  protected final String TEXT_3298 = "ESet;";
  protected final String TEXT_3299 = NL + "\t\treturn !((";
  protected final String TEXT_3300 = ".Internal)((";
  protected final String TEXT_3301 = ".Internal.Wrapper)get";
  protected final String TEXT_3302 = "()).featureMap()).isEmpty(";
  protected final String TEXT_3303 = ");";
  protected final String TEXT_3304 = NL + "\t\treturn !((";
  protected final String TEXT_3305 = ".Internal)get";
  protected final String TEXT_3306 = "()).isEmpty(";
  protected final String TEXT_3307 = ");";
  protected final String TEXT_3308 = NL + "\t\treturn ";
  protected final String TEXT_3309 = ".";
  protected final String TEXT_3310 = "(this);";
  protected final String TEXT_3311 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_3312 = "' ";
  protected final String TEXT_3313 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3314 = NL + "\t}" + NL;
  protected final String TEXT_3315 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3316 = NL + "\t@Override";
  protected final String TEXT_3317 = NL + "\tpublic ";
  protected final String TEXT_3318 = " ";
  protected final String TEXT_3319 = "(";
  protected final String TEXT_3320 = ")";
  protected final String TEXT_3321 = NL + "\t{";
  protected final String TEXT_3322 = NL + "\t\t";
  protected final String TEXT_3323 = "(";
  protected final String TEXT_3324 = ");";
  protected final String TEXT_3325 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3326 = NL + "\t\treturn ";
  protected final String TEXT_3327 = "(";
  protected final String TEXT_3328 = ");";
  protected final String TEXT_3329 = NL + "\t}" + NL;
  protected final String TEXT_3330 = NL + "} //";
  protected final String TEXT_3331 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * Copyright (c) 2002-2011 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
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
    }}
    stringBuffer.append(TEXT_4);
    if (isInterface) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_6);
    } else {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
    genModel.markImportLocation(stringBuffer, genPackage);
    if (isImplementation) { genClass.addClassPsuedoImports(); }
    stringBuffer.append(TEXT_10);
    if (isInterface) {
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_12);
    if (genClass.hasDocumentation()) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genClass.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_14);
    }
    stringBuffer.append(TEXT_15);
    if (!genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_16);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_20);
    }
    }
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_22);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_25);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_26);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_28);
    }}
    if (genClass.needsRootExtendsInterfaceExtendsTag()) {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genModel.getImportedName(genModel.getRootExtendsInterface()));
    }
    stringBuffer.append(TEXT_30);
    //Class/interface.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_32);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_33);
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_37);
    }
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_39);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_40);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_41);
    }
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    } else {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getInterfaceExtends());
    }
    stringBuffer.append(TEXT_44);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_45);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_48);
    }
    if (isImplementation && genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_52);
    }
    if (isImplementation && genClass.isJavaIOSerializable()) {
    stringBuffer.append(TEXT_53);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_54);
    if (isGWT) {
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_56);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_57);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
    stringBuffer.append(TEXT_58);
    if (isGWT) {
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_60);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_61);
    }
    }
    }
    }
    if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_62);
    if (isGWT) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_65);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
    if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_70);
    if (isGWT) {
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_76);
    } else if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_81);
    if (isGWT) {
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_85);
    }
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_89);
    if (genFeature.getQualifiedListItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_91);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_94);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_95);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_100);
    if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_101);
    }
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_105);
    } else {
    stringBuffer.append(TEXT_106);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_108);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) { int flagIndex = genClass.getFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_109);
    if (isGWT) {
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_112);
    }
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(flagIndex % 32);
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_122);
    if (isJDK50) {
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_123);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_125);
    }
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genFeature.getTypeGenClassifier().getFormattedName());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_131);
    if (isJDK50) {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_132);
    } else {
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_137);
    }
    stringBuffer.append(TEXT_138);
    }
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genClass.getFlagSize(genFeature) > 1 ? "s" : "");
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genClass.getFlagMask(genFeature));
    stringBuffer.append(TEXT_146);
    if (genFeature.isEnumType()) {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_147);
    } else {
    stringBuffer.append(flagIndex % 32);
    }
    stringBuffer.append(TEXT_148);
    } else {
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_153);
    if (isGWT) {
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_157);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_158);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) { int flagIndex = genClass.getESetFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_159);
    if (isGWT) {
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_162);
    }
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(flagIndex % 32 );
    stringBuffer.append(TEXT_167);
    } else {
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_170);
    if (isGWT) {
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_173);
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genClass.getOffsetCorrectionField(null));
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genClass.getQualifiedFeatureID(genClass.getImplementedGenFeatures().get(0)));
    stringBuffer.append(TEXT_178);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genClass.getOffsetCorrectionField(genFeature));
    stringBuffer.append(TEXT_180);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(reverseFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_183);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genClass.getImplementedGenOperations().get(0).getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genClass.getQualifiedOperationID(genClass.getImplementedGenOperations().get(0)));
    stringBuffer.append(TEXT_187);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_188);
    if (genModel.isPublicConstructors()) {
    stringBuffer.append(TEXT_189);
    } else {
    stringBuffer.append(TEXT_190);
    }
    stringBuffer.append(TEXT_191);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_192);
    for (GenFeature genFeature : genClass.getFlagGenFeaturesWithDefault()) {
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_194);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_195);
    if (!genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_196);
    }
    stringBuffer.append(TEXT_197);
    }
    stringBuffer.append(TEXT_198);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_199);
    }
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_202);
    }
    if (isImplementation && (genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL || genModel.isDynamicDelegation()) && (genClass.getClassExtendsGenClass() == null || (genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL && !genClass.getClassExtendsGenClass().getGenModel().isDynamicDelegation()))) {
    stringBuffer.append(TEXT_203);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_204);
    }
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_206);
    }
    //Class/reflectiveDelegation.override.javajetinc
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_207);
    if (!isImplementation) {
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_209);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_210);
    } else {
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_213);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_217);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_219);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_220);
    } else {
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_222);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_223);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_225);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_229);
    }
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_231);
    }
    stringBuffer.append(TEXT_232);
    if (!isImplementation) {
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_235);
    } else {
    stringBuffer.append(TEXT_236);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_237);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_238);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_240);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_241);
    }
    stringBuffer.append(TEXT_242);
    if (!isImplementation) {
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_244);
    } else {
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_246);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_248);
    } else {
    stringBuffer.append(TEXT_249);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_251);
    }
    stringBuffer.append(TEXT_252);
    }
    stringBuffer.append(TEXT_253);
    if (!isImplementation) {
    stringBuffer.append(TEXT_254);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_257);
    } else {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_260);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_263);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_265);
    }
    stringBuffer.append(TEXT_266);
    if (!isImplementation) {
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_269);
    } else {
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_273);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_274);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_276);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_277);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_278);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_279);
    } else {
    stringBuffer.append(TEXT_280);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_281);
    }
    stringBuffer.append(TEXT_282);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_283);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_284);
    } else {
    stringBuffer.append(TEXT_285);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_286);
    }
    stringBuffer.append(TEXT_287);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

    stringBuffer.append(TEXT_288);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_289);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_290);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_292);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_294);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_295);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_296);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_297);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_298);
    }
    }
    if (!UML2GenModelUtil.getSubsettedGenFeatures(genFeature).isEmpty()) {
    stringBuffer.append(TEXT_299);
    for (GenFeature subsettedGenFeature : UML2GenModelUtil.getSubsettedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_300);
    stringBuffer.append(subsettedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(subsettedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_302);
    stringBuffer.append(subsettedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_303);
    }
    stringBuffer.append(TEXT_304);
    }if (UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_305);
    for (GenFeature redefinedGenFeature : UML2GenModelUtil.getRedefinedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_306);
    stringBuffer.append(redefinedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_307);
    stringBuffer.append(redefinedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_308);
    stringBuffer.append(redefinedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_309);
    }
    stringBuffer.append(TEXT_310);
    }if(genFeature.isDerived() && UML2GenModelUtil.isUnion(genFeature)){
    stringBuffer.append(TEXT_311);
    }
    stringBuffer.append(TEXT_312);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_315);
    }
    stringBuffer.append(TEXT_316);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_318);
    }
    stringBuffer.append(TEXT_319);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_321);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_324);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_326);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_329);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_332);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_333);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_334);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_335);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_336);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_337);
    }}
    stringBuffer.append(TEXT_338);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_339);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_340);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_343);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !(genModel.isReflectiveDelegation() && genModel.isDynamicDelegation()) && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && !genFeature.isFeatureMapType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation() || genModel.isDynamicDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature() || genFeature.isListType() && genFeature.hasSettingDelegate())) {
    stringBuffer.append(TEXT_344);
    }
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_347);
    }
    stringBuffer.append(TEXT_348);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_349);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_350);
    }
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_354);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_355);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_356);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_357);
    }
    stringBuffer.append(TEXT_358);
    } else if (genModel.isReflectiveDelegation()) {
    if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_360);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_361);
    }
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_364);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_366);
    }
    stringBuffer.append(TEXT_367);
    }
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_368);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_369);
    }
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_372);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_374);
    }
    stringBuffer.append(TEXT_375);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_380);
    }
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_382);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_386);
    } else {
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_389);
    }
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_391);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_394);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_395);
    } else {
    stringBuffer.append(TEXT_396);
    }
    stringBuffer.append(TEXT_397);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_403);
    }
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_415);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_420);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_424);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_427);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_428);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_429);
    }
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_431);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_434);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_436);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_437);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_438);
    }
    stringBuffer.append(TEXT_439);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_442);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_448);
    }
    stringBuffer.append(TEXT_449);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_453);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_456);
    } else {
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_461);
    }
    } else {
    stringBuffer.append(TEXT_462);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_463);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_467);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_473);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = isJDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_477);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_478);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_480);
    } else {
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_482);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_483);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_485);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_487);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_489);
    } else {
    stringBuffer.append(TEXT_490);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_492);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_493);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_494);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_496);
    }
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_498);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_500);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_502);
    }
    stringBuffer.append(TEXT_503);
    } else {
    stringBuffer.append(TEXT_504);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_505);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_507);
    }
    stringBuffer.append(TEXT_508);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_510);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_512);
    }
    stringBuffer.append(TEXT_513);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_517);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_518);
    }
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_521);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_522);
    }
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_524);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_525);
    }
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_527);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_529);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_531);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_532);
    }
    stringBuffer.append(TEXT_533);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_534);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_535);
    }
    stringBuffer.append(TEXT_536);
    }
    stringBuffer.append(TEXT_537);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_539);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_542);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_543);
    }
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_550);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_553);
    }
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_555);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_556);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_557);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_561);
    }
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_570);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_571);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_572);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_575);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_576);
    }
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_588);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_589);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_591);
    }
    stringBuffer.append(TEXT_592);
    }
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_597);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_598);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_599);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_600);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_601);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_602);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_604);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_605);
    } else {
    stringBuffer.append(TEXT_606);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_607);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_608);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_609);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_610);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_611);
    }
    }
    }
    }
    stringBuffer.append(TEXT_612);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_614);
    } else {
    stringBuffer.append(TEXT_615);
    }
    stringBuffer.append(TEXT_616);
    }
    } else {
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_619);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_620);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_621);
    if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_622);
    }
    }
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_625);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_629);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_630);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_631);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_632);
    }
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_635);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_637);
    }
    stringBuffer.append(TEXT_638);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_641);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_644);
    } else {
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_646);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_648);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_649);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_651);
    } else {
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_653);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_655);
    }
    } else if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_657);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_659);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_660);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_661);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_662);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_663);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_665);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_666);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_667);
    } else {
    stringBuffer.append(TEXT_668);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_669);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_670);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_671);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_672);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_673);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_674);
    }
    }
    }
    }
    stringBuffer.append(TEXT_675);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_677);
    } else {
    stringBuffer.append(TEXT_678);
    }
    stringBuffer.append(TEXT_679);
    } else {
    stringBuffer.append(TEXT_680);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_681);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_682);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_683);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_684);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_685);
    }
    }
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_691);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_695);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_697);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_698);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_699);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_701);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_702);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_704);
    }
    stringBuffer.append(TEXT_705);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_706);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_708);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_709);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_711);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_712);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_713);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_715);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_717);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_719);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_720);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_721);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_722);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_723);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_724);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_726);
    }
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_728);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_729);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_730);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_731);
    }
    stringBuffer.append(TEXT_732);
    }
    stringBuffer.append(TEXT_733);
    }
    stringBuffer.append(TEXT_734);
    } else if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_736);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_738);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_740);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_741);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_742);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_743);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_744);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_745);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_747);
    }
    stringBuffer.append(TEXT_748);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_749);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_750);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_751);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_752);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_754);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_755);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_756);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_757);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_758);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_760);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_762);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_763);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_764);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_765);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_766);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_767);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_769);
    }
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_771);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_772);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_774);
    }
    stringBuffer.append(TEXT_775);
    }
    stringBuffer.append(TEXT_776);
    }
    stringBuffer.append(TEXT_777);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_779);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_781);
    } else {
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_785);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_787);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_789);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_793);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_796);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_799);
    }
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_801);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_802);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_803);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_807);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_811);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_812);
    } else {
    stringBuffer.append(TEXT_813);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_814);
    }
    stringBuffer.append(TEXT_815);
    } else {
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_820);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_825);
    }
    stringBuffer.append(TEXT_826);
    }
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_828);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_829);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_830);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_832);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_833);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_835);
    }
    stringBuffer.append(TEXT_836);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_837);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_839);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_840);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_842);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_843);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_844);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_845);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_846);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_848);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_849);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_850);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_851);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_852);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_853);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_854);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_855);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_857);
    }
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_859);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_860);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_862);
    }
    stringBuffer.append(TEXT_863);
    }
    stringBuffer.append(TEXT_864);
    }
    stringBuffer.append(TEXT_865);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_868);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_871);
    } else {
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_873);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_876);
    }
    } else {
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_879);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_880);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_885);
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_888);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_891);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_893);
    }
    }
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_895);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_896);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_897);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_900);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_902);
    }
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_904);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_905);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_910);
    }
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_913);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_915);
    }
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_917);
    }
    stringBuffer.append(TEXT_918);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_920);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_922);
    }
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_924);
    }
    stringBuffer.append(TEXT_925);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_927);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_929);
    }
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_931);
    }
    stringBuffer.append(TEXT_932);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_934);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_944);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_945);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_946);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_950);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_955);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_956);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_961);
    }
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_966);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_974);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_977);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_978);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_982);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_983);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_984);
    }
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_988);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_989);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_992);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_996);
    }
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_999);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1002);
    }
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1004);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1011);
    }
    stringBuffer.append(TEXT_1012);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1018);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1021);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1023);
    } else {
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1030);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1036);
    } else {
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1043);
    if (isJDK50) {
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1045);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1047);
    }
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1049);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1053);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1059);
    } else {
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1064);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1069);
    } else {
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1073);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1077);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1079);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1083);
    }
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1086);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1089);
    }
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1091);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1095);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1099);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1101);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1102);
    } else {
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1104);
    }
    stringBuffer.append(TEXT_1105);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1109);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1114);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1116);
    }
    }
    }
    if (!genFeature.isBasicSet()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_1118);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1122);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1125);
    }
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1130);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1132);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1140);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1144);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_1147);
    }
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1152);
    }
    stringBuffer.append(TEXT_1153);
    }
    stringBuffer.append(TEXT_1154);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1159);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1161);
    }
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1163);
    }
    stringBuffer.append(TEXT_1164);
    } else {
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1168);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1170);
    }
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1172);
    }
    stringBuffer.append(TEXT_1173);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1178);
    } else {
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1181);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1182);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_1183);
    if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1184);
    }
    }
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1188);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1190);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1193);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1195);
    }
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1197);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1201);
    }
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1203);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1205);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1209);
    }
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1212);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1215);
    }
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1217);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1222);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1224);
    } else {
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1226);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1227);
    } else {
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1229);
    }
    stringBuffer.append(TEXT_1230);
    }
    } else {
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1233);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1234);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(TEXT_1240);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1242);
    }
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1244);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1247);
    }
    stringBuffer.append(TEXT_1248);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1249);
    if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1250);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1252);
    } else {
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1254);
    }
    stringBuffer.append(TEXT_1255);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1258);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1260);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1262);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1267);
    }
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1272);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1277);
    }
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1280);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1284);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1289);
    }
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1291);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1294);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1298);
    }
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1301);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1304);
    }
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1306);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1311);
    }
    stringBuffer.append(TEXT_1312);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1317);
    } else {
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1324);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1327);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1331);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1333);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1337);
    } else {
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1340);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1342);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1345);
    } else {
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1347);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1351);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1353);
    } else {
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1355);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1356);
    } else {
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1358);
    }
    stringBuffer.append(TEXT_1359);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1365);
    } else {
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1370);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1373);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1376);
    } else {
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1378);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1382);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1387);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1388);
    } else {
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1390);
    }
    stringBuffer.append(TEXT_1391);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1396);
    } else {
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1400);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1404);
    } else {
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1407);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1408);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1416);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1418);
    }
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1420);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1423);
    }
    stringBuffer.append(TEXT_1424);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1425);
    if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1426);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1428);
    } else {
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1430);
    }
    stringBuffer.append(TEXT_1431);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1434);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1436);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1438);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1443);
    }
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1448);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1450);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1453);
    } else {
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1455);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1460);
    } else {
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1464);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1468);
    } else {
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1471);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1472);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1479);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1486);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1487);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1492);
    } else {
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1497);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1501);
    } else {
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1505);
    }
    }
    stringBuffer.append(TEXT_1506);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1510);
    }
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1514);
    }
    } else {
    stringBuffer.append(TEXT_1515);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1518);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1519);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1520);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1521);
    }
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1524);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1525);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1529);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1532);
    } else {
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1535);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1537);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1545);
    index++;}
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1549);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1550);
    }
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1554);
    }
    stringBuffer.append(TEXT_1555);
    } else {
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1558);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1559);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1560);
    }
    } else {
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1562);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1566);
    } else {
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1570);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1572);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1573);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1578);
    } else {
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1583);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1587);
    } else {
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1591);
    }
    }
    stringBuffer.append(TEXT_1592);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1596);
    }
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1599);
    }
    } else {
    stringBuffer.append(TEXT_1600);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1604);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1605);
    }
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1609);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1611);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_1612);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1613);
    } else {
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1618);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1621);
    } else {
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1624);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1626);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1634);
    index++;}
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1638);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1639);
    }
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1642);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1643);
    }
    stringBuffer.append(TEXT_1644);
    } else {
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1647);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1648);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1649);
    }
    } else {
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1651);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1655);
    } else {
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1659);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1661);
    }
    stringBuffer.append(TEXT_1662);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1667);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1671);
    }
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1675);
    }
    } else {
    stringBuffer.append(TEXT_1676);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1680);
    }
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1681);
    }
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1686);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1687);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1688);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1689);
    }
    stringBuffer.append(TEXT_1690);
    }
    }
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1695);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1699);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1700);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1702);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1704);
    }
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1708);
    }
    } else {
    stringBuffer.append(TEXT_1709);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1713);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1715);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1716);
    }
    stringBuffer.append(TEXT_1717);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1718);
    }
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1722);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1724);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1725);
    }
    stringBuffer.append(TEXT_1726);
    if (isJDK50) {
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1731);
    } else {
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1738);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1741);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1748);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1749);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1752);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1753);
    }
    }
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1757);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1758);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1760);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1761);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1763);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1765);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1771);
    } else {
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1776);
    }
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1778);
    index++;}
    stringBuffer.append(TEXT_1779);
    } else {
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1786);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1794);
    } else {
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1796);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1799);
    }
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1801);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1809);
    } else {
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1814);
    }
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1816);
    index++;}
    }
    stringBuffer.append(TEXT_1817);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1818);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1819);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1820);
    }
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1823);
    }
    stringBuffer.append(TEXT_1824);
    } else {
    stringBuffer.append(TEXT_1825);
    }
    stringBuffer.append(TEXT_1826);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1828);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1829);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1831);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1834);
    } else {
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1837);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1840);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1847);
    } else {
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1849);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1851);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1853);
    } else {
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1855);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1857);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1859);
    } else {
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1861);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1865);
    } else {
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1869);
    }
    } else {
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1872);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1876);
    } else {
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1879);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1884);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1894);
    } else {
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1896);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(genFeature.getEDefault());
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
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1906);
    }
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1909);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1911);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1913);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1915);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1916);
    } else {
    stringBuffer.append(TEXT_1917);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1918);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1920);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1921);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1923);
    } else {
    stringBuffer.append(TEXT_1924);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1926);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1927);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
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
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation && !UML2GenModelUtil.hasOperationsClass(genClass, genOperation) && UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1938);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1941);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1944);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1948);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1952);
    } else {
    stringBuffer.append(TEXT_1953);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1956);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (isJDK50) {
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_1960);
    }
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1962);
    }
    }
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && isImplementation) {
    if (genOperation.isInvariant() && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_1963);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1969);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1970);
    stringBuffer.append(genOperation.getInvariantExpression("\t\t"));
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1972);
    } else if (genOperation.hasInvocationDelegate()) {
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1976);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1980);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_1981);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_1982);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1983);
    if (UML2GenModelUtil.isRedefinition(genOperation)) {
    stringBuffer.append(TEXT_1984);
    for (GenOperation redefinedGenOperation : UML2GenModelUtil.getRedefinedGenOperations(genOperation)) {
    stringBuffer.append(TEXT_1985);
    stringBuffer.append(redefinedGenOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1986);
    stringBuffer.append(redefinedGenOperation.getName());
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(redefinedGenOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(redefinedGenOperation.getFormattedName());
    stringBuffer.append(TEXT_1989);
    }
    stringBuffer.append(TEXT_1990);
    }
    stringBuffer.append(TEXT_1991);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1992);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1996);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1998);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1999);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_2000);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_2001);
    }}
    stringBuffer.append(TEXT_2002);
    } else {
    stringBuffer.append(TEXT_2003);
    if (isJDK50) {
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_2004);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2005);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_2006);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_2008);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_2009);
    } else {
    if (genModel.useGenerics() && !genOperation.hasBody() && !genOperation.isInvariant() && genOperation.hasInvocationDelegate() && genOperation.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_2010);
    }
    stringBuffer.append(TEXT_2011);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_2012);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_2015);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_2017);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2020);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(genOperation.getValidationDelegate());
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2024);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2025);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_2026);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2027);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_2029);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_2030);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2031);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2032);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2033);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2034);
    } else {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_2035);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2036);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2038);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2039);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2040);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2041);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2042);
    } else {
    stringBuffer.append(TEXT_2043);
    }
    stringBuffer.append(TEXT_2044);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2045);
    stringBuffer.append(TEXT_2046);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_2048);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_2052);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_2055);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2056);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_2057);
    //genOperation.diagnostics.override.javajetinc
    stringBuffer.append(TEXT_2058);
    }
    }
    } else if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvocationDelegate()) { int size = genOperation.getGenParameters().size();
    stringBuffer.append(TEXT_2059);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2061);
    if (size > 0) {
    stringBuffer.append(TEXT_2062);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2063);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_2064);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_2065);
    } else {
    stringBuffer.append(TEXT_2066);
    }
    stringBuffer.append(TEXT_2067);
    } else {
    stringBuffer.append(TEXT_2068);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2069);
    }
    stringBuffer.append(TEXT_2070);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2071);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2072);
    if (size > 0) {
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2074);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_2075);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_2076);
    } else {
    stringBuffer.append(TEXT_2077);
    }
    stringBuffer.append(TEXT_2078);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2080);
    }
    stringBuffer.append(TEXT_2081);
    }
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2083);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.WrappedException"));
    stringBuffer.append(TEXT_2084);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2085);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2087);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2089);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2091);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_2092);
    }
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2094);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2095);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_2096);
    }
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2098);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_2099);
    }
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2101);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2102);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2103);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2104);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2105);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2106);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2107);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2108);
    }
    stringBuffer.append(TEXT_2109);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2110);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2111);
    }
    stringBuffer.append(TEXT_2112);
    }
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2115);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2117);
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
    stringBuffer.append(TEXT_2118);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2122);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_2123);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2124);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2125);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2126);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2127);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2128);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2130);
    }
    stringBuffer.append(TEXT_2131);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2134);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2135);
    }
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2139);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2141);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2142);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2143);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2145);
    } else {
    stringBuffer.append(TEXT_2146);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_2147);
    }
    } else {
    stringBuffer.append(TEXT_2148);
    }
    }
    stringBuffer.append(TEXT_2149);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_2150);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_2151);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2152);
    }
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2154);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2155);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2156);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2157);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2159);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2162);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2163);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2164);
    } else {
    stringBuffer.append(TEXT_2165);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2166);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_2167);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2168);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2170);
    } else {
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2172);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2174);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2175);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2177);
    } else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2179);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2180);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2182);
    }
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2184);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_2185);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2188);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_2189);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2193);
    }
    stringBuffer.append(TEXT_2194);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2195);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2196);
    }
    }
    stringBuffer.append(TEXT_2197);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2198);
    } else {
    stringBuffer.append(TEXT_2199);
    }
    stringBuffer.append(TEXT_2200);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_2201);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2202);
    }
    stringBuffer.append(TEXT_2203);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2204);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2205);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2207);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_2208);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2209);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2210);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2212);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2213);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2214);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2215);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2216);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2217);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2218);
    } else {
    stringBuffer.append(TEXT_2219);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2220);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2221);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2222);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2223);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2224);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2225);
    } else {
    stringBuffer.append(TEXT_2226);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2227);
    }
    }
    stringBuffer.append(TEXT_2228);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2229);
    } else {
    stringBuffer.append(TEXT_2230);
    }
    stringBuffer.append(TEXT_2231);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_2232);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2233);
    }
    stringBuffer.append(TEXT_2234);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2235);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2236);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2237);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_2238);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2239);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2241);
    }
    stringBuffer.append(TEXT_2242);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2243);
    } else {
    stringBuffer.append(TEXT_2244);
    }
    stringBuffer.append(TEXT_2245);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_2246);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2247);
    }
    stringBuffer.append(TEXT_2248);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2249);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_2250);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2251);
    if (genFeature.isPrimitiveType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2252);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2253);
    } else if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2254);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2255);
    } else {
    stringBuffer.append(TEXT_2256);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2257);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2258);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_2259);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2260);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2261);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2262);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2263);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2264);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2265);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2266);
    } else {
    stringBuffer.append(TEXT_2267);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2269);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2270);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2271);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2272);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2273);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2275);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2277);
    } else {
    stringBuffer.append(TEXT_2278);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2279);
    }
    }
    stringBuffer.append(TEXT_2280);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2281);
    } else {
    stringBuffer.append(TEXT_2282);
    }
    stringBuffer.append(TEXT_2283);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_2284);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_2285);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2286);
    }
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2288);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2290);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2292);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2293);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2294);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2296);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2297);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2298);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2299);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2300);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2301);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2302);
    } else {
    stringBuffer.append(TEXT_2303);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2305);
    }
    } else {
    stringBuffer.append(TEXT_2306);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2307);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2308);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2309);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2310);
    }
    stringBuffer.append(TEXT_2311);
    }
    } else if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2313);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2315);
    } else {
    stringBuffer.append(TEXT_2316);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2317);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2319);
    }
    stringBuffer.append(TEXT_2320);
    }
    stringBuffer.append(TEXT_2321);
    }
    stringBuffer.append(TEXT_2322);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2323);
    } else {
    stringBuffer.append(TEXT_2324);
    }
    stringBuffer.append(TEXT_2325);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_2326);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2327);
    }
    stringBuffer.append(TEXT_2328);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2329);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_2330);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2331);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2332);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2333);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2334);
    } else {
    stringBuffer.append(TEXT_2335);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2336);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2337);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2338);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_2339);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2340);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2341);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_2342);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2343);
    } else {
    stringBuffer.append(TEXT_2344);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2346);
    }
    stringBuffer.append(TEXT_2347);
    }
    stringBuffer.append(TEXT_2348);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2349);
    } else {
    stringBuffer.append(TEXT_2350);
    }
    stringBuffer.append(TEXT_2351);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_2352);
    stringBuffer.append(TEXT_2353);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2354);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2355);
    }
    stringBuffer.append(TEXT_2356);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) { String safeNameAccessor = genFeature.getSafeName(); if ("featureID".equals(safeNameAccessor)) { safeNameAccessor = "this." + safeNameAccessor; }
    stringBuffer.append(TEXT_2357);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2358);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2359);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2360);
    } else {
    if (genFeature.hasSettingDelegate()) {
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2361);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2362);
    } else {
    stringBuffer.append(TEXT_2363);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2364);
    }
    } else if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2366);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2367);
    } else {
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2369);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2370);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2373);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2374);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2376);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2377);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2378);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2380);
    } else {
    stringBuffer.append(TEXT_2381);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2382);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2384);
    } else if (genFeature.isResolveProxies()) {
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
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2390);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2391);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2392);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2393);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2394);
    } else {
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2396);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2399);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2400);
    } else {
    stringBuffer.append(TEXT_2401);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2403);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2404);
    }
    } else {
    stringBuffer.append(TEXT_2405);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2407);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2408);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2409);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2410);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2411);
    } else {
    stringBuffer.append(TEXT_2412);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2413);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2414);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2415);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2416);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2418);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2419);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2420);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2421);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2423);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2424);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2425);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2426);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2428);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2429);
    } else {
    stringBuffer.append(TEXT_2430);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2431);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2432);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2433);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2434);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2435);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2436);
    } else {
    stringBuffer.append(TEXT_2437);
    }
    stringBuffer.append(TEXT_2438);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2439);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2440);
    }
    stringBuffer.append(TEXT_2441);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2442);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2443);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2444);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2445);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2446);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2447);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2448);
    }
    stringBuffer.append(TEXT_2449);
    }
    stringBuffer.append(TEXT_2450);
    }
    stringBuffer.append(TEXT_2451);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2452);
    }
    stringBuffer.append(TEXT_2453);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2454);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2456);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2457);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2458);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2459);
    }
    stringBuffer.append(TEXT_2460);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2461);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2462);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2463);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2464);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2465);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2466);
    }
    stringBuffer.append(TEXT_2467);
    }
    stringBuffer.append(TEXT_2468);
    }
    if (genModel.isOperationReflection() && isImplementation && (!genClass.getMixinGenOperations().isEmpty() || !genClass.getOverrideGenOperations(genClass.getExtendedGenOperations(), genClass.getImplementedGenOperations()).isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty())) {
    stringBuffer.append(TEXT_2469);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2470);
    }
    stringBuffer.append(TEXT_2471);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2472);
    for (GenClass extendedGenClass : genClass.getExtendedGenClasses()) { List<GenOperation> extendedImplementedGenOperations = extendedGenClass.getImplementedGenOperations(); List<GenOperation> implementedGenOperations = genClass.getImplementedGenOperations();
    if (!genClass.getOverrideGenOperations(extendedImplementedGenOperations, implementedGenOperations).isEmpty()) {
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(extendedGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2474);
    for (GenOperation genOperation : extendedImplementedGenOperations) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    if (implementedGenOperations.contains(overrideGenOperation)) {
    stringBuffer.append(TEXT_2475);
    stringBuffer.append(extendedGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2477);
    }
    }
    stringBuffer.append(TEXT_2478);
    }
    }
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2480);
    for (GenOperation genOperation : mixinGenClass.getGenOperations()) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_2481);
    stringBuffer.append(mixinGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2482);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2483);
    }
    stringBuffer.append(TEXT_2484);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_2485);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_2487);
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_2488);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2489);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2490);
    }
    stringBuffer.append(TEXT_2491);
    }
    stringBuffer.append(TEXT_2492);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2493);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2494);
    }
    stringBuffer.append(TEXT_2495);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2496);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2497);
    }
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2499);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
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
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2507);
    }
    stringBuffer.append(TEXT_2508);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2509);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2510);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2511);
    }
    stringBuffer.append(TEXT_2512);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_2513);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2514);
    }
    if (genModel.useGenerics()) {
    boolean isUnchecked = false; boolean isRaw = false; LOOP: for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { for (GenParameter genParameter : genOperation.getGenParameters()) { if (genParameter.isUncheckedCast()) { if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType()) { isUnchecked = true; } if (genParameter.usesOperationTypeParameters() && !genParameter.getEcoreParameter().getEGenericType().getETypeArguments().isEmpty()) { isRaw = true; break LOOP; }}}}
    if (isUnchecked) {
    stringBuffer.append(TEXT_2515);
    if (!isRaw) {
    stringBuffer.append(TEXT_2516);
    } else {
    stringBuffer.append(TEXT_2517);
    }
    stringBuffer.append(TEXT_2518);
    }
    }
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2520);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2521);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_2522);
    for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { List<GenParameter> genParameters = genOperation.getGenParameters(); int size = genParameters.size();  boolean hasCheckedException = genOperation.hasCheckedException(); String indent = hasCheckedException ? "\t" : "";
    stringBuffer.append(TEXT_2523);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2524);
    if (hasCheckedException) {
    stringBuffer.append(TEXT_2525);
    /*}*/}
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2526);
    stringBuffer.append(indent);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2527);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2528);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_2530);
    }
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2532);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2533);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2534);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_2535);
    }
    }
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(indent);
    stringBuffer.append(TEXT_2537);
    } else {
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(indent);
    stringBuffer.append(TEXT_2539);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2540);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2541);
    }
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2542);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2543);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_2544);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_2545);
    }
    stringBuffer.append(TEXT_2546);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2547);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2548);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2549);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_2550);
    }
    }
    stringBuffer.append(TEXT_2551);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2552);
    }
    stringBuffer.append(TEXT_2553);
    }
    if (hasCheckedException) {/*{*/
    stringBuffer.append(TEXT_2554);
    stringBuffer.append(genModel.getImportedName("java.lang.Throwable"));
    stringBuffer.append(TEXT_2555);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2556);
    }
    }
    stringBuffer.append(TEXT_2557);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2558);
    } else {
    stringBuffer.append(TEXT_2559);
    }
    stringBuffer.append(TEXT_2560);
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2561);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2562);
    }
    stringBuffer.append(TEXT_2563);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2564);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2565);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2567);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2568);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2569);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2570);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2571);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2572);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2574);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2575);
    }
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2577);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2578);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2579);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2581);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2582);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2583);
    }
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2585);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2586);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2587);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_2589);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2590);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2591);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2592);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2593);
    }
    stringBuffer.append(TEXT_2594);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2595);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2597);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2598);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2599);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2600);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2601);
    } else {
    stringBuffer.append(TEXT_2602);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2603);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2605);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2606);
    }
    } else {
    stringBuffer.append(TEXT_2607);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2608);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2609);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2610);
    if (isGWT) {
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_2612);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2613);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2614);
    if (!isJDK50 && keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2615);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2616);
    } else {
    stringBuffer.append(TEXT_2617);
    }
    stringBuffer.append(TEXT_2618);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2619);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2620);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2621);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2622);
    }
    stringBuffer.append(TEXT_2623);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2624);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2625);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2626);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2627);
    } else {
    stringBuffer.append(TEXT_2628);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2629);
    }
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2631);
    if (!isJDK50 && valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2632);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2633);
    } else {
    stringBuffer.append(TEXT_2634);
    }
    stringBuffer.append(TEXT_2635);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2636);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2637);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2638);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2639);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2640);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2641);
    }
    stringBuffer.append(TEXT_2642);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2643);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2644);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2646);
    } else {
    stringBuffer.append(TEXT_2647);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2648);
    }
    stringBuffer.append(TEXT_2649);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2650);
    }
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2652);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2653);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2654);
    }
    if (isImplementation) {
    if (!UML2GenModelUtil.isOperationsClasses(genPackage) && UML2GenModelUtil.hasOCLOperationBodies(genClass) && (!UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass()) || UML2GenModelUtil.isOperationsClasses(genClass.getClassExtendsGenClass().getGenPackage()))) {
    stringBuffer.append(TEXT_2655);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2656);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2657);
    }
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2659);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2660);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2661);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2662);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2664);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2665);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2666);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2667);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2668);
    }
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2670);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2672);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2673);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2674);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2675);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2676);
    } else {
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2679);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2680);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2682);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2683);
    }
    stringBuffer.append(TEXT_2684);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2687);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
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
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2695);
    } else {
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2697);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2698);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2699);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2700);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2702);
    }
    stringBuffer.append(TEXT_2703);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2704);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2706);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2707);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2708);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2709);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2710);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2711);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2712);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2713);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2714);
    } else {
    stringBuffer.append(TEXT_2715);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2716);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2717);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2718);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2719);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2720);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2721);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2722);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2723);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2724);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2725);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2726);
    } else {
    stringBuffer.append(TEXT_2727);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2728);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2729);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2730);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2731);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2732);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2733);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2734);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2735);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2736);
    }
    }
    }
    stringBuffer.append(TEXT_2737);
    if (isJDK50) { //isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2738);
    }
    }
    stringBuffer.append(TEXT_2739);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2740);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2741);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2742);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2743);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2744);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2745);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2746);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2747);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2748);
    }
    } else {
    stringBuffer.append(TEXT_2749);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2750);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2751);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2752);
    }
    }
    } else {
    stringBuffer.append(TEXT_2753);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2754);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2755);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2756);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2757);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2758);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2759);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2760);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2761);
    }
    } else {
    stringBuffer.append(TEXT_2762);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2763);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2764);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2765);
    }
    }
    } else {
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2767);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2768);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2769);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2770);
    } else {
    stringBuffer.append(TEXT_2771);
    }
    }
    stringBuffer.append(TEXT_2772);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2773);
    if (isJDK50) { //getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2774);
    }
    }
    stringBuffer.append(TEXT_2775);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2776);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2777);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType(genClass).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2780);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2781);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2782);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2784);
    } else {
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2786);
    }
    } else {
    stringBuffer.append(TEXT_2787);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2788);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2789);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2790);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2791);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2792);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2793);
    } else {
    stringBuffer.append(TEXT_2794);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2795);
    }
    }
    stringBuffer.append(TEXT_2796);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2797);
    if (isJDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2798);
    }
    }
    stringBuffer.append(TEXT_2799);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2800);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2801);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2802);
    } else {
    stringBuffer.append(TEXT_2803);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2804);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2805);
    }
    stringBuffer.append(TEXT_2806);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2807);
    if (isJDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2808);
    }
    }
    stringBuffer.append(TEXT_2809);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2811);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_2812);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2813);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2814);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2815);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2816);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2817);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2818);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2819);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2820);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2821);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2822);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2823);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2824);
    }
    stringBuffer.append(TEXT_2825);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2826);
    } else {
    stringBuffer.append(TEXT_2827);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2828);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2829);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2830);
    }
    stringBuffer.append(TEXT_2831);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2832);
    }
    }
    stringBuffer.append(TEXT_2833);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2834);
    if (isJDK50) { //setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2835);
    }
    }
    stringBuffer.append(TEXT_2836);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2837);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2838);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2839);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2840);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2841);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2842);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2843);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2844);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2845);
    }
    stringBuffer.append(TEXT_2846);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2847);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2848);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2849);
    }
    stringBuffer.append(TEXT_2850);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2851);
    }
    stringBuffer.append(TEXT_2852);
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2853);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2854);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2855);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2856);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2857);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2858);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2859);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2860);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2861);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2862);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2863);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2864);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2865);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2866);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_2867);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2868);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2869);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2870);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2871);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2872);
    } else {
    stringBuffer.append(TEXT_2873);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2874);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2875);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2876);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2877);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2878);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2879);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2880);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2881);
    } else {
    stringBuffer.append(TEXT_2882);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2883);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2884);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2885);
    }
    }
    stringBuffer.append(TEXT_2886);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2887);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2888);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2889);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2890);
    }
    stringBuffer.append(TEXT_2891);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2892);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2893);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2894);
    }
    } else {
    stringBuffer.append(TEXT_2895);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_2896);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2897);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2898);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2899);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2900);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2901);
    }
    stringBuffer.append(TEXT_2902);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2903);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2904);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2905);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2906);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2907);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2908);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2909);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2910);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2911);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2912);
    } else {
    stringBuffer.append(TEXT_2913);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2914);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2915);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2916);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2917);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2918);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2919);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2920);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2921);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2922);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2923);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2924);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2925);
    index++;}
    stringBuffer.append(TEXT_2926);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2927);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2928);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2929);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2930);
    }
    stringBuffer.append(TEXT_2931);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2932);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2933);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2934);
    }
    stringBuffer.append(TEXT_2935);
    } else {
    stringBuffer.append(TEXT_2936);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2937);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2938);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2939);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2940);
    }
    } else {
    stringBuffer.append(TEXT_2941);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2942);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2943);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2944);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2945);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2946);
    } else {
    stringBuffer.append(TEXT_2947);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2948);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2949);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2950);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2951);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2952);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_2953);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2954);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2955);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2956);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2957);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2958);
    } else {
    stringBuffer.append(TEXT_2959);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2960);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2961);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2962);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2963);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2964);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2965);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2966);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2967);
    } else {
    stringBuffer.append(TEXT_2968);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2969);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2970);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2971);
    }
    }
    stringBuffer.append(TEXT_2972);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2973);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2974);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2975);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2976);
    }
    stringBuffer.append(TEXT_2977);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2978);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2979);
    }
    } else {
    stringBuffer.append(TEXT_2980);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_2981);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2982);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2983);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2984);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2985);
    }
    stringBuffer.append(TEXT_2986);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2987);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2988);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2989);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2990);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2991);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_2992);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2993);
    } else {
    stringBuffer.append(TEXT_2994);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2995);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2996);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2997);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2998);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2999);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3000);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3001);
    } else {
    stringBuffer.append(TEXT_3002);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3003);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3004);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3005);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3006);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_3007);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3008);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3009);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3010);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3011);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3012);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3013);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3014);
    index++;}
    stringBuffer.append(TEXT_3015);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3016);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3017);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3018);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3019);
    }
    stringBuffer.append(TEXT_3020);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3021);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3022);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3023);
    }
    stringBuffer.append(TEXT_3024);
    } else {
    stringBuffer.append(TEXT_3025);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3026);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3027);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3028);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_3029);
    }
    } else {
    stringBuffer.append(TEXT_3030);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3031);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3032);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3033);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3034);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3035);
    } else {
    stringBuffer.append(TEXT_3036);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3037);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_3038);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3039);
    }
    index++;}
    }
    stringBuffer.append(TEXT_3040);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3041);
    }
    stringBuffer.append(TEXT_3042);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3043);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3044);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3045);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3046);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3047);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3048);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3049);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3050);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3051);
    }
    stringBuffer.append(TEXT_3052);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3053);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3054);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3055);
    }
    } else {
    stringBuffer.append(TEXT_3056);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3057);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3058);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3059);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3060);
    }
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3061);
    }
    stringBuffer.append(TEXT_3062);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3063);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3064);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3065);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3066);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3067);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3068);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3069);
    }
    stringBuffer.append(TEXT_3070);
    }
    }
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3071);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3072);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3073);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3074);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3075);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3076);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3077);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3078);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3079);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3080);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3081);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3082);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3083);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3084);
    }
    stringBuffer.append(TEXT_3085);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3086);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3087);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3088);
    }
    } else {
    stringBuffer.append(TEXT_3089);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3090);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3091);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3092);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3093);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3094);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3095);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3096);
    }
    stringBuffer.append(TEXT_3097);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3098);
    }
    stringBuffer.append(TEXT_3099);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3100);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3101);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3102);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3103);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3104);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3105);
    }
    stringBuffer.append(TEXT_3106);
    if (isJDK50) {
    stringBuffer.append(TEXT_3107);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3108);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_3109);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3110);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3111);
    } else {
    stringBuffer.append(TEXT_3112);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3113);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_3114);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3115);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3116);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3117);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3118);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3119);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3120);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3121);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3122);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3123);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3124);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3125);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3126);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3127);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3128);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_3129);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_3130);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_3131);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3132);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_3133);
    }
    }
    stringBuffer.append(TEXT_3134);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3135);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3136);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3137);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3138);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_3139);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3140);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3141);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3142);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3143);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_3144);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_3145);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3146);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3147);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3148);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3149);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3150);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3151);
    } else {
    stringBuffer.append(TEXT_3152);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3153);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3154);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3155);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3156);
    }
    stringBuffer.append(TEXT_3157);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3158);
    index++;}
    stringBuffer.append(TEXT_3159);
    } else {
    stringBuffer.append(TEXT_3160);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3161);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3162);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3163);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3164);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3165);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3166);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3167);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3168);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3169);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3170);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3171);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3172);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3173);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3174);
    } else {
    stringBuffer.append(TEXT_3175);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3176);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3177);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3178);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3179);
    }
    stringBuffer.append(TEXT_3180);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3181);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3182);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3183);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3184);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3185);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3186);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3187);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3188);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3189);
    } else {
    stringBuffer.append(TEXT_3190);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3191);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3192);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3193);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3194);
    }
    stringBuffer.append(TEXT_3195);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3196);
    index++;}
    }
    stringBuffer.append(TEXT_3197);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3198);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3199);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3200);
    }
    stringBuffer.append(TEXT_3201);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3202);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3203);
    }
    stringBuffer.append(TEXT_3204);
    } else {
    stringBuffer.append(TEXT_3205);
    }
    stringBuffer.append(TEXT_3206);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_3207);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3208);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_3209);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3210);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3211);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_3212);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3213);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3214);
    } else {
    stringBuffer.append(TEXT_3215);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3216);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3217);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3218);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3219);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3220);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3221);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3222);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3223);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3224);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3225);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3226);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3227);
    } else {
    stringBuffer.append(TEXT_3228);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3229);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3230);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3231);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3232);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3233);
    } else {
    stringBuffer.append(TEXT_3234);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3235);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3236);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3237);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3238);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3239);
    } else {
    stringBuffer.append(TEXT_3240);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3241);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_3242);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3243);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3244);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3245);
    } else {
    stringBuffer.append(TEXT_3246);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3247);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3248);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3249);
    }
    } else {
    stringBuffer.append(TEXT_3250);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3251);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3252);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3253);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3254);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3255);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3256);
    } else {
    stringBuffer.append(TEXT_3257);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3258);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3259);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3260);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3261);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3262);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3263);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3264);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3265);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3266);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3267);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3268);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3269);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3270);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3271);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3272);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3273);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3274);
    } else {
    stringBuffer.append(TEXT_3275);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3276);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3277);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3278);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3279);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3280);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3281);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_3282);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3283);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3284);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3285);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3286);
    }
    stringBuffer.append(TEXT_3287);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3288);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_3289);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_3290);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3291);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_3292);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3293);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_3294);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_3295);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3296);
    } else {
    stringBuffer.append(TEXT_3297);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3298);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_3299);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3300);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3301);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3302);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3303);
    } else {
    stringBuffer.append(TEXT_3304);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3305);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3306);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3307);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_3308);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_3309);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3310);
    } else {
    stringBuffer.append(TEXT_3311);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3312);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3313);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_3314);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_3315);
    if (isJDK50) { //genOperation.annotations.insert.javajetinc
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_3316);
    }
    }
    stringBuffer.append(TEXT_3317);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_3318);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3319);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_3320);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_3321);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_3322);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3323);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3324);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_3325);
    } else {
    stringBuffer.append(TEXT_3326);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3327);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3328);
    }
    }
    stringBuffer.append(TEXT_3329);
    }
    }
    stringBuffer.append(TEXT_3330);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_3331);
    return stringBuffer.toString();
  }
}
