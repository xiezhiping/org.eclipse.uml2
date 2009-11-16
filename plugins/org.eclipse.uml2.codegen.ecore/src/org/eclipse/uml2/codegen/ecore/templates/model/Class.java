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
  protected final String TEXT_56 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] ";
  protected final String TEXT_57 = ";" + NL;
  protected final String TEXT_58 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_59 = ";" + NL;
  protected final String TEXT_60 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_61 = " = 0;" + NL;
  protected final String TEXT_62 = NL + "\t/**" + NL + "\t * The cached setting delegate for the '{@link #";
  protected final String TEXT_63 = "() <em>";
  protected final String TEXT_64 = "</em>}' ";
  protected final String TEXT_65 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_66 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_67 = ".Internal.SettingDelegate ";
  protected final String TEXT_68 = "__ESETTING_DELEGATE = ((";
  protected final String TEXT_69 = ".Internal)";
  protected final String TEXT_70 = ").getSettingDelegate();" + NL;
  protected final String TEXT_71 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_72 = "() <em>";
  protected final String TEXT_73 = "</em>}' ";
  protected final String TEXT_74 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_75 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_76 = " ";
  protected final String TEXT_77 = ";" + NL;
  protected final String TEXT_78 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_79 = "() <em>";
  protected final String TEXT_80 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_81 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_82 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_83 = NL + "\tprotected static final ";
  protected final String TEXT_84 = "[] ";
  protected final String TEXT_85 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_86 = " [0]";
  protected final String TEXT_87 = ";" + NL;
  protected final String TEXT_88 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_89 = "() <em>";
  protected final String TEXT_90 = "</em>}' ";
  protected final String TEXT_91 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_92 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_93 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_94 = NL + "\tprotected static final ";
  protected final String TEXT_95 = " ";
  protected final String TEXT_96 = "; // TODO The default value literal \"";
  protected final String TEXT_97 = "\" is not valid.";
  protected final String TEXT_98 = " = ";
  protected final String TEXT_99 = ";";
  protected final String TEXT_100 = NL;
  protected final String TEXT_101 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_102 = " = 0;" + NL;
  protected final String TEXT_103 = NL + "\t/**" + NL + "\t * The offset of the flags representing the value of the '{@link #";
  protected final String TEXT_104 = "() <em>";
  protected final String TEXT_105 = "</em>}' ";
  protected final String TEXT_106 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_107 = "_EFLAG_OFFSET = ";
  protected final String TEXT_108 = ";" + NL + "" + NL + "\t/**" + NL + "\t * The flags representing the default value of the '{@link #";
  protected final String TEXT_109 = "() <em>";
  protected final String TEXT_110 = "</em>}' ";
  protected final String TEXT_111 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_112 = "_EFLAG_DEFAULT = ";
  protected final String TEXT_113 = ".ordinal()";
  protected final String TEXT_114 = ".VALUES.indexOf(";
  protected final String TEXT_115 = ")";
  protected final String TEXT_116 = " << ";
  protected final String TEXT_117 = "_EFLAG_OFFSET;" + NL + "" + NL + "\t/**" + NL + "\t * The array of enumeration values for '{@link ";
  protected final String TEXT_118 = " ";
  protected final String TEXT_119 = "}'" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprivate static final ";
  protected final String TEXT_120 = "[] ";
  protected final String TEXT_121 = "_EFLAG_VALUES = ";
  protected final String TEXT_122 = ".values()";
  protected final String TEXT_123 = "(";
  protected final String TEXT_124 = "[])";
  protected final String TEXT_125 = ".VALUES.toArray(new ";
  protected final String TEXT_126 = "[";
  protected final String TEXT_127 = ".VALUES.size()])";
  protected final String TEXT_128 = ";" + NL;
  protected final String TEXT_129 = NL + "\t/**" + NL + "\t * The flag";
  protected final String TEXT_130 = " representing the value of the '{@link #";
  protected final String TEXT_131 = "() <em>";
  protected final String TEXT_132 = "</em>}' ";
  protected final String TEXT_133 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_134 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_135 = "_EFLAG = ";
  protected final String TEXT_136 = " << ";
  protected final String TEXT_137 = "_EFLAG_OFFSET";
  protected final String TEXT_138 = ";" + NL;
  protected final String TEXT_139 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_140 = "() <em>";
  protected final String TEXT_141 = "</em>}' ";
  protected final String TEXT_142 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_143 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_144 = " ";
  protected final String TEXT_145 = " = ";
  protected final String TEXT_146 = ";" + NL;
  protected final String TEXT_147 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_148 = " = 0;" + NL;
  protected final String TEXT_149 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_150 = " ";
  protected final String TEXT_151 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_152 = "_ESETFLAG = 1 << ";
  protected final String TEXT_153 = ";" + NL;
  protected final String TEXT_154 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_155 = " ";
  protected final String TEXT_156 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_157 = "ESet;" + NL;
  protected final String TEXT_158 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_159 = " = ";
  protected final String TEXT_160 = ".getFeatureID(";
  protected final String TEXT_161 = ") - ";
  protected final String TEXT_162 = ";" + NL;
  protected final String TEXT_163 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_164 = " = ";
  protected final String TEXT_165 = ".getFeatureID(";
  protected final String TEXT_166 = ") - ";
  protected final String TEXT_167 = ";" + NL;
  protected final String TEXT_168 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int \"EOPERATION_OFFSET_CORRECTION\" = ";
  protected final String TEXT_169 = ".getOperationID(";
  protected final String TEXT_170 = ") - ";
  protected final String TEXT_171 = ";" + NL;
  protected final String TEXT_172 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_173 = "public";
  protected final String TEXT_174 = "protected";
  protected final String TEXT_175 = " ";
  protected final String TEXT_176 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_177 = NL + "\t\t";
  protected final String TEXT_178 = " |= ";
  protected final String TEXT_179 = "_EFLAG";
  protected final String TEXT_180 = "_DEFAULT";
  protected final String TEXT_181 = ";";
  protected final String TEXT_182 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_183 = NL + "\t@Override";
  protected final String TEXT_184 = NL + "\tprotected ";
  protected final String TEXT_185 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_186 = ";" + NL + "\t}" + NL;
  protected final String TEXT_187 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_188 = NL + "\t@Override";
  protected final String TEXT_189 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_190 = ";" + NL + "\t}" + NL;
  protected final String TEXT_191 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_192 = NL + "\t";
  protected final String TEXT_193 = "[] ";
  protected final String TEXT_194 = "();" + NL;
  protected final String TEXT_195 = NL + "\tpublic ";
  protected final String TEXT_196 = "[] ";
  protected final String TEXT_197 = "()" + NL + "\t{";
  protected final String TEXT_198 = NL + "\t\t";
  protected final String TEXT_199 = " list = (";
  protected final String TEXT_200 = ")";
  protected final String TEXT_201 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_202 = "(";
  protected final String TEXT_203 = "[])";
  protected final String TEXT_204 = "_EEMPTY_ARRAY;";
  protected final String TEXT_205 = NL + "\t\tif (";
  protected final String TEXT_206 = " == null || ";
  protected final String TEXT_207 = ".isEmpty()) return ";
  protected final String TEXT_208 = "(";
  protected final String TEXT_209 = "[])";
  protected final String TEXT_210 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_211 = " list = (";
  protected final String TEXT_212 = ")";
  protected final String TEXT_213 = ";";
  protected final String TEXT_214 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_215 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_216 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_217 = NL + "\t";
  protected final String TEXT_218 = " get";
  protected final String TEXT_219 = "(int index);" + NL;
  protected final String TEXT_220 = NL + "\tpublic ";
  protected final String TEXT_221 = " get";
  protected final String TEXT_222 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_223 = "(";
  protected final String TEXT_224 = ")";
  protected final String TEXT_225 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_226 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_227 = NL + "\tint get";
  protected final String TEXT_228 = "Length();" + NL;
  protected final String TEXT_229 = NL + "\tpublic int get";
  protected final String TEXT_230 = "Length()" + NL + "\t{";
  protected final String TEXT_231 = NL + "\t\treturn ";
  protected final String TEXT_232 = "().size();";
  protected final String TEXT_233 = NL + "\t\treturn ";
  protected final String TEXT_234 = " == null ? 0 : ";
  protected final String TEXT_235 = ".size();";
  protected final String TEXT_236 = NL + "\t}" + NL;
  protected final String TEXT_237 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_238 = NL + "\tvoid set";
  protected final String TEXT_239 = "(";
  protected final String TEXT_240 = "[] new";
  protected final String TEXT_241 = ");" + NL;
  protected final String TEXT_242 = NL + "\tpublic void set";
  protected final String TEXT_243 = "(";
  protected final String TEXT_244 = "[] new";
  protected final String TEXT_245 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_246 = ")";
  protected final String TEXT_247 = "()).setData(new";
  protected final String TEXT_248 = ".length, new";
  protected final String TEXT_249 = ");" + NL + "\t}" + NL;
  protected final String TEXT_250 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_251 = NL + "\tvoid set";
  protected final String TEXT_252 = "(int index, ";
  protected final String TEXT_253 = " element);" + NL;
  protected final String TEXT_254 = NL + "\tpublic void set";
  protected final String TEXT_255 = "(int index, ";
  protected final String TEXT_256 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_257 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_258 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_259 = "</b></em>' ";
  protected final String TEXT_260 = ".";
  protected final String TEXT_261 = NL + "\t * The key is of type ";
  protected final String TEXT_262 = "list of {@link ";
  protected final String TEXT_263 = "}";
  protected final String TEXT_264 = "{@link ";
  protected final String TEXT_265 = "}";
  protected final String TEXT_266 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_267 = "list of {@link ";
  protected final String TEXT_268 = "}";
  protected final String TEXT_269 = "{@link ";
  protected final String TEXT_270 = "}";
  protected final String TEXT_271 = ",";
  protected final String TEXT_272 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_273 = "}";
  protected final String TEXT_274 = ".";
  protected final String TEXT_275 = NL + "\t * The default value is <code>";
  protected final String TEXT_276 = "</code>.";
  protected final String TEXT_277 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_278 = "}.";
  protected final String TEXT_279 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_280 = "#";
  protected final String TEXT_281 = " <em>";
  protected final String TEXT_282 = "</em>}'.";
  protected final String TEXT_283 = NL + "\t * <p>" + NL + "\t * This feature subsets the following features:" + NL + "\t * <ul>";
  protected final String TEXT_284 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_285 = "#";
  protected final String TEXT_286 = "() <em>";
  protected final String TEXT_287 = "</em>}'</li>";
  protected final String TEXT_288 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_289 = NL + "\t * <p>" + NL + "\t * This feature redefines the following features:" + NL + "\t * <ul>";
  protected final String TEXT_290 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_291 = "#";
  protected final String TEXT_292 = "() <em>";
  protected final String TEXT_293 = "</em>}'</li>";
  protected final String TEXT_294 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_295 = NL + "\t * This feature is a derived union.";
  protected final String TEXT_296 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_297 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_298 = "</em>' ";
  protected final String TEXT_299 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_300 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_301 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_302 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_303 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_304 = "</em>' ";
  protected final String TEXT_305 = ".";
  protected final String TEXT_306 = NL + "\t * @see ";
  protected final String TEXT_307 = NL + "\t * @see #isSet";
  protected final String TEXT_308 = "()";
  protected final String TEXT_309 = NL + "\t * @see #unset";
  protected final String TEXT_310 = "()";
  protected final String TEXT_311 = NL + "\t * @see #set";
  protected final String TEXT_312 = "(";
  protected final String TEXT_313 = ")";
  protected final String TEXT_314 = NL + "\t * @see ";
  protected final String TEXT_315 = "#get";
  protected final String TEXT_316 = "()";
  protected final String TEXT_317 = NL + "\t * @see ";
  protected final String TEXT_318 = "#";
  protected final String TEXT_319 = NL + "\t * @model ";
  protected final String TEXT_320 = NL + "\t *        ";
  protected final String TEXT_321 = NL + "\t * @model";
  protected final String TEXT_322 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_323 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_324 = NL + "\t@Override";
  protected final String TEXT_325 = NL + "\t";
  protected final String TEXT_326 = " ";
  protected final String TEXT_327 = "();" + NL;
  protected final String TEXT_328 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_329 = NL + "\tpublic ";
  protected final String TEXT_330 = " ";
  protected final String TEXT_331 = "_";
  protected final String TEXT_332 = "()" + NL + "\t{";
  protected final String TEXT_333 = NL + "\t\treturn ";
  protected final String TEXT_334 = "(";
  protected final String TEXT_335 = "(";
  protected final String TEXT_336 = ")eDynamicGet(";
  protected final String TEXT_337 = ", ";
  protected final String TEXT_338 = ", true, ";
  protected final String TEXT_339 = ")";
  protected final String TEXT_340 = ").";
  protected final String TEXT_341 = "()";
  protected final String TEXT_342 = ";";
  protected final String TEXT_343 = NL + "\t\treturn ";
  protected final String TEXT_344 = "(";
  protected final String TEXT_345 = "(";
  protected final String TEXT_346 = ")eGet(";
  protected final String TEXT_347 = ", true)";
  protected final String TEXT_348 = ").";
  protected final String TEXT_349 = "()";
  protected final String TEXT_350 = ";";
  protected final String TEXT_351 = NL + "\t\treturn ";
  protected final String TEXT_352 = "(";
  protected final String TEXT_353 = "(";
  protected final String TEXT_354 = ")";
  protected final String TEXT_355 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false)";
  protected final String TEXT_356 = ").";
  protected final String TEXT_357 = "()";
  protected final String TEXT_358 = ";";
  protected final String TEXT_359 = NL + "\t\t";
  protected final String TEXT_360 = " ";
  protected final String TEXT_361 = " = (";
  protected final String TEXT_362 = ")eVirtualGet(";
  protected final String TEXT_363 = ");";
  protected final String TEXT_364 = NL + "\t\tif (";
  protected final String TEXT_365 = " == null)" + NL + "\t\t{";
  protected final String TEXT_366 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_367 = ", ";
  protected final String TEXT_368 = " = new ";
  protected final String TEXT_369 = ");";
  protected final String TEXT_370 = NL + "\t\t\t";
  protected final String TEXT_371 = " = new ";
  protected final String TEXT_372 = ";";
  protected final String TEXT_373 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_374 = ";";
  protected final String TEXT_375 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_376 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_377 = ")eContainer();";
  protected final String TEXT_378 = NL + "\t\t";
  protected final String TEXT_379 = " ";
  protected final String TEXT_380 = " = (";
  protected final String TEXT_381 = ")eVirtualGet(";
  protected final String TEXT_382 = ", ";
  protected final String TEXT_383 = ");";
  protected final String TEXT_384 = NL + "\t\tif (";
  protected final String TEXT_385 = " != null && ";
  protected final String TEXT_386 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_387 = " old";
  protected final String TEXT_388 = " = (";
  protected final String TEXT_389 = ")";
  protected final String TEXT_390 = ";" + NL + "\t\t\t";
  protected final String TEXT_391 = " = ";
  protected final String TEXT_392 = "eResolveProxy(old";
  protected final String TEXT_393 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_394 = " != old";
  protected final String TEXT_395 = ")" + NL + "\t\t\t{";
  protected final String TEXT_396 = NL + "\t\t\t\t";
  protected final String TEXT_397 = " new";
  protected final String TEXT_398 = " = (";
  protected final String TEXT_399 = ")";
  protected final String TEXT_400 = ";";
  protected final String TEXT_401 = NL + "\t\t\t\t";
  protected final String TEXT_402 = " msgs = old";
  protected final String TEXT_403 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_404 = ", null, null);";
  protected final String TEXT_405 = NL + "\t\t\t\t";
  protected final String TEXT_406 = " msgs =  old";
  protected final String TEXT_407 = ".eInverseRemove(this, ";
  protected final String TEXT_408 = ", ";
  protected final String TEXT_409 = ".class, null);";
  protected final String TEXT_410 = NL + "\t\t\t\tif (new";
  protected final String TEXT_411 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_412 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_413 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_414 = ", null, msgs);";
  protected final String TEXT_415 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_416 = ".eInverseAdd(this, ";
  protected final String TEXT_417 = ", ";
  protected final String TEXT_418 = ".class, msgs);";
  protected final String TEXT_419 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_420 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_421 = ", ";
  protected final String TEXT_422 = ");";
  protected final String TEXT_423 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_424 = "(this, ";
  protected final String TEXT_425 = ".RESOLVE, ";
  protected final String TEXT_426 = ", old";
  protected final String TEXT_427 = ", ";
  protected final String TEXT_428 = "));";
  protected final String TEXT_429 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_430 = NL + "\t\treturn (";
  protected final String TEXT_431 = ")eVirtualGet(";
  protected final String TEXT_432 = ", ";
  protected final String TEXT_433 = ");";
  protected final String TEXT_434 = NL + "\t\treturn (";
  protected final String TEXT_435 = " & ";
  protected final String TEXT_436 = "_EFLAG) != 0;";
  protected final String TEXT_437 = NL + "\t\treturn ";
  protected final String TEXT_438 = "_EFLAG_VALUES[(";
  protected final String TEXT_439 = " & ";
  protected final String TEXT_440 = "_EFLAG) >>> ";
  protected final String TEXT_441 = "_EFLAG_OFFSET];";
  protected final String TEXT_442 = NL + "\t\treturn ";
  protected final String TEXT_443 = ";";
  protected final String TEXT_444 = NL + "\t\t";
  protected final String TEXT_445 = " ";
  protected final String TEXT_446 = " = basicGet";
  protected final String TEXT_447 = "();" + NL + "\t\treturn ";
  protected final String TEXT_448 = " != null && ";
  protected final String TEXT_449 = ".eIsProxy() ? ";
  protected final String TEXT_450 = "eResolveProxy((";
  protected final String TEXT_451 = ")";
  protected final String TEXT_452 = ") : ";
  protected final String TEXT_453 = ";";
  protected final String TEXT_454 = NL + "\t\treturn new ";
  protected final String TEXT_455 = "((";
  protected final String TEXT_456 = ".Internal)((";
  protected final String TEXT_457 = ".Internal.Wrapper)get";
  protected final String TEXT_458 = "()).featureMap().";
  protected final String TEXT_459 = "list(";
  protected final String TEXT_460 = "));";
  protected final String TEXT_461 = NL + "\t\treturn (";
  protected final String TEXT_462 = ")get";
  protected final String TEXT_463 = "().";
  protected final String TEXT_464 = "list(";
  protected final String TEXT_465 = ");";
  protected final String TEXT_466 = NL + "\t\treturn ((";
  protected final String TEXT_467 = ".Internal.Wrapper)get";
  protected final String TEXT_468 = "()).featureMap().list(";
  protected final String TEXT_469 = ");";
  protected final String TEXT_470 = NL + "\t\treturn get";
  protected final String TEXT_471 = "().list(";
  protected final String TEXT_472 = ");";
  protected final String TEXT_473 = NL + "\t\treturn ";
  protected final String TEXT_474 = "(";
  protected final String TEXT_475 = "(";
  protected final String TEXT_476 = ")";
  protected final String TEXT_477 = "((";
  protected final String TEXT_478 = ".Internal.Wrapper)get";
  protected final String TEXT_479 = "()).featureMap().get(";
  protected final String TEXT_480 = ", true)";
  protected final String TEXT_481 = ").";
  protected final String TEXT_482 = "()";
  protected final String TEXT_483 = ";";
  protected final String TEXT_484 = NL + "\t\treturn ";
  protected final String TEXT_485 = "(";
  protected final String TEXT_486 = "(";
  protected final String TEXT_487 = ")";
  protected final String TEXT_488 = "get";
  protected final String TEXT_489 = "().get(";
  protected final String TEXT_490 = ", true)";
  protected final String TEXT_491 = ").";
  protected final String TEXT_492 = "()";
  protected final String TEXT_493 = ";";
  protected final String TEXT_494 = NL + "\t\t";
  protected final String TEXT_495 = NL + "\t\t";
  protected final String TEXT_496 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_497 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_498 = NL + "\t\t\t";
  protected final String TEXT_499 = " result = (";
  protected final String TEXT_500 = ") cache.get(";
  protected final String TEXT_501 = "eResource(), ";
  protected final String TEXT_502 = "this, ";
  protected final String TEXT_503 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_504 = "eResource(), ";
  protected final String TEXT_505 = "this, ";
  protected final String TEXT_506 = ", result = ";
  protected final String TEXT_507 = "new ";
  protected final String TEXT_508 = "(";
  protected final String TEXT_509 = ".";
  protected final String TEXT_510 = "(this)";
  protected final String TEXT_511 = ")";
  protected final String TEXT_512 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_513 = ".";
  protected final String TEXT_514 = "()";
  protected final String TEXT_515 = ";" + NL + "\t\t}";
  protected final String TEXT_516 = NL + "\t\treturn ";
  protected final String TEXT_517 = ".";
  protected final String TEXT_518 = "(this);";
  protected final String TEXT_519 = NL + "\t\t";
  protected final String TEXT_520 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_521 = " eResource = eResource();";
  protected final String TEXT_522 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_523 = NL + "\t\t\t";
  protected final String TEXT_524 = " ";
  protected final String TEXT_525 = " = (";
  protected final String TEXT_526 = ") cache.get(eResource, this, ";
  protected final String TEXT_527 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_528 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_529 = ", ";
  protected final String TEXT_530 = " = new ";
  protected final String TEXT_531 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_532 = ";" + NL + "\t\t}";
  protected final String TEXT_533 = NL + "\t\treturn new ";
  protected final String TEXT_534 = ";";
  protected final String TEXT_535 = NL + "\t\t";
  protected final String TEXT_536 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_537 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_538 = " method = getClass().getMethod(\"";
  protected final String TEXT_539 = "\", null);";
  protected final String TEXT_540 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_541 = NL + "\t\t\t\t";
  protected final String TEXT_542 = " ";
  protected final String TEXT_543 = " = (";
  protected final String TEXT_544 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_545 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_546 = " union = ";
  protected final String TEXT_547 = "Helper(new ";
  protected final String TEXT_548 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_549 = " = new ";
  protected final String TEXT_550 = "(this, ";
  protected final String TEXT_551 = "null";
  protected final String TEXT_552 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_553 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_554 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_555 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_556 = NL + "\t\t\t";
  protected final String TEXT_557 = " ";
  protected final String TEXT_558 = " = (";
  protected final String TEXT_559 = ") cache.get(eResource(), this, ";
  protected final String TEXT_560 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_561 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_562 = " union = ";
  protected final String TEXT_563 = "Helper(new ";
  protected final String TEXT_564 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_565 = ", ";
  protected final String TEXT_566 = " = new ";
  protected final String TEXT_567 = "(this, ";
  protected final String TEXT_568 = "null";
  protected final String TEXT_569 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_570 = ";";
  protected final String TEXT_571 = NL + "\t\t}";
  protected final String TEXT_572 = NL + "\t\t";
  protected final String TEXT_573 = " union = ";
  protected final String TEXT_574 = "Helper(new ";
  protected final String TEXT_575 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_576 = "(this, ";
  protected final String TEXT_577 = "null";
  protected final String TEXT_578 = ", union.size(), union.toArray());";
  protected final String TEXT_579 = NL + "\t\tif (isSet";
  protected final String TEXT_580 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_581 = "();" + NL + "\t\t}";
  protected final String TEXT_582 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_583 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_584 = "();" + NL + "\t\t}";
  protected final String TEXT_585 = NL + "\t\t";
  protected final String TEXT_586 = " ";
  protected final String TEXT_587 = " = ";
  protected final String TEXT_588 = "();" + NL + "\t\tif (";
  protected final String TEXT_589 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_590 = ";" + NL + "\t\t}";
  protected final String TEXT_591 = NL + "\t\treturn ";
  protected final String TEXT_592 = "super.";
  protected final String TEXT_593 = "()";
  protected final String TEXT_594 = "null";
  protected final String TEXT_595 = ";";
  protected final String TEXT_596 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_597 = "' ";
  protected final String TEXT_598 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_599 = NL + "\t}" + NL;
  protected final String TEXT_600 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_601 = NL + "\t@Override";
  protected final String TEXT_602 = NL + "\tpublic ";
  protected final String TEXT_603 = " basicGet";
  protected final String TEXT_604 = "()" + NL + "\t{";
  protected final String TEXT_605 = NL + "\t\treturn (";
  protected final String TEXT_606 = ")eDynamicGet(";
  protected final String TEXT_607 = ", ";
  protected final String TEXT_608 = ", false, ";
  protected final String TEXT_609 = ");";
  protected final String TEXT_610 = NL + "\t\treturn ";
  protected final String TEXT_611 = "(";
  protected final String TEXT_612 = "(";
  protected final String TEXT_613 = ")";
  protected final String TEXT_614 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false)";
  protected final String TEXT_615 = ").";
  protected final String TEXT_616 = "()";
  protected final String TEXT_617 = ";";
  protected final String TEXT_618 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_619 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_620 = ")eInternalContainer();";
  protected final String TEXT_621 = NL + "\t\treturn (";
  protected final String TEXT_622 = ")eVirtualGet(";
  protected final String TEXT_623 = ");";
  protected final String TEXT_624 = NL + "\t\treturn ";
  protected final String TEXT_625 = ";";
  protected final String TEXT_626 = NL + "\t\treturn (";
  protected final String TEXT_627 = ")((";
  protected final String TEXT_628 = ".Internal.Wrapper)get";
  protected final String TEXT_629 = "()).featureMap().get(";
  protected final String TEXT_630 = ", false);";
  protected final String TEXT_631 = NL + "\t\treturn (";
  protected final String TEXT_632 = ")get";
  protected final String TEXT_633 = "().get(";
  protected final String TEXT_634 = ", false);";
  protected final String TEXT_635 = NL + "\t\treturn ";
  protected final String TEXT_636 = ".";
  protected final String TEXT_637 = "(this);";
  protected final String TEXT_638 = NL + "\t\tif (isSet";
  protected final String TEXT_639 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_640 = "basicGet";
  protected final String TEXT_641 = "();" + NL + "\t\t}";
  protected final String TEXT_642 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_643 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_644 = "basicGet";
  protected final String TEXT_645 = "();" + NL + "\t\t}";
  protected final String TEXT_646 = NL + "\t\t";
  protected final String TEXT_647 = " ";
  protected final String TEXT_648 = " = ";
  protected final String TEXT_649 = "basicGet";
  protected final String TEXT_650 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_651 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_652 = ";" + NL + "\t\t}";
  protected final String TEXT_653 = NL + "\t\treturn ";
  protected final String TEXT_654 = "super.basicGet";
  protected final String TEXT_655 = "()";
  protected final String TEXT_656 = "null";
  protected final String TEXT_657 = ";";
  protected final String TEXT_658 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_659 = "' ";
  protected final String TEXT_660 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_661 = NL + "\t}" + NL;
  protected final String TEXT_662 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_663 = NL + "\t@Override";
  protected final String TEXT_664 = NL + "\tpublic ";
  protected final String TEXT_665 = " basicSet";
  protected final String TEXT_666 = "(";
  protected final String TEXT_667 = " new";
  protected final String TEXT_668 = ", ";
  protected final String TEXT_669 = " msgs)" + NL + "\t{";
  protected final String TEXT_670 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_671 = ")new";
  protected final String TEXT_672 = ", ";
  protected final String TEXT_673 = ", msgs);";
  protected final String TEXT_674 = NL + "\t\t";
  protected final String TEXT_675 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_676 = NL + "\t\t\t";
  protected final String TEXT_677 = " ";
  protected final String TEXT_678 = " = ";
  protected final String TEXT_679 = "();";
  protected final String TEXT_680 = NL + "\t\t\tObject ";
  protected final String TEXT_681 = " = eVirtualGet(";
  protected final String TEXT_682 = ");";
  protected final String TEXT_683 = NL + "\t\t\tif (";
  protected final String TEXT_684 = " != null && ";
  protected final String TEXT_685 = " != new";
  protected final String TEXT_686 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_687 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_688 = NL + "\t\t\tif (new";
  protected final String TEXT_689 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_690 = NL + "\t\t\t\t";
  protected final String TEXT_691 = " ";
  protected final String TEXT_692 = " = ";
  protected final String TEXT_693 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_694 = ".contains(new";
  protected final String TEXT_695 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_696 = ".add(new";
  protected final String TEXT_697 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_698 = NL + "\t\t\t\t";
  protected final String TEXT_699 = " ";
  protected final String TEXT_700 = " = ";
  protected final String TEXT_701 = "();";
  protected final String TEXT_702 = NL + "\t\t\t\tObject ";
  protected final String TEXT_703 = " = eVirtualGet(";
  protected final String TEXT_704 = ");";
  protected final String TEXT_705 = NL + "\t\t\t\tif (new";
  protected final String TEXT_706 = " != ";
  protected final String TEXT_707 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_708 = "(new";
  protected final String TEXT_709 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_710 = NL + "\t\t\t}";
  protected final String TEXT_711 = NL + "\t\t}";
  protected final String TEXT_712 = NL + "\t\treturn msgs;";
  protected final String TEXT_713 = NL + "\t\tmsgs = eDynamicInverseAdd((";
  protected final String TEXT_714 = ")new";
  protected final String TEXT_715 = ", ";
  protected final String TEXT_716 = ", msgs);";
  protected final String TEXT_717 = NL + "\t\t";
  protected final String TEXT_718 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_719 = NL + "\t\t\t";
  protected final String TEXT_720 = " ";
  protected final String TEXT_721 = " = ";
  protected final String TEXT_722 = "();";
  protected final String TEXT_723 = NL + "\t\t\tObject ";
  protected final String TEXT_724 = " = eVirtualGet(";
  protected final String TEXT_725 = ");";
  protected final String TEXT_726 = NL + "\t\t\tif (";
  protected final String TEXT_727 = " != null && ";
  protected final String TEXT_728 = " != new";
  protected final String TEXT_729 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_730 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_731 = NL + "\t\t\tif (new";
  protected final String TEXT_732 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_733 = NL + "\t\t\t\t";
  protected final String TEXT_734 = " ";
  protected final String TEXT_735 = " = ";
  protected final String TEXT_736 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_737 = ".contains(new";
  protected final String TEXT_738 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_739 = ".add(new";
  protected final String TEXT_740 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_741 = NL + "\t\t\t\t";
  protected final String TEXT_742 = " ";
  protected final String TEXT_743 = " = ";
  protected final String TEXT_744 = "();";
  protected final String TEXT_745 = NL + "\t\t\t\tObject ";
  protected final String TEXT_746 = " = eVirtualGet(";
  protected final String TEXT_747 = ");";
  protected final String TEXT_748 = NL + "\t\t\t\tif (new";
  protected final String TEXT_749 = " != ";
  protected final String TEXT_750 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_751 = "(new";
  protected final String TEXT_752 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_753 = NL + "\t\t\t}";
  protected final String TEXT_754 = NL + "\t\t}";
  protected final String TEXT_755 = NL + "\t\treturn msgs;";
  protected final String TEXT_756 = NL + "\t\tObject old";
  protected final String TEXT_757 = " = eVirtualSet(";
  protected final String TEXT_758 = ", new";
  protected final String TEXT_759 = ");";
  protected final String TEXT_760 = NL + "\t\t";
  protected final String TEXT_761 = " old";
  protected final String TEXT_762 = " = ";
  protected final String TEXT_763 = ";" + NL + "\t\t";
  protected final String TEXT_764 = " = new";
  protected final String TEXT_765 = ";";
  protected final String TEXT_766 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_767 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_768 = NL + "\t\tboolean old";
  protected final String TEXT_769 = "ESet = (";
  protected final String TEXT_770 = " & ";
  protected final String TEXT_771 = "_ESETFLAG) != 0;";
  protected final String TEXT_772 = NL + "\t\t";
  protected final String TEXT_773 = " |= ";
  protected final String TEXT_774 = "_ESETFLAG;";
  protected final String TEXT_775 = NL + "\t\tboolean old";
  protected final String TEXT_776 = "ESet = ";
  protected final String TEXT_777 = "ESet;";
  protected final String TEXT_778 = NL + "\t\t";
  protected final String TEXT_779 = "ESet = true;";
  protected final String TEXT_780 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_781 = NL + "\t\t\t";
  protected final String TEXT_782 = " notification = new ";
  protected final String TEXT_783 = "(this, ";
  protected final String TEXT_784 = ".SET, ";
  protected final String TEXT_785 = ", ";
  protected final String TEXT_786 = "isSetChange ? null : old";
  protected final String TEXT_787 = "old";
  protected final String TEXT_788 = ", new";
  protected final String TEXT_789 = ", ";
  protected final String TEXT_790 = "isSetChange";
  protected final String TEXT_791 = "!old";
  protected final String TEXT_792 = "ESet";
  protected final String TEXT_793 = ");";
  protected final String TEXT_794 = NL + "\t\t\t";
  protected final String TEXT_795 = " notification = new ";
  protected final String TEXT_796 = "(this, ";
  protected final String TEXT_797 = ".SET, ";
  protected final String TEXT_798 = ", ";
  protected final String TEXT_799 = "old";
  protected final String TEXT_800 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_801 = "old";
  protected final String TEXT_802 = ", new";
  protected final String TEXT_803 = ");";
  protected final String TEXT_804 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_805 = NL + "\t\t";
  protected final String TEXT_806 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_807 = NL + "\t\t\t";
  protected final String TEXT_808 = " ";
  protected final String TEXT_809 = " = ";
  protected final String TEXT_810 = "();";
  protected final String TEXT_811 = NL + "\t\t\tObject ";
  protected final String TEXT_812 = " = eVirtualGet(";
  protected final String TEXT_813 = ");";
  protected final String TEXT_814 = NL + "\t\t\tif (";
  protected final String TEXT_815 = " != null && ";
  protected final String TEXT_816 = " != new";
  protected final String TEXT_817 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_818 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_819 = NL + "\t\t\tif (new";
  protected final String TEXT_820 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_821 = NL + "\t\t\t\t";
  protected final String TEXT_822 = " ";
  protected final String TEXT_823 = " = ";
  protected final String TEXT_824 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_825 = ".contains(new";
  protected final String TEXT_826 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_827 = ".add(new";
  protected final String TEXT_828 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_829 = NL + "\t\t\t\t";
  protected final String TEXT_830 = " ";
  protected final String TEXT_831 = " = ";
  protected final String TEXT_832 = "();";
  protected final String TEXT_833 = NL + "\t\t\t\tObject ";
  protected final String TEXT_834 = " = eVirtualGet(";
  protected final String TEXT_835 = ");";
  protected final String TEXT_836 = NL + "\t\t\t\tif (new";
  protected final String TEXT_837 = " != ";
  protected final String TEXT_838 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_839 = "(new";
  protected final String TEXT_840 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_841 = NL + "\t\t\t}";
  protected final String TEXT_842 = NL + "\t\t}";
  protected final String TEXT_843 = NL + "\t\treturn msgs;";
  protected final String TEXT_844 = NL + "\t\treturn ((";
  protected final String TEXT_845 = ".Internal)((";
  protected final String TEXT_846 = ".Internal.Wrapper)get";
  protected final String TEXT_847 = "()).featureMap()).basicAdd(";
  protected final String TEXT_848 = ", new";
  protected final String TEXT_849 = ", msgs);";
  protected final String TEXT_850 = NL + "\t\treturn ((";
  protected final String TEXT_851 = ".Internal)get";
  protected final String TEXT_852 = "()).basicAdd(";
  protected final String TEXT_853 = ", new";
  protected final String TEXT_854 = ", msgs);";
  protected final String TEXT_855 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_856 = "' ";
  protected final String TEXT_857 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_858 = NL + "\t}" + NL;
  protected final String TEXT_859 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_860 = "#";
  protected final String TEXT_861 = " <em>";
  protected final String TEXT_862 = "</em>}' ";
  protected final String TEXT_863 = ".";
  protected final String TEXT_864 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_865 = "</em>' ";
  protected final String TEXT_866 = ".";
  protected final String TEXT_867 = NL + "\t * @see ";
  protected final String TEXT_868 = NL + "\t * @see #isSet";
  protected final String TEXT_869 = "()";
  protected final String TEXT_870 = NL + "\t * @see #unset";
  protected final String TEXT_871 = "()";
  protected final String TEXT_872 = NL + "\t * @see #";
  protected final String TEXT_873 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_874 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_875 = NL + "\t@Override";
  protected final String TEXT_876 = NL + "\tvoid set";
  protected final String TEXT_877 = "(";
  protected final String TEXT_878 = " value);" + NL;
  protected final String TEXT_879 = NL + "\tpublic void set";
  protected final String TEXT_880 = "_";
  protected final String TEXT_881 = "(";
  protected final String TEXT_882 = " ";
  protected final String TEXT_883 = ")" + NL + "\t{";
  protected final String TEXT_884 = NL + "\t\tnew";
  protected final String TEXT_885 = " = new";
  protected final String TEXT_886 = " == null ? ";
  protected final String TEXT_887 = " : new";
  protected final String TEXT_888 = ";";
  protected final String TEXT_889 = NL + "\t\teDynamicSet(";
  protected final String TEXT_890 = ", ";
  protected final String TEXT_891 = ", ";
  protected final String TEXT_892 = "new ";
  protected final String TEXT_893 = "(";
  protected final String TEXT_894 = "new";
  protected final String TEXT_895 = ")";
  protected final String TEXT_896 = ");";
  protected final String TEXT_897 = NL + "\t\teSet(";
  protected final String TEXT_898 = ", ";
  protected final String TEXT_899 = "new ";
  protected final String TEXT_900 = "(";
  protected final String TEXT_901 = "new";
  protected final String TEXT_902 = ")";
  protected final String TEXT_903 = ");";
  protected final String TEXT_904 = NL + "\t\t";
  protected final String TEXT_905 = "__ESETTING_DELEGATE.dynamicSet(this, null, 0, ";
  protected final String TEXT_906 = "new ";
  protected final String TEXT_907 = "(";
  protected final String TEXT_908 = "new";
  protected final String TEXT_909 = ")";
  protected final String TEXT_910 = ");";
  protected final String TEXT_911 = NL + "\t\tif (new";
  protected final String TEXT_912 = " != eInternalContainer() || (eContainerFeatureID() != ";
  protected final String TEXT_913 = " && new";
  protected final String TEXT_914 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_915 = ".isAncestor(this, ";
  protected final String TEXT_916 = "new";
  protected final String TEXT_917 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_918 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_919 = NL + "\t\t\t";
  protected final String TEXT_920 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_921 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_922 = ")new";
  protected final String TEXT_923 = ").eInverseAdd(this, ";
  protected final String TEXT_924 = ", ";
  protected final String TEXT_925 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_926 = "(";
  protected final String TEXT_927 = "new";
  protected final String TEXT_928 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_929 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_930 = "(this, ";
  protected final String TEXT_931 = ".SET, ";
  protected final String TEXT_932 = ", new";
  protected final String TEXT_933 = ", new";
  protected final String TEXT_934 = "));";
  protected final String TEXT_935 = NL + "\t\t";
  protected final String TEXT_936 = " ";
  protected final String TEXT_937 = " = (";
  protected final String TEXT_938 = ")eVirtualGet(";
  protected final String TEXT_939 = ");";
  protected final String TEXT_940 = NL + "\t\tif (new";
  protected final String TEXT_941 = " != ";
  protected final String TEXT_942 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_943 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_944 = " != null)";
  protected final String TEXT_945 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_946 = ")";
  protected final String TEXT_947 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_948 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_949 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_950 = ")new";
  protected final String TEXT_951 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_952 = ", null, msgs);";
  protected final String TEXT_953 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_954 = ")";
  protected final String TEXT_955 = ").eInverseRemove(this, ";
  protected final String TEXT_956 = ", ";
  protected final String TEXT_957 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_958 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_959 = ")new";
  protected final String TEXT_960 = ").eInverseAdd(this, ";
  protected final String TEXT_961 = ", ";
  protected final String TEXT_962 = ".class, msgs);";
  protected final String TEXT_963 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_964 = "(";
  protected final String TEXT_965 = "new";
  protected final String TEXT_966 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_967 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_968 = NL + "\t\t\tboolean old";
  protected final String TEXT_969 = "ESet = eVirtualIsSet(";
  protected final String TEXT_970 = ");";
  protected final String TEXT_971 = NL + "\t\t\tboolean old";
  protected final String TEXT_972 = "ESet = (";
  protected final String TEXT_973 = " & ";
  protected final String TEXT_974 = "_ESETFLAG) != 0;";
  protected final String TEXT_975 = NL + "\t\t\t";
  protected final String TEXT_976 = " |= ";
  protected final String TEXT_977 = "_ESETFLAG;";
  protected final String TEXT_978 = NL + "\t\t\tboolean old";
  protected final String TEXT_979 = "ESet = ";
  protected final String TEXT_980 = "ESet;";
  protected final String TEXT_981 = NL + "\t\t\t";
  protected final String TEXT_982 = "ESet = true;";
  protected final String TEXT_983 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_984 = "(this, ";
  protected final String TEXT_985 = ".SET, ";
  protected final String TEXT_986 = ", new";
  protected final String TEXT_987 = ", new";
  protected final String TEXT_988 = ", !old";
  protected final String TEXT_989 = "ESet));";
  protected final String TEXT_990 = NL + "\t\t}";
  protected final String TEXT_991 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_992 = "(this, ";
  protected final String TEXT_993 = ".SET, ";
  protected final String TEXT_994 = ", new";
  protected final String TEXT_995 = ", new";
  protected final String TEXT_996 = "));";
  protected final String TEXT_997 = NL + "\t\t";
  protected final String TEXT_998 = " old";
  protected final String TEXT_999 = " = (";
  protected final String TEXT_1000 = " & ";
  protected final String TEXT_1001 = "_EFLAG) != 0;";
  protected final String TEXT_1002 = NL + "\t\t";
  protected final String TEXT_1003 = " old";
  protected final String TEXT_1004 = " = ";
  protected final String TEXT_1005 = "_EFLAG_VALUES[(";
  protected final String TEXT_1006 = " & ";
  protected final String TEXT_1007 = "_EFLAG) >>> ";
  protected final String TEXT_1008 = "_EFLAG_OFFSET];";
  protected final String TEXT_1009 = NL + "\t\tif (new";
  protected final String TEXT_1010 = ") ";
  protected final String TEXT_1011 = " |= ";
  protected final String TEXT_1012 = "_EFLAG; else ";
  protected final String TEXT_1013 = " &= ~";
  protected final String TEXT_1014 = "_EFLAG;";
  protected final String TEXT_1015 = NL + "\t\tif (new";
  protected final String TEXT_1016 = " == null) new";
  protected final String TEXT_1017 = " = ";
  protected final String TEXT_1018 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_1019 = " = ";
  protected final String TEXT_1020 = " & ~";
  protected final String TEXT_1021 = "_EFLAG | ";
  protected final String TEXT_1022 = "new";
  protected final String TEXT_1023 = ".ordinal()";
  protected final String TEXT_1024 = ".VALUES.indexOf(new";
  protected final String TEXT_1025 = ")";
  protected final String TEXT_1026 = " << ";
  protected final String TEXT_1027 = "_EFLAG_OFFSET;";
  protected final String TEXT_1028 = NL + "\t\t";
  protected final String TEXT_1029 = " old";
  protected final String TEXT_1030 = " = ";
  protected final String TEXT_1031 = ";";
  protected final String TEXT_1032 = NL + "\t\t";
  protected final String TEXT_1033 = " ";
  protected final String TEXT_1034 = " = new";
  protected final String TEXT_1035 = " == null ? ";
  protected final String TEXT_1036 = " : new";
  protected final String TEXT_1037 = ";";
  protected final String TEXT_1038 = NL + "\t\t";
  protected final String TEXT_1039 = " = new";
  protected final String TEXT_1040 = " == null ? ";
  protected final String TEXT_1041 = " : new";
  protected final String TEXT_1042 = ";";
  protected final String TEXT_1043 = NL + "\t\t";
  protected final String TEXT_1044 = " ";
  protected final String TEXT_1045 = " = ";
  protected final String TEXT_1046 = "new";
  protected final String TEXT_1047 = ";";
  protected final String TEXT_1048 = NL + "\t\t";
  protected final String TEXT_1049 = " = ";
  protected final String TEXT_1050 = "new";
  protected final String TEXT_1051 = ";";
  protected final String TEXT_1052 = NL + "\t\tObject old";
  protected final String TEXT_1053 = " = eVirtualSet(";
  protected final String TEXT_1054 = ", ";
  protected final String TEXT_1055 = ");";
  protected final String TEXT_1056 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1057 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1058 = NL + "\t\tboolean old";
  protected final String TEXT_1059 = "ESet = (";
  protected final String TEXT_1060 = " & ";
  protected final String TEXT_1061 = "_ESETFLAG) != 0;";
  protected final String TEXT_1062 = NL + "\t\t";
  protected final String TEXT_1063 = " |= ";
  protected final String TEXT_1064 = "_ESETFLAG;";
  protected final String TEXT_1065 = NL + "\t\tboolean old";
  protected final String TEXT_1066 = "ESet = ";
  protected final String TEXT_1067 = "ESet;";
  protected final String TEXT_1068 = NL + "\t\t";
  protected final String TEXT_1069 = "ESet = true;";
  protected final String TEXT_1070 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1071 = "(this, ";
  protected final String TEXT_1072 = ".SET, ";
  protected final String TEXT_1073 = ", ";
  protected final String TEXT_1074 = "isSetChange ? ";
  protected final String TEXT_1075 = " : old";
  protected final String TEXT_1076 = "old";
  protected final String TEXT_1077 = ", ";
  protected final String TEXT_1078 = "new";
  protected final String TEXT_1079 = ", ";
  protected final String TEXT_1080 = "isSetChange";
  protected final String TEXT_1081 = "!old";
  protected final String TEXT_1082 = "ESet";
  protected final String TEXT_1083 = "));";
  protected final String TEXT_1084 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1085 = "(this, ";
  protected final String TEXT_1086 = ".SET, ";
  protected final String TEXT_1087 = ", ";
  protected final String TEXT_1088 = "old";
  protected final String TEXT_1089 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_1090 = " : old";
  protected final String TEXT_1091 = "old";
  protected final String TEXT_1092 = ", ";
  protected final String TEXT_1093 = "new";
  protected final String TEXT_1094 = "));";
  protected final String TEXT_1095 = NL + "\t\t";
  protected final String TEXT_1096 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_1097 = NL + "\t\t\t";
  protected final String TEXT_1098 = " ";
  protected final String TEXT_1099 = " = ";
  protected final String TEXT_1100 = "();";
  protected final String TEXT_1101 = NL + "\t\t\tObject ";
  protected final String TEXT_1102 = " = eVirtualGet(";
  protected final String TEXT_1103 = ");";
  protected final String TEXT_1104 = NL + "\t\t\tif (";
  protected final String TEXT_1105 = " != null && ";
  protected final String TEXT_1106 = " != new";
  protected final String TEXT_1107 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_1108 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_1109 = NL + "\t\t\tif (new";
  protected final String TEXT_1110 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_1111 = NL + "\t\t\t\t";
  protected final String TEXT_1112 = " ";
  protected final String TEXT_1113 = " = ";
  protected final String TEXT_1114 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_1115 = ".contains(new";
  protected final String TEXT_1116 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_1117 = ".add(new";
  protected final String TEXT_1118 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1119 = NL + "\t\t\t\t";
  protected final String TEXT_1120 = " ";
  protected final String TEXT_1121 = " = ";
  protected final String TEXT_1122 = "();";
  protected final String TEXT_1123 = NL + "\t\t\t\tObject ";
  protected final String TEXT_1124 = " = eVirtualGet(";
  protected final String TEXT_1125 = ");";
  protected final String TEXT_1126 = NL + "\t\t\t\tif (new";
  protected final String TEXT_1127 = " != ";
  protected final String TEXT_1128 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_1129 = "(new";
  protected final String TEXT_1130 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1131 = NL + "\t\t\t}";
  protected final String TEXT_1132 = NL + "\t\t}";
  protected final String TEXT_1133 = NL + "\t\t((";
  protected final String TEXT_1134 = ".Internal)((";
  protected final String TEXT_1135 = ".Internal.Wrapper)get";
  protected final String TEXT_1136 = "()).featureMap()).set(";
  protected final String TEXT_1137 = ", ";
  protected final String TEXT_1138 = "new ";
  protected final String TEXT_1139 = "(";
  protected final String TEXT_1140 = "new";
  protected final String TEXT_1141 = ")";
  protected final String TEXT_1142 = ");";
  protected final String TEXT_1143 = NL + "\t\t((";
  protected final String TEXT_1144 = ".Internal)get";
  protected final String TEXT_1145 = "()).set(";
  protected final String TEXT_1146 = ", ";
  protected final String TEXT_1147 = "new ";
  protected final String TEXT_1148 = "(";
  protected final String TEXT_1149 = "new";
  protected final String TEXT_1150 = ")";
  protected final String TEXT_1151 = ");";
  protected final String TEXT_1152 = NL + "\t\t";
  protected final String TEXT_1153 = NL + "\t\t";
  protected final String TEXT_1154 = ".";
  protected final String TEXT_1155 = "(this, ";
  protected final String TEXT_1156 = ");";
  protected final String TEXT_1157 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_1158 = "' ";
  protected final String TEXT_1159 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1160 = NL + "\t}" + NL;
  protected final String TEXT_1161 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1162 = NL + "\t@Override";
  protected final String TEXT_1163 = NL + "\tpublic ";
  protected final String TEXT_1164 = " basicUnset";
  protected final String TEXT_1165 = "(";
  protected final String TEXT_1166 = " msgs)" + NL + "\t{";
  protected final String TEXT_1167 = NL + "\t\treturn eDynamicInverseRemove((";
  protected final String TEXT_1168 = ")";
  protected final String TEXT_1169 = "basicGet";
  protected final String TEXT_1170 = "(), ";
  protected final String TEXT_1171 = ", msgs);";
  protected final String TEXT_1172 = "Object old";
  protected final String TEXT_1173 = " = ";
  protected final String TEXT_1174 = "eVirtualUnset(";
  protected final String TEXT_1175 = ");";
  protected final String TEXT_1176 = NL + "\t\t";
  protected final String TEXT_1177 = " old";
  protected final String TEXT_1178 = " = ";
  protected final String TEXT_1179 = ";";
  protected final String TEXT_1180 = NL + "\t\t";
  protected final String TEXT_1181 = " = null;";
  protected final String TEXT_1182 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1183 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1184 = NL + "\t\tboolean old";
  protected final String TEXT_1185 = "ESet = (";
  protected final String TEXT_1186 = " & ";
  protected final String TEXT_1187 = "_ESETFLAG) != 0;";
  protected final String TEXT_1188 = NL + "\t\t";
  protected final String TEXT_1189 = " &= ~";
  protected final String TEXT_1190 = "_ESETFLAG;";
  protected final String TEXT_1191 = NL + "\t\tboolean old";
  protected final String TEXT_1192 = "ESet = ";
  protected final String TEXT_1193 = "ESet;";
  protected final String TEXT_1194 = NL + "\t\t";
  protected final String TEXT_1195 = "ESet = false;";
  protected final String TEXT_1196 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1197 = " notification = new ";
  protected final String TEXT_1198 = "(this, ";
  protected final String TEXT_1199 = ".UNSET, ";
  protected final String TEXT_1200 = ", ";
  protected final String TEXT_1201 = "isSetChange ? old";
  protected final String TEXT_1202 = " : null";
  protected final String TEXT_1203 = "old";
  protected final String TEXT_1204 = ", null, ";
  protected final String TEXT_1205 = "isSetChange";
  protected final String TEXT_1206 = "old";
  protected final String TEXT_1207 = "ESet";
  protected final String TEXT_1208 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1209 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1210 = "' ";
  protected final String TEXT_1211 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1212 = NL + "\t}" + NL;
  protected final String TEXT_1213 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1214 = "#";
  protected final String TEXT_1215 = " <em>";
  protected final String TEXT_1216 = "</em>}' ";
  protected final String TEXT_1217 = ".";
  protected final String TEXT_1218 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1219 = NL + "\t * @see #isSet";
  protected final String TEXT_1220 = "()";
  protected final String TEXT_1221 = NL + "\t * @see #";
  protected final String TEXT_1222 = "()";
  protected final String TEXT_1223 = NL + "\t * @see #set";
  protected final String TEXT_1224 = "(";
  protected final String TEXT_1225 = ")";
  protected final String TEXT_1226 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1227 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1228 = NL + "\t@Override";
  protected final String TEXT_1229 = NL + "\tvoid unset";
  protected final String TEXT_1230 = "();" + NL;
  protected final String TEXT_1231 = NL + "\tpublic void unset";
  protected final String TEXT_1232 = "_";
  protected final String TEXT_1233 = "()" + NL + "\t{";
  protected final String TEXT_1234 = NL + "\t\teDynamicUnset(";
  protected final String TEXT_1235 = ", ";
  protected final String TEXT_1236 = ");";
  protected final String TEXT_1237 = NL + "\t\teUnset(";
  protected final String TEXT_1238 = ");";
  protected final String TEXT_1239 = NL + "\t\t";
  protected final String TEXT_1240 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_1241 = NL + "\t\t";
  protected final String TEXT_1242 = " ";
  protected final String TEXT_1243 = " = (";
  protected final String TEXT_1244 = ")eVirtualGet(";
  protected final String TEXT_1245 = ");";
  protected final String TEXT_1246 = NL + "\t\tif (";
  protected final String TEXT_1247 = " != null) ((";
  protected final String TEXT_1248 = ".Unsettable";
  protected final String TEXT_1249 = ")";
  protected final String TEXT_1250 = ").unset();";
  protected final String TEXT_1251 = NL + "\t\t";
  protected final String TEXT_1252 = " ";
  protected final String TEXT_1253 = " = (";
  protected final String TEXT_1254 = ")eVirtualGet(";
  protected final String TEXT_1255 = ");";
  protected final String TEXT_1256 = NL + "\t\tif (";
  protected final String TEXT_1257 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1258 = " msgs = null;";
  protected final String TEXT_1259 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1260 = ")";
  protected final String TEXT_1261 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1262 = ", null, msgs);";
  protected final String TEXT_1263 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1264 = ")";
  protected final String TEXT_1265 = ").eInverseRemove(this, ";
  protected final String TEXT_1266 = ", ";
  protected final String TEXT_1267 = ".class, msgs);";
  protected final String TEXT_1268 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1269 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1270 = NL + "\t\t\tboolean old";
  protected final String TEXT_1271 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1272 = ");";
  protected final String TEXT_1273 = NL + "\t\t\tboolean old";
  protected final String TEXT_1274 = "ESet = (";
  protected final String TEXT_1275 = " & ";
  protected final String TEXT_1276 = "_ESETFLAG) != 0;";
  protected final String TEXT_1277 = NL + "\t\t\t";
  protected final String TEXT_1278 = " &= ~";
  protected final String TEXT_1279 = "_ESETFLAG;";
  protected final String TEXT_1280 = NL + "\t\t\tboolean old";
  protected final String TEXT_1281 = "ESet = ";
  protected final String TEXT_1282 = "ESet;";
  protected final String TEXT_1283 = NL + "\t\t\t";
  protected final String TEXT_1284 = "ESet = false;";
  protected final String TEXT_1285 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1286 = "(this, ";
  protected final String TEXT_1287 = ".UNSET, ";
  protected final String TEXT_1288 = ", null, null, old";
  protected final String TEXT_1289 = "ESet));";
  protected final String TEXT_1290 = NL + "\t\t}";
  protected final String TEXT_1291 = NL + "\t\t";
  protected final String TEXT_1292 = " old";
  protected final String TEXT_1293 = " = (";
  protected final String TEXT_1294 = " & ";
  protected final String TEXT_1295 = "_EFLAG) != 0;";
  protected final String TEXT_1296 = NL + "\t\t";
  protected final String TEXT_1297 = " old";
  protected final String TEXT_1298 = " = ";
  protected final String TEXT_1299 = "_EFLAG_VALUES[(";
  protected final String TEXT_1300 = " & ";
  protected final String TEXT_1301 = "_EFLAG) >>> ";
  protected final String TEXT_1302 = "_EFLAG_OFFSET];";
  protected final String TEXT_1303 = NL + "\t\tObject old";
  protected final String TEXT_1304 = " = eVirtualUnset(";
  protected final String TEXT_1305 = ");";
  protected final String TEXT_1306 = NL + "\t\t";
  protected final String TEXT_1307 = " old";
  protected final String TEXT_1308 = " = ";
  protected final String TEXT_1309 = ";";
  protected final String TEXT_1310 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1311 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1312 = NL + "\t\tboolean old";
  protected final String TEXT_1313 = "ESet = (";
  protected final String TEXT_1314 = " & ";
  protected final String TEXT_1315 = "_ESETFLAG) != 0;";
  protected final String TEXT_1316 = NL + "\t\tboolean old";
  protected final String TEXT_1317 = "ESet = ";
  protected final String TEXT_1318 = "ESet;";
  protected final String TEXT_1319 = NL + "\t\t";
  protected final String TEXT_1320 = " = null;";
  protected final String TEXT_1321 = NL + "\t\t";
  protected final String TEXT_1322 = " &= ~";
  protected final String TEXT_1323 = "_ESETFLAG;";
  protected final String TEXT_1324 = NL + "\t\t";
  protected final String TEXT_1325 = "ESet = false;";
  protected final String TEXT_1326 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1327 = "(this, ";
  protected final String TEXT_1328 = ".UNSET, ";
  protected final String TEXT_1329 = ", ";
  protected final String TEXT_1330 = "isSetChange ? old";
  protected final String TEXT_1331 = " : null";
  protected final String TEXT_1332 = "old";
  protected final String TEXT_1333 = ", null, ";
  protected final String TEXT_1334 = "isSetChange";
  protected final String TEXT_1335 = "old";
  protected final String TEXT_1336 = "ESet";
  protected final String TEXT_1337 = "));";
  protected final String TEXT_1338 = NL + "\t\tif (";
  protected final String TEXT_1339 = ") ";
  protected final String TEXT_1340 = " |= ";
  protected final String TEXT_1341 = "_EFLAG; else ";
  protected final String TEXT_1342 = " &= ~";
  protected final String TEXT_1343 = "_EFLAG;";
  protected final String TEXT_1344 = NL + "\t\t";
  protected final String TEXT_1345 = " = ";
  protected final String TEXT_1346 = " & ~";
  protected final String TEXT_1347 = "_EFLAG | ";
  protected final String TEXT_1348 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1349 = NL + "\t\t";
  protected final String TEXT_1350 = " = ";
  protected final String TEXT_1351 = ";";
  protected final String TEXT_1352 = NL + "\t\t";
  protected final String TEXT_1353 = " &= ~";
  protected final String TEXT_1354 = "_ESETFLAG;";
  protected final String TEXT_1355 = NL + "\t\t";
  protected final String TEXT_1356 = "ESet = false;";
  protected final String TEXT_1357 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1358 = "(this, ";
  protected final String TEXT_1359 = ".UNSET, ";
  protected final String TEXT_1360 = ", ";
  protected final String TEXT_1361 = "isSetChange ? old";
  protected final String TEXT_1362 = " : ";
  protected final String TEXT_1363 = "old";
  protected final String TEXT_1364 = ", ";
  protected final String TEXT_1365 = ", ";
  protected final String TEXT_1366 = "isSetChange";
  protected final String TEXT_1367 = "old";
  protected final String TEXT_1368 = "ESet";
  protected final String TEXT_1369 = "));";
  protected final String TEXT_1370 = NL + "\t\t((";
  protected final String TEXT_1371 = ".Internal)((";
  protected final String TEXT_1372 = ".Internal.Wrapper)get";
  protected final String TEXT_1373 = "()).featureMap()).clear(";
  protected final String TEXT_1374 = ");";
  protected final String TEXT_1375 = NL + "\t\t((";
  protected final String TEXT_1376 = ".Internal)get";
  protected final String TEXT_1377 = "()).clear(";
  protected final String TEXT_1378 = ");";
  protected final String TEXT_1379 = NL + "\t\t";
  protected final String TEXT_1380 = NL + "\t\t";
  protected final String TEXT_1381 = ".";
  protected final String TEXT_1382 = "(this);";
  protected final String TEXT_1383 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1384 = "' ";
  protected final String TEXT_1385 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1386 = NL + "\t}" + NL;
  protected final String TEXT_1387 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1388 = "#";
  protected final String TEXT_1389 = " <em>";
  protected final String TEXT_1390 = "</em>}' ";
  protected final String TEXT_1391 = " is set.";
  protected final String TEXT_1392 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1393 = "</em>' ";
  protected final String TEXT_1394 = " is set.";
  protected final String TEXT_1395 = NL + "\t * @see #unset";
  protected final String TEXT_1396 = "()";
  protected final String TEXT_1397 = NL + "\t * @see #";
  protected final String TEXT_1398 = "()";
  protected final String TEXT_1399 = NL + "\t * @see #set";
  protected final String TEXT_1400 = "(";
  protected final String TEXT_1401 = ")";
  protected final String TEXT_1402 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1403 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1404 = NL + "\t@Override";
  protected final String TEXT_1405 = NL + "\tboolean isSet";
  protected final String TEXT_1406 = "();" + NL;
  protected final String TEXT_1407 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1408 = "_";
  protected final String TEXT_1409 = "()" + NL + "\t{";
  protected final String TEXT_1410 = NL + "\t\treturn eDynamicIsSet(";
  protected final String TEXT_1411 = ", ";
  protected final String TEXT_1412 = ");";
  protected final String TEXT_1413 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1414 = ");";
  protected final String TEXT_1415 = NL + "\t\treturn ";
  protected final String TEXT_1416 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_1417 = NL + "\t\t";
  protected final String TEXT_1418 = " ";
  protected final String TEXT_1419 = " = (";
  protected final String TEXT_1420 = ")eVirtualGet(";
  protected final String TEXT_1421 = ");";
  protected final String TEXT_1422 = NL + "\t\treturn ";
  protected final String TEXT_1423 = " != null && ((";
  protected final String TEXT_1424 = ".Unsettable";
  protected final String TEXT_1425 = ")";
  protected final String TEXT_1426 = ").isSet();";
  protected final String TEXT_1427 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1428 = ");";
  protected final String TEXT_1429 = NL + "\t\treturn (";
  protected final String TEXT_1430 = " & ";
  protected final String TEXT_1431 = "_ESETFLAG) != 0;";
  protected final String TEXT_1432 = NL + "\t\treturn ";
  protected final String TEXT_1433 = "ESet;";
  protected final String TEXT_1434 = NL + "\t\treturn !((";
  protected final String TEXT_1435 = ".Internal)((";
  protected final String TEXT_1436 = ".Internal.Wrapper)get";
  protected final String TEXT_1437 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1438 = ");";
  protected final String TEXT_1439 = NL + "\t\treturn !((";
  protected final String TEXT_1440 = ".Internal)get";
  protected final String TEXT_1441 = "()).isEmpty(";
  protected final String TEXT_1442 = ");";
  protected final String TEXT_1443 = NL + "\t\t";
  protected final String TEXT_1444 = NL + "\t\treturn ";
  protected final String TEXT_1445 = ".";
  protected final String TEXT_1446 = "(this);";
  protected final String TEXT_1447 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1448 = "' ";
  protected final String TEXT_1449 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1450 = NL + "\t}" + NL;
  protected final String TEXT_1451 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1452 = "() <em>";
  protected final String TEXT_1453 = "</em>}' ";
  protected final String TEXT_1454 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1455 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1456 = "_ESUBSETS = ";
  protected final String TEXT_1457 = ";" + NL;
  protected final String TEXT_1458 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1459 = "() <em>";
  protected final String TEXT_1460 = "</em>}' ";
  protected final String TEXT_1461 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1462 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1463 = "_ESUPERSETS = ";
  protected final String TEXT_1464 = ";" + NL;
  protected final String TEXT_1465 = NL + "\t/**";
  protected final String TEXT_1466 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1467 = "}, with the specified ";
  protected final String TEXT_1468 = ", and appends it to the '<em><b>";
  protected final String TEXT_1469 = "</b></em>' ";
  protected final String TEXT_1470 = ".";
  protected final String TEXT_1471 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1472 = "}, with the specified ";
  protected final String TEXT_1473 = ", and sets the '<em><b>";
  protected final String TEXT_1474 = "</b></em>' ";
  protected final String TEXT_1475 = ".";
  protected final String TEXT_1476 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1477 = "} and appends it to the '<em><b>";
  protected final String TEXT_1478 = "</b></em>' ";
  protected final String TEXT_1479 = ".";
  protected final String TEXT_1480 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1481 = "} and sets the '<em><b>";
  protected final String TEXT_1482 = "</b></em>' ";
  protected final String TEXT_1483 = ".";
  protected final String TEXT_1484 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1485 = NL + "\t * @param ";
  protected final String TEXT_1486 = " The ";
  protected final String TEXT_1487 = " for the new {@link ";
  protected final String TEXT_1488 = "}, or <code>null</code>.";
  protected final String TEXT_1489 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1490 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1491 = "}." + NL + "\t * @see #";
  protected final String TEXT_1492 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1493 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1494 = NL + "\t";
  protected final String TEXT_1495 = " create";
  protected final String TEXT_1496 = "(";
  protected final String TEXT_1497 = ", ";
  protected final String TEXT_1498 = " eClass);" + NL;
  protected final String TEXT_1499 = NL + "\t@Override";
  protected final String TEXT_1500 = NL + "\tpublic ";
  protected final String TEXT_1501 = " create";
  protected final String TEXT_1502 = "(";
  protected final String TEXT_1503 = ", ";
  protected final String TEXT_1504 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1505 = " new";
  protected final String TEXT_1506 = " = (";
  protected final String TEXT_1507 = ") create(eClass);";
  protected final String TEXT_1508 = NL + "\t\t";
  protected final String TEXT_1509 = "().add(new";
  protected final String TEXT_1510 = ");";
  protected final String TEXT_1511 = NL + "\t\tset";
  protected final String TEXT_1512 = "(new";
  protected final String TEXT_1513 = ");";
  protected final String TEXT_1514 = NL + "\t\tint ";
  protected final String TEXT_1515 = "ListSize = 0;";
  protected final String TEXT_1516 = NL + "\t\tint ";
  protected final String TEXT_1517 = "Size = ";
  protected final String TEXT_1518 = " == null ? 0 : ";
  protected final String TEXT_1519 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1520 = "Size > ";
  protected final String TEXT_1521 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1522 = "ListSize = ";
  protected final String TEXT_1523 = "Size;";
  protected final String TEXT_1524 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1525 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1526 = ".create";
  protected final String TEXT_1527 = "(";
  protected final String TEXT_1528 = ", ";
  protected final String TEXT_1529 = "i < ";
  protected final String TEXT_1530 = "Size ? (";
  protected final String TEXT_1531 = ") ";
  protected final String TEXT_1532 = ".get(i) : null";
  protected final String TEXT_1533 = ");" + NL + "\t\t}";
  protected final String TEXT_1534 = NL + "\t\tnew";
  protected final String TEXT_1535 = ".create";
  protected final String TEXT_1536 = "(";
  protected final String TEXT_1537 = ", ";
  protected final String TEXT_1538 = ");";
  protected final String TEXT_1539 = NL + "\t\tif (";
  protected final String TEXT_1540 = " != null)";
  protected final String TEXT_1541 = NL + "\t\t\tnew";
  protected final String TEXT_1542 = ".";
  protected final String TEXT_1543 = "().addAll(";
  protected final String TEXT_1544 = ");";
  protected final String TEXT_1545 = NL + "\t\t\tnew";
  protected final String TEXT_1546 = ".set";
  protected final String TEXT_1547 = "(";
  protected final String TEXT_1548 = ");";
  protected final String TEXT_1549 = NL + "\t\treturn new";
  protected final String TEXT_1550 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1551 = NL + "\t/**";
  protected final String TEXT_1552 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1553 = "}, with the specified ";
  protected final String TEXT_1554 = ", and appends it to the '<em><b>";
  protected final String TEXT_1555 = "</b></em>' ";
  protected final String TEXT_1556 = ".";
  protected final String TEXT_1557 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1558 = "},with the specified ";
  protected final String TEXT_1559 = ", and sets the '<em><b>";
  protected final String TEXT_1560 = "</b></em>' ";
  protected final String TEXT_1561 = ".";
  protected final String TEXT_1562 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1563 = "} and appends it to the '<em><b>";
  protected final String TEXT_1564 = "</b></em>' ";
  protected final String TEXT_1565 = ".";
  protected final String TEXT_1566 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1567 = "} and sets the '<em><b>";
  protected final String TEXT_1568 = "</b></em>' ";
  protected final String TEXT_1569 = ".";
  protected final String TEXT_1570 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1571 = NL + "\t * @param ";
  protected final String TEXT_1572 = " The ";
  protected final String TEXT_1573 = " for the new {@link ";
  protected final String TEXT_1574 = "}, or <code>null</code>.";
  protected final String TEXT_1575 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1576 = "}." + NL + "\t * @see #";
  protected final String TEXT_1577 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1578 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1579 = NL + "\t";
  protected final String TEXT_1580 = " create";
  protected final String TEXT_1581 = "(";
  protected final String TEXT_1582 = ");" + NL;
  protected final String TEXT_1583 = NL + "\t@Override";
  protected final String TEXT_1584 = NL + "\tpublic ";
  protected final String TEXT_1585 = " create";
  protected final String TEXT_1586 = "(";
  protected final String TEXT_1587 = ")" + NL + "\t{";
  protected final String TEXT_1588 = NL + "\t\treturn create";
  protected final String TEXT_1589 = "(";
  protected final String TEXT_1590 = ", ";
  protected final String TEXT_1591 = ");";
  protected final String TEXT_1592 = NL + "\t\t";
  protected final String TEXT_1593 = " new";
  protected final String TEXT_1594 = " = (";
  protected final String TEXT_1595 = ") create(";
  protected final String TEXT_1596 = ");";
  protected final String TEXT_1597 = NL + "\t\t";
  protected final String TEXT_1598 = "().add(new";
  protected final String TEXT_1599 = ");";
  protected final String TEXT_1600 = NL + "\t\tset";
  protected final String TEXT_1601 = "(new";
  protected final String TEXT_1602 = ");";
  protected final String TEXT_1603 = NL + "\t\tint ";
  protected final String TEXT_1604 = "ListSize = 0;";
  protected final String TEXT_1605 = NL + "\t\tint ";
  protected final String TEXT_1606 = "Size = ";
  protected final String TEXT_1607 = " == null ? 0 : ";
  protected final String TEXT_1608 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1609 = "Size > ";
  protected final String TEXT_1610 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1611 = "ListSize = ";
  protected final String TEXT_1612 = "Size;";
  protected final String TEXT_1613 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1614 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1615 = ".create";
  protected final String TEXT_1616 = "(";
  protected final String TEXT_1617 = ", ";
  protected final String TEXT_1618 = "i < ";
  protected final String TEXT_1619 = "Size ? (";
  protected final String TEXT_1620 = ") ";
  protected final String TEXT_1621 = ".get(i) : null";
  protected final String TEXT_1622 = ");" + NL + "\t\t}";
  protected final String TEXT_1623 = NL + "\t\tnew";
  protected final String TEXT_1624 = ".create";
  protected final String TEXT_1625 = "(";
  protected final String TEXT_1626 = ", ";
  protected final String TEXT_1627 = ");";
  protected final String TEXT_1628 = NL + "\t\tif (";
  protected final String TEXT_1629 = " != null)";
  protected final String TEXT_1630 = NL + "\t\t\tnew";
  protected final String TEXT_1631 = ".";
  protected final String TEXT_1632 = "().addAll(";
  protected final String TEXT_1633 = ");";
  protected final String TEXT_1634 = NL + "\t\t\tnew";
  protected final String TEXT_1635 = ".set";
  protected final String TEXT_1636 = "(";
  protected final String TEXT_1637 = ");";
  protected final String TEXT_1638 = NL + "\t\treturn new";
  protected final String TEXT_1639 = ";";
  protected final String TEXT_1640 = NL + "\t}" + NL;
  protected final String TEXT_1641 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1642 = "} with the specified ";
  protected final String TEXT_1643 = " from the '<em><b>";
  protected final String TEXT_1644 = "</b></em>' ";
  protected final String TEXT_1645 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1646 = NL + "\t * @param ";
  protected final String TEXT_1647 = " The ";
  protected final String TEXT_1648 = " of the {@link ";
  protected final String TEXT_1649 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1650 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1651 = "} with the specified ";
  protected final String TEXT_1652 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1653 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1654 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1655 = NL + "\t";
  protected final String TEXT_1656 = " get";
  protected final String TEXT_1657 = "(";
  protected final String TEXT_1658 = ");" + NL;
  protected final String TEXT_1659 = NL + "\t@Override";
  protected final String TEXT_1660 = NL + "\tpublic ";
  protected final String TEXT_1661 = " get";
  protected final String TEXT_1662 = "(";
  protected final String TEXT_1663 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1664 = "(";
  protected final String TEXT_1665 = ", false";
  protected final String TEXT_1666 = ", null";
  protected final String TEXT_1667 = ", false";
  protected final String TEXT_1668 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1669 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1670 = "} with the specified ";
  protected final String TEXT_1671 = " from the '<em><b>";
  protected final String TEXT_1672 = "</b></em>' ";
  protected final String TEXT_1673 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1674 = NL + "\t * @param ";
  protected final String TEXT_1675 = " The ";
  protected final String TEXT_1676 = " of the {@link ";
  protected final String TEXT_1677 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1678 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1679 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1680 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1681 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1682 = "} on demand if not found.";
  protected final String TEXT_1683 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1684 = "} with the specified ";
  protected final String TEXT_1685 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1686 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1687 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1688 = NL + "\t";
  protected final String TEXT_1689 = " get";
  protected final String TEXT_1690 = "(";
  protected final String TEXT_1691 = ", boolean ignoreCase";
  protected final String TEXT_1692 = ", ";
  protected final String TEXT_1693 = " eClass";
  protected final String TEXT_1694 = ", boolean createOnDemand";
  protected final String TEXT_1695 = ");" + NL;
  protected final String TEXT_1696 = NL + "\t@Override";
  protected final String TEXT_1697 = NL + "\tpublic ";
  protected final String TEXT_1698 = " get";
  protected final String TEXT_1699 = "(";
  protected final String TEXT_1700 = ", boolean ignoreCase";
  protected final String TEXT_1701 = ", ";
  protected final String TEXT_1702 = " eClass";
  protected final String TEXT_1703 = ", boolean createOnDemand";
  protected final String TEXT_1704 = ")" + NL + "\t{";
  protected final String TEXT_1705 = NL + "\t\t";
  protected final String TEXT_1706 = "Loop: for (";
  protected final String TEXT_1707 = " ";
  protected final String TEXT_1708 = " : ";
  protected final String TEXT_1709 = "())" + NL + "\t\t{";
  protected final String TEXT_1710 = NL + "\t\t";
  protected final String TEXT_1711 = "Loop: for (";
  protected final String TEXT_1712 = " i = ";
  protected final String TEXT_1713 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1714 = " ";
  protected final String TEXT_1715 = " = (";
  protected final String TEXT_1716 = ") i.next();";
  protected final String TEXT_1717 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1718 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1719 = "Loop;";
  protected final String TEXT_1720 = NL + "\t\t\t";
  protected final String TEXT_1721 = " ";
  protected final String TEXT_1722 = "List = ";
  protected final String TEXT_1723 = ".";
  protected final String TEXT_1724 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1725 = "ListSize = ";
  protected final String TEXT_1726 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1727 = " || (";
  protected final String TEXT_1728 = " != null && ";
  protected final String TEXT_1729 = ".size() != ";
  protected final String TEXT_1730 = "ListSize";
  protected final String TEXT_1731 = ")";
  protected final String TEXT_1732 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1733 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1734 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1735 = " ";
  protected final String TEXT_1736 = " = ";
  protected final String TEXT_1737 = "(";
  protected final String TEXT_1738 = ") ";
  protected final String TEXT_1739 = "List.get(j);";
  protected final String TEXT_1740 = NL + "\t\t\t\tif (";
  protected final String TEXT_1741 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1742 = "(";
  protected final String TEXT_1743 = ")";
  protected final String TEXT_1744 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1745 = ".";
  protected final String TEXT_1746 = "()) : ";
  protected final String TEXT_1747 = ".get(j).equals(";
  protected final String TEXT_1748 = ".";
  protected final String TEXT_1749 = "())))";
  protected final String TEXT_1750 = NL + "\t\t\t\tif (";
  protected final String TEXT_1751 = " != null && !";
  protected final String TEXT_1752 = ".get(j).equals(";
  protected final String TEXT_1753 = ".";
  protected final String TEXT_1754 = "()))";
  protected final String TEXT_1755 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1756 = "Loop;";
  protected final String TEXT_1757 = NL + "\t\t\t}";
  protected final String TEXT_1758 = NL + "\t\t\t";
  protected final String TEXT_1759 = " ";
  protected final String TEXT_1760 = " = ";
  protected final String TEXT_1761 = ".";
  protected final String TEXT_1762 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1763 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1764 = "Loop;";
  protected final String TEXT_1765 = NL + "\t\t\tif (";
  protected final String TEXT_1766 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1767 = ".equalsIgnoreCase(";
  protected final String TEXT_1768 = ".";
  protected final String TEXT_1769 = "()) : ";
  protected final String TEXT_1770 = ".equals(";
  protected final String TEXT_1771 = ".";
  protected final String TEXT_1772 = "())))";
  protected final String TEXT_1773 = NL + "\t\t\tif (";
  protected final String TEXT_1774 = " != null && !";
  protected final String TEXT_1775 = ".equals(";
  protected final String TEXT_1776 = ".";
  protected final String TEXT_1777 = "()))";
  protected final String TEXT_1778 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1779 = "Loop;";
  protected final String TEXT_1780 = NL + "\t\t\tif (";
  protected final String TEXT_1781 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1782 = ".equalsIgnoreCase(";
  protected final String TEXT_1783 = ".";
  protected final String TEXT_1784 = "()) : ";
  protected final String TEXT_1785 = ".equals(";
  protected final String TEXT_1786 = ".";
  protected final String TEXT_1787 = "())))";
  protected final String TEXT_1788 = NL + "\t\t\tif (";
  protected final String TEXT_1789 = " != null && !";
  protected final String TEXT_1790 = ".equals(";
  protected final String TEXT_1791 = ".";
  protected final String TEXT_1792 = "()))";
  protected final String TEXT_1793 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1794 = "Loop;";
  protected final String TEXT_1795 = NL + "\t\t\treturn ";
  protected final String TEXT_1796 = ";" + NL + "\t\t}";
  protected final String TEXT_1797 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1798 = " && eClass != null";
  protected final String TEXT_1799 = " ? create";
  protected final String TEXT_1800 = "(";
  protected final String TEXT_1801 = ", eClass";
  protected final String TEXT_1802 = ") : null;";
  protected final String TEXT_1803 = NL + "\t\treturn null;";
  protected final String TEXT_1804 = NL + "\t}" + NL;
  protected final String TEXT_1805 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1806 = "()" + NL + "\t{";
  protected final String TEXT_1807 = NL + "  \t\treturn false;";
  protected final String TEXT_1808 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1809 = ");";
  protected final String TEXT_1810 = NL + "\t\treturn !((";
  protected final String TEXT_1811 = ".Internal.Wrapper)";
  protected final String TEXT_1812 = "()).featureMap().isEmpty();";
  protected final String TEXT_1813 = NL + "\t\treturn ";
  protected final String TEXT_1814 = " != null && !";
  protected final String TEXT_1815 = ".featureMap().isEmpty();";
  protected final String TEXT_1816 = NL + "\t\treturn ";
  protected final String TEXT_1817 = " != null && !";
  protected final String TEXT_1818 = ".isEmpty();";
  protected final String TEXT_1819 = NL + "\t\t";
  protected final String TEXT_1820 = " ";
  protected final String TEXT_1821 = " = (";
  protected final String TEXT_1822 = ")eVirtualGet(";
  protected final String TEXT_1823 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1824 = " != null && !";
  protected final String TEXT_1825 = ".isEmpty();";
  protected final String TEXT_1826 = NL + "\t\treturn !";
  protected final String TEXT_1827 = "().isEmpty();";
  protected final String TEXT_1828 = NL + "\t\treturn ";
  protected final String TEXT_1829 = " != null;";
  protected final String TEXT_1830 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1831 = ") != null;";
  protected final String TEXT_1832 = NL + "\t\treturn basicGet";
  protected final String TEXT_1833 = "() != null;";
  protected final String TEXT_1834 = NL + "\t\treturn ";
  protected final String TEXT_1835 = " != null;";
  protected final String TEXT_1836 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1837 = ") != null;";
  protected final String TEXT_1838 = NL + "\t\treturn ";
  protected final String TEXT_1839 = "() != null;";
  protected final String TEXT_1840 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1841 = " & ";
  protected final String TEXT_1842 = "_EFLAG) != 0) != ";
  protected final String TEXT_1843 = ";";
  protected final String TEXT_1844 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1845 = " & ";
  protected final String TEXT_1846 = "_EFLAG) != ";
  protected final String TEXT_1847 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1848 = NL + "\t\treturn ";
  protected final String TEXT_1849 = " != ";
  protected final String TEXT_1850 = ";";
  protected final String TEXT_1851 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1852 = ", ";
  protected final String TEXT_1853 = ") != ";
  protected final String TEXT_1854 = ";";
  protected final String TEXT_1855 = NL + "\t\treturn ";
  protected final String TEXT_1856 = "() != ";
  protected final String TEXT_1857 = ";";
  protected final String TEXT_1858 = NL + "\t\treturn ";
  protected final String TEXT_1859 = " == null ? ";
  protected final String TEXT_1860 = " != null : !";
  protected final String TEXT_1861 = ".equals(";
  protected final String TEXT_1862 = ");";
  protected final String TEXT_1863 = NL + "\t\t";
  protected final String TEXT_1864 = " ";
  protected final String TEXT_1865 = " = (";
  protected final String TEXT_1866 = ")eVirtualGet(";
  protected final String TEXT_1867 = ", ";
  protected final String TEXT_1868 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1869 = " == null ? ";
  protected final String TEXT_1870 = " != null : !";
  protected final String TEXT_1871 = ".equals(";
  protected final String TEXT_1872 = ");";
  protected final String TEXT_1873 = NL + "\t\treturn ";
  protected final String TEXT_1874 = " == null ? ";
  protected final String TEXT_1875 = "() != null : !";
  protected final String TEXT_1876 = ".equals(";
  protected final String TEXT_1877 = "());";
  protected final String TEXT_1878 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1879 = ");";
  protected final String TEXT_1880 = NL + "\t\t";
  protected final String TEXT_1881 = " ";
  protected final String TEXT_1882 = " = (";
  protected final String TEXT_1883 = ")eVirtualGet(";
  protected final String TEXT_1884 = ");";
  protected final String TEXT_1885 = NL + "\t\treturn ";
  protected final String TEXT_1886 = " != null && ((";
  protected final String TEXT_1887 = ".Unsettable";
  protected final String TEXT_1888 = ")";
  protected final String TEXT_1889 = ").isSet();";
  protected final String TEXT_1890 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1891 = ");";
  protected final String TEXT_1892 = NL + "\t\treturn (";
  protected final String TEXT_1893 = " & ";
  protected final String TEXT_1894 = "_ESETFLAG) != 0;";
  protected final String TEXT_1895 = NL + "\t\treturn ";
  protected final String TEXT_1896 = "ESet;";
  protected final String TEXT_1897 = NL + "\t\treturn !((";
  protected final String TEXT_1898 = ".Internal)((";
  protected final String TEXT_1899 = ".Internal.Wrapper)get";
  protected final String TEXT_1900 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1901 = ");";
  protected final String TEXT_1902 = NL + "\t\treturn !((";
  protected final String TEXT_1903 = ".Internal)get";
  protected final String TEXT_1904 = "()).isEmpty(";
  protected final String TEXT_1905 = ");";
  protected final String TEXT_1906 = NL + "\t\treturn ";
  protected final String TEXT_1907 = ".";
  protected final String TEXT_1908 = "(this);";
  protected final String TEXT_1909 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1910 = "' ";
  protected final String TEXT_1911 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1912 = NL + "\t}" + NL;
  protected final String TEXT_1913 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_1914 = "(";
  protected final String TEXT_1915 = ") <em>";
  protected final String TEXT_1916 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1917 = "(";
  protected final String TEXT_1918 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1919 = " ";
  protected final String TEXT_1920 = "__EOCL_EXP = \"";
  protected final String TEXT_1921 = "\";";
  protected final String TEXT_1922 = NL;
  protected final String TEXT_1923 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_1924 = "(";
  protected final String TEXT_1925 = ") <em>";
  protected final String TEXT_1926 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1927 = "(";
  protected final String TEXT_1928 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1929 = " ";
  protected final String TEXT_1930 = "__EOCL_INV;" + NL;
  protected final String TEXT_1931 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_1932 = "(";
  protected final String TEXT_1933 = ") <em>";
  protected final String TEXT_1934 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1935 = "(";
  protected final String TEXT_1936 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1937 = "<";
  protected final String TEXT_1938 = ">";
  protected final String TEXT_1939 = " ";
  protected final String TEXT_1940 = "__EOCL_QRY;" + NL;
  protected final String TEXT_1941 = NL + "\t/**" + NL + "\t * The cached validation expression for the '{@link #";
  protected final String TEXT_1942 = "(";
  protected final String TEXT_1943 = ") <em>";
  protected final String TEXT_1944 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1945 = "(";
  protected final String TEXT_1946 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1947 = " ";
  protected final String TEXT_1948 = "__EEXPRESSION = \"";
  protected final String TEXT_1949 = "\";";
  protected final String TEXT_1950 = NL;
  protected final String TEXT_1951 = NL + "\t/**" + NL + "\t * The cached invocation delegate for the '{@link #";
  protected final String TEXT_1952 = "(";
  protected final String TEXT_1953 = ") <em>";
  protected final String TEXT_1954 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1955 = "(";
  protected final String TEXT_1956 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1957 = ".Internal.InvocationDelegate ";
  protected final String TEXT_1958 = "__EINVOCATION_DELEGATE = ((";
  protected final String TEXT_1959 = ".Internal)";
  protected final String TEXT_1960 = ").getInvocationDelegate();" + NL;
  protected final String TEXT_1961 = NL + "\t/**";
  protected final String TEXT_1962 = NL + "\t * <p>" + NL + "\t * This operation redefines the following operations:" + NL + "\t * <ul>";
  protected final String TEXT_1963 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_1964 = "#";
  protected final String TEXT_1965 = "(";
  protected final String TEXT_1966 = ") <em>";
  protected final String TEXT_1967 = "</em>}' </li>";
  protected final String TEXT_1968 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_1969 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1970 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1971 = NL + "\t * ";
  protected final String TEXT_1972 = NL + "\t * @param ";
  protected final String TEXT_1973 = NL + "\t *   ";
  protected final String TEXT_1974 = NL + "\t * @param ";
  protected final String TEXT_1975 = " ";
  protected final String TEXT_1976 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1977 = NL + "\t * @model ";
  protected final String TEXT_1978 = NL + "\t *        ";
  protected final String TEXT_1979 = NL + "\t * @model";
  protected final String TEXT_1980 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1981 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1982 = NL + "\t@Override";
  protected final String TEXT_1983 = NL + "\t";
  protected final String TEXT_1984 = " ";
  protected final String TEXT_1985 = "(";
  protected final String TEXT_1986 = ")";
  protected final String TEXT_1987 = ";" + NL;
  protected final String TEXT_1988 = NL + "\tpublic ";
  protected final String TEXT_1989 = " ";
  protected final String TEXT_1990 = "(";
  protected final String TEXT_1991 = ")";
  protected final String TEXT_1992 = NL + "\t{";
  protected final String TEXT_1993 = NL + "\t\t";
  protected final String TEXT_1994 = NL + "\t\treturn" + NL + "\t\t\t";
  protected final String TEXT_1995 = ".validate" + NL + "\t\t\t\t(";
  protected final String TEXT_1996 = "," + NL + "\t\t\t\t this," + NL + "\t\t\t\t ";
  protected final String TEXT_1997 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_1998 = "," + NL + "\t\t\t\t \"";
  protected final String TEXT_1999 = "\",";
  protected final String TEXT_2000 = NL + "\t\t\t\t ";
  protected final String TEXT_2001 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_2002 = "__EEXPRESSION," + NL + "\t\t\t\t ";
  protected final String TEXT_2003 = ".ERROR," + NL + "\t\t\t\t ";
  protected final String TEXT_2004 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t ";
  protected final String TEXT_2005 = ".";
  protected final String TEXT_2006 = ");";
  protected final String TEXT_2007 = NL + "\t\treturn ";
  protected final String TEXT_2008 = ".";
  protected final String TEXT_2009 = "(this, ";
  protected final String TEXT_2010 = ", ";
  protected final String TEXT_2011 = ");";
  protected final String TEXT_2012 = NL + "\t\tif (";
  protected final String TEXT_2013 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2014 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_2015 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2016 = " = helper.createInvariant(";
  protected final String TEXT_2017 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2018 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_2019 = ").check(this))";
  protected final String TEXT_2020 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_2021 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_2022 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2023 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_2024 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_2025 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2026 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2027 = ".";
  protected final String TEXT_2028 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2029 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_2030 = "\", ";
  protected final String TEXT_2031 = ".getObjectLabel(this, ";
  protected final String TEXT_2032 = ") }),";
  protected final String TEXT_2033 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_2034 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_2035 = NL + "\t\t\t";
  protected final String TEXT_2036 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_2037 = "new ";
  protected final String TEXT_2038 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_2039 = ", ";
  protected final String TEXT_2040 = ")";
  protected final String TEXT_2041 = "null";
  protected final String TEXT_2042 = ");";
  protected final String TEXT_2043 = NL + "\t\t\treturn ";
  protected final String TEXT_2044 = "(";
  protected final String TEXT_2045 = "(";
  protected final String TEXT_2046 = ")";
  protected final String TEXT_2047 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_2048 = "new ";
  protected final String TEXT_2049 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_2050 = ", ";
  protected final String TEXT_2051 = ")";
  protected final String TEXT_2052 = "null";
  protected final String TEXT_2053 = ")";
  protected final String TEXT_2054 = ").";
  protected final String TEXT_2055 = "()";
  protected final String TEXT_2056 = ";";
  protected final String TEXT_2057 = NL + "\t\t}" + NL + "\t\tcatch (";
  protected final String TEXT_2058 = " ite)" + NL + "\t\t{" + NL + "\t\t\tthrow new ";
  protected final String TEXT_2059 = "(ite);" + NL + "\t\t}";
  protected final String TEXT_2060 = NL + "\t\t";
  protected final String TEXT_2061 = ".";
  protected final String TEXT_2062 = "(this";
  protected final String TEXT_2063 = ", ";
  protected final String TEXT_2064 = ");";
  protected final String TEXT_2065 = NL + "\t\t";
  protected final String TEXT_2066 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_2067 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2068 = NL + "\t\t\t";
  protected final String TEXT_2069 = " result = (";
  protected final String TEXT_2070 = ") cache.get(";
  protected final String TEXT_2071 = "eResource(), ";
  protected final String TEXT_2072 = "this, ";
  protected final String TEXT_2073 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_2074 = "eResource(), ";
  protected final String TEXT_2075 = "this, ";
  protected final String TEXT_2076 = ", result = ";
  protected final String TEXT_2077 = "new ";
  protected final String TEXT_2078 = "(";
  protected final String TEXT_2079 = ".";
  protected final String TEXT_2080 = "(this";
  protected final String TEXT_2081 = ", ";
  protected final String TEXT_2082 = ")";
  protected final String TEXT_2083 = ")";
  protected final String TEXT_2084 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_2085 = ".";
  protected final String TEXT_2086 = "()";
  protected final String TEXT_2087 = ";" + NL + "\t\t}";
  protected final String TEXT_2088 = NL + "\t\treturn ";
  protected final String TEXT_2089 = ".";
  protected final String TEXT_2090 = "(this";
  protected final String TEXT_2091 = ", ";
  protected final String TEXT_2092 = ");";
  protected final String TEXT_2093 = NL + "\t\tif (";
  protected final String TEXT_2094 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2095 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_2096 = ", ";
  protected final String TEXT_2097 = ".getEAllOperations().get(";
  protected final String TEXT_2098 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2099 = " = helper.createQuery(";
  protected final String TEXT_2100 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2101 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_2102 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_2103 = ");";
  protected final String TEXT_2104 = NL + "\t\t";
  protected final String TEXT_2105 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_2106 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_2107 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_2108 = "\", ";
  protected final String TEXT_2109 = ");";
  protected final String TEXT_2110 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2111 = NL + "\t\t";
  protected final String TEXT_2112 = "<";
  protected final String TEXT_2113 = "> result = (";
  protected final String TEXT_2114 = "<";
  protected final String TEXT_2115 = ">) query.evaluate(this);" + NL + "\t\treturn new ";
  protected final String TEXT_2116 = ".UnmodifiableEList<";
  protected final String TEXT_2117 = ">(result.size(), result.toArray());";
  protected final String TEXT_2118 = NL + "\t\treturn ((";
  protected final String TEXT_2119 = ") query.evaluate(this)).";
  protected final String TEXT_2120 = "();";
  protected final String TEXT_2121 = NL + "\t\treturn (";
  protected final String TEXT_2122 = ") query.evaluate(this);";
  protected final String TEXT_2123 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2124 = NL + "\t}" + NL;
  protected final String TEXT_2125 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2126 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2127 = NL + "\t@Override";
  protected final String TEXT_2128 = NL + "\tpublic ";
  protected final String TEXT_2129 = " eInverseAdd(";
  protected final String TEXT_2130 = " otherEnd, int featureID, ";
  protected final String TEXT_2131 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2132 = ")" + NL + "\t\t{";
  protected final String TEXT_2133 = NL + "\t\t\tcase ";
  protected final String TEXT_2134 = ":";
  protected final String TEXT_2135 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2136 = "(";
  protected final String TEXT_2137 = ".InternalMapView";
  protected final String TEXT_2138 = ")";
  protected final String TEXT_2139 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2140 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2141 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2142 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2143 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2144 = "((";
  protected final String TEXT_2145 = ")otherEnd, msgs);";
  protected final String TEXT_2146 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_2147 = ", msgs);";
  protected final String TEXT_2148 = NL + "\t\t\t\t";
  protected final String TEXT_2149 = " ";
  protected final String TEXT_2150 = " = (";
  protected final String TEXT_2151 = ")eVirtualGet(";
  protected final String TEXT_2152 = ");";
  protected final String TEXT_2153 = NL + "\t\t\t\t";
  protected final String TEXT_2154 = " ";
  protected final String TEXT_2155 = " = ";
  protected final String TEXT_2156 = "basicGet";
  protected final String TEXT_2157 = "();";
  protected final String TEXT_2158 = NL + "\t\t\t\tif (";
  protected final String TEXT_2159 = " != null)";
  protected final String TEXT_2160 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2161 = ")";
  protected final String TEXT_2162 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_2163 = ", null, msgs);";
  protected final String TEXT_2164 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2165 = ")";
  protected final String TEXT_2166 = ").eInverseRemove(this, ";
  protected final String TEXT_2167 = ", ";
  protected final String TEXT_2168 = ".class, msgs);";
  protected final String TEXT_2169 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2170 = "((";
  protected final String TEXT_2171 = ")otherEnd, msgs);";
  protected final String TEXT_2172 = NL + "\t\t}";
  protected final String TEXT_2173 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2174 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2175 = NL + "\t}" + NL;
  protected final String TEXT_2176 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2177 = NL + "\t@Override";
  protected final String TEXT_2178 = NL + "\tpublic ";
  protected final String TEXT_2179 = " eInverseRemove(";
  protected final String TEXT_2180 = " otherEnd, int featureID, ";
  protected final String TEXT_2181 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2182 = ")" + NL + "\t\t{";
  protected final String TEXT_2183 = NL + "\t\t\tcase ";
  protected final String TEXT_2184 = ":";
  protected final String TEXT_2185 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2186 = ")((";
  protected final String TEXT_2187 = ".InternalMapView";
  protected final String TEXT_2188 = ")";
  protected final String TEXT_2189 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2190 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2191 = ")((";
  protected final String TEXT_2192 = ".Internal.Wrapper)";
  protected final String TEXT_2193 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2194 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2195 = ")";
  protected final String TEXT_2196 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2197 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_2198 = ", msgs);";
  protected final String TEXT_2199 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_2200 = "(msgs);";
  protected final String TEXT_2201 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2202 = "(null, msgs);";
  protected final String TEXT_2203 = NL + "\t\t}";
  protected final String TEXT_2204 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2205 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2206 = NL + "\t}" + NL;
  protected final String TEXT_2207 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2208 = NL + "\t@Override";
  protected final String TEXT_2209 = NL + "\tpublic ";
  protected final String TEXT_2210 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_2211 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID()";
  protected final String TEXT_2212 = ")" + NL + "\t\t{";
  protected final String TEXT_2213 = NL + "\t\t\tcase ";
  protected final String TEXT_2214 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_2215 = ", ";
  protected final String TEXT_2216 = ".class, msgs);";
  protected final String TEXT_2217 = NL + "\t\t}";
  protected final String TEXT_2218 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_2219 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2220 = NL + "\t}" + NL;
  protected final String TEXT_2221 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2222 = NL + "\t@Override";
  protected final String TEXT_2223 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2224 = ")" + NL + "\t\t{";
  protected final String TEXT_2225 = NL + "\t\t\tcase ";
  protected final String TEXT_2226 = ":";
  protected final String TEXT_2227 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2228 = "();";
  protected final String TEXT_2229 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2230 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_2231 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_2232 = "(";
  protected final String TEXT_2233 = "());";
  protected final String TEXT_2234 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_2235 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2236 = "();";
  protected final String TEXT_2237 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2238 = ".InternalMapView";
  protected final String TEXT_2239 = ")";
  protected final String TEXT_2240 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2241 = "();";
  protected final String TEXT_2242 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2243 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2244 = "().map();";
  protected final String TEXT_2245 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2246 = ".Internal.Wrapper)";
  protected final String TEXT_2247 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2248 = "();";
  protected final String TEXT_2249 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2250 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_2251 = ".Internal)";
  protected final String TEXT_2252 = "()).getWrapper();";
  protected final String TEXT_2253 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2254 = "();";
  protected final String TEXT_2255 = NL + "\t\t}";
  protected final String TEXT_2256 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_2257 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_2258 = NL + "\t}" + NL;
  protected final String TEXT_2259 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2260 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2261 = NL + "\t@Override";
  protected final String TEXT_2262 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2263 = ")" + NL + "\t\t{";
  protected final String TEXT_2264 = NL + "\t\t\tcase ";
  protected final String TEXT_2265 = ":";
  protected final String TEXT_2266 = NL + "\t\t\t\t((";
  protected final String TEXT_2267 = ".Internal)((";
  protected final String TEXT_2268 = ".Internal.Wrapper)";
  protected final String TEXT_2269 = "()).featureMap()).set(newValue);";
  protected final String TEXT_2270 = NL + "\t\t\t\t((";
  protected final String TEXT_2271 = ".Internal)";
  protected final String TEXT_2272 = "()).set(newValue);";
  protected final String TEXT_2273 = NL + "\t\t\t\t((";
  protected final String TEXT_2274 = ".Setting)((";
  protected final String TEXT_2275 = ".InternalMapView";
  protected final String TEXT_2276 = ")";
  protected final String TEXT_2277 = "()).eMap()).set(newValue);";
  protected final String TEXT_2278 = NL + "\t\t\t\t((";
  protected final String TEXT_2279 = ".Setting)";
  protected final String TEXT_2280 = "()).set(newValue);";
  protected final String TEXT_2281 = NL + "\t\t\t\t";
  protected final String TEXT_2282 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_2283 = "().addAll((";
  protected final String TEXT_2284 = "<? extends ";
  protected final String TEXT_2285 = ">";
  protected final String TEXT_2286 = ")newValue);";
  protected final String TEXT_2287 = NL + "\t\t\t\tset";
  protected final String TEXT_2288 = "(((";
  protected final String TEXT_2289 = ")newValue).";
  protected final String TEXT_2290 = "());";
  protected final String TEXT_2291 = NL + "\t\t\t\tset";
  protected final String TEXT_2292 = "(";
  protected final String TEXT_2293 = "(";
  protected final String TEXT_2294 = ")";
  protected final String TEXT_2295 = "newValue);";
  protected final String TEXT_2296 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2297 = NL + "\t\t}";
  protected final String TEXT_2298 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_2299 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_2300 = NL + "\t}" + NL;
  protected final String TEXT_2301 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2302 = NL + "\t@Override";
  protected final String TEXT_2303 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2304 = ")" + NL + "\t\t{";
  protected final String TEXT_2305 = NL + "\t\t\tcase ";
  protected final String TEXT_2306 = ":";
  protected final String TEXT_2307 = NL + "\t\t\t\t((";
  protected final String TEXT_2308 = ".Internal.Wrapper)";
  protected final String TEXT_2309 = "()).featureMap().clear();";
  protected final String TEXT_2310 = NL + "\t\t\t\t";
  protected final String TEXT_2311 = "().clear();";
  protected final String TEXT_2312 = NL + "\t\t\t\tunset";
  protected final String TEXT_2313 = "();";
  protected final String TEXT_2314 = NL + "\t\t\t\tset";
  protected final String TEXT_2315 = "((";
  protected final String TEXT_2316 = ")null);";
  protected final String TEXT_2317 = NL + "\t\t\t\tset";
  protected final String TEXT_2318 = "(";
  protected final String TEXT_2319 = ");";
  protected final String TEXT_2320 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2321 = NL + "\t\t}";
  protected final String TEXT_2322 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_2323 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_2324 = NL + "\t}" + NL;
  protected final String TEXT_2325 = NL;
  protected final String TEXT_2326 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2327 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2328 = NL + "\t@Override";
  protected final String TEXT_2329 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_2330 = NL + "\t\t\tcase ";
  protected final String TEXT_2331 = ":";
  protected final String TEXT_2332 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2333 = "();";
  protected final String TEXT_2334 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2335 = "();";
  protected final String TEXT_2336 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2337 = "_ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_2338 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_2339 = ".Internal.Wrapper)";
  protected final String TEXT_2340 = "()).featureMap().isEmpty();";
  protected final String TEXT_2341 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2342 = " != null && !";
  protected final String TEXT_2343 = ".featureMap().isEmpty();";
  protected final String TEXT_2344 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2345 = " != null && !";
  protected final String TEXT_2346 = ".isEmpty();";
  protected final String TEXT_2347 = NL + "\t\t\t\t";
  protected final String TEXT_2348 = " ";
  protected final String TEXT_2349 = " = (";
  protected final String TEXT_2350 = ")eVirtualGet(";
  protected final String TEXT_2351 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2352 = " != null && !";
  protected final String TEXT_2353 = ".isEmpty();";
  protected final String TEXT_2354 = NL + "\t\t\t\treturn !";
  protected final String TEXT_2355 = "().isEmpty();";
  protected final String TEXT_2356 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2357 = "();";
  protected final String TEXT_2358 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2359 = " != null;";
  protected final String TEXT_2360 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2361 = ") != null;";
  protected final String TEXT_2362 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2363 = "() != null;";
  protected final String TEXT_2364 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2365 = " != null;";
  protected final String TEXT_2366 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2367 = ") != null;";
  protected final String TEXT_2368 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2369 = "() != null;";
  protected final String TEXT_2370 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2371 = " & ";
  protected final String TEXT_2372 = "_EFLAG) != 0) != ";
  protected final String TEXT_2373 = ";";
  protected final String TEXT_2374 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2375 = " & ";
  protected final String TEXT_2376 = "_EFLAG) != ";
  protected final String TEXT_2377 = "_EFLAG_DEFAULT;";
  protected final String TEXT_2378 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2379 = " != ";
  protected final String TEXT_2380 = ";";
  protected final String TEXT_2381 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2382 = ", ";
  protected final String TEXT_2383 = ") != ";
  protected final String TEXT_2384 = ";";
  protected final String TEXT_2385 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2386 = "() != ";
  protected final String TEXT_2387 = ";";
  protected final String TEXT_2388 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2389 = " == null ? ";
  protected final String TEXT_2390 = " != null : !";
  protected final String TEXT_2391 = ".equals(";
  protected final String TEXT_2392 = ");";
  protected final String TEXT_2393 = NL + "\t\t\t\t";
  protected final String TEXT_2394 = " ";
  protected final String TEXT_2395 = " = (";
  protected final String TEXT_2396 = ")eVirtualGet(";
  protected final String TEXT_2397 = ", ";
  protected final String TEXT_2398 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2399 = " == null ? ";
  protected final String TEXT_2400 = " != null : !";
  protected final String TEXT_2401 = ".equals(";
  protected final String TEXT_2402 = ");";
  protected final String TEXT_2403 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2404 = " == null ? ";
  protected final String TEXT_2405 = "() != null : !";
  protected final String TEXT_2406 = ".equals(";
  protected final String TEXT_2407 = "());";
  protected final String TEXT_2408 = NL + "\t\t}";
  protected final String TEXT_2409 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2410 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2411 = NL + "\t}" + NL;
  protected final String TEXT_2412 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2413 = NL + "\t@Override";
  protected final String TEXT_2414 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2415 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2416 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2417 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_2418 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2419 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2420 = ": return ";
  protected final String TEXT_2421 = ";";
  protected final String TEXT_2422 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2423 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_2424 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2425 = NL + "\t@Override";
  protected final String TEXT_2426 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2427 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2428 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2429 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2430 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2431 = ": return ";
  protected final String TEXT_2432 = ";";
  protected final String TEXT_2433 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2434 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2435 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_2436 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2437 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2438 = ": return ";
  protected final String TEXT_2439 = ";";
  protected final String TEXT_2440 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2441 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2442 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2443 = NL + "\t@Override";
  protected final String TEXT_2444 = NL + "\tpublic int eDerivedOperationID(int baseOperationID, Class";
  protected final String TEXT_2445 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2446 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2447 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_2448 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2449 = ": return ";
  protected final String TEXT_2450 = ";";
  protected final String TEXT_2451 = NL + "\t\t\t\tdefault: return super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2452 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2453 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_2454 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2455 = ": return ";
  protected final String TEXT_2456 = ";";
  protected final String TEXT_2457 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2458 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2459 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID";
  protected final String TEXT_2460 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2461 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2462 = ": return ";
  protected final String TEXT_2463 = ";";
  protected final String TEXT_2464 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2465 = NL + "\t\treturn super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2466 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2467 = NL + "\t@Override";
  protected final String TEXT_2468 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2469 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2470 = NL + "\t@Override";
  protected final String TEXT_2471 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2472 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2473 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2474 = NL + "\t@Override";
  protected final String TEXT_2475 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2476 = NL + "\t\t\tcase ";
  protected final String TEXT_2477 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2478 = ";";
  protected final String TEXT_2479 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2480 = NL + "\t@Override";
  protected final String TEXT_2481 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2482 = NL + "\t\t\tcase ";
  protected final String TEXT_2483 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2484 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2485 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2486 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2487 = NL + "\t@Override";
  protected final String TEXT_2488 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2489 = NL + "\tpublic Object eInvoke(int operationID, ";
  protected final String TEXT_2490 = " arguments) throws ";
  protected final String TEXT_2491 = NL + "\t{" + NL + "\t\tswitch (operationID";
  protected final String TEXT_2492 = ")" + NL + "\t\t{";
  protected final String TEXT_2493 = NL + "\t\t\tcase ";
  protected final String TEXT_2494 = ":";
  protected final String TEXT_2495 = NL + "\t\t\t\t";
  protected final String TEXT_2496 = "(";
  protected final String TEXT_2497 = "(";
  protected final String TEXT_2498 = "(";
  protected final String TEXT_2499 = ")";
  protected final String TEXT_2500 = "arguments.get(";
  protected final String TEXT_2501 = ")";
  protected final String TEXT_2502 = ").";
  protected final String TEXT_2503 = "()";
  protected final String TEXT_2504 = ", ";
  protected final String TEXT_2505 = ");" + NL + "\t\t\t\treturn null;";
  protected final String TEXT_2506 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2507 = "new ";
  protected final String TEXT_2508 = "(";
  protected final String TEXT_2509 = "(";
  protected final String TEXT_2510 = "(";
  protected final String TEXT_2511 = "(";
  protected final String TEXT_2512 = ")";
  protected final String TEXT_2513 = "arguments.get(";
  protected final String TEXT_2514 = ")";
  protected final String TEXT_2515 = ").";
  protected final String TEXT_2516 = "()";
  protected final String TEXT_2517 = ", ";
  protected final String TEXT_2518 = ")";
  protected final String TEXT_2519 = ")";
  protected final String TEXT_2520 = ";";
  protected final String TEXT_2521 = NL + "\t\t}";
  protected final String TEXT_2522 = NL + "\t\treturn super.eInvoke(operationID, arguments);";
  protected final String TEXT_2523 = NL + "\t\treturn eDynamicInvoke(operationID, arguments);";
  protected final String TEXT_2524 = NL + "\t}" + NL;
  protected final String TEXT_2525 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2526 = NL + "\t@Override";
  protected final String TEXT_2527 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2528 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2529 = ": \");";
  protected final String TEXT_2530 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2531 = ": \");";
  protected final String TEXT_2532 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2533 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2534 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2535 = NL + "\t\tif (";
  protected final String TEXT_2536 = "(";
  protected final String TEXT_2537 = " & ";
  protected final String TEXT_2538 = "_ESETFLAG) != 0";
  protected final String TEXT_2539 = "ESet";
  protected final String TEXT_2540 = ") result.append((";
  protected final String TEXT_2541 = " & ";
  protected final String TEXT_2542 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2543 = NL + "\t\tif (";
  protected final String TEXT_2544 = "(";
  protected final String TEXT_2545 = " & ";
  protected final String TEXT_2546 = "_ESETFLAG) != 0";
  protected final String TEXT_2547 = "ESet";
  protected final String TEXT_2548 = ") result.append(";
  protected final String TEXT_2549 = "_EFLAG_VALUES[(";
  protected final String TEXT_2550 = " & ";
  protected final String TEXT_2551 = "_EFLAG) >>> ";
  protected final String TEXT_2552 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_2553 = NL + "\t\tif (";
  protected final String TEXT_2554 = "(";
  protected final String TEXT_2555 = " & ";
  protected final String TEXT_2556 = "_ESETFLAG) != 0";
  protected final String TEXT_2557 = "ESet";
  protected final String TEXT_2558 = ") result.append(";
  protected final String TEXT_2559 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2560 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2561 = ", ";
  protected final String TEXT_2562 = "));";
  protected final String TEXT_2563 = NL + "\t\tresult.append((";
  protected final String TEXT_2564 = " & ";
  protected final String TEXT_2565 = "_EFLAG) != 0);";
  protected final String TEXT_2566 = NL + "\t\tresult.append(";
  protected final String TEXT_2567 = "_EFLAG_VALUES[(";
  protected final String TEXT_2568 = " & ";
  protected final String TEXT_2569 = "_EFLAG) >>> ";
  protected final String TEXT_2570 = "_EFLAG_OFFSET]);";
  protected final String TEXT_2571 = NL + "\t\tresult.append(";
  protected final String TEXT_2572 = ");";
  protected final String TEXT_2573 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2574 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2575 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2576 = " getKey()" + NL + "\t{";
  protected final String TEXT_2577 = NL + "\t\treturn new ";
  protected final String TEXT_2578 = "(getTypedKey());";
  protected final String TEXT_2579 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2580 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2581 = " key)" + NL + "\t{";
  protected final String TEXT_2582 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2583 = "(";
  protected final String TEXT_2584 = ")";
  protected final String TEXT_2585 = "key);";
  protected final String TEXT_2586 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2587 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2588 = ")key).";
  protected final String TEXT_2589 = "());";
  protected final String TEXT_2590 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2591 = ")key);";
  protected final String TEXT_2592 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2593 = " getValue()" + NL + "\t{";
  protected final String TEXT_2594 = NL + "\t\treturn new ";
  protected final String TEXT_2595 = "(getTypedValue());";
  protected final String TEXT_2596 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2597 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2598 = " setValue(";
  protected final String TEXT_2599 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2600 = " oldValue = getValue();";
  protected final String TEXT_2601 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2602 = "(";
  protected final String TEXT_2603 = ")";
  protected final String TEXT_2604 = "value);";
  protected final String TEXT_2605 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2606 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2607 = ")value).";
  protected final String TEXT_2608 = "());";
  protected final String TEXT_2609 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2610 = ")value);";
  protected final String TEXT_2611 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2612 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2613 = NL + "\tpublic ";
  protected final String TEXT_2614 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2615 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2616 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2617 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2618 = " EOCL_ENV = ";
  protected final String TEXT_2619 = ".newInstance();" + NL;
  protected final String TEXT_2620 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2621 = " create(";
  protected final String TEXT_2622 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2623 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2624 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2625 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2626 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2627 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2628 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2629 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2630 = NL + "\t@Override";
  protected final String TEXT_2631 = NL + "\tprotected ";
  protected final String TEXT_2632 = " ";
  protected final String TEXT_2633 = "Helper(";
  protected final String TEXT_2634 = " ";
  protected final String TEXT_2635 = ")" + NL + "\t{";
  protected final String TEXT_2636 = NL + "\t\t";
  protected final String TEXT_2637 = ".addAll(super.";
  protected final String TEXT_2638 = "());";
  protected final String TEXT_2639 = NL + "\t\tsuper.";
  protected final String TEXT_2640 = "Helper(";
  protected final String TEXT_2641 = ");";
  protected final String TEXT_2642 = NL + "\t\tif (isSet";
  protected final String TEXT_2643 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2644 = "<";
  protected final String TEXT_2645 = ">";
  protected final String TEXT_2646 = " i = ((";
  protected final String TEXT_2647 = ") ";
  protected final String TEXT_2648 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2649 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2650 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2651 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2652 = "<";
  protected final String TEXT_2653 = ">";
  protected final String TEXT_2654 = " i = ((";
  protected final String TEXT_2655 = ") ";
  protected final String TEXT_2656 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2657 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2658 = NL + "\t\t";
  protected final String TEXT_2659 = " ";
  protected final String TEXT_2660 = " = ";
  protected final String TEXT_2661 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2662 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2663 = "<";
  protected final String TEXT_2664 = ">";
  protected final String TEXT_2665 = " i = ((";
  protected final String TEXT_2666 = ") ";
  protected final String TEXT_2667 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2668 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2669 = NL + "\t\tif (isSet";
  protected final String TEXT_2670 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2671 = ".addAll(";
  protected final String TEXT_2672 = "());" + NL + "\t\t}";
  protected final String TEXT_2673 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2674 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2675 = ".addAll(";
  protected final String TEXT_2676 = "());" + NL + "\t\t}";
  protected final String TEXT_2677 = NL + "\t\t";
  protected final String TEXT_2678 = " ";
  protected final String TEXT_2679 = " = ";
  protected final String TEXT_2680 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2681 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2682 = ".addAll(";
  protected final String TEXT_2683 = ");" + NL + "\t\t}";
  protected final String TEXT_2684 = NL + "\t\tif (isSet";
  protected final String TEXT_2685 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2686 = ".add(";
  protected final String TEXT_2687 = "basicGet";
  protected final String TEXT_2688 = "());" + NL + "\t\t}";
  protected final String TEXT_2689 = NL + "\t\t";
  protected final String TEXT_2690 = " ";
  protected final String TEXT_2691 = " = ";
  protected final String TEXT_2692 = "basicGet";
  protected final String TEXT_2693 = "();" + NL + "\t\tif (";
  protected final String TEXT_2694 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2695 = ".add(";
  protected final String TEXT_2696 = ");" + NL + "\t\t}";
  protected final String TEXT_2697 = NL + "\t\treturn ";
  protected final String TEXT_2698 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2699 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2700 = NL + "\t@Override";
  protected final String TEXT_2701 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2702 = "()" + NL + "\t{";
  protected final String TEXT_2703 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2704 = "()";
  protected final String TEXT_2705 = NL + "\t\treturn isSet";
  protected final String TEXT_2706 = "()";
  protected final String TEXT_2707 = ";";
  protected final String TEXT_2708 = NL + "\t\treturn !";
  protected final String TEXT_2709 = "().isEmpty()";
  protected final String TEXT_2710 = ";";
  protected final String TEXT_2711 = NL + "\t\treturn ";
  protected final String TEXT_2712 = "basicGet";
  protected final String TEXT_2713 = "() != null";
  protected final String TEXT_2714 = ";";
  protected final String TEXT_2715 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2716 = ")";
  protected final String TEXT_2717 = ";";
  protected final String TEXT_2718 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2719 = "()";
  protected final String TEXT_2720 = ";";
  protected final String TEXT_2721 = NL + "\t\t\t|| !";
  protected final String TEXT_2722 = "().isEmpty()";
  protected final String TEXT_2723 = ";";
  protected final String TEXT_2724 = NL + "\t\t\t|| ";
  protected final String TEXT_2725 = "basicGet";
  protected final String TEXT_2726 = "() != null";
  protected final String TEXT_2727 = ";";
  protected final String TEXT_2728 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2729 = ")";
  protected final String TEXT_2730 = ";";
  protected final String TEXT_2731 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2732 = "();";
  protected final String TEXT_2733 = NL + "\t\treturn false;";
  protected final String TEXT_2734 = NL + "\t}" + NL;
  protected final String TEXT_2735 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2736 = NL + "\t@Override";
  protected final String TEXT_2737 = NL + "\tpublic ";
  protected final String TEXT_2738 = " ";
  protected final String TEXT_2739 = "()" + NL + "\t{";
  protected final String TEXT_2740 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2741 = " ";
  protected final String TEXT_2742 = " = (";
  protected final String TEXT_2743 = ")((";
  protected final String TEXT_2744 = ")";
  protected final String TEXT_2745 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2746 = ";";
  protected final String TEXT_2747 = NL + "\t\treturn ";
  protected final String TEXT_2748 = "();";
  protected final String TEXT_2749 = NL + "\t\treturn new ";
  protected final String TEXT_2750 = ".UnmodifiableEList";
  protected final String TEXT_2751 = "(this, ";
  protected final String TEXT_2752 = "null";
  protected final String TEXT_2753 = ", 0, ";
  protected final String TEXT_2754 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2755 = NL + "\t\treturn null;";
  protected final String TEXT_2756 = NL + "\t\treturn ";
  protected final String TEXT_2757 = "();";
  protected final String TEXT_2758 = NL + "\t}" + NL;
  protected final String TEXT_2759 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2760 = NL + "\t@Override";
  protected final String TEXT_2761 = NL + "\tpublic ";
  protected final String TEXT_2762 = " basicGet";
  protected final String TEXT_2763 = "()" + NL + "\t{";
  protected final String TEXT_2764 = NL + "\t\treturn null;";
  protected final String TEXT_2765 = NL + "\t\treturn ";
  protected final String TEXT_2766 = "basicGet";
  protected final String TEXT_2767 = "();";
  protected final String TEXT_2768 = NL + "\t}" + NL;
  protected final String TEXT_2769 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2770 = NL + "\t@Override";
  protected final String TEXT_2771 = NL + "\tpublic ";
  protected final String TEXT_2772 = " basicSet";
  protected final String TEXT_2773 = "(";
  protected final String TEXT_2774 = " new";
  protected final String TEXT_2775 = ", ";
  protected final String TEXT_2776 = " msgs)" + NL + "\t{";
  protected final String TEXT_2777 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2778 = NL + "\t\tif (new";
  protected final String TEXT_2779 = " != null && !(new";
  protected final String TEXT_2780 = " instanceof ";
  protected final String TEXT_2781 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2782 = "));" + NL + "\t\t}";
  protected final String TEXT_2783 = NL + "\t\treturn basicSet";
  protected final String TEXT_2784 = "(";
  protected final String TEXT_2785 = "(";
  protected final String TEXT_2786 = ") ";
  protected final String TEXT_2787 = "new";
  protected final String TEXT_2788 = ", msgs);";
  protected final String TEXT_2789 = NL + "\t\tset";
  protected final String TEXT_2790 = "(";
  protected final String TEXT_2791 = "(";
  protected final String TEXT_2792 = ") ";
  protected final String TEXT_2793 = "new";
  protected final String TEXT_2794 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2795 = NL + "\t}" + NL;
  protected final String TEXT_2796 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2797 = NL + "\t@Override";
  protected final String TEXT_2798 = NL + "\tpublic void set";
  protected final String TEXT_2799 = "(";
  protected final String TEXT_2800 = " new";
  protected final String TEXT_2801 = ")" + NL + "\t{";
  protected final String TEXT_2802 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2803 = NL + "\t\tif (new";
  protected final String TEXT_2804 = " != null && !(new";
  protected final String TEXT_2805 = " instanceof ";
  protected final String TEXT_2806 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2807 = "));" + NL + "\t\t}";
  protected final String TEXT_2808 = NL + "\t\tset";
  protected final String TEXT_2809 = "(";
  protected final String TEXT_2810 = "(";
  protected final String TEXT_2811 = ") ";
  protected final String TEXT_2812 = "new";
  protected final String TEXT_2813 = ");";
  protected final String TEXT_2814 = NL + "\t}" + NL;
  protected final String TEXT_2815 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2816 = "() <em>";
  protected final String TEXT_2817 = "</em>}' ";
  protected final String TEXT_2818 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2819 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2820 = "_ESUBSETS = ";
  protected final String TEXT_2821 = ";" + NL;
  protected final String TEXT_2822 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2823 = "() <em>";
  protected final String TEXT_2824 = "</em>}' ";
  protected final String TEXT_2825 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2826 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2827 = "_ESUPERSETS = ";
  protected final String TEXT_2828 = ";" + NL;
  protected final String TEXT_2829 = NL + "\t/**";
  protected final String TEXT_2830 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2831 = "}, with the specified ";
  protected final String TEXT_2832 = ", and appends it to the '<em><b>";
  protected final String TEXT_2833 = "</b></em>' ";
  protected final String TEXT_2834 = ".";
  protected final String TEXT_2835 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2836 = "}, with the specified ";
  protected final String TEXT_2837 = ", and sets the '<em><b>";
  protected final String TEXT_2838 = "</b></em>' ";
  protected final String TEXT_2839 = ".";
  protected final String TEXT_2840 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2841 = "} and appends it to the '<em><b>";
  protected final String TEXT_2842 = "</b></em>' ";
  protected final String TEXT_2843 = ".";
  protected final String TEXT_2844 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2845 = "} and sets the '<em><b>";
  protected final String TEXT_2846 = "</b></em>' ";
  protected final String TEXT_2847 = ".";
  protected final String TEXT_2848 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2849 = NL + "\t * @param ";
  protected final String TEXT_2850 = " The ";
  protected final String TEXT_2851 = " for the new {@link ";
  protected final String TEXT_2852 = "}, or <code>null</code>.";
  protected final String TEXT_2853 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2854 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2855 = "}." + NL + "\t * @see #";
  protected final String TEXT_2856 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2857 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2858 = NL + "\t";
  protected final String TEXT_2859 = " create";
  protected final String TEXT_2860 = "(";
  protected final String TEXT_2861 = ", ";
  protected final String TEXT_2862 = " eClass);" + NL;
  protected final String TEXT_2863 = NL + "\t@Override";
  protected final String TEXT_2864 = NL + "\tpublic ";
  protected final String TEXT_2865 = " create";
  protected final String TEXT_2866 = "(";
  protected final String TEXT_2867 = ", ";
  protected final String TEXT_2868 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2869 = " new";
  protected final String TEXT_2870 = " = (";
  protected final String TEXT_2871 = ") create(eClass);";
  protected final String TEXT_2872 = NL + "\t\t";
  protected final String TEXT_2873 = "().add(new";
  protected final String TEXT_2874 = ");";
  protected final String TEXT_2875 = NL + "\t\tset";
  protected final String TEXT_2876 = "(new";
  protected final String TEXT_2877 = ");";
  protected final String TEXT_2878 = NL + "\t\tint ";
  protected final String TEXT_2879 = "ListSize = 0;";
  protected final String TEXT_2880 = NL + "\t\tint ";
  protected final String TEXT_2881 = "Size = ";
  protected final String TEXT_2882 = " == null ? 0 : ";
  protected final String TEXT_2883 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2884 = "Size > ";
  protected final String TEXT_2885 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2886 = "ListSize = ";
  protected final String TEXT_2887 = "Size;";
  protected final String TEXT_2888 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2889 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2890 = ".create";
  protected final String TEXT_2891 = "(";
  protected final String TEXT_2892 = ", ";
  protected final String TEXT_2893 = "i < ";
  protected final String TEXT_2894 = "Size ? (";
  protected final String TEXT_2895 = ") ";
  protected final String TEXT_2896 = ".get(i) : null";
  protected final String TEXT_2897 = ");" + NL + "\t\t}";
  protected final String TEXT_2898 = NL + "\t\tnew";
  protected final String TEXT_2899 = ".create";
  protected final String TEXT_2900 = "(";
  protected final String TEXT_2901 = ", ";
  protected final String TEXT_2902 = ");";
  protected final String TEXT_2903 = NL + "\t\tif (";
  protected final String TEXT_2904 = " != null)";
  protected final String TEXT_2905 = NL + "\t\t\tnew";
  protected final String TEXT_2906 = ".";
  protected final String TEXT_2907 = "().addAll(";
  protected final String TEXT_2908 = ");";
  protected final String TEXT_2909 = NL + "\t\t\tnew";
  protected final String TEXT_2910 = ".set";
  protected final String TEXT_2911 = "(";
  protected final String TEXT_2912 = ");";
  protected final String TEXT_2913 = NL + "\t\treturn new";
  protected final String TEXT_2914 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2915 = NL + "\t/**";
  protected final String TEXT_2916 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2917 = "}, with the specified ";
  protected final String TEXT_2918 = ", and appends it to the '<em><b>";
  protected final String TEXT_2919 = "</b></em>' ";
  protected final String TEXT_2920 = ".";
  protected final String TEXT_2921 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2922 = "},with the specified ";
  protected final String TEXT_2923 = ", and sets the '<em><b>";
  protected final String TEXT_2924 = "</b></em>' ";
  protected final String TEXT_2925 = ".";
  protected final String TEXT_2926 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2927 = "} and appends it to the '<em><b>";
  protected final String TEXT_2928 = "</b></em>' ";
  protected final String TEXT_2929 = ".";
  protected final String TEXT_2930 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2931 = "} and sets the '<em><b>";
  protected final String TEXT_2932 = "</b></em>' ";
  protected final String TEXT_2933 = ".";
  protected final String TEXT_2934 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2935 = NL + "\t * @param ";
  protected final String TEXT_2936 = " The ";
  protected final String TEXT_2937 = " for the new {@link ";
  protected final String TEXT_2938 = "}, or <code>null</code>.";
  protected final String TEXT_2939 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2940 = "}." + NL + "\t * @see #";
  protected final String TEXT_2941 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2942 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2943 = NL + "\t";
  protected final String TEXT_2944 = " create";
  protected final String TEXT_2945 = "(";
  protected final String TEXT_2946 = ");" + NL;
  protected final String TEXT_2947 = NL + "\t@Override";
  protected final String TEXT_2948 = NL + "\tpublic ";
  protected final String TEXT_2949 = " create";
  protected final String TEXT_2950 = "(";
  protected final String TEXT_2951 = ")" + NL + "\t{";
  protected final String TEXT_2952 = NL + "\t\treturn create";
  protected final String TEXT_2953 = "(";
  protected final String TEXT_2954 = ", ";
  protected final String TEXT_2955 = ");";
  protected final String TEXT_2956 = NL + "\t\t";
  protected final String TEXT_2957 = " new";
  protected final String TEXT_2958 = " = (";
  protected final String TEXT_2959 = ") create(";
  protected final String TEXT_2960 = ");";
  protected final String TEXT_2961 = NL + "\t\t";
  protected final String TEXT_2962 = "().add(new";
  protected final String TEXT_2963 = ");";
  protected final String TEXT_2964 = NL + "\t\tset";
  protected final String TEXT_2965 = "(new";
  protected final String TEXT_2966 = ");";
  protected final String TEXT_2967 = NL + "\t\tint ";
  protected final String TEXT_2968 = "ListSize = 0;";
  protected final String TEXT_2969 = NL + "\t\tint ";
  protected final String TEXT_2970 = "Size = ";
  protected final String TEXT_2971 = " == null ? 0 : ";
  protected final String TEXT_2972 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2973 = "Size > ";
  protected final String TEXT_2974 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2975 = "ListSize = ";
  protected final String TEXT_2976 = "Size;";
  protected final String TEXT_2977 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2978 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2979 = ".create";
  protected final String TEXT_2980 = "(";
  protected final String TEXT_2981 = ", ";
  protected final String TEXT_2982 = "i < ";
  protected final String TEXT_2983 = "Size ? (";
  protected final String TEXT_2984 = ") ";
  protected final String TEXT_2985 = ".get(i) : null";
  protected final String TEXT_2986 = ");" + NL + "\t\t}";
  protected final String TEXT_2987 = NL + "\t\tnew";
  protected final String TEXT_2988 = ".create";
  protected final String TEXT_2989 = "(";
  protected final String TEXT_2990 = ", ";
  protected final String TEXT_2991 = ");";
  protected final String TEXT_2992 = NL + "\t\tif (";
  protected final String TEXT_2993 = " != null)";
  protected final String TEXT_2994 = NL + "\t\t\tnew";
  protected final String TEXT_2995 = ".";
  protected final String TEXT_2996 = "().addAll(";
  protected final String TEXT_2997 = ");";
  protected final String TEXT_2998 = NL + "\t\t\tnew";
  protected final String TEXT_2999 = ".set";
  protected final String TEXT_3000 = "(";
  protected final String TEXT_3001 = ");";
  protected final String TEXT_3002 = NL + "\t\treturn new";
  protected final String TEXT_3003 = ";";
  protected final String TEXT_3004 = NL + "\t}" + NL;
  protected final String TEXT_3005 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_3006 = "} with the specified ";
  protected final String TEXT_3007 = " from the '<em><b>";
  protected final String TEXT_3008 = "</b></em>' ";
  protected final String TEXT_3009 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3010 = NL + "\t * @param ";
  protected final String TEXT_3011 = " The ";
  protected final String TEXT_3012 = " of the {@link ";
  protected final String TEXT_3013 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3014 = NL + "\t * @return The first {@link ";
  protected final String TEXT_3015 = "} with the specified ";
  protected final String TEXT_3016 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_3017 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3018 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3019 = NL + "\t";
  protected final String TEXT_3020 = " get";
  protected final String TEXT_3021 = "(";
  protected final String TEXT_3022 = ");" + NL;
  protected final String TEXT_3023 = NL + "\t@Override";
  protected final String TEXT_3024 = NL + "\tpublic ";
  protected final String TEXT_3025 = " get";
  protected final String TEXT_3026 = "(";
  protected final String TEXT_3027 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_3028 = "(";
  protected final String TEXT_3029 = ", false";
  protected final String TEXT_3030 = ", null";
  protected final String TEXT_3031 = ", false";
  protected final String TEXT_3032 = ");" + NL + "\t}" + NL;
  protected final String TEXT_3033 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_3034 = "} with the specified ";
  protected final String TEXT_3035 = " from the '<em><b>";
  protected final String TEXT_3036 = "</b></em>' ";
  protected final String TEXT_3037 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3038 = NL + "\t * @param ";
  protected final String TEXT_3039 = " The ";
  protected final String TEXT_3040 = " of the {@link ";
  protected final String TEXT_3041 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3042 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_3043 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_3044 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3045 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_3046 = "} on demand if not found.";
  protected final String TEXT_3047 = NL + "\t * @return The first {@link ";
  protected final String TEXT_3048 = "} with the specified ";
  protected final String TEXT_3049 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_3050 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3051 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3052 = NL + "\t";
  protected final String TEXT_3053 = " get";
  protected final String TEXT_3054 = "(";
  protected final String TEXT_3055 = ", boolean ignoreCase";
  protected final String TEXT_3056 = ", ";
  protected final String TEXT_3057 = " eClass";
  protected final String TEXT_3058 = ", boolean createOnDemand";
  protected final String TEXT_3059 = ");" + NL;
  protected final String TEXT_3060 = NL + "\t@Override";
  protected final String TEXT_3061 = NL + "\tpublic ";
  protected final String TEXT_3062 = " get";
  protected final String TEXT_3063 = "(";
  protected final String TEXT_3064 = ", boolean ignoreCase";
  protected final String TEXT_3065 = ", ";
  protected final String TEXT_3066 = " eClass";
  protected final String TEXT_3067 = ", boolean createOnDemand";
  protected final String TEXT_3068 = ")" + NL + "\t{";
  protected final String TEXT_3069 = NL + "\t\t";
  protected final String TEXT_3070 = "Loop: for (";
  protected final String TEXT_3071 = " ";
  protected final String TEXT_3072 = " : ";
  protected final String TEXT_3073 = "())" + NL + "\t\t{";
  protected final String TEXT_3074 = NL + "\t\t";
  protected final String TEXT_3075 = "Loop: for (";
  protected final String TEXT_3076 = " i = ";
  protected final String TEXT_3077 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_3078 = " ";
  protected final String TEXT_3079 = " = (";
  protected final String TEXT_3080 = ") i.next();";
  protected final String TEXT_3081 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_3082 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3083 = "Loop;";
  protected final String TEXT_3084 = NL + "\t\t\t";
  protected final String TEXT_3085 = " ";
  protected final String TEXT_3086 = "List = ";
  protected final String TEXT_3087 = ".";
  protected final String TEXT_3088 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_3089 = "ListSize = ";
  protected final String TEXT_3090 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_3091 = " || (";
  protected final String TEXT_3092 = " != null && ";
  protected final String TEXT_3093 = ".size() != ";
  protected final String TEXT_3094 = "ListSize";
  protected final String TEXT_3095 = ")";
  protected final String TEXT_3096 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_3097 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_3098 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_3099 = " ";
  protected final String TEXT_3100 = " = ";
  protected final String TEXT_3101 = "(";
  protected final String TEXT_3102 = ") ";
  protected final String TEXT_3103 = "List.get(j);";
  protected final String TEXT_3104 = NL + "\t\t\t\tif (";
  protected final String TEXT_3105 = " != null && !(ignoreCase ? (";
  protected final String TEXT_3106 = "(";
  protected final String TEXT_3107 = ")";
  protected final String TEXT_3108 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_3109 = ".";
  protected final String TEXT_3110 = "()) : ";
  protected final String TEXT_3111 = ".get(j).equals(";
  protected final String TEXT_3112 = ".";
  protected final String TEXT_3113 = "())))";
  protected final String TEXT_3114 = NL + "\t\t\t\tif (";
  protected final String TEXT_3115 = " != null && !";
  protected final String TEXT_3116 = ".get(j).equals(";
  protected final String TEXT_3117 = ".";
  protected final String TEXT_3118 = "()))";
  protected final String TEXT_3119 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_3120 = "Loop;";
  protected final String TEXT_3121 = NL + "\t\t\t}";
  protected final String TEXT_3122 = NL + "\t\t\t";
  protected final String TEXT_3123 = " ";
  protected final String TEXT_3124 = " = ";
  protected final String TEXT_3125 = ".";
  protected final String TEXT_3126 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_3127 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3128 = "Loop;";
  protected final String TEXT_3129 = NL + "\t\t\tif (";
  protected final String TEXT_3130 = " != null && !(ignoreCase ? ";
  protected final String TEXT_3131 = ".equalsIgnoreCase(";
  protected final String TEXT_3132 = ".";
  protected final String TEXT_3133 = "()) : ";
  protected final String TEXT_3134 = ".equals(";
  protected final String TEXT_3135 = ".";
  protected final String TEXT_3136 = "())))";
  protected final String TEXT_3137 = NL + "\t\t\tif (";
  protected final String TEXT_3138 = " != null && !";
  protected final String TEXT_3139 = ".equals(";
  protected final String TEXT_3140 = ".";
  protected final String TEXT_3141 = "()))";
  protected final String TEXT_3142 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3143 = "Loop;";
  protected final String TEXT_3144 = NL + "\t\t\tif (";
  protected final String TEXT_3145 = " != null && !(ignoreCase ? ";
  protected final String TEXT_3146 = ".equalsIgnoreCase(";
  protected final String TEXT_3147 = ".";
  protected final String TEXT_3148 = "()) : ";
  protected final String TEXT_3149 = ".equals(";
  protected final String TEXT_3150 = ".";
  protected final String TEXT_3151 = "())))";
  protected final String TEXT_3152 = NL + "\t\t\tif (";
  protected final String TEXT_3153 = " != null && !";
  protected final String TEXT_3154 = ".equals(";
  protected final String TEXT_3155 = ".";
  protected final String TEXT_3156 = "()))";
  protected final String TEXT_3157 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3158 = "Loop;";
  protected final String TEXT_3159 = NL + "\t\t\treturn ";
  protected final String TEXT_3160 = ";" + NL + "\t\t}";
  protected final String TEXT_3161 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_3162 = " && eClass != null";
  protected final String TEXT_3163 = " ? create";
  protected final String TEXT_3164 = "(";
  protected final String TEXT_3165 = ", eClass";
  protected final String TEXT_3166 = ") : null;";
  protected final String TEXT_3167 = NL + "\t\treturn null;";
  protected final String TEXT_3168 = NL + "\t}" + NL;
  protected final String TEXT_3169 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_3170 = "()" + NL + "\t{";
  protected final String TEXT_3171 = NL + "  \t\treturn false;";
  protected final String TEXT_3172 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3173 = ");";
  protected final String TEXT_3174 = NL + "\t\treturn !((";
  protected final String TEXT_3175 = ".Internal.Wrapper)";
  protected final String TEXT_3176 = "()).featureMap().isEmpty();";
  protected final String TEXT_3177 = NL + "\t\treturn ";
  protected final String TEXT_3178 = " != null && !";
  protected final String TEXT_3179 = ".featureMap().isEmpty();";
  protected final String TEXT_3180 = NL + "\t\treturn ";
  protected final String TEXT_3181 = " != null && !";
  protected final String TEXT_3182 = ".isEmpty();";
  protected final String TEXT_3183 = NL + "\t\t";
  protected final String TEXT_3184 = " ";
  protected final String TEXT_3185 = " = (";
  protected final String TEXT_3186 = ")eVirtualGet(";
  protected final String TEXT_3187 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3188 = " != null && !";
  protected final String TEXT_3189 = ".isEmpty();";
  protected final String TEXT_3190 = NL + "\t\treturn !";
  protected final String TEXT_3191 = "().isEmpty();";
  protected final String TEXT_3192 = NL + "\t\treturn ";
  protected final String TEXT_3193 = " != null;";
  protected final String TEXT_3194 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3195 = ") != null;";
  protected final String TEXT_3196 = NL + "\t\treturn basicGet";
  protected final String TEXT_3197 = "() != null;";
  protected final String TEXT_3198 = NL + "\t\treturn ";
  protected final String TEXT_3199 = " != null;";
  protected final String TEXT_3200 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3201 = ") != null;";
  protected final String TEXT_3202 = NL + "\t\treturn ";
  protected final String TEXT_3203 = "() != null;";
  protected final String TEXT_3204 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_3205 = " & ";
  protected final String TEXT_3206 = "_EFLAG) != 0) != ";
  protected final String TEXT_3207 = ";";
  protected final String TEXT_3208 = NL + "\t\t\t\treturn (";
  protected final String TEXT_3209 = " & ";
  protected final String TEXT_3210 = "_EFLAG) != ";
  protected final String TEXT_3211 = "_EFLAG_DEFAULT;";
  protected final String TEXT_3212 = NL + "\t\treturn ";
  protected final String TEXT_3213 = " != ";
  protected final String TEXT_3214 = ";";
  protected final String TEXT_3215 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3216 = ", ";
  protected final String TEXT_3217 = ") != ";
  protected final String TEXT_3218 = ";";
  protected final String TEXT_3219 = NL + "\t\treturn ";
  protected final String TEXT_3220 = "() != ";
  protected final String TEXT_3221 = ";";
  protected final String TEXT_3222 = NL + "\t\treturn ";
  protected final String TEXT_3223 = " == null ? ";
  protected final String TEXT_3224 = " != null : !";
  protected final String TEXT_3225 = ".equals(";
  protected final String TEXT_3226 = ");";
  protected final String TEXT_3227 = NL + "\t\t";
  protected final String TEXT_3228 = " ";
  protected final String TEXT_3229 = " = (";
  protected final String TEXT_3230 = ")eVirtualGet(";
  protected final String TEXT_3231 = ", ";
  protected final String TEXT_3232 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3233 = " == null ? ";
  protected final String TEXT_3234 = " != null : !";
  protected final String TEXT_3235 = ".equals(";
  protected final String TEXT_3236 = ");";
  protected final String TEXT_3237 = NL + "\t\treturn ";
  protected final String TEXT_3238 = " == null ? ";
  protected final String TEXT_3239 = "() != null : !";
  protected final String TEXT_3240 = ".equals(";
  protected final String TEXT_3241 = "());";
  protected final String TEXT_3242 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3243 = ");";
  protected final String TEXT_3244 = NL + "\t\t";
  protected final String TEXT_3245 = " ";
  protected final String TEXT_3246 = " = (";
  protected final String TEXT_3247 = ")eVirtualGet(";
  protected final String TEXT_3248 = ");";
  protected final String TEXT_3249 = NL + "\t\treturn ";
  protected final String TEXT_3250 = " != null && ((";
  protected final String TEXT_3251 = ".Unsettable";
  protected final String TEXT_3252 = ")";
  protected final String TEXT_3253 = ").isSet();";
  protected final String TEXT_3254 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_3255 = ");";
  protected final String TEXT_3256 = NL + "\t\treturn (";
  protected final String TEXT_3257 = " & ";
  protected final String TEXT_3258 = "_ESETFLAG) != 0;";
  protected final String TEXT_3259 = NL + "\t\treturn ";
  protected final String TEXT_3260 = "ESet;";
  protected final String TEXT_3261 = NL + "\t\treturn !((";
  protected final String TEXT_3262 = ".Internal)((";
  protected final String TEXT_3263 = ".Internal.Wrapper)get";
  protected final String TEXT_3264 = "()).featureMap()).isEmpty(";
  protected final String TEXT_3265 = ");";
  protected final String TEXT_3266 = NL + "\t\treturn !((";
  protected final String TEXT_3267 = ".Internal)get";
  protected final String TEXT_3268 = "()).isEmpty(";
  protected final String TEXT_3269 = ");";
  protected final String TEXT_3270 = NL + "\t\treturn ";
  protected final String TEXT_3271 = ".";
  protected final String TEXT_3272 = "(this);";
  protected final String TEXT_3273 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_3274 = "' ";
  protected final String TEXT_3275 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3276 = NL + "\t}" + NL;
  protected final String TEXT_3277 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3278 = NL + "\t@Override";
  protected final String TEXT_3279 = NL + "\tpublic ";
  protected final String TEXT_3280 = " ";
  protected final String TEXT_3281 = "(";
  protected final String TEXT_3282 = ")";
  protected final String TEXT_3283 = NL + "\t{";
  protected final String TEXT_3284 = NL + "\t\t";
  protected final String TEXT_3285 = "(";
  protected final String TEXT_3286 = ");";
  protected final String TEXT_3287 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3288 = NL + "\t\treturn ";
  protected final String TEXT_3289 = "(";
  protected final String TEXT_3290 = ");";
  protected final String TEXT_3291 = NL + "\t}" + NL;
  protected final String TEXT_3292 = NL + "} //";
  protected final String TEXT_3293 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2009 IBM Corporation and others.
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
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_57);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
    stringBuffer.append(TEXT_58);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_59);
    }
    }
    }
    }
    if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_61);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
    if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_70);
    } else if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_77);
    }
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_81);
    if (genFeature.getQualifiedListItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_82);
    }
    stringBuffer.append(TEXT_83);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_87);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_91);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_92);
    if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_97);
    } else {
    stringBuffer.append(TEXT_98);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_100);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) { int flagIndex = genClass.getFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_102);
    }
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_103);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(flagIndex % 32);
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_112);
    if (isJDK50) {
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_113);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_115);
    }
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_118);
    stringBuffer.append(genFeature.getTypeGenClassifier().getFormattedName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_121);
    if (isJDK50) {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_122);
    } else {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_127);
    }
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genClass.getFlagSize(genFeature) > 1 ? "s" : "");
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genClass.getFlagMask(genFeature));
    stringBuffer.append(TEXT_136);
    if (genFeature.isEnumType()) {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_137);
    } else {
    stringBuffer.append(flagIndex % 32);
    }
    stringBuffer.append(TEXT_138);
    } else {
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_146);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) { int flagIndex = genClass.getESetFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_148);
    }
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(flagIndex % 32 );
    stringBuffer.append(TEXT_153);
    } else {
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_157);
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_158);
    stringBuffer.append(genClass.getOffsetCorrectionField(null));
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genClass.getQualifiedFeatureID(genClass.getImplementedGenFeatures().get(0)));
    stringBuffer.append(TEXT_162);
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
    stringBuffer.append(TEXT_163);
    stringBuffer.append(genClass.getOffsetCorrectionField(genFeature));
    stringBuffer.append(TEXT_164);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_165);
    stringBuffer.append(reverseFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_167);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_168);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_169);
    stringBuffer.append(genClass.getImplementedGenOperations().get(0).getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genClass.getQualifiedOperationID(genClass.getImplementedGenOperations().get(0)));
    stringBuffer.append(TEXT_171);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_172);
    if (genModel.isPublicConstructors()) {
    stringBuffer.append(TEXT_173);
    } else {
    stringBuffer.append(TEXT_174);
    }
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_176);
    for (GenFeature genFeature : genClass.getFlagGenFeaturesWithDefault()) {
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_179);
    if (!genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_180);
    }
    stringBuffer.append(TEXT_181);
    }
    stringBuffer.append(TEXT_182);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_183);
    }
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_186);
    }
    if (isImplementation && (genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL || genModel.isDynamicDelegation()) && (genClass.getClassExtendsGenClass() == null || (genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL && !genClass.getClassExtendsGenClass().getGenModel().isDynamicDelegation()))) {
    stringBuffer.append(TEXT_187);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_188);
    }
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_190);
    }
    //Class/reflectiveDelegation.override.javajetinc
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_191);
    if (!isImplementation) {
    stringBuffer.append(TEXT_192);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_194);
    } else {
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_197);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_200);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_201);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_202);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_203);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_204);
    } else {
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_206);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_207);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_209);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_213);
    }
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_215);
    }
    stringBuffer.append(TEXT_216);
    if (!isImplementation) {
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_219);
    } else {
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_222);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_224);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_225);
    }
    stringBuffer.append(TEXT_226);
    if (!isImplementation) {
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_228);
    } else {
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_230);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_232);
    } else {
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_235);
    }
    stringBuffer.append(TEXT_236);
    }
    stringBuffer.append(TEXT_237);
    if (!isImplementation) {
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_241);
    } else {
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_249);
    }
    stringBuffer.append(TEXT_250);
    if (!isImplementation) {
    stringBuffer.append(TEXT_251);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_253);
    } else {
    stringBuffer.append(TEXT_254);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_257);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_260);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_261);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_262);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_263);
    } else {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_265);
    }
    stringBuffer.append(TEXT_266);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_267);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_268);
    } else {
    stringBuffer.append(TEXT_269);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_270);
    }
    stringBuffer.append(TEXT_271);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

    stringBuffer.append(TEXT_272);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_273);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_274);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_276);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_278);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_279);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_280);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_281);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_282);
    }
    }
    if (!UML2GenModelUtil.getSubsettedGenFeatures(genFeature).isEmpty()) {
    stringBuffer.append(TEXT_283);
    for (GenFeature subsettedGenFeature : UML2GenModelUtil.getSubsettedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_284);
    stringBuffer.append(subsettedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_285);
    stringBuffer.append(subsettedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_286);
    stringBuffer.append(subsettedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_287);
    }
    stringBuffer.append(TEXT_288);
    }if (UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_289);
    for (GenFeature redefinedGenFeature : UML2GenModelUtil.getRedefinedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_290);
    stringBuffer.append(redefinedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(redefinedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_292);
    stringBuffer.append(redefinedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_293);
    }
    stringBuffer.append(TEXT_294);
    }if(genFeature.isDerived() && UML2GenModelUtil.isUnion(genFeature)){
    stringBuffer.append(TEXT_295);
    }
    stringBuffer.append(TEXT_296);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_299);
    }
    stringBuffer.append(TEXT_300);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_302);
    }
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_304);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_305);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_308);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_310);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_313);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_315);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_316);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_317);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_318);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_319);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_320);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_321);
    }}
    stringBuffer.append(TEXT_322);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_323);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_324);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_327);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !(genModel.isReflectiveDelegation() && genModel.isDynamicDelegation()) && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && !genFeature.isFeatureMapType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation() || genModel.isDynamicDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature() || genFeature.isListType() && genFeature.hasSettingDelegate())) {
    stringBuffer.append(TEXT_328);
    }
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_331);
    }
    stringBuffer.append(TEXT_332);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_333);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_334);
    }
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_338);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_339);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_341);
    }
    stringBuffer.append(TEXT_342);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_343);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_344);
    }
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_347);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_349);
    }
    stringBuffer.append(TEXT_350);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_351);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_352);
    }
    stringBuffer.append(TEXT_353);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_355);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_356);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_357);
    }
    stringBuffer.append(TEXT_358);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_362);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_363);
    }
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_365);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_367);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_369);
    } else {
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_372);
    }
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_374);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_377);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_379);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_383);
    }
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_395);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_400);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_404);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_407);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_408);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_409);
    }
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_411);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_412);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_414);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_416);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_417);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_418);
    }
    stringBuffer.append(TEXT_419);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_422);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_428);
    }
    stringBuffer.append(TEXT_429);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_433);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_436);
    } else {
    stringBuffer.append(TEXT_437);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_441);
    }
    } else {
    stringBuffer.append(TEXT_442);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_443);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_448);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_453);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = isJDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_457);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_458);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_460);
    } else {
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_462);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_463);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_465);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_467);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_469);
    } else {
    stringBuffer.append(TEXT_470);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_472);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_473);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_474);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_476);
    }
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_478);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_480);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_482);
    }
    stringBuffer.append(TEXT_483);
    } else {
    stringBuffer.append(TEXT_484);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_485);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_487);
    }
    stringBuffer.append(TEXT_488);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_490);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_492);
    }
    stringBuffer.append(TEXT_493);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_496);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_497);
    }
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_500);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_501);
    }
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_503);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_504);
    }
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_506);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_508);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_510);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_511);
    }
    stringBuffer.append(TEXT_512);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_514);
    }
    stringBuffer.append(TEXT_515);
    }
    stringBuffer.append(TEXT_516);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_518);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_521);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_522);
    }
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_529);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_532);
    }
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_534);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_536);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genModel.getNonNLS());
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
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_550);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_551);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_554);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_555);
    }
    stringBuffer.append(TEXT_556);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_558);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_563);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_565);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_566);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_567);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_568);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_569);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_570);
    }
    stringBuffer.append(TEXT_571);
    }
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_576);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_577);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_578);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_579);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_580);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_581);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_583);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_584);
    } else {
    stringBuffer.append(TEXT_585);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_586);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_587);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_588);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_589);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_590);
    }
    }
    }
    }
    stringBuffer.append(TEXT_591);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_593);
    } else {
    stringBuffer.append(TEXT_594);
    }
    stringBuffer.append(TEXT_595);
    }
    } else {
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_598);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_599);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_600);
    if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_601);
    }
    }
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_604);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_605);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_608);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_609);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_610);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_611);
    }
    stringBuffer.append(TEXT_612);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_614);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_615);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_616);
    }
    stringBuffer.append(TEXT_617);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_620);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_623);
    } else {
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_625);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_628);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_630);
    } else {
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_632);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_634);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_635);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_637);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_638);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_639);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_640);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_641);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_643);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_644);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_645);
    } else {
    stringBuffer.append(TEXT_646);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_647);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_648);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_649);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_650);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_651);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_652);
    }
    }
    }
    }
    stringBuffer.append(TEXT_653);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_655);
    } else {
    stringBuffer.append(TEXT_656);
    }
    stringBuffer.append(TEXT_657);
    } else {
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_660);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_661);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_662);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_663);
    }
    }
    stringBuffer.append(TEXT_664);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_665);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_669);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_670);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_673);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_675);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_676);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_677);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_678);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_679);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_680);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_681);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_682);
    }
    stringBuffer.append(TEXT_683);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_684);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_686);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_687);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_689);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_690);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_691);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_692);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_693);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_695);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_697);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_698);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_699);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_701);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_702);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_704);
    }
    stringBuffer.append(TEXT_705);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_706);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_707);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_709);
    }
    stringBuffer.append(TEXT_710);
    }
    stringBuffer.append(TEXT_711);
    }
    stringBuffer.append(TEXT_712);
    } else if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_714);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_716);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_718);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_719);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_720);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_721);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_722);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_723);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_725);
    }
    stringBuffer.append(TEXT_726);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_729);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_730);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_732);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_733);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_734);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_735);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_736);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_738);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_740);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_741);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_742);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_743);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_744);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_745);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_747);
    }
    stringBuffer.append(TEXT_748);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_749);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_750);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_751);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_752);
    }
    stringBuffer.append(TEXT_753);
    }
    stringBuffer.append(TEXT_754);
    }
    stringBuffer.append(TEXT_755);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_756);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_759);
    } else {
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_765);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_767);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_771);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_774);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_775);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_777);
    }
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_779);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_780);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_781);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_782);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_784);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_785);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_786);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_788);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_789);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_790);
    } else {
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_792);
    }
    stringBuffer.append(TEXT_793);
    } else {
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_795);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_797);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_798);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_799);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_801);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_803);
    }
    stringBuffer.append(TEXT_804);
    }
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_806);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_807);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_808);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_809);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_810);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_811);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_812);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_813);
    }
    stringBuffer.append(TEXT_814);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_815);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_817);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_818);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_820);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_821);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_822);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_823);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_825);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_826);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_828);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_829);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_830);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_832);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_833);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_834);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_835);
    }
    stringBuffer.append(TEXT_836);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_837);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_840);
    }
    stringBuffer.append(TEXT_841);
    }
    stringBuffer.append(TEXT_842);
    }
    stringBuffer.append(TEXT_843);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_845);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_846);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_849);
    } else {
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_851);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_853);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_854);
    }
    } else {
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_857);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_858);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_862);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_863);
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_866);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_867);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_869);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_871);
    }
    }
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_873);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_874);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_875);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_878);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_880);
    }
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_882);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_883);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_887);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_888);
    }
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_891);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_893);
    }
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_895);
    }
    stringBuffer.append(TEXT_896);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_898);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_900);
    }
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_902);
    }
    stringBuffer.append(TEXT_903);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_905);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_907);
    }
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_909);
    }
    stringBuffer.append(TEXT_910);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_915);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_920);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_923);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_924);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_925);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_926);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_927);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_928);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_929);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_930);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_931);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_934);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_938);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_939);
    }
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_944);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_946);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_952);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_953);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_955);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_956);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_960);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_961);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_962);
    }
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_966);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_967);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_970);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_974);
    }
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_977);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_980);
    }
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_982);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_989);
    }
    stringBuffer.append(TEXT_990);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_991);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_996);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1001);
    } else {
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1008);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1014);
    } else {
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1021);
    if (isJDK50) {
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1023);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1025);
    }
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1027);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1031);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1037);
    } else {
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1042);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1047);
    } else {
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1051);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1055);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1057);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1061);
    }
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1064);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1067);
    }
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1069);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1073);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1077);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1079);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1080);
    } else {
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1082);
    }
    stringBuffer.append(TEXT_1083);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1087);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1092);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1094);
    }
    }
    }
    if (!genFeature.isBasicSet()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_1096);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1100);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1103);
    }
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1108);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1110);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1118);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1122);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_1125);
    }
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1130);
    }
    stringBuffer.append(TEXT_1131);
    }
    stringBuffer.append(TEXT_1132);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1137);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1139);
    }
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1141);
    }
    stringBuffer.append(TEXT_1142);
    } else {
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1146);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1148);
    }
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1150);
    }
    stringBuffer.append(TEXT_1151);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1156);
    } else {
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1159);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1160);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_1161);
    if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1162);
    }
    }
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1166);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1168);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1171);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1173);
    }
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1175);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1179);
    }
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1181);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1183);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1187);
    }
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1190);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1193);
    }
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1195);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1200);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1202);
    } else {
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1204);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1205);
    } else {
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1207);
    }
    stringBuffer.append(TEXT_1208);
    }
    } else {
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1211);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1212);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(TEXT_1218);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1220);
    }
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1222);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1225);
    }
    stringBuffer.append(TEXT_1226);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1227);
    if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1228);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1230);
    } else {
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1232);
    }
    stringBuffer.append(TEXT_1233);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1236);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1238);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1240);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1245);
    }
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1250);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1255);
    }
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1258);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1262);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1267);
    }
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1269);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1272);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1276);
    }
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1279);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1282);
    }
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1284);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1289);
    }
    stringBuffer.append(TEXT_1290);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1295);
    } else {
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1302);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1305);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1309);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1311);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1315);
    } else {
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1318);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1320);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1323);
    } else {
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1325);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1329);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1330);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1331);
    } else {
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1333);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1334);
    } else {
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1336);
    }
    stringBuffer.append(TEXT_1337);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1343);
    } else {
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1348);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1351);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1354);
    } else {
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1356);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1360);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1365);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1366);
    } else {
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1368);
    }
    stringBuffer.append(TEXT_1369);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1374);
    } else {
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1378);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1382);
    } else {
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1385);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1386);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1394);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1396);
    }
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1398);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1401);
    }
    stringBuffer.append(TEXT_1402);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1403);
    if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1404);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1406);
    } else {
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1408);
    }
    stringBuffer.append(TEXT_1409);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1412);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1414);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1416);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1421);
    }
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1426);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1428);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1431);
    } else {
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1433);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1438);
    } else {
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1442);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1446);
    } else {
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1449);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1450);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1457);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1464);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1465);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1470);
    } else {
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1475);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1479);
    } else {
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1483);
    }
    }
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
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1492);
    } else {
    stringBuffer.append(TEXT_1493);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1496);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1497);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
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
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1503);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1507);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1510);
    } else {
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1513);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1515);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1523);
    index++;}
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1527);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1528);
    }
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1532);
    }
    stringBuffer.append(TEXT_1533);
    } else {
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1536);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1537);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1538);
    }
    } else {
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1540);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1544);
    } else {
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1548);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1550);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1551);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1556);
    } else {
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1561);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1565);
    } else {
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1569);
    }
    }
    stringBuffer.append(TEXT_1570);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1574);
    }
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1577);
    } else {
    stringBuffer.append(TEXT_1578);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1582);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1583);
    }
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1587);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1589);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_1590);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1591);
    } else {
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1596);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1599);
    } else {
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1602);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1604);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1609);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1612);
    index++;}
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1616);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1617);
    }
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1621);
    }
    stringBuffer.append(TEXT_1622);
    } else {
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1625);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1626);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1627);
    }
    } else {
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1629);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1633);
    } else {
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1637);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1639);
    }
    stringBuffer.append(TEXT_1640);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1642);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1645);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1649);
    }
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1653);
    } else {
    stringBuffer.append(TEXT_1654);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1658);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1659);
    }
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1665);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1666);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1667);
    }
    stringBuffer.append(TEXT_1668);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1673);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1677);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1678);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1680);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1682);
    }
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1686);
    } else {
    stringBuffer.append(TEXT_1687);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1691);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1693);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1694);
    }
    stringBuffer.append(TEXT_1695);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1696);
    }
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1700);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1702);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1703);
    }
    stringBuffer.append(TEXT_1704);
    if (isJDK50) {
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1709);
    } else {
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1716);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1719);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1726);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1727);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1730);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1731);
    }
    }
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1736);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1738);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1739);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1741);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1743);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1749);
    } else {
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1754);
    }
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1756);
    index++;}
    stringBuffer.append(TEXT_1757);
    } else {
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1763);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1764);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1772);
    } else {
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1777);
    }
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1779);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1787);
    } else {
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1789);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1792);
    }
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1794);
    index++;}
    }
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1796);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1797);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1798);
    }
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1801);
    }
    stringBuffer.append(TEXT_1802);
    } else {
    stringBuffer.append(TEXT_1803);
    }
    stringBuffer.append(TEXT_1804);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1806);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1807);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1809);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1812);
    } else {
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1815);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(genFeature.getSafeName());
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
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1824);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1825);
    } else {
    stringBuffer.append(TEXT_1826);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1827);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1829);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1831);
    } else {
    stringBuffer.append(TEXT_1832);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1833);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1835);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1837);
    } else {
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1839);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1843);
    } else {
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1847);
    }
    } else {
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1849);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1850);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1854);
    } else {
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1857);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1862);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1872);
    } else {
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1877);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1879);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1884);
    }
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1889);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1891);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1894);
    } else {
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1896);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1901);
    } else {
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1905);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1908);
    } else {
    stringBuffer.append(TEXT_1909);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1911);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1912);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation && !UML2GenModelUtil.hasOperationsClass(genClass, genOperation) && UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1915);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1917);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1920);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_1921);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1922);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1924);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1926);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1927);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1930);
    } else {
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
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (isJDK50) {
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_1938);
    }
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1940);
    }
    }
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && isImplementation) {
    if (genOperation.isInvariant() && genOperation.hasInvariantExpression()) {
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
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1948);
    stringBuffer.append(genOperation.getInvariantExpression("\t\t"));
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1950);
    } else if (genOperation.hasInvocationDelegate()) {
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
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_1960);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1961);
    if (UML2GenModelUtil.isRedefinition(genOperation)) {
    stringBuffer.append(TEXT_1962);
    for (GenOperation redefinedGenOperation : UML2GenModelUtil.getRedefinedGenOperations(genOperation)) {
    stringBuffer.append(TEXT_1963);
    stringBuffer.append(redefinedGenOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(redefinedGenOperation.getName());
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(redefinedGenOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(redefinedGenOperation.getFormattedName());
    stringBuffer.append(TEXT_1967);
    }
    stringBuffer.append(TEXT_1968);
    }
    stringBuffer.append(TEXT_1969);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1970);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1972);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1976);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1979);
    }}
    stringBuffer.append(TEXT_1980);
    } else {
    stringBuffer.append(TEXT_1981);
    if (isJDK50) {
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_1982);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1983);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1984);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1985);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1986);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1987);
    } else {
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1989);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1992);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1996);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1998);
    stringBuffer.append(genOperation.getValidationDelegate());
    stringBuffer.append(TEXT_1999);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2000);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2001);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2002);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2004);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2005);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_2006);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2008);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2011);
    } else {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_2012);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2017);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2019);
    } else {
    stringBuffer.append(TEXT_2020);
    }
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_2024);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_2025);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2026);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2027);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2030);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_2031);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2032);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_2033);
    }
    }
    } else if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvocationDelegate()) { int size = genOperation.getGenParameters().size();
    stringBuffer.append(TEXT_2034);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2035);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2036);
    if (size > 0) {
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2038);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_2039);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_2040);
    } else {
    stringBuffer.append(TEXT_2041);
    }
    stringBuffer.append(TEXT_2042);
    } else {
    stringBuffer.append(TEXT_2043);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2044);
    }
    stringBuffer.append(TEXT_2045);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2046);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2047);
    if (size > 0) {
    stringBuffer.append(TEXT_2048);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_2051);
    } else {
    stringBuffer.append(TEXT_2052);
    }
    stringBuffer.append(TEXT_2053);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2055);
    }
    stringBuffer.append(TEXT_2056);
    }
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.WrappedException"));
    stringBuffer.append(TEXT_2059);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2061);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2062);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2063);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2064);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_2065);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2066);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_2067);
    }
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2070);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_2071);
    }
    stringBuffer.append(TEXT_2072);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2073);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_2074);
    }
    stringBuffer.append(TEXT_2075);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2076);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2078);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2080);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2082);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2083);
    }
    stringBuffer.append(TEXT_2084);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2085);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2086);
    }
    stringBuffer.append(TEXT_2087);
    }
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2089);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2090);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2091);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2092);
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
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2094);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2096);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_2098);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2099);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2102);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2103);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_2104);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2105);
    }
    stringBuffer.append(TEXT_2106);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_2107);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2108);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2109);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2110);
    }
    stringBuffer.append(TEXT_2111);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2112);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2115);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2117);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2118);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2120);
    } else {
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_2122);
    }
    } else {
    stringBuffer.append(TEXT_2123);
    }
    }
    stringBuffer.append(TEXT_2124);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_2125);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_2126);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2127);
    }
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2131);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2132);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2134);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2139);
    } else {
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2141);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_2142);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2143);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2145);
    } else {
    stringBuffer.append(TEXT_2146);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2147);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2148);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2149);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2150);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2152);
    } else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2154);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2155);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_2156);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2157);
    }
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2159);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2162);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2163);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_2164);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2165);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2166);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2168);
    }
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2170);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2171);
    }
    }
    stringBuffer.append(TEXT_2172);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2173);
    } else {
    stringBuffer.append(TEXT_2174);
    }
    stringBuffer.append(TEXT_2175);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_2176);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2177);
    }
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2179);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2180);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2182);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2184);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2185);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2188);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2189);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2193);
    } else {
    stringBuffer.append(TEXT_2194);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2195);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2196);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2197);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2198);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2199);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2200);
    } else {
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2202);
    }
    }
    stringBuffer.append(TEXT_2203);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2204);
    } else {
    stringBuffer.append(TEXT_2205);
    }
    stringBuffer.append(TEXT_2206);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_2207);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2208);
    }
    stringBuffer.append(TEXT_2209);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2210);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2212);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_2213);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2215);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2216);
    }
    stringBuffer.append(TEXT_2217);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2218);
    } else {
    stringBuffer.append(TEXT_2219);
    }
    stringBuffer.append(TEXT_2220);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_2221);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2222);
    }
    stringBuffer.append(TEXT_2223);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2224);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_2225);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2226);
    if (genFeature.isPrimitiveType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2227);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2228);
    } else if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2229);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2230);
    } else {
    stringBuffer.append(TEXT_2231);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2232);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2233);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_2234);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2235);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2236);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2237);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2238);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2239);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2241);
    } else {
    stringBuffer.append(TEXT_2242);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2243);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2244);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2245);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2246);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2247);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2248);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2249);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2250);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2251);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2252);
    } else {
    stringBuffer.append(TEXT_2253);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2254);
    }
    }
    stringBuffer.append(TEXT_2255);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2256);
    } else {
    stringBuffer.append(TEXT_2257);
    }
    stringBuffer.append(TEXT_2258);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_2259);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_2260);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2261);
    }
    stringBuffer.append(TEXT_2262);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2263);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_2264);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2265);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2267);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2269);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2270);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2271);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2272);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2273);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2275);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2277);
    } else {
    stringBuffer.append(TEXT_2278);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2279);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2280);
    }
    } else {
    stringBuffer.append(TEXT_2281);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2282);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2283);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2284);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2285);
    }
    stringBuffer.append(TEXT_2286);
    }
    } else if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2288);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2290);
    } else {
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2292);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2293);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2294);
    }
    stringBuffer.append(TEXT_2295);
    }
    stringBuffer.append(TEXT_2296);
    }
    stringBuffer.append(TEXT_2297);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2298);
    } else {
    stringBuffer.append(TEXT_2299);
    }
    stringBuffer.append(TEXT_2300);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_2301);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2302);
    }
    stringBuffer.append(TEXT_2303);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2304);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_2305);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2306);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2307);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2308);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2309);
    } else {
    stringBuffer.append(TEXT_2310);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2311);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2313);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2315);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2316);
    } else {
    stringBuffer.append(TEXT_2317);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2319);
    }
    stringBuffer.append(TEXT_2320);
    }
    stringBuffer.append(TEXT_2321);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2322);
    } else {
    stringBuffer.append(TEXT_2323);
    }
    stringBuffer.append(TEXT_2324);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_2325);
    stringBuffer.append(TEXT_2326);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2327);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2328);
    }
    stringBuffer.append(TEXT_2329);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) { String safeNameAccessor = genFeature.getSafeName(); if ("featureID".equals(safeNameAccessor)) { safeNameAccessor = "this." + safeNameAccessor; }
    stringBuffer.append(TEXT_2330);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2331);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2332);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2333);
    } else {
    if (genFeature.hasSettingDelegate()) {
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2334);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2335);
    } else {
    stringBuffer.append(TEXT_2336);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2337);
    }
    } else if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2338);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2339);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2340);
    } else {
    stringBuffer.append(TEXT_2341);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2342);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2343);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2344);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2346);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2347);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2348);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2349);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2350);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2351);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2352);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2353);
    } else {
    stringBuffer.append(TEXT_2354);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2355);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2356);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2357);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2358);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2359);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2360);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2361);
    } else {
    stringBuffer.append(TEXT_2362);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2363);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2365);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2366);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2367);
    } else {
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2369);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2370);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2373);
    } else {
    stringBuffer.append(TEXT_2374);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2376);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2377);
    }
    } else {
    stringBuffer.append(TEXT_2378);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2380);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2381);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2382);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2384);
    } else {
    stringBuffer.append(TEXT_2385);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2386);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2387);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2388);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2389);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2390);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2391);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2392);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2393);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2394);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2399);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2401);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2402);
    } else {
    stringBuffer.append(TEXT_2403);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2404);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2405);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2407);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2408);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2409);
    } else {
    stringBuffer.append(TEXT_2410);
    }
    stringBuffer.append(TEXT_2411);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2412);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2413);
    }
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2415);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2416);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2418);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2419);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2420);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2421);
    }
    stringBuffer.append(TEXT_2422);
    }
    stringBuffer.append(TEXT_2423);
    }
    stringBuffer.append(TEXT_2424);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2425);
    }
    stringBuffer.append(TEXT_2426);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2427);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2428);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2429);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2430);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2431);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2432);
    }
    stringBuffer.append(TEXT_2433);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2434);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2435);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2436);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2437);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2438);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2439);
    }
    stringBuffer.append(TEXT_2440);
    }
    stringBuffer.append(TEXT_2441);
    }
    if (genModel.isOperationReflection() && isImplementation && (!genClass.getMixinGenOperations().isEmpty() || !genClass.getOverrideGenOperations(genClass.getExtendedGenOperations(), genClass.getImplementedGenOperations()).isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty())) {
    stringBuffer.append(TEXT_2442);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2443);
    }
    stringBuffer.append(TEXT_2444);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2445);
    for (GenClass extendedGenClass : genClass.getExtendedGenClasses()) { List<GenOperation> extendedImplementedGenOperations = extendedGenClass.getImplementedGenOperations(); List<GenOperation> implementedGenOperations = genClass.getImplementedGenOperations();
    if (!genClass.getOverrideGenOperations(extendedImplementedGenOperations, implementedGenOperations).isEmpty()) {
    stringBuffer.append(TEXT_2446);
    stringBuffer.append(extendedGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2447);
    for (GenOperation genOperation : extendedImplementedGenOperations) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    if (implementedGenOperations.contains(overrideGenOperation)) {
    stringBuffer.append(TEXT_2448);
    stringBuffer.append(extendedGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2449);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2450);
    }
    }
    stringBuffer.append(TEXT_2451);
    }
    }
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2453);
    for (GenOperation genOperation : mixinGenClass.getGenOperations()) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_2454);
    stringBuffer.append(mixinGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2456);
    }
    stringBuffer.append(TEXT_2457);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_2458);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_2460);
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_2461);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2462);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2463);
    }
    stringBuffer.append(TEXT_2464);
    }
    stringBuffer.append(TEXT_2465);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2466);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2467);
    }
    stringBuffer.append(TEXT_2468);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2469);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2470);
    }
    stringBuffer.append(TEXT_2471);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2472);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2473);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2474);
    }
    stringBuffer.append(TEXT_2475);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2478);
    }
    stringBuffer.append(TEXT_2479);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2480);
    }
    stringBuffer.append(TEXT_2481);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2482);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2484);
    }
    stringBuffer.append(TEXT_2485);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_2486);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2487);
    }
    LOOP: for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) {
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.isUncheckedCast()) {
    stringBuffer.append(TEXT_2488);
    break LOOP;}
    }
    }
    stringBuffer.append(TEXT_2489);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2490);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2491);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_2492);
    for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { List<GenParameter> genParameters = genOperation.getGenParameters(); int size = genParameters.size();
    stringBuffer.append(TEXT_2493);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2494);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2495);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2496);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2497);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_2499);
    }
    stringBuffer.append(TEXT_2500);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2501);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2502);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2503);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_2504);
    }
    }
    stringBuffer.append(TEXT_2505);
    } else {
    stringBuffer.append(TEXT_2506);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2508);
    }
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2509);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2510);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_2512);
    }
    stringBuffer.append(TEXT_2513);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2514);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2515);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2516);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_2517);
    }
    }
    stringBuffer.append(TEXT_2518);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2519);
    }
    stringBuffer.append(TEXT_2520);
    }
    }
    stringBuffer.append(TEXT_2521);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2522);
    } else {
    stringBuffer.append(TEXT_2523);
    }
    stringBuffer.append(TEXT_2524);
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2525);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2526);
    }
    stringBuffer.append(TEXT_2527);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2528);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2530);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2532);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2533);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2534);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2535);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2537);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2538);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2539);
    }
    stringBuffer.append(TEXT_2540);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2541);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2542);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2543);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2544);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2545);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2546);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2547);
    }
    stringBuffer.append(TEXT_2548);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2549);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2550);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2551);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2552);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_2553);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2554);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2555);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2556);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2557);
    }
    stringBuffer.append(TEXT_2558);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2559);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2560);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2561);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2562);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2563);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2564);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2565);
    } else {
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2567);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2568);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2569);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2570);
    }
    } else {
    stringBuffer.append(TEXT_2571);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2572);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2573);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2574);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2576);
    if (!isJDK50 && keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2577);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2578);
    } else {
    stringBuffer.append(TEXT_2579);
    }
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2581);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2582);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2583);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2584);
    }
    stringBuffer.append(TEXT_2585);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2586);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2587);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2589);
    } else {
    stringBuffer.append(TEXT_2590);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2591);
    }
    stringBuffer.append(TEXT_2592);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2593);
    if (!isJDK50 && valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2594);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2595);
    } else {
    stringBuffer.append(TEXT_2596);
    }
    stringBuffer.append(TEXT_2597);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2598);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2599);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2600);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2601);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2602);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2603);
    }
    stringBuffer.append(TEXT_2604);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2605);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2606);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2607);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2608);
    } else {
    stringBuffer.append(TEXT_2609);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2610);
    }
    stringBuffer.append(TEXT_2611);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2612);
    }
    stringBuffer.append(TEXT_2613);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2614);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2615);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2616);
    }
    if (isImplementation) {
    if (!UML2GenModelUtil.isOperationsClasses(genPackage) && UML2GenModelUtil.hasOCLOperationBodies(genClass) && !UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass())) {
    stringBuffer.append(TEXT_2617);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2618);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2619);
    }
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2621);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2623);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2624);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2625);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2626);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2627);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2628);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2629);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2630);
    }
    stringBuffer.append(TEXT_2631);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2632);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2633);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2635);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2636);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2637);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2638);
    } else {
    stringBuffer.append(TEXT_2639);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2640);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2641);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2642);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2644);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2645);
    }
    stringBuffer.append(TEXT_2646);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2647);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2649);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2650);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2652);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2653);
    }
    stringBuffer.append(TEXT_2654);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2655);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2656);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2657);
    } else {
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2659);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2660);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2661);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2662);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2664);
    }
    stringBuffer.append(TEXT_2665);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2666);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2668);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2670);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2672);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2674);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2675);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2676);
    } else {
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2679);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2680);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2682);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2683);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2684);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2686);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2687);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2688);
    } else {
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2690);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2691);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2692);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2693);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2695);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2696);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2697);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2698);
    }
    }
    }
    stringBuffer.append(TEXT_2699);
    if (isJDK50) { //isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2700);
    }
    }
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2702);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2703);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2704);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2706);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2707);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2708);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2709);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2710);
    }
    } else {
    stringBuffer.append(TEXT_2711);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2712);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2713);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2714);
    }
    }
    } else {
    stringBuffer.append(TEXT_2715);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2716);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2717);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2718);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2719);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2720);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2721);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2722);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2723);
    }
    } else {
    stringBuffer.append(TEXT_2724);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2725);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2726);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2727);
    }
    }
    } else {
    stringBuffer.append(TEXT_2728);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2729);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2730);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2731);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2732);
    } else {
    stringBuffer.append(TEXT_2733);
    }
    }
    stringBuffer.append(TEXT_2734);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2735);
    if (isJDK50) { //getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2736);
    }
    }
    stringBuffer.append(TEXT_2737);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2739);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType(genClass).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_2740);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2741);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2742);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2743);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2744);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2745);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2746);
    } else {
    stringBuffer.append(TEXT_2747);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2748);
    }
    } else {
    stringBuffer.append(TEXT_2749);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2750);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2751);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2752);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2753);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2754);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2755);
    } else {
    stringBuffer.append(TEXT_2756);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2757);
    }
    }
    stringBuffer.append(TEXT_2758);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2759);
    if (isJDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2760);
    }
    }
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2762);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2763);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2764);
    } else {
    stringBuffer.append(TEXT_2765);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2767);
    }
    stringBuffer.append(TEXT_2768);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2769);
    if (isJDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2770);
    }
    }
    stringBuffer.append(TEXT_2771);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2772);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2773);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_2774);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2775);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2776);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2777);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2780);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2781);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2782);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2784);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2786);
    }
    stringBuffer.append(TEXT_2787);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2788);
    } else {
    stringBuffer.append(TEXT_2789);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2790);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2791);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2792);
    }
    stringBuffer.append(TEXT_2793);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2794);
    }
    }
    stringBuffer.append(TEXT_2795);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2796);
    if (isJDK50) { //setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2797);
    }
    }
    stringBuffer.append(TEXT_2798);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2799);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2800);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2801);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2802);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2803);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2804);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2805);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2806);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2807);
    }
    stringBuffer.append(TEXT_2808);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2809);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2811);
    }
    stringBuffer.append(TEXT_2812);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2813);
    }
    stringBuffer.append(TEXT_2814);
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2815);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2816);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2817);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2818);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2819);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2820);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2821);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2822);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2823);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2824);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2825);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2826);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2827);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2828);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2829);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2830);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2831);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2832);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2833);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2834);
    } else {
    stringBuffer.append(TEXT_2835);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2836);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2837);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2838);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2839);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2840);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2841);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2842);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2843);
    } else {
    stringBuffer.append(TEXT_2844);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2845);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2846);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2847);
    }
    }
    stringBuffer.append(TEXT_2848);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2849);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2850);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2851);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2852);
    }
    stringBuffer.append(TEXT_2853);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2854);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2855);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2856);
    } else {
    stringBuffer.append(TEXT_2857);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2858);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2859);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2860);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2861);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2862);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2863);
    }
    stringBuffer.append(TEXT_2864);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2865);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2866);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2867);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2868);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2869);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2870);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2871);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2872);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2873);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2874);
    } else {
    stringBuffer.append(TEXT_2875);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2876);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2877);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2878);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2879);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2880);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2881);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2882);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2883);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2884);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2885);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2886);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2887);
    index++;}
    stringBuffer.append(TEXT_2888);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2889);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2890);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2891);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2892);
    }
    stringBuffer.append(TEXT_2893);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2894);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2895);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2896);
    }
    stringBuffer.append(TEXT_2897);
    } else {
    stringBuffer.append(TEXT_2898);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2899);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2900);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2901);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2902);
    }
    } else {
    stringBuffer.append(TEXT_2903);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2904);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2905);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2906);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2907);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2908);
    } else {
    stringBuffer.append(TEXT_2909);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2910);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2911);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2912);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2913);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2914);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2915);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2916);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2917);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2918);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2919);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2920);
    } else {
    stringBuffer.append(TEXT_2921);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2922);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2923);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2924);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2925);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2926);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2927);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2928);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2929);
    } else {
    stringBuffer.append(TEXT_2930);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2931);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2932);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2933);
    }
    }
    stringBuffer.append(TEXT_2934);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2935);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2936);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2937);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2938);
    }
    stringBuffer.append(TEXT_2939);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2940);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2941);
    } else {
    stringBuffer.append(TEXT_2942);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2943);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2944);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2945);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2946);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2947);
    }
    stringBuffer.append(TEXT_2948);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2949);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2950);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2951);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2952);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2953);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_2954);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2955);
    } else {
    stringBuffer.append(TEXT_2956);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2957);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2958);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2959);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2960);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2961);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2962);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2963);
    } else {
    stringBuffer.append(TEXT_2964);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2965);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2966);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2967);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2968);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2969);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2970);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2971);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2972);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2973);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2974);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2975);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2976);
    index++;}
    stringBuffer.append(TEXT_2977);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2978);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2979);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2980);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2981);
    }
    stringBuffer.append(TEXT_2982);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2983);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2984);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2985);
    }
    stringBuffer.append(TEXT_2986);
    } else {
    stringBuffer.append(TEXT_2987);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2988);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2989);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2990);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2991);
    }
    } else {
    stringBuffer.append(TEXT_2992);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2993);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2994);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2995);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2996);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2997);
    } else {
    stringBuffer.append(TEXT_2998);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2999);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_3000);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3001);
    }
    index++;}
    }
    stringBuffer.append(TEXT_3002);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3003);
    }
    stringBuffer.append(TEXT_3004);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_3005);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3006);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3007);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3008);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3009);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3010);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3011);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3012);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3013);
    }
    stringBuffer.append(TEXT_3014);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3015);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3016);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3017);
    } else {
    stringBuffer.append(TEXT_3018);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_3019);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3020);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3021);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3022);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3023);
    }
    stringBuffer.append(TEXT_3024);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3025);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3026);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3027);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3028);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3029);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3030);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3031);
    }
    stringBuffer.append(TEXT_3032);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_3033);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3034);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3035);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3036);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3037);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3038);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3039);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3040);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3041);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3042);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3043);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3044);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3045);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3046);
    }
    stringBuffer.append(TEXT_3047);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3048);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3049);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3050);
    } else {
    stringBuffer.append(TEXT_3051);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_3052);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3053);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3054);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3055);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3056);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3057);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3058);
    }
    stringBuffer.append(TEXT_3059);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3060);
    }
    stringBuffer.append(TEXT_3061);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3062);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3063);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3064);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3065);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3066);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3067);
    }
    stringBuffer.append(TEXT_3068);
    if (isJDK50) {
    stringBuffer.append(TEXT_3069);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3070);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_3071);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3072);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3073);
    } else {
    stringBuffer.append(TEXT_3074);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3075);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_3076);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3077);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3078);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3079);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3080);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3081);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3082);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3083);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3084);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3085);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3086);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3087);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3088);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3089);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3090);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_3091);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_3092);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_3093);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3094);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_3095);
    }
    }
    stringBuffer.append(TEXT_3096);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3097);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3098);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3099);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3100);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_3101);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3102);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3103);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3104);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3105);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_3106);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_3107);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3108);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3109);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3110);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3111);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3112);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3113);
    } else {
    stringBuffer.append(TEXT_3114);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3115);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3116);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3117);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3118);
    }
    stringBuffer.append(TEXT_3119);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3120);
    index++;}
    stringBuffer.append(TEXT_3121);
    } else {
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
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3128);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3129);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3130);
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
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3144);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3145);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3146);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3147);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3148);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3149);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3150);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3151);
    } else {
    stringBuffer.append(TEXT_3152);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3153);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3154);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3155);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3156);
    }
    stringBuffer.append(TEXT_3157);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3158);
    index++;}
    }
    stringBuffer.append(TEXT_3159);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3160);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3161);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3162);
    }
    stringBuffer.append(TEXT_3163);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3164);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3165);
    }
    stringBuffer.append(TEXT_3166);
    } else {
    stringBuffer.append(TEXT_3167);
    }
    stringBuffer.append(TEXT_3168);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_3169);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3170);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_3171);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3172);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3173);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_3174);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3175);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3176);
    } else {
    stringBuffer.append(TEXT_3177);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3178);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3179);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3180);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3181);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3182);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3183);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3184);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3185);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3186);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3187);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3188);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3189);
    } else {
    stringBuffer.append(TEXT_3190);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3191);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3192);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3193);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3194);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3195);
    } else {
    stringBuffer.append(TEXT_3196);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3197);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3198);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3199);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3200);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3201);
    } else {
    stringBuffer.append(TEXT_3202);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3203);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_3204);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3205);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3206);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3207);
    } else {
    stringBuffer.append(TEXT_3208);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3209);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3210);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3211);
    }
    } else {
    stringBuffer.append(TEXT_3212);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3213);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3214);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3215);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3216);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3217);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3218);
    } else {
    stringBuffer.append(TEXT_3219);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3220);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3221);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3222);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3223);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3224);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3225);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3226);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3227);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3228);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3229);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3230);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3231);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3232);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3233);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3234);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3235);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3236);
    } else {
    stringBuffer.append(TEXT_3237);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3238);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3239);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3240);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3241);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3242);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3243);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_3244);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3245);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3246);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3247);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3248);
    }
    stringBuffer.append(TEXT_3249);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3250);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_3251);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_3252);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3253);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_3254);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3255);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_3256);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_3257);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3258);
    } else {
    stringBuffer.append(TEXT_3259);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3260);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_3261);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3262);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3263);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3264);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3265);
    } else {
    stringBuffer.append(TEXT_3266);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3267);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3268);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3269);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_3270);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_3271);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3272);
    } else {
    stringBuffer.append(TEXT_3273);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3274);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3275);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_3276);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_3277);
    if (isJDK50) { //genOperation.annotations.insert.javajetinc
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_3278);
    }
    }
    stringBuffer.append(TEXT_3279);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_3280);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3281);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_3282);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_3283);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_3284);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3285);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3286);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_3287);
    } else {
    stringBuffer.append(TEXT_3288);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3289);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3290);
    }
    }
    stringBuffer.append(TEXT_3291);
    }
    }
    stringBuffer.append(TEXT_3292);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_3293);
    return stringBuffer.toString();
  }
}
