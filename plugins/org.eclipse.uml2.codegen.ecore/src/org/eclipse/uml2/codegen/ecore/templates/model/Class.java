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
  protected final String TEXT_16 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * </p>" + NL + " * <ul>";
  protected final String TEXT_17 = NL + " *   <li>{@link ";
  protected final String TEXT_18 = "#";
  protected final String TEXT_19 = " <em>";
  protected final String TEXT_20 = "</em>}</li>";
  protected final String TEXT_21 = NL + " * </ul>";
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
  protected final String TEXT_32 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_33 = NL + " * <p>" + NL + " * The following features are implemented:" + NL + " * </p>" + NL + " * <ul>";
  protected final String TEXT_34 = NL + " *   <li>{@link ";
  protected final String TEXT_35 = "#";
  protected final String TEXT_36 = " <em>";
  protected final String TEXT_37 = "</em>}</li>";
  protected final String TEXT_38 = NL + " * </ul>";
  protected final String TEXT_39 = NL + " *" + NL + " * @generated" + NL + " */";
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
  protected final String TEXT_66 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_67 = "() <em>";
  protected final String TEXT_68 = "</em>}' array accessor." + NL + "\t * This is specialized for the more specific element type known in this context." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_69 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_70 = NL + "\t@SuppressWarnings(\"rawtypes\")";
  protected final String TEXT_71 = NL + "\tprotected static final ";
  protected final String TEXT_72 = "[] ";
  protected final String TEXT_73 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_74 = " [0]";
  protected final String TEXT_75 = ";" + NL;
  protected final String TEXT_76 = NL + "\t/**" + NL + "\t * The cached setting delegate for the '{@link #";
  protected final String TEXT_77 = "() <em>";
  protected final String TEXT_78 = "</em>}' ";
  protected final String TEXT_79 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_80 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_81 = NL + "\t@";
  protected final String TEXT_82 = NL + "\tprotected ";
  protected final String TEXT_83 = ".Internal.SettingDelegate ";
  protected final String TEXT_84 = "__ESETTING_DELEGATE = ((";
  protected final String TEXT_85 = ".Internal)";
  protected final String TEXT_86 = ").getSettingDelegate();" + NL;
  protected final String TEXT_87 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_88 = "() <em>";
  protected final String TEXT_89 = "</em>}' ";
  protected final String TEXT_90 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_91 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_92 = NL + "\t@";
  protected final String TEXT_93 = NL + "\tprotected ";
  protected final String TEXT_94 = " ";
  protected final String TEXT_95 = ";" + NL;
  protected final String TEXT_96 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_97 = "() <em>";
  protected final String TEXT_98 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_99 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_100 = NL + "\t@SuppressWarnings(\"rawtypes\")";
  protected final String TEXT_101 = NL + "\tprotected static final ";
  protected final String TEXT_102 = "[] ";
  protected final String TEXT_103 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_104 = " [0]";
  protected final String TEXT_105 = ";" + NL;
  protected final String TEXT_106 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_107 = "() <em>";
  protected final String TEXT_108 = "</em>}' ";
  protected final String TEXT_109 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_110 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_111 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_112 = NL + "\tprotected static final ";
  protected final String TEXT_113 = " ";
  protected final String TEXT_114 = "; // TODO The default value literal \"";
  protected final String TEXT_115 = "\" is not valid.";
  protected final String TEXT_116 = " = ";
  protected final String TEXT_117 = ";";
  protected final String TEXT_118 = NL;
  protected final String TEXT_119 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_120 = NL + "\t@";
  protected final String TEXT_121 = NL + "\tprotected int ";
  protected final String TEXT_122 = " = 0;" + NL;
  protected final String TEXT_123 = NL + "\t/**" + NL + "\t * The offset of the flags representing the value of the '{@link #";
  protected final String TEXT_124 = "() <em>";
  protected final String TEXT_125 = "</em>}' ";
  protected final String TEXT_126 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_127 = "_EFLAG_OFFSET = ";
  protected final String TEXT_128 = ";" + NL + "" + NL + "\t/**" + NL + "\t * The flags representing the default value of the '{@link #";
  protected final String TEXT_129 = "() <em>";
  protected final String TEXT_130 = "</em>}' ";
  protected final String TEXT_131 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_132 = "_EFLAG_DEFAULT = ";
  protected final String TEXT_133 = ".ordinal()";
  protected final String TEXT_134 = ".VALUES.indexOf(";
  protected final String TEXT_135 = ")";
  protected final String TEXT_136 = " << ";
  protected final String TEXT_137 = "_EFLAG_OFFSET;" + NL + "" + NL + "\t/**" + NL + "\t * The array of enumeration values for '{@link ";
  protected final String TEXT_138 = " ";
  protected final String TEXT_139 = "}'" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprivate static final ";
  protected final String TEXT_140 = "[] ";
  protected final String TEXT_141 = "_EFLAG_VALUES = ";
  protected final String TEXT_142 = ".values()";
  protected final String TEXT_143 = "(";
  protected final String TEXT_144 = "[])";
  protected final String TEXT_145 = ".VALUES.toArray(new ";
  protected final String TEXT_146 = "[";
  protected final String TEXT_147 = ".VALUES.size()])";
  protected final String TEXT_148 = ";" + NL;
  protected final String TEXT_149 = NL + "\t/**" + NL + "\t * The flag";
  protected final String TEXT_150 = " representing the value of the '{@link #";
  protected final String TEXT_151 = "() <em>";
  protected final String TEXT_152 = "</em>}' ";
  protected final String TEXT_153 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_154 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_155 = "_EFLAG = ";
  protected final String TEXT_156 = " << ";
  protected final String TEXT_157 = "_EFLAG_OFFSET";
  protected final String TEXT_158 = ";" + NL;
  protected final String TEXT_159 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_160 = "() <em>";
  protected final String TEXT_161 = "</em>}' ";
  protected final String TEXT_162 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_163 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_164 = NL + "\t@";
  protected final String TEXT_165 = NL + "\tprotected ";
  protected final String TEXT_166 = " ";
  protected final String TEXT_167 = " = ";
  protected final String TEXT_168 = ";" + NL;
  protected final String TEXT_169 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_170 = NL + "\t@";
  protected final String TEXT_171 = NL + "\tprotected int ";
  protected final String TEXT_172 = " = 0;" + NL;
  protected final String TEXT_173 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_174 = " ";
  protected final String TEXT_175 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_176 = "_ESETFLAG = 1 << ";
  protected final String TEXT_177 = ";" + NL;
  protected final String TEXT_178 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_179 = " ";
  protected final String TEXT_180 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_181 = NL + "\t@";
  protected final String TEXT_182 = NL + "\tprotected boolean ";
  protected final String TEXT_183 = "ESet;" + NL;
  protected final String TEXT_184 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_185 = " = ";
  protected final String TEXT_186 = ".getFeatureID(";
  protected final String TEXT_187 = ") - ";
  protected final String TEXT_188 = ";" + NL;
  protected final String TEXT_189 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_190 = " = ";
  protected final String TEXT_191 = ".getFeatureID(";
  protected final String TEXT_192 = ") - ";
  protected final String TEXT_193 = ";" + NL;
  protected final String TEXT_194 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int \"EOPERATION_OFFSET_CORRECTION\" = ";
  protected final String TEXT_195 = ".getOperationID(";
  protected final String TEXT_196 = ") - ";
  protected final String TEXT_197 = ";" + NL;
  protected final String TEXT_198 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_199 = "public";
  protected final String TEXT_200 = "protected";
  protected final String TEXT_201 = " ";
  protected final String TEXT_202 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_203 = NL + "\t\t";
  protected final String TEXT_204 = " |= ";
  protected final String TEXT_205 = "_EFLAG";
  protected final String TEXT_206 = "_DEFAULT";
  protected final String TEXT_207 = ";";
  protected final String TEXT_208 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_209 = NL + "\t@Override";
  protected final String TEXT_210 = NL + "\tprotected ";
  protected final String TEXT_211 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_212 = ";" + NL + "\t}" + NL;
  protected final String TEXT_213 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected static final int ESTATIC_FEATURE_COUNT = ";
  protected final String TEXT_214 = ";" + NL;
  protected final String TEXT_215 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_216 = NL + "\t@Override";
  protected final String TEXT_217 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_218 = ";" + NL + "\t}" + NL;
  protected final String TEXT_219 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific element type known in this context." + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_220 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_221 = NL + "\t@Override";
  protected final String TEXT_222 = NL + "\tpublic ";
  protected final String TEXT_223 = "[] ";
  protected final String TEXT_224 = "()" + NL + "\t{";
  protected final String TEXT_225 = NL + "\t\t";
  protected final String TEXT_226 = " list = (";
  protected final String TEXT_227 = ")";
  protected final String TEXT_228 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_229 = "_EEMPTY_ARRAY;";
  protected final String TEXT_230 = NL + "\t\tif (";
  protected final String TEXT_231 = " == null || ";
  protected final String TEXT_232 = ".isEmpty()) return ";
  protected final String TEXT_233 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_234 = " list = (";
  protected final String TEXT_235 = ")";
  protected final String TEXT_236 = ";";
  protected final String TEXT_237 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_238 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_239 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific element type known in this context." + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_240 = NL + "\t@Override";
  protected final String TEXT_241 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_242 = NL + "\t@Override";
  protected final String TEXT_243 = NL + "\tpublic ";
  protected final String TEXT_244 = " ";
  protected final String TEXT_245 = "_";
  protected final String TEXT_246 = "()" + NL + "\t{";
  protected final String TEXT_247 = NL + "\t\t";
  protected final String TEXT_248 = " ";
  protected final String TEXT_249 = " = (";
  protected final String TEXT_250 = ")eVirtualGet(";
  protected final String TEXT_251 = ");";
  protected final String TEXT_252 = NL + "\t\tif (";
  protected final String TEXT_253 = " == null)" + NL + "\t\t{";
  protected final String TEXT_254 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_255 = ", ";
  protected final String TEXT_256 = " = new ";
  protected final String TEXT_257 = ");";
  protected final String TEXT_258 = NL + "\t\t\t";
  protected final String TEXT_259 = " = new ";
  protected final String TEXT_260 = ";";
  protected final String TEXT_261 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_262 = ";" + NL + "\t}" + NL;
  protected final String TEXT_263 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific type known in this context." + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_264 = NL + "\t@Override";
  protected final String TEXT_265 = NL + "\t@Override";
  protected final String TEXT_266 = NL + "\tpublic ";
  protected final String TEXT_267 = " basicSet";
  protected final String TEXT_268 = "(";
  protected final String TEXT_269 = " new";
  protected final String TEXT_270 = ", ";
  protected final String TEXT_271 = " msgs)" + NL + "\t{" + NL + "\t\treturn super.basicSet";
  protected final String TEXT_272 = "(new";
  protected final String TEXT_273 = ", msgs);" + NL + "\t}" + NL;
  protected final String TEXT_274 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific type known in this context." + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_275 = NL + "\t@Override";
  protected final String TEXT_276 = NL + "\t@Override";
  protected final String TEXT_277 = NL + "\tpublic void set";
  protected final String TEXT_278 = "_";
  protected final String TEXT_279 = "(";
  protected final String TEXT_280 = " ";
  protected final String TEXT_281 = ")" + NL + "\t{" + NL + "\t\tsuper.set";
  protected final String TEXT_282 = "_";
  protected final String TEXT_283 = "(";
  protected final String TEXT_284 = ");" + NL + "\t}" + NL;
  protected final String TEXT_285 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_286 = NL + "\t";
  protected final String TEXT_287 = "[] ";
  protected final String TEXT_288 = "();" + NL;
  protected final String TEXT_289 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_290 = NL + "\tpublic ";
  protected final String TEXT_291 = "[] ";
  protected final String TEXT_292 = "()" + NL + "\t{";
  protected final String TEXT_293 = NL + "\t\t";
  protected final String TEXT_294 = " list = (";
  protected final String TEXT_295 = ")";
  protected final String TEXT_296 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_297 = "_EEMPTY_ARRAY;";
  protected final String TEXT_298 = NL + "\t\tif (";
  protected final String TEXT_299 = " == null || ";
  protected final String TEXT_300 = ".isEmpty()) return ";
  protected final String TEXT_301 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_302 = " list = (";
  protected final String TEXT_303 = ")";
  protected final String TEXT_304 = ";";
  protected final String TEXT_305 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_306 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_307 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_308 = NL + "\t";
  protected final String TEXT_309 = " get";
  protected final String TEXT_310 = "(int index);" + NL;
  protected final String TEXT_311 = NL + "\tpublic ";
  protected final String TEXT_312 = " get";
  protected final String TEXT_313 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_314 = "(";
  protected final String TEXT_315 = ")";
  protected final String TEXT_316 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_317 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_318 = NL + "\tint get";
  protected final String TEXT_319 = "Length();" + NL;
  protected final String TEXT_320 = NL + "\tpublic int get";
  protected final String TEXT_321 = "Length()" + NL + "\t{";
  protected final String TEXT_322 = NL + "\t\treturn ";
  protected final String TEXT_323 = "().size();";
  protected final String TEXT_324 = NL + "\t\treturn ";
  protected final String TEXT_325 = " == null ? 0 : ";
  protected final String TEXT_326 = ".size();";
  protected final String TEXT_327 = NL + "\t}" + NL;
  protected final String TEXT_328 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_329 = NL + "\tvoid set";
  protected final String TEXT_330 = "(";
  protected final String TEXT_331 = "[] new";
  protected final String TEXT_332 = ");" + NL;
  protected final String TEXT_333 = NL + "\tpublic void set";
  protected final String TEXT_334 = "(";
  protected final String TEXT_335 = "[] new";
  protected final String TEXT_336 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_337 = ")";
  protected final String TEXT_338 = "()).setData(new";
  protected final String TEXT_339 = ".length, new";
  protected final String TEXT_340 = ");" + NL + "\t}" + NL;
  protected final String TEXT_341 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_342 = NL + "\tvoid set";
  protected final String TEXT_343 = "(int index, ";
  protected final String TEXT_344 = " element);" + NL;
  protected final String TEXT_345 = NL + "\tpublic void set";
  protected final String TEXT_346 = "(int index, ";
  protected final String TEXT_347 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_348 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_349 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_350 = "</b></em>' ";
  protected final String TEXT_351 = ".";
  protected final String TEXT_352 = NL + "\t * The key is of type ";
  protected final String TEXT_353 = "list of {@link ";
  protected final String TEXT_354 = "}";
  protected final String TEXT_355 = "{@link ";
  protected final String TEXT_356 = "}";
  protected final String TEXT_357 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_358 = "list of {@link ";
  protected final String TEXT_359 = "}";
  protected final String TEXT_360 = "{@link ";
  protected final String TEXT_361 = "}";
  protected final String TEXT_362 = ",";
  protected final String TEXT_363 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_364 = "}";
  protected final String TEXT_365 = ".";
  protected final String TEXT_366 = NL + "\t * The default value is <code>";
  protected final String TEXT_367 = "</code>.";
  protected final String TEXT_368 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_369 = "}.";
  protected final String TEXT_370 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_371 = "#";
  protected final String TEXT_372 = " <em>";
  protected final String TEXT_373 = "</em>}'.";
  protected final String TEXT_374 = NL + "\t * <p>" + NL + "\t * This feature subsets the following features:" + NL + "\t * </p>" + NL + "\t * <ul>";
  protected final String TEXT_375 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_376 = "#";
  protected final String TEXT_377 = "() <em>";
  protected final String TEXT_378 = "</em>}'</li>";
  protected final String TEXT_379 = NL + "\t * </ul>";
  protected final String TEXT_380 = NL + "\t * <p>" + NL + "\t * This feature redefines the following features:" + NL + "\t * </p>" + NL + "\t * <ul>";
  protected final String TEXT_381 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_382 = "#";
  protected final String TEXT_383 = "() <em>";
  protected final String TEXT_384 = "</em>}'</li>";
  protected final String TEXT_385 = NL + "\t * </ul>";
  protected final String TEXT_386 = NL + "\t * This feature is a derived union.";
  protected final String TEXT_387 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_388 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_389 = "</em>' ";
  protected final String TEXT_390 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_391 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_392 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_393 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_394 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_395 = "</em>' ";
  protected final String TEXT_396 = ".";
  protected final String TEXT_397 = NL + "\t * @see ";
  protected final String TEXT_398 = NL + "\t * @see #isSet";
  protected final String TEXT_399 = "()";
  protected final String TEXT_400 = NL + "\t * @see #unset";
  protected final String TEXT_401 = "()";
  protected final String TEXT_402 = NL + "\t * @see #set";
  protected final String TEXT_403 = "(";
  protected final String TEXT_404 = ")";
  protected final String TEXT_405 = NL + "\t * @see ";
  protected final String TEXT_406 = "#get";
  protected final String TEXT_407 = "()";
  protected final String TEXT_408 = NL + "\t * @see ";
  protected final String TEXT_409 = "#";
  protected final String TEXT_410 = NL + "\t * @model ";
  protected final String TEXT_411 = NL + "\t *        ";
  protected final String TEXT_412 = NL + "\t * @model";
  protected final String TEXT_413 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_414 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_415 = NL + "\t@Override";
  protected final String TEXT_416 = NL + "\t";
  protected final String TEXT_417 = " ";
  protected final String TEXT_418 = "();" + NL;
  protected final String TEXT_419 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_420 = NL + "\tpublic ";
  protected final String TEXT_421 = " ";
  protected final String TEXT_422 = "_";
  protected final String TEXT_423 = "()" + NL + "\t{";
  protected final String TEXT_424 = NL + "\t\treturn ";
  protected final String TEXT_425 = "(";
  protected final String TEXT_426 = "(";
  protected final String TEXT_427 = ")eDynamicGet(";
  protected final String TEXT_428 = " - ESTATIC_FEATURE_COUNT";
  protected final String TEXT_429 = ", ";
  protected final String TEXT_430 = ", true, ";
  protected final String TEXT_431 = ")";
  protected final String TEXT_432 = ").";
  protected final String TEXT_433 = "()";
  protected final String TEXT_434 = ";";
  protected final String TEXT_435 = NL + "\t\t";
  protected final String TEXT_436 = NL + "\t\treturn ";
  protected final String TEXT_437 = "(";
  protected final String TEXT_438 = "(";
  protected final String TEXT_439 = ")eGet(";
  protected final String TEXT_440 = ", true)";
  protected final String TEXT_441 = ").";
  protected final String TEXT_442 = "()";
  protected final String TEXT_443 = ";";
  protected final String TEXT_444 = NL + "\t\treturn ";
  protected final String TEXT_445 = "(";
  protected final String TEXT_446 = "(";
  protected final String TEXT_447 = ")";
  protected final String TEXT_448 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false)";
  protected final String TEXT_449 = ").";
  protected final String TEXT_450 = "()";
  protected final String TEXT_451 = ";";
  protected final String TEXT_452 = NL + "\t\t";
  protected final String TEXT_453 = " ";
  protected final String TEXT_454 = " = (";
  protected final String TEXT_455 = ")eVirtualGet(";
  protected final String TEXT_456 = ");";
  protected final String TEXT_457 = NL + "\t\tif (";
  protected final String TEXT_458 = " == null)" + NL + "\t\t{";
  protected final String TEXT_459 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_460 = ", ";
  protected final String TEXT_461 = " = new ";
  protected final String TEXT_462 = ");";
  protected final String TEXT_463 = NL + "\t\t\t";
  protected final String TEXT_464 = " = new ";
  protected final String TEXT_465 = ";";
  protected final String TEXT_466 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_467 = ";";
  protected final String TEXT_468 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_469 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_470 = ")";
  protected final String TEXT_471 = "eContainer";
  protected final String TEXT_472 = "eInternalContainer";
  protected final String TEXT_473 = "();";
  protected final String TEXT_474 = NL + "\t\t";
  protected final String TEXT_475 = " ";
  protected final String TEXT_476 = " = (";
  protected final String TEXT_477 = ")eVirtualGet(";
  protected final String TEXT_478 = ", ";
  protected final String TEXT_479 = ");";
  protected final String TEXT_480 = NL + "\t\tif (";
  protected final String TEXT_481 = " != null && ";
  protected final String TEXT_482 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_483 = " old";
  protected final String TEXT_484 = " = (";
  protected final String TEXT_485 = ")";
  protected final String TEXT_486 = ";" + NL + "\t\t\t";
  protected final String TEXT_487 = " = ";
  protected final String TEXT_488 = "eResolveProxy(old";
  protected final String TEXT_489 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_490 = " != old";
  protected final String TEXT_491 = ")" + NL + "\t\t\t{";
  protected final String TEXT_492 = NL + "\t\t\t\t";
  protected final String TEXT_493 = " new";
  protected final String TEXT_494 = " = (";
  protected final String TEXT_495 = ")";
  protected final String TEXT_496 = ";";
  protected final String TEXT_497 = NL + "\t\t\t\t";
  protected final String TEXT_498 = " msgs = old";
  protected final String TEXT_499 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_500 = ", null, null);";
  protected final String TEXT_501 = NL + "\t\t\t\t";
  protected final String TEXT_502 = " msgs =  old";
  protected final String TEXT_503 = ".eInverseRemove(this, ";
  protected final String TEXT_504 = ", ";
  protected final String TEXT_505 = ".class, null);";
  protected final String TEXT_506 = NL + "\t\t\t\tif (new";
  protected final String TEXT_507 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_508 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_509 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_510 = ", null, msgs);";
  protected final String TEXT_511 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_512 = ".eInverseAdd(this, ";
  protected final String TEXT_513 = ", ";
  protected final String TEXT_514 = ".class, msgs);";
  protected final String TEXT_515 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_516 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_517 = ", ";
  protected final String TEXT_518 = ");";
  protected final String TEXT_519 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_520 = "(this, ";
  protected final String TEXT_521 = ".RESOLVE, ";
  protected final String TEXT_522 = ", old";
  protected final String TEXT_523 = ", ";
  protected final String TEXT_524 = "));";
  protected final String TEXT_525 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_526 = NL + "\t\treturn (";
  protected final String TEXT_527 = ")eVirtualGet(";
  protected final String TEXT_528 = ", ";
  protected final String TEXT_529 = ");";
  protected final String TEXT_530 = NL + "\t\treturn (";
  protected final String TEXT_531 = " & ";
  protected final String TEXT_532 = "_EFLAG) != 0;";
  protected final String TEXT_533 = NL + "\t\treturn ";
  protected final String TEXT_534 = "_EFLAG_VALUES[(";
  protected final String TEXT_535 = " & ";
  protected final String TEXT_536 = "_EFLAG) >>> ";
  protected final String TEXT_537 = "_EFLAG_OFFSET];";
  protected final String TEXT_538 = NL + "\t\treturn ";
  protected final String TEXT_539 = ";";
  protected final String TEXT_540 = NL + "\t\t";
  protected final String TEXT_541 = " ";
  protected final String TEXT_542 = " = basicGet";
  protected final String TEXT_543 = "();" + NL + "\t\treturn ";
  protected final String TEXT_544 = " != null && ";
  protected final String TEXT_545 = ".eIsProxy() ? ";
  protected final String TEXT_546 = "eResolveProxy((";
  protected final String TEXT_547 = ")";
  protected final String TEXT_548 = ") : ";
  protected final String TEXT_549 = ";";
  protected final String TEXT_550 = NL + "\t\treturn new ";
  protected final String TEXT_551 = "((";
  protected final String TEXT_552 = ".Internal)((";
  protected final String TEXT_553 = ".Internal.Wrapper)get";
  protected final String TEXT_554 = "()).featureMap().";
  protected final String TEXT_555 = "list(";
  protected final String TEXT_556 = "));";
  protected final String TEXT_557 = NL + "\t\treturn (";
  protected final String TEXT_558 = ")get";
  protected final String TEXT_559 = "().";
  protected final String TEXT_560 = "list(";
  protected final String TEXT_561 = ");";
  protected final String TEXT_562 = NL + "\t\treturn ((";
  protected final String TEXT_563 = ".Internal.Wrapper)get";
  protected final String TEXT_564 = "()).featureMap().list(";
  protected final String TEXT_565 = ");";
  protected final String TEXT_566 = NL + "\t\treturn get";
  protected final String TEXT_567 = "().list(";
  protected final String TEXT_568 = ");";
  protected final String TEXT_569 = NL + "\t\treturn ";
  protected final String TEXT_570 = "(";
  protected final String TEXT_571 = "(";
  protected final String TEXT_572 = ")";
  protected final String TEXT_573 = "((";
  protected final String TEXT_574 = ".Internal.Wrapper)get";
  protected final String TEXT_575 = "()).featureMap().get(";
  protected final String TEXT_576 = ", true)";
  protected final String TEXT_577 = ").";
  protected final String TEXT_578 = "()";
  protected final String TEXT_579 = ";";
  protected final String TEXT_580 = NL + "\t\treturn ";
  protected final String TEXT_581 = "(";
  protected final String TEXT_582 = "(";
  protected final String TEXT_583 = ")";
  protected final String TEXT_584 = "get";
  protected final String TEXT_585 = "().get(";
  protected final String TEXT_586 = ", true)";
  protected final String TEXT_587 = ").";
  protected final String TEXT_588 = "()";
  protected final String TEXT_589 = ";";
  protected final String TEXT_590 = NL + "\t\t";
  protected final String TEXT_591 = NL + "\t\t";
  protected final String TEXT_592 = NL + "\t\t";
  protected final String TEXT_593 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_594 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_595 = NL + "\t\t\t";
  protected final String TEXT_596 = " result = (";
  protected final String TEXT_597 = ") cache.get(";
  protected final String TEXT_598 = "eResource(), ";
  protected final String TEXT_599 = "this, ";
  protected final String TEXT_600 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_601 = "eResource(), ";
  protected final String TEXT_602 = "this, ";
  protected final String TEXT_603 = ", result = ";
  protected final String TEXT_604 = "new ";
  protected final String TEXT_605 = "(";
  protected final String TEXT_606 = ".";
  protected final String TEXT_607 = "(this)";
  protected final String TEXT_608 = ")";
  protected final String TEXT_609 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_610 = ".";
  protected final String TEXT_611 = "()";
  protected final String TEXT_612 = ";" + NL + "\t\t}";
  protected final String TEXT_613 = NL + "\t\treturn ";
  protected final String TEXT_614 = ".";
  protected final String TEXT_615 = "(this);";
  protected final String TEXT_616 = NL + "\t\t";
  protected final String TEXT_617 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_618 = " eResource = eResource();";
  protected final String TEXT_619 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_620 = NL + "\t\t\t";
  protected final String TEXT_621 = " ";
  protected final String TEXT_622 = " = (";
  protected final String TEXT_623 = ") cache.get(eResource, this, ";
  protected final String TEXT_624 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_625 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_626 = ", ";
  protected final String TEXT_627 = " = new ";
  protected final String TEXT_628 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_629 = ";" + NL + "\t\t}";
  protected final String TEXT_630 = NL + "\t\treturn new ";
  protected final String TEXT_631 = ";";
  protected final String TEXT_632 = NL + "\t\t";
  protected final String TEXT_633 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_634 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_635 = " method = getClass().getMethod(\"";
  protected final String TEXT_636 = "\", null);";
  protected final String TEXT_637 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_638 = NL + "\t\t\t\t";
  protected final String TEXT_639 = " ";
  protected final String TEXT_640 = " = (";
  protected final String TEXT_641 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_642 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_643 = " union = ";
  protected final String TEXT_644 = "Helper(new ";
  protected final String TEXT_645 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_646 = " = new ";
  protected final String TEXT_647 = "(this, ";
  protected final String TEXT_648 = "null";
  protected final String TEXT_649 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_650 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_651 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_652 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_653 = NL + "\t\t\t";
  protected final String TEXT_654 = " ";
  protected final String TEXT_655 = " = (";
  protected final String TEXT_656 = ") cache.get(eResource(), this, ";
  protected final String TEXT_657 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_658 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_659 = " union = ";
  protected final String TEXT_660 = "Helper(new ";
  protected final String TEXT_661 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_662 = ", ";
  protected final String TEXT_663 = " = new ";
  protected final String TEXT_664 = "(this, ";
  protected final String TEXT_665 = "null";
  protected final String TEXT_666 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_667 = ";";
  protected final String TEXT_668 = NL + "\t\t}";
  protected final String TEXT_669 = NL + "\t\t";
  protected final String TEXT_670 = " union = ";
  protected final String TEXT_671 = "Helper(new ";
  protected final String TEXT_672 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_673 = "(this, ";
  protected final String TEXT_674 = "null";
  protected final String TEXT_675 = ", union.size(), union.toArray());";
  protected final String TEXT_676 = NL + "\t\tif (isSet";
  protected final String TEXT_677 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_678 = "();" + NL + "\t\t}";
  protected final String TEXT_679 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_680 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_681 = "();" + NL + "\t\t}";
  protected final String TEXT_682 = NL + "\t\t";
  protected final String TEXT_683 = " ";
  protected final String TEXT_684 = " = ";
  protected final String TEXT_685 = "();" + NL + "\t\tif (";
  protected final String TEXT_686 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_687 = ";" + NL + "\t\t}";
  protected final String TEXT_688 = NL + "\t\treturn ";
  protected final String TEXT_689 = "super.";
  protected final String TEXT_690 = "()";
  protected final String TEXT_691 = "null";
  protected final String TEXT_692 = ";";
  protected final String TEXT_693 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_694 = "' ";
  protected final String TEXT_695 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_696 = NL + "\t}" + NL;
  protected final String TEXT_697 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_698 = NL + "\t@Override";
  protected final String TEXT_699 = NL + "\tpublic ";
  protected final String TEXT_700 = " basicGet";
  protected final String TEXT_701 = "()" + NL + "\t{";
  protected final String TEXT_702 = NL + "\t\treturn (";
  protected final String TEXT_703 = ")eDynamicGet(";
  protected final String TEXT_704 = " - ESTATIC_FEATURE_COUNT";
  protected final String TEXT_705 = ", ";
  protected final String TEXT_706 = ", false, ";
  protected final String TEXT_707 = ");";
  protected final String TEXT_708 = NL + "\t\treturn ";
  protected final String TEXT_709 = "(";
  protected final String TEXT_710 = "(";
  protected final String TEXT_711 = ")";
  protected final String TEXT_712 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false)";
  protected final String TEXT_713 = ").";
  protected final String TEXT_714 = "()";
  protected final String TEXT_715 = ";";
  protected final String TEXT_716 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_717 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_718 = ")eInternalContainer();";
  protected final String TEXT_719 = NL + "\t\treturn (";
  protected final String TEXT_720 = ")eVirtualGet(";
  protected final String TEXT_721 = ");";
  protected final String TEXT_722 = NL + "\t\treturn ";
  protected final String TEXT_723 = ";";
  protected final String TEXT_724 = NL + "\t\treturn (";
  protected final String TEXT_725 = ")((";
  protected final String TEXT_726 = ".Internal.Wrapper)get";
  protected final String TEXT_727 = "()).featureMap().get(";
  protected final String TEXT_728 = ", false);";
  protected final String TEXT_729 = NL + "\t\treturn (";
  protected final String TEXT_730 = ")get";
  protected final String TEXT_731 = "().get(";
  protected final String TEXT_732 = ", false);";
  protected final String TEXT_733 = NL + "\t\t";
  protected final String TEXT_734 = NL + "\t\treturn ";
  protected final String TEXT_735 = ".";
  protected final String TEXT_736 = "(this);";
  protected final String TEXT_737 = NL + "\t\tif (isSet";
  protected final String TEXT_738 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_739 = "basicGet";
  protected final String TEXT_740 = "();" + NL + "\t\t}";
  protected final String TEXT_741 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_742 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_743 = "basicGet";
  protected final String TEXT_744 = "();" + NL + "\t\t}";
  protected final String TEXT_745 = NL + "\t\t";
  protected final String TEXT_746 = " ";
  protected final String TEXT_747 = " = ";
  protected final String TEXT_748 = "basicGet";
  protected final String TEXT_749 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_750 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_751 = ";" + NL + "\t\t}";
  protected final String TEXT_752 = NL + "\t\treturn ";
  protected final String TEXT_753 = "super.basicGet";
  protected final String TEXT_754 = "()";
  protected final String TEXT_755 = "null";
  protected final String TEXT_756 = ";";
  protected final String TEXT_757 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_758 = "' ";
  protected final String TEXT_759 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_760 = NL + "\t}" + NL;
  protected final String TEXT_761 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_762 = NL + "\t@Override";
  protected final String TEXT_763 = NL + "\tpublic ";
  protected final String TEXT_764 = " basicSet";
  protected final String TEXT_765 = "(";
  protected final String TEXT_766 = " new";
  protected final String TEXT_767 = ", ";
  protected final String TEXT_768 = " msgs)" + NL + "\t{";
  protected final String TEXT_769 = NL + "\t\tif (new";
  protected final String TEXT_770 = " != null && !(new";
  protected final String TEXT_771 = " instanceof ";
  protected final String TEXT_772 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(\"new";
  protected final String TEXT_773 = " must be an instance of ";
  protected final String TEXT_774 = "\");";
  protected final String TEXT_775 = NL + "\t\t}";
  protected final String TEXT_776 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_777 = ")new";
  protected final String TEXT_778 = ", ";
  protected final String TEXT_779 = ", msgs);";
  protected final String TEXT_780 = NL + "\t\t";
  protected final String TEXT_781 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_782 = NL + "\t\t\t";
  protected final String TEXT_783 = " ";
  protected final String TEXT_784 = " = ";
  protected final String TEXT_785 = "();";
  protected final String TEXT_786 = NL + "\t\t\tObject ";
  protected final String TEXT_787 = " = eVirtualGet(";
  protected final String TEXT_788 = ");";
  protected final String TEXT_789 = NL + "\t\t\tif (";
  protected final String TEXT_790 = " != null && ";
  protected final String TEXT_791 = " != new";
  protected final String TEXT_792 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_793 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_794 = NL + "\t\t\tif (new";
  protected final String TEXT_795 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_796 = NL + "\t\t\t\t";
  protected final String TEXT_797 = " ";
  protected final String TEXT_798 = " = ";
  protected final String TEXT_799 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_800 = ".contains(new";
  protected final String TEXT_801 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_802 = ".add(new";
  protected final String TEXT_803 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_804 = NL + "\t\t\t\t";
  protected final String TEXT_805 = " ";
  protected final String TEXT_806 = " = ";
  protected final String TEXT_807 = "();";
  protected final String TEXT_808 = NL + "\t\t\t\tObject ";
  protected final String TEXT_809 = " = eVirtualGet(";
  protected final String TEXT_810 = ");";
  protected final String TEXT_811 = NL + "\t\t\t\tif (new";
  protected final String TEXT_812 = " != ";
  protected final String TEXT_813 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_814 = "(new";
  protected final String TEXT_815 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_816 = NL + "\t\t\t}";
  protected final String TEXT_817 = NL + "\t\t}";
  protected final String TEXT_818 = NL + "\t\treturn msgs;";
  protected final String TEXT_819 = NL + "\t\tif (new";
  protected final String TEXT_820 = " != null && !(new";
  protected final String TEXT_821 = " instanceof ";
  protected final String TEXT_822 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(\"new";
  protected final String TEXT_823 = " must be an instance of ";
  protected final String TEXT_824 = "\");";
  protected final String TEXT_825 = NL + "\t\t}";
  protected final String TEXT_826 = NL + "\t\tmsgs = eDynamicInverseAdd((";
  protected final String TEXT_827 = ")new";
  protected final String TEXT_828 = ", ";
  protected final String TEXT_829 = ", msgs);";
  protected final String TEXT_830 = NL + "\t\t";
  protected final String TEXT_831 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_832 = NL + "\t\t\t";
  protected final String TEXT_833 = " ";
  protected final String TEXT_834 = " = ";
  protected final String TEXT_835 = "();";
  protected final String TEXT_836 = NL + "\t\t\tObject ";
  protected final String TEXT_837 = " = eVirtualGet(";
  protected final String TEXT_838 = ");";
  protected final String TEXT_839 = NL + "\t\t\tif (";
  protected final String TEXT_840 = " != null && ";
  protected final String TEXT_841 = " != new";
  protected final String TEXT_842 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_843 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_844 = NL + "\t\t\tif (new";
  protected final String TEXT_845 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_846 = NL + "\t\t\t\t";
  protected final String TEXT_847 = " ";
  protected final String TEXT_848 = " = ";
  protected final String TEXT_849 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_850 = ".contains(new";
  protected final String TEXT_851 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_852 = ".add(new";
  protected final String TEXT_853 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_854 = NL + "\t\t\t\t";
  protected final String TEXT_855 = " ";
  protected final String TEXT_856 = " = ";
  protected final String TEXT_857 = "();";
  protected final String TEXT_858 = NL + "\t\t\t\tObject ";
  protected final String TEXT_859 = " = eVirtualGet(";
  protected final String TEXT_860 = ");";
  protected final String TEXT_861 = NL + "\t\t\t\tif (new";
  protected final String TEXT_862 = " != ";
  protected final String TEXT_863 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_864 = "(new";
  protected final String TEXT_865 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_866 = NL + "\t\t\t}";
  protected final String TEXT_867 = NL + "\t\t}";
  protected final String TEXT_868 = NL + "\t\treturn msgs;";
  protected final String TEXT_869 = NL + "\t\tif (new";
  protected final String TEXT_870 = " != null && !(new";
  protected final String TEXT_871 = " instanceof ";
  protected final String TEXT_872 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(\"new";
  protected final String TEXT_873 = " must be an instance of ";
  protected final String TEXT_874 = "\");";
  protected final String TEXT_875 = NL + "\t\t}";
  protected final String TEXT_876 = NL + "\t\tObject old";
  protected final String TEXT_877 = " = eVirtualSet(";
  protected final String TEXT_878 = ", new";
  protected final String TEXT_879 = ");";
  protected final String TEXT_880 = NL + "\t\t";
  protected final String TEXT_881 = " old";
  protected final String TEXT_882 = " = ";
  protected final String TEXT_883 = ";" + NL + "\t\t";
  protected final String TEXT_884 = " = new";
  protected final String TEXT_885 = ";";
  protected final String TEXT_886 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_887 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_888 = NL + "\t\tboolean old";
  protected final String TEXT_889 = "ESet = (";
  protected final String TEXT_890 = " & ";
  protected final String TEXT_891 = "_ESETFLAG) != 0;";
  protected final String TEXT_892 = NL + "\t\t";
  protected final String TEXT_893 = " |= ";
  protected final String TEXT_894 = "_ESETFLAG;";
  protected final String TEXT_895 = NL + "\t\tboolean old";
  protected final String TEXT_896 = "ESet = ";
  protected final String TEXT_897 = "ESet;";
  protected final String TEXT_898 = NL + "\t\t";
  protected final String TEXT_899 = "ESet = true;";
  protected final String TEXT_900 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_901 = NL + "\t\t\t";
  protected final String TEXT_902 = " notification = new ";
  protected final String TEXT_903 = "(this, ";
  protected final String TEXT_904 = ".SET, ";
  protected final String TEXT_905 = ", ";
  protected final String TEXT_906 = "isSetChange ? null : old";
  protected final String TEXT_907 = "old";
  protected final String TEXT_908 = ", new";
  protected final String TEXT_909 = ", ";
  protected final String TEXT_910 = "isSetChange";
  protected final String TEXT_911 = "!old";
  protected final String TEXT_912 = "ESet";
  protected final String TEXT_913 = ");";
  protected final String TEXT_914 = NL + "\t\t\t";
  protected final String TEXT_915 = " notification = new ";
  protected final String TEXT_916 = "(this, ";
  protected final String TEXT_917 = ".SET, ";
  protected final String TEXT_918 = ", ";
  protected final String TEXT_919 = "old";
  protected final String TEXT_920 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_921 = "old";
  protected final String TEXT_922 = ", new";
  protected final String TEXT_923 = ");";
  protected final String TEXT_924 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_925 = NL + "\t\t";
  protected final String TEXT_926 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_927 = NL + "\t\t\t";
  protected final String TEXT_928 = " ";
  protected final String TEXT_929 = " = ";
  protected final String TEXT_930 = "();";
  protected final String TEXT_931 = NL + "\t\t\tObject ";
  protected final String TEXT_932 = " = eVirtualGet(";
  protected final String TEXT_933 = ");";
  protected final String TEXT_934 = NL + "\t\t\tif (";
  protected final String TEXT_935 = " != null && ";
  protected final String TEXT_936 = " != new";
  protected final String TEXT_937 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_938 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_939 = NL + "\t\t\tif (new";
  protected final String TEXT_940 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_941 = NL + "\t\t\t\t";
  protected final String TEXT_942 = " ";
  protected final String TEXT_943 = " = ";
  protected final String TEXT_944 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_945 = ".contains(new";
  protected final String TEXT_946 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_947 = ".add(new";
  protected final String TEXT_948 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_949 = NL + "\t\t\t\t";
  protected final String TEXT_950 = " ";
  protected final String TEXT_951 = " = ";
  protected final String TEXT_952 = "();";
  protected final String TEXT_953 = NL + "\t\t\t\tObject ";
  protected final String TEXT_954 = " = eVirtualGet(";
  protected final String TEXT_955 = ");";
  protected final String TEXT_956 = NL + "\t\t\t\tif (new";
  protected final String TEXT_957 = " != ";
  protected final String TEXT_958 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_959 = "(new";
  protected final String TEXT_960 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_961 = NL + "\t\t\t}";
  protected final String TEXT_962 = NL + "\t\t}";
  protected final String TEXT_963 = NL + "\t\treturn msgs;";
  protected final String TEXT_964 = NL + "\t\treturn ((";
  protected final String TEXT_965 = ".Internal)((";
  protected final String TEXT_966 = ".Internal.Wrapper)get";
  protected final String TEXT_967 = "()).featureMap()).basicAdd(";
  protected final String TEXT_968 = ", new";
  protected final String TEXT_969 = ", msgs);";
  protected final String TEXT_970 = NL + "\t\treturn ((";
  protected final String TEXT_971 = ".Internal)get";
  protected final String TEXT_972 = "()).basicAdd(";
  protected final String TEXT_973 = ", new";
  protected final String TEXT_974 = ", msgs);";
  protected final String TEXT_975 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_976 = "' ";
  protected final String TEXT_977 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_978 = NL + "\t}" + NL;
  protected final String TEXT_979 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_980 = "#";
  protected final String TEXT_981 = " <em>";
  protected final String TEXT_982 = "</em>}' ";
  protected final String TEXT_983 = ".";
  protected final String TEXT_984 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_985 = "</em>' ";
  protected final String TEXT_986 = ".";
  protected final String TEXT_987 = NL + "\t * @see ";
  protected final String TEXT_988 = NL + "\t * @see #isSet";
  protected final String TEXT_989 = "()";
  protected final String TEXT_990 = NL + "\t * @see #unset";
  protected final String TEXT_991 = "()";
  protected final String TEXT_992 = NL + "\t * @see #";
  protected final String TEXT_993 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_994 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_995 = NL + "\t@Override";
  protected final String TEXT_996 = NL + "\tvoid set";
  protected final String TEXT_997 = "(";
  protected final String TEXT_998 = " value);" + NL;
  protected final String TEXT_999 = NL + "\tpublic void set";
  protected final String TEXT_1000 = "_";
  protected final String TEXT_1001 = "(";
  protected final String TEXT_1002 = " ";
  protected final String TEXT_1003 = ")" + NL + "\t{";
  protected final String TEXT_1004 = NL + "\t\tif (new";
  protected final String TEXT_1005 = " != null && !(new";
  protected final String TEXT_1006 = " instanceof ";
  protected final String TEXT_1007 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(\"new";
  protected final String TEXT_1008 = " must be an instance of ";
  protected final String TEXT_1009 = "\");";
  protected final String TEXT_1010 = NL + "\t\t}";
  protected final String TEXT_1011 = NL + "\t\tnew";
  protected final String TEXT_1012 = " = new";
  protected final String TEXT_1013 = " == null ? ";
  protected final String TEXT_1014 = " : new";
  protected final String TEXT_1015 = ";";
  protected final String TEXT_1016 = NL + "\t\teDynamicSet(";
  protected final String TEXT_1017 = " - ESTATIC_FEATURE_COUNT";
  protected final String TEXT_1018 = ", ";
  protected final String TEXT_1019 = ", ";
  protected final String TEXT_1020 = "new ";
  protected final String TEXT_1021 = "(";
  protected final String TEXT_1022 = "new";
  protected final String TEXT_1023 = ")";
  protected final String TEXT_1024 = ");";
  protected final String TEXT_1025 = NL + "\t\teSet(";
  protected final String TEXT_1026 = ", ";
  protected final String TEXT_1027 = "new ";
  protected final String TEXT_1028 = "(";
  protected final String TEXT_1029 = "new";
  protected final String TEXT_1030 = ")";
  protected final String TEXT_1031 = ");";
  protected final String TEXT_1032 = NL + "\t\t";
  protected final String TEXT_1033 = "__ESETTING_DELEGATE.dynamicSet(this, null, 0, ";
  protected final String TEXT_1034 = "new ";
  protected final String TEXT_1035 = "(";
  protected final String TEXT_1036 = "new";
  protected final String TEXT_1037 = ")";
  protected final String TEXT_1038 = ");";
  protected final String TEXT_1039 = NL + "\t\tif (new";
  protected final String TEXT_1040 = " != eInternalContainer() || (eContainerFeatureID() != ";
  protected final String TEXT_1041 = " && new";
  protected final String TEXT_1042 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1043 = ".isAncestor(this, ";
  protected final String TEXT_1044 = "new";
  protected final String TEXT_1045 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_1046 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_1047 = NL + "\t\t\t";
  protected final String TEXT_1048 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_1049 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_1050 = ")new";
  protected final String TEXT_1051 = ").eInverseAdd(this, ";
  protected final String TEXT_1052 = ", ";
  protected final String TEXT_1053 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_1054 = "(";
  protected final String TEXT_1055 = "new";
  protected final String TEXT_1056 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_1057 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1058 = "(this, ";
  protected final String TEXT_1059 = ".SET, ";
  protected final String TEXT_1060 = ", new";
  protected final String TEXT_1061 = ", new";
  protected final String TEXT_1062 = "));";
  protected final String TEXT_1063 = NL + "\t\t";
  protected final String TEXT_1064 = " ";
  protected final String TEXT_1065 = " = (";
  protected final String TEXT_1066 = ")eVirtualGet(";
  protected final String TEXT_1067 = ");";
  protected final String TEXT_1068 = NL + "\t\tif (new";
  protected final String TEXT_1069 = " != ";
  protected final String TEXT_1070 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1071 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_1072 = " != null)";
  protected final String TEXT_1073 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_1074 = ")";
  protected final String TEXT_1075 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1076 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_1077 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_1078 = ")new";
  protected final String TEXT_1079 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1080 = ", null, msgs);";
  protected final String TEXT_1081 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_1082 = ")";
  protected final String TEXT_1083 = ").eInverseRemove(this, ";
  protected final String TEXT_1084 = ", ";
  protected final String TEXT_1085 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_1086 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_1087 = ")new";
  protected final String TEXT_1088 = ").eInverseAdd(this, ";
  protected final String TEXT_1089 = ", ";
  protected final String TEXT_1090 = ".class, msgs);";
  protected final String TEXT_1091 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_1092 = "(";
  protected final String TEXT_1093 = "new";
  protected final String TEXT_1094 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_1095 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1096 = NL + "\t\t\tboolean old";
  protected final String TEXT_1097 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1098 = ");";
  protected final String TEXT_1099 = NL + "\t\t\tboolean old";
  protected final String TEXT_1100 = "ESet = (";
  protected final String TEXT_1101 = " & ";
  protected final String TEXT_1102 = "_ESETFLAG) != 0;";
  protected final String TEXT_1103 = NL + "\t\t\t";
  protected final String TEXT_1104 = " |= ";
  protected final String TEXT_1105 = "_ESETFLAG;";
  protected final String TEXT_1106 = NL + "\t\t\tboolean old";
  protected final String TEXT_1107 = "ESet = ";
  protected final String TEXT_1108 = "ESet;";
  protected final String TEXT_1109 = NL + "\t\t\t";
  protected final String TEXT_1110 = "ESet = true;";
  protected final String TEXT_1111 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1112 = "(this, ";
  protected final String TEXT_1113 = ".SET, ";
  protected final String TEXT_1114 = ", new";
  protected final String TEXT_1115 = ", new";
  protected final String TEXT_1116 = ", !old";
  protected final String TEXT_1117 = "ESet));";
  protected final String TEXT_1118 = NL + "\t\t}";
  protected final String TEXT_1119 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1120 = "(this, ";
  protected final String TEXT_1121 = ".SET, ";
  protected final String TEXT_1122 = ", new";
  protected final String TEXT_1123 = ", new";
  protected final String TEXT_1124 = "));";
  protected final String TEXT_1125 = NL + "\t\t";
  protected final String TEXT_1126 = " old";
  protected final String TEXT_1127 = " = (";
  protected final String TEXT_1128 = " & ";
  protected final String TEXT_1129 = "_EFLAG) != 0;";
  protected final String TEXT_1130 = NL + "\t\t";
  protected final String TEXT_1131 = " old";
  protected final String TEXT_1132 = " = ";
  protected final String TEXT_1133 = "_EFLAG_VALUES[(";
  protected final String TEXT_1134 = " & ";
  protected final String TEXT_1135 = "_EFLAG) >>> ";
  protected final String TEXT_1136 = "_EFLAG_OFFSET];";
  protected final String TEXT_1137 = NL + "\t\tif (new";
  protected final String TEXT_1138 = ") ";
  protected final String TEXT_1139 = " |= ";
  protected final String TEXT_1140 = "_EFLAG; else ";
  protected final String TEXT_1141 = " &= ~";
  protected final String TEXT_1142 = "_EFLAG;";
  protected final String TEXT_1143 = NL + "\t\tif (new";
  protected final String TEXT_1144 = " == null) new";
  protected final String TEXT_1145 = " = ";
  protected final String TEXT_1146 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_1147 = " = ";
  protected final String TEXT_1148 = " & ~";
  protected final String TEXT_1149 = "_EFLAG | ";
  protected final String TEXT_1150 = "new";
  protected final String TEXT_1151 = ".ordinal()";
  protected final String TEXT_1152 = ".VALUES.indexOf(new";
  protected final String TEXT_1153 = ")";
  protected final String TEXT_1154 = " << ";
  protected final String TEXT_1155 = "_EFLAG_OFFSET;";
  protected final String TEXT_1156 = NL + "\t\t";
  protected final String TEXT_1157 = " old";
  protected final String TEXT_1158 = " = ";
  protected final String TEXT_1159 = ";";
  protected final String TEXT_1160 = NL + "\t\t";
  protected final String TEXT_1161 = " ";
  protected final String TEXT_1162 = " = new";
  protected final String TEXT_1163 = " == null ? ";
  protected final String TEXT_1164 = " : new";
  protected final String TEXT_1165 = ";";
  protected final String TEXT_1166 = NL + "\t\t";
  protected final String TEXT_1167 = " = new";
  protected final String TEXT_1168 = " == null ? ";
  protected final String TEXT_1169 = " : new";
  protected final String TEXT_1170 = ";";
  protected final String TEXT_1171 = NL + "\t\t";
  protected final String TEXT_1172 = " ";
  protected final String TEXT_1173 = " = ";
  protected final String TEXT_1174 = "new";
  protected final String TEXT_1175 = ";";
  protected final String TEXT_1176 = NL + "\t\t";
  protected final String TEXT_1177 = " = ";
  protected final String TEXT_1178 = "new";
  protected final String TEXT_1179 = ";";
  protected final String TEXT_1180 = NL + "\t\tObject old";
  protected final String TEXT_1181 = " = eVirtualSet(";
  protected final String TEXT_1182 = ", ";
  protected final String TEXT_1183 = ");";
  protected final String TEXT_1184 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1185 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1186 = NL + "\t\tboolean old";
  protected final String TEXT_1187 = "ESet = (";
  protected final String TEXT_1188 = " & ";
  protected final String TEXT_1189 = "_ESETFLAG) != 0;";
  protected final String TEXT_1190 = NL + "\t\t";
  protected final String TEXT_1191 = " |= ";
  protected final String TEXT_1192 = "_ESETFLAG;";
  protected final String TEXT_1193 = NL + "\t\tboolean old";
  protected final String TEXT_1194 = "ESet = ";
  protected final String TEXT_1195 = "ESet;";
  protected final String TEXT_1196 = NL + "\t\t";
  protected final String TEXT_1197 = "ESet = true;";
  protected final String TEXT_1198 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1199 = "(this, ";
  protected final String TEXT_1200 = ".SET, ";
  protected final String TEXT_1201 = ", ";
  protected final String TEXT_1202 = "isSetChange ? ";
  protected final String TEXT_1203 = " : old";
  protected final String TEXT_1204 = "old";
  protected final String TEXT_1205 = ", ";
  protected final String TEXT_1206 = "new";
  protected final String TEXT_1207 = ", ";
  protected final String TEXT_1208 = "isSetChange";
  protected final String TEXT_1209 = "!old";
  protected final String TEXT_1210 = "ESet";
  protected final String TEXT_1211 = "));";
  protected final String TEXT_1212 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1213 = "(this, ";
  protected final String TEXT_1214 = ".SET, ";
  protected final String TEXT_1215 = ", ";
  protected final String TEXT_1216 = "old";
  protected final String TEXT_1217 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_1218 = " : old";
  protected final String TEXT_1219 = "old";
  protected final String TEXT_1220 = ", ";
  protected final String TEXT_1221 = "new";
  protected final String TEXT_1222 = "));";
  protected final String TEXT_1223 = NL + "\t\t";
  protected final String TEXT_1224 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_1225 = NL + "\t\t\t";
  protected final String TEXT_1226 = " ";
  protected final String TEXT_1227 = " = ";
  protected final String TEXT_1228 = "();";
  protected final String TEXT_1229 = NL + "\t\t\tObject ";
  protected final String TEXT_1230 = " = eVirtualGet(";
  protected final String TEXT_1231 = ");";
  protected final String TEXT_1232 = NL + "\t\t\tif (";
  protected final String TEXT_1233 = " != null && ";
  protected final String TEXT_1234 = " != new";
  protected final String TEXT_1235 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_1236 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_1237 = NL + "\t\t\tif (new";
  protected final String TEXT_1238 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_1239 = NL + "\t\t\t\t";
  protected final String TEXT_1240 = " ";
  protected final String TEXT_1241 = " = ";
  protected final String TEXT_1242 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_1243 = ".contains(new";
  protected final String TEXT_1244 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_1245 = ".add(new";
  protected final String TEXT_1246 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1247 = NL + "\t\t\t\t";
  protected final String TEXT_1248 = " ";
  protected final String TEXT_1249 = " = ";
  protected final String TEXT_1250 = "();";
  protected final String TEXT_1251 = NL + "\t\t\t\tObject ";
  protected final String TEXT_1252 = " = eVirtualGet(";
  protected final String TEXT_1253 = ");";
  protected final String TEXT_1254 = NL + "\t\t\t\tif (new";
  protected final String TEXT_1255 = " != ";
  protected final String TEXT_1256 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_1257 = "(new";
  protected final String TEXT_1258 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1259 = NL + "\t\t\t}";
  protected final String TEXT_1260 = NL + "\t\t}";
  protected final String TEXT_1261 = NL + "\t\t((";
  protected final String TEXT_1262 = ".Internal)((";
  protected final String TEXT_1263 = ".Internal.Wrapper)get";
  protected final String TEXT_1264 = "()).featureMap()).set(";
  protected final String TEXT_1265 = ", ";
  protected final String TEXT_1266 = "new ";
  protected final String TEXT_1267 = "(";
  protected final String TEXT_1268 = "new";
  protected final String TEXT_1269 = ")";
  protected final String TEXT_1270 = ");";
  protected final String TEXT_1271 = NL + "\t\t((";
  protected final String TEXT_1272 = ".Internal)get";
  protected final String TEXT_1273 = "()).set(";
  protected final String TEXT_1274 = ", ";
  protected final String TEXT_1275 = "new ";
  protected final String TEXT_1276 = "(";
  protected final String TEXT_1277 = "new";
  protected final String TEXT_1278 = ")";
  protected final String TEXT_1279 = ");";
  protected final String TEXT_1280 = NL + "\t\t";
  protected final String TEXT_1281 = NL + "\t\t";
  protected final String TEXT_1282 = ".";
  protected final String TEXT_1283 = "(this, ";
  protected final String TEXT_1284 = ");";
  protected final String TEXT_1285 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_1286 = "' ";
  protected final String TEXT_1287 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1288 = NL + "\t}" + NL;
  protected final String TEXT_1289 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1290 = NL + "\t@Override";
  protected final String TEXT_1291 = NL + "\tpublic ";
  protected final String TEXT_1292 = " basicUnset";
  protected final String TEXT_1293 = "(";
  protected final String TEXT_1294 = " msgs)" + NL + "\t{";
  protected final String TEXT_1295 = NL + "\t\treturn eDynamicInverseRemove((";
  protected final String TEXT_1296 = ")";
  protected final String TEXT_1297 = "basicGet";
  protected final String TEXT_1298 = "(), ";
  protected final String TEXT_1299 = ", msgs);";
  protected final String TEXT_1300 = "Object old";
  protected final String TEXT_1301 = " = ";
  protected final String TEXT_1302 = "eVirtualUnset(";
  protected final String TEXT_1303 = ");";
  protected final String TEXT_1304 = NL + "\t\t";
  protected final String TEXT_1305 = " old";
  protected final String TEXT_1306 = " = ";
  protected final String TEXT_1307 = ";";
  protected final String TEXT_1308 = NL + "\t\t";
  protected final String TEXT_1309 = " = null;";
  protected final String TEXT_1310 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1311 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1312 = NL + "\t\tboolean old";
  protected final String TEXT_1313 = "ESet = (";
  protected final String TEXT_1314 = " & ";
  protected final String TEXT_1315 = "_ESETFLAG) != 0;";
  protected final String TEXT_1316 = NL + "\t\t";
  protected final String TEXT_1317 = " &= ~";
  protected final String TEXT_1318 = "_ESETFLAG;";
  protected final String TEXT_1319 = NL + "\t\tboolean old";
  protected final String TEXT_1320 = "ESet = ";
  protected final String TEXT_1321 = "ESet;";
  protected final String TEXT_1322 = NL + "\t\t";
  protected final String TEXT_1323 = "ESet = false;";
  protected final String TEXT_1324 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1325 = " notification = new ";
  protected final String TEXT_1326 = "(this, ";
  protected final String TEXT_1327 = ".UNSET, ";
  protected final String TEXT_1328 = ", ";
  protected final String TEXT_1329 = "isSetChange ? old";
  protected final String TEXT_1330 = " : null";
  protected final String TEXT_1331 = "old";
  protected final String TEXT_1332 = ", null, ";
  protected final String TEXT_1333 = "isSetChange";
  protected final String TEXT_1334 = "old";
  protected final String TEXT_1335 = "ESet";
  protected final String TEXT_1336 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1337 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1338 = "' ";
  protected final String TEXT_1339 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1340 = NL + "\t}" + NL;
  protected final String TEXT_1341 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1342 = "#";
  protected final String TEXT_1343 = " <em>";
  protected final String TEXT_1344 = "</em>}' ";
  protected final String TEXT_1345 = ".";
  protected final String TEXT_1346 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1347 = NL + "\t * @see #isSet";
  protected final String TEXT_1348 = "()";
  protected final String TEXT_1349 = NL + "\t * @see #";
  protected final String TEXT_1350 = "()";
  protected final String TEXT_1351 = NL + "\t * @see #set";
  protected final String TEXT_1352 = "(";
  protected final String TEXT_1353 = ")";
  protected final String TEXT_1354 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1355 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1356 = NL + "\t@Override";
  protected final String TEXT_1357 = NL + "\tvoid unset";
  protected final String TEXT_1358 = "();" + NL;
  protected final String TEXT_1359 = NL + "\tpublic void unset";
  protected final String TEXT_1360 = "_";
  protected final String TEXT_1361 = "()" + NL + "\t{";
  protected final String TEXT_1362 = NL + "\t\teDynamicUnset(";
  protected final String TEXT_1363 = " - ESTATIC_FEATURE_COUNT";
  protected final String TEXT_1364 = ", ";
  protected final String TEXT_1365 = ");";
  protected final String TEXT_1366 = NL + "\t\teUnset(";
  protected final String TEXT_1367 = ");";
  protected final String TEXT_1368 = NL + "\t\t";
  protected final String TEXT_1369 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_1370 = NL + "\t\t";
  protected final String TEXT_1371 = " ";
  protected final String TEXT_1372 = " = (";
  protected final String TEXT_1373 = ")eVirtualGet(";
  protected final String TEXT_1374 = ");";
  protected final String TEXT_1375 = NL + "\t\tif (";
  protected final String TEXT_1376 = " != null) ((";
  protected final String TEXT_1377 = ".Unsettable";
  protected final String TEXT_1378 = ")";
  protected final String TEXT_1379 = ").unset();";
  protected final String TEXT_1380 = NL + "\t\t";
  protected final String TEXT_1381 = " ";
  protected final String TEXT_1382 = " = (";
  protected final String TEXT_1383 = ")eVirtualGet(";
  protected final String TEXT_1384 = ");";
  protected final String TEXT_1385 = NL + "\t\tif (";
  protected final String TEXT_1386 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1387 = " msgs = null;";
  protected final String TEXT_1388 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1389 = ")";
  protected final String TEXT_1390 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1391 = ", null, msgs);";
  protected final String TEXT_1392 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1393 = ")";
  protected final String TEXT_1394 = ").eInverseRemove(this, ";
  protected final String TEXT_1395 = ", ";
  protected final String TEXT_1396 = ".class, msgs);";
  protected final String TEXT_1397 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1398 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1399 = NL + "\t\t\tboolean old";
  protected final String TEXT_1400 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1401 = ");";
  protected final String TEXT_1402 = NL + "\t\t\tboolean old";
  protected final String TEXT_1403 = "ESet = (";
  protected final String TEXT_1404 = " & ";
  protected final String TEXT_1405 = "_ESETFLAG) != 0;";
  protected final String TEXT_1406 = NL + "\t\t\t";
  protected final String TEXT_1407 = " &= ~";
  protected final String TEXT_1408 = "_ESETFLAG;";
  protected final String TEXT_1409 = NL + "\t\t\tboolean old";
  protected final String TEXT_1410 = "ESet = ";
  protected final String TEXT_1411 = "ESet;";
  protected final String TEXT_1412 = NL + "\t\t\t";
  protected final String TEXT_1413 = "ESet = false;";
  protected final String TEXT_1414 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1415 = "(this, ";
  protected final String TEXT_1416 = ".UNSET, ";
  protected final String TEXT_1417 = ", null, null, old";
  protected final String TEXT_1418 = "ESet));";
  protected final String TEXT_1419 = NL + "\t\t}";
  protected final String TEXT_1420 = NL + "\t\t";
  protected final String TEXT_1421 = " old";
  protected final String TEXT_1422 = " = (";
  protected final String TEXT_1423 = " & ";
  protected final String TEXT_1424 = "_EFLAG) != 0;";
  protected final String TEXT_1425 = NL + "\t\t";
  protected final String TEXT_1426 = " old";
  protected final String TEXT_1427 = " = ";
  protected final String TEXT_1428 = "_EFLAG_VALUES[(";
  protected final String TEXT_1429 = " & ";
  protected final String TEXT_1430 = "_EFLAG) >>> ";
  protected final String TEXT_1431 = "_EFLAG_OFFSET];";
  protected final String TEXT_1432 = NL + "\t\tObject old";
  protected final String TEXT_1433 = " = eVirtualUnset(";
  protected final String TEXT_1434 = ");";
  protected final String TEXT_1435 = NL + "\t\t";
  protected final String TEXT_1436 = " old";
  protected final String TEXT_1437 = " = ";
  protected final String TEXT_1438 = ";";
  protected final String TEXT_1439 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1440 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1441 = NL + "\t\tboolean old";
  protected final String TEXT_1442 = "ESet = (";
  protected final String TEXT_1443 = " & ";
  protected final String TEXT_1444 = "_ESETFLAG) != 0;";
  protected final String TEXT_1445 = NL + "\t\tboolean old";
  protected final String TEXT_1446 = "ESet = ";
  protected final String TEXT_1447 = "ESet;";
  protected final String TEXT_1448 = NL + "\t\t";
  protected final String TEXT_1449 = " = null;";
  protected final String TEXT_1450 = NL + "\t\t";
  protected final String TEXT_1451 = " &= ~";
  protected final String TEXT_1452 = "_ESETFLAG;";
  protected final String TEXT_1453 = NL + "\t\t";
  protected final String TEXT_1454 = "ESet = false;";
  protected final String TEXT_1455 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1456 = "(this, ";
  protected final String TEXT_1457 = ".UNSET, ";
  protected final String TEXT_1458 = ", ";
  protected final String TEXT_1459 = "isSetChange ? old";
  protected final String TEXT_1460 = " : null";
  protected final String TEXT_1461 = "old";
  protected final String TEXT_1462 = ", null, ";
  protected final String TEXT_1463 = "isSetChange";
  protected final String TEXT_1464 = "old";
  protected final String TEXT_1465 = "ESet";
  protected final String TEXT_1466 = "));";
  protected final String TEXT_1467 = NL + "\t\tif (";
  protected final String TEXT_1468 = ") ";
  protected final String TEXT_1469 = " |= ";
  protected final String TEXT_1470 = "_EFLAG; else ";
  protected final String TEXT_1471 = " &= ~";
  protected final String TEXT_1472 = "_EFLAG;";
  protected final String TEXT_1473 = NL + "\t\t";
  protected final String TEXT_1474 = " = ";
  protected final String TEXT_1475 = " & ~";
  protected final String TEXT_1476 = "_EFLAG | ";
  protected final String TEXT_1477 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1478 = NL + "\t\t";
  protected final String TEXT_1479 = " = ";
  protected final String TEXT_1480 = ";";
  protected final String TEXT_1481 = NL + "\t\t";
  protected final String TEXT_1482 = " &= ~";
  protected final String TEXT_1483 = "_ESETFLAG;";
  protected final String TEXT_1484 = NL + "\t\t";
  protected final String TEXT_1485 = "ESet = false;";
  protected final String TEXT_1486 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1487 = "(this, ";
  protected final String TEXT_1488 = ".UNSET, ";
  protected final String TEXT_1489 = ", ";
  protected final String TEXT_1490 = "isSetChange ? old";
  protected final String TEXT_1491 = " : ";
  protected final String TEXT_1492 = "old";
  protected final String TEXT_1493 = ", ";
  protected final String TEXT_1494 = ", ";
  protected final String TEXT_1495 = "isSetChange";
  protected final String TEXT_1496 = "old";
  protected final String TEXT_1497 = "ESet";
  protected final String TEXT_1498 = "));";
  protected final String TEXT_1499 = NL + "\t\t((";
  protected final String TEXT_1500 = ".Internal)((";
  protected final String TEXT_1501 = ".Internal.Wrapper)get";
  protected final String TEXT_1502 = "()).featureMap()).clear(";
  protected final String TEXT_1503 = ");";
  protected final String TEXT_1504 = NL + "\t\t((";
  protected final String TEXT_1505 = ".Internal)get";
  protected final String TEXT_1506 = "()).clear(";
  protected final String TEXT_1507 = ");";
  protected final String TEXT_1508 = NL + "\t\t";
  protected final String TEXT_1509 = NL + "\t\t";
  protected final String TEXT_1510 = ".";
  protected final String TEXT_1511 = "(this);";
  protected final String TEXT_1512 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1513 = "' ";
  protected final String TEXT_1514 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1515 = NL + "\t}" + NL;
  protected final String TEXT_1516 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1517 = "#";
  protected final String TEXT_1518 = " <em>";
  protected final String TEXT_1519 = "</em>}' ";
  protected final String TEXT_1520 = " is set.";
  protected final String TEXT_1521 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1522 = "</em>' ";
  protected final String TEXT_1523 = " is set.";
  protected final String TEXT_1524 = NL + "\t * @see #unset";
  protected final String TEXT_1525 = "()";
  protected final String TEXT_1526 = NL + "\t * @see #";
  protected final String TEXT_1527 = "()";
  protected final String TEXT_1528 = NL + "\t * @see #set";
  protected final String TEXT_1529 = "(";
  protected final String TEXT_1530 = ")";
  protected final String TEXT_1531 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1532 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1533 = NL + "\t@Override";
  protected final String TEXT_1534 = NL + "\tboolean isSet";
  protected final String TEXT_1535 = "();" + NL;
  protected final String TEXT_1536 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1537 = "_";
  protected final String TEXT_1538 = "()" + NL + "\t{";
  protected final String TEXT_1539 = NL + "\t\treturn eDynamicIsSet(";
  protected final String TEXT_1540 = " - ESTATIC_FEATURE_COUNT";
  protected final String TEXT_1541 = ", ";
  protected final String TEXT_1542 = ");";
  protected final String TEXT_1543 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1544 = ");";
  protected final String TEXT_1545 = NL + "\t\treturn ";
  protected final String TEXT_1546 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_1547 = NL + "\t\t";
  protected final String TEXT_1548 = " ";
  protected final String TEXT_1549 = " = (";
  protected final String TEXT_1550 = ")eVirtualGet(";
  protected final String TEXT_1551 = ");";
  protected final String TEXT_1552 = NL + "\t\treturn ";
  protected final String TEXT_1553 = " != null && ((";
  protected final String TEXT_1554 = ".Unsettable";
  protected final String TEXT_1555 = ")";
  protected final String TEXT_1556 = ").isSet();";
  protected final String TEXT_1557 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1558 = ");";
  protected final String TEXT_1559 = NL + "\t\treturn (";
  protected final String TEXT_1560 = " & ";
  protected final String TEXT_1561 = "_ESETFLAG) != 0;";
  protected final String TEXT_1562 = NL + "\t\treturn ";
  protected final String TEXT_1563 = "ESet;";
  protected final String TEXT_1564 = NL + "\t\treturn !((";
  protected final String TEXT_1565 = ".Internal)((";
  protected final String TEXT_1566 = ".Internal.Wrapper)get";
  protected final String TEXT_1567 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1568 = ");";
  protected final String TEXT_1569 = NL + "\t\treturn !((";
  protected final String TEXT_1570 = ".Internal)get";
  protected final String TEXT_1571 = "()).isEmpty(";
  protected final String TEXT_1572 = ");";
  protected final String TEXT_1573 = NL + "\t\t";
  protected final String TEXT_1574 = NL + "\t\treturn ";
  protected final String TEXT_1575 = ".";
  protected final String TEXT_1576 = "(this);";
  protected final String TEXT_1577 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1578 = "' ";
  protected final String TEXT_1579 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1580 = NL + "\t}" + NL;
  protected final String TEXT_1581 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1582 = "() <em>";
  protected final String TEXT_1583 = "</em>}' ";
  protected final String TEXT_1584 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1585 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1586 = "_ESUBSETS = ";
  protected final String TEXT_1587 = ";" + NL;
  protected final String TEXT_1588 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1589 = "() <em>";
  protected final String TEXT_1590 = "</em>}' ";
  protected final String TEXT_1591 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1592 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1593 = "_ESUPERSETS = ";
  protected final String TEXT_1594 = ";" + NL;
  protected final String TEXT_1595 = NL + "\t/**";
  protected final String TEXT_1596 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1597 = "}, with the specified ";
  protected final String TEXT_1598 = ", and appends it to the '<em><b>";
  protected final String TEXT_1599 = "</b></em>' ";
  protected final String TEXT_1600 = ".";
  protected final String TEXT_1601 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1602 = "}, with the specified ";
  protected final String TEXT_1603 = ", and sets the '<em><b>";
  protected final String TEXT_1604 = "</b></em>' ";
  protected final String TEXT_1605 = ".";
  protected final String TEXT_1606 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1607 = "} and appends it to the '<em><b>";
  protected final String TEXT_1608 = "</b></em>' ";
  protected final String TEXT_1609 = ".";
  protected final String TEXT_1610 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1611 = "} and sets the '<em><b>";
  protected final String TEXT_1612 = "</b></em>' ";
  protected final String TEXT_1613 = ".";
  protected final String TEXT_1614 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1615 = NL + "\t * @param ";
  protected final String TEXT_1616 = " The ";
  protected final String TEXT_1617 = " for the new {@link ";
  protected final String TEXT_1618 = "}, or <code>null</code>.";
  protected final String TEXT_1619 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1620 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1621 = "}." + NL + "\t * @see #";
  protected final String TEXT_1622 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1623 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1624 = NL + "\t";
  protected final String TEXT_1625 = " create";
  protected final String TEXT_1626 = "(";
  protected final String TEXT_1627 = ", ";
  protected final String TEXT_1628 = " eClass);" + NL;
  protected final String TEXT_1629 = NL + "\t@Override";
  protected final String TEXT_1630 = NL + "\tpublic ";
  protected final String TEXT_1631 = " create";
  protected final String TEXT_1632 = "(";
  protected final String TEXT_1633 = ", ";
  protected final String TEXT_1634 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1635 = " new";
  protected final String TEXT_1636 = " = (";
  protected final String TEXT_1637 = ") create(eClass);";
  protected final String TEXT_1638 = NL + "\t\t";
  protected final String TEXT_1639 = "().add(new";
  protected final String TEXT_1640 = ");";
  protected final String TEXT_1641 = NL + "\t\tset";
  protected final String TEXT_1642 = "(new";
  protected final String TEXT_1643 = ");";
  protected final String TEXT_1644 = NL + "\t\tint ";
  protected final String TEXT_1645 = "ListSize = 0;";
  protected final String TEXT_1646 = NL + "\t\tint ";
  protected final String TEXT_1647 = "Size = ";
  protected final String TEXT_1648 = " == null ? 0 : ";
  protected final String TEXT_1649 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1650 = "Size > ";
  protected final String TEXT_1651 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1652 = "ListSize = ";
  protected final String TEXT_1653 = "Size;";
  protected final String TEXT_1654 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1655 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1656 = ".create";
  protected final String TEXT_1657 = "(";
  protected final String TEXT_1658 = ", ";
  protected final String TEXT_1659 = "i < ";
  protected final String TEXT_1660 = "Size ? (";
  protected final String TEXT_1661 = ") ";
  protected final String TEXT_1662 = ".get(i) : null";
  protected final String TEXT_1663 = ");" + NL + "\t\t}";
  protected final String TEXT_1664 = NL + "\t\tnew";
  protected final String TEXT_1665 = ".create";
  protected final String TEXT_1666 = "(";
  protected final String TEXT_1667 = ", ";
  protected final String TEXT_1668 = ");";
  protected final String TEXT_1669 = NL + "\t\tif (";
  protected final String TEXT_1670 = " != null)";
  protected final String TEXT_1671 = NL + "\t\t\tnew";
  protected final String TEXT_1672 = ".";
  protected final String TEXT_1673 = "().addAll(";
  protected final String TEXT_1674 = ");";
  protected final String TEXT_1675 = NL + "\t\t\tnew";
  protected final String TEXT_1676 = ".set";
  protected final String TEXT_1677 = "(";
  protected final String TEXT_1678 = ");";
  protected final String TEXT_1679 = NL + "\t\treturn new";
  protected final String TEXT_1680 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1681 = NL + "\t/**";
  protected final String TEXT_1682 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1683 = "}, with the specified ";
  protected final String TEXT_1684 = ", and appends it to the '<em><b>";
  protected final String TEXT_1685 = "</b></em>' ";
  protected final String TEXT_1686 = ".";
  protected final String TEXT_1687 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1688 = "},with the specified ";
  protected final String TEXT_1689 = ", and sets the '<em><b>";
  protected final String TEXT_1690 = "</b></em>' ";
  protected final String TEXT_1691 = ".";
  protected final String TEXT_1692 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1693 = "} and appends it to the '<em><b>";
  protected final String TEXT_1694 = "</b></em>' ";
  protected final String TEXT_1695 = ".";
  protected final String TEXT_1696 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1697 = "} and sets the '<em><b>";
  protected final String TEXT_1698 = "</b></em>' ";
  protected final String TEXT_1699 = ".";
  protected final String TEXT_1700 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1701 = NL + "\t * @param ";
  protected final String TEXT_1702 = " The ";
  protected final String TEXT_1703 = " for the new {@link ";
  protected final String TEXT_1704 = "}, or <code>null</code>.";
  protected final String TEXT_1705 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1706 = "}." + NL + "\t * @see #";
  protected final String TEXT_1707 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1708 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1709 = NL + "\t";
  protected final String TEXT_1710 = " create";
  protected final String TEXT_1711 = "(";
  protected final String TEXT_1712 = ");" + NL;
  protected final String TEXT_1713 = NL + "\t@Override";
  protected final String TEXT_1714 = NL + "\tpublic ";
  protected final String TEXT_1715 = " create";
  protected final String TEXT_1716 = "(";
  protected final String TEXT_1717 = ")" + NL + "\t{";
  protected final String TEXT_1718 = NL + "\t\treturn create";
  protected final String TEXT_1719 = "(";
  protected final String TEXT_1720 = ", ";
  protected final String TEXT_1721 = ");";
  protected final String TEXT_1722 = NL + "\t\t";
  protected final String TEXT_1723 = " new";
  protected final String TEXT_1724 = " = (";
  protected final String TEXT_1725 = ") create(";
  protected final String TEXT_1726 = ");";
  protected final String TEXT_1727 = NL + "\t\t";
  protected final String TEXT_1728 = "().add(new";
  protected final String TEXT_1729 = ");";
  protected final String TEXT_1730 = NL + "\t\tset";
  protected final String TEXT_1731 = "(new";
  protected final String TEXT_1732 = ");";
  protected final String TEXT_1733 = NL + "\t\tint ";
  protected final String TEXT_1734 = "ListSize = 0;";
  protected final String TEXT_1735 = NL + "\t\tint ";
  protected final String TEXT_1736 = "Size = ";
  protected final String TEXT_1737 = " == null ? 0 : ";
  protected final String TEXT_1738 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1739 = "Size > ";
  protected final String TEXT_1740 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1741 = "ListSize = ";
  protected final String TEXT_1742 = "Size;";
  protected final String TEXT_1743 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1744 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1745 = ".create";
  protected final String TEXT_1746 = "(";
  protected final String TEXT_1747 = ", ";
  protected final String TEXT_1748 = "i < ";
  protected final String TEXT_1749 = "Size ? (";
  protected final String TEXT_1750 = ") ";
  protected final String TEXT_1751 = ".get(i) : null";
  protected final String TEXT_1752 = ");" + NL + "\t\t}";
  protected final String TEXT_1753 = NL + "\t\tnew";
  protected final String TEXT_1754 = ".create";
  protected final String TEXT_1755 = "(";
  protected final String TEXT_1756 = ", ";
  protected final String TEXT_1757 = ");";
  protected final String TEXT_1758 = NL + "\t\tif (";
  protected final String TEXT_1759 = " != null)";
  protected final String TEXT_1760 = NL + "\t\t\tnew";
  protected final String TEXT_1761 = ".";
  protected final String TEXT_1762 = "().addAll(";
  protected final String TEXT_1763 = ");";
  protected final String TEXT_1764 = NL + "\t\t\tnew";
  protected final String TEXT_1765 = ".set";
  protected final String TEXT_1766 = "(";
  protected final String TEXT_1767 = ");";
  protected final String TEXT_1768 = NL + "\t\treturn new";
  protected final String TEXT_1769 = ";";
  protected final String TEXT_1770 = NL + "\t}" + NL;
  protected final String TEXT_1771 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1772 = "} with the specified ";
  protected final String TEXT_1773 = " from the '<em><b>";
  protected final String TEXT_1774 = "</b></em>' ";
  protected final String TEXT_1775 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1776 = NL + "\t * @param ";
  protected final String TEXT_1777 = " The ";
  protected final String TEXT_1778 = " of the {@link ";
  protected final String TEXT_1779 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1780 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1781 = "} with the specified ";
  protected final String TEXT_1782 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1783 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1784 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1785 = NL + "\t";
  protected final String TEXT_1786 = " get";
  protected final String TEXT_1787 = "(";
  protected final String TEXT_1788 = ");" + NL;
  protected final String TEXT_1789 = NL + "\t@Override";
  protected final String TEXT_1790 = NL + "\tpublic ";
  protected final String TEXT_1791 = " get";
  protected final String TEXT_1792 = "(";
  protected final String TEXT_1793 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1794 = "(";
  protected final String TEXT_1795 = ", false";
  protected final String TEXT_1796 = ", null";
  protected final String TEXT_1797 = ", false";
  protected final String TEXT_1798 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1799 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1800 = "} with the specified ";
  protected final String TEXT_1801 = " from the '<em><b>";
  protected final String TEXT_1802 = "</b></em>' ";
  protected final String TEXT_1803 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1804 = NL + "\t * @param ";
  protected final String TEXT_1805 = " The ";
  protected final String TEXT_1806 = " of the {@link ";
  protected final String TEXT_1807 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1808 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1809 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1810 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1811 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1812 = "} on demand if not found.";
  protected final String TEXT_1813 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1814 = "} with the specified ";
  protected final String TEXT_1815 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1816 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1817 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1818 = NL + "\t";
  protected final String TEXT_1819 = " get";
  protected final String TEXT_1820 = "(";
  protected final String TEXT_1821 = ", boolean ignoreCase";
  protected final String TEXT_1822 = ", ";
  protected final String TEXT_1823 = " eClass";
  protected final String TEXT_1824 = ", boolean createOnDemand";
  protected final String TEXT_1825 = ");" + NL;
  protected final String TEXT_1826 = NL + "\t@Override";
  protected final String TEXT_1827 = NL + "\tpublic ";
  protected final String TEXT_1828 = " get";
  protected final String TEXT_1829 = "(";
  protected final String TEXT_1830 = ", boolean ignoreCase";
  protected final String TEXT_1831 = ", ";
  protected final String TEXT_1832 = " eClass";
  protected final String TEXT_1833 = ", boolean createOnDemand";
  protected final String TEXT_1834 = ")" + NL + "\t{";
  protected final String TEXT_1835 = NL + "\t\t";
  protected final String TEXT_1836 = "Loop: for (";
  protected final String TEXT_1837 = " ";
  protected final String TEXT_1838 = " : ";
  protected final String TEXT_1839 = "())" + NL + "\t\t{";
  protected final String TEXT_1840 = NL + "\t\t";
  protected final String TEXT_1841 = "Loop: for (";
  protected final String TEXT_1842 = " i = ";
  protected final String TEXT_1843 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1844 = " ";
  protected final String TEXT_1845 = " = (";
  protected final String TEXT_1846 = ") i.next();";
  protected final String TEXT_1847 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1848 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1849 = "Loop;";
  protected final String TEXT_1850 = NL + "\t\t\t";
  protected final String TEXT_1851 = " ";
  protected final String TEXT_1852 = "List = ";
  protected final String TEXT_1853 = ".";
  protected final String TEXT_1854 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1855 = "ListSize = ";
  protected final String TEXT_1856 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1857 = " || (";
  protected final String TEXT_1858 = " != null && ";
  protected final String TEXT_1859 = ".size() != ";
  protected final String TEXT_1860 = "ListSize";
  protected final String TEXT_1861 = ")";
  protected final String TEXT_1862 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1863 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1864 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1865 = " ";
  protected final String TEXT_1866 = " = ";
  protected final String TEXT_1867 = "(";
  protected final String TEXT_1868 = ") ";
  protected final String TEXT_1869 = "List.get(j);";
  protected final String TEXT_1870 = NL + "\t\t\t\tif (";
  protected final String TEXT_1871 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1872 = "(";
  protected final String TEXT_1873 = ")";
  protected final String TEXT_1874 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1875 = ".";
  protected final String TEXT_1876 = "()) : ";
  protected final String TEXT_1877 = ".get(j).equals(";
  protected final String TEXT_1878 = ".";
  protected final String TEXT_1879 = "())))";
  protected final String TEXT_1880 = NL + "\t\t\t\tif (";
  protected final String TEXT_1881 = " != null && !";
  protected final String TEXT_1882 = ".get(j).equals(";
  protected final String TEXT_1883 = ".";
  protected final String TEXT_1884 = "()))";
  protected final String TEXT_1885 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1886 = "Loop;";
  protected final String TEXT_1887 = NL + "\t\t\t}";
  protected final String TEXT_1888 = NL + "\t\t\t";
  protected final String TEXT_1889 = " ";
  protected final String TEXT_1890 = " = ";
  protected final String TEXT_1891 = ".";
  protected final String TEXT_1892 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1893 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1894 = "Loop;";
  protected final String TEXT_1895 = NL + "\t\t\tif (";
  protected final String TEXT_1896 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1897 = ".equalsIgnoreCase(";
  protected final String TEXT_1898 = ".";
  protected final String TEXT_1899 = "()) : ";
  protected final String TEXT_1900 = ".equals(";
  protected final String TEXT_1901 = ".";
  protected final String TEXT_1902 = "())))";
  protected final String TEXT_1903 = NL + "\t\t\tif (";
  protected final String TEXT_1904 = " != null && !";
  protected final String TEXT_1905 = ".equals(";
  protected final String TEXT_1906 = ".";
  protected final String TEXT_1907 = "()))";
  protected final String TEXT_1908 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1909 = "Loop;";
  protected final String TEXT_1910 = NL + "\t\t\tif (";
  protected final String TEXT_1911 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1912 = ".equalsIgnoreCase(";
  protected final String TEXT_1913 = ".";
  protected final String TEXT_1914 = "()) : ";
  protected final String TEXT_1915 = ".equals(";
  protected final String TEXT_1916 = ".";
  protected final String TEXT_1917 = "())))";
  protected final String TEXT_1918 = NL + "\t\t\tif (";
  protected final String TEXT_1919 = " != null && !";
  protected final String TEXT_1920 = ".equals(";
  protected final String TEXT_1921 = ".";
  protected final String TEXT_1922 = "()))";
  protected final String TEXT_1923 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1924 = "Loop;";
  protected final String TEXT_1925 = NL + "\t\t\treturn ";
  protected final String TEXT_1926 = ";" + NL + "\t\t}";
  protected final String TEXT_1927 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1928 = " && eClass != null";
  protected final String TEXT_1929 = " ? create";
  protected final String TEXT_1930 = "(";
  protected final String TEXT_1931 = ", eClass";
  protected final String TEXT_1932 = ") : null;";
  protected final String TEXT_1933 = NL + "\t\treturn null;";
  protected final String TEXT_1934 = NL + "\t}" + NL;
  protected final String TEXT_1935 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1936 = "()" + NL + "\t{";
  protected final String TEXT_1937 = NL + "  \t\treturn false;";
  protected final String TEXT_1938 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1939 = ");";
  protected final String TEXT_1940 = NL + "\t\treturn !((";
  protected final String TEXT_1941 = ".Internal.Wrapper)";
  protected final String TEXT_1942 = "()).featureMap().isEmpty();";
  protected final String TEXT_1943 = NL + "\t\treturn ";
  protected final String TEXT_1944 = " != null && !";
  protected final String TEXT_1945 = ".featureMap().isEmpty();";
  protected final String TEXT_1946 = NL + "\t\treturn ";
  protected final String TEXT_1947 = " != null && !";
  protected final String TEXT_1948 = ".isEmpty();";
  protected final String TEXT_1949 = NL + "\t\t";
  protected final String TEXT_1950 = " ";
  protected final String TEXT_1951 = " = (";
  protected final String TEXT_1952 = ")eVirtualGet(";
  protected final String TEXT_1953 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1954 = " != null && !";
  protected final String TEXT_1955 = ".isEmpty();";
  protected final String TEXT_1956 = NL + "\t\treturn !";
  protected final String TEXT_1957 = "().isEmpty();";
  protected final String TEXT_1958 = NL + "\t\treturn ";
  protected final String TEXT_1959 = " != null;";
  protected final String TEXT_1960 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1961 = ") != null;";
  protected final String TEXT_1962 = NL + "\t\treturn basicGet";
  protected final String TEXT_1963 = "() != null;";
  protected final String TEXT_1964 = NL + "\t\treturn ";
  protected final String TEXT_1965 = " != null;";
  protected final String TEXT_1966 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1967 = ") != null;";
  protected final String TEXT_1968 = NL + "\t\treturn ";
  protected final String TEXT_1969 = "() != null;";
  protected final String TEXT_1970 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1971 = " & ";
  protected final String TEXT_1972 = "_EFLAG) != 0) != ";
  protected final String TEXT_1973 = ";";
  protected final String TEXT_1974 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1975 = " & ";
  protected final String TEXT_1976 = "_EFLAG) != ";
  protected final String TEXT_1977 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1978 = NL + "\t\treturn ";
  protected final String TEXT_1979 = " != ";
  protected final String TEXT_1980 = ";";
  protected final String TEXT_1981 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1982 = ", ";
  protected final String TEXT_1983 = ") != ";
  protected final String TEXT_1984 = ";";
  protected final String TEXT_1985 = NL + "\t\treturn ";
  protected final String TEXT_1986 = "() != ";
  protected final String TEXT_1987 = ";";
  protected final String TEXT_1988 = NL + "\t\treturn ";
  protected final String TEXT_1989 = " == null ? ";
  protected final String TEXT_1990 = " != null : !";
  protected final String TEXT_1991 = ".equals(";
  protected final String TEXT_1992 = ");";
  protected final String TEXT_1993 = NL + "\t\t";
  protected final String TEXT_1994 = " ";
  protected final String TEXT_1995 = " = (";
  protected final String TEXT_1996 = ")eVirtualGet(";
  protected final String TEXT_1997 = ", ";
  protected final String TEXT_1998 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1999 = " == null ? ";
  protected final String TEXT_2000 = " != null : !";
  protected final String TEXT_2001 = ".equals(";
  protected final String TEXT_2002 = ");";
  protected final String TEXT_2003 = NL + "\t\treturn ";
  protected final String TEXT_2004 = " == null ? ";
  protected final String TEXT_2005 = "() != null : !";
  protected final String TEXT_2006 = ".equals(";
  protected final String TEXT_2007 = "());";
  protected final String TEXT_2008 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2009 = ");";
  protected final String TEXT_2010 = NL + "\t\t";
  protected final String TEXT_2011 = " ";
  protected final String TEXT_2012 = " = (";
  protected final String TEXT_2013 = ")eVirtualGet(";
  protected final String TEXT_2014 = ");";
  protected final String TEXT_2015 = NL + "\t\treturn ";
  protected final String TEXT_2016 = " != null && ((";
  protected final String TEXT_2017 = ".Unsettable";
  protected final String TEXT_2018 = ")";
  protected final String TEXT_2019 = ").isSet();";
  protected final String TEXT_2020 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2021 = ");";
  protected final String TEXT_2022 = NL + "\t\treturn (";
  protected final String TEXT_2023 = " & ";
  protected final String TEXT_2024 = "_ESETFLAG) != 0;";
  protected final String TEXT_2025 = NL + "\t\treturn ";
  protected final String TEXT_2026 = "ESet;";
  protected final String TEXT_2027 = NL + "\t\treturn !((";
  protected final String TEXT_2028 = ".Internal)((";
  protected final String TEXT_2029 = ".Internal.Wrapper)get";
  protected final String TEXT_2030 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2031 = ");";
  protected final String TEXT_2032 = NL + "\t\treturn !((";
  protected final String TEXT_2033 = ".Internal)get";
  protected final String TEXT_2034 = "()).isEmpty(";
  protected final String TEXT_2035 = ");";
  protected final String TEXT_2036 = NL + "\t\treturn ";
  protected final String TEXT_2037 = ".";
  protected final String TEXT_2038 = "(this);";
  protected final String TEXT_2039 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2040 = "' ";
  protected final String TEXT_2041 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2042 = NL + "\t}" + NL;
  protected final String TEXT_2043 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_2044 = "(";
  protected final String TEXT_2045 = ") <em>";
  protected final String TEXT_2046 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2047 = "(";
  protected final String TEXT_2048 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2049 = " ";
  protected final String TEXT_2050 = "__EOCL_EXP = \"";
  protected final String TEXT_2051 = "\";";
  protected final String TEXT_2052 = NL;
  protected final String TEXT_2053 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_2054 = "(";
  protected final String TEXT_2055 = ") <em>";
  protected final String TEXT_2056 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2057 = "(";
  protected final String TEXT_2058 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_2059 = " ";
  protected final String TEXT_2060 = "__EOCL_INV;" + NL;
  protected final String TEXT_2061 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_2062 = "(";
  protected final String TEXT_2063 = ") <em>";
  protected final String TEXT_2064 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2065 = "(";
  protected final String TEXT_2066 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_2067 = "<";
  protected final String TEXT_2068 = ">";
  protected final String TEXT_2069 = " ";
  protected final String TEXT_2070 = "__EOCL_QRY;" + NL;
  protected final String TEXT_2071 = NL + "\t/**" + NL + "\t * The cached validation expression for the '{@link #";
  protected final String TEXT_2072 = "(";
  protected final String TEXT_2073 = ") <em>";
  protected final String TEXT_2074 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2075 = "(";
  protected final String TEXT_2076 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2077 = " ";
  protected final String TEXT_2078 = "__EEXPRESSION = \"";
  protected final String TEXT_2079 = "\";";
  protected final String TEXT_2080 = NL;
  protected final String TEXT_2081 = NL + "\t/**" + NL + "\t * The cached invocation delegate for the '{@link #";
  protected final String TEXT_2082 = "(";
  protected final String TEXT_2083 = ") <em>";
  protected final String TEXT_2084 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2085 = "(";
  protected final String TEXT_2086 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2087 = ".Internal.InvocationDelegate ";
  protected final String TEXT_2088 = "__EINVOCATION_DELEGATE = ((";
  protected final String TEXT_2089 = ".Internal)";
  protected final String TEXT_2090 = ").getInvocationDelegate();" + NL;
  protected final String TEXT_2091 = NL + "\t/**";
  protected final String TEXT_2092 = NL + "\t * <p>" + NL + "\t * This operation redefines the following operations:" + NL + "\t * <ul>";
  protected final String TEXT_2093 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_2094 = "#";
  protected final String TEXT_2095 = "(";
  protected final String TEXT_2096 = ") <em>";
  protected final String TEXT_2097 = "</em>}' </li>";
  protected final String TEXT_2098 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_2099 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2100 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_2101 = NL + "\t * ";
  protected final String TEXT_2102 = NL + "\t * @param ";
  protected final String TEXT_2103 = NL + "\t *   ";
  protected final String TEXT_2104 = NL + "\t * @param ";
  protected final String TEXT_2105 = " ";
  protected final String TEXT_2106 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_2107 = NL + "\t * @model ";
  protected final String TEXT_2108 = NL + "\t *        ";
  protected final String TEXT_2109 = NL + "\t * @model";
  protected final String TEXT_2110 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2111 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2112 = NL + "\t@Override";
  protected final String TEXT_2113 = NL + "\t";
  protected final String TEXT_2114 = " ";
  protected final String TEXT_2115 = "(";
  protected final String TEXT_2116 = ")";
  protected final String TEXT_2117 = ";" + NL;
  protected final String TEXT_2118 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2119 = NL + "\tpublic ";
  protected final String TEXT_2120 = " ";
  protected final String TEXT_2121 = "(";
  protected final String TEXT_2122 = ")";
  protected final String TEXT_2123 = NL + "\t{";
  protected final String TEXT_2124 = NL + "\t\t";
  protected final String TEXT_2125 = NL + "\t\treturn" + NL + "\t\t\t";
  protected final String TEXT_2126 = ".validate" + NL + "\t\t\t\t(";
  protected final String TEXT_2127 = "," + NL + "\t\t\t\t this," + NL + "\t\t\t\t ";
  protected final String TEXT_2128 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_2129 = "," + NL + "\t\t\t\t \"";
  protected final String TEXT_2130 = "\",";
  protected final String TEXT_2131 = NL + "\t\t\t\t ";
  protected final String TEXT_2132 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_2133 = "__EEXPRESSION," + NL + "\t\t\t\t ";
  protected final String TEXT_2134 = ".ERROR," + NL + "\t\t\t\t ";
  protected final String TEXT_2135 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t ";
  protected final String TEXT_2136 = ".";
  protected final String TEXT_2137 = ");";
  protected final String TEXT_2138 = NL + "\t\treturn ";
  protected final String TEXT_2139 = ".";
  protected final String TEXT_2140 = "(this, ";
  protected final String TEXT_2141 = ", ";
  protected final String TEXT_2142 = ");";
  protected final String TEXT_2143 = NL + "\t\tif (";
  protected final String TEXT_2144 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2145 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_2146 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2147 = " = helper.createInvariant(";
  protected final String TEXT_2148 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2149 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_2150 = ").check(this))";
  protected final String TEXT_2151 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_2152 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_2153 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_2154 = NL + "\t\t\t\t";
  protected final String TEXT_2155 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_2156 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_2157 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2158 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2159 = ".";
  protected final String TEXT_2160 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2161 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_2162 = "\", ";
  protected final String TEXT_2163 = ".getObjectLabel(this, ";
  protected final String TEXT_2164 = ") }),";
  protected final String TEXT_2165 = NL + "\t\t\t\t\t\t new Object [] { this }));";
  protected final String TEXT_2166 = NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_2167 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_2168 = NL + "\t\t\t";
  protected final String TEXT_2169 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_2170 = "new ";
  protected final String TEXT_2171 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_2172 = ", ";
  protected final String TEXT_2173 = ")";
  protected final String TEXT_2174 = "null";
  protected final String TEXT_2175 = ");";
  protected final String TEXT_2176 = NL + "\t\t\treturn ";
  protected final String TEXT_2177 = "(";
  protected final String TEXT_2178 = "(";
  protected final String TEXT_2179 = ")";
  protected final String TEXT_2180 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_2181 = "new ";
  protected final String TEXT_2182 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_2183 = ", ";
  protected final String TEXT_2184 = ")";
  protected final String TEXT_2185 = "null";
  protected final String TEXT_2186 = ")";
  protected final String TEXT_2187 = ").";
  protected final String TEXT_2188 = "()";
  protected final String TEXT_2189 = ";";
  protected final String TEXT_2190 = NL + "\t\t}" + NL + "\t\tcatch (";
  protected final String TEXT_2191 = " ite)" + NL + "\t\t{" + NL + "\t\t\tthrow new ";
  protected final String TEXT_2192 = "(ite);" + NL + "\t\t}";
  protected final String TEXT_2193 = NL + "\t\t";
  protected final String TEXT_2194 = ".";
  protected final String TEXT_2195 = "(this";
  protected final String TEXT_2196 = ", ";
  protected final String TEXT_2197 = ");";
  protected final String TEXT_2198 = NL + "\t\t";
  protected final String TEXT_2199 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_2200 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2201 = NL + "\t\t\t";
  protected final String TEXT_2202 = " result = (";
  protected final String TEXT_2203 = ") cache.get(";
  protected final String TEXT_2204 = "eResource(), ";
  protected final String TEXT_2205 = "this, ";
  protected final String TEXT_2206 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_2207 = "eResource(), ";
  protected final String TEXT_2208 = "this, ";
  protected final String TEXT_2209 = ", result = ";
  protected final String TEXT_2210 = "new ";
  protected final String TEXT_2211 = "(";
  protected final String TEXT_2212 = ".";
  protected final String TEXT_2213 = "(this";
  protected final String TEXT_2214 = ", ";
  protected final String TEXT_2215 = ")";
  protected final String TEXT_2216 = ")";
  protected final String TEXT_2217 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_2218 = ".";
  protected final String TEXT_2219 = "()";
  protected final String TEXT_2220 = ";" + NL + "\t\t}";
  protected final String TEXT_2221 = NL + "\t\treturn ";
  protected final String TEXT_2222 = ".";
  protected final String TEXT_2223 = "(this";
  protected final String TEXT_2224 = ", ";
  protected final String TEXT_2225 = ");";
  protected final String TEXT_2226 = NL + "\t\tif (";
  protected final String TEXT_2227 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2228 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_2229 = ", ";
  protected final String TEXT_2230 = ".getEAllOperations().get(";
  protected final String TEXT_2231 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2232 = " = helper.createQuery(";
  protected final String TEXT_2233 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2234 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_2235 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_2236 = ");";
  protected final String TEXT_2237 = NL + "\t\t";
  protected final String TEXT_2238 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_2239 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_2240 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_2241 = "\", ";
  protected final String TEXT_2242 = ");";
  protected final String TEXT_2243 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2244 = NL + "\t\t";
  protected final String TEXT_2245 = "<";
  protected final String TEXT_2246 = "> result = (";
  protected final String TEXT_2247 = "<";
  protected final String TEXT_2248 = ">) query.evaluate(this);" + NL + "\t\treturn new ";
  protected final String TEXT_2249 = ".UnmodifiableEList<";
  protected final String TEXT_2250 = ">(result.size(), result.toArray());";
  protected final String TEXT_2251 = NL + "\t\treturn ((";
  protected final String TEXT_2252 = ") query.evaluate(this)).";
  protected final String TEXT_2253 = "();";
  protected final String TEXT_2254 = NL + "\t\treturn (";
  protected final String TEXT_2255 = ") query.evaluate(this);";
  protected final String TEXT_2256 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2257 = NL + "\t}" + NL;
  protected final String TEXT_2258 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2259 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2260 = NL + "\t@Override";
  protected final String TEXT_2261 = NL + "\tpublic ";
  protected final String TEXT_2262 = " eInverseAdd(";
  protected final String TEXT_2263 = " otherEnd, int featureID, ";
  protected final String TEXT_2264 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2265 = ")" + NL + "\t\t{";
  protected final String TEXT_2266 = NL + "\t\t\tcase ";
  protected final String TEXT_2267 = ":";
  protected final String TEXT_2268 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2269 = "(";
  protected final String TEXT_2270 = ".InternalMapView";
  protected final String TEXT_2271 = ")";
  protected final String TEXT_2272 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2273 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2274 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2275 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2276 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2277 = "((";
  protected final String TEXT_2278 = ")otherEnd, msgs);";
  protected final String TEXT_2279 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_2280 = ", msgs);";
  protected final String TEXT_2281 = NL + "\t\t\t\t";
  protected final String TEXT_2282 = " ";
  protected final String TEXT_2283 = " = (";
  protected final String TEXT_2284 = ")eVirtualGet(";
  protected final String TEXT_2285 = ");";
  protected final String TEXT_2286 = NL + "\t\t\t\t";
  protected final String TEXT_2287 = " ";
  protected final String TEXT_2288 = " = ";
  protected final String TEXT_2289 = "basicGet";
  protected final String TEXT_2290 = "();";
  protected final String TEXT_2291 = NL + "\t\t\t\tif (";
  protected final String TEXT_2292 = " != null)";
  protected final String TEXT_2293 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2294 = ")";
  protected final String TEXT_2295 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_2296 = ", null, msgs);";
  protected final String TEXT_2297 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2298 = ")";
  protected final String TEXT_2299 = ").eInverseRemove(this, ";
  protected final String TEXT_2300 = ", ";
  protected final String TEXT_2301 = ".class, msgs);";
  protected final String TEXT_2302 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2303 = "((";
  protected final String TEXT_2304 = ")otherEnd, msgs);";
  protected final String TEXT_2305 = NL + "\t\t}";
  protected final String TEXT_2306 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2307 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2308 = NL + "\t}" + NL;
  protected final String TEXT_2309 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2310 = NL + "\t@Override";
  protected final String TEXT_2311 = NL + "\tpublic ";
  protected final String TEXT_2312 = " eInverseRemove(";
  protected final String TEXT_2313 = " otherEnd, int featureID, ";
  protected final String TEXT_2314 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2315 = ")" + NL + "\t\t{";
  protected final String TEXT_2316 = NL + "\t\t\tcase ";
  protected final String TEXT_2317 = ":";
  protected final String TEXT_2318 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2319 = ")((";
  protected final String TEXT_2320 = ".InternalMapView";
  protected final String TEXT_2321 = ")";
  protected final String TEXT_2322 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2323 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2324 = ")((";
  protected final String TEXT_2325 = ".Internal.Wrapper)";
  protected final String TEXT_2326 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2327 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2328 = ")";
  protected final String TEXT_2329 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2330 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_2331 = ", msgs);";
  protected final String TEXT_2332 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_2333 = "(msgs);";
  protected final String TEXT_2334 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2335 = "(null, msgs);";
  protected final String TEXT_2336 = NL + "\t\t}";
  protected final String TEXT_2337 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2338 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2339 = NL + "\t}" + NL;
  protected final String TEXT_2340 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2341 = NL + "\t@Override";
  protected final String TEXT_2342 = NL + "\tpublic ";
  protected final String TEXT_2343 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_2344 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID()";
  protected final String TEXT_2345 = ")" + NL + "\t\t{";
  protected final String TEXT_2346 = NL + "\t\t\tcase ";
  protected final String TEXT_2347 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_2348 = ", ";
  protected final String TEXT_2349 = ".class, msgs);";
  protected final String TEXT_2350 = NL + "\t\t}";
  protected final String TEXT_2351 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_2352 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2353 = NL + "\t}" + NL;
  protected final String TEXT_2354 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2355 = NL + "\t@Override";
  protected final String TEXT_2356 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2357 = ")" + NL + "\t\t{";
  protected final String TEXT_2358 = NL + "\t\t\tcase ";
  protected final String TEXT_2359 = ":";
  protected final String TEXT_2360 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2361 = "();";
  protected final String TEXT_2362 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2363 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_2364 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_2365 = "(";
  protected final String TEXT_2366 = "());";
  protected final String TEXT_2367 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_2368 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2369 = "();";
  protected final String TEXT_2370 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2371 = ".InternalMapView";
  protected final String TEXT_2372 = ")";
  protected final String TEXT_2373 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2374 = "();";
  protected final String TEXT_2375 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2376 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2377 = "().map();";
  protected final String TEXT_2378 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2379 = ".Internal.Wrapper)";
  protected final String TEXT_2380 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2381 = "();";
  protected final String TEXT_2382 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2383 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_2384 = ".Internal)";
  protected final String TEXT_2385 = "()).getWrapper();";
  protected final String TEXT_2386 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2387 = "();";
  protected final String TEXT_2388 = NL + "\t\t}";
  protected final String TEXT_2389 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_2390 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_2391 = NL + "\t}" + NL;
  protected final String TEXT_2392 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2393 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2394 = NL + "\t@Override";
  protected final String TEXT_2395 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2396 = ")" + NL + "\t\t{";
  protected final String TEXT_2397 = NL + "\t\t\tcase ";
  protected final String TEXT_2398 = ":";
  protected final String TEXT_2399 = NL + "\t\t\t\t((";
  protected final String TEXT_2400 = ".Internal)((";
  protected final String TEXT_2401 = ".Internal.Wrapper)";
  protected final String TEXT_2402 = "()).featureMap()).set(newValue);";
  protected final String TEXT_2403 = NL + "\t\t\t\t((";
  protected final String TEXT_2404 = ".Internal)";
  protected final String TEXT_2405 = "()).set(newValue);";
  protected final String TEXT_2406 = NL + "\t\t\t\t((";
  protected final String TEXT_2407 = ".Setting)((";
  protected final String TEXT_2408 = ".InternalMapView";
  protected final String TEXT_2409 = ")";
  protected final String TEXT_2410 = "()).eMap()).set(newValue);";
  protected final String TEXT_2411 = NL + "\t\t\t\t((";
  protected final String TEXT_2412 = ".Setting)";
  protected final String TEXT_2413 = "()).set(newValue);";
  protected final String TEXT_2414 = NL + "\t\t\t\t";
  protected final String TEXT_2415 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_2416 = "().addAll((";
  protected final String TEXT_2417 = "<? extends ";
  protected final String TEXT_2418 = ">";
  protected final String TEXT_2419 = ")newValue);";
  protected final String TEXT_2420 = NL + "\t\t\t\tset";
  protected final String TEXT_2421 = "(((";
  protected final String TEXT_2422 = ")newValue).";
  protected final String TEXT_2423 = "());";
  protected final String TEXT_2424 = NL + "\t\t\t\tset";
  protected final String TEXT_2425 = "(";
  protected final String TEXT_2426 = "(";
  protected final String TEXT_2427 = ")";
  protected final String TEXT_2428 = "newValue);";
  protected final String TEXT_2429 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2430 = NL + "\t\t}";
  protected final String TEXT_2431 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_2432 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_2433 = NL + "\t}" + NL;
  protected final String TEXT_2434 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2435 = NL + "\t@Override";
  protected final String TEXT_2436 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2437 = ")" + NL + "\t\t{";
  protected final String TEXT_2438 = NL + "\t\t\tcase ";
  protected final String TEXT_2439 = ":";
  protected final String TEXT_2440 = NL + "\t\t\t\t((";
  protected final String TEXT_2441 = ".Internal.Wrapper)";
  protected final String TEXT_2442 = "()).featureMap().clear();";
  protected final String TEXT_2443 = NL + "\t\t\t\t";
  protected final String TEXT_2444 = "().clear();";
  protected final String TEXT_2445 = NL + "\t\t\t\tunset";
  protected final String TEXT_2446 = "();";
  protected final String TEXT_2447 = NL + "\t\t\t\tset";
  protected final String TEXT_2448 = "((";
  protected final String TEXT_2449 = ")null);";
  protected final String TEXT_2450 = NL + "\t\t\t\t";
  protected final String TEXT_2451 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_2452 = NL + "\t\t\t\tset";
  protected final String TEXT_2453 = "(";
  protected final String TEXT_2454 = ");";
  protected final String TEXT_2455 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2456 = NL + "\t\t}";
  protected final String TEXT_2457 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_2458 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_2459 = NL + "\t}" + NL;
  protected final String TEXT_2460 = NL;
  protected final String TEXT_2461 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2462 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2463 = NL + "\t@Override";
  protected final String TEXT_2464 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_2465 = NL + "\t\t\tcase ";
  protected final String TEXT_2466 = ":";
  protected final String TEXT_2467 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2468 = "();";
  protected final String TEXT_2469 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2470 = "();";
  protected final String TEXT_2471 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2472 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_2473 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_2474 = ".Internal.Wrapper)";
  protected final String TEXT_2475 = "()).featureMap().isEmpty();";
  protected final String TEXT_2476 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2477 = " != null && !";
  protected final String TEXT_2478 = ".featureMap().isEmpty();";
  protected final String TEXT_2479 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2480 = " != null && !";
  protected final String TEXT_2481 = ".isEmpty();";
  protected final String TEXT_2482 = NL + "\t\t\t\t";
  protected final String TEXT_2483 = " ";
  protected final String TEXT_2484 = " = (";
  protected final String TEXT_2485 = ")eVirtualGet(";
  protected final String TEXT_2486 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2487 = " != null && !";
  protected final String TEXT_2488 = ".isEmpty();";
  protected final String TEXT_2489 = NL + "\t\t\t\treturn !";
  protected final String TEXT_2490 = "().isEmpty();";
  protected final String TEXT_2491 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2492 = "();";
  protected final String TEXT_2493 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2494 = " != null;";
  protected final String TEXT_2495 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2496 = ") != null;";
  protected final String TEXT_2497 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2498 = "() != null;";
  protected final String TEXT_2499 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2500 = " != null;";
  protected final String TEXT_2501 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2502 = ") != null;";
  protected final String TEXT_2503 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2504 = "() != null;";
  protected final String TEXT_2505 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2506 = " & ";
  protected final String TEXT_2507 = "_EFLAG) != 0) != ";
  protected final String TEXT_2508 = ";";
  protected final String TEXT_2509 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2510 = " & ";
  protected final String TEXT_2511 = "_EFLAG) != ";
  protected final String TEXT_2512 = "_EFLAG_DEFAULT;";
  protected final String TEXT_2513 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2514 = " != ";
  protected final String TEXT_2515 = ";";
  protected final String TEXT_2516 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2517 = ", ";
  protected final String TEXT_2518 = ") != ";
  protected final String TEXT_2519 = ";";
  protected final String TEXT_2520 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2521 = "() != ";
  protected final String TEXT_2522 = ";";
  protected final String TEXT_2523 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2524 = " == null ? ";
  protected final String TEXT_2525 = " != null : !";
  protected final String TEXT_2526 = ".equals(";
  protected final String TEXT_2527 = ");";
  protected final String TEXT_2528 = NL + "\t\t\t\t";
  protected final String TEXT_2529 = " ";
  protected final String TEXT_2530 = " = (";
  protected final String TEXT_2531 = ")eVirtualGet(";
  protected final String TEXT_2532 = ", ";
  protected final String TEXT_2533 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2534 = " == null ? ";
  protected final String TEXT_2535 = " != null : !";
  protected final String TEXT_2536 = ".equals(";
  protected final String TEXT_2537 = ");";
  protected final String TEXT_2538 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2539 = " == null ? ";
  protected final String TEXT_2540 = "() != null : !";
  protected final String TEXT_2541 = ".equals(";
  protected final String TEXT_2542 = "());";
  protected final String TEXT_2543 = NL + "\t\t}";
  protected final String TEXT_2544 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2545 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2546 = NL + "\t}" + NL;
  protected final String TEXT_2547 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2548 = NL + "\t@Override";
  protected final String TEXT_2549 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2550 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2551 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2552 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_2553 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2554 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2555 = ": return ";
  protected final String TEXT_2556 = ";";
  protected final String TEXT_2557 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2558 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_2559 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2560 = NL + "\t@Override";
  protected final String TEXT_2561 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2562 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2563 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2564 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2565 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2566 = ": return ";
  protected final String TEXT_2567 = ";";
  protected final String TEXT_2568 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2569 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2570 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_2571 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2572 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2573 = ": return ";
  protected final String TEXT_2574 = ";";
  protected final String TEXT_2575 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2576 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2577 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2578 = NL + "\t@Override";
  protected final String TEXT_2579 = NL + "\tpublic int eDerivedOperationID(int baseOperationID, Class";
  protected final String TEXT_2580 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2581 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2582 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_2583 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2584 = ": return ";
  protected final String TEXT_2585 = ";";
  protected final String TEXT_2586 = NL + "\t\t\t\tdefault: return super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2587 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2588 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_2589 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2590 = ": return ";
  protected final String TEXT_2591 = ";";
  protected final String TEXT_2592 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2593 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2594 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID";
  protected final String TEXT_2595 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2596 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2597 = ": return ";
  protected final String TEXT_2598 = ";";
  protected final String TEXT_2599 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2600 = NL + "\t\treturn super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2601 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2602 = NL + "\t@Override";
  protected final String TEXT_2603 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2604 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2605 = NL + "\t@Override";
  protected final String TEXT_2606 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2607 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2608 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2609 = NL + "\t@Override";
  protected final String TEXT_2610 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2611 = NL + "\t\t\tcase ";
  protected final String TEXT_2612 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2613 = ";";
  protected final String TEXT_2614 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2615 = NL + "\t@Override";
  protected final String TEXT_2616 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2617 = NL + "\t\t\tcase ";
  protected final String TEXT_2618 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2619 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2620 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2621 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2622 = NL + "\t@Override";
  protected final String TEXT_2623 = NL + "\t@SuppressWarnings(";
  protected final String TEXT_2624 = "\"unchecked\"";
  protected final String TEXT_2625 = "{\"rawtypes\", \"unchecked\" }";
  protected final String TEXT_2626 = ")";
  protected final String TEXT_2627 = NL + "\tpublic Object eInvoke(int operationID, ";
  protected final String TEXT_2628 = " arguments) throws ";
  protected final String TEXT_2629 = NL + "\t{" + NL + "\t\tswitch (operationID";
  protected final String TEXT_2630 = ")" + NL + "\t\t{";
  protected final String TEXT_2631 = NL + "\t\t\tcase ";
  protected final String TEXT_2632 = ":";
  protected final String TEXT_2633 = NL + "\t\t\t\ttry" + NL + "\t\t\t\t{";
  protected final String TEXT_2634 = NL + "\t\t\t\t";
  protected final String TEXT_2635 = "(";
  protected final String TEXT_2636 = "(";
  protected final String TEXT_2637 = "(";
  protected final String TEXT_2638 = ")";
  protected final String TEXT_2639 = "arguments.get(";
  protected final String TEXT_2640 = ")";
  protected final String TEXT_2641 = ").";
  protected final String TEXT_2642 = "()";
  protected final String TEXT_2643 = ", ";
  protected final String TEXT_2644 = ");" + NL + "\t\t\t\t";
  protected final String TEXT_2645 = "return null;";
  protected final String TEXT_2646 = NL + "\t\t\t\t";
  protected final String TEXT_2647 = "return ";
  protected final String TEXT_2648 = "new ";
  protected final String TEXT_2649 = "(";
  protected final String TEXT_2650 = "(";
  protected final String TEXT_2651 = "(";
  protected final String TEXT_2652 = "(";
  protected final String TEXT_2653 = ")";
  protected final String TEXT_2654 = "arguments.get(";
  protected final String TEXT_2655 = ")";
  protected final String TEXT_2656 = ").";
  protected final String TEXT_2657 = "()";
  protected final String TEXT_2658 = ", ";
  protected final String TEXT_2659 = ")";
  protected final String TEXT_2660 = ")";
  protected final String TEXT_2661 = ";";
  protected final String TEXT_2662 = NL + "\t\t\t\t}" + NL + "\t\t\t\tcatch (";
  protected final String TEXT_2663 = " throwable)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tthrow new ";
  protected final String TEXT_2664 = "(throwable);" + NL + "\t\t\t\t}";
  protected final String TEXT_2665 = NL + "\t\t}";
  protected final String TEXT_2666 = NL + "\t\treturn super.eInvoke(operationID, arguments);";
  protected final String TEXT_2667 = NL + "\t\treturn eDynamicInvoke(operationID, arguments);";
  protected final String TEXT_2668 = NL + "\t}" + NL;
  protected final String TEXT_2669 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2670 = NL + "\t@Override";
  protected final String TEXT_2671 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2672 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2673 = ": \");";
  protected final String TEXT_2674 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2675 = ": \");";
  protected final String TEXT_2676 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2677 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2678 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2679 = NL + "\t\tif (";
  protected final String TEXT_2680 = "(";
  protected final String TEXT_2681 = " & ";
  protected final String TEXT_2682 = "_ESETFLAG) != 0";
  protected final String TEXT_2683 = "ESet";
  protected final String TEXT_2684 = ") result.append((";
  protected final String TEXT_2685 = " & ";
  protected final String TEXT_2686 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2687 = NL + "\t\tif (";
  protected final String TEXT_2688 = "(";
  protected final String TEXT_2689 = " & ";
  protected final String TEXT_2690 = "_ESETFLAG) != 0";
  protected final String TEXT_2691 = "ESet";
  protected final String TEXT_2692 = ") result.append(";
  protected final String TEXT_2693 = "_EFLAG_VALUES[(";
  protected final String TEXT_2694 = " & ";
  protected final String TEXT_2695 = "_EFLAG) >>> ";
  protected final String TEXT_2696 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_2697 = NL + "\t\tif (";
  protected final String TEXT_2698 = "(";
  protected final String TEXT_2699 = " & ";
  protected final String TEXT_2700 = "_ESETFLAG) != 0";
  protected final String TEXT_2701 = "ESet";
  protected final String TEXT_2702 = ") result.append(";
  protected final String TEXT_2703 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2704 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2705 = ", ";
  protected final String TEXT_2706 = "));";
  protected final String TEXT_2707 = NL + "\t\tresult.append((";
  protected final String TEXT_2708 = " & ";
  protected final String TEXT_2709 = "_EFLAG) != 0);";
  protected final String TEXT_2710 = NL + "\t\tresult.append(";
  protected final String TEXT_2711 = "_EFLAG_VALUES[(";
  protected final String TEXT_2712 = " & ";
  protected final String TEXT_2713 = "_EFLAG) >>> ";
  protected final String TEXT_2714 = "_EFLAG_OFFSET]);";
  protected final String TEXT_2715 = NL + "\t\tresult.append(";
  protected final String TEXT_2716 = ");";
  protected final String TEXT_2717 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2718 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2719 = NL + "\t@";
  protected final String TEXT_2720 = NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2721 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2722 = " getKey()" + NL + "\t{";
  protected final String TEXT_2723 = NL + "\t\treturn new ";
  protected final String TEXT_2724 = "(getTypedKey());";
  protected final String TEXT_2725 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2726 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2727 = " key)" + NL + "\t{";
  protected final String TEXT_2728 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2729 = "(";
  protected final String TEXT_2730 = ")";
  protected final String TEXT_2731 = "key);";
  protected final String TEXT_2732 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2733 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2734 = ")key).";
  protected final String TEXT_2735 = "());";
  protected final String TEXT_2736 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2737 = ")key);";
  protected final String TEXT_2738 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2739 = " getValue()" + NL + "\t{";
  protected final String TEXT_2740 = NL + "\t\treturn new ";
  protected final String TEXT_2741 = "(getTypedValue());";
  protected final String TEXT_2742 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2743 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2744 = " setValue(";
  protected final String TEXT_2745 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2746 = " oldValue = getValue();";
  protected final String TEXT_2747 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2748 = "(";
  protected final String TEXT_2749 = ")";
  protected final String TEXT_2750 = "value);";
  protected final String TEXT_2751 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2752 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2753 = ")value).";
  protected final String TEXT_2754 = "());";
  protected final String TEXT_2755 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2756 = ")value);";
  protected final String TEXT_2757 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2758 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2759 = NL + "\tpublic ";
  protected final String TEXT_2760 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2761 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2762 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2763 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2764 = " EOCL_ENV = ";
  protected final String TEXT_2765 = ".newInstance();" + NL;
  protected final String TEXT_2766 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2767 = " create(";
  protected final String TEXT_2768 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2769 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2770 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2771 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2772 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2773 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2774 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2775 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2776 = NL + "\t@Override";
  protected final String TEXT_2777 = NL + "\tprotected ";
  protected final String TEXT_2778 = " ";
  protected final String TEXT_2779 = "Helper(";
  protected final String TEXT_2780 = " ";
  protected final String TEXT_2781 = ")" + NL + "\t{";
  protected final String TEXT_2782 = NL + "\t\t";
  protected final String TEXT_2783 = ".addAll(super.";
  protected final String TEXT_2784 = "());";
  protected final String TEXT_2785 = NL + "\t\tsuper.";
  protected final String TEXT_2786 = "Helper(";
  protected final String TEXT_2787 = ");";
  protected final String TEXT_2788 = NL + "\t\tif (isSet";
  protected final String TEXT_2789 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2790 = "<";
  protected final String TEXT_2791 = ">";
  protected final String TEXT_2792 = " i = ((";
  protected final String TEXT_2793 = ") ";
  protected final String TEXT_2794 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2795 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2796 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2797 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2798 = "<";
  protected final String TEXT_2799 = ">";
  protected final String TEXT_2800 = " i = ((";
  protected final String TEXT_2801 = ") ";
  protected final String TEXT_2802 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2803 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2804 = NL + "\t\t";
  protected final String TEXT_2805 = " ";
  protected final String TEXT_2806 = " = ";
  protected final String TEXT_2807 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2808 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2809 = "<";
  protected final String TEXT_2810 = ">";
  protected final String TEXT_2811 = " i = ((";
  protected final String TEXT_2812 = ") ";
  protected final String TEXT_2813 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2814 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2815 = NL + "\t\tif (isSet";
  protected final String TEXT_2816 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2817 = ".addAll(";
  protected final String TEXT_2818 = "());" + NL + "\t\t}";
  protected final String TEXT_2819 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2820 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2821 = ".addAll(";
  protected final String TEXT_2822 = "());" + NL + "\t\t}";
  protected final String TEXT_2823 = NL + "\t\t";
  protected final String TEXT_2824 = " ";
  protected final String TEXT_2825 = " = ";
  protected final String TEXT_2826 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2827 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2828 = ".addAll(";
  protected final String TEXT_2829 = ");" + NL + "\t\t}";
  protected final String TEXT_2830 = NL + "\t\tif (isSet";
  protected final String TEXT_2831 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2832 = ".add(";
  protected final String TEXT_2833 = "basicGet";
  protected final String TEXT_2834 = "());" + NL + "\t\t}";
  protected final String TEXT_2835 = NL + "\t\t";
  protected final String TEXT_2836 = " ";
  protected final String TEXT_2837 = " = ";
  protected final String TEXT_2838 = "basicGet";
  protected final String TEXT_2839 = "();" + NL + "\t\tif (";
  protected final String TEXT_2840 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2841 = ".add(";
  protected final String TEXT_2842 = ");" + NL + "\t\t}";
  protected final String TEXT_2843 = NL + "\t\treturn ";
  protected final String TEXT_2844 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2845 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2846 = NL + "\t@Override";
  protected final String TEXT_2847 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2848 = "()" + NL + "\t{";
  protected final String TEXT_2849 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2850 = "()";
  protected final String TEXT_2851 = NL + "\t\treturn isSet";
  protected final String TEXT_2852 = "()";
  protected final String TEXT_2853 = ";";
  protected final String TEXT_2854 = NL + "\t\treturn !";
  protected final String TEXT_2855 = "().isEmpty()";
  protected final String TEXT_2856 = ";";
  protected final String TEXT_2857 = NL + "\t\treturn ";
  protected final String TEXT_2858 = "basicGet";
  protected final String TEXT_2859 = "() != null";
  protected final String TEXT_2860 = ";";
  protected final String TEXT_2861 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2862 = ")";
  protected final String TEXT_2863 = ";";
  protected final String TEXT_2864 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2865 = "()";
  protected final String TEXT_2866 = ";";
  protected final String TEXT_2867 = NL + "\t\t\t|| !";
  protected final String TEXT_2868 = "().isEmpty()";
  protected final String TEXT_2869 = ";";
  protected final String TEXT_2870 = NL + "\t\t\t|| ";
  protected final String TEXT_2871 = "basicGet";
  protected final String TEXT_2872 = "() != null";
  protected final String TEXT_2873 = ";";
  protected final String TEXT_2874 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2875 = ")";
  protected final String TEXT_2876 = ";";
  protected final String TEXT_2877 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2878 = "();";
  protected final String TEXT_2879 = NL + "\t\treturn false;";
  protected final String TEXT_2880 = NL + "\t}" + NL;
  protected final String TEXT_2881 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2882 = NL + "\t@Override";
  protected final String TEXT_2883 = NL + "\tpublic ";
  protected final String TEXT_2884 = " ";
  protected final String TEXT_2885 = "()" + NL + "\t{";
  protected final String TEXT_2886 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2887 = " ";
  protected final String TEXT_2888 = " = (";
  protected final String TEXT_2889 = ")((";
  protected final String TEXT_2890 = ")";
  protected final String TEXT_2891 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2892 = ";";
  protected final String TEXT_2893 = NL + "\t\treturn ";
  protected final String TEXT_2894 = "();";
  protected final String TEXT_2895 = NL + "\t\t";
  protected final String TEXT_2896 = " ";
  protected final String TEXT_2897 = " = new ";
  protected final String TEXT_2898 = "();" + NL + "\t\t";
  protected final String TEXT_2899 = " ";
  protected final String TEXT_2900 = " = ";
  protected final String TEXT_2901 = "();" + NL + "\t\tif (";
  protected final String TEXT_2902 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2903 = ".add(";
  protected final String TEXT_2904 = ");" + NL + "\t\t}" + NL + "\t\treturn new ";
  protected final String TEXT_2905 = "(this, ";
  protected final String TEXT_2906 = "null";
  protected final String TEXT_2907 = ", ";
  protected final String TEXT_2908 = ".size(), ";
  protected final String TEXT_2909 = ".toArray());";
  protected final String TEXT_2910 = NL + "\t\treturn null;";
  protected final String TEXT_2911 = NL + "\t\treturn ";
  protected final String TEXT_2912 = "();";
  protected final String TEXT_2913 = NL + "\t}" + NL;
  protected final String TEXT_2914 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2915 = NL + "\t@Override";
  protected final String TEXT_2916 = NL + "\tpublic ";
  protected final String TEXT_2917 = " basicGet";
  protected final String TEXT_2918 = "()" + NL + "\t{";
  protected final String TEXT_2919 = NL + "\t\treturn null;";
  protected final String TEXT_2920 = NL + "\t\treturn ";
  protected final String TEXT_2921 = "basicGet";
  protected final String TEXT_2922 = "();";
  protected final String TEXT_2923 = NL + "\t}" + NL;
  protected final String TEXT_2924 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2925 = NL + "\t@Override";
  protected final String TEXT_2926 = NL + "\tpublic ";
  protected final String TEXT_2927 = " basicSet";
  protected final String TEXT_2928 = "(";
  protected final String TEXT_2929 = " new";
  protected final String TEXT_2930 = ", ";
  protected final String TEXT_2931 = " msgs)" + NL + "\t{";
  protected final String TEXT_2932 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2933 = NL + "\t\tif (new";
  protected final String TEXT_2934 = " != null && !(new";
  protected final String TEXT_2935 = " instanceof ";
  protected final String TEXT_2936 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(\"new";
  protected final String TEXT_2937 = " must be an instance of ";
  protected final String TEXT_2938 = "\");";
  protected final String TEXT_2939 = NL + "\t\t}";
  protected final String TEXT_2940 = NL + "\t\treturn basicSet";
  protected final String TEXT_2941 = "(";
  protected final String TEXT_2942 = "(";
  protected final String TEXT_2943 = ") ";
  protected final String TEXT_2944 = "new";
  protected final String TEXT_2945 = ", msgs);";
  protected final String TEXT_2946 = NL + "\t\tset";
  protected final String TEXT_2947 = "(";
  protected final String TEXT_2948 = "(";
  protected final String TEXT_2949 = ") ";
  protected final String TEXT_2950 = "new";
  protected final String TEXT_2951 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2952 = NL + "\t}" + NL;
  protected final String TEXT_2953 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2954 = NL + "\t@Override";
  protected final String TEXT_2955 = NL + "\tpublic void set";
  protected final String TEXT_2956 = "(";
  protected final String TEXT_2957 = " new";
  protected final String TEXT_2958 = ")" + NL + "\t{";
  protected final String TEXT_2959 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2960 = NL + "\t\tif (new";
  protected final String TEXT_2961 = " != null && !(new";
  protected final String TEXT_2962 = " instanceof ";
  protected final String TEXT_2963 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(\"new";
  protected final String TEXT_2964 = " must be an instance of ";
  protected final String TEXT_2965 = "\");";
  protected final String TEXT_2966 = NL + "\t\t}";
  protected final String TEXT_2967 = NL + "\t\tset";
  protected final String TEXT_2968 = "(";
  protected final String TEXT_2969 = "(";
  protected final String TEXT_2970 = ") ";
  protected final String TEXT_2971 = "new";
  protected final String TEXT_2972 = ");";
  protected final String TEXT_2973 = NL + "\t}" + NL;
  protected final String TEXT_2974 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2975 = "() <em>";
  protected final String TEXT_2976 = "</em>}' ";
  protected final String TEXT_2977 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2978 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2979 = "_ESUBSETS = ";
  protected final String TEXT_2980 = ";" + NL;
  protected final String TEXT_2981 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2982 = "() <em>";
  protected final String TEXT_2983 = "</em>}' ";
  protected final String TEXT_2984 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2985 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2986 = "_ESUPERSETS = ";
  protected final String TEXT_2987 = ";" + NL;
  protected final String TEXT_2988 = NL + "\t/**";
  protected final String TEXT_2989 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2990 = "}, with the specified ";
  protected final String TEXT_2991 = ", and appends it to the '<em><b>";
  protected final String TEXT_2992 = "</b></em>' ";
  protected final String TEXT_2993 = ".";
  protected final String TEXT_2994 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2995 = "}, with the specified ";
  protected final String TEXT_2996 = ", and sets the '<em><b>";
  protected final String TEXT_2997 = "</b></em>' ";
  protected final String TEXT_2998 = ".";
  protected final String TEXT_2999 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_3000 = "} and appends it to the '<em><b>";
  protected final String TEXT_3001 = "</b></em>' ";
  protected final String TEXT_3002 = ".";
  protected final String TEXT_3003 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_3004 = "} and sets the '<em><b>";
  protected final String TEXT_3005 = "</b></em>' ";
  protected final String TEXT_3006 = ".";
  protected final String TEXT_3007 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3008 = NL + "\t * @param ";
  protected final String TEXT_3009 = " The ";
  protected final String TEXT_3010 = " for the new {@link ";
  protected final String TEXT_3011 = "}, or <code>null</code>.";
  protected final String TEXT_3012 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_3013 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_3014 = "}." + NL + "\t * @see #";
  protected final String TEXT_3015 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3016 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3017 = NL + "\t";
  protected final String TEXT_3018 = " create";
  protected final String TEXT_3019 = "(";
  protected final String TEXT_3020 = ", ";
  protected final String TEXT_3021 = " eClass);" + NL;
  protected final String TEXT_3022 = NL + "\t@Override";
  protected final String TEXT_3023 = NL + "\tpublic ";
  protected final String TEXT_3024 = " create";
  protected final String TEXT_3025 = "(";
  protected final String TEXT_3026 = ", ";
  protected final String TEXT_3027 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_3028 = " new";
  protected final String TEXT_3029 = " = (";
  protected final String TEXT_3030 = ") create(eClass);";
  protected final String TEXT_3031 = NL + "\t\t";
  protected final String TEXT_3032 = "().add(new";
  protected final String TEXT_3033 = ");";
  protected final String TEXT_3034 = NL + "\t\tset";
  protected final String TEXT_3035 = "(new";
  protected final String TEXT_3036 = ");";
  protected final String TEXT_3037 = NL + "\t\tint ";
  protected final String TEXT_3038 = "ListSize = 0;";
  protected final String TEXT_3039 = NL + "\t\tint ";
  protected final String TEXT_3040 = "Size = ";
  protected final String TEXT_3041 = " == null ? 0 : ";
  protected final String TEXT_3042 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_3043 = "Size > ";
  protected final String TEXT_3044 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_3045 = "ListSize = ";
  protected final String TEXT_3046 = "Size;";
  protected final String TEXT_3047 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_3048 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_3049 = ".create";
  protected final String TEXT_3050 = "(";
  protected final String TEXT_3051 = ", ";
  protected final String TEXT_3052 = "i < ";
  protected final String TEXT_3053 = "Size ? (";
  protected final String TEXT_3054 = ") ";
  protected final String TEXT_3055 = ".get(i) : null";
  protected final String TEXT_3056 = ");" + NL + "\t\t}";
  protected final String TEXT_3057 = NL + "\t\tnew";
  protected final String TEXT_3058 = ".create";
  protected final String TEXT_3059 = "(";
  protected final String TEXT_3060 = ", ";
  protected final String TEXT_3061 = ");";
  protected final String TEXT_3062 = NL + "\t\tif (";
  protected final String TEXT_3063 = " != null)";
  protected final String TEXT_3064 = NL + "\t\t\tnew";
  protected final String TEXT_3065 = ".";
  protected final String TEXT_3066 = "().addAll(";
  protected final String TEXT_3067 = ");";
  protected final String TEXT_3068 = NL + "\t\t\tnew";
  protected final String TEXT_3069 = ".set";
  protected final String TEXT_3070 = "(";
  protected final String TEXT_3071 = ");";
  protected final String TEXT_3072 = NL + "\t\treturn new";
  protected final String TEXT_3073 = ";" + NL + "\t}" + NL;
  protected final String TEXT_3074 = NL + "\t/**";
  protected final String TEXT_3075 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_3076 = "}, with the specified ";
  protected final String TEXT_3077 = ", and appends it to the '<em><b>";
  protected final String TEXT_3078 = "</b></em>' ";
  protected final String TEXT_3079 = ".";
  protected final String TEXT_3080 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_3081 = "},with the specified ";
  protected final String TEXT_3082 = ", and sets the '<em><b>";
  protected final String TEXT_3083 = "</b></em>' ";
  protected final String TEXT_3084 = ".";
  protected final String TEXT_3085 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_3086 = "} and appends it to the '<em><b>";
  protected final String TEXT_3087 = "</b></em>' ";
  protected final String TEXT_3088 = ".";
  protected final String TEXT_3089 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_3090 = "} and sets the '<em><b>";
  protected final String TEXT_3091 = "</b></em>' ";
  protected final String TEXT_3092 = ".";
  protected final String TEXT_3093 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3094 = NL + "\t * @param ";
  protected final String TEXT_3095 = " The ";
  protected final String TEXT_3096 = " for the new {@link ";
  protected final String TEXT_3097 = "}, or <code>null</code>.";
  protected final String TEXT_3098 = NL + "\t * @return The new {@link ";
  protected final String TEXT_3099 = "}." + NL + "\t * @see #";
  protected final String TEXT_3100 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3101 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3102 = NL + "\t";
  protected final String TEXT_3103 = " create";
  protected final String TEXT_3104 = "(";
  protected final String TEXT_3105 = ");" + NL;
  protected final String TEXT_3106 = NL + "\t@Override";
  protected final String TEXT_3107 = NL + "\tpublic ";
  protected final String TEXT_3108 = " create";
  protected final String TEXT_3109 = "(";
  protected final String TEXT_3110 = ")" + NL + "\t{";
  protected final String TEXT_3111 = NL + "\t\treturn create";
  protected final String TEXT_3112 = "(";
  protected final String TEXT_3113 = ", ";
  protected final String TEXT_3114 = ");";
  protected final String TEXT_3115 = NL + "\t\t";
  protected final String TEXT_3116 = " new";
  protected final String TEXT_3117 = " = (";
  protected final String TEXT_3118 = ") create(";
  protected final String TEXT_3119 = ");";
  protected final String TEXT_3120 = NL + "\t\t";
  protected final String TEXT_3121 = "().add(new";
  protected final String TEXT_3122 = ");";
  protected final String TEXT_3123 = NL + "\t\tset";
  protected final String TEXT_3124 = "(new";
  protected final String TEXT_3125 = ");";
  protected final String TEXT_3126 = NL + "\t\tint ";
  protected final String TEXT_3127 = "ListSize = 0;";
  protected final String TEXT_3128 = NL + "\t\tint ";
  protected final String TEXT_3129 = "Size = ";
  protected final String TEXT_3130 = " == null ? 0 : ";
  protected final String TEXT_3131 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_3132 = "Size > ";
  protected final String TEXT_3133 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_3134 = "ListSize = ";
  protected final String TEXT_3135 = "Size;";
  protected final String TEXT_3136 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_3137 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_3138 = ".create";
  protected final String TEXT_3139 = "(";
  protected final String TEXT_3140 = ", ";
  protected final String TEXT_3141 = "i < ";
  protected final String TEXT_3142 = "Size ? (";
  protected final String TEXT_3143 = ") ";
  protected final String TEXT_3144 = ".get(i) : null";
  protected final String TEXT_3145 = ");" + NL + "\t\t}";
  protected final String TEXT_3146 = NL + "\t\tnew";
  protected final String TEXT_3147 = ".create";
  protected final String TEXT_3148 = "(";
  protected final String TEXT_3149 = ", ";
  protected final String TEXT_3150 = ");";
  protected final String TEXT_3151 = NL + "\t\tif (";
  protected final String TEXT_3152 = " != null)";
  protected final String TEXT_3153 = NL + "\t\t\tnew";
  protected final String TEXT_3154 = ".";
  protected final String TEXT_3155 = "().addAll(";
  protected final String TEXT_3156 = ");";
  protected final String TEXT_3157 = NL + "\t\t\tnew";
  protected final String TEXT_3158 = ".set";
  protected final String TEXT_3159 = "(";
  protected final String TEXT_3160 = ");";
  protected final String TEXT_3161 = NL + "\t\treturn new";
  protected final String TEXT_3162 = ";";
  protected final String TEXT_3163 = NL + "\t}" + NL;
  protected final String TEXT_3164 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_3165 = "} with the specified ";
  protected final String TEXT_3166 = " from the '<em><b>";
  protected final String TEXT_3167 = "</b></em>' ";
  protected final String TEXT_3168 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3169 = NL + "\t * @param ";
  protected final String TEXT_3170 = " The ";
  protected final String TEXT_3171 = " of the {@link ";
  protected final String TEXT_3172 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3173 = NL + "\t * @return The first {@link ";
  protected final String TEXT_3174 = "} with the specified ";
  protected final String TEXT_3175 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_3176 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3177 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3178 = NL + "\t";
  protected final String TEXT_3179 = " get";
  protected final String TEXT_3180 = "(";
  protected final String TEXT_3181 = ");" + NL;
  protected final String TEXT_3182 = NL + "\t@Override";
  protected final String TEXT_3183 = NL + "\tpublic ";
  protected final String TEXT_3184 = " get";
  protected final String TEXT_3185 = "(";
  protected final String TEXT_3186 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_3187 = "(";
  protected final String TEXT_3188 = ", false";
  protected final String TEXT_3189 = ", null";
  protected final String TEXT_3190 = ", false";
  protected final String TEXT_3191 = ");" + NL + "\t}" + NL;
  protected final String TEXT_3192 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_3193 = "} with the specified ";
  protected final String TEXT_3194 = " from the '<em><b>";
  protected final String TEXT_3195 = "</b></em>' ";
  protected final String TEXT_3196 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3197 = NL + "\t * @param ";
  protected final String TEXT_3198 = " The ";
  protected final String TEXT_3199 = " of the {@link ";
  protected final String TEXT_3200 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3201 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_3202 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_3203 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3204 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_3205 = "} on demand if not found.";
  protected final String TEXT_3206 = NL + "\t * @return The first {@link ";
  protected final String TEXT_3207 = "} with the specified ";
  protected final String TEXT_3208 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_3209 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3210 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3211 = NL + "\t";
  protected final String TEXT_3212 = " get";
  protected final String TEXT_3213 = "(";
  protected final String TEXT_3214 = ", boolean ignoreCase";
  protected final String TEXT_3215 = ", ";
  protected final String TEXT_3216 = " eClass";
  protected final String TEXT_3217 = ", boolean createOnDemand";
  protected final String TEXT_3218 = ");" + NL;
  protected final String TEXT_3219 = NL + "\t@Override";
  protected final String TEXT_3220 = NL + "\tpublic ";
  protected final String TEXT_3221 = " get";
  protected final String TEXT_3222 = "(";
  protected final String TEXT_3223 = ", boolean ignoreCase";
  protected final String TEXT_3224 = ", ";
  protected final String TEXT_3225 = " eClass";
  protected final String TEXT_3226 = ", boolean createOnDemand";
  protected final String TEXT_3227 = ")" + NL + "\t{";
  protected final String TEXT_3228 = NL + "\t\t";
  protected final String TEXT_3229 = "Loop: for (";
  protected final String TEXT_3230 = " ";
  protected final String TEXT_3231 = " : ";
  protected final String TEXT_3232 = "())" + NL + "\t\t{";
  protected final String TEXT_3233 = NL + "\t\t";
  protected final String TEXT_3234 = "Loop: for (";
  protected final String TEXT_3235 = " i = ";
  protected final String TEXT_3236 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_3237 = " ";
  protected final String TEXT_3238 = " = (";
  protected final String TEXT_3239 = ") i.next();";
  protected final String TEXT_3240 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_3241 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3242 = "Loop;";
  protected final String TEXT_3243 = NL + "\t\t\t";
  protected final String TEXT_3244 = " ";
  protected final String TEXT_3245 = "List = ";
  protected final String TEXT_3246 = ".";
  protected final String TEXT_3247 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_3248 = "ListSize = ";
  protected final String TEXT_3249 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_3250 = " || (";
  protected final String TEXT_3251 = " != null && ";
  protected final String TEXT_3252 = ".size() != ";
  protected final String TEXT_3253 = "ListSize";
  protected final String TEXT_3254 = ")";
  protected final String TEXT_3255 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_3256 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_3257 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_3258 = " ";
  protected final String TEXT_3259 = " = ";
  protected final String TEXT_3260 = "(";
  protected final String TEXT_3261 = ") ";
  protected final String TEXT_3262 = "List.get(j);";
  protected final String TEXT_3263 = NL + "\t\t\t\tif (";
  protected final String TEXT_3264 = " != null && !(ignoreCase ? (";
  protected final String TEXT_3265 = "(";
  protected final String TEXT_3266 = ")";
  protected final String TEXT_3267 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_3268 = ".";
  protected final String TEXT_3269 = "()) : ";
  protected final String TEXT_3270 = ".get(j).equals(";
  protected final String TEXT_3271 = ".";
  protected final String TEXT_3272 = "())))";
  protected final String TEXT_3273 = NL + "\t\t\t\tif (";
  protected final String TEXT_3274 = " != null && !";
  protected final String TEXT_3275 = ".get(j).equals(";
  protected final String TEXT_3276 = ".";
  protected final String TEXT_3277 = "()))";
  protected final String TEXT_3278 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_3279 = "Loop;";
  protected final String TEXT_3280 = NL + "\t\t\t}";
  protected final String TEXT_3281 = NL + "\t\t\t";
  protected final String TEXT_3282 = " ";
  protected final String TEXT_3283 = " = ";
  protected final String TEXT_3284 = ".";
  protected final String TEXT_3285 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_3286 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3287 = "Loop;";
  protected final String TEXT_3288 = NL + "\t\t\tif (";
  protected final String TEXT_3289 = " != null && !(ignoreCase ? ";
  protected final String TEXT_3290 = ".equalsIgnoreCase(";
  protected final String TEXT_3291 = ".";
  protected final String TEXT_3292 = "()) : ";
  protected final String TEXT_3293 = ".equals(";
  protected final String TEXT_3294 = ".";
  protected final String TEXT_3295 = "())))";
  protected final String TEXT_3296 = NL + "\t\t\tif (";
  protected final String TEXT_3297 = " != null && !";
  protected final String TEXT_3298 = ".equals(";
  protected final String TEXT_3299 = ".";
  protected final String TEXT_3300 = "()))";
  protected final String TEXT_3301 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3302 = "Loop;";
  protected final String TEXT_3303 = NL + "\t\t\tif (";
  protected final String TEXT_3304 = " != null && !(ignoreCase ? ";
  protected final String TEXT_3305 = ".equalsIgnoreCase(";
  protected final String TEXT_3306 = ".";
  protected final String TEXT_3307 = "()) : ";
  protected final String TEXT_3308 = ".equals(";
  protected final String TEXT_3309 = ".";
  protected final String TEXT_3310 = "())))";
  protected final String TEXT_3311 = NL + "\t\t\tif (";
  protected final String TEXT_3312 = " != null && !";
  protected final String TEXT_3313 = ".equals(";
  protected final String TEXT_3314 = ".";
  protected final String TEXT_3315 = "()))";
  protected final String TEXT_3316 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3317 = "Loop;";
  protected final String TEXT_3318 = NL + "\t\t\treturn ";
  protected final String TEXT_3319 = ";" + NL + "\t\t}";
  protected final String TEXT_3320 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_3321 = " && eClass != null";
  protected final String TEXT_3322 = " ? create";
  protected final String TEXT_3323 = "(";
  protected final String TEXT_3324 = ", eClass";
  protected final String TEXT_3325 = ") : null;";
  protected final String TEXT_3326 = NL + "\t\treturn null;";
  protected final String TEXT_3327 = NL + "\t}" + NL;
  protected final String TEXT_3328 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_3329 = "()" + NL + "\t{";
  protected final String TEXT_3330 = NL + "  \t\treturn false;";
  protected final String TEXT_3331 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3332 = ");";
  protected final String TEXT_3333 = NL + "\t\treturn !((";
  protected final String TEXT_3334 = ".Internal.Wrapper)";
  protected final String TEXT_3335 = "()).featureMap().isEmpty();";
  protected final String TEXT_3336 = NL + "\t\treturn ";
  protected final String TEXT_3337 = " != null && !";
  protected final String TEXT_3338 = ".featureMap().isEmpty();";
  protected final String TEXT_3339 = NL + "\t\treturn ";
  protected final String TEXT_3340 = " != null && !";
  protected final String TEXT_3341 = ".isEmpty();";
  protected final String TEXT_3342 = NL + "\t\t";
  protected final String TEXT_3343 = " ";
  protected final String TEXT_3344 = " = (";
  protected final String TEXT_3345 = ")eVirtualGet(";
  protected final String TEXT_3346 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3347 = " != null && !";
  protected final String TEXT_3348 = ".isEmpty();";
  protected final String TEXT_3349 = NL + "\t\treturn !";
  protected final String TEXT_3350 = "().isEmpty();";
  protected final String TEXT_3351 = NL + "\t\treturn ";
  protected final String TEXT_3352 = " != null;";
  protected final String TEXT_3353 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3354 = ") != null;";
  protected final String TEXT_3355 = NL + "\t\treturn basicGet";
  protected final String TEXT_3356 = "() != null;";
  protected final String TEXT_3357 = NL + "\t\treturn ";
  protected final String TEXT_3358 = " != null;";
  protected final String TEXT_3359 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3360 = ") != null;";
  protected final String TEXT_3361 = NL + "\t\treturn ";
  protected final String TEXT_3362 = "() != null;";
  protected final String TEXT_3363 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_3364 = " & ";
  protected final String TEXT_3365 = "_EFLAG) != 0) != ";
  protected final String TEXT_3366 = ";";
  protected final String TEXT_3367 = NL + "\t\t\t\treturn (";
  protected final String TEXT_3368 = " & ";
  protected final String TEXT_3369 = "_EFLAG) != ";
  protected final String TEXT_3370 = "_EFLAG_DEFAULT;";
  protected final String TEXT_3371 = NL + "\t\treturn ";
  protected final String TEXT_3372 = " != ";
  protected final String TEXT_3373 = ";";
  protected final String TEXT_3374 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3375 = ", ";
  protected final String TEXT_3376 = ") != ";
  protected final String TEXT_3377 = ";";
  protected final String TEXT_3378 = NL + "\t\treturn ";
  protected final String TEXT_3379 = "() != ";
  protected final String TEXT_3380 = ";";
  protected final String TEXT_3381 = NL + "\t\treturn ";
  protected final String TEXT_3382 = " == null ? ";
  protected final String TEXT_3383 = " != null : !";
  protected final String TEXT_3384 = ".equals(";
  protected final String TEXT_3385 = ");";
  protected final String TEXT_3386 = NL + "\t\t";
  protected final String TEXT_3387 = " ";
  protected final String TEXT_3388 = " = (";
  protected final String TEXT_3389 = ")eVirtualGet(";
  protected final String TEXT_3390 = ", ";
  protected final String TEXT_3391 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3392 = " == null ? ";
  protected final String TEXT_3393 = " != null : !";
  protected final String TEXT_3394 = ".equals(";
  protected final String TEXT_3395 = ");";
  protected final String TEXT_3396 = NL + "\t\treturn ";
  protected final String TEXT_3397 = " == null ? ";
  protected final String TEXT_3398 = "() != null : !";
  protected final String TEXT_3399 = ".equals(";
  protected final String TEXT_3400 = "());";
  protected final String TEXT_3401 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3402 = ");";
  protected final String TEXT_3403 = NL + "\t\t";
  protected final String TEXT_3404 = " ";
  protected final String TEXT_3405 = " = (";
  protected final String TEXT_3406 = ")eVirtualGet(";
  protected final String TEXT_3407 = ");";
  protected final String TEXT_3408 = NL + "\t\treturn ";
  protected final String TEXT_3409 = " != null && ((";
  protected final String TEXT_3410 = ".Unsettable";
  protected final String TEXT_3411 = ")";
  protected final String TEXT_3412 = ").isSet();";
  protected final String TEXT_3413 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_3414 = ");";
  protected final String TEXT_3415 = NL + "\t\treturn (";
  protected final String TEXT_3416 = " & ";
  protected final String TEXT_3417 = "_ESETFLAG) != 0;";
  protected final String TEXT_3418 = NL + "\t\treturn ";
  protected final String TEXT_3419 = "ESet;";
  protected final String TEXT_3420 = NL + "\t\treturn !((";
  protected final String TEXT_3421 = ".Internal)((";
  protected final String TEXT_3422 = ".Internal.Wrapper)get";
  protected final String TEXT_3423 = "()).featureMap()).isEmpty(";
  protected final String TEXT_3424 = ");";
  protected final String TEXT_3425 = NL + "\t\treturn !((";
  protected final String TEXT_3426 = ".Internal)get";
  protected final String TEXT_3427 = "()).isEmpty(";
  protected final String TEXT_3428 = ");";
  protected final String TEXT_3429 = NL + "\t\treturn ";
  protected final String TEXT_3430 = ".";
  protected final String TEXT_3431 = "(this);";
  protected final String TEXT_3432 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_3433 = "' ";
  protected final String TEXT_3434 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3435 = NL + "\t}" + NL;
  protected final String TEXT_3436 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3437 = NL + "\t@Override";
  protected final String TEXT_3438 = NL + "\tpublic ";
  protected final String TEXT_3439 = " ";
  protected final String TEXT_3440 = "(";
  protected final String TEXT_3441 = ")";
  protected final String TEXT_3442 = NL + "\t{";
  protected final String TEXT_3443 = NL + "\t\t";
  protected final String TEXT_3444 = "(";
  protected final String TEXT_3445 = ");";
  protected final String TEXT_3446 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3447 = NL + "\t\treturn ";
  protected final String TEXT_3448 = "(";
  protected final String TEXT_3449 = ");";
  protected final String TEXT_3450 = NL + "\t}" + NL;
  protected final String TEXT_3451 = NL + "} //";
  protected final String TEXT_3452 = NL;

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
    for (GenFeature genFeature : genClass.getReifiedGenFeatures()) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(genClass); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_69);
    if (genFeature.getQualifiedListItemType(genClass).contains("<") || genFeature.getArrayItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_70);
    }
    stringBuffer.append(TEXT_71);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_72);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_74);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_75);
    }
    }
    for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
    if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_76);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_80);
    if (isGWT) {
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_86);
    } else if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_91);
    if (isGWT) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_93);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_95);
    }
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(genClass); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_99);
    if (genFeature.getQualifiedListItemType(genClass).contains("<") || genFeature.getArrayItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_100);
    }
    stringBuffer.append(TEXT_101);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_104);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_105);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_106);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_110);
    if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_111);
    }
    stringBuffer.append(TEXT_112);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_115);
    } else {
    stringBuffer.append(TEXT_116);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_118);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) { int flagIndex = genClass.getFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_119);
    if (isGWT) {
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_122);
    }
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(flagIndex % 32);
    stringBuffer.append(TEXT_128);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_132);
    if (isJDK50) {
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_133);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_135);
    }
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genFeature.getTypeGenClassifier().getFormattedName());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_141);
    if (isJDK50) {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_142);
    } else {
    stringBuffer.append(TEXT_143);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_144);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_148);
    }
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genClass.getFlagSize(genFeature) > 1 ? "s" : "");
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(genClass.getFlagMask(genFeature));
    stringBuffer.append(TEXT_156);
    if (genFeature.isEnumType()) {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_157);
    } else {
    stringBuffer.append(flagIndex % 32);
    }
    stringBuffer.append(TEXT_158);
    } else {
    stringBuffer.append(TEXT_159);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_160);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_161);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_163);
    if (isGWT) {
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_167);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_168);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) { int flagIndex = genClass.getESetFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_169);
    if (isGWT) {
    stringBuffer.append(TEXT_170);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_172);
    }
    stringBuffer.append(TEXT_173);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_174);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_175);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(flagIndex % 32 );
    stringBuffer.append(TEXT_177);
    } else {
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_180);
    if (isGWT) {
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_183);
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_184);
    stringBuffer.append(genClass.getOffsetCorrectionField(null));
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genClass.getQualifiedFeatureID(genClass.getImplementedGenFeatures().get(0)));
    stringBuffer.append(TEXT_188);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genClass.getOffsetCorrectionField(genFeature));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_191);
    stringBuffer.append(reverseFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_192);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_193);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_194);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genClass.getImplementedGenOperations().get(0).getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_196);
    stringBuffer.append(genClass.getQualifiedOperationID(genClass.getImplementedGenOperations().get(0)));
    stringBuffer.append(TEXT_197);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_198);
    if (genModel.isPublicConstructors()) {
    stringBuffer.append(TEXT_199);
    } else {
    stringBuffer.append(TEXT_200);
    }
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_202);
    for (GenFeature genFeature : genClass.getFlagGenFeaturesWithDefault()) {
    stringBuffer.append(TEXT_203);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_204);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_205);
    if (!genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_206);
    }
    stringBuffer.append(TEXT_207);
    }
    stringBuffer.append(TEXT_208);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_209);
    }
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_211);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_212);
    }
    if (isImplementation && (genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL || genModel.isDynamicDelegation()) && (genClass.getClassExtendsGenClass() == null || (genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL && !genClass.getClassExtendsGenClass().getGenModel().isDynamicDelegation()))) {
    if (genClass.hasStaticFeatures()) {
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_214);
    }
    stringBuffer.append(TEXT_215);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_216);
    }
    stringBuffer.append(TEXT_217);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? "0" : genClass.hasStaticFeatures() ? "ESTATIC_FEATURE_COUNT" : Integer.toString(genClass.getClassExtendsGenClass().getAllGenFeatures().size()));
    stringBuffer.append(TEXT_218);
    }
    //Class/reflectiveDelegation.override.javajetinc
    if (isImplementation) {
    new Runnable() { public void run() { GenClass classExtendsGenClass = genClass.getClassExtendsGenClass(); List<GenFeature> classExtendsAllGenFeatures = classExtendsGenClass == null? Collections.<GenFeature>emptyList() : classExtendsGenClass.getAllGenFeatures();
    for (GenFeature genFeature : genClass.getReifiedGenFeatures()) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String arrayElementType = genFeature.getArrayItemType(genClass);
    stringBuffer.append(TEXT_219);
    if (genModel.useGenerics() && CodeGenUtil.isUncheckedCast(arrayElementType)) {
    stringBuffer.append(TEXT_220);
    }
    if (classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_221);
    }
    stringBuffer.append(TEXT_222);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_224);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_229);
    } else {
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_236);
    }
    stringBuffer.append(TEXT_237);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_238);
    }
    if (genFeature.isGet() && genFeature.isListType()) {
    stringBuffer.append(TEXT_239);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_240);
    }
    }
    if (genFeature.isListType() && genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_241);
    }
    if (classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_242);
    }
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_244);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_245);
    }
    stringBuffer.append(TEXT_246);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_249);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_251);
    }
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_253);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_254);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_255);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_257);
    } else {
    stringBuffer.append(TEXT_258);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_260);
    }
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_262);
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_263);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_264);
    }
    }
    if (classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_265);
    }
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_273);
    }
    if (genFeature.isSet() && !(!genModel.isReflectiveDelegation() && genFeature.isBasicSet())) {
    stringBuffer.append(TEXT_274);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_275);
    }
    }
    { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    if (classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_276);
    }
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_278);
    }
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_280);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_281);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_282);
    }
    stringBuffer.append(TEXT_283);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_284);
    }
    }
    //Class/genFeatureReified.override.javajetinc
    }}}.run();}
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String arrayElementType = genFeature.getArrayItemType(genClass);
    stringBuffer.append(TEXT_285);
    if (!isImplementation) {
    stringBuffer.append(TEXT_286);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_287);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_288);
    } else {
    if (genModel.useGenerics() && CodeGenUtil.isUncheckedCast(arrayElementType)) {
    stringBuffer.append(TEXT_289);
    }
    stringBuffer.append(TEXT_290);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_292);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_297);
    } else {
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_303);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_304);
    }
    stringBuffer.append(TEXT_305);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_306);
    }
    stringBuffer.append(TEXT_307);
    if (!isImplementation) {
    stringBuffer.append(TEXT_308);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_310);
    } else {
    stringBuffer.append(TEXT_311);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_313);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_314);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_315);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_316);
    }
    stringBuffer.append(TEXT_317);
    if (!isImplementation) {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_319);
    } else {
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_321);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_323);
    } else {
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_325);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_326);
    }
    stringBuffer.append(TEXT_327);
    }
    stringBuffer.append(TEXT_328);
    if (!isImplementation) {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_330);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_332);
    } else {
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_340);
    }
    stringBuffer.append(TEXT_341);
    if (!isImplementation) {
    stringBuffer.append(TEXT_342);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_344);
    } else {
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_348);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_351);
    if (genFeature.isListType() && genFeature.getEcoreFeature().getEGenericType().getETypeParameter() == null) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_352);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_354);
    } else {
    stringBuffer.append(TEXT_355);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_356);
    }
    stringBuffer.append(TEXT_357);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_358);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_359);
    } else {
    stringBuffer.append(TEXT_360);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_361);
    }
    stringBuffer.append(TEXT_362);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

    stringBuffer.append(TEXT_363);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_364);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_365);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_367);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_369);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_370);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_371);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_372);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_373);
    }
    }
    if (!UML2GenModelUtil.getSubsettedGenFeatures(genFeature).isEmpty()) {
    stringBuffer.append(TEXT_374);
    for (GenFeature subsettedGenFeature : UML2GenModelUtil.getSubsettedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_375);
    stringBuffer.append(subsettedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_376);
    stringBuffer.append(subsettedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(subsettedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_378);
    }
    stringBuffer.append(TEXT_379);
    }if (UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_380);
    for (GenFeature redefinedGenFeature : UML2GenModelUtil.getRedefinedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_381);
    stringBuffer.append(redefinedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(redefinedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_383);
    stringBuffer.append(redefinedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_384);
    }
    stringBuffer.append(TEXT_385);
    }if(genFeature.isDerived() && UML2GenModelUtil.isUnion(genFeature)){
    stringBuffer.append(TEXT_386);
    }
    stringBuffer.append(TEXT_387);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_388);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_390);
    }
    stringBuffer.append(TEXT_391);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_393);
    }
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_396);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_399);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_401);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_404);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_407);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_408);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_409);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_410);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_411);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_412);
    }}
    stringBuffer.append(TEXT_413);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_414);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_415);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_418);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !(genModel.isReflectiveDelegation() && genModel.isDynamicDelegation()) && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && !genFeature.isFeatureMapType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation() || genModel.isDynamicDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature() || genFeature.isListType() && genFeature.hasSettingDelegate())) {
    stringBuffer.append(TEXT_419);
    }
    stringBuffer.append(TEXT_420);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_422);
    }
    stringBuffer.append(TEXT_423);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_424);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_425);
    }
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_428);
    }
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_430);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_431);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_433);
    }
    stringBuffer.append(TEXT_434);
    } else if (genModel.isReflectiveDelegation()) {
    if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_436);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_437);
    }
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_439);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_440);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_441);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_442);
    }
    stringBuffer.append(TEXT_443);
    }
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_444);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_445);
    }
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_448);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_450);
    }
    stringBuffer.append(TEXT_451);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_455);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_456);
    }
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_458);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_459);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_462);
    } else {
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_464);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_465);
    }
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_467);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_469);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_470);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_471);
    } else {
    stringBuffer.append(TEXT_472);
    }
    stringBuffer.append(TEXT_473);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_476);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_479);
    }
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_491);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_493);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_496);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_497);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_500);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_501);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_503);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_504);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_505);
    }
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_507);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_510);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_511);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_512);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_513);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_514);
    }
    stringBuffer.append(TEXT_515);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_518);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_524);
    }
    stringBuffer.append(TEXT_525);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_529);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_532);
    } else {
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_534);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_537);
    }
    } else {
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_539);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_546);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_549);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = isJDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_550);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_553);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_554);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_555);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_556);
    } else {
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_558);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_559);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_560);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_561);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_562);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_563);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_565);
    } else {
    stringBuffer.append(TEXT_566);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_567);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_568);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_569);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_570);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_572);
    }
    stringBuffer.append(TEXT_573);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_574);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_576);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_577);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_578);
    }
    stringBuffer.append(TEXT_579);
    } else {
    stringBuffer.append(TEXT_580);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_581);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_583);
    }
    stringBuffer.append(TEXT_584);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_586);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_588);
    }
    stringBuffer.append(TEXT_589);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_591);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_593);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_594);
    }
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_597);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_598);
    }
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_600);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_601);
    }
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_603);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_605);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_606);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_607);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_608);
    }
    stringBuffer.append(TEXT_609);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_610);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_611);
    }
    stringBuffer.append(TEXT_612);
    }
    stringBuffer.append(TEXT_613);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_614);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_615);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_616);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_618);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_619);
    }
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_626);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_628);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_629);
    }
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_631);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_632);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_633);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_634);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_637);
    }
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_644);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_647);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_648);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_649);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_651);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_652);
    }
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_661);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_662);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_664);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_665);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_667);
    }
    stringBuffer.append(TEXT_668);
    }
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_670);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_671);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_672);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_673);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_674);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_675);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_676);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_677);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_678);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_680);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_681);
    } else {
    stringBuffer.append(TEXT_682);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_683);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_684);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_685);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_686);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_687);
    }
    }
    }
    }
    stringBuffer.append(TEXT_688);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_689);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_690);
    } else {
    stringBuffer.append(TEXT_691);
    }
    stringBuffer.append(TEXT_692);
    }
    } else {
    stringBuffer.append(TEXT_693);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_694);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_695);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_696);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_697);
    if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_698);
    }
    }
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_701);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_703);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_704);
    }
    stringBuffer.append(TEXT_705);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_706);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_707);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_708);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_709);
    }
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_711);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_712);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_714);
    }
    stringBuffer.append(TEXT_715);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_718);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_721);
    } else {
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_723);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_724);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_726);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_728);
    } else {
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_730);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_732);
    }
    } else if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_734);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_736);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_737);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_738);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_739);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_740);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_742);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_743);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_744);
    } else {
    stringBuffer.append(TEXT_745);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_746);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_747);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_748);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_749);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_750);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_751);
    }
    }
    }
    }
    stringBuffer.append(TEXT_752);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_754);
    } else {
    stringBuffer.append(TEXT_755);
    }
    stringBuffer.append(TEXT_756);
    } else {
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_759);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_760);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_761);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_762);
    }
    }
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_764);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_768);
    if (genFeature.isContainer()) {
    if (UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature) != genFeature.getTypeGenClassifier()) {
    stringBuffer.append(TEXT_769);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_771);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_773);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_775);
    }
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_777);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_778);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_779);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_780);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_781);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_782);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_783);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_784);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_785);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_786);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_788);
    }
    stringBuffer.append(TEXT_789);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_790);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_791);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_792);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_793);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_794);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_795);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_796);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_797);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_798);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_799);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_800);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_801);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_802);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_803);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_804);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_805);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_806);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_807);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_808);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_809);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_810);
    }
    stringBuffer.append(TEXT_811);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_812);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_813);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_814);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_815);
    }
    stringBuffer.append(TEXT_816);
    }
    stringBuffer.append(TEXT_817);
    }
    stringBuffer.append(TEXT_818);
    } else if (genModel.isDynamicDelegation()) {
    if (UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature) != genFeature.getTypeGenClassifier()) {
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_821);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_823);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_825);
    }
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_828);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_829);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_831);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_832);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_833);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_834);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_835);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_836);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_838);
    }
    stringBuffer.append(TEXT_839);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_840);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_842);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_843);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_844);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_845);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_846);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_847);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_848);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_849);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_851);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_853);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_854);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_855);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_856);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_857);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_858);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_859);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_860);
    }
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_862);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_863);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_864);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_865);
    }
    stringBuffer.append(TEXT_866);
    }
    stringBuffer.append(TEXT_867);
    }
    stringBuffer.append(TEXT_868);
    } else if (!genFeature.isVolatile()) {
    if (UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature) != genFeature.getTypeGenClassifier()) {
    stringBuffer.append(TEXT_869);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_871);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_873);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_875);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_879);
    } else {
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_885);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_887);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_891);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_894);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_897);
    }
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_899);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_900);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_905);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_908);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_909);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_910);
    } else {
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_912);
    }
    stringBuffer.append(TEXT_913);
    } else {
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_915);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_918);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_919);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_920);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_923);
    }
    stringBuffer.append(TEXT_924);
    }
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_925);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_926);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_927);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_928);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_929);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_930);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_931);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_933);
    }
    stringBuffer.append(TEXT_934);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_935);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_937);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_938);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_940);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_941);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_942);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_943);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_944);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_946);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_948);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_949);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_950);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_951);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_952);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_953);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_954);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_955);
    }
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_957);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_958);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_960);
    }
    stringBuffer.append(TEXT_961);
    }
    stringBuffer.append(TEXT_962);
    }
    stringBuffer.append(TEXT_963);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_965);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_966);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_969);
    } else {
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_971);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_974);
    }
    } else {
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_977);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_978);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_983);
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_985);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_986);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_987);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_989);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_991);
    }
    }
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_993);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_994);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_995);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_998);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1000);
    }
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_1003);
    if (UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature) != genFeature.getTypeGenClassifier()) {
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1010);
    }
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1015);
    }
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_1017);
    }
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1019);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1021);
    }
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1023);
    }
    stringBuffer.append(TEXT_1024);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1026);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1028);
    }
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1030);
    }
    stringBuffer.append(TEXT_1031);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1033);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1035);
    }
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1037);
    }
    stringBuffer.append(TEXT_1038);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1056);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1062);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1067);
    }
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1072);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1080);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1090);
    }
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1094);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1095);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1098);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1102);
    }
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1105);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1108);
    }
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1110);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1117);
    }
    stringBuffer.append(TEXT_1118);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1124);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1129);
    } else {
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1136);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1142);
    } else {
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1149);
    if (isJDK50) {
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1151);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1153);
    }
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1155);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1159);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1165);
    } else {
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1170);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1175);
    } else {
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1179);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1183);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1185);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1189);
    }
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1192);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1195);
    }
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1197);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1201);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1205);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1207);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1208);
    } else {
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1210);
    }
    stringBuffer.append(TEXT_1211);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1215);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1220);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1222);
    }
    }
    }
    if (!genFeature.isBasicSet()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_1224);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1228);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1231);
    }
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1236);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1238);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1246);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1250);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_1253);
    }
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1258);
    }
    stringBuffer.append(TEXT_1259);
    }
    stringBuffer.append(TEXT_1260);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1265);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1267);
    }
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1269);
    }
    stringBuffer.append(TEXT_1270);
    } else {
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1273);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1274);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1276);
    }
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1278);
    }
    stringBuffer.append(TEXT_1279);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1282);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1284);
    } else {
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1287);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1288);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_1289);
    if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1290);
    }
    }
    stringBuffer.append(TEXT_1291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1294);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1296);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1299);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1301);
    }
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1303);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1307);
    }
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1309);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1311);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1315);
    }
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1318);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1321);
    }
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1323);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1328);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1330);
    } else {
    stringBuffer.append(TEXT_1331);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1332);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1333);
    } else {
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1335);
    }
    stringBuffer.append(TEXT_1336);
    }
    } else {
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1339);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1340);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(TEXT_1346);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1348);
    }
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1350);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1353);
    }
    stringBuffer.append(TEXT_1354);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1355);
    if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1356);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1358);
    } else {
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1360);
    }
    stringBuffer.append(TEXT_1361);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_1363);
    }
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1365);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1367);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1369);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1374);
    }
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1379);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1384);
    }
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1387);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1391);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1396);
    }
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1398);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1401);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1405);
    }
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1408);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1411);
    }
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1413);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1418);
    }
    stringBuffer.append(TEXT_1419);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1424);
    } else {
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1431);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1434);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1438);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1440);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1444);
    } else {
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1447);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1448);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1449);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1452);
    } else {
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1454);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1457);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1458);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1460);
    } else {
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1462);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1463);
    } else {
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1465);
    }
    stringBuffer.append(TEXT_1466);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1472);
    } else {
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1477);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1480);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1483);
    } else {
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1485);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1489);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1494);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1495);
    } else {
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1497);
    }
    stringBuffer.append(TEXT_1498);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1503);
    } else {
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1507);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1511);
    } else {
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1514);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1515);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1523);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1525);
    }
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1527);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1529);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1530);
    }
    stringBuffer.append(TEXT_1531);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1532);
    if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1533);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1535);
    } else {
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1537);
    }
    stringBuffer.append(TEXT_1538);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    if (genClass.hasStaticFeatures()){
    stringBuffer.append(TEXT_1540);
    }
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1542);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1544);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1546);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1551);
    }
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1556);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1558);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1561);
    } else {
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1563);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1568);
    } else {
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1572);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1576);
    } else {
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1579);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1580);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1587);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1594);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1595);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1600);
    } else {
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1605);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1609);
    } else {
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1613);
    }
    }
    stringBuffer.append(TEXT_1614);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1618);
    }
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1622);
    }
    } else {
    stringBuffer.append(TEXT_1623);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1626);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1627);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1628);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1629);
    }
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1632);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1633);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1637);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1640);
    } else {
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1642);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1643);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1645);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1653);
    index++;}
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1657);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1658);
    }
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1662);
    }
    stringBuffer.append(TEXT_1663);
    } else {
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1666);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1667);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1668);
    }
    } else {
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1670);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1674);
    } else {
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1678);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1680);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1681);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1686);
    } else {
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1691);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1695);
    } else {
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1699);
    }
    }
    stringBuffer.append(TEXT_1700);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1704);
    }
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1707);
    }
    } else {
    stringBuffer.append(TEXT_1708);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1712);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1713);
    }
    stringBuffer.append(TEXT_1714);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1717);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1719);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_1720);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1721);
    } else {
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1726);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1729);
    } else {
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1732);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1734);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1742);
    index++;}
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1746);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1747);
    }
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1751);
    }
    stringBuffer.append(TEXT_1752);
    } else {
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1755);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1756);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1757);
    }
    } else {
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1759);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1763);
    } else {
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1767);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1769);
    }
    stringBuffer.append(TEXT_1770);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1775);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1779);
    }
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1783);
    }
    } else {
    stringBuffer.append(TEXT_1784);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1788);
    }
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1789);
    }
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1795);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1796);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1797);
    }
    stringBuffer.append(TEXT_1798);
    }
    }
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1803);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1807);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1808);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1810);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1812);
    }
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1816);
    }
    } else {
    stringBuffer.append(TEXT_1817);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1821);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1823);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1824);
    }
    stringBuffer.append(TEXT_1825);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1826);
    }
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1830);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1832);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1833);
    }
    stringBuffer.append(TEXT_1834);
    if (isJDK50) {
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1839);
    } else {
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1846);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1849);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1854);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1856);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1857);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1860);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1861);
    }
    }
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1866);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1868);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1869);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1871);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1872);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1873);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1879);
    } else {
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1884);
    }
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1886);
    index++;}
    stringBuffer.append(TEXT_1887);
    } else {
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1894);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1896);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1902);
    } else {
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1907);
    }
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1909);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1911);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1915);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1917);
    } else {
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1920);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1921);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1922);
    }
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1924);
    index++;}
    }
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1926);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1927);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1928);
    }
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1930);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1931);
    }
    stringBuffer.append(TEXT_1932);
    } else {
    stringBuffer.append(TEXT_1933);
    }
    stringBuffer.append(TEXT_1934);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1936);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1937);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1938);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1939);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1941);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1942);
    } else {
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1945);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1948);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1953);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1955);
    } else {
    stringBuffer.append(TEXT_1956);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1957);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1959);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1960);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1961);
    } else {
    stringBuffer.append(TEXT_1962);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1963);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1965);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1967);
    } else {
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1969);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1970);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1972);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1973);
    } else {
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1976);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1977);
    }
    } else {
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1980);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1981);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1983);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1984);
    } else {
    stringBuffer.append(TEXT_1985);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1986);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1987);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1989);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1992);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1995);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1996);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1998);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1999);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2000);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2001);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2002);
    } else {
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2004);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2005);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2006);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2007);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2008);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2009);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2011);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2012);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2014);
    }
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2017);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2019);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2020);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2021);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2024);
    } else {
    stringBuffer.append(TEXT_2025);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2026);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2027);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2028);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2030);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2031);
    } else {
    stringBuffer.append(TEXT_2032);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2033);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2034);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2035);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_2036);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2038);
    } else {
    stringBuffer.append(TEXT_2039);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2040);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2041);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2042);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation && !UML2GenModelUtil.hasOperationsClass(genClass, genOperation) && UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2044);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2045);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_2046);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2048);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2052);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2055);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_2056);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_2059);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2060);
    } else {
    stringBuffer.append(TEXT_2061);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2062);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2063);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_2064);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2065);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2066);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2067);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_2068);
    }
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2070);
    }
    }
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && isImplementation) {
    if (genOperation.isInvariant() && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_2071);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2072);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_2074);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2075);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2076);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2078);
    stringBuffer.append(genOperation.getInvariantExpression("\t\t"));
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2080);
    } else if (genOperation.hasInvocationDelegate()) {
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2083);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2085);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_2089);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2090);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2091);
    if (UML2GenModelUtil.isRedefinition(genOperation)) {
    stringBuffer.append(TEXT_2092);
    for (GenOperation redefinedGenOperation : UML2GenModelUtil.getRedefinedGenOperations(genOperation)) {
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(redefinedGenOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2094);
    stringBuffer.append(redefinedGenOperation.getName());
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(redefinedGenOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2096);
    stringBuffer.append(redefinedGenOperation.getFormattedName());
    stringBuffer.append(TEXT_2097);
    }
    stringBuffer.append(TEXT_2098);
    }
    stringBuffer.append(TEXT_2099);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_2100);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_2102);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2103);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_2104);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2105);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_2106);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_2107);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_2108);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_2109);
    }}
    stringBuffer.append(TEXT_2110);
    } else {
    stringBuffer.append(TEXT_2111);
    if (isJDK50) {
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_2112);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2115);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_2117);
    } else {
    if (genModel.useGenerics() && !genOperation.hasBody() && !genOperation.isInvariant() && genOperation.hasInvocationDelegate() && genOperation.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_2118);
    }
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_2122);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_2123);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_2124);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant() && (genOperation.hasInvariantExpression() || !genOperation.hasInvocationDelegate())) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_2125);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2126);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2127);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(genOperation.getValidationDelegate());
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2131);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_2134);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_2137);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2139);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2141);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2142);
    } else {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_2143);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2144);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2146);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2147);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2148);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2149);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2150);
    } else {
    stringBuffer.append(TEXT_2151);
    }
    stringBuffer.append(TEXT_2152);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(TEXT_2154);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2155);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_2156);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_2157);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2158);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2159);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_2160);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2162);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_2163);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2164);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_2165);
    //genOperation.diagnostics.override.javajetinc
    stringBuffer.append(TEXT_2166);
    }
    }
    } else if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvocationDelegate()) { int size = genOperation.getGenParameters().size();
    stringBuffer.append(TEXT_2167);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2168);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2169);
    if (size > 0) {
    stringBuffer.append(TEXT_2170);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_2172);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_2173);
    } else {
    stringBuffer.append(TEXT_2174);
    }
    stringBuffer.append(TEXT_2175);
    } else {
    stringBuffer.append(TEXT_2176);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2177);
    }
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2179);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2180);
    if (size > 0) {
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2182);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_2184);
    } else {
    stringBuffer.append(TEXT_2185);
    }
    stringBuffer.append(TEXT_2186);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2188);
    }
    stringBuffer.append(TEXT_2189);
    }
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.WrappedException"));
    stringBuffer.append(TEXT_2192);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2193);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2194);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2195);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2196);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2197);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_2198);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2199);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_2200);
    }
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2202);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2203);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_2204);
    }
    stringBuffer.append(TEXT_2205);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2206);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_2207);
    }
    stringBuffer.append(TEXT_2208);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2209);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2210);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2211);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2212);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2213);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2215);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2216);
    }
    stringBuffer.append(TEXT_2217);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2218);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2219);
    }
    stringBuffer.append(TEXT_2220);
    }
    stringBuffer.append(TEXT_2221);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2222);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2223);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2224);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2225);
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
    stringBuffer.append(TEXT_2226);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2227);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2228);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2229);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2230);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_2231);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2232);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2233);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2234);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2235);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2236);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_2237);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2238);
    }
    stringBuffer.append(TEXT_2239);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2241);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2242);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2243);
    }
    stringBuffer.append(TEXT_2244);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2245);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2246);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2247);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2248);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2249);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2250);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2251);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_2252);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2253);
    } else {
    stringBuffer.append(TEXT_2254);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_2255);
    }
    } else {
    stringBuffer.append(TEXT_2256);
    }
    }
    stringBuffer.append(TEXT_2257);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_2258);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_2259);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2260);
    }
    stringBuffer.append(TEXT_2261);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2262);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2263);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2264);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2265);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2267);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_2269);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2270);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2271);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2272);
    } else {
    stringBuffer.append(TEXT_2273);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2274);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_2275);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2277);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2278);
    } else {
    stringBuffer.append(TEXT_2279);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2280);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2281);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2282);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2283);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2284);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2285);
    } else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
    stringBuffer.append(TEXT_2286);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2288);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2290);
    }
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2292);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_2293);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2294);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2296);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_2297);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2298);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2299);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2300);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2301);
    }
    stringBuffer.append(TEXT_2302);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2303);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2304);
    }
    }
    stringBuffer.append(TEXT_2305);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2306);
    } else {
    stringBuffer.append(TEXT_2307);
    }
    stringBuffer.append(TEXT_2308);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_2309);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2310);
    }
    stringBuffer.append(TEXT_2311);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2313);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2315);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_2316);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2317);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2319);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2320);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2321);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2322);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2323);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2324);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2325);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2326);
    } else {
    stringBuffer.append(TEXT_2327);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2328);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2329);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2330);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2331);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2332);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2333);
    } else {
    stringBuffer.append(TEXT_2334);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2335);
    }
    }
    stringBuffer.append(TEXT_2336);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2337);
    } else {
    stringBuffer.append(TEXT_2338);
    }
    stringBuffer.append(TEXT_2339);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_2340);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2341);
    }
    stringBuffer.append(TEXT_2342);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2343);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2344);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2345);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_2346);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2347);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2348);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2349);
    }
    stringBuffer.append(TEXT_2350);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2351);
    } else {
    stringBuffer.append(TEXT_2352);
    }
    stringBuffer.append(TEXT_2353);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_2354);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2355);
    }
    stringBuffer.append(TEXT_2356);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2357);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_2358);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2359);
    if (genFeature.isPrimitiveType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2360);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2361);
    } else if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2362);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2363);
    } else {
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2366);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_2367);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2369);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2370);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2374);
    } else {
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2376);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2377);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2378);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2380);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2381);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2382);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2384);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2385);
    } else {
    stringBuffer.append(TEXT_2386);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2387);
    }
    }
    stringBuffer.append(TEXT_2388);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2389);
    } else {
    stringBuffer.append(TEXT_2390);
    }
    stringBuffer.append(TEXT_2391);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_2392);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_2393);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2394);
    }
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2396);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2398);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2399);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2401);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2402);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2403);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2404);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2405);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2407);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2408);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2409);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2410);
    } else {
    stringBuffer.append(TEXT_2411);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2412);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2413);
    }
    } else {
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2415);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2416);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2418);
    }
    stringBuffer.append(TEXT_2419);
    }
    } else if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2420);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2421);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2423);
    } else {
    stringBuffer.append(TEXT_2424);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2425);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2426);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2427);
    }
    stringBuffer.append(TEXT_2428);
    }
    stringBuffer.append(TEXT_2429);
    }
    stringBuffer.append(TEXT_2430);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2431);
    } else {
    stringBuffer.append(TEXT_2432);
    }
    stringBuffer.append(TEXT_2433);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_2434);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2435);
    }
    stringBuffer.append(TEXT_2436);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2437);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_2438);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2439);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2440);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2441);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2442);
    } else {
    stringBuffer.append(TEXT_2443);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2444);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2445);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2446);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_2447);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2448);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2449);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_2450);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2451);
    } else {
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2453);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2454);
    }
    stringBuffer.append(TEXT_2455);
    }
    stringBuffer.append(TEXT_2456);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2457);
    } else {
    stringBuffer.append(TEXT_2458);
    }
    stringBuffer.append(TEXT_2459);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(TEXT_2461);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2462);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2463);
    }
    stringBuffer.append(TEXT_2464);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) { String safeNameAccessor = genFeature.getSafeName(); if ("featureID".equals(safeNameAccessor)) { safeNameAccessor = "this." + safeNameAccessor; }
    stringBuffer.append(TEXT_2465);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2466);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2467);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2468);
    } else {
    if (genFeature.hasSettingDelegate()) {
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2469);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2470);
    } else {
    stringBuffer.append(TEXT_2471);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2472);
    }
    } else if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2474);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2475);
    } else {
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2478);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2480);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2481);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2482);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2484);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2485);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2487);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2488);
    } else {
    stringBuffer.append(TEXT_2489);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2490);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2491);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2492);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2493);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2494);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2495);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2496);
    } else {
    stringBuffer.append(TEXT_2497);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2498);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2499);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2500);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2501);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2502);
    } else {
    stringBuffer.append(TEXT_2503);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2504);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2505);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2506);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2508);
    } else {
    stringBuffer.append(TEXT_2509);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2510);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2512);
    }
    } else {
    stringBuffer.append(TEXT_2513);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2514);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2515);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2516);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2517);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2518);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2519);
    } else {
    stringBuffer.append(TEXT_2520);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2521);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2522);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2523);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2524);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2525);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2526);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2527);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2528);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2530);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2532);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2533);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2534);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2535);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2537);
    } else {
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2539);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2540);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2541);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2542);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2543);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2544);
    } else {
    stringBuffer.append(TEXT_2545);
    }
    stringBuffer.append(TEXT_2546);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2547);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2548);
    }
    stringBuffer.append(TEXT_2549);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2550);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2551);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2552);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2553);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2554);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2555);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2556);
    }
    stringBuffer.append(TEXT_2557);
    }
    stringBuffer.append(TEXT_2558);
    }
    stringBuffer.append(TEXT_2559);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2560);
    }
    stringBuffer.append(TEXT_2561);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2562);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2563);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2564);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2565);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2567);
    }
    stringBuffer.append(TEXT_2568);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2569);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2570);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2571);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2572);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2574);
    }
    stringBuffer.append(TEXT_2575);
    }
    stringBuffer.append(TEXT_2576);
    }
    if (genModel.isOperationReflection() && isImplementation && (!genClass.getMixinGenOperations().isEmpty() || !genClass.getOverrideGenOperations(genClass.getExtendedGenOperations(), genClass.getImplementedGenOperations()).isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty())) {
    stringBuffer.append(TEXT_2577);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2578);
    }
    stringBuffer.append(TEXT_2579);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2580);
    for (GenClass extendedGenClass : genClass.getExtendedGenClasses()) { List<GenOperation> extendedImplementedGenOperations = extendedGenClass.getImplementedGenOperations(); List<GenOperation> implementedGenOperations = genClass.getImplementedGenOperations();
    if (!genClass.getOverrideGenOperations(extendedImplementedGenOperations, implementedGenOperations).isEmpty()) {
    stringBuffer.append(TEXT_2581);
    stringBuffer.append(extendedGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2582);
    for (GenOperation genOperation : extendedImplementedGenOperations) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    if (implementedGenOperations.contains(overrideGenOperation)) {
    stringBuffer.append(TEXT_2583);
    stringBuffer.append(extendedGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2585);
    }
    }
    stringBuffer.append(TEXT_2586);
    }
    }
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2587);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2588);
    for (GenOperation genOperation : mixinGenClass.getGenOperations()) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_2589);
    stringBuffer.append(mixinGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2590);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2591);
    }
    stringBuffer.append(TEXT_2592);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_2593);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2594);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_2595);
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2597);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2598);
    }
    stringBuffer.append(TEXT_2599);
    }
    stringBuffer.append(TEXT_2600);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2601);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2602);
    }
    stringBuffer.append(TEXT_2603);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2604);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2605);
    }
    stringBuffer.append(TEXT_2606);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2607);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2608);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2609);
    }
    stringBuffer.append(TEXT_2610);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2612);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2613);
    }
    stringBuffer.append(TEXT_2614);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2615);
    }
    stringBuffer.append(TEXT_2616);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2617);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2618);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2619);
    }
    stringBuffer.append(TEXT_2620);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_2621);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2622);
    }
    if (genModel.useGenerics()) {
    boolean isUnchecked = false; boolean isRaw = false; LOOP: for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { for (GenParameter genParameter : genOperation.getGenParameters()) { if (genParameter.isUncheckedCast()) { if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType()) { isUnchecked = true; } if (genParameter.usesOperationTypeParameters() && !genParameter.getEcoreParameter().getEGenericType().getETypeArguments().isEmpty()) { isRaw = true; break LOOP; }}}}
    if (isUnchecked) {
    stringBuffer.append(TEXT_2623);
    if (!isRaw) {
    stringBuffer.append(TEXT_2624);
    } else {
    stringBuffer.append(TEXT_2625);
    }
    stringBuffer.append(TEXT_2626);
    }
    }
    stringBuffer.append(TEXT_2627);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2628);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2629);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_2630);
    for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { List<GenParameter> genParameters = genOperation.getGenParameters(); int size = genParameters.size();  boolean hasCheckedException = genOperation.hasCheckedException(); String indent = hasCheckedException ? "\t" : ""; GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_2631);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(TEXT_2632);
    if (hasCheckedException) {
    stringBuffer.append(TEXT_2633);
    /*}*/}
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(indent);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2635);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2636);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_2637);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_2638);
    }
    stringBuffer.append(TEXT_2639);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2640);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2641);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2642);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_2643);
    }
    }
    stringBuffer.append(TEXT_2644);
    stringBuffer.append(indent);
    stringBuffer.append(TEXT_2645);
    } else {
    stringBuffer.append(TEXT_2646);
    stringBuffer.append(indent);
    stringBuffer.append(TEXT_2647);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2648);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2649);
    }
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2650);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2651);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_2652);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_2653);
    }
    stringBuffer.append(TEXT_2654);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2655);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2656);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2657);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_2658);
    }
    }
    stringBuffer.append(TEXT_2659);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2660);
    }
    stringBuffer.append(TEXT_2661);
    }
    if (hasCheckedException) {/*{*/
    stringBuffer.append(TEXT_2662);
    stringBuffer.append(genModel.getImportedName("java.lang.Throwable"));
    stringBuffer.append(TEXT_2663);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2664);
    }
    }
    stringBuffer.append(TEXT_2665);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2666);
    } else {
    stringBuffer.append(TEXT_2667);
    }
    stringBuffer.append(TEXT_2668);
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2669);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2670);
    }
    stringBuffer.append(TEXT_2671);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2672);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2674);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2675);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2676);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2679);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2680);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2682);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2683);
    }
    stringBuffer.append(TEXT_2684);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2687);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2690);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2691);
    }
    stringBuffer.append(TEXT_2692);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2693);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2695);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_2697);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2698);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2699);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2700);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2701);
    }
    stringBuffer.append(TEXT_2702);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2703);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2704);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2706);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2707);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2708);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2709);
    } else {
    stringBuffer.append(TEXT_2710);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2711);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2712);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2713);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2714);
    }
    } else {
    stringBuffer.append(TEXT_2715);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2716);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2717);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2718);
    if (isGWT) {
    stringBuffer.append(TEXT_2719);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_2720);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2721);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2722);
    if (!isJDK50 && keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2723);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2724);
    } else {
    stringBuffer.append(TEXT_2725);
    }
    stringBuffer.append(TEXT_2726);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2727);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2728);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2729);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2730);
    }
    stringBuffer.append(TEXT_2731);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2732);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2733);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2734);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2735);
    } else {
    stringBuffer.append(TEXT_2736);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2737);
    }
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2739);
    if (!isJDK50 && valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2740);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2741);
    } else {
    stringBuffer.append(TEXT_2742);
    }
    stringBuffer.append(TEXT_2743);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2744);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2745);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2746);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2747);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2749);
    }
    stringBuffer.append(TEXT_2750);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2751);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2752);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2753);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2754);
    } else {
    stringBuffer.append(TEXT_2755);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2756);
    }
    stringBuffer.append(TEXT_2757);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2758);
    }
    stringBuffer.append(TEXT_2759);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2760);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2762);
    }
    if (isImplementation) {
    if (!UML2GenModelUtil.isOperationsClasses(genPackage) && UML2GenModelUtil.hasOCLOperationBodies(genClass) && (!UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass()) || UML2GenModelUtil.isOperationsClasses(genClass.getClassExtendsGenClass().getGenPackage()))) {
    stringBuffer.append(TEXT_2763);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2764);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2765);
    }
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2768);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2769);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2770);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2771);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2772);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2773);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2774);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2775);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2776);
    }
    stringBuffer.append(TEXT_2777);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2780);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2781);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2782);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2784);
    } else {
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2786);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2787);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2788);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2789);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2790);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2791);
    }
    stringBuffer.append(TEXT_2792);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2793);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2794);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2795);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2796);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2797);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2798);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2799);
    }
    stringBuffer.append(TEXT_2800);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2801);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2802);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2803);
    } else {
    stringBuffer.append(TEXT_2804);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2805);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2806);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2807);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2808);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2809);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2810);
    }
    stringBuffer.append(TEXT_2811);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2812);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2813);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2814);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2815);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2816);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2817);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2818);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2819);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2820);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2821);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2822);
    } else {
    stringBuffer.append(TEXT_2823);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2824);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2825);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2826);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2827);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2828);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2829);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2830);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2831);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2832);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2833);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2834);
    } else {
    stringBuffer.append(TEXT_2835);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2836);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2837);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2838);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2839);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2840);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2841);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2842);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2843);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2844);
    }
    }
    }
    stringBuffer.append(TEXT_2845);
    if (isJDK50) { //isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2846);
    }
    }
    stringBuffer.append(TEXT_2847);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2848);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2849);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2850);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2851);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2852);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2853);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2854);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2855);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2856);
    }
    } else {
    stringBuffer.append(TEXT_2857);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2858);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2859);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2860);
    }
    }
    } else {
    stringBuffer.append(TEXT_2861);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2862);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2863);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2864);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2865);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2866);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2867);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2868);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2869);
    }
    } else {
    stringBuffer.append(TEXT_2870);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2871);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2872);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2873);
    }
    }
    } else {
    stringBuffer.append(TEXT_2874);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2875);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2876);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2877);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2878);
    } else {
    stringBuffer.append(TEXT_2879);
    }
    }
    stringBuffer.append(TEXT_2880);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2881);
    if (isJDK50) { //getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2882);
    }
    }
    stringBuffer.append(TEXT_2883);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2884);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2885);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType(genClass).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_2886);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2887);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2888);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2889);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2890);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2891);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2892);
    } else {
    stringBuffer.append(TEXT_2893);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2894);
    }
    } else {
    stringBuffer.append(TEXT_2895);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList"));
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2896);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2897);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2898);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2899);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2900);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2901);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2902);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2903);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2904);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2905);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2906);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2907);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2908);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2909);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2910);
    } else {
    stringBuffer.append(TEXT_2911);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2912);
    }
    }
    stringBuffer.append(TEXT_2913);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2914);
    if (isJDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2915);
    }
    }
    stringBuffer.append(TEXT_2916);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2917);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2918);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2919);
    } else {
    stringBuffer.append(TEXT_2920);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2921);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2922);
    }
    stringBuffer.append(TEXT_2923);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2924);
    if (isJDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2925);
    }
    }
    stringBuffer.append(TEXT_2926);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2927);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2928);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_2929);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2930);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2931);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2932);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2933);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2934);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2935);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2936);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2937);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2938);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2939);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2940);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2941);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2942);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2943);
    }
    stringBuffer.append(TEXT_2944);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2945);
    } else {
    stringBuffer.append(TEXT_2946);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2947);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2948);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2949);
    }
    stringBuffer.append(TEXT_2950);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2951);
    }
    }
    stringBuffer.append(TEXT_2952);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2953);
    if (isJDK50) { //setGenFeature.annotations.insert.javajetinc
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2954);
    }
    }
    stringBuffer.append(TEXT_2955);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2956);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2957);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2958);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2959);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2960);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2961);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2962);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2963);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2964);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2965);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2966);
    }
    stringBuffer.append(TEXT_2967);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2968);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2969);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2970);
    }
    stringBuffer.append(TEXT_2971);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2972);
    }
    stringBuffer.append(TEXT_2973);
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2974);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2975);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2976);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2977);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2978);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2979);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2980);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2981);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2982);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2983);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2984);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2985);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2986);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2987);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_2988);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2989);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2990);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2991);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2992);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2993);
    } else {
    stringBuffer.append(TEXT_2994);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2995);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2996);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2997);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2998);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2999);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3000);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3001);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3002);
    } else {
    stringBuffer.append(TEXT_3003);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_3004);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3005);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3006);
    }
    }
    stringBuffer.append(TEXT_3007);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3008);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3009);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3010);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3011);
    }
    stringBuffer.append(TEXT_3012);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3013);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3014);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3015);
    }
    } else {
    stringBuffer.append(TEXT_3016);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3017);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3018);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3019);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3020);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3021);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3022);
    }
    stringBuffer.append(TEXT_3023);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3024);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3025);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3026);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3027);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3028);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3029);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3030);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_3031);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3032);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3033);
    } else {
    stringBuffer.append(TEXT_3034);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3035);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3036);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3037);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3038);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_3039);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3040);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3041);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3042);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3043);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3044);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3045);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3046);
    index++;}
    stringBuffer.append(TEXT_3047);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3048);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3049);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3050);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3051);
    }
    stringBuffer.append(TEXT_3052);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3053);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3054);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3055);
    }
    stringBuffer.append(TEXT_3056);
    } else {
    stringBuffer.append(TEXT_3057);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3058);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3059);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3060);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_3061);
    }
    } else {
    stringBuffer.append(TEXT_3062);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3063);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3064);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3065);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3066);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3067);
    } else {
    stringBuffer.append(TEXT_3068);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3069);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_3070);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3071);
    }
    index++;}
    }
    stringBuffer.append(TEXT_3072);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3073);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3074);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_3075);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_3076);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3077);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3078);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3079);
    } else {
    stringBuffer.append(TEXT_3080);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_3081);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3082);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3083);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3084);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_3085);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_3086);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3087);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3088);
    } else {
    stringBuffer.append(TEXT_3089);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_3090);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3091);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3092);
    }
    }
    stringBuffer.append(TEXT_3093);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3094);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3095);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3096);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3097);
    }
    stringBuffer.append(TEXT_3098);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_3099);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3100);
    }
    } else {
    stringBuffer.append(TEXT_3101);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3102);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3103);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3104);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3105);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3106);
    }
    stringBuffer.append(TEXT_3107);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3108);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3109);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3110);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3111);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3112);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_3113);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_3114);
    } else {
    stringBuffer.append(TEXT_3115);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3116);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3117);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3118);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_3119);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_3120);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3121);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3122);
    } else {
    stringBuffer.append(TEXT_3123);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3124);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3125);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3126);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3127);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_3128);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3129);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3130);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3131);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3132);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3133);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3134);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3135);
    index++;}
    stringBuffer.append(TEXT_3136);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3137);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3138);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3139);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3140);
    }
    stringBuffer.append(TEXT_3141);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3142);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3143);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3144);
    }
    stringBuffer.append(TEXT_3145);
    } else {
    stringBuffer.append(TEXT_3146);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3147);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3148);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3149);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_3150);
    }
    } else {
    stringBuffer.append(TEXT_3151);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3152);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3153);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3154);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3155);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3156);
    } else {
    stringBuffer.append(TEXT_3157);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3158);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_3159);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3160);
    }
    index++;}
    }
    stringBuffer.append(TEXT_3161);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3162);
    }
    stringBuffer.append(TEXT_3163);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3164);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3165);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3166);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3167);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3168);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3169);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3170);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3171);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3172);
    }
    stringBuffer.append(TEXT_3173);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3174);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3175);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3176);
    }
    } else {
    stringBuffer.append(TEXT_3177);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3178);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3179);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3180);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3181);
    }
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3182);
    }
    stringBuffer.append(TEXT_3183);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3184);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3185);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3186);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3187);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3188);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3189);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3190);
    }
    stringBuffer.append(TEXT_3191);
    }
    }
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3192);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3193);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3194);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3195);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3196);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3197);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3198);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3199);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3200);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3201);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3202);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3203);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3204);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3205);
    }
    stringBuffer.append(TEXT_3206);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3207);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3208);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3209);
    }
    } else {
    stringBuffer.append(TEXT_3210);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3211);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3212);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3213);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3214);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3215);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3216);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3217);
    }
    stringBuffer.append(TEXT_3218);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3219);
    }
    stringBuffer.append(TEXT_3220);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3221);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3222);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3223);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3224);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3225);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3226);
    }
    stringBuffer.append(TEXT_3227);
    if (isJDK50) {
    stringBuffer.append(TEXT_3228);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3229);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_3230);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3231);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3232);
    } else {
    stringBuffer.append(TEXT_3233);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3234);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_3235);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3236);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3237);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3238);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3239);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3240);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3241);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3242);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3243);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3244);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3245);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3246);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3247);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3248);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3249);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_3250);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_3251);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_3252);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3253);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_3254);
    }
    }
    stringBuffer.append(TEXT_3255);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3256);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3257);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3258);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3259);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_3260);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3261);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3262);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3263);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3264);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_3265);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_3266);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3267);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3268);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3269);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3270);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3271);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3272);
    } else {
    stringBuffer.append(TEXT_3273);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3274);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3275);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3276);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3277);
    }
    stringBuffer.append(TEXT_3278);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3279);
    index++;}
    stringBuffer.append(TEXT_3280);
    } else {
    stringBuffer.append(TEXT_3281);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3282);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3283);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3284);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3285);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3286);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3287);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3288);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3289);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3290);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3291);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3292);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3293);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3294);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3295);
    } else {
    stringBuffer.append(TEXT_3296);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3297);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3298);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3299);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3300);
    }
    stringBuffer.append(TEXT_3301);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3302);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3303);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3304);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3305);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3306);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3307);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3308);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3309);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3310);
    } else {
    stringBuffer.append(TEXT_3311);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3312);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3313);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3314);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3315);
    }
    stringBuffer.append(TEXT_3316);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3317);
    index++;}
    }
    stringBuffer.append(TEXT_3318);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3319);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3320);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3321);
    }
    stringBuffer.append(TEXT_3322);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3323);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3324);
    }
    stringBuffer.append(TEXT_3325);
    } else {
    stringBuffer.append(TEXT_3326);
    }
    stringBuffer.append(TEXT_3327);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_3328);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3329);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_3330);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3331);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3332);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_3333);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3334);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3335);
    } else {
    stringBuffer.append(TEXT_3336);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3337);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3338);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3339);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3340);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3341);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3342);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3343);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3344);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3345);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3346);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3347);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3348);
    } else {
    stringBuffer.append(TEXT_3349);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3350);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3351);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3352);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3353);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3354);
    } else {
    stringBuffer.append(TEXT_3355);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3356);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3357);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3358);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3359);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3360);
    } else {
    stringBuffer.append(TEXT_3361);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3362);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_3363);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3364);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3365);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3366);
    } else {
    stringBuffer.append(TEXT_3367);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3368);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3369);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3370);
    }
    } else {
    stringBuffer.append(TEXT_3371);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3372);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3373);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3374);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3375);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3376);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3377);
    } else {
    stringBuffer.append(TEXT_3378);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3379);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3380);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3381);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3382);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3383);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3384);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3385);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3386);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3387);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3388);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3389);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3390);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3391);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3392);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3393);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3394);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3395);
    } else {
    stringBuffer.append(TEXT_3396);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3397);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3398);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3399);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3400);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3401);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3402);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_3403);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3404);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3405);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3406);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3407);
    }
    stringBuffer.append(TEXT_3408);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3409);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_3410);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_3411);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3412);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_3413);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3414);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_3415);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_3416);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3417);
    } else {
    stringBuffer.append(TEXT_3418);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3419);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_3420);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3421);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3422);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3423);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3424);
    } else {
    stringBuffer.append(TEXT_3425);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3426);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3427);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3428);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_3429);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_3430);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3431);
    } else {
    stringBuffer.append(TEXT_3432);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3433);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3434);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_3435);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_3436);
    if (isJDK50) { //genOperation.annotations.insert.javajetinc
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_3437);
    }
    }
    stringBuffer.append(TEXT_3438);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_3439);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3440);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_3441);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_3442);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_3443);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3444);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3445);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_3446);
    } else {
    stringBuffer.append(TEXT_3447);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3448);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3449);
    }
    }
    stringBuffer.append(TEXT_3450);
    }
    }
    stringBuffer.append(TEXT_3451);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_3452);
    return stringBuffer.toString();
  }
}
