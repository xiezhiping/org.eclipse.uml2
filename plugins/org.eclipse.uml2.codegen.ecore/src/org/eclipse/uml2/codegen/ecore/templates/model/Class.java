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
  protected final String TEXT_359 = NL + "\t\treturn ";
  protected final String TEXT_360 = "(";
  protected final String TEXT_361 = "(";
  protected final String TEXT_362 = ")eGet(";
  protected final String TEXT_363 = ", true)";
  protected final String TEXT_364 = ").";
  protected final String TEXT_365 = "()";
  protected final String TEXT_366 = ";";
  protected final String TEXT_367 = NL + "\t\treturn ";
  protected final String TEXT_368 = "(";
  protected final String TEXT_369 = "(";
  protected final String TEXT_370 = ")";
  protected final String TEXT_371 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false)";
  protected final String TEXT_372 = ").";
  protected final String TEXT_373 = "()";
  protected final String TEXT_374 = ";";
  protected final String TEXT_375 = NL + "\t\t";
  protected final String TEXT_376 = " ";
  protected final String TEXT_377 = " = (";
  protected final String TEXT_378 = ")eVirtualGet(";
  protected final String TEXT_379 = ");";
  protected final String TEXT_380 = NL + "\t\tif (";
  protected final String TEXT_381 = " == null)" + NL + "\t\t{";
  protected final String TEXT_382 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_383 = ", ";
  protected final String TEXT_384 = " = new ";
  protected final String TEXT_385 = ");";
  protected final String TEXT_386 = NL + "\t\t\t";
  protected final String TEXT_387 = " = new ";
  protected final String TEXT_388 = ";";
  protected final String TEXT_389 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_390 = ";";
  protected final String TEXT_391 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_392 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_393 = ")";
  protected final String TEXT_394 = "eContainer";
  protected final String TEXT_395 = "eInternalContainer";
  protected final String TEXT_396 = "();";
  protected final String TEXT_397 = NL + "\t\t";
  protected final String TEXT_398 = " ";
  protected final String TEXT_399 = " = (";
  protected final String TEXT_400 = ")eVirtualGet(";
  protected final String TEXT_401 = ", ";
  protected final String TEXT_402 = ");";
  protected final String TEXT_403 = NL + "\t\tif (";
  protected final String TEXT_404 = " != null && ";
  protected final String TEXT_405 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_406 = " old";
  protected final String TEXT_407 = " = (";
  protected final String TEXT_408 = ")";
  protected final String TEXT_409 = ";" + NL + "\t\t\t";
  protected final String TEXT_410 = " = ";
  protected final String TEXT_411 = "eResolveProxy(old";
  protected final String TEXT_412 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_413 = " != old";
  protected final String TEXT_414 = ")" + NL + "\t\t\t{";
  protected final String TEXT_415 = NL + "\t\t\t\t";
  protected final String TEXT_416 = " new";
  protected final String TEXT_417 = " = (";
  protected final String TEXT_418 = ")";
  protected final String TEXT_419 = ";";
  protected final String TEXT_420 = NL + "\t\t\t\t";
  protected final String TEXT_421 = " msgs = old";
  protected final String TEXT_422 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_423 = ", null, null);";
  protected final String TEXT_424 = NL + "\t\t\t\t";
  protected final String TEXT_425 = " msgs =  old";
  protected final String TEXT_426 = ".eInverseRemove(this, ";
  protected final String TEXT_427 = ", ";
  protected final String TEXT_428 = ".class, null);";
  protected final String TEXT_429 = NL + "\t\t\t\tif (new";
  protected final String TEXT_430 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_431 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_432 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_433 = ", null, msgs);";
  protected final String TEXT_434 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_435 = ".eInverseAdd(this, ";
  protected final String TEXT_436 = ", ";
  protected final String TEXT_437 = ".class, msgs);";
  protected final String TEXT_438 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_439 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_440 = ", ";
  protected final String TEXT_441 = ");";
  protected final String TEXT_442 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_443 = "(this, ";
  protected final String TEXT_444 = ".RESOLVE, ";
  protected final String TEXT_445 = ", old";
  protected final String TEXT_446 = ", ";
  protected final String TEXT_447 = "));";
  protected final String TEXT_448 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_449 = NL + "\t\treturn (";
  protected final String TEXT_450 = ")eVirtualGet(";
  protected final String TEXT_451 = ", ";
  protected final String TEXT_452 = ");";
  protected final String TEXT_453 = NL + "\t\treturn (";
  protected final String TEXT_454 = " & ";
  protected final String TEXT_455 = "_EFLAG) != 0;";
  protected final String TEXT_456 = NL + "\t\treturn ";
  protected final String TEXT_457 = "_EFLAG_VALUES[(";
  protected final String TEXT_458 = " & ";
  protected final String TEXT_459 = "_EFLAG) >>> ";
  protected final String TEXT_460 = "_EFLAG_OFFSET];";
  protected final String TEXT_461 = NL + "\t\treturn ";
  protected final String TEXT_462 = ";";
  protected final String TEXT_463 = NL + "\t\t";
  protected final String TEXT_464 = " ";
  protected final String TEXT_465 = " = basicGet";
  protected final String TEXT_466 = "();" + NL + "\t\treturn ";
  protected final String TEXT_467 = " != null && ";
  protected final String TEXT_468 = ".eIsProxy() ? ";
  protected final String TEXT_469 = "eResolveProxy((";
  protected final String TEXT_470 = ")";
  protected final String TEXT_471 = ") : ";
  protected final String TEXT_472 = ";";
  protected final String TEXT_473 = NL + "\t\treturn new ";
  protected final String TEXT_474 = "((";
  protected final String TEXT_475 = ".Internal)((";
  protected final String TEXT_476 = ".Internal.Wrapper)get";
  protected final String TEXT_477 = "()).featureMap().";
  protected final String TEXT_478 = "list(";
  protected final String TEXT_479 = "));";
  protected final String TEXT_480 = NL + "\t\treturn (";
  protected final String TEXT_481 = ")get";
  protected final String TEXT_482 = "().";
  protected final String TEXT_483 = "list(";
  protected final String TEXT_484 = ");";
  protected final String TEXT_485 = NL + "\t\treturn ((";
  protected final String TEXT_486 = ".Internal.Wrapper)get";
  protected final String TEXT_487 = "()).featureMap().list(";
  protected final String TEXT_488 = ");";
  protected final String TEXT_489 = NL + "\t\treturn get";
  protected final String TEXT_490 = "().list(";
  protected final String TEXT_491 = ");";
  protected final String TEXT_492 = NL + "\t\treturn ";
  protected final String TEXT_493 = "(";
  protected final String TEXT_494 = "(";
  protected final String TEXT_495 = ")";
  protected final String TEXT_496 = "((";
  protected final String TEXT_497 = ".Internal.Wrapper)get";
  protected final String TEXT_498 = "()).featureMap().get(";
  protected final String TEXT_499 = ", true)";
  protected final String TEXT_500 = ").";
  protected final String TEXT_501 = "()";
  protected final String TEXT_502 = ";";
  protected final String TEXT_503 = NL + "\t\treturn ";
  protected final String TEXT_504 = "(";
  protected final String TEXT_505 = "(";
  protected final String TEXT_506 = ")";
  protected final String TEXT_507 = "get";
  protected final String TEXT_508 = "().get(";
  protected final String TEXT_509 = ", true)";
  protected final String TEXT_510 = ").";
  protected final String TEXT_511 = "()";
  protected final String TEXT_512 = ";";
  protected final String TEXT_513 = NL + "\t\t";
  protected final String TEXT_514 = NL + "\t\t";
  protected final String TEXT_515 = NL + "\t\t";
  protected final String TEXT_516 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_517 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_518 = NL + "\t\t\t";
  protected final String TEXT_519 = " result = (";
  protected final String TEXT_520 = ") cache.get(";
  protected final String TEXT_521 = "eResource(), ";
  protected final String TEXT_522 = "this, ";
  protected final String TEXT_523 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_524 = "eResource(), ";
  protected final String TEXT_525 = "this, ";
  protected final String TEXT_526 = ", result = ";
  protected final String TEXT_527 = "new ";
  protected final String TEXT_528 = "(";
  protected final String TEXT_529 = ".";
  protected final String TEXT_530 = "(this)";
  protected final String TEXT_531 = ")";
  protected final String TEXT_532 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_533 = ".";
  protected final String TEXT_534 = "()";
  protected final String TEXT_535 = ";" + NL + "\t\t}";
  protected final String TEXT_536 = NL + "\t\treturn ";
  protected final String TEXT_537 = ".";
  protected final String TEXT_538 = "(this);";
  protected final String TEXT_539 = NL + "\t\t";
  protected final String TEXT_540 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_541 = " eResource = eResource();";
  protected final String TEXT_542 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_543 = NL + "\t\t\t";
  protected final String TEXT_544 = " ";
  protected final String TEXT_545 = " = (";
  protected final String TEXT_546 = ") cache.get(eResource, this, ";
  protected final String TEXT_547 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_548 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_549 = ", ";
  protected final String TEXT_550 = " = new ";
  protected final String TEXT_551 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_552 = ";" + NL + "\t\t}";
  protected final String TEXT_553 = NL + "\t\treturn new ";
  protected final String TEXT_554 = ";";
  protected final String TEXT_555 = NL + "\t\t";
  protected final String TEXT_556 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_557 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_558 = " method = getClass().getMethod(\"";
  protected final String TEXT_559 = "\", null);";
  protected final String TEXT_560 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_561 = NL + "\t\t\t\t";
  protected final String TEXT_562 = " ";
  protected final String TEXT_563 = " = (";
  protected final String TEXT_564 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_565 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_566 = " union = ";
  protected final String TEXT_567 = "Helper(new ";
  protected final String TEXT_568 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_569 = " = new ";
  protected final String TEXT_570 = "(this, ";
  protected final String TEXT_571 = "null";
  protected final String TEXT_572 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_573 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_574 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_575 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_576 = NL + "\t\t\t";
  protected final String TEXT_577 = " ";
  protected final String TEXT_578 = " = (";
  protected final String TEXT_579 = ") cache.get(eResource(), this, ";
  protected final String TEXT_580 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_581 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_582 = " union = ";
  protected final String TEXT_583 = "Helper(new ";
  protected final String TEXT_584 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_585 = ", ";
  protected final String TEXT_586 = " = new ";
  protected final String TEXT_587 = "(this, ";
  protected final String TEXT_588 = "null";
  protected final String TEXT_589 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_590 = ";";
  protected final String TEXT_591 = NL + "\t\t}";
  protected final String TEXT_592 = NL + "\t\t";
  protected final String TEXT_593 = " union = ";
  protected final String TEXT_594 = "Helper(new ";
  protected final String TEXT_595 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_596 = "(this, ";
  protected final String TEXT_597 = "null";
  protected final String TEXT_598 = ", union.size(), union.toArray());";
  protected final String TEXT_599 = NL + "\t\tif (isSet";
  protected final String TEXT_600 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_601 = "();" + NL + "\t\t}";
  protected final String TEXT_602 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_603 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_604 = "();" + NL + "\t\t}";
  protected final String TEXT_605 = NL + "\t\t";
  protected final String TEXT_606 = " ";
  protected final String TEXT_607 = " = ";
  protected final String TEXT_608 = "();" + NL + "\t\tif (";
  protected final String TEXT_609 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_610 = ";" + NL + "\t\t}";
  protected final String TEXT_611 = NL + "\t\treturn ";
  protected final String TEXT_612 = "super.";
  protected final String TEXT_613 = "()";
  protected final String TEXT_614 = "null";
  protected final String TEXT_615 = ";";
  protected final String TEXT_616 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_617 = "' ";
  protected final String TEXT_618 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_619 = NL + "\t}" + NL;
  protected final String TEXT_620 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_621 = NL + "\t@Override";
  protected final String TEXT_622 = NL + "\tpublic ";
  protected final String TEXT_623 = " basicGet";
  protected final String TEXT_624 = "()" + NL + "\t{";
  protected final String TEXT_625 = NL + "\t\treturn (";
  protected final String TEXT_626 = ")eDynamicGet(";
  protected final String TEXT_627 = ", ";
  protected final String TEXT_628 = ", false, ";
  protected final String TEXT_629 = ");";
  protected final String TEXT_630 = NL + "\t\treturn ";
  protected final String TEXT_631 = "(";
  protected final String TEXT_632 = "(";
  protected final String TEXT_633 = ")";
  protected final String TEXT_634 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false)";
  protected final String TEXT_635 = ").";
  protected final String TEXT_636 = "()";
  protected final String TEXT_637 = ";";
  protected final String TEXT_638 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_639 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_640 = ")eInternalContainer();";
  protected final String TEXT_641 = NL + "\t\treturn (";
  protected final String TEXT_642 = ")eVirtualGet(";
  protected final String TEXT_643 = ");";
  protected final String TEXT_644 = NL + "\t\treturn ";
  protected final String TEXT_645 = ";";
  protected final String TEXT_646 = NL + "\t\treturn (";
  protected final String TEXT_647 = ")((";
  protected final String TEXT_648 = ".Internal.Wrapper)get";
  protected final String TEXT_649 = "()).featureMap().get(";
  protected final String TEXT_650 = ", false);";
  protected final String TEXT_651 = NL + "\t\treturn (";
  protected final String TEXT_652 = ")get";
  protected final String TEXT_653 = "().get(";
  protected final String TEXT_654 = ", false);";
  protected final String TEXT_655 = NL + "\t\treturn ";
  protected final String TEXT_656 = ".";
  protected final String TEXT_657 = "(this);";
  protected final String TEXT_658 = NL + "\t\tif (isSet";
  protected final String TEXT_659 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_660 = "basicGet";
  protected final String TEXT_661 = "();" + NL + "\t\t}";
  protected final String TEXT_662 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_663 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_664 = "basicGet";
  protected final String TEXT_665 = "();" + NL + "\t\t}";
  protected final String TEXT_666 = NL + "\t\t";
  protected final String TEXT_667 = " ";
  protected final String TEXT_668 = " = ";
  protected final String TEXT_669 = "basicGet";
  protected final String TEXT_670 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_671 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_672 = ";" + NL + "\t\t}";
  protected final String TEXT_673 = NL + "\t\treturn ";
  protected final String TEXT_674 = "super.basicGet";
  protected final String TEXT_675 = "()";
  protected final String TEXT_676 = "null";
  protected final String TEXT_677 = ";";
  protected final String TEXT_678 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_679 = "' ";
  protected final String TEXT_680 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_681 = NL + "\t}" + NL;
  protected final String TEXT_682 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_683 = NL + "\t@Override";
  protected final String TEXT_684 = NL + "\tpublic ";
  protected final String TEXT_685 = " basicSet";
  protected final String TEXT_686 = "(";
  protected final String TEXT_687 = " new";
  protected final String TEXT_688 = ", ";
  protected final String TEXT_689 = " msgs)" + NL + "\t{";
  protected final String TEXT_690 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_691 = ")new";
  protected final String TEXT_692 = ", ";
  protected final String TEXT_693 = ", msgs);";
  protected final String TEXT_694 = NL + "\t\t";
  protected final String TEXT_695 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_696 = NL + "\t\t\t";
  protected final String TEXT_697 = " ";
  protected final String TEXT_698 = " = ";
  protected final String TEXT_699 = "();";
  protected final String TEXT_700 = NL + "\t\t\tObject ";
  protected final String TEXT_701 = " = eVirtualGet(";
  protected final String TEXT_702 = ");";
  protected final String TEXT_703 = NL + "\t\t\tif (";
  protected final String TEXT_704 = " != null && ";
  protected final String TEXT_705 = " != new";
  protected final String TEXT_706 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_707 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_708 = NL + "\t\t\tif (new";
  protected final String TEXT_709 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_710 = NL + "\t\t\t\t";
  protected final String TEXT_711 = " ";
  protected final String TEXT_712 = " = ";
  protected final String TEXT_713 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_714 = ".contains(new";
  protected final String TEXT_715 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_716 = ".add(new";
  protected final String TEXT_717 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_718 = NL + "\t\t\t\t";
  protected final String TEXT_719 = " ";
  protected final String TEXT_720 = " = ";
  protected final String TEXT_721 = "();";
  protected final String TEXT_722 = NL + "\t\t\t\tObject ";
  protected final String TEXT_723 = " = eVirtualGet(";
  protected final String TEXT_724 = ");";
  protected final String TEXT_725 = NL + "\t\t\t\tif (new";
  protected final String TEXT_726 = " != ";
  protected final String TEXT_727 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_728 = "(new";
  protected final String TEXT_729 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_730 = NL + "\t\t\t}";
  protected final String TEXT_731 = NL + "\t\t}";
  protected final String TEXT_732 = NL + "\t\treturn msgs;";
  protected final String TEXT_733 = NL + "\t\tmsgs = eDynamicInverseAdd((";
  protected final String TEXT_734 = ")new";
  protected final String TEXT_735 = ", ";
  protected final String TEXT_736 = ", msgs);";
  protected final String TEXT_737 = NL + "\t\t";
  protected final String TEXT_738 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_739 = NL + "\t\t\t";
  protected final String TEXT_740 = " ";
  protected final String TEXT_741 = " = ";
  protected final String TEXT_742 = "();";
  protected final String TEXT_743 = NL + "\t\t\tObject ";
  protected final String TEXT_744 = " = eVirtualGet(";
  protected final String TEXT_745 = ");";
  protected final String TEXT_746 = NL + "\t\t\tif (";
  protected final String TEXT_747 = " != null && ";
  protected final String TEXT_748 = " != new";
  protected final String TEXT_749 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_750 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_751 = NL + "\t\t\tif (new";
  protected final String TEXT_752 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_753 = NL + "\t\t\t\t";
  protected final String TEXT_754 = " ";
  protected final String TEXT_755 = " = ";
  protected final String TEXT_756 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_757 = ".contains(new";
  protected final String TEXT_758 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_759 = ".add(new";
  protected final String TEXT_760 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_761 = NL + "\t\t\t\t";
  protected final String TEXT_762 = " ";
  protected final String TEXT_763 = " = ";
  protected final String TEXT_764 = "();";
  protected final String TEXT_765 = NL + "\t\t\t\tObject ";
  protected final String TEXT_766 = " = eVirtualGet(";
  protected final String TEXT_767 = ");";
  protected final String TEXT_768 = NL + "\t\t\t\tif (new";
  protected final String TEXT_769 = " != ";
  protected final String TEXT_770 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_771 = "(new";
  protected final String TEXT_772 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_773 = NL + "\t\t\t}";
  protected final String TEXT_774 = NL + "\t\t}";
  protected final String TEXT_775 = NL + "\t\treturn msgs;";
  protected final String TEXT_776 = NL + "\t\tObject old";
  protected final String TEXT_777 = " = eVirtualSet(";
  protected final String TEXT_778 = ", new";
  protected final String TEXT_779 = ");";
  protected final String TEXT_780 = NL + "\t\t";
  protected final String TEXT_781 = " old";
  protected final String TEXT_782 = " = ";
  protected final String TEXT_783 = ";" + NL + "\t\t";
  protected final String TEXT_784 = " = new";
  protected final String TEXT_785 = ";";
  protected final String TEXT_786 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_787 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_788 = NL + "\t\tboolean old";
  protected final String TEXT_789 = "ESet = (";
  protected final String TEXT_790 = " & ";
  protected final String TEXT_791 = "_ESETFLAG) != 0;";
  protected final String TEXT_792 = NL + "\t\t";
  protected final String TEXT_793 = " |= ";
  protected final String TEXT_794 = "_ESETFLAG;";
  protected final String TEXT_795 = NL + "\t\tboolean old";
  protected final String TEXT_796 = "ESet = ";
  protected final String TEXT_797 = "ESet;";
  protected final String TEXT_798 = NL + "\t\t";
  protected final String TEXT_799 = "ESet = true;";
  protected final String TEXT_800 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_801 = NL + "\t\t\t";
  protected final String TEXT_802 = " notification = new ";
  protected final String TEXT_803 = "(this, ";
  protected final String TEXT_804 = ".SET, ";
  protected final String TEXT_805 = ", ";
  protected final String TEXT_806 = "isSetChange ? null : old";
  protected final String TEXT_807 = "old";
  protected final String TEXT_808 = ", new";
  protected final String TEXT_809 = ", ";
  protected final String TEXT_810 = "isSetChange";
  protected final String TEXT_811 = "!old";
  protected final String TEXT_812 = "ESet";
  protected final String TEXT_813 = ");";
  protected final String TEXT_814 = NL + "\t\t\t";
  protected final String TEXT_815 = " notification = new ";
  protected final String TEXT_816 = "(this, ";
  protected final String TEXT_817 = ".SET, ";
  protected final String TEXT_818 = ", ";
  protected final String TEXT_819 = "old";
  protected final String TEXT_820 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_821 = "old";
  protected final String TEXT_822 = ", new";
  protected final String TEXT_823 = ");";
  protected final String TEXT_824 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_825 = NL + "\t\t";
  protected final String TEXT_826 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_827 = NL + "\t\t\t";
  protected final String TEXT_828 = " ";
  protected final String TEXT_829 = " = ";
  protected final String TEXT_830 = "();";
  protected final String TEXT_831 = NL + "\t\t\tObject ";
  protected final String TEXT_832 = " = eVirtualGet(";
  protected final String TEXT_833 = ");";
  protected final String TEXT_834 = NL + "\t\t\tif (";
  protected final String TEXT_835 = " != null && ";
  protected final String TEXT_836 = " != new";
  protected final String TEXT_837 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_838 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_839 = NL + "\t\t\tif (new";
  protected final String TEXT_840 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_841 = NL + "\t\t\t\t";
  protected final String TEXT_842 = " ";
  protected final String TEXT_843 = " = ";
  protected final String TEXT_844 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_845 = ".contains(new";
  protected final String TEXT_846 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_847 = ".add(new";
  protected final String TEXT_848 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_849 = NL + "\t\t\t\t";
  protected final String TEXT_850 = " ";
  protected final String TEXT_851 = " = ";
  protected final String TEXT_852 = "();";
  protected final String TEXT_853 = NL + "\t\t\t\tObject ";
  protected final String TEXT_854 = " = eVirtualGet(";
  protected final String TEXT_855 = ");";
  protected final String TEXT_856 = NL + "\t\t\t\tif (new";
  protected final String TEXT_857 = " != ";
  protected final String TEXT_858 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_859 = "(new";
  protected final String TEXT_860 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_861 = NL + "\t\t\t}";
  protected final String TEXT_862 = NL + "\t\t}";
  protected final String TEXT_863 = NL + "\t\treturn msgs;";
  protected final String TEXT_864 = NL + "\t\treturn ((";
  protected final String TEXT_865 = ".Internal)((";
  protected final String TEXT_866 = ".Internal.Wrapper)get";
  protected final String TEXT_867 = "()).featureMap()).basicAdd(";
  protected final String TEXT_868 = ", new";
  protected final String TEXT_869 = ", msgs);";
  protected final String TEXT_870 = NL + "\t\treturn ((";
  protected final String TEXT_871 = ".Internal)get";
  protected final String TEXT_872 = "()).basicAdd(";
  protected final String TEXT_873 = ", new";
  protected final String TEXT_874 = ", msgs);";
  protected final String TEXT_875 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_876 = "' ";
  protected final String TEXT_877 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_878 = NL + "\t}" + NL;
  protected final String TEXT_879 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_880 = "#";
  protected final String TEXT_881 = " <em>";
  protected final String TEXT_882 = "</em>}' ";
  protected final String TEXT_883 = ".";
  protected final String TEXT_884 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_885 = "</em>' ";
  protected final String TEXT_886 = ".";
  protected final String TEXT_887 = NL + "\t * @see ";
  protected final String TEXT_888 = NL + "\t * @see #isSet";
  protected final String TEXT_889 = "()";
  protected final String TEXT_890 = NL + "\t * @see #unset";
  protected final String TEXT_891 = "()";
  protected final String TEXT_892 = NL + "\t * @see #";
  protected final String TEXT_893 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_894 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_895 = NL + "\t@Override";
  protected final String TEXT_896 = NL + "\tvoid set";
  protected final String TEXT_897 = "(";
  protected final String TEXT_898 = " value);" + NL;
  protected final String TEXT_899 = NL + "\tpublic void set";
  protected final String TEXT_900 = "_";
  protected final String TEXT_901 = "(";
  protected final String TEXT_902 = " ";
  protected final String TEXT_903 = ")" + NL + "\t{";
  protected final String TEXT_904 = NL + "\t\tnew";
  protected final String TEXT_905 = " = new";
  protected final String TEXT_906 = " == null ? ";
  protected final String TEXT_907 = " : new";
  protected final String TEXT_908 = ";";
  protected final String TEXT_909 = NL + "\t\teDynamicSet(";
  protected final String TEXT_910 = ", ";
  protected final String TEXT_911 = ", ";
  protected final String TEXT_912 = "new ";
  protected final String TEXT_913 = "(";
  protected final String TEXT_914 = "new";
  protected final String TEXT_915 = ")";
  protected final String TEXT_916 = ");";
  protected final String TEXT_917 = NL + "\t\teSet(";
  protected final String TEXT_918 = ", ";
  protected final String TEXT_919 = "new ";
  protected final String TEXT_920 = "(";
  protected final String TEXT_921 = "new";
  protected final String TEXT_922 = ")";
  protected final String TEXT_923 = ");";
  protected final String TEXT_924 = NL + "\t\t";
  protected final String TEXT_925 = "__ESETTING_DELEGATE.dynamicSet(this, null, 0, ";
  protected final String TEXT_926 = "new ";
  protected final String TEXT_927 = "(";
  protected final String TEXT_928 = "new";
  protected final String TEXT_929 = ")";
  protected final String TEXT_930 = ");";
  protected final String TEXT_931 = NL + "\t\tif (new";
  protected final String TEXT_932 = " != eInternalContainer() || (eContainerFeatureID() != ";
  protected final String TEXT_933 = " && new";
  protected final String TEXT_934 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_935 = ".isAncestor(this, ";
  protected final String TEXT_936 = "new";
  protected final String TEXT_937 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_938 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_939 = NL + "\t\t\t";
  protected final String TEXT_940 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_941 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_942 = ")new";
  protected final String TEXT_943 = ").eInverseAdd(this, ";
  protected final String TEXT_944 = ", ";
  protected final String TEXT_945 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_946 = "(";
  protected final String TEXT_947 = "new";
  protected final String TEXT_948 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_949 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_950 = "(this, ";
  protected final String TEXT_951 = ".SET, ";
  protected final String TEXT_952 = ", new";
  protected final String TEXT_953 = ", new";
  protected final String TEXT_954 = "));";
  protected final String TEXT_955 = NL + "\t\t";
  protected final String TEXT_956 = " ";
  protected final String TEXT_957 = " = (";
  protected final String TEXT_958 = ")eVirtualGet(";
  protected final String TEXT_959 = ");";
  protected final String TEXT_960 = NL + "\t\tif (new";
  protected final String TEXT_961 = " != ";
  protected final String TEXT_962 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_963 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_964 = " != null)";
  protected final String TEXT_965 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_966 = ")";
  protected final String TEXT_967 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_968 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_969 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_970 = ")new";
  protected final String TEXT_971 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_972 = ", null, msgs);";
  protected final String TEXT_973 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_974 = ")";
  protected final String TEXT_975 = ").eInverseRemove(this, ";
  protected final String TEXT_976 = ", ";
  protected final String TEXT_977 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_978 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_979 = ")new";
  protected final String TEXT_980 = ").eInverseAdd(this, ";
  protected final String TEXT_981 = ", ";
  protected final String TEXT_982 = ".class, msgs);";
  protected final String TEXT_983 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_984 = "(";
  protected final String TEXT_985 = "new";
  protected final String TEXT_986 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_987 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_988 = NL + "\t\t\tboolean old";
  protected final String TEXT_989 = "ESet = eVirtualIsSet(";
  protected final String TEXT_990 = ");";
  protected final String TEXT_991 = NL + "\t\t\tboolean old";
  protected final String TEXT_992 = "ESet = (";
  protected final String TEXT_993 = " & ";
  protected final String TEXT_994 = "_ESETFLAG) != 0;";
  protected final String TEXT_995 = NL + "\t\t\t";
  protected final String TEXT_996 = " |= ";
  protected final String TEXT_997 = "_ESETFLAG;";
  protected final String TEXT_998 = NL + "\t\t\tboolean old";
  protected final String TEXT_999 = "ESet = ";
  protected final String TEXT_1000 = "ESet;";
  protected final String TEXT_1001 = NL + "\t\t\t";
  protected final String TEXT_1002 = "ESet = true;";
  protected final String TEXT_1003 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1004 = "(this, ";
  protected final String TEXT_1005 = ".SET, ";
  protected final String TEXT_1006 = ", new";
  protected final String TEXT_1007 = ", new";
  protected final String TEXT_1008 = ", !old";
  protected final String TEXT_1009 = "ESet));";
  protected final String TEXT_1010 = NL + "\t\t}";
  protected final String TEXT_1011 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1012 = "(this, ";
  protected final String TEXT_1013 = ".SET, ";
  protected final String TEXT_1014 = ", new";
  protected final String TEXT_1015 = ", new";
  protected final String TEXT_1016 = "));";
  protected final String TEXT_1017 = NL + "\t\t";
  protected final String TEXT_1018 = " old";
  protected final String TEXT_1019 = " = (";
  protected final String TEXT_1020 = " & ";
  protected final String TEXT_1021 = "_EFLAG) != 0;";
  protected final String TEXT_1022 = NL + "\t\t";
  protected final String TEXT_1023 = " old";
  protected final String TEXT_1024 = " = ";
  protected final String TEXT_1025 = "_EFLAG_VALUES[(";
  protected final String TEXT_1026 = " & ";
  protected final String TEXT_1027 = "_EFLAG) >>> ";
  protected final String TEXT_1028 = "_EFLAG_OFFSET];";
  protected final String TEXT_1029 = NL + "\t\tif (new";
  protected final String TEXT_1030 = ") ";
  protected final String TEXT_1031 = " |= ";
  protected final String TEXT_1032 = "_EFLAG; else ";
  protected final String TEXT_1033 = " &= ~";
  protected final String TEXT_1034 = "_EFLAG;";
  protected final String TEXT_1035 = NL + "\t\tif (new";
  protected final String TEXT_1036 = " == null) new";
  protected final String TEXT_1037 = " = ";
  protected final String TEXT_1038 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_1039 = " = ";
  protected final String TEXT_1040 = " & ~";
  protected final String TEXT_1041 = "_EFLAG | ";
  protected final String TEXT_1042 = "new";
  protected final String TEXT_1043 = ".ordinal()";
  protected final String TEXT_1044 = ".VALUES.indexOf(new";
  protected final String TEXT_1045 = ")";
  protected final String TEXT_1046 = " << ";
  protected final String TEXT_1047 = "_EFLAG_OFFSET;";
  protected final String TEXT_1048 = NL + "\t\t";
  protected final String TEXT_1049 = " old";
  protected final String TEXT_1050 = " = ";
  protected final String TEXT_1051 = ";";
  protected final String TEXT_1052 = NL + "\t\t";
  protected final String TEXT_1053 = " ";
  protected final String TEXT_1054 = " = new";
  protected final String TEXT_1055 = " == null ? ";
  protected final String TEXT_1056 = " : new";
  protected final String TEXT_1057 = ";";
  protected final String TEXT_1058 = NL + "\t\t";
  protected final String TEXT_1059 = " = new";
  protected final String TEXT_1060 = " == null ? ";
  protected final String TEXT_1061 = " : new";
  protected final String TEXT_1062 = ";";
  protected final String TEXT_1063 = NL + "\t\t";
  protected final String TEXT_1064 = " ";
  protected final String TEXT_1065 = " = ";
  protected final String TEXT_1066 = "new";
  protected final String TEXT_1067 = ";";
  protected final String TEXT_1068 = NL + "\t\t";
  protected final String TEXT_1069 = " = ";
  protected final String TEXT_1070 = "new";
  protected final String TEXT_1071 = ";";
  protected final String TEXT_1072 = NL + "\t\tObject old";
  protected final String TEXT_1073 = " = eVirtualSet(";
  protected final String TEXT_1074 = ", ";
  protected final String TEXT_1075 = ");";
  protected final String TEXT_1076 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1077 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1078 = NL + "\t\tboolean old";
  protected final String TEXT_1079 = "ESet = (";
  protected final String TEXT_1080 = " & ";
  protected final String TEXT_1081 = "_ESETFLAG) != 0;";
  protected final String TEXT_1082 = NL + "\t\t";
  protected final String TEXT_1083 = " |= ";
  protected final String TEXT_1084 = "_ESETFLAG;";
  protected final String TEXT_1085 = NL + "\t\tboolean old";
  protected final String TEXT_1086 = "ESet = ";
  protected final String TEXT_1087 = "ESet;";
  protected final String TEXT_1088 = NL + "\t\t";
  protected final String TEXT_1089 = "ESet = true;";
  protected final String TEXT_1090 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1091 = "(this, ";
  protected final String TEXT_1092 = ".SET, ";
  protected final String TEXT_1093 = ", ";
  protected final String TEXT_1094 = "isSetChange ? ";
  protected final String TEXT_1095 = " : old";
  protected final String TEXT_1096 = "old";
  protected final String TEXT_1097 = ", ";
  protected final String TEXT_1098 = "new";
  protected final String TEXT_1099 = ", ";
  protected final String TEXT_1100 = "isSetChange";
  protected final String TEXT_1101 = "!old";
  protected final String TEXT_1102 = "ESet";
  protected final String TEXT_1103 = "));";
  protected final String TEXT_1104 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1105 = "(this, ";
  protected final String TEXT_1106 = ".SET, ";
  protected final String TEXT_1107 = ", ";
  protected final String TEXT_1108 = "old";
  protected final String TEXT_1109 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_1110 = " : old";
  protected final String TEXT_1111 = "old";
  protected final String TEXT_1112 = ", ";
  protected final String TEXT_1113 = "new";
  protected final String TEXT_1114 = "));";
  protected final String TEXT_1115 = NL + "\t\t";
  protected final String TEXT_1116 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_1117 = NL + "\t\t\t";
  protected final String TEXT_1118 = " ";
  protected final String TEXT_1119 = " = ";
  protected final String TEXT_1120 = "();";
  protected final String TEXT_1121 = NL + "\t\t\tObject ";
  protected final String TEXT_1122 = " = eVirtualGet(";
  protected final String TEXT_1123 = ");";
  protected final String TEXT_1124 = NL + "\t\t\tif (";
  protected final String TEXT_1125 = " != null && ";
  protected final String TEXT_1126 = " != new";
  protected final String TEXT_1127 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_1128 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_1129 = NL + "\t\t\tif (new";
  protected final String TEXT_1130 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_1131 = NL + "\t\t\t\t";
  protected final String TEXT_1132 = " ";
  protected final String TEXT_1133 = " = ";
  protected final String TEXT_1134 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_1135 = ".contains(new";
  protected final String TEXT_1136 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_1137 = ".add(new";
  protected final String TEXT_1138 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1139 = NL + "\t\t\t\t";
  protected final String TEXT_1140 = " ";
  protected final String TEXT_1141 = " = ";
  protected final String TEXT_1142 = "();";
  protected final String TEXT_1143 = NL + "\t\t\t\tObject ";
  protected final String TEXT_1144 = " = eVirtualGet(";
  protected final String TEXT_1145 = ");";
  protected final String TEXT_1146 = NL + "\t\t\t\tif (new";
  protected final String TEXT_1147 = " != ";
  protected final String TEXT_1148 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_1149 = "(new";
  protected final String TEXT_1150 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1151 = NL + "\t\t\t}";
  protected final String TEXT_1152 = NL + "\t\t}";
  protected final String TEXT_1153 = NL + "\t\t((";
  protected final String TEXT_1154 = ".Internal)((";
  protected final String TEXT_1155 = ".Internal.Wrapper)get";
  protected final String TEXT_1156 = "()).featureMap()).set(";
  protected final String TEXT_1157 = ", ";
  protected final String TEXT_1158 = "new ";
  protected final String TEXT_1159 = "(";
  protected final String TEXT_1160 = "new";
  protected final String TEXT_1161 = ")";
  protected final String TEXT_1162 = ");";
  protected final String TEXT_1163 = NL + "\t\t((";
  protected final String TEXT_1164 = ".Internal)get";
  protected final String TEXT_1165 = "()).set(";
  protected final String TEXT_1166 = ", ";
  protected final String TEXT_1167 = "new ";
  protected final String TEXT_1168 = "(";
  protected final String TEXT_1169 = "new";
  protected final String TEXT_1170 = ")";
  protected final String TEXT_1171 = ");";
  protected final String TEXT_1172 = NL + "\t\t";
  protected final String TEXT_1173 = NL + "\t\t";
  protected final String TEXT_1174 = ".";
  protected final String TEXT_1175 = "(this, ";
  protected final String TEXT_1176 = ");";
  protected final String TEXT_1177 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_1178 = "' ";
  protected final String TEXT_1179 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1180 = NL + "\t}" + NL;
  protected final String TEXT_1181 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1182 = NL + "\t@Override";
  protected final String TEXT_1183 = NL + "\tpublic ";
  protected final String TEXT_1184 = " basicUnset";
  protected final String TEXT_1185 = "(";
  protected final String TEXT_1186 = " msgs)" + NL + "\t{";
  protected final String TEXT_1187 = NL + "\t\treturn eDynamicInverseRemove((";
  protected final String TEXT_1188 = ")";
  protected final String TEXT_1189 = "basicGet";
  protected final String TEXT_1190 = "(), ";
  protected final String TEXT_1191 = ", msgs);";
  protected final String TEXT_1192 = "Object old";
  protected final String TEXT_1193 = " = ";
  protected final String TEXT_1194 = "eVirtualUnset(";
  protected final String TEXT_1195 = ");";
  protected final String TEXT_1196 = NL + "\t\t";
  protected final String TEXT_1197 = " old";
  protected final String TEXT_1198 = " = ";
  protected final String TEXT_1199 = ";";
  protected final String TEXT_1200 = NL + "\t\t";
  protected final String TEXT_1201 = " = null;";
  protected final String TEXT_1202 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1203 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1204 = NL + "\t\tboolean old";
  protected final String TEXT_1205 = "ESet = (";
  protected final String TEXT_1206 = " & ";
  protected final String TEXT_1207 = "_ESETFLAG) != 0;";
  protected final String TEXT_1208 = NL + "\t\t";
  protected final String TEXT_1209 = " &= ~";
  protected final String TEXT_1210 = "_ESETFLAG;";
  protected final String TEXT_1211 = NL + "\t\tboolean old";
  protected final String TEXT_1212 = "ESet = ";
  protected final String TEXT_1213 = "ESet;";
  protected final String TEXT_1214 = NL + "\t\t";
  protected final String TEXT_1215 = "ESet = false;";
  protected final String TEXT_1216 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1217 = " notification = new ";
  protected final String TEXT_1218 = "(this, ";
  protected final String TEXT_1219 = ".UNSET, ";
  protected final String TEXT_1220 = ", ";
  protected final String TEXT_1221 = "isSetChange ? old";
  protected final String TEXT_1222 = " : null";
  protected final String TEXT_1223 = "old";
  protected final String TEXT_1224 = ", null, ";
  protected final String TEXT_1225 = "isSetChange";
  protected final String TEXT_1226 = "old";
  protected final String TEXT_1227 = "ESet";
  protected final String TEXT_1228 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1229 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1230 = "' ";
  protected final String TEXT_1231 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1232 = NL + "\t}" + NL;
  protected final String TEXT_1233 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1234 = "#";
  protected final String TEXT_1235 = " <em>";
  protected final String TEXT_1236 = "</em>}' ";
  protected final String TEXT_1237 = ".";
  protected final String TEXT_1238 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1239 = NL + "\t * @see #isSet";
  protected final String TEXT_1240 = "()";
  protected final String TEXT_1241 = NL + "\t * @see #";
  protected final String TEXT_1242 = "()";
  protected final String TEXT_1243 = NL + "\t * @see #set";
  protected final String TEXT_1244 = "(";
  protected final String TEXT_1245 = ")";
  protected final String TEXT_1246 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1247 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1248 = NL + "\t@Override";
  protected final String TEXT_1249 = NL + "\tvoid unset";
  protected final String TEXT_1250 = "();" + NL;
  protected final String TEXT_1251 = NL + "\tpublic void unset";
  protected final String TEXT_1252 = "_";
  protected final String TEXT_1253 = "()" + NL + "\t{";
  protected final String TEXT_1254 = NL + "\t\teDynamicUnset(";
  protected final String TEXT_1255 = ", ";
  protected final String TEXT_1256 = ");";
  protected final String TEXT_1257 = NL + "\t\teUnset(";
  protected final String TEXT_1258 = ");";
  protected final String TEXT_1259 = NL + "\t\t";
  protected final String TEXT_1260 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_1261 = NL + "\t\t";
  protected final String TEXT_1262 = " ";
  protected final String TEXT_1263 = " = (";
  protected final String TEXT_1264 = ")eVirtualGet(";
  protected final String TEXT_1265 = ");";
  protected final String TEXT_1266 = NL + "\t\tif (";
  protected final String TEXT_1267 = " != null) ((";
  protected final String TEXT_1268 = ".Unsettable";
  protected final String TEXT_1269 = ")";
  protected final String TEXT_1270 = ").unset();";
  protected final String TEXT_1271 = NL + "\t\t";
  protected final String TEXT_1272 = " ";
  protected final String TEXT_1273 = " = (";
  protected final String TEXT_1274 = ")eVirtualGet(";
  protected final String TEXT_1275 = ");";
  protected final String TEXT_1276 = NL + "\t\tif (";
  protected final String TEXT_1277 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1278 = " msgs = null;";
  protected final String TEXT_1279 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1280 = ")";
  protected final String TEXT_1281 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1282 = ", null, msgs);";
  protected final String TEXT_1283 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1284 = ")";
  protected final String TEXT_1285 = ").eInverseRemove(this, ";
  protected final String TEXT_1286 = ", ";
  protected final String TEXT_1287 = ".class, msgs);";
  protected final String TEXT_1288 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1289 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1290 = NL + "\t\t\tboolean old";
  protected final String TEXT_1291 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1292 = ");";
  protected final String TEXT_1293 = NL + "\t\t\tboolean old";
  protected final String TEXT_1294 = "ESet = (";
  protected final String TEXT_1295 = " & ";
  protected final String TEXT_1296 = "_ESETFLAG) != 0;";
  protected final String TEXT_1297 = NL + "\t\t\t";
  protected final String TEXT_1298 = " &= ~";
  protected final String TEXT_1299 = "_ESETFLAG;";
  protected final String TEXT_1300 = NL + "\t\t\tboolean old";
  protected final String TEXT_1301 = "ESet = ";
  protected final String TEXT_1302 = "ESet;";
  protected final String TEXT_1303 = NL + "\t\t\t";
  protected final String TEXT_1304 = "ESet = false;";
  protected final String TEXT_1305 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1306 = "(this, ";
  protected final String TEXT_1307 = ".UNSET, ";
  protected final String TEXT_1308 = ", null, null, old";
  protected final String TEXT_1309 = "ESet));";
  protected final String TEXT_1310 = NL + "\t\t}";
  protected final String TEXT_1311 = NL + "\t\t";
  protected final String TEXT_1312 = " old";
  protected final String TEXT_1313 = " = (";
  protected final String TEXT_1314 = " & ";
  protected final String TEXT_1315 = "_EFLAG) != 0;";
  protected final String TEXT_1316 = NL + "\t\t";
  protected final String TEXT_1317 = " old";
  protected final String TEXT_1318 = " = ";
  protected final String TEXT_1319 = "_EFLAG_VALUES[(";
  protected final String TEXT_1320 = " & ";
  protected final String TEXT_1321 = "_EFLAG) >>> ";
  protected final String TEXT_1322 = "_EFLAG_OFFSET];";
  protected final String TEXT_1323 = NL + "\t\tObject old";
  protected final String TEXT_1324 = " = eVirtualUnset(";
  protected final String TEXT_1325 = ");";
  protected final String TEXT_1326 = NL + "\t\t";
  protected final String TEXT_1327 = " old";
  protected final String TEXT_1328 = " = ";
  protected final String TEXT_1329 = ";";
  protected final String TEXT_1330 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1331 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1332 = NL + "\t\tboolean old";
  protected final String TEXT_1333 = "ESet = (";
  protected final String TEXT_1334 = " & ";
  protected final String TEXT_1335 = "_ESETFLAG) != 0;";
  protected final String TEXT_1336 = NL + "\t\tboolean old";
  protected final String TEXT_1337 = "ESet = ";
  protected final String TEXT_1338 = "ESet;";
  protected final String TEXT_1339 = NL + "\t\t";
  protected final String TEXT_1340 = " = null;";
  protected final String TEXT_1341 = NL + "\t\t";
  protected final String TEXT_1342 = " &= ~";
  protected final String TEXT_1343 = "_ESETFLAG;";
  protected final String TEXT_1344 = NL + "\t\t";
  protected final String TEXT_1345 = "ESet = false;";
  protected final String TEXT_1346 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1347 = "(this, ";
  protected final String TEXT_1348 = ".UNSET, ";
  protected final String TEXT_1349 = ", ";
  protected final String TEXT_1350 = "isSetChange ? old";
  protected final String TEXT_1351 = " : null";
  protected final String TEXT_1352 = "old";
  protected final String TEXT_1353 = ", null, ";
  protected final String TEXT_1354 = "isSetChange";
  protected final String TEXT_1355 = "old";
  protected final String TEXT_1356 = "ESet";
  protected final String TEXT_1357 = "));";
  protected final String TEXT_1358 = NL + "\t\tif (";
  protected final String TEXT_1359 = ") ";
  protected final String TEXT_1360 = " |= ";
  protected final String TEXT_1361 = "_EFLAG; else ";
  protected final String TEXT_1362 = " &= ~";
  protected final String TEXT_1363 = "_EFLAG;";
  protected final String TEXT_1364 = NL + "\t\t";
  protected final String TEXT_1365 = " = ";
  protected final String TEXT_1366 = " & ~";
  protected final String TEXT_1367 = "_EFLAG | ";
  protected final String TEXT_1368 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1369 = NL + "\t\t";
  protected final String TEXT_1370 = " = ";
  protected final String TEXT_1371 = ";";
  protected final String TEXT_1372 = NL + "\t\t";
  protected final String TEXT_1373 = " &= ~";
  protected final String TEXT_1374 = "_ESETFLAG;";
  protected final String TEXT_1375 = NL + "\t\t";
  protected final String TEXT_1376 = "ESet = false;";
  protected final String TEXT_1377 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1378 = "(this, ";
  protected final String TEXT_1379 = ".UNSET, ";
  protected final String TEXT_1380 = ", ";
  protected final String TEXT_1381 = "isSetChange ? old";
  protected final String TEXT_1382 = " : ";
  protected final String TEXT_1383 = "old";
  protected final String TEXT_1384 = ", ";
  protected final String TEXT_1385 = ", ";
  protected final String TEXT_1386 = "isSetChange";
  protected final String TEXT_1387 = "old";
  protected final String TEXT_1388 = "ESet";
  protected final String TEXT_1389 = "));";
  protected final String TEXT_1390 = NL + "\t\t((";
  protected final String TEXT_1391 = ".Internal)((";
  protected final String TEXT_1392 = ".Internal.Wrapper)get";
  protected final String TEXT_1393 = "()).featureMap()).clear(";
  protected final String TEXT_1394 = ");";
  protected final String TEXT_1395 = NL + "\t\t((";
  protected final String TEXT_1396 = ".Internal)get";
  protected final String TEXT_1397 = "()).clear(";
  protected final String TEXT_1398 = ");";
  protected final String TEXT_1399 = NL + "\t\t";
  protected final String TEXT_1400 = NL + "\t\t";
  protected final String TEXT_1401 = ".";
  protected final String TEXT_1402 = "(this);";
  protected final String TEXT_1403 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1404 = "' ";
  protected final String TEXT_1405 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1406 = NL + "\t}" + NL;
  protected final String TEXT_1407 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1408 = "#";
  protected final String TEXT_1409 = " <em>";
  protected final String TEXT_1410 = "</em>}' ";
  protected final String TEXT_1411 = " is set.";
  protected final String TEXT_1412 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1413 = "</em>' ";
  protected final String TEXT_1414 = " is set.";
  protected final String TEXT_1415 = NL + "\t * @see #unset";
  protected final String TEXT_1416 = "()";
  protected final String TEXT_1417 = NL + "\t * @see #";
  protected final String TEXT_1418 = "()";
  protected final String TEXT_1419 = NL + "\t * @see #set";
  protected final String TEXT_1420 = "(";
  protected final String TEXT_1421 = ")";
  protected final String TEXT_1422 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1423 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1424 = NL + "\t@Override";
  protected final String TEXT_1425 = NL + "\tboolean isSet";
  protected final String TEXT_1426 = "();" + NL;
  protected final String TEXT_1427 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1428 = "_";
  protected final String TEXT_1429 = "()" + NL + "\t{";
  protected final String TEXT_1430 = NL + "\t\treturn eDynamicIsSet(";
  protected final String TEXT_1431 = ", ";
  protected final String TEXT_1432 = ");";
  protected final String TEXT_1433 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1434 = ");";
  protected final String TEXT_1435 = NL + "\t\treturn ";
  protected final String TEXT_1436 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_1437 = NL + "\t\t";
  protected final String TEXT_1438 = " ";
  protected final String TEXT_1439 = " = (";
  protected final String TEXT_1440 = ")eVirtualGet(";
  protected final String TEXT_1441 = ");";
  protected final String TEXT_1442 = NL + "\t\treturn ";
  protected final String TEXT_1443 = " != null && ((";
  protected final String TEXT_1444 = ".Unsettable";
  protected final String TEXT_1445 = ")";
  protected final String TEXT_1446 = ").isSet();";
  protected final String TEXT_1447 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1448 = ");";
  protected final String TEXT_1449 = NL + "\t\treturn (";
  protected final String TEXT_1450 = " & ";
  protected final String TEXT_1451 = "_ESETFLAG) != 0;";
  protected final String TEXT_1452 = NL + "\t\treturn ";
  protected final String TEXT_1453 = "ESet;";
  protected final String TEXT_1454 = NL + "\t\treturn !((";
  protected final String TEXT_1455 = ".Internal)((";
  protected final String TEXT_1456 = ".Internal.Wrapper)get";
  protected final String TEXT_1457 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1458 = ");";
  protected final String TEXT_1459 = NL + "\t\treturn !((";
  protected final String TEXT_1460 = ".Internal)get";
  protected final String TEXT_1461 = "()).isEmpty(";
  protected final String TEXT_1462 = ");";
  protected final String TEXT_1463 = NL + "\t\t";
  protected final String TEXT_1464 = NL + "\t\treturn ";
  protected final String TEXT_1465 = ".";
  protected final String TEXT_1466 = "(this);";
  protected final String TEXT_1467 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1468 = "' ";
  protected final String TEXT_1469 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1470 = NL + "\t}" + NL;
  protected final String TEXT_1471 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1472 = "() <em>";
  protected final String TEXT_1473 = "</em>}' ";
  protected final String TEXT_1474 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1475 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1476 = "_ESUBSETS = ";
  protected final String TEXT_1477 = ";" + NL;
  protected final String TEXT_1478 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1479 = "() <em>";
  protected final String TEXT_1480 = "</em>}' ";
  protected final String TEXT_1481 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1482 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1483 = "_ESUPERSETS = ";
  protected final String TEXT_1484 = ";" + NL;
  protected final String TEXT_1485 = NL + "\t/**";
  protected final String TEXT_1486 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1487 = "}, with the specified ";
  protected final String TEXT_1488 = ", and appends it to the '<em><b>";
  protected final String TEXT_1489 = "</b></em>' ";
  protected final String TEXT_1490 = ".";
  protected final String TEXT_1491 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1492 = "}, with the specified ";
  protected final String TEXT_1493 = ", and sets the '<em><b>";
  protected final String TEXT_1494 = "</b></em>' ";
  protected final String TEXT_1495 = ".";
  protected final String TEXT_1496 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1497 = "} and appends it to the '<em><b>";
  protected final String TEXT_1498 = "</b></em>' ";
  protected final String TEXT_1499 = ".";
  protected final String TEXT_1500 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1501 = "} and sets the '<em><b>";
  protected final String TEXT_1502 = "</b></em>' ";
  protected final String TEXT_1503 = ".";
  protected final String TEXT_1504 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1505 = NL + "\t * @param ";
  protected final String TEXT_1506 = " The ";
  protected final String TEXT_1507 = " for the new {@link ";
  protected final String TEXT_1508 = "}, or <code>null</code>.";
  protected final String TEXT_1509 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1510 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1511 = "}." + NL + "\t * @see #";
  protected final String TEXT_1512 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1513 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1514 = NL + "\t";
  protected final String TEXT_1515 = " create";
  protected final String TEXT_1516 = "(";
  protected final String TEXT_1517 = ", ";
  protected final String TEXT_1518 = " eClass);" + NL;
  protected final String TEXT_1519 = NL + "\t@Override";
  protected final String TEXT_1520 = NL + "\tpublic ";
  protected final String TEXT_1521 = " create";
  protected final String TEXT_1522 = "(";
  protected final String TEXT_1523 = ", ";
  protected final String TEXT_1524 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1525 = " new";
  protected final String TEXT_1526 = " = (";
  protected final String TEXT_1527 = ") create(eClass);";
  protected final String TEXT_1528 = NL + "\t\t";
  protected final String TEXT_1529 = "().add(new";
  protected final String TEXT_1530 = ");";
  protected final String TEXT_1531 = NL + "\t\tset";
  protected final String TEXT_1532 = "(new";
  protected final String TEXT_1533 = ");";
  protected final String TEXT_1534 = NL + "\t\tint ";
  protected final String TEXT_1535 = "ListSize = 0;";
  protected final String TEXT_1536 = NL + "\t\tint ";
  protected final String TEXT_1537 = "Size = ";
  protected final String TEXT_1538 = " == null ? 0 : ";
  protected final String TEXT_1539 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1540 = "Size > ";
  protected final String TEXT_1541 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1542 = "ListSize = ";
  protected final String TEXT_1543 = "Size;";
  protected final String TEXT_1544 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1545 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1546 = ".create";
  protected final String TEXT_1547 = "(";
  protected final String TEXT_1548 = ", ";
  protected final String TEXT_1549 = "i < ";
  protected final String TEXT_1550 = "Size ? (";
  protected final String TEXT_1551 = ") ";
  protected final String TEXT_1552 = ".get(i) : null";
  protected final String TEXT_1553 = ");" + NL + "\t\t}";
  protected final String TEXT_1554 = NL + "\t\tnew";
  protected final String TEXT_1555 = ".create";
  protected final String TEXT_1556 = "(";
  protected final String TEXT_1557 = ", ";
  protected final String TEXT_1558 = ");";
  protected final String TEXT_1559 = NL + "\t\tif (";
  protected final String TEXT_1560 = " != null)";
  protected final String TEXT_1561 = NL + "\t\t\tnew";
  protected final String TEXT_1562 = ".";
  protected final String TEXT_1563 = "().addAll(";
  protected final String TEXT_1564 = ");";
  protected final String TEXT_1565 = NL + "\t\t\tnew";
  protected final String TEXT_1566 = ".set";
  protected final String TEXT_1567 = "(";
  protected final String TEXT_1568 = ");";
  protected final String TEXT_1569 = NL + "\t\treturn new";
  protected final String TEXT_1570 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1571 = NL + "\t/**";
  protected final String TEXT_1572 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1573 = "}, with the specified ";
  protected final String TEXT_1574 = ", and appends it to the '<em><b>";
  protected final String TEXT_1575 = "</b></em>' ";
  protected final String TEXT_1576 = ".";
  protected final String TEXT_1577 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1578 = "},with the specified ";
  protected final String TEXT_1579 = ", and sets the '<em><b>";
  protected final String TEXT_1580 = "</b></em>' ";
  protected final String TEXT_1581 = ".";
  protected final String TEXT_1582 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1583 = "} and appends it to the '<em><b>";
  protected final String TEXT_1584 = "</b></em>' ";
  protected final String TEXT_1585 = ".";
  protected final String TEXT_1586 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1587 = "} and sets the '<em><b>";
  protected final String TEXT_1588 = "</b></em>' ";
  protected final String TEXT_1589 = ".";
  protected final String TEXT_1590 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1591 = NL + "\t * @param ";
  protected final String TEXT_1592 = " The ";
  protected final String TEXT_1593 = " for the new {@link ";
  protected final String TEXT_1594 = "}, or <code>null</code>.";
  protected final String TEXT_1595 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1596 = "}." + NL + "\t * @see #";
  protected final String TEXT_1597 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1598 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1599 = NL + "\t";
  protected final String TEXT_1600 = " create";
  protected final String TEXT_1601 = "(";
  protected final String TEXT_1602 = ");" + NL;
  protected final String TEXT_1603 = NL + "\t@Override";
  protected final String TEXT_1604 = NL + "\tpublic ";
  protected final String TEXT_1605 = " create";
  protected final String TEXT_1606 = "(";
  protected final String TEXT_1607 = ")" + NL + "\t{";
  protected final String TEXT_1608 = NL + "\t\treturn create";
  protected final String TEXT_1609 = "(";
  protected final String TEXT_1610 = ", ";
  protected final String TEXT_1611 = ");";
  protected final String TEXT_1612 = NL + "\t\t";
  protected final String TEXT_1613 = " new";
  protected final String TEXT_1614 = " = (";
  protected final String TEXT_1615 = ") create(";
  protected final String TEXT_1616 = ");";
  protected final String TEXT_1617 = NL + "\t\t";
  protected final String TEXT_1618 = "().add(new";
  protected final String TEXT_1619 = ");";
  protected final String TEXT_1620 = NL + "\t\tset";
  protected final String TEXT_1621 = "(new";
  protected final String TEXT_1622 = ");";
  protected final String TEXT_1623 = NL + "\t\tint ";
  protected final String TEXT_1624 = "ListSize = 0;";
  protected final String TEXT_1625 = NL + "\t\tint ";
  protected final String TEXT_1626 = "Size = ";
  protected final String TEXT_1627 = " == null ? 0 : ";
  protected final String TEXT_1628 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1629 = "Size > ";
  protected final String TEXT_1630 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1631 = "ListSize = ";
  protected final String TEXT_1632 = "Size;";
  protected final String TEXT_1633 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1634 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1635 = ".create";
  protected final String TEXT_1636 = "(";
  protected final String TEXT_1637 = ", ";
  protected final String TEXT_1638 = "i < ";
  protected final String TEXT_1639 = "Size ? (";
  protected final String TEXT_1640 = ") ";
  protected final String TEXT_1641 = ".get(i) : null";
  protected final String TEXT_1642 = ");" + NL + "\t\t}";
  protected final String TEXT_1643 = NL + "\t\tnew";
  protected final String TEXT_1644 = ".create";
  protected final String TEXT_1645 = "(";
  protected final String TEXT_1646 = ", ";
  protected final String TEXT_1647 = ");";
  protected final String TEXT_1648 = NL + "\t\tif (";
  protected final String TEXT_1649 = " != null)";
  protected final String TEXT_1650 = NL + "\t\t\tnew";
  protected final String TEXT_1651 = ".";
  protected final String TEXT_1652 = "().addAll(";
  protected final String TEXT_1653 = ");";
  protected final String TEXT_1654 = NL + "\t\t\tnew";
  protected final String TEXT_1655 = ".set";
  protected final String TEXT_1656 = "(";
  protected final String TEXT_1657 = ");";
  protected final String TEXT_1658 = NL + "\t\treturn new";
  protected final String TEXT_1659 = ";";
  protected final String TEXT_1660 = NL + "\t}" + NL;
  protected final String TEXT_1661 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1662 = "} with the specified ";
  protected final String TEXT_1663 = " from the '<em><b>";
  protected final String TEXT_1664 = "</b></em>' ";
  protected final String TEXT_1665 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1666 = NL + "\t * @param ";
  protected final String TEXT_1667 = " The ";
  protected final String TEXT_1668 = " of the {@link ";
  protected final String TEXT_1669 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1670 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1671 = "} with the specified ";
  protected final String TEXT_1672 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1673 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1674 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1675 = NL + "\t";
  protected final String TEXT_1676 = " get";
  protected final String TEXT_1677 = "(";
  protected final String TEXT_1678 = ");" + NL;
  protected final String TEXT_1679 = NL + "\t@Override";
  protected final String TEXT_1680 = NL + "\tpublic ";
  protected final String TEXT_1681 = " get";
  protected final String TEXT_1682 = "(";
  protected final String TEXT_1683 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1684 = "(";
  protected final String TEXT_1685 = ", false";
  protected final String TEXT_1686 = ", null";
  protected final String TEXT_1687 = ", false";
  protected final String TEXT_1688 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1689 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1690 = "} with the specified ";
  protected final String TEXT_1691 = " from the '<em><b>";
  protected final String TEXT_1692 = "</b></em>' ";
  protected final String TEXT_1693 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1694 = NL + "\t * @param ";
  protected final String TEXT_1695 = " The ";
  protected final String TEXT_1696 = " of the {@link ";
  protected final String TEXT_1697 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1698 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1699 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1700 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1701 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1702 = "} on demand if not found.";
  protected final String TEXT_1703 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1704 = "} with the specified ";
  protected final String TEXT_1705 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1706 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1707 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1708 = NL + "\t";
  protected final String TEXT_1709 = " get";
  protected final String TEXT_1710 = "(";
  protected final String TEXT_1711 = ", boolean ignoreCase";
  protected final String TEXT_1712 = ", ";
  protected final String TEXT_1713 = " eClass";
  protected final String TEXT_1714 = ", boolean createOnDemand";
  protected final String TEXT_1715 = ");" + NL;
  protected final String TEXT_1716 = NL + "\t@Override";
  protected final String TEXT_1717 = NL + "\tpublic ";
  protected final String TEXT_1718 = " get";
  protected final String TEXT_1719 = "(";
  protected final String TEXT_1720 = ", boolean ignoreCase";
  protected final String TEXT_1721 = ", ";
  protected final String TEXT_1722 = " eClass";
  protected final String TEXT_1723 = ", boolean createOnDemand";
  protected final String TEXT_1724 = ")" + NL + "\t{";
  protected final String TEXT_1725 = NL + "\t\t";
  protected final String TEXT_1726 = "Loop: for (";
  protected final String TEXT_1727 = " ";
  protected final String TEXT_1728 = " : ";
  protected final String TEXT_1729 = "())" + NL + "\t\t{";
  protected final String TEXT_1730 = NL + "\t\t";
  protected final String TEXT_1731 = "Loop: for (";
  protected final String TEXT_1732 = " i = ";
  protected final String TEXT_1733 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1734 = " ";
  protected final String TEXT_1735 = " = (";
  protected final String TEXT_1736 = ") i.next();";
  protected final String TEXT_1737 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1738 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1739 = "Loop;";
  protected final String TEXT_1740 = NL + "\t\t\t";
  protected final String TEXT_1741 = " ";
  protected final String TEXT_1742 = "List = ";
  protected final String TEXT_1743 = ".";
  protected final String TEXT_1744 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1745 = "ListSize = ";
  protected final String TEXT_1746 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1747 = " || (";
  protected final String TEXT_1748 = " != null && ";
  protected final String TEXT_1749 = ".size() != ";
  protected final String TEXT_1750 = "ListSize";
  protected final String TEXT_1751 = ")";
  protected final String TEXT_1752 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1753 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1754 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1755 = " ";
  protected final String TEXT_1756 = " = ";
  protected final String TEXT_1757 = "(";
  protected final String TEXT_1758 = ") ";
  protected final String TEXT_1759 = "List.get(j);";
  protected final String TEXT_1760 = NL + "\t\t\t\tif (";
  protected final String TEXT_1761 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1762 = "(";
  protected final String TEXT_1763 = ")";
  protected final String TEXT_1764 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1765 = ".";
  protected final String TEXT_1766 = "()) : ";
  protected final String TEXT_1767 = ".get(j).equals(";
  protected final String TEXT_1768 = ".";
  protected final String TEXT_1769 = "())))";
  protected final String TEXT_1770 = NL + "\t\t\t\tif (";
  protected final String TEXT_1771 = " != null && !";
  protected final String TEXT_1772 = ".get(j).equals(";
  protected final String TEXT_1773 = ".";
  protected final String TEXT_1774 = "()))";
  protected final String TEXT_1775 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1776 = "Loop;";
  protected final String TEXT_1777 = NL + "\t\t\t}";
  protected final String TEXT_1778 = NL + "\t\t\t";
  protected final String TEXT_1779 = " ";
  protected final String TEXT_1780 = " = ";
  protected final String TEXT_1781 = ".";
  protected final String TEXT_1782 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1783 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1784 = "Loop;";
  protected final String TEXT_1785 = NL + "\t\t\tif (";
  protected final String TEXT_1786 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1787 = ".equalsIgnoreCase(";
  protected final String TEXT_1788 = ".";
  protected final String TEXT_1789 = "()) : ";
  protected final String TEXT_1790 = ".equals(";
  protected final String TEXT_1791 = ".";
  protected final String TEXT_1792 = "())))";
  protected final String TEXT_1793 = NL + "\t\t\tif (";
  protected final String TEXT_1794 = " != null && !";
  protected final String TEXT_1795 = ".equals(";
  protected final String TEXT_1796 = ".";
  protected final String TEXT_1797 = "()))";
  protected final String TEXT_1798 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1799 = "Loop;";
  protected final String TEXT_1800 = NL + "\t\t\tif (";
  protected final String TEXT_1801 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1802 = ".equalsIgnoreCase(";
  protected final String TEXT_1803 = ".";
  protected final String TEXT_1804 = "()) : ";
  protected final String TEXT_1805 = ".equals(";
  protected final String TEXT_1806 = ".";
  protected final String TEXT_1807 = "())))";
  protected final String TEXT_1808 = NL + "\t\t\tif (";
  protected final String TEXT_1809 = " != null && !";
  protected final String TEXT_1810 = ".equals(";
  protected final String TEXT_1811 = ".";
  protected final String TEXT_1812 = "()))";
  protected final String TEXT_1813 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1814 = "Loop;";
  protected final String TEXT_1815 = NL + "\t\t\treturn ";
  protected final String TEXT_1816 = ";" + NL + "\t\t}";
  protected final String TEXT_1817 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1818 = " && eClass != null";
  protected final String TEXT_1819 = " ? create";
  protected final String TEXT_1820 = "(";
  protected final String TEXT_1821 = ", eClass";
  protected final String TEXT_1822 = ") : null;";
  protected final String TEXT_1823 = NL + "\t\treturn null;";
  protected final String TEXT_1824 = NL + "\t}" + NL;
  protected final String TEXT_1825 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1826 = "()" + NL + "\t{";
  protected final String TEXT_1827 = NL + "  \t\treturn false;";
  protected final String TEXT_1828 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1829 = ");";
  protected final String TEXT_1830 = NL + "\t\treturn !((";
  protected final String TEXT_1831 = ".Internal.Wrapper)";
  protected final String TEXT_1832 = "()).featureMap().isEmpty();";
  protected final String TEXT_1833 = NL + "\t\treturn ";
  protected final String TEXT_1834 = " != null && !";
  protected final String TEXT_1835 = ".featureMap().isEmpty();";
  protected final String TEXT_1836 = NL + "\t\treturn ";
  protected final String TEXT_1837 = " != null && !";
  protected final String TEXT_1838 = ".isEmpty();";
  protected final String TEXT_1839 = NL + "\t\t";
  protected final String TEXT_1840 = " ";
  protected final String TEXT_1841 = " = (";
  protected final String TEXT_1842 = ")eVirtualGet(";
  protected final String TEXT_1843 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1844 = " != null && !";
  protected final String TEXT_1845 = ".isEmpty();";
  protected final String TEXT_1846 = NL + "\t\treturn !";
  protected final String TEXT_1847 = "().isEmpty();";
  protected final String TEXT_1848 = NL + "\t\treturn ";
  protected final String TEXT_1849 = " != null;";
  protected final String TEXT_1850 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1851 = ") != null;";
  protected final String TEXT_1852 = NL + "\t\treturn basicGet";
  protected final String TEXT_1853 = "() != null;";
  protected final String TEXT_1854 = NL + "\t\treturn ";
  protected final String TEXT_1855 = " != null;";
  protected final String TEXT_1856 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1857 = ") != null;";
  protected final String TEXT_1858 = NL + "\t\treturn ";
  protected final String TEXT_1859 = "() != null;";
  protected final String TEXT_1860 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1861 = " & ";
  protected final String TEXT_1862 = "_EFLAG) != 0) != ";
  protected final String TEXT_1863 = ";";
  protected final String TEXT_1864 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1865 = " & ";
  protected final String TEXT_1866 = "_EFLAG) != ";
  protected final String TEXT_1867 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1868 = NL + "\t\treturn ";
  protected final String TEXT_1869 = " != ";
  protected final String TEXT_1870 = ";";
  protected final String TEXT_1871 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1872 = ", ";
  protected final String TEXT_1873 = ") != ";
  protected final String TEXT_1874 = ";";
  protected final String TEXT_1875 = NL + "\t\treturn ";
  protected final String TEXT_1876 = "() != ";
  protected final String TEXT_1877 = ";";
  protected final String TEXT_1878 = NL + "\t\treturn ";
  protected final String TEXT_1879 = " == null ? ";
  protected final String TEXT_1880 = " != null : !";
  protected final String TEXT_1881 = ".equals(";
  protected final String TEXT_1882 = ");";
  protected final String TEXT_1883 = NL + "\t\t";
  protected final String TEXT_1884 = " ";
  protected final String TEXT_1885 = " = (";
  protected final String TEXT_1886 = ")eVirtualGet(";
  protected final String TEXT_1887 = ", ";
  protected final String TEXT_1888 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1889 = " == null ? ";
  protected final String TEXT_1890 = " != null : !";
  protected final String TEXT_1891 = ".equals(";
  protected final String TEXT_1892 = ");";
  protected final String TEXT_1893 = NL + "\t\treturn ";
  protected final String TEXT_1894 = " == null ? ";
  protected final String TEXT_1895 = "() != null : !";
  protected final String TEXT_1896 = ".equals(";
  protected final String TEXT_1897 = "());";
  protected final String TEXT_1898 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1899 = ");";
  protected final String TEXT_1900 = NL + "\t\t";
  protected final String TEXT_1901 = " ";
  protected final String TEXT_1902 = " = (";
  protected final String TEXT_1903 = ")eVirtualGet(";
  protected final String TEXT_1904 = ");";
  protected final String TEXT_1905 = NL + "\t\treturn ";
  protected final String TEXT_1906 = " != null && ((";
  protected final String TEXT_1907 = ".Unsettable";
  protected final String TEXT_1908 = ")";
  protected final String TEXT_1909 = ").isSet();";
  protected final String TEXT_1910 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1911 = ");";
  protected final String TEXT_1912 = NL + "\t\treturn (";
  protected final String TEXT_1913 = " & ";
  protected final String TEXT_1914 = "_ESETFLAG) != 0;";
  protected final String TEXT_1915 = NL + "\t\treturn ";
  protected final String TEXT_1916 = "ESet;";
  protected final String TEXT_1917 = NL + "\t\treturn !((";
  protected final String TEXT_1918 = ".Internal)((";
  protected final String TEXT_1919 = ".Internal.Wrapper)get";
  protected final String TEXT_1920 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1921 = ");";
  protected final String TEXT_1922 = NL + "\t\treturn !((";
  protected final String TEXT_1923 = ".Internal)get";
  protected final String TEXT_1924 = "()).isEmpty(";
  protected final String TEXT_1925 = ");";
  protected final String TEXT_1926 = NL + "\t\treturn ";
  protected final String TEXT_1927 = ".";
  protected final String TEXT_1928 = "(this);";
  protected final String TEXT_1929 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1930 = "' ";
  protected final String TEXT_1931 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1932 = NL + "\t}" + NL;
  protected final String TEXT_1933 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_1934 = "(";
  protected final String TEXT_1935 = ") <em>";
  protected final String TEXT_1936 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1937 = "(";
  protected final String TEXT_1938 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1939 = " ";
  protected final String TEXT_1940 = "__EOCL_EXP = \"";
  protected final String TEXT_1941 = "\";";
  protected final String TEXT_1942 = NL;
  protected final String TEXT_1943 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_1944 = "(";
  protected final String TEXT_1945 = ") <em>";
  protected final String TEXT_1946 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1947 = "(";
  protected final String TEXT_1948 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1949 = " ";
  protected final String TEXT_1950 = "__EOCL_INV;" + NL;
  protected final String TEXT_1951 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_1952 = "(";
  protected final String TEXT_1953 = ") <em>";
  protected final String TEXT_1954 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1955 = "(";
  protected final String TEXT_1956 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1957 = "<";
  protected final String TEXT_1958 = ">";
  protected final String TEXT_1959 = " ";
  protected final String TEXT_1960 = "__EOCL_QRY;" + NL;
  protected final String TEXT_1961 = NL + "\t/**" + NL + "\t * The cached validation expression for the '{@link #";
  protected final String TEXT_1962 = "(";
  protected final String TEXT_1963 = ") <em>";
  protected final String TEXT_1964 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1965 = "(";
  protected final String TEXT_1966 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1967 = " ";
  protected final String TEXT_1968 = "__EEXPRESSION = \"";
  protected final String TEXT_1969 = "\";";
  protected final String TEXT_1970 = NL;
  protected final String TEXT_1971 = NL + "\t/**" + NL + "\t * The cached invocation delegate for the '{@link #";
  protected final String TEXT_1972 = "(";
  protected final String TEXT_1973 = ") <em>";
  protected final String TEXT_1974 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1975 = "(";
  protected final String TEXT_1976 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1977 = ".Internal.InvocationDelegate ";
  protected final String TEXT_1978 = "__EINVOCATION_DELEGATE = ((";
  protected final String TEXT_1979 = ".Internal)";
  protected final String TEXT_1980 = ").getInvocationDelegate();" + NL;
  protected final String TEXT_1981 = NL + "\t/**";
  protected final String TEXT_1982 = NL + "\t * <p>" + NL + "\t * This operation redefines the following operations:" + NL + "\t * <ul>";
  protected final String TEXT_1983 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_1984 = "#";
  protected final String TEXT_1985 = "(";
  protected final String TEXT_1986 = ") <em>";
  protected final String TEXT_1987 = "</em>}' </li>";
  protected final String TEXT_1988 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_1989 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1990 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1991 = NL + "\t * ";
  protected final String TEXT_1992 = NL + "\t * @param ";
  protected final String TEXT_1993 = NL + "\t *   ";
  protected final String TEXT_1994 = NL + "\t * @param ";
  protected final String TEXT_1995 = " ";
  protected final String TEXT_1996 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1997 = NL + "\t * @model ";
  protected final String TEXT_1998 = NL + "\t *        ";
  protected final String TEXT_1999 = NL + "\t * @model";
  protected final String TEXT_2000 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2001 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2002 = NL + "\t@Override";
  protected final String TEXT_2003 = NL + "\t";
  protected final String TEXT_2004 = " ";
  protected final String TEXT_2005 = "(";
  protected final String TEXT_2006 = ")";
  protected final String TEXT_2007 = ";" + NL;
  protected final String TEXT_2008 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2009 = NL + "\tpublic ";
  protected final String TEXT_2010 = " ";
  protected final String TEXT_2011 = "(";
  protected final String TEXT_2012 = ")";
  protected final String TEXT_2013 = NL + "\t{";
  protected final String TEXT_2014 = NL + "\t\t";
  protected final String TEXT_2015 = NL + "\t\treturn" + NL + "\t\t\t";
  protected final String TEXT_2016 = ".validate" + NL + "\t\t\t\t(";
  protected final String TEXT_2017 = "," + NL + "\t\t\t\t this," + NL + "\t\t\t\t ";
  protected final String TEXT_2018 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_2019 = "," + NL + "\t\t\t\t \"";
  protected final String TEXT_2020 = "\",";
  protected final String TEXT_2021 = NL + "\t\t\t\t ";
  protected final String TEXT_2022 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_2023 = "__EEXPRESSION," + NL + "\t\t\t\t ";
  protected final String TEXT_2024 = ".ERROR," + NL + "\t\t\t\t ";
  protected final String TEXT_2025 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t ";
  protected final String TEXT_2026 = ".";
  protected final String TEXT_2027 = ");";
  protected final String TEXT_2028 = NL + "\t\treturn ";
  protected final String TEXT_2029 = ".";
  protected final String TEXT_2030 = "(this, ";
  protected final String TEXT_2031 = ", ";
  protected final String TEXT_2032 = ");";
  protected final String TEXT_2033 = NL + "\t\tif (";
  protected final String TEXT_2034 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2035 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_2036 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2037 = " = helper.createInvariant(";
  protected final String TEXT_2038 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2039 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_2040 = ").check(this))";
  protected final String TEXT_2041 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_2042 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_2043 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_2044 = NL + "\t\t\t\t";
  protected final String TEXT_2045 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_2046 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_2047 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2048 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2049 = ".";
  protected final String TEXT_2050 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2051 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_2052 = "\", ";
  protected final String TEXT_2053 = ".getObjectLabel(this, ";
  protected final String TEXT_2054 = ") }),";
  protected final String TEXT_2055 = NL + "\t\t\t\t\t\t new Object [] { this }));";
  protected final String TEXT_2056 = NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_2057 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_2058 = NL + "\t\t\t";
  protected final String TEXT_2059 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_2060 = "new ";
  protected final String TEXT_2061 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_2062 = ", ";
  protected final String TEXT_2063 = ")";
  protected final String TEXT_2064 = "null";
  protected final String TEXT_2065 = ");";
  protected final String TEXT_2066 = NL + "\t\t\treturn ";
  protected final String TEXT_2067 = "(";
  protected final String TEXT_2068 = "(";
  protected final String TEXT_2069 = ")";
  protected final String TEXT_2070 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_2071 = "new ";
  protected final String TEXT_2072 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_2073 = ", ";
  protected final String TEXT_2074 = ")";
  protected final String TEXT_2075 = "null";
  protected final String TEXT_2076 = ")";
  protected final String TEXT_2077 = ").";
  protected final String TEXT_2078 = "()";
  protected final String TEXT_2079 = ";";
  protected final String TEXT_2080 = NL + "\t\t}" + NL + "\t\tcatch (";
  protected final String TEXT_2081 = " ite)" + NL + "\t\t{" + NL + "\t\t\tthrow new ";
  protected final String TEXT_2082 = "(ite);" + NL + "\t\t}";
  protected final String TEXT_2083 = NL + "\t\t";
  protected final String TEXT_2084 = ".";
  protected final String TEXT_2085 = "(this";
  protected final String TEXT_2086 = ", ";
  protected final String TEXT_2087 = ");";
  protected final String TEXT_2088 = NL + "\t\t";
  protected final String TEXT_2089 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_2090 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2091 = NL + "\t\t\t";
  protected final String TEXT_2092 = " result = (";
  protected final String TEXT_2093 = ") cache.get(";
  protected final String TEXT_2094 = "eResource(), ";
  protected final String TEXT_2095 = "this, ";
  protected final String TEXT_2096 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_2097 = "eResource(), ";
  protected final String TEXT_2098 = "this, ";
  protected final String TEXT_2099 = ", result = ";
  protected final String TEXT_2100 = "new ";
  protected final String TEXT_2101 = "(";
  protected final String TEXT_2102 = ".";
  protected final String TEXT_2103 = "(this";
  protected final String TEXT_2104 = ", ";
  protected final String TEXT_2105 = ")";
  protected final String TEXT_2106 = ")";
  protected final String TEXT_2107 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_2108 = ".";
  protected final String TEXT_2109 = "()";
  protected final String TEXT_2110 = ";" + NL + "\t\t}";
  protected final String TEXT_2111 = NL + "\t\treturn ";
  protected final String TEXT_2112 = ".";
  protected final String TEXT_2113 = "(this";
  protected final String TEXT_2114 = ", ";
  protected final String TEXT_2115 = ");";
  protected final String TEXT_2116 = NL + "\t\tif (";
  protected final String TEXT_2117 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2118 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_2119 = ", ";
  protected final String TEXT_2120 = ".getEAllOperations().get(";
  protected final String TEXT_2121 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2122 = " = helper.createQuery(";
  protected final String TEXT_2123 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2124 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_2125 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_2126 = ");";
  protected final String TEXT_2127 = NL + "\t\t";
  protected final String TEXT_2128 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_2129 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_2130 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_2131 = "\", ";
  protected final String TEXT_2132 = ");";
  protected final String TEXT_2133 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2134 = NL + "\t\t";
  protected final String TEXT_2135 = "<";
  protected final String TEXT_2136 = "> result = (";
  protected final String TEXT_2137 = "<";
  protected final String TEXT_2138 = ">) query.evaluate(this);" + NL + "\t\treturn new ";
  protected final String TEXT_2139 = ".UnmodifiableEList<";
  protected final String TEXT_2140 = ">(result.size(), result.toArray());";
  protected final String TEXT_2141 = NL + "\t\treturn ((";
  protected final String TEXT_2142 = ") query.evaluate(this)).";
  protected final String TEXT_2143 = "();";
  protected final String TEXT_2144 = NL + "\t\treturn (";
  protected final String TEXT_2145 = ") query.evaluate(this);";
  protected final String TEXT_2146 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2147 = NL + "\t}" + NL;
  protected final String TEXT_2148 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2149 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2150 = NL + "\t@Override";
  protected final String TEXT_2151 = NL + "\tpublic ";
  protected final String TEXT_2152 = " eInverseAdd(";
  protected final String TEXT_2153 = " otherEnd, int featureID, ";
  protected final String TEXT_2154 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2155 = ")" + NL + "\t\t{";
  protected final String TEXT_2156 = NL + "\t\t\tcase ";
  protected final String TEXT_2157 = ":";
  protected final String TEXT_2158 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2159 = "(";
  protected final String TEXT_2160 = ".InternalMapView";
  protected final String TEXT_2161 = ")";
  protected final String TEXT_2162 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2163 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2164 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2165 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2166 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2167 = "((";
  protected final String TEXT_2168 = ")otherEnd, msgs);";
  protected final String TEXT_2169 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_2170 = ", msgs);";
  protected final String TEXT_2171 = NL + "\t\t\t\t";
  protected final String TEXT_2172 = " ";
  protected final String TEXT_2173 = " = (";
  protected final String TEXT_2174 = ")eVirtualGet(";
  protected final String TEXT_2175 = ");";
  protected final String TEXT_2176 = NL + "\t\t\t\t";
  protected final String TEXT_2177 = " ";
  protected final String TEXT_2178 = " = ";
  protected final String TEXT_2179 = "basicGet";
  protected final String TEXT_2180 = "();";
  protected final String TEXT_2181 = NL + "\t\t\t\tif (";
  protected final String TEXT_2182 = " != null)";
  protected final String TEXT_2183 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2184 = ")";
  protected final String TEXT_2185 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_2186 = ", null, msgs);";
  protected final String TEXT_2187 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2188 = ")";
  protected final String TEXT_2189 = ").eInverseRemove(this, ";
  protected final String TEXT_2190 = ", ";
  protected final String TEXT_2191 = ".class, msgs);";
  protected final String TEXT_2192 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2193 = "((";
  protected final String TEXT_2194 = ")otherEnd, msgs);";
  protected final String TEXT_2195 = NL + "\t\t}";
  protected final String TEXT_2196 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2197 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2198 = NL + "\t}" + NL;
  protected final String TEXT_2199 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2200 = NL + "\t@Override";
  protected final String TEXT_2201 = NL + "\tpublic ";
  protected final String TEXT_2202 = " eInverseRemove(";
  protected final String TEXT_2203 = " otherEnd, int featureID, ";
  protected final String TEXT_2204 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2205 = ")" + NL + "\t\t{";
  protected final String TEXT_2206 = NL + "\t\t\tcase ";
  protected final String TEXT_2207 = ":";
  protected final String TEXT_2208 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2209 = ")((";
  protected final String TEXT_2210 = ".InternalMapView";
  protected final String TEXT_2211 = ")";
  protected final String TEXT_2212 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2213 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2214 = ")((";
  protected final String TEXT_2215 = ".Internal.Wrapper)";
  protected final String TEXT_2216 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2217 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2218 = ")";
  protected final String TEXT_2219 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2220 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_2221 = ", msgs);";
  protected final String TEXT_2222 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_2223 = "(msgs);";
  protected final String TEXT_2224 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2225 = "(null, msgs);";
  protected final String TEXT_2226 = NL + "\t\t}";
  protected final String TEXT_2227 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2228 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2229 = NL + "\t}" + NL;
  protected final String TEXT_2230 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2231 = NL + "\t@Override";
  protected final String TEXT_2232 = NL + "\tpublic ";
  protected final String TEXT_2233 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_2234 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID()";
  protected final String TEXT_2235 = ")" + NL + "\t\t{";
  protected final String TEXT_2236 = NL + "\t\t\tcase ";
  protected final String TEXT_2237 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_2238 = ", ";
  protected final String TEXT_2239 = ".class, msgs);";
  protected final String TEXT_2240 = NL + "\t\t}";
  protected final String TEXT_2241 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_2242 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2243 = NL + "\t}" + NL;
  protected final String TEXT_2244 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2245 = NL + "\t@Override";
  protected final String TEXT_2246 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2247 = ")" + NL + "\t\t{";
  protected final String TEXT_2248 = NL + "\t\t\tcase ";
  protected final String TEXT_2249 = ":";
  protected final String TEXT_2250 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2251 = "();";
  protected final String TEXT_2252 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2253 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_2254 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_2255 = "(";
  protected final String TEXT_2256 = "());";
  protected final String TEXT_2257 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_2258 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2259 = "();";
  protected final String TEXT_2260 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2261 = ".InternalMapView";
  protected final String TEXT_2262 = ")";
  protected final String TEXT_2263 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2264 = "();";
  protected final String TEXT_2265 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2266 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2267 = "().map();";
  protected final String TEXT_2268 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2269 = ".Internal.Wrapper)";
  protected final String TEXT_2270 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2271 = "();";
  protected final String TEXT_2272 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2273 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_2274 = ".Internal)";
  protected final String TEXT_2275 = "()).getWrapper();";
  protected final String TEXT_2276 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2277 = "();";
  protected final String TEXT_2278 = NL + "\t\t}";
  protected final String TEXT_2279 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_2280 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_2281 = NL + "\t}" + NL;
  protected final String TEXT_2282 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2283 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2284 = NL + "\t@Override";
  protected final String TEXT_2285 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2286 = ")" + NL + "\t\t{";
  protected final String TEXT_2287 = NL + "\t\t\tcase ";
  protected final String TEXT_2288 = ":";
  protected final String TEXT_2289 = NL + "\t\t\t\t((";
  protected final String TEXT_2290 = ".Internal)((";
  protected final String TEXT_2291 = ".Internal.Wrapper)";
  protected final String TEXT_2292 = "()).featureMap()).set(newValue);";
  protected final String TEXT_2293 = NL + "\t\t\t\t((";
  protected final String TEXT_2294 = ".Internal)";
  protected final String TEXT_2295 = "()).set(newValue);";
  protected final String TEXT_2296 = NL + "\t\t\t\t((";
  protected final String TEXT_2297 = ".Setting)((";
  protected final String TEXT_2298 = ".InternalMapView";
  protected final String TEXT_2299 = ")";
  protected final String TEXT_2300 = "()).eMap()).set(newValue);";
  protected final String TEXT_2301 = NL + "\t\t\t\t((";
  protected final String TEXT_2302 = ".Setting)";
  protected final String TEXT_2303 = "()).set(newValue);";
  protected final String TEXT_2304 = NL + "\t\t\t\t";
  protected final String TEXT_2305 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_2306 = "().addAll((";
  protected final String TEXT_2307 = "<? extends ";
  protected final String TEXT_2308 = ">";
  protected final String TEXT_2309 = ")newValue);";
  protected final String TEXT_2310 = NL + "\t\t\t\tset";
  protected final String TEXT_2311 = "(((";
  protected final String TEXT_2312 = ")newValue).";
  protected final String TEXT_2313 = "());";
  protected final String TEXT_2314 = NL + "\t\t\t\tset";
  protected final String TEXT_2315 = "(";
  protected final String TEXT_2316 = "(";
  protected final String TEXT_2317 = ")";
  protected final String TEXT_2318 = "newValue);";
  protected final String TEXT_2319 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2320 = NL + "\t\t}";
  protected final String TEXT_2321 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_2322 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_2323 = NL + "\t}" + NL;
  protected final String TEXT_2324 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2325 = NL + "\t@Override";
  protected final String TEXT_2326 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2327 = ")" + NL + "\t\t{";
  protected final String TEXT_2328 = NL + "\t\t\tcase ";
  protected final String TEXT_2329 = ":";
  protected final String TEXT_2330 = NL + "\t\t\t\t((";
  protected final String TEXT_2331 = ".Internal.Wrapper)";
  protected final String TEXT_2332 = "()).featureMap().clear();";
  protected final String TEXT_2333 = NL + "\t\t\t\t";
  protected final String TEXT_2334 = "().clear();";
  protected final String TEXT_2335 = NL + "\t\t\t\tunset";
  protected final String TEXT_2336 = "();";
  protected final String TEXT_2337 = NL + "\t\t\t\tset";
  protected final String TEXT_2338 = "((";
  protected final String TEXT_2339 = ")null);";
  protected final String TEXT_2340 = NL + "\t\t\t\t";
  protected final String TEXT_2341 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_2342 = NL + "\t\t\t\tset";
  protected final String TEXT_2343 = "(";
  protected final String TEXT_2344 = ");";
  protected final String TEXT_2345 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2346 = NL + "\t\t}";
  protected final String TEXT_2347 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_2348 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_2349 = NL + "\t}" + NL;
  protected final String TEXT_2350 = NL;
  protected final String TEXT_2351 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2352 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2353 = NL + "\t@Override";
  protected final String TEXT_2354 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_2355 = NL + "\t\t\tcase ";
  protected final String TEXT_2356 = ":";
  protected final String TEXT_2357 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2358 = "();";
  protected final String TEXT_2359 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2360 = "();";
  protected final String TEXT_2361 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2362 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_2363 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_2364 = ".Internal.Wrapper)";
  protected final String TEXT_2365 = "()).featureMap().isEmpty();";
  protected final String TEXT_2366 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2367 = " != null && !";
  protected final String TEXT_2368 = ".featureMap().isEmpty();";
  protected final String TEXT_2369 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2370 = " != null && !";
  protected final String TEXT_2371 = ".isEmpty();";
  protected final String TEXT_2372 = NL + "\t\t\t\t";
  protected final String TEXT_2373 = " ";
  protected final String TEXT_2374 = " = (";
  protected final String TEXT_2375 = ")eVirtualGet(";
  protected final String TEXT_2376 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2377 = " != null && !";
  protected final String TEXT_2378 = ".isEmpty();";
  protected final String TEXT_2379 = NL + "\t\t\t\treturn !";
  protected final String TEXT_2380 = "().isEmpty();";
  protected final String TEXT_2381 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2382 = "();";
  protected final String TEXT_2383 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2384 = " != null;";
  protected final String TEXT_2385 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2386 = ") != null;";
  protected final String TEXT_2387 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2388 = "() != null;";
  protected final String TEXT_2389 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2390 = " != null;";
  protected final String TEXT_2391 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2392 = ") != null;";
  protected final String TEXT_2393 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2394 = "() != null;";
  protected final String TEXT_2395 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2396 = " & ";
  protected final String TEXT_2397 = "_EFLAG) != 0) != ";
  protected final String TEXT_2398 = ";";
  protected final String TEXT_2399 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2400 = " & ";
  protected final String TEXT_2401 = "_EFLAG) != ";
  protected final String TEXT_2402 = "_EFLAG_DEFAULT;";
  protected final String TEXT_2403 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2404 = " != ";
  protected final String TEXT_2405 = ";";
  protected final String TEXT_2406 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2407 = ", ";
  protected final String TEXT_2408 = ") != ";
  protected final String TEXT_2409 = ";";
  protected final String TEXT_2410 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2411 = "() != ";
  protected final String TEXT_2412 = ";";
  protected final String TEXT_2413 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2414 = " == null ? ";
  protected final String TEXT_2415 = " != null : !";
  protected final String TEXT_2416 = ".equals(";
  protected final String TEXT_2417 = ");";
  protected final String TEXT_2418 = NL + "\t\t\t\t";
  protected final String TEXT_2419 = " ";
  protected final String TEXT_2420 = " = (";
  protected final String TEXT_2421 = ")eVirtualGet(";
  protected final String TEXT_2422 = ", ";
  protected final String TEXT_2423 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2424 = " == null ? ";
  protected final String TEXT_2425 = " != null : !";
  protected final String TEXT_2426 = ".equals(";
  protected final String TEXT_2427 = ");";
  protected final String TEXT_2428 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2429 = " == null ? ";
  protected final String TEXT_2430 = "() != null : !";
  protected final String TEXT_2431 = ".equals(";
  protected final String TEXT_2432 = "());";
  protected final String TEXT_2433 = NL + "\t\t}";
  protected final String TEXT_2434 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2435 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2436 = NL + "\t}" + NL;
  protected final String TEXT_2437 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2438 = NL + "\t@Override";
  protected final String TEXT_2439 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2440 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2441 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2442 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_2443 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2444 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2445 = ": return ";
  protected final String TEXT_2446 = ";";
  protected final String TEXT_2447 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2448 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_2449 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2450 = NL + "\t@Override";
  protected final String TEXT_2451 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2452 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2453 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2454 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2455 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2456 = ": return ";
  protected final String TEXT_2457 = ";";
  protected final String TEXT_2458 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2459 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2460 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_2461 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2462 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2463 = ": return ";
  protected final String TEXT_2464 = ";";
  protected final String TEXT_2465 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2466 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2467 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2468 = NL + "\t@Override";
  protected final String TEXT_2469 = NL + "\tpublic int eDerivedOperationID(int baseOperationID, Class";
  protected final String TEXT_2470 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2471 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2472 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_2473 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2474 = ": return ";
  protected final String TEXT_2475 = ";";
  protected final String TEXT_2476 = NL + "\t\t\t\tdefault: return super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2477 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2478 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_2479 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2480 = ": return ";
  protected final String TEXT_2481 = ";";
  protected final String TEXT_2482 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2483 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2484 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID";
  protected final String TEXT_2485 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2486 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2487 = ": return ";
  protected final String TEXT_2488 = ";";
  protected final String TEXT_2489 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2490 = NL + "\t\treturn super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2491 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2492 = NL + "\t@Override";
  protected final String TEXT_2493 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2494 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2495 = NL + "\t@Override";
  protected final String TEXT_2496 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2497 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2498 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2499 = NL + "\t@Override";
  protected final String TEXT_2500 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2501 = NL + "\t\t\tcase ";
  protected final String TEXT_2502 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2503 = ";";
  protected final String TEXT_2504 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2505 = NL + "\t@Override";
  protected final String TEXT_2506 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2507 = NL + "\t\t\tcase ";
  protected final String TEXT_2508 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2509 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2510 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2511 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2512 = NL + "\t@Override";
  protected final String TEXT_2513 = NL + "\t@SuppressWarnings(";
  protected final String TEXT_2514 = "\"unchecked\"";
  protected final String TEXT_2515 = "{\"rawtypes\", \"unchecked\" }";
  protected final String TEXT_2516 = ")";
  protected final String TEXT_2517 = NL + "\tpublic Object eInvoke(int operationID, ";
  protected final String TEXT_2518 = " arguments) throws ";
  protected final String TEXT_2519 = NL + "\t{" + NL + "\t\tswitch (operationID";
  protected final String TEXT_2520 = ")" + NL + "\t\t{";
  protected final String TEXT_2521 = NL + "\t\t\tcase ";
  protected final String TEXT_2522 = ":";
  protected final String TEXT_2523 = NL + "\t\t\t\ttry" + NL + "\t\t\t\t{";
  protected final String TEXT_2524 = NL + "\t\t\t\t";
  protected final String TEXT_2525 = "(";
  protected final String TEXT_2526 = "(";
  protected final String TEXT_2527 = "(";
  protected final String TEXT_2528 = ")";
  protected final String TEXT_2529 = "arguments.get(";
  protected final String TEXT_2530 = ")";
  protected final String TEXT_2531 = ").";
  protected final String TEXT_2532 = "()";
  protected final String TEXT_2533 = ", ";
  protected final String TEXT_2534 = ");" + NL + "\t\t\t\t";
  protected final String TEXT_2535 = "return null;";
  protected final String TEXT_2536 = NL + "\t\t\t\t";
  protected final String TEXT_2537 = "return ";
  protected final String TEXT_2538 = "new ";
  protected final String TEXT_2539 = "(";
  protected final String TEXT_2540 = "(";
  protected final String TEXT_2541 = "(";
  protected final String TEXT_2542 = "(";
  protected final String TEXT_2543 = ")";
  protected final String TEXT_2544 = "arguments.get(";
  protected final String TEXT_2545 = ")";
  protected final String TEXT_2546 = ").";
  protected final String TEXT_2547 = "()";
  protected final String TEXT_2548 = ", ";
  protected final String TEXT_2549 = ")";
  protected final String TEXT_2550 = ")";
  protected final String TEXT_2551 = ";";
  protected final String TEXT_2552 = NL + "\t\t\t\t}" + NL + "\t\t\t\tcatch (";
  protected final String TEXT_2553 = " throwable)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tthrow new ";
  protected final String TEXT_2554 = "(throwable);" + NL + "\t\t\t\t}";
  protected final String TEXT_2555 = NL + "\t\t}";
  protected final String TEXT_2556 = NL + "\t\treturn super.eInvoke(operationID, arguments);";
  protected final String TEXT_2557 = NL + "\t\treturn eDynamicInvoke(operationID, arguments);";
  protected final String TEXT_2558 = NL + "\t}" + NL;
  protected final String TEXT_2559 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2560 = NL + "\t@Override";
  protected final String TEXT_2561 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2562 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2563 = ": \");";
  protected final String TEXT_2564 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2565 = ": \");";
  protected final String TEXT_2566 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2567 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2568 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2569 = NL + "\t\tif (";
  protected final String TEXT_2570 = "(";
  protected final String TEXT_2571 = " & ";
  protected final String TEXT_2572 = "_ESETFLAG) != 0";
  protected final String TEXT_2573 = "ESet";
  protected final String TEXT_2574 = ") result.append((";
  protected final String TEXT_2575 = " & ";
  protected final String TEXT_2576 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2577 = NL + "\t\tif (";
  protected final String TEXT_2578 = "(";
  protected final String TEXT_2579 = " & ";
  protected final String TEXT_2580 = "_ESETFLAG) != 0";
  protected final String TEXT_2581 = "ESet";
  protected final String TEXT_2582 = ") result.append(";
  protected final String TEXT_2583 = "_EFLAG_VALUES[(";
  protected final String TEXT_2584 = " & ";
  protected final String TEXT_2585 = "_EFLAG) >>> ";
  protected final String TEXT_2586 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_2587 = NL + "\t\tif (";
  protected final String TEXT_2588 = "(";
  protected final String TEXT_2589 = " & ";
  protected final String TEXT_2590 = "_ESETFLAG) != 0";
  protected final String TEXT_2591 = "ESet";
  protected final String TEXT_2592 = ") result.append(";
  protected final String TEXT_2593 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2594 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2595 = ", ";
  protected final String TEXT_2596 = "));";
  protected final String TEXT_2597 = NL + "\t\tresult.append((";
  protected final String TEXT_2598 = " & ";
  protected final String TEXT_2599 = "_EFLAG) != 0);";
  protected final String TEXT_2600 = NL + "\t\tresult.append(";
  protected final String TEXT_2601 = "_EFLAG_VALUES[(";
  protected final String TEXT_2602 = " & ";
  protected final String TEXT_2603 = "_EFLAG) >>> ";
  protected final String TEXT_2604 = "_EFLAG_OFFSET]);";
  protected final String TEXT_2605 = NL + "\t\tresult.append(";
  protected final String TEXT_2606 = ");";
  protected final String TEXT_2607 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2608 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2609 = NL + "\t@";
  protected final String TEXT_2610 = NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2611 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2612 = " getKey()" + NL + "\t{";
  protected final String TEXT_2613 = NL + "\t\treturn new ";
  protected final String TEXT_2614 = "(getTypedKey());";
  protected final String TEXT_2615 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2616 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2617 = " key)" + NL + "\t{";
  protected final String TEXT_2618 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2619 = "(";
  protected final String TEXT_2620 = ")";
  protected final String TEXT_2621 = "key);";
  protected final String TEXT_2622 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2623 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2624 = ")key).";
  protected final String TEXT_2625 = "());";
  protected final String TEXT_2626 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2627 = ")key);";
  protected final String TEXT_2628 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2629 = " getValue()" + NL + "\t{";
  protected final String TEXT_2630 = NL + "\t\treturn new ";
  protected final String TEXT_2631 = "(getTypedValue());";
  protected final String TEXT_2632 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2633 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2634 = " setValue(";
  protected final String TEXT_2635 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2636 = " oldValue = getValue();";
  protected final String TEXT_2637 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2638 = "(";
  protected final String TEXT_2639 = ")";
  protected final String TEXT_2640 = "value);";
  protected final String TEXT_2641 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2642 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2643 = ")value).";
  protected final String TEXT_2644 = "());";
  protected final String TEXT_2645 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2646 = ")value);";
  protected final String TEXT_2647 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2648 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2649 = NL + "\tpublic ";
  protected final String TEXT_2650 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2651 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2652 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2653 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2654 = " EOCL_ENV = ";
  protected final String TEXT_2655 = ".newInstance();" + NL;
  protected final String TEXT_2656 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2657 = " create(";
  protected final String TEXT_2658 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2659 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2660 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2661 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2662 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2663 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2664 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2665 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2666 = NL + "\t@Override";
  protected final String TEXT_2667 = NL + "\tprotected ";
  protected final String TEXT_2668 = " ";
  protected final String TEXT_2669 = "Helper(";
  protected final String TEXT_2670 = " ";
  protected final String TEXT_2671 = ")" + NL + "\t{";
  protected final String TEXT_2672 = NL + "\t\t";
  protected final String TEXT_2673 = ".addAll(super.";
  protected final String TEXT_2674 = "());";
  protected final String TEXT_2675 = NL + "\t\tsuper.";
  protected final String TEXT_2676 = "Helper(";
  protected final String TEXT_2677 = ");";
  protected final String TEXT_2678 = NL + "\t\tif (isSet";
  protected final String TEXT_2679 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2680 = "<";
  protected final String TEXT_2681 = ">";
  protected final String TEXT_2682 = " i = ((";
  protected final String TEXT_2683 = ") ";
  protected final String TEXT_2684 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2685 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2686 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2687 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2688 = "<";
  protected final String TEXT_2689 = ">";
  protected final String TEXT_2690 = " i = ((";
  protected final String TEXT_2691 = ") ";
  protected final String TEXT_2692 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2693 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2694 = NL + "\t\t";
  protected final String TEXT_2695 = " ";
  protected final String TEXT_2696 = " = ";
  protected final String TEXT_2697 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2698 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2699 = "<";
  protected final String TEXT_2700 = ">";
  protected final String TEXT_2701 = " i = ((";
  protected final String TEXT_2702 = ") ";
  protected final String TEXT_2703 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2704 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2705 = NL + "\t\tif (isSet";
  protected final String TEXT_2706 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2707 = ".addAll(";
  protected final String TEXT_2708 = "());" + NL + "\t\t}";
  protected final String TEXT_2709 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2710 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2711 = ".addAll(";
  protected final String TEXT_2712 = "());" + NL + "\t\t}";
  protected final String TEXT_2713 = NL + "\t\t";
  protected final String TEXT_2714 = " ";
  protected final String TEXT_2715 = " = ";
  protected final String TEXT_2716 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2717 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2718 = ".addAll(";
  protected final String TEXT_2719 = ");" + NL + "\t\t}";
  protected final String TEXT_2720 = NL + "\t\tif (isSet";
  protected final String TEXT_2721 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2722 = ".add(";
  protected final String TEXT_2723 = "basicGet";
  protected final String TEXT_2724 = "());" + NL + "\t\t}";
  protected final String TEXT_2725 = NL + "\t\t";
  protected final String TEXT_2726 = " ";
  protected final String TEXT_2727 = " = ";
  protected final String TEXT_2728 = "basicGet";
  protected final String TEXT_2729 = "();" + NL + "\t\tif (";
  protected final String TEXT_2730 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2731 = ".add(";
  protected final String TEXT_2732 = ");" + NL + "\t\t}";
  protected final String TEXT_2733 = NL + "\t\treturn ";
  protected final String TEXT_2734 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2735 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2736 = NL + "\t@Override";
  protected final String TEXT_2737 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2738 = "()" + NL + "\t{";
  protected final String TEXT_2739 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2740 = "()";
  protected final String TEXT_2741 = NL + "\t\treturn isSet";
  protected final String TEXT_2742 = "()";
  protected final String TEXT_2743 = ";";
  protected final String TEXT_2744 = NL + "\t\treturn !";
  protected final String TEXT_2745 = "().isEmpty()";
  protected final String TEXT_2746 = ";";
  protected final String TEXT_2747 = NL + "\t\treturn ";
  protected final String TEXT_2748 = "basicGet";
  protected final String TEXT_2749 = "() != null";
  protected final String TEXT_2750 = ";";
  protected final String TEXT_2751 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2752 = ")";
  protected final String TEXT_2753 = ";";
  protected final String TEXT_2754 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2755 = "()";
  protected final String TEXT_2756 = ";";
  protected final String TEXT_2757 = NL + "\t\t\t|| !";
  protected final String TEXT_2758 = "().isEmpty()";
  protected final String TEXT_2759 = ";";
  protected final String TEXT_2760 = NL + "\t\t\t|| ";
  protected final String TEXT_2761 = "basicGet";
  protected final String TEXT_2762 = "() != null";
  protected final String TEXT_2763 = ";";
  protected final String TEXT_2764 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2765 = ")";
  protected final String TEXT_2766 = ";";
  protected final String TEXT_2767 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2768 = "();";
  protected final String TEXT_2769 = NL + "\t\treturn false;";
  protected final String TEXT_2770 = NL + "\t}" + NL;
  protected final String TEXT_2771 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2772 = NL + "\t@Override";
  protected final String TEXT_2773 = NL + "\tpublic ";
  protected final String TEXT_2774 = " ";
  protected final String TEXT_2775 = "()" + NL + "\t{";
  protected final String TEXT_2776 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2777 = " ";
  protected final String TEXT_2778 = " = (";
  protected final String TEXT_2779 = ")((";
  protected final String TEXT_2780 = ")";
  protected final String TEXT_2781 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2782 = ";";
  protected final String TEXT_2783 = NL + "\t\treturn ";
  protected final String TEXT_2784 = "();";
  protected final String TEXT_2785 = NL + "\t\treturn new ";
  protected final String TEXT_2786 = ".UnmodifiableEList";
  protected final String TEXT_2787 = "(this, ";
  protected final String TEXT_2788 = "null";
  protected final String TEXT_2789 = ", 0, ";
  protected final String TEXT_2790 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2791 = NL + "\t\treturn null;";
  protected final String TEXT_2792 = NL + "\t\treturn ";
  protected final String TEXT_2793 = "();";
  protected final String TEXT_2794 = NL + "\t}" + NL;
  protected final String TEXT_2795 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2796 = NL + "\t@Override";
  protected final String TEXT_2797 = NL + "\tpublic ";
  protected final String TEXT_2798 = " basicGet";
  protected final String TEXT_2799 = "()" + NL + "\t{";
  protected final String TEXT_2800 = NL + "\t\treturn null;";
  protected final String TEXT_2801 = NL + "\t\treturn ";
  protected final String TEXT_2802 = "basicGet";
  protected final String TEXT_2803 = "();";
  protected final String TEXT_2804 = NL + "\t}" + NL;
  protected final String TEXT_2805 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2806 = NL + "\t@Override";
  protected final String TEXT_2807 = NL + "\tpublic ";
  protected final String TEXT_2808 = " basicSet";
  protected final String TEXT_2809 = "(";
  protected final String TEXT_2810 = " new";
  protected final String TEXT_2811 = ", ";
  protected final String TEXT_2812 = " msgs)" + NL + "\t{";
  protected final String TEXT_2813 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2814 = NL + "\t\tif (new";
  protected final String TEXT_2815 = " != null && !(new";
  protected final String TEXT_2816 = " instanceof ";
  protected final String TEXT_2817 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2818 = "));" + NL + "\t\t}";
  protected final String TEXT_2819 = NL + "\t\treturn basicSet";
  protected final String TEXT_2820 = "(";
  protected final String TEXT_2821 = "(";
  protected final String TEXT_2822 = ") ";
  protected final String TEXT_2823 = "new";
  protected final String TEXT_2824 = ", msgs);";
  protected final String TEXT_2825 = NL + "\t\tset";
  protected final String TEXT_2826 = "(";
  protected final String TEXT_2827 = "(";
  protected final String TEXT_2828 = ") ";
  protected final String TEXT_2829 = "new";
  protected final String TEXT_2830 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2831 = NL + "\t}" + NL;
  protected final String TEXT_2832 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2833 = NL + "\t@Override";
  protected final String TEXT_2834 = NL + "\tpublic void set";
  protected final String TEXT_2835 = "(";
  protected final String TEXT_2836 = " new";
  protected final String TEXT_2837 = ")" + NL + "\t{";
  protected final String TEXT_2838 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2839 = NL + "\t\tif (new";
  protected final String TEXT_2840 = " != null && !(new";
  protected final String TEXT_2841 = " instanceof ";
  protected final String TEXT_2842 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2843 = "));" + NL + "\t\t}";
  protected final String TEXT_2844 = NL + "\t\tset";
  protected final String TEXT_2845 = "(";
  protected final String TEXT_2846 = "(";
  protected final String TEXT_2847 = ") ";
  protected final String TEXT_2848 = "new";
  protected final String TEXT_2849 = ");";
  protected final String TEXT_2850 = NL + "\t}" + NL;
  protected final String TEXT_2851 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2852 = "() <em>";
  protected final String TEXT_2853 = "</em>}' ";
  protected final String TEXT_2854 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2855 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2856 = "_ESUBSETS = ";
  protected final String TEXT_2857 = ";" + NL;
  protected final String TEXT_2858 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2859 = "() <em>";
  protected final String TEXT_2860 = "</em>}' ";
  protected final String TEXT_2861 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2862 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2863 = "_ESUPERSETS = ";
  protected final String TEXT_2864 = ";" + NL;
  protected final String TEXT_2865 = NL + "\t/**";
  protected final String TEXT_2866 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2867 = "}, with the specified ";
  protected final String TEXT_2868 = ", and appends it to the '<em><b>";
  protected final String TEXT_2869 = "</b></em>' ";
  protected final String TEXT_2870 = ".";
  protected final String TEXT_2871 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2872 = "}, with the specified ";
  protected final String TEXT_2873 = ", and sets the '<em><b>";
  protected final String TEXT_2874 = "</b></em>' ";
  protected final String TEXT_2875 = ".";
  protected final String TEXT_2876 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2877 = "} and appends it to the '<em><b>";
  protected final String TEXT_2878 = "</b></em>' ";
  protected final String TEXT_2879 = ".";
  protected final String TEXT_2880 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2881 = "} and sets the '<em><b>";
  protected final String TEXT_2882 = "</b></em>' ";
  protected final String TEXT_2883 = ".";
  protected final String TEXT_2884 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2885 = NL + "\t * @param ";
  protected final String TEXT_2886 = " The ";
  protected final String TEXT_2887 = " for the new {@link ";
  protected final String TEXT_2888 = "}, or <code>null</code>.";
  protected final String TEXT_2889 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2890 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2891 = "}." + NL + "\t * @see #";
  protected final String TEXT_2892 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2893 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2894 = NL + "\t";
  protected final String TEXT_2895 = " create";
  protected final String TEXT_2896 = "(";
  protected final String TEXT_2897 = ", ";
  protected final String TEXT_2898 = " eClass);" + NL;
  protected final String TEXT_2899 = NL + "\t@Override";
  protected final String TEXT_2900 = NL + "\tpublic ";
  protected final String TEXT_2901 = " create";
  protected final String TEXT_2902 = "(";
  protected final String TEXT_2903 = ", ";
  protected final String TEXT_2904 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2905 = " new";
  protected final String TEXT_2906 = " = (";
  protected final String TEXT_2907 = ") create(eClass);";
  protected final String TEXT_2908 = NL + "\t\t";
  protected final String TEXT_2909 = "().add(new";
  protected final String TEXT_2910 = ");";
  protected final String TEXT_2911 = NL + "\t\tset";
  protected final String TEXT_2912 = "(new";
  protected final String TEXT_2913 = ");";
  protected final String TEXT_2914 = NL + "\t\tint ";
  protected final String TEXT_2915 = "ListSize = 0;";
  protected final String TEXT_2916 = NL + "\t\tint ";
  protected final String TEXT_2917 = "Size = ";
  protected final String TEXT_2918 = " == null ? 0 : ";
  protected final String TEXT_2919 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2920 = "Size > ";
  protected final String TEXT_2921 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2922 = "ListSize = ";
  protected final String TEXT_2923 = "Size;";
  protected final String TEXT_2924 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2925 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2926 = ".create";
  protected final String TEXT_2927 = "(";
  protected final String TEXT_2928 = ", ";
  protected final String TEXT_2929 = "i < ";
  protected final String TEXT_2930 = "Size ? (";
  protected final String TEXT_2931 = ") ";
  protected final String TEXT_2932 = ".get(i) : null";
  protected final String TEXT_2933 = ");" + NL + "\t\t}";
  protected final String TEXT_2934 = NL + "\t\tnew";
  protected final String TEXT_2935 = ".create";
  protected final String TEXT_2936 = "(";
  protected final String TEXT_2937 = ", ";
  protected final String TEXT_2938 = ");";
  protected final String TEXT_2939 = NL + "\t\tif (";
  protected final String TEXT_2940 = " != null)";
  protected final String TEXT_2941 = NL + "\t\t\tnew";
  protected final String TEXT_2942 = ".";
  protected final String TEXT_2943 = "().addAll(";
  protected final String TEXT_2944 = ");";
  protected final String TEXT_2945 = NL + "\t\t\tnew";
  protected final String TEXT_2946 = ".set";
  protected final String TEXT_2947 = "(";
  protected final String TEXT_2948 = ");";
  protected final String TEXT_2949 = NL + "\t\treturn new";
  protected final String TEXT_2950 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2951 = NL + "\t/**";
  protected final String TEXT_2952 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2953 = "}, with the specified ";
  protected final String TEXT_2954 = ", and appends it to the '<em><b>";
  protected final String TEXT_2955 = "</b></em>' ";
  protected final String TEXT_2956 = ".";
  protected final String TEXT_2957 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2958 = "},with the specified ";
  protected final String TEXT_2959 = ", and sets the '<em><b>";
  protected final String TEXT_2960 = "</b></em>' ";
  protected final String TEXT_2961 = ".";
  protected final String TEXT_2962 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2963 = "} and appends it to the '<em><b>";
  protected final String TEXT_2964 = "</b></em>' ";
  protected final String TEXT_2965 = ".";
  protected final String TEXT_2966 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2967 = "} and sets the '<em><b>";
  protected final String TEXT_2968 = "</b></em>' ";
  protected final String TEXT_2969 = ".";
  protected final String TEXT_2970 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2971 = NL + "\t * @param ";
  protected final String TEXT_2972 = " The ";
  protected final String TEXT_2973 = " for the new {@link ";
  protected final String TEXT_2974 = "}, or <code>null</code>.";
  protected final String TEXT_2975 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2976 = "}." + NL + "\t * @see #";
  protected final String TEXT_2977 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2978 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2979 = NL + "\t";
  protected final String TEXT_2980 = " create";
  protected final String TEXT_2981 = "(";
  protected final String TEXT_2982 = ");" + NL;
  protected final String TEXT_2983 = NL + "\t@Override";
  protected final String TEXT_2984 = NL + "\tpublic ";
  protected final String TEXT_2985 = " create";
  protected final String TEXT_2986 = "(";
  protected final String TEXT_2987 = ")" + NL + "\t{";
  protected final String TEXT_2988 = NL + "\t\treturn create";
  protected final String TEXT_2989 = "(";
  protected final String TEXT_2990 = ", ";
  protected final String TEXT_2991 = ");";
  protected final String TEXT_2992 = NL + "\t\t";
  protected final String TEXT_2993 = " new";
  protected final String TEXT_2994 = " = (";
  protected final String TEXT_2995 = ") create(";
  protected final String TEXT_2996 = ");";
  protected final String TEXT_2997 = NL + "\t\t";
  protected final String TEXT_2998 = "().add(new";
  protected final String TEXT_2999 = ");";
  protected final String TEXT_3000 = NL + "\t\tset";
  protected final String TEXT_3001 = "(new";
  protected final String TEXT_3002 = ");";
  protected final String TEXT_3003 = NL + "\t\tint ";
  protected final String TEXT_3004 = "ListSize = 0;";
  protected final String TEXT_3005 = NL + "\t\tint ";
  protected final String TEXT_3006 = "Size = ";
  protected final String TEXT_3007 = " == null ? 0 : ";
  protected final String TEXT_3008 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_3009 = "Size > ";
  protected final String TEXT_3010 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_3011 = "ListSize = ";
  protected final String TEXT_3012 = "Size;";
  protected final String TEXT_3013 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_3014 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_3015 = ".create";
  protected final String TEXT_3016 = "(";
  protected final String TEXT_3017 = ", ";
  protected final String TEXT_3018 = "i < ";
  protected final String TEXT_3019 = "Size ? (";
  protected final String TEXT_3020 = ") ";
  protected final String TEXT_3021 = ".get(i) : null";
  protected final String TEXT_3022 = ");" + NL + "\t\t}";
  protected final String TEXT_3023 = NL + "\t\tnew";
  protected final String TEXT_3024 = ".create";
  protected final String TEXT_3025 = "(";
  protected final String TEXT_3026 = ", ";
  protected final String TEXT_3027 = ");";
  protected final String TEXT_3028 = NL + "\t\tif (";
  protected final String TEXT_3029 = " != null)";
  protected final String TEXT_3030 = NL + "\t\t\tnew";
  protected final String TEXT_3031 = ".";
  protected final String TEXT_3032 = "().addAll(";
  protected final String TEXT_3033 = ");";
  protected final String TEXT_3034 = NL + "\t\t\tnew";
  protected final String TEXT_3035 = ".set";
  protected final String TEXT_3036 = "(";
  protected final String TEXT_3037 = ");";
  protected final String TEXT_3038 = NL + "\t\treturn new";
  protected final String TEXT_3039 = ";";
  protected final String TEXT_3040 = NL + "\t}" + NL;
  protected final String TEXT_3041 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_3042 = "} with the specified ";
  protected final String TEXT_3043 = " from the '<em><b>";
  protected final String TEXT_3044 = "</b></em>' ";
  protected final String TEXT_3045 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3046 = NL + "\t * @param ";
  protected final String TEXT_3047 = " The ";
  protected final String TEXT_3048 = " of the {@link ";
  protected final String TEXT_3049 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3050 = NL + "\t * @return The first {@link ";
  protected final String TEXT_3051 = "} with the specified ";
  protected final String TEXT_3052 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_3053 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3054 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3055 = NL + "\t";
  protected final String TEXT_3056 = " get";
  protected final String TEXT_3057 = "(";
  protected final String TEXT_3058 = ");" + NL;
  protected final String TEXT_3059 = NL + "\t@Override";
  protected final String TEXT_3060 = NL + "\tpublic ";
  protected final String TEXT_3061 = " get";
  protected final String TEXT_3062 = "(";
  protected final String TEXT_3063 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_3064 = "(";
  protected final String TEXT_3065 = ", false";
  protected final String TEXT_3066 = ", null";
  protected final String TEXT_3067 = ", false";
  protected final String TEXT_3068 = ");" + NL + "\t}" + NL;
  protected final String TEXT_3069 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_3070 = "} with the specified ";
  protected final String TEXT_3071 = " from the '<em><b>";
  protected final String TEXT_3072 = "</b></em>' ";
  protected final String TEXT_3073 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3074 = NL + "\t * @param ";
  protected final String TEXT_3075 = " The ";
  protected final String TEXT_3076 = " of the {@link ";
  protected final String TEXT_3077 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3078 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_3079 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_3080 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3081 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_3082 = "} on demand if not found.";
  protected final String TEXT_3083 = NL + "\t * @return The first {@link ";
  protected final String TEXT_3084 = "} with the specified ";
  protected final String TEXT_3085 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_3086 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3087 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3088 = NL + "\t";
  protected final String TEXT_3089 = " get";
  protected final String TEXT_3090 = "(";
  protected final String TEXT_3091 = ", boolean ignoreCase";
  protected final String TEXT_3092 = ", ";
  protected final String TEXT_3093 = " eClass";
  protected final String TEXT_3094 = ", boolean createOnDemand";
  protected final String TEXT_3095 = ");" + NL;
  protected final String TEXT_3096 = NL + "\t@Override";
  protected final String TEXT_3097 = NL + "\tpublic ";
  protected final String TEXT_3098 = " get";
  protected final String TEXT_3099 = "(";
  protected final String TEXT_3100 = ", boolean ignoreCase";
  protected final String TEXT_3101 = ", ";
  protected final String TEXT_3102 = " eClass";
  protected final String TEXT_3103 = ", boolean createOnDemand";
  protected final String TEXT_3104 = ")" + NL + "\t{";
  protected final String TEXT_3105 = NL + "\t\t";
  protected final String TEXT_3106 = "Loop: for (";
  protected final String TEXT_3107 = " ";
  protected final String TEXT_3108 = " : ";
  protected final String TEXT_3109 = "())" + NL + "\t\t{";
  protected final String TEXT_3110 = NL + "\t\t";
  protected final String TEXT_3111 = "Loop: for (";
  protected final String TEXT_3112 = " i = ";
  protected final String TEXT_3113 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_3114 = " ";
  protected final String TEXT_3115 = " = (";
  protected final String TEXT_3116 = ") i.next();";
  protected final String TEXT_3117 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_3118 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3119 = "Loop;";
  protected final String TEXT_3120 = NL + "\t\t\t";
  protected final String TEXT_3121 = " ";
  protected final String TEXT_3122 = "List = ";
  protected final String TEXT_3123 = ".";
  protected final String TEXT_3124 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_3125 = "ListSize = ";
  protected final String TEXT_3126 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_3127 = " || (";
  protected final String TEXT_3128 = " != null && ";
  protected final String TEXT_3129 = ".size() != ";
  protected final String TEXT_3130 = "ListSize";
  protected final String TEXT_3131 = ")";
  protected final String TEXT_3132 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_3133 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_3134 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_3135 = " ";
  protected final String TEXT_3136 = " = ";
  protected final String TEXT_3137 = "(";
  protected final String TEXT_3138 = ") ";
  protected final String TEXT_3139 = "List.get(j);";
  protected final String TEXT_3140 = NL + "\t\t\t\tif (";
  protected final String TEXT_3141 = " != null && !(ignoreCase ? (";
  protected final String TEXT_3142 = "(";
  protected final String TEXT_3143 = ")";
  protected final String TEXT_3144 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_3145 = ".";
  protected final String TEXT_3146 = "()) : ";
  protected final String TEXT_3147 = ".get(j).equals(";
  protected final String TEXT_3148 = ".";
  protected final String TEXT_3149 = "())))";
  protected final String TEXT_3150 = NL + "\t\t\t\tif (";
  protected final String TEXT_3151 = " != null && !";
  protected final String TEXT_3152 = ".get(j).equals(";
  protected final String TEXT_3153 = ".";
  protected final String TEXT_3154 = "()))";
  protected final String TEXT_3155 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_3156 = "Loop;";
  protected final String TEXT_3157 = NL + "\t\t\t}";
  protected final String TEXT_3158 = NL + "\t\t\t";
  protected final String TEXT_3159 = " ";
  protected final String TEXT_3160 = " = ";
  protected final String TEXT_3161 = ".";
  protected final String TEXT_3162 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_3163 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3164 = "Loop;";
  protected final String TEXT_3165 = NL + "\t\t\tif (";
  protected final String TEXT_3166 = " != null && !(ignoreCase ? ";
  protected final String TEXT_3167 = ".equalsIgnoreCase(";
  protected final String TEXT_3168 = ".";
  protected final String TEXT_3169 = "()) : ";
  protected final String TEXT_3170 = ".equals(";
  protected final String TEXT_3171 = ".";
  protected final String TEXT_3172 = "())))";
  protected final String TEXT_3173 = NL + "\t\t\tif (";
  protected final String TEXT_3174 = " != null && !";
  protected final String TEXT_3175 = ".equals(";
  protected final String TEXT_3176 = ".";
  protected final String TEXT_3177 = "()))";
  protected final String TEXT_3178 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3179 = "Loop;";
  protected final String TEXT_3180 = NL + "\t\t\tif (";
  protected final String TEXT_3181 = " != null && !(ignoreCase ? ";
  protected final String TEXT_3182 = ".equalsIgnoreCase(";
  protected final String TEXT_3183 = ".";
  protected final String TEXT_3184 = "()) : ";
  protected final String TEXT_3185 = ".equals(";
  protected final String TEXT_3186 = ".";
  protected final String TEXT_3187 = "())))";
  protected final String TEXT_3188 = NL + "\t\t\tif (";
  protected final String TEXT_3189 = " != null && !";
  protected final String TEXT_3190 = ".equals(";
  protected final String TEXT_3191 = ".";
  protected final String TEXT_3192 = "()))";
  protected final String TEXT_3193 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3194 = "Loop;";
  protected final String TEXT_3195 = NL + "\t\t\treturn ";
  protected final String TEXT_3196 = ";" + NL + "\t\t}";
  protected final String TEXT_3197 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_3198 = " && eClass != null";
  protected final String TEXT_3199 = " ? create";
  protected final String TEXT_3200 = "(";
  protected final String TEXT_3201 = ", eClass";
  protected final String TEXT_3202 = ") : null;";
  protected final String TEXT_3203 = NL + "\t\treturn null;";
  protected final String TEXT_3204 = NL + "\t}" + NL;
  protected final String TEXT_3205 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_3206 = "()" + NL + "\t{";
  protected final String TEXT_3207 = NL + "  \t\treturn false;";
  protected final String TEXT_3208 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3209 = ");";
  protected final String TEXT_3210 = NL + "\t\treturn !((";
  protected final String TEXT_3211 = ".Internal.Wrapper)";
  protected final String TEXT_3212 = "()).featureMap().isEmpty();";
  protected final String TEXT_3213 = NL + "\t\treturn ";
  protected final String TEXT_3214 = " != null && !";
  protected final String TEXT_3215 = ".featureMap().isEmpty();";
  protected final String TEXT_3216 = NL + "\t\treturn ";
  protected final String TEXT_3217 = " != null && !";
  protected final String TEXT_3218 = ".isEmpty();";
  protected final String TEXT_3219 = NL + "\t\t";
  protected final String TEXT_3220 = " ";
  protected final String TEXT_3221 = " = (";
  protected final String TEXT_3222 = ")eVirtualGet(";
  protected final String TEXT_3223 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3224 = " != null && !";
  protected final String TEXT_3225 = ".isEmpty();";
  protected final String TEXT_3226 = NL + "\t\treturn !";
  protected final String TEXT_3227 = "().isEmpty();";
  protected final String TEXT_3228 = NL + "\t\treturn ";
  protected final String TEXT_3229 = " != null;";
  protected final String TEXT_3230 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3231 = ") != null;";
  protected final String TEXT_3232 = NL + "\t\treturn basicGet";
  protected final String TEXT_3233 = "() != null;";
  protected final String TEXT_3234 = NL + "\t\treturn ";
  protected final String TEXT_3235 = " != null;";
  protected final String TEXT_3236 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3237 = ") != null;";
  protected final String TEXT_3238 = NL + "\t\treturn ";
  protected final String TEXT_3239 = "() != null;";
  protected final String TEXT_3240 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_3241 = " & ";
  protected final String TEXT_3242 = "_EFLAG) != 0) != ";
  protected final String TEXT_3243 = ";";
  protected final String TEXT_3244 = NL + "\t\t\t\treturn (";
  protected final String TEXT_3245 = " & ";
  protected final String TEXT_3246 = "_EFLAG) != ";
  protected final String TEXT_3247 = "_EFLAG_DEFAULT;";
  protected final String TEXT_3248 = NL + "\t\treturn ";
  protected final String TEXT_3249 = " != ";
  protected final String TEXT_3250 = ";";
  protected final String TEXT_3251 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3252 = ", ";
  protected final String TEXT_3253 = ") != ";
  protected final String TEXT_3254 = ";";
  protected final String TEXT_3255 = NL + "\t\treturn ";
  protected final String TEXT_3256 = "() != ";
  protected final String TEXT_3257 = ";";
  protected final String TEXT_3258 = NL + "\t\treturn ";
  protected final String TEXT_3259 = " == null ? ";
  protected final String TEXT_3260 = " != null : !";
  protected final String TEXT_3261 = ".equals(";
  protected final String TEXT_3262 = ");";
  protected final String TEXT_3263 = NL + "\t\t";
  protected final String TEXT_3264 = " ";
  protected final String TEXT_3265 = " = (";
  protected final String TEXT_3266 = ")eVirtualGet(";
  protected final String TEXT_3267 = ", ";
  protected final String TEXT_3268 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3269 = " == null ? ";
  protected final String TEXT_3270 = " != null : !";
  protected final String TEXT_3271 = ".equals(";
  protected final String TEXT_3272 = ");";
  protected final String TEXT_3273 = NL + "\t\treturn ";
  protected final String TEXT_3274 = " == null ? ";
  protected final String TEXT_3275 = "() != null : !";
  protected final String TEXT_3276 = ".equals(";
  protected final String TEXT_3277 = "());";
  protected final String TEXT_3278 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3279 = ");";
  protected final String TEXT_3280 = NL + "\t\t";
  protected final String TEXT_3281 = " ";
  protected final String TEXT_3282 = " = (";
  protected final String TEXT_3283 = ")eVirtualGet(";
  protected final String TEXT_3284 = ");";
  protected final String TEXT_3285 = NL + "\t\treturn ";
  protected final String TEXT_3286 = " != null && ((";
  protected final String TEXT_3287 = ".Unsettable";
  protected final String TEXT_3288 = ")";
  protected final String TEXT_3289 = ").isSet();";
  protected final String TEXT_3290 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_3291 = ");";
  protected final String TEXT_3292 = NL + "\t\treturn (";
  protected final String TEXT_3293 = " & ";
  protected final String TEXT_3294 = "_ESETFLAG) != 0;";
  protected final String TEXT_3295 = NL + "\t\treturn ";
  protected final String TEXT_3296 = "ESet;";
  protected final String TEXT_3297 = NL + "\t\treturn !((";
  protected final String TEXT_3298 = ".Internal)((";
  protected final String TEXT_3299 = ".Internal.Wrapper)get";
  protected final String TEXT_3300 = "()).featureMap()).isEmpty(";
  protected final String TEXT_3301 = ");";
  protected final String TEXT_3302 = NL + "\t\treturn !((";
  protected final String TEXT_3303 = ".Internal)get";
  protected final String TEXT_3304 = "()).isEmpty(";
  protected final String TEXT_3305 = ");";
  protected final String TEXT_3306 = NL + "\t\treturn ";
  protected final String TEXT_3307 = ".";
  protected final String TEXT_3308 = "(this);";
  protected final String TEXT_3309 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_3310 = "' ";
  protected final String TEXT_3311 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3312 = NL + "\t}" + NL;
  protected final String TEXT_3313 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3314 = NL + "\t@Override";
  protected final String TEXT_3315 = NL + "\tpublic ";
  protected final String TEXT_3316 = " ";
  protected final String TEXT_3317 = "(";
  protected final String TEXT_3318 = ")";
  protected final String TEXT_3319 = NL + "\t{";
  protected final String TEXT_3320 = NL + "\t\t";
  protected final String TEXT_3321 = "(";
  protected final String TEXT_3322 = ");";
  protected final String TEXT_3323 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3324 = NL + "\t\treturn ";
  protected final String TEXT_3325 = "(";
  protected final String TEXT_3326 = ");";
  protected final String TEXT_3327 = NL + "\t}" + NL;
  protected final String TEXT_3328 = NL + "} //";
  protected final String TEXT_3329 = NL;

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
    stringBuffer.append(TEXT_359);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_360);
    }
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_363);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_365);
    }
    stringBuffer.append(TEXT_366);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_367);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_368);
    }
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_371);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_373);
    }
    stringBuffer.append(TEXT_374);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_379);
    }
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_381);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_383);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_385);
    } else {
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_388);
    }
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_390);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_393);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_394);
    } else {
    stringBuffer.append(TEXT_395);
    }
    stringBuffer.append(TEXT_396);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_402);
    }
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_407);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_408);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_414);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_419);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_422);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_423);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_427);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_428);
    }
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_430);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_433);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_435);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_436);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_437);
    }
    stringBuffer.append(TEXT_438);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_441);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_447);
    }
    stringBuffer.append(TEXT_448);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_452);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_455);
    } else {
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_460);
    }
    } else {
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_462);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_467);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_472);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = isJDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_476);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_477);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_479);
    } else {
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_481);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_482);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_484);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_486);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_488);
    } else {
    stringBuffer.append(TEXT_489);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_491);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_492);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_493);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_495);
    }
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_497);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_499);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_500);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_501);
    }
    stringBuffer.append(TEXT_502);
    } else {
    stringBuffer.append(TEXT_503);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_504);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_506);
    }
    stringBuffer.append(TEXT_507);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_509);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_511);
    }
    stringBuffer.append(TEXT_512);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_515);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_516);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_517);
    }
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_520);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_521);
    }
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_523);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_524);
    }
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_526);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_528);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_530);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_531);
    }
    stringBuffer.append(TEXT_532);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_534);
    }
    stringBuffer.append(TEXT_535);
    }
    stringBuffer.append(TEXT_536);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_538);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_541);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_542);
    }
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_550);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_552);
    }
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_554);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_556);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_560);
    }
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_570);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_571);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_574);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_575);
    }
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_578);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_580);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_583);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_587);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_588);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_590);
    }
    stringBuffer.append(TEXT_591);
    }
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_594);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_596);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_597);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_598);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_599);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_600);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_601);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_603);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_604);
    } else {
    stringBuffer.append(TEXT_605);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_606);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_607);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
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
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_613);
    } else {
    stringBuffer.append(TEXT_614);
    }
    stringBuffer.append(TEXT_615);
    }
    } else {
    stringBuffer.append(TEXT_616);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_618);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_619);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_620);
    if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_621);
    }
    }
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_624);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_628);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_629);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_630);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_631);
    }
    stringBuffer.append(TEXT_632);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_634);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_636);
    }
    stringBuffer.append(TEXT_637);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_640);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_643);
    } else {
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_645);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_648);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_650);
    } else {
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_652);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_654);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_655);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_657);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_658);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_659);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_660);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_661);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_663);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_664);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_665);
    } else {
    stringBuffer.append(TEXT_666);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_667);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_668);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_669);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_670);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_671);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_672);
    }
    }
    }
    }
    stringBuffer.append(TEXT_673);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_675);
    } else {
    stringBuffer.append(TEXT_676);
    }
    stringBuffer.append(TEXT_677);
    } else {
    stringBuffer.append(TEXT_678);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_680);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_681);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_682);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_683);
    }
    }
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_687);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_689);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_692);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_693);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_695);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_696);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_697);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_698);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_699);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_700);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_702);
    }
    stringBuffer.append(TEXT_703);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_704);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_705);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_706);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_707);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_709);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_710);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_711);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_712);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_713);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_715);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_717);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_718);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_719);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_720);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_721);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_722);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_724);
    }
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_726);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_729);
    }
    stringBuffer.append(TEXT_730);
    }
    stringBuffer.append(TEXT_731);
    }
    stringBuffer.append(TEXT_732);
    } else if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_736);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_738);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_739);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_740);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_741);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_742);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_743);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_745);
    }
    stringBuffer.append(TEXT_746);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_747);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_749);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_750);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_752);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_753);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_754);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_755);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_756);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_758);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_760);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_761);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_762);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_763);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_764);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_765);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_767);
    }
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_769);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_770);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_772);
    }
    stringBuffer.append(TEXT_773);
    }
    stringBuffer.append(TEXT_774);
    }
    stringBuffer.append(TEXT_775);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_779);
    } else {
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_785);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_787);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_789);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_791);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_792);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_793);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_794);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_797);
    }
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_799);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_800);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_803);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_804);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_805);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_806);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_808);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_809);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_810);
    } else {
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_812);
    }
    stringBuffer.append(TEXT_813);
    } else {
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_817);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_818);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_823);
    }
    stringBuffer.append(TEXT_824);
    }
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_826);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_827);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_828);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_829);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_830);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_831);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_833);
    }
    stringBuffer.append(TEXT_834);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_835);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_836);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_837);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_838);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_840);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_841);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_842);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_843);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_844);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_846);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_848);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_849);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_850);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_851);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_852);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_853);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_854);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_855);
    }
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_857);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_858);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_860);
    }
    stringBuffer.append(TEXT_861);
    }
    stringBuffer.append(TEXT_862);
    }
    stringBuffer.append(TEXT_863);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_866);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_869);
    } else {
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_871);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_874);
    }
    } else {
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_877);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_878);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_883);
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_886);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_889);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_891);
    }
    }
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_893);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_894);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_895);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_898);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_900);
    }
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_902);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_903);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_908);
    }
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_911);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_913);
    }
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_915);
    }
    stringBuffer.append(TEXT_916);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_918);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_920);
    }
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_922);
    }
    stringBuffer.append(TEXT_923);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_924);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_925);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_927);
    }
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_929);
    }
    stringBuffer.append(TEXT_930);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_931);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_934);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_943);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_944);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_948);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_954);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_955);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_959);
    }
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_964);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_972);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_975);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_976);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_980);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_981);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_982);
    }
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_986);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_987);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_989);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_990);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_994);
    }
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_997);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1000);
    }
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1002);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1009);
    }
    stringBuffer.append(TEXT_1010);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1016);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1021);
    } else {
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1028);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1034);
    } else {
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1041);
    if (isJDK50) {
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1043);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1045);
    }
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1047);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1051);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1057);
    } else {
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1062);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1067);
    } else {
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1071);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1075);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1077);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1081);
    }
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1084);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1087);
    }
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1089);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1093);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1097);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1099);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1100);
    } else {
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1102);
    }
    stringBuffer.append(TEXT_1103);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1107);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1112);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1114);
    }
    }
    }
    if (!genFeature.isBasicSet()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_1116);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1120);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1123);
    }
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1128);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1130);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1138);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1142);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_1145);
    }
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1150);
    }
    stringBuffer.append(TEXT_1151);
    }
    stringBuffer.append(TEXT_1152);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1157);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1159);
    }
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1161);
    }
    stringBuffer.append(TEXT_1162);
    } else {
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1166);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1168);
    }
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1170);
    }
    stringBuffer.append(TEXT_1171);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1176);
    } else {
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1179);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1180);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_1181);
    if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1182);
    }
    }
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1186);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1188);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1191);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1193);
    }
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
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1201);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1203);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1207);
    }
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1210);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1213);
    }
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1215);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1220);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1222);
    } else {
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1224);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1225);
    } else {
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1227);
    }
    stringBuffer.append(TEXT_1228);
    }
    } else {
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1231);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1232);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(TEXT_1238);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1240);
    }
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1242);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1245);
    }
    stringBuffer.append(TEXT_1246);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1247);
    if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1248);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1250);
    } else {
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1252);
    }
    stringBuffer.append(TEXT_1253);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1256);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1258);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1260);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1265);
    }
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1270);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1275);
    }
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1278);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1282);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1287);
    }
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1289);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1292);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1296);
    }
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1299);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1302);
    }
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1304);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1309);
    }
    stringBuffer.append(TEXT_1310);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1315);
    } else {
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1322);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1325);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1329);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1331);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1335);
    } else {
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1338);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1340);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1343);
    } else {
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1345);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1349);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1351);
    } else {
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1353);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1354);
    } else {
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1356);
    }
    stringBuffer.append(TEXT_1357);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1363);
    } else {
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1368);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1371);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1374);
    } else {
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1376);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1380);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1385);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1386);
    } else {
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1388);
    }
    stringBuffer.append(TEXT_1389);
    }
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
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature);
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
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1406);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1414);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1416);
    }
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1418);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1421);
    }
    stringBuffer.append(TEXT_1422);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1423);
    if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1424);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1426);
    } else {
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1428);
    }
    stringBuffer.append(TEXT_1429);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1432);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1434);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1436);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1441);
    }
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1446);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1448);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1451);
    } else {
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1453);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1458);
    } else {
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1462);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1466);
    } else {
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1469);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1470);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1477);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1484);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1485);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1490);
    } else {
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1495);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1499);
    } else {
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1503);
    }
    }
    stringBuffer.append(TEXT_1504);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1508);
    }
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1512);
    }
    } else {
    stringBuffer.append(TEXT_1513);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1516);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1517);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1518);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1519);
    }
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1522);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1523);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1527);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1530);
    } else {
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1533);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1535);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1543);
    index++;}
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1547);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1548);
    }
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1552);
    }
    stringBuffer.append(TEXT_1553);
    } else {
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1556);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1557);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1558);
    }
    } else {
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1560);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1564);
    } else {
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1568);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1570);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1571);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1576);
    } else {
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1581);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1585);
    } else {
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1589);
    }
    }
    stringBuffer.append(TEXT_1590);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1594);
    }
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1597);
    }
    } else {
    stringBuffer.append(TEXT_1598);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1602);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1603);
    }
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1607);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1609);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_1610);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1611);
    } else {
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1616);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1619);
    } else {
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1622);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1624);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1632);
    index++;}
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1636);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1637);
    }
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1641);
    }
    stringBuffer.append(TEXT_1642);
    } else {
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1645);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1646);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1647);
    }
    } else {
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1649);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1653);
    } else {
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1657);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1659);
    }
    stringBuffer.append(TEXT_1660);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1665);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1669);
    }
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1673);
    }
    } else {
    stringBuffer.append(TEXT_1674);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1678);
    }
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1679);
    }
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1685);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1686);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1687);
    }
    stringBuffer.append(TEXT_1688);
    }
    }
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1693);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1697);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1698);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1700);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1702);
    }
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1706);
    }
    } else {
    stringBuffer.append(TEXT_1707);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1711);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1713);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1714);
    }
    stringBuffer.append(TEXT_1715);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1716);
    }
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1720);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1722);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1723);
    }
    stringBuffer.append(TEXT_1724);
    if (isJDK50) {
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1729);
    } else {
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1736);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1739);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1746);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1747);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1750);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1751);
    }
    }
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1756);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1757);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1758);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1759);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1761);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1763);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1769);
    } else {
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1774);
    }
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1776);
    index++;}
    stringBuffer.append(TEXT_1777);
    } else {
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1784);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1792);
    } else {
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1796);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1797);
    }
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1799);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1807);
    } else {
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1812);
    }
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1814);
    index++;}
    }
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1816);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1817);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1818);
    }
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1821);
    }
    stringBuffer.append(TEXT_1822);
    } else {
    stringBuffer.append(TEXT_1823);
    }
    stringBuffer.append(TEXT_1824);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1826);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1827);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1829);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1832);
    } else {
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1835);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1838);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1845);
    } else {
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1847);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1849);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1851);
    } else {
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1853);
    }
    }
    } else if (genFeature.isReferenceType()) {
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
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1859);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1863);
    } else {
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1867);
    }
    } else {
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1870);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1872);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1874);
    } else {
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1877);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1882);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1884);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1892);
    } else {
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1896);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1897);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1899);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1904);
    }
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1909);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1911);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1914);
    } else {
    stringBuffer.append(TEXT_1915);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1916);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1917);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1920);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1921);
    } else {
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1924);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1925);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1926);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1927);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1928);
    } else {
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1930);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1931);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1932);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation && !UML2GenModelUtil.hasOperationsClass(genClass, genOperation) && UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_1933);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1934);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1938);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_1941);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1942);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1948);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1950);
    } else {
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1953);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1956);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (isJDK50) {
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_1958);
    }
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1960);
    }
    }
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && isImplementation) {
    if (genOperation.isInvariant() && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1962);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1963);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(genOperation.getInvariantExpression("\t\t"));
    stringBuffer.append(TEXT_1969);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1970);
    } else if (genOperation.hasInvocationDelegate()) {
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1972);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1976);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_1980);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1981);
    if (UML2GenModelUtil.isRedefinition(genOperation)) {
    stringBuffer.append(TEXT_1982);
    for (GenOperation redefinedGenOperation : UML2GenModelUtil.getRedefinedGenOperations(genOperation)) {
    stringBuffer.append(TEXT_1983);
    stringBuffer.append(redefinedGenOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1984);
    stringBuffer.append(redefinedGenOperation.getName());
    stringBuffer.append(TEXT_1985);
    stringBuffer.append(redefinedGenOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1986);
    stringBuffer.append(redefinedGenOperation.getFormattedName());
    stringBuffer.append(TEXT_1987);
    }
    stringBuffer.append(TEXT_1988);
    }
    stringBuffer.append(TEXT_1989);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1990);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1992);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1996);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1998);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1999);
    }}
    stringBuffer.append(TEXT_2000);
    } else {
    stringBuffer.append(TEXT_2001);
    if (isJDK50) {
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_2002);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_2004);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2005);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_2006);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_2007);
    } else {
    if (genModel.useGenerics() && !genOperation.hasBody() && !genOperation.isInvariant() && genOperation.hasInvocationDelegate() && genOperation.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_2008);
    }
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2011);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_2012);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_2013);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2017);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(genOperation.getValidationDelegate());
    stringBuffer.append(TEXT_2020);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_2024);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2025);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2026);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_2027);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2030);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2031);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2032);
    } else {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_2033);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2034);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2035);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2036);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2038);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2039);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2040);
    } else {
    stringBuffer.append(TEXT_2041);
    }
    stringBuffer.append(TEXT_2042);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(TEXT_2044);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2045);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_2046);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2048);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2052);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_2055);
    //genOperation.diagnostics.override.javajetinc
    stringBuffer.append(TEXT_2056);
    }
    }
    } else if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvocationDelegate()) { int size = genOperation.getGenParameters().size();
    stringBuffer.append(TEXT_2057);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2059);
    if (size > 0) {
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2061);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_2062);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_2063);
    } else {
    stringBuffer.append(TEXT_2064);
    }
    stringBuffer.append(TEXT_2065);
    } else {
    stringBuffer.append(TEXT_2066);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2067);
    }
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2070);
    if (size > 0) {
    stringBuffer.append(TEXT_2071);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2072);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_2074);
    } else {
    stringBuffer.append(TEXT_2075);
    }
    stringBuffer.append(TEXT_2076);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2078);
    }
    stringBuffer.append(TEXT_2079);
    }
    stringBuffer.append(TEXT_2080);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.WrappedException"));
    stringBuffer.append(TEXT_2082);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2083);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2085);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2087);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2089);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_2090);
    }
    stringBuffer.append(TEXT_2091);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2092);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2093);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_2094);
    }
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2096);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_2097);
    }
    stringBuffer.append(TEXT_2098);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2099);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2101);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2102);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2103);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2104);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2105);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2106);
    }
    stringBuffer.append(TEXT_2107);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2108);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2109);
    }
    stringBuffer.append(TEXT_2110);
    }
    stringBuffer.append(TEXT_2111);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2112);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2113);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2115);
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
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2117);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2118);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2122);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2123);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2124);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2125);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2126);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_2127);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2128);
    }
    stringBuffer.append(TEXT_2129);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2131);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2133);
    }
    stringBuffer.append(TEXT_2134);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2139);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2140);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2141);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_2142);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2143);
    } else {
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_2145);
    }
    } else {
    stringBuffer.append(TEXT_2146);
    }
    }
    stringBuffer.append(TEXT_2147);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_2148);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_2149);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2150);
    }
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2152);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2154);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2155);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_2156);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2157);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_2159);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2162);
    } else {
    stringBuffer.append(TEXT_2163);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2164);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_2165);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2166);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2168);
    } else {
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2170);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2172);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2174);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2175);
    } else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2177);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2178);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_2179);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2180);
    }
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2182);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2185);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2186);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2188);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2189);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2191);
    }
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2193);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2194);
    }
    }
    stringBuffer.append(TEXT_2195);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2196);
    } else {
    stringBuffer.append(TEXT_2197);
    }
    stringBuffer.append(TEXT_2198);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_2199);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2200);
    }
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2202);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2203);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2204);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2205);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2207);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2208);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2209);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2210);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2212);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2213);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2215);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2216);
    } else {
    stringBuffer.append(TEXT_2217);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2218);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2219);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2220);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2221);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2222);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2223);
    } else {
    stringBuffer.append(TEXT_2224);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2225);
    }
    }
    stringBuffer.append(TEXT_2226);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2227);
    } else {
    stringBuffer.append(TEXT_2228);
    }
    stringBuffer.append(TEXT_2229);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_2230);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2231);
    }
    stringBuffer.append(TEXT_2232);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2233);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2234);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2235);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_2236);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2237);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2238);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2239);
    }
    stringBuffer.append(TEXT_2240);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2241);
    } else {
    stringBuffer.append(TEXT_2242);
    }
    stringBuffer.append(TEXT_2243);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_2244);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2245);
    }
    stringBuffer.append(TEXT_2246);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2247);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_2248);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2249);
    if (genFeature.isPrimitiveType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2250);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2251);
    } else if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2252);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2253);
    } else {
    stringBuffer.append(TEXT_2254);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2255);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2256);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_2257);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2258);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2259);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2260);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2261);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2262);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2263);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2264);
    } else {
    stringBuffer.append(TEXT_2265);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2267);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2269);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2270);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2271);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2272);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2273);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2275);
    } else {
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2277);
    }
    }
    stringBuffer.append(TEXT_2278);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2279);
    } else {
    stringBuffer.append(TEXT_2280);
    }
    stringBuffer.append(TEXT_2281);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_2282);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_2283);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2284);
    }
    stringBuffer.append(TEXT_2285);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2286);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2288);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2290);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2292);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2293);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2294);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2295);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2296);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2297);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2298);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2299);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2300);
    } else {
    stringBuffer.append(TEXT_2301);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2302);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2303);
    }
    } else {
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2305);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2306);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2307);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2308);
    }
    stringBuffer.append(TEXT_2309);
    }
    } else if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2310);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2311);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2313);
    } else {
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2315);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2316);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2317);
    }
    stringBuffer.append(TEXT_2318);
    }
    stringBuffer.append(TEXT_2319);
    }
    stringBuffer.append(TEXT_2320);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2321);
    } else {
    stringBuffer.append(TEXT_2322);
    }
    stringBuffer.append(TEXT_2323);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_2324);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2325);
    }
    stringBuffer.append(TEXT_2326);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2327);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_2328);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2329);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2330);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2331);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2332);
    } else {
    stringBuffer.append(TEXT_2333);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2334);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2335);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2336);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_2337);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2338);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2339);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_2340);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2341);
    } else {
    stringBuffer.append(TEXT_2342);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2343);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2344);
    }
    stringBuffer.append(TEXT_2345);
    }
    stringBuffer.append(TEXT_2346);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2347);
    } else {
    stringBuffer.append(TEXT_2348);
    }
    stringBuffer.append(TEXT_2349);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_2350);
    stringBuffer.append(TEXT_2351);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2352);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2353);
    }
    stringBuffer.append(TEXT_2354);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) { String safeNameAccessor = genFeature.getSafeName(); if ("featureID".equals(safeNameAccessor)) { safeNameAccessor = "this." + safeNameAccessor; }
    stringBuffer.append(TEXT_2355);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2356);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2357);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2358);
    } else {
    if (genFeature.hasSettingDelegate()) {
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2359);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2360);
    } else {
    stringBuffer.append(TEXT_2361);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2362);
    }
    } else if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2363);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2365);
    } else {
    stringBuffer.append(TEXT_2366);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2367);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2368);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2369);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2370);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2371);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2374);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2376);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2377);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2378);
    } else {
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2380);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2381);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2382);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2384);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2385);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2386);
    } else {
    stringBuffer.append(TEXT_2387);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2388);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2389);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2390);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2391);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2392);
    } else {
    stringBuffer.append(TEXT_2393);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2394);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2398);
    } else {
    stringBuffer.append(TEXT_2399);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2401);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2402);
    }
    } else {
    stringBuffer.append(TEXT_2403);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2404);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2405);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2407);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2408);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2409);
    } else {
    stringBuffer.append(TEXT_2410);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2411);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2412);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2413);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2415);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2416);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2417);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2418);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2419);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2420);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2421);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2423);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2424);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2425);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2426);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2427);
    } else {
    stringBuffer.append(TEXT_2428);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2429);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2430);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2431);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2432);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2433);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2434);
    } else {
    stringBuffer.append(TEXT_2435);
    }
    stringBuffer.append(TEXT_2436);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2437);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2438);
    }
    stringBuffer.append(TEXT_2439);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2440);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2441);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2442);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2443);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2444);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2445);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2446);
    }
    stringBuffer.append(TEXT_2447);
    }
    stringBuffer.append(TEXT_2448);
    }
    stringBuffer.append(TEXT_2449);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2450);
    }
    stringBuffer.append(TEXT_2451);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2452);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2453);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2454);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2456);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2457);
    }
    stringBuffer.append(TEXT_2458);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2461);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2462);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2463);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2464);
    }
    stringBuffer.append(TEXT_2465);
    }
    stringBuffer.append(TEXT_2466);
    }
    if (genModel.isOperationReflection() && isImplementation && (!genClass.getMixinGenOperations().isEmpty() || !genClass.getOverrideGenOperations(genClass.getExtendedGenOperations(), genClass.getImplementedGenOperations()).isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty())) {
    stringBuffer.append(TEXT_2467);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2468);
    }
    stringBuffer.append(TEXT_2469);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2470);
    for (GenClass extendedGenClass : genClass.getExtendedGenClasses()) { List<GenOperation> extendedImplementedGenOperations = extendedGenClass.getImplementedGenOperations(); List<GenOperation> implementedGenOperations = genClass.getImplementedGenOperations();
    if (!genClass.getOverrideGenOperations(extendedImplementedGenOperations, implementedGenOperations).isEmpty()) {
    stringBuffer.append(TEXT_2471);
    stringBuffer.append(extendedGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2472);
    for (GenOperation genOperation : extendedImplementedGenOperations) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    if (implementedGenOperations.contains(overrideGenOperation)) {
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(extendedGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2474);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2475);
    }
    }
    stringBuffer.append(TEXT_2476);
    }
    }
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2478);
    for (GenOperation genOperation : mixinGenClass.getGenOperations()) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(mixinGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2480);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2481);
    }
    stringBuffer.append(TEXT_2482);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2484);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_2485);
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2487);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2488);
    }
    stringBuffer.append(TEXT_2489);
    }
    stringBuffer.append(TEXT_2490);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2491);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2492);
    }
    stringBuffer.append(TEXT_2493);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2494);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2495);
    }
    stringBuffer.append(TEXT_2496);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2497);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2498);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2499);
    }
    stringBuffer.append(TEXT_2500);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2501);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2502);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2503);
    }
    stringBuffer.append(TEXT_2504);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2505);
    }
    stringBuffer.append(TEXT_2506);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2508);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2509);
    }
    stringBuffer.append(TEXT_2510);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_2511);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2512);
    }
    if (genModel.useGenerics()) {
    boolean isUnchecked = false; boolean isRaw = false; LOOP: for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { for (GenParameter genParameter : genOperation.getGenParameters()) { if (genParameter.isUncheckedCast()) { if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType()) { isUnchecked = true; } if (genParameter.usesOperationTypeParameters() && !genParameter.getEcoreParameter().getEGenericType().getETypeArguments().isEmpty()) { isRaw = true; break LOOP; }}}}
    if (isUnchecked) {
    stringBuffer.append(TEXT_2513);
    if (!isRaw) {
    stringBuffer.append(TEXT_2514);
    } else {
    stringBuffer.append(TEXT_2515);
    }
    stringBuffer.append(TEXT_2516);
    }
    }
    stringBuffer.append(TEXT_2517);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2518);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_2520);
    for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { List<GenParameter> genParameters = genOperation.getGenParameters(); int size = genParameters.size();  boolean hasCheckedException = genOperation.hasCheckedException(); String indent = hasCheckedException ? "\t" : "";
    stringBuffer.append(TEXT_2521);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2522);
    if (hasCheckedException) {
    stringBuffer.append(TEXT_2523);
    /*}*/}
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2524);
    stringBuffer.append(indent);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2525);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2526);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_2527);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_2528);
    }
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2530);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2532);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_2533);
    }
    }
    stringBuffer.append(TEXT_2534);
    stringBuffer.append(indent);
    stringBuffer.append(TEXT_2535);
    } else {
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(indent);
    stringBuffer.append(TEXT_2537);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2539);
    }
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2540);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2541);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_2542);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_2543);
    }
    stringBuffer.append(TEXT_2544);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2545);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2546);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2547);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_2548);
    }
    }
    stringBuffer.append(TEXT_2549);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2550);
    }
    stringBuffer.append(TEXT_2551);
    }
    if (hasCheckedException) {/*{*/
    stringBuffer.append(TEXT_2552);
    stringBuffer.append(genModel.getImportedName("java.lang.Throwable"));
    stringBuffer.append(TEXT_2553);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2554);
    }
    }
    stringBuffer.append(TEXT_2555);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2556);
    } else {
    stringBuffer.append(TEXT_2557);
    }
    stringBuffer.append(TEXT_2558);
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2559);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2560);
    }
    stringBuffer.append(TEXT_2561);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2562);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2563);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2564);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2565);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2567);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2568);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2569);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2570);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2571);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2572);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2573);
    }
    stringBuffer.append(TEXT_2574);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2577);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2578);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2579);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2580);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2581);
    }
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2583);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2585);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2586);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_2587);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2589);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2590);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2591);
    }
    stringBuffer.append(TEXT_2592);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2593);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2594);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2595);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2596);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2597);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2598);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2599);
    } else {
    stringBuffer.append(TEXT_2600);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2601);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2602);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2603);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2604);
    }
    } else {
    stringBuffer.append(TEXT_2605);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2606);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2607);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2608);
    if (isGWT) {
    stringBuffer.append(TEXT_2609);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_2610);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2612);
    if (!isJDK50 && keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2613);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2614);
    } else {
    stringBuffer.append(TEXT_2615);
    }
    stringBuffer.append(TEXT_2616);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2617);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2618);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2619);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2620);
    }
    stringBuffer.append(TEXT_2621);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2622);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2623);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2624);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2625);
    } else {
    stringBuffer.append(TEXT_2626);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2627);
    }
    stringBuffer.append(TEXT_2628);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2629);
    if (!isJDK50 && valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2631);
    } else {
    stringBuffer.append(TEXT_2632);
    }
    stringBuffer.append(TEXT_2633);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2635);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2636);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2637);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2638);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2639);
    }
    stringBuffer.append(TEXT_2640);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2641);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2642);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2644);
    } else {
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2646);
    }
    stringBuffer.append(TEXT_2647);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2648);
    }
    stringBuffer.append(TEXT_2649);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2650);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2652);
    }
    if (isImplementation) {
    if (!UML2GenModelUtil.isOperationsClasses(genPackage) && UML2GenModelUtil.hasOCLOperationBodies(genClass) && (!UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass()) || UML2GenModelUtil.isOperationsClasses(genClass.getClassExtendsGenClass().getGenPackage()))) {
    stringBuffer.append(TEXT_2653);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2654);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2655);
    }
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2656);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2657);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2659);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2660);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2661);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2662);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2664);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2665);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2666);
    }
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2668);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2670);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2671);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2672);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2674);
    } else {
    stringBuffer.append(TEXT_2675);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2676);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2677);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2679);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2680);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2681);
    }
    stringBuffer.append(TEXT_2682);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2683);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2684);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2685);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2687);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2689);
    }
    stringBuffer.append(TEXT_2690);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2691);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2692);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2693);
    } else {
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2695);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2697);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2698);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2699);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2700);
    }
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2702);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2703);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2704);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2706);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2707);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2708);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2709);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2710);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2711);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2712);
    } else {
    stringBuffer.append(TEXT_2713);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2714);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2715);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
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
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2720);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2721);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2722);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2723);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2724);
    } else {
    stringBuffer.append(TEXT_2725);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2726);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2727);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2728);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2729);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2730);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2731);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2732);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2733);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2734);
    }
    }
    }
    stringBuffer.append(TEXT_2735);
    if (isJDK50) { //isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2736);
    }
    }
    stringBuffer.append(TEXT_2737);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2738);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2739);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2740);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
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
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2754);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2755);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2756);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2757);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2758);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2759);
    }
    } else {
    stringBuffer.append(TEXT_2760);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2762);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2763);
    }
    }
    } else {
    stringBuffer.append(TEXT_2764);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2765);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2766);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2768);
    } else {
    stringBuffer.append(TEXT_2769);
    }
    }
    stringBuffer.append(TEXT_2770);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2771);
    if (isJDK50) { //getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2772);
    }
    }
    stringBuffer.append(TEXT_2773);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2774);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2775);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType(genClass).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_2776);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2777);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2780);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2781);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2782);
    } else {
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2784);
    }
    } else {
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2786);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2787);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2788);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2789);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2790);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2791);
    } else {
    stringBuffer.append(TEXT_2792);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2793);
    }
    }
    stringBuffer.append(TEXT_2794);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2795);
    if (isJDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2796);
    }
    }
    stringBuffer.append(TEXT_2797);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2798);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2799);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2800);
    } else {
    stringBuffer.append(TEXT_2801);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2802);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2803);
    }
    stringBuffer.append(TEXT_2804);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2805);
    if (isJDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2806);
    }
    }
    stringBuffer.append(TEXT_2807);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2808);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2809);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2811);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2812);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2813);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2814);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2815);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2816);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2817);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2818);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2819);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2820);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2821);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2822);
    }
    stringBuffer.append(TEXT_2823);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2824);
    } else {
    stringBuffer.append(TEXT_2825);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2826);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2827);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2828);
    }
    stringBuffer.append(TEXT_2829);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2830);
    }
    }
    stringBuffer.append(TEXT_2831);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2832);
    if (isJDK50) { //setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2833);
    }
    }
    stringBuffer.append(TEXT_2834);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2835);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2836);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2837);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2838);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2839);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2840);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2841);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2842);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2843);
    }
    stringBuffer.append(TEXT_2844);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2845);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2846);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2847);
    }
    stringBuffer.append(TEXT_2848);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2849);
    }
    stringBuffer.append(TEXT_2850);
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2851);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2852);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2853);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2854);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2855);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2856);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2857);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2858);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2859);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2860);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2861);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2862);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2863);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2864);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_2865);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2866);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2867);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2868);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2869);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2870);
    } else {
    stringBuffer.append(TEXT_2871);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2872);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2873);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2874);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2875);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2876);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2877);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2878);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2879);
    } else {
    stringBuffer.append(TEXT_2880);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2881);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2882);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2883);
    }
    }
    stringBuffer.append(TEXT_2884);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2885);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2886);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2887);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2888);
    }
    stringBuffer.append(TEXT_2889);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2890);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2891);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2892);
    }
    } else {
    stringBuffer.append(TEXT_2893);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_2894);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2895);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2896);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2897);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2898);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2899);
    }
    stringBuffer.append(TEXT_2900);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2901);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2902);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2903);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2904);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2905);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2906);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2907);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2908);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2909);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2910);
    } else {
    stringBuffer.append(TEXT_2911);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2912);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2913);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2914);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2915);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2916);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2917);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2918);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2919);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2920);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2921);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2922);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2923);
    index++;}
    stringBuffer.append(TEXT_2924);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2925);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2926);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2927);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2928);
    }
    stringBuffer.append(TEXT_2929);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2930);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2931);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2932);
    }
    stringBuffer.append(TEXT_2933);
    } else {
    stringBuffer.append(TEXT_2934);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2935);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2936);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2937);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2938);
    }
    } else {
    stringBuffer.append(TEXT_2939);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2940);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2941);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2942);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2943);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2944);
    } else {
    stringBuffer.append(TEXT_2945);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2946);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2947);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2948);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2949);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2950);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_2951);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2952);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2953);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2954);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2955);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2956);
    } else {
    stringBuffer.append(TEXT_2957);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2958);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2959);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2960);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2961);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2962);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2963);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2964);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2965);
    } else {
    stringBuffer.append(TEXT_2966);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2967);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2968);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2969);
    }
    }
    stringBuffer.append(TEXT_2970);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2971);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2972);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2973);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2974);
    }
    stringBuffer.append(TEXT_2975);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2976);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2977);
    }
    } else {
    stringBuffer.append(TEXT_2978);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_2979);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2980);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2981);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2982);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2983);
    }
    stringBuffer.append(TEXT_2984);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2985);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2986);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2987);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2988);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2989);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_2990);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2991);
    } else {
    stringBuffer.append(TEXT_2992);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2993);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2994);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2995);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2996);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2997);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2998);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2999);
    } else {
    stringBuffer.append(TEXT_3000);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3001);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3002);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3003);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3004);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_3005);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3006);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3007);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3008);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3009);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3010);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3011);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3012);
    index++;}
    stringBuffer.append(TEXT_3013);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3014);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3015);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3016);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3017);
    }
    stringBuffer.append(TEXT_3018);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3019);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3020);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3021);
    }
    stringBuffer.append(TEXT_3022);
    } else {
    stringBuffer.append(TEXT_3023);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3024);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3025);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3026);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_3027);
    }
    } else {
    stringBuffer.append(TEXT_3028);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3029);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3030);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3031);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3032);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3033);
    } else {
    stringBuffer.append(TEXT_3034);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3035);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_3036);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3037);
    }
    index++;}
    }
    stringBuffer.append(TEXT_3038);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3039);
    }
    stringBuffer.append(TEXT_3040);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3041);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3042);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3043);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3044);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3045);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3046);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3047);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3048);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3049);
    }
    stringBuffer.append(TEXT_3050);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3051);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3052);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3053);
    }
    } else {
    stringBuffer.append(TEXT_3054);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3055);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3056);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3057);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3058);
    }
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3059);
    }
    stringBuffer.append(TEXT_3060);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3061);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3062);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3063);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3064);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3065);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3066);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3067);
    }
    stringBuffer.append(TEXT_3068);
    }
    }
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3069);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3070);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3071);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3072);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3073);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3074);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3075);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3076);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3077);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3078);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3079);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3080);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3081);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3082);
    }
    stringBuffer.append(TEXT_3083);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3084);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3085);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3086);
    }
    } else {
    stringBuffer.append(TEXT_3087);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
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
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3096);
    }
    stringBuffer.append(TEXT_3097);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3098);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3099);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3100);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3101);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3102);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3103);
    }
    stringBuffer.append(TEXT_3104);
    if (isJDK50) {
    stringBuffer.append(TEXT_3105);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3106);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_3107);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3108);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3109);
    } else {
    stringBuffer.append(TEXT_3110);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3111);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_3112);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3113);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3114);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3115);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3116);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3117);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3118);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3119);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3120);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3121);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3122);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3123);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3124);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3125);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3126);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_3127);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_3128);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_3129);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3130);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_3131);
    }
    }
    stringBuffer.append(TEXT_3132);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3133);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3134);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3135);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3136);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_3137);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3138);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3139);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3140);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3141);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_3142);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_3143);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3144);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3145);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3146);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3147);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3148);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3149);
    } else {
    stringBuffer.append(TEXT_3150);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3151);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3152);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3153);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3154);
    }
    stringBuffer.append(TEXT_3155);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3156);
    index++;}
    stringBuffer.append(TEXT_3157);
    } else {
    stringBuffer.append(TEXT_3158);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3159);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3160);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3161);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3162);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3163);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3164);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3165);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3166);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3167);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3168);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3169);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3170);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3171);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3172);
    } else {
    stringBuffer.append(TEXT_3173);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3174);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3175);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3176);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3177);
    }
    stringBuffer.append(TEXT_3178);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3179);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3180);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3181);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3182);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3183);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3184);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3185);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3186);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3187);
    } else {
    stringBuffer.append(TEXT_3188);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3189);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3190);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3191);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3192);
    }
    stringBuffer.append(TEXT_3193);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3194);
    index++;}
    }
    stringBuffer.append(TEXT_3195);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3196);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3197);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3198);
    }
    stringBuffer.append(TEXT_3199);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3200);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3201);
    }
    stringBuffer.append(TEXT_3202);
    } else {
    stringBuffer.append(TEXT_3203);
    }
    stringBuffer.append(TEXT_3204);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_3205);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3206);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_3207);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3208);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3209);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_3210);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3211);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3212);
    } else {
    stringBuffer.append(TEXT_3213);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3214);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3215);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3216);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3217);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3218);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3219);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3220);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3221);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3222);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3223);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3224);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3225);
    } else {
    stringBuffer.append(TEXT_3226);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3227);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3228);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3229);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3230);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3231);
    } else {
    stringBuffer.append(TEXT_3232);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3233);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3234);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3235);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3236);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3237);
    } else {
    stringBuffer.append(TEXT_3238);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3239);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_3240);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3241);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3242);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3243);
    } else {
    stringBuffer.append(TEXT_3244);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3245);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3246);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3247);
    }
    } else {
    stringBuffer.append(TEXT_3248);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3249);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3250);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3251);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3252);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3253);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3254);
    } else {
    stringBuffer.append(TEXT_3255);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3256);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3257);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3258);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3259);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3260);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3261);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3262);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3263);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3264);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3265);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3266);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3267);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3268);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3269);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3270);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3271);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3272);
    } else {
    stringBuffer.append(TEXT_3273);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3274);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3275);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3276);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3277);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3278);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3279);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_3280);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3281);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3282);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3283);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3284);
    }
    stringBuffer.append(TEXT_3285);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3286);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_3287);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_3288);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3289);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_3290);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3291);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_3292);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_3293);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3294);
    } else {
    stringBuffer.append(TEXT_3295);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3296);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_3297);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3298);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3299);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3300);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3301);
    } else {
    stringBuffer.append(TEXT_3302);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3303);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3304);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3305);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_3306);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_3307);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3308);
    } else {
    stringBuffer.append(TEXT_3309);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3310);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3311);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_3312);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_3313);
    if (isJDK50) { //genOperation.annotations.insert.javajetinc
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_3314);
    }
    }
    stringBuffer.append(TEXT_3315);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_3316);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3317);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_3318);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_3319);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_3320);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3321);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3322);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_3323);
    } else {
    stringBuffer.append(TEXT_3324);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3325);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3326);
    }
    }
    stringBuffer.append(TEXT_3327);
    }
    }
    stringBuffer.append(TEXT_3328);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_3329);
    return stringBuffer.toString();
  }
}
