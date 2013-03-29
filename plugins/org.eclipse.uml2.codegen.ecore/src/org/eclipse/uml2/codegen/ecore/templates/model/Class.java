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
  protected final String TEXT_213 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_214 = NL + "\t@Override";
  protected final String TEXT_215 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_216 = ";" + NL + "\t}" + NL;
  protected final String TEXT_217 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific element type known in this context." + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_218 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_219 = NL + "\t@Override";
  protected final String TEXT_220 = NL + "\tpublic ";
  protected final String TEXT_221 = "[] ";
  protected final String TEXT_222 = "()" + NL + "\t{";
  protected final String TEXT_223 = NL + "\t\t";
  protected final String TEXT_224 = " list = (";
  protected final String TEXT_225 = ")";
  protected final String TEXT_226 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_227 = "_EEMPTY_ARRAY;";
  protected final String TEXT_228 = NL + "\t\tif (";
  protected final String TEXT_229 = " == null || ";
  protected final String TEXT_230 = ".isEmpty()) return ";
  protected final String TEXT_231 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_232 = " list = (";
  protected final String TEXT_233 = ")";
  protected final String TEXT_234 = ";";
  protected final String TEXT_235 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_236 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_237 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific element type known in this context." + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_238 = NL + "\t@Override";
  protected final String TEXT_239 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_240 = NL + "\t@Override";
  protected final String TEXT_241 = NL + "\tpublic ";
  protected final String TEXT_242 = " ";
  protected final String TEXT_243 = "_";
  protected final String TEXT_244 = "()" + NL + "\t{";
  protected final String TEXT_245 = NL + "\t\t";
  protected final String TEXT_246 = " ";
  protected final String TEXT_247 = " = (";
  protected final String TEXT_248 = ")eVirtualGet(";
  protected final String TEXT_249 = ");";
  protected final String TEXT_250 = NL + "\t\tif (";
  protected final String TEXT_251 = " == null)" + NL + "\t\t{";
  protected final String TEXT_252 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_253 = ", ";
  protected final String TEXT_254 = " = new ";
  protected final String TEXT_255 = ");";
  protected final String TEXT_256 = NL + "\t\t\t";
  protected final String TEXT_257 = " = new ";
  protected final String TEXT_258 = ";";
  protected final String TEXT_259 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_260 = ";" + NL + "\t}" + NL;
  protected final String TEXT_261 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific type known in this context." + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_262 = NL + "\t@Override";
  protected final String TEXT_263 = NL + "\t@Override";
  protected final String TEXT_264 = NL + "\tpublic ";
  protected final String TEXT_265 = " basicSet";
  protected final String TEXT_266 = "(";
  protected final String TEXT_267 = " new";
  protected final String TEXT_268 = ", ";
  protected final String TEXT_269 = " msgs)" + NL + "\t{" + NL + "\t\treturn super.basicSet";
  protected final String TEXT_270 = "(new";
  protected final String TEXT_271 = ", msgs);" + NL + "\t}" + NL;
  protected final String TEXT_272 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * This is specialized for the more specific type known in this context." + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_273 = NL + "\t@Override";
  protected final String TEXT_274 = NL + "\t@Override";
  protected final String TEXT_275 = NL + "\tpublic void set";
  protected final String TEXT_276 = "_";
  protected final String TEXT_277 = "(";
  protected final String TEXT_278 = " ";
  protected final String TEXT_279 = ")" + NL + "\t{" + NL + "\t\tsuper.set";
  protected final String TEXT_280 = "_";
  protected final String TEXT_281 = "(";
  protected final String TEXT_282 = ");" + NL + "\t}" + NL;
  protected final String TEXT_283 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_284 = NL + "\t";
  protected final String TEXT_285 = "[] ";
  protected final String TEXT_286 = "();" + NL;
  protected final String TEXT_287 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_288 = NL + "\tpublic ";
  protected final String TEXT_289 = "[] ";
  protected final String TEXT_290 = "()" + NL + "\t{";
  protected final String TEXT_291 = NL + "\t\t";
  protected final String TEXT_292 = " list = (";
  protected final String TEXT_293 = ")";
  protected final String TEXT_294 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_295 = "_EEMPTY_ARRAY;";
  protected final String TEXT_296 = NL + "\t\tif (";
  protected final String TEXT_297 = " == null || ";
  protected final String TEXT_298 = ".isEmpty()) return ";
  protected final String TEXT_299 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_300 = " list = (";
  protected final String TEXT_301 = ")";
  protected final String TEXT_302 = ";";
  protected final String TEXT_303 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_304 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_305 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_306 = NL + "\t";
  protected final String TEXT_307 = " get";
  protected final String TEXT_308 = "(int index);" + NL;
  protected final String TEXT_309 = NL + "\tpublic ";
  protected final String TEXT_310 = " get";
  protected final String TEXT_311 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_312 = "(";
  protected final String TEXT_313 = ")";
  protected final String TEXT_314 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_315 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_316 = NL + "\tint get";
  protected final String TEXT_317 = "Length();" + NL;
  protected final String TEXT_318 = NL + "\tpublic int get";
  protected final String TEXT_319 = "Length()" + NL + "\t{";
  protected final String TEXT_320 = NL + "\t\treturn ";
  protected final String TEXT_321 = "().size();";
  protected final String TEXT_322 = NL + "\t\treturn ";
  protected final String TEXT_323 = " == null ? 0 : ";
  protected final String TEXT_324 = ".size();";
  protected final String TEXT_325 = NL + "\t}" + NL;
  protected final String TEXT_326 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_327 = NL + "\tvoid set";
  protected final String TEXT_328 = "(";
  protected final String TEXT_329 = "[] new";
  protected final String TEXT_330 = ");" + NL;
  protected final String TEXT_331 = NL + "\tpublic void set";
  protected final String TEXT_332 = "(";
  protected final String TEXT_333 = "[] new";
  protected final String TEXT_334 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_335 = ")";
  protected final String TEXT_336 = "()).setData(new";
  protected final String TEXT_337 = ".length, new";
  protected final String TEXT_338 = ");" + NL + "\t}" + NL;
  protected final String TEXT_339 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_340 = NL + "\tvoid set";
  protected final String TEXT_341 = "(int index, ";
  protected final String TEXT_342 = " element);" + NL;
  protected final String TEXT_343 = NL + "\tpublic void set";
  protected final String TEXT_344 = "(int index, ";
  protected final String TEXT_345 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_346 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_347 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_348 = "</b></em>' ";
  protected final String TEXT_349 = ".";
  protected final String TEXT_350 = NL + "\t * The key is of type ";
  protected final String TEXT_351 = "list of {@link ";
  protected final String TEXT_352 = "}";
  protected final String TEXT_353 = "{@link ";
  protected final String TEXT_354 = "}";
  protected final String TEXT_355 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_356 = "list of {@link ";
  protected final String TEXT_357 = "}";
  protected final String TEXT_358 = "{@link ";
  protected final String TEXT_359 = "}";
  protected final String TEXT_360 = ",";
  protected final String TEXT_361 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_362 = "}";
  protected final String TEXT_363 = ".";
  protected final String TEXT_364 = NL + "\t * The default value is <code>";
  protected final String TEXT_365 = "</code>.";
  protected final String TEXT_366 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_367 = "}.";
  protected final String TEXT_368 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_369 = "#";
  protected final String TEXT_370 = " <em>";
  protected final String TEXT_371 = "</em>}'.";
  protected final String TEXT_372 = NL + "\t * <p>" + NL + "\t * This feature subsets the following features:" + NL + "\t * <ul>";
  protected final String TEXT_373 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_374 = "#";
  protected final String TEXT_375 = "() <em>";
  protected final String TEXT_376 = "</em>}'</li>";
  protected final String TEXT_377 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_378 = NL + "\t * <p>" + NL + "\t * This feature redefines the following features:" + NL + "\t * <ul>";
  protected final String TEXT_379 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_380 = "#";
  protected final String TEXT_381 = "() <em>";
  protected final String TEXT_382 = "</em>}'</li>";
  protected final String TEXT_383 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_384 = NL + "\t * This feature is a derived union.";
  protected final String TEXT_385 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_386 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_387 = "</em>' ";
  protected final String TEXT_388 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_389 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_390 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_391 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_392 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_393 = "</em>' ";
  protected final String TEXT_394 = ".";
  protected final String TEXT_395 = NL + "\t * @see ";
  protected final String TEXT_396 = NL + "\t * @see #isSet";
  protected final String TEXT_397 = "()";
  protected final String TEXT_398 = NL + "\t * @see #unset";
  protected final String TEXT_399 = "()";
  protected final String TEXT_400 = NL + "\t * @see #set";
  protected final String TEXT_401 = "(";
  protected final String TEXT_402 = ")";
  protected final String TEXT_403 = NL + "\t * @see ";
  protected final String TEXT_404 = "#get";
  protected final String TEXT_405 = "()";
  protected final String TEXT_406 = NL + "\t * @see ";
  protected final String TEXT_407 = "#";
  protected final String TEXT_408 = NL + "\t * @model ";
  protected final String TEXT_409 = NL + "\t *        ";
  protected final String TEXT_410 = NL + "\t * @model";
  protected final String TEXT_411 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_412 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_413 = NL + "\t@Override";
  protected final String TEXT_414 = NL + "\t";
  protected final String TEXT_415 = " ";
  protected final String TEXT_416 = "();" + NL;
  protected final String TEXT_417 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_418 = NL + "\tpublic ";
  protected final String TEXT_419 = " ";
  protected final String TEXT_420 = "_";
  protected final String TEXT_421 = "()" + NL + "\t{";
  protected final String TEXT_422 = NL + "\t\treturn ";
  protected final String TEXT_423 = "(";
  protected final String TEXT_424 = "(";
  protected final String TEXT_425 = ")eDynamicGet(";
  protected final String TEXT_426 = ", ";
  protected final String TEXT_427 = ", true, ";
  protected final String TEXT_428 = ")";
  protected final String TEXT_429 = ").";
  protected final String TEXT_430 = "()";
  protected final String TEXT_431 = ";";
  protected final String TEXT_432 = NL + "\t\t";
  protected final String TEXT_433 = NL + "\t\treturn ";
  protected final String TEXT_434 = "(";
  protected final String TEXT_435 = "(";
  protected final String TEXT_436 = ")eGet(";
  protected final String TEXT_437 = ", true)";
  protected final String TEXT_438 = ").";
  protected final String TEXT_439 = "()";
  protected final String TEXT_440 = ";";
  protected final String TEXT_441 = NL + "\t\treturn ";
  protected final String TEXT_442 = "(";
  protected final String TEXT_443 = "(";
  protected final String TEXT_444 = ")";
  protected final String TEXT_445 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false)";
  protected final String TEXT_446 = ").";
  protected final String TEXT_447 = "()";
  protected final String TEXT_448 = ";";
  protected final String TEXT_449 = NL + "\t\t";
  protected final String TEXT_450 = " ";
  protected final String TEXT_451 = " = (";
  protected final String TEXT_452 = ")eVirtualGet(";
  protected final String TEXT_453 = ");";
  protected final String TEXT_454 = NL + "\t\tif (";
  protected final String TEXT_455 = " == null)" + NL + "\t\t{";
  protected final String TEXT_456 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_457 = ", ";
  protected final String TEXT_458 = " = new ";
  protected final String TEXT_459 = ");";
  protected final String TEXT_460 = NL + "\t\t\t";
  protected final String TEXT_461 = " = new ";
  protected final String TEXT_462 = ";";
  protected final String TEXT_463 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_464 = ";";
  protected final String TEXT_465 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_466 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_467 = ")";
  protected final String TEXT_468 = "eContainer";
  protected final String TEXT_469 = "eInternalContainer";
  protected final String TEXT_470 = "();";
  protected final String TEXT_471 = NL + "\t\t";
  protected final String TEXT_472 = " ";
  protected final String TEXT_473 = " = (";
  protected final String TEXT_474 = ")eVirtualGet(";
  protected final String TEXT_475 = ", ";
  protected final String TEXT_476 = ");";
  protected final String TEXT_477 = NL + "\t\tif (";
  protected final String TEXT_478 = " != null && ";
  protected final String TEXT_479 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_480 = " old";
  protected final String TEXT_481 = " = (";
  protected final String TEXT_482 = ")";
  protected final String TEXT_483 = ";" + NL + "\t\t\t";
  protected final String TEXT_484 = " = ";
  protected final String TEXT_485 = "eResolveProxy(old";
  protected final String TEXT_486 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_487 = " != old";
  protected final String TEXT_488 = ")" + NL + "\t\t\t{";
  protected final String TEXT_489 = NL + "\t\t\t\t";
  protected final String TEXT_490 = " new";
  protected final String TEXT_491 = " = (";
  protected final String TEXT_492 = ")";
  protected final String TEXT_493 = ";";
  protected final String TEXT_494 = NL + "\t\t\t\t";
  protected final String TEXT_495 = " msgs = old";
  protected final String TEXT_496 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_497 = ", null, null);";
  protected final String TEXT_498 = NL + "\t\t\t\t";
  protected final String TEXT_499 = " msgs =  old";
  protected final String TEXT_500 = ".eInverseRemove(this, ";
  protected final String TEXT_501 = ", ";
  protected final String TEXT_502 = ".class, null);";
  protected final String TEXT_503 = NL + "\t\t\t\tif (new";
  protected final String TEXT_504 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_505 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_506 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_507 = ", null, msgs);";
  protected final String TEXT_508 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_509 = ".eInverseAdd(this, ";
  protected final String TEXT_510 = ", ";
  protected final String TEXT_511 = ".class, msgs);";
  protected final String TEXT_512 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_513 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_514 = ", ";
  protected final String TEXT_515 = ");";
  protected final String TEXT_516 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_517 = "(this, ";
  protected final String TEXT_518 = ".RESOLVE, ";
  protected final String TEXT_519 = ", old";
  protected final String TEXT_520 = ", ";
  protected final String TEXT_521 = "));";
  protected final String TEXT_522 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_523 = NL + "\t\treturn (";
  protected final String TEXT_524 = ")eVirtualGet(";
  protected final String TEXT_525 = ", ";
  protected final String TEXT_526 = ");";
  protected final String TEXT_527 = NL + "\t\treturn (";
  protected final String TEXT_528 = " & ";
  protected final String TEXT_529 = "_EFLAG) != 0;";
  protected final String TEXT_530 = NL + "\t\treturn ";
  protected final String TEXT_531 = "_EFLAG_VALUES[(";
  protected final String TEXT_532 = " & ";
  protected final String TEXT_533 = "_EFLAG) >>> ";
  protected final String TEXT_534 = "_EFLAG_OFFSET];";
  protected final String TEXT_535 = NL + "\t\treturn ";
  protected final String TEXT_536 = ";";
  protected final String TEXT_537 = NL + "\t\t";
  protected final String TEXT_538 = " ";
  protected final String TEXT_539 = " = basicGet";
  protected final String TEXT_540 = "();" + NL + "\t\treturn ";
  protected final String TEXT_541 = " != null && ";
  protected final String TEXT_542 = ".eIsProxy() ? ";
  protected final String TEXT_543 = "eResolveProxy((";
  protected final String TEXT_544 = ")";
  protected final String TEXT_545 = ") : ";
  protected final String TEXT_546 = ";";
  protected final String TEXT_547 = NL + "\t\treturn new ";
  protected final String TEXT_548 = "((";
  protected final String TEXT_549 = ".Internal)((";
  protected final String TEXT_550 = ".Internal.Wrapper)get";
  protected final String TEXT_551 = "()).featureMap().";
  protected final String TEXT_552 = "list(";
  protected final String TEXT_553 = "));";
  protected final String TEXT_554 = NL + "\t\treturn (";
  protected final String TEXT_555 = ")get";
  protected final String TEXT_556 = "().";
  protected final String TEXT_557 = "list(";
  protected final String TEXT_558 = ");";
  protected final String TEXT_559 = NL + "\t\treturn ((";
  protected final String TEXT_560 = ".Internal.Wrapper)get";
  protected final String TEXT_561 = "()).featureMap().list(";
  protected final String TEXT_562 = ");";
  protected final String TEXT_563 = NL + "\t\treturn get";
  protected final String TEXT_564 = "().list(";
  protected final String TEXT_565 = ");";
  protected final String TEXT_566 = NL + "\t\treturn ";
  protected final String TEXT_567 = "(";
  protected final String TEXT_568 = "(";
  protected final String TEXT_569 = ")";
  protected final String TEXT_570 = "((";
  protected final String TEXT_571 = ".Internal.Wrapper)get";
  protected final String TEXT_572 = "()).featureMap().get(";
  protected final String TEXT_573 = ", true)";
  protected final String TEXT_574 = ").";
  protected final String TEXT_575 = "()";
  protected final String TEXT_576 = ";";
  protected final String TEXT_577 = NL + "\t\treturn ";
  protected final String TEXT_578 = "(";
  protected final String TEXT_579 = "(";
  protected final String TEXT_580 = ")";
  protected final String TEXT_581 = "get";
  protected final String TEXT_582 = "().get(";
  protected final String TEXT_583 = ", true)";
  protected final String TEXT_584 = ").";
  protected final String TEXT_585 = "()";
  protected final String TEXT_586 = ";";
  protected final String TEXT_587 = NL + "\t\t";
  protected final String TEXT_588 = NL + "\t\t";
  protected final String TEXT_589 = NL + "\t\t";
  protected final String TEXT_590 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_591 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_592 = NL + "\t\t\t";
  protected final String TEXT_593 = " result = (";
  protected final String TEXT_594 = ") cache.get(";
  protected final String TEXT_595 = "eResource(), ";
  protected final String TEXT_596 = "this, ";
  protected final String TEXT_597 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_598 = "eResource(), ";
  protected final String TEXT_599 = "this, ";
  protected final String TEXT_600 = ", result = ";
  protected final String TEXT_601 = "new ";
  protected final String TEXT_602 = "(";
  protected final String TEXT_603 = ".";
  protected final String TEXT_604 = "(this)";
  protected final String TEXT_605 = ")";
  protected final String TEXT_606 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_607 = ".";
  protected final String TEXT_608 = "()";
  protected final String TEXT_609 = ";" + NL + "\t\t}";
  protected final String TEXT_610 = NL + "\t\treturn ";
  protected final String TEXT_611 = ".";
  protected final String TEXT_612 = "(this);";
  protected final String TEXT_613 = NL + "\t\t";
  protected final String TEXT_614 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_615 = " eResource = eResource();";
  protected final String TEXT_616 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_617 = NL + "\t\t\t";
  protected final String TEXT_618 = " ";
  protected final String TEXT_619 = " = (";
  protected final String TEXT_620 = ") cache.get(eResource, this, ";
  protected final String TEXT_621 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_622 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_623 = ", ";
  protected final String TEXT_624 = " = new ";
  protected final String TEXT_625 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_626 = ";" + NL + "\t\t}";
  protected final String TEXT_627 = NL + "\t\treturn new ";
  protected final String TEXT_628 = ";";
  protected final String TEXT_629 = NL + "\t\t";
  protected final String TEXT_630 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_631 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_632 = " method = getClass().getMethod(\"";
  protected final String TEXT_633 = "\", null);";
  protected final String TEXT_634 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_635 = NL + "\t\t\t\t";
  protected final String TEXT_636 = " ";
  protected final String TEXT_637 = " = (";
  protected final String TEXT_638 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_639 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_640 = " union = ";
  protected final String TEXT_641 = "Helper(new ";
  protected final String TEXT_642 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_643 = " = new ";
  protected final String TEXT_644 = "(this, ";
  protected final String TEXT_645 = "null";
  protected final String TEXT_646 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_647 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_648 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_649 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_650 = NL + "\t\t\t";
  protected final String TEXT_651 = " ";
  protected final String TEXT_652 = " = (";
  protected final String TEXT_653 = ") cache.get(eResource(), this, ";
  protected final String TEXT_654 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_655 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_656 = " union = ";
  protected final String TEXT_657 = "Helper(new ";
  protected final String TEXT_658 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_659 = ", ";
  protected final String TEXT_660 = " = new ";
  protected final String TEXT_661 = "(this, ";
  protected final String TEXT_662 = "null";
  protected final String TEXT_663 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_664 = ";";
  protected final String TEXT_665 = NL + "\t\t}";
  protected final String TEXT_666 = NL + "\t\t";
  protected final String TEXT_667 = " union = ";
  protected final String TEXT_668 = "Helper(new ";
  protected final String TEXT_669 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_670 = "(this, ";
  protected final String TEXT_671 = "null";
  protected final String TEXT_672 = ", union.size(), union.toArray());";
  protected final String TEXT_673 = NL + "\t\tif (isSet";
  protected final String TEXT_674 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_675 = "();" + NL + "\t\t}";
  protected final String TEXT_676 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_677 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_678 = "();" + NL + "\t\t}";
  protected final String TEXT_679 = NL + "\t\t";
  protected final String TEXT_680 = " ";
  protected final String TEXT_681 = " = ";
  protected final String TEXT_682 = "();" + NL + "\t\tif (";
  protected final String TEXT_683 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_684 = ";" + NL + "\t\t}";
  protected final String TEXT_685 = NL + "\t\treturn ";
  protected final String TEXT_686 = "super.";
  protected final String TEXT_687 = "()";
  protected final String TEXT_688 = "null";
  protected final String TEXT_689 = ";";
  protected final String TEXT_690 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_691 = "' ";
  protected final String TEXT_692 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_693 = NL + "\t}" + NL;
  protected final String TEXT_694 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_695 = NL + "\t@Override";
  protected final String TEXT_696 = NL + "\tpublic ";
  protected final String TEXT_697 = " basicGet";
  protected final String TEXT_698 = "()" + NL + "\t{";
  protected final String TEXT_699 = NL + "\t\treturn (";
  protected final String TEXT_700 = ")eDynamicGet(";
  protected final String TEXT_701 = ", ";
  protected final String TEXT_702 = ", false, ";
  protected final String TEXT_703 = ");";
  protected final String TEXT_704 = NL + "\t\treturn ";
  protected final String TEXT_705 = "(";
  protected final String TEXT_706 = "(";
  protected final String TEXT_707 = ")";
  protected final String TEXT_708 = "__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false)";
  protected final String TEXT_709 = ").";
  protected final String TEXT_710 = "()";
  protected final String TEXT_711 = ";";
  protected final String TEXT_712 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_713 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_714 = ")eInternalContainer();";
  protected final String TEXT_715 = NL + "\t\treturn (";
  protected final String TEXT_716 = ")eVirtualGet(";
  protected final String TEXT_717 = ");";
  protected final String TEXT_718 = NL + "\t\treturn ";
  protected final String TEXT_719 = ";";
  protected final String TEXT_720 = NL + "\t\treturn (";
  protected final String TEXT_721 = ")((";
  protected final String TEXT_722 = ".Internal.Wrapper)get";
  protected final String TEXT_723 = "()).featureMap().get(";
  protected final String TEXT_724 = ", false);";
  protected final String TEXT_725 = NL + "\t\treturn (";
  protected final String TEXT_726 = ")get";
  protected final String TEXT_727 = "().get(";
  protected final String TEXT_728 = ", false);";
  protected final String TEXT_729 = NL + "\t\t";
  protected final String TEXT_730 = NL + "\t\treturn ";
  protected final String TEXT_731 = ".";
  protected final String TEXT_732 = "(this);";
  protected final String TEXT_733 = NL + "\t\tif (isSet";
  protected final String TEXT_734 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_735 = "basicGet";
  protected final String TEXT_736 = "();" + NL + "\t\t}";
  protected final String TEXT_737 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_738 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_739 = "basicGet";
  protected final String TEXT_740 = "();" + NL + "\t\t}";
  protected final String TEXT_741 = NL + "\t\t";
  protected final String TEXT_742 = " ";
  protected final String TEXT_743 = " = ";
  protected final String TEXT_744 = "basicGet";
  protected final String TEXT_745 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_746 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_747 = ";" + NL + "\t\t}";
  protected final String TEXT_748 = NL + "\t\treturn ";
  protected final String TEXT_749 = "super.basicGet";
  protected final String TEXT_750 = "()";
  protected final String TEXT_751 = "null";
  protected final String TEXT_752 = ";";
  protected final String TEXT_753 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_754 = "' ";
  protected final String TEXT_755 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_756 = NL + "\t}" + NL;
  protected final String TEXT_757 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_758 = NL + "\t@Override";
  protected final String TEXT_759 = NL + "\tpublic ";
  protected final String TEXT_760 = " basicSet";
  protected final String TEXT_761 = "(";
  protected final String TEXT_762 = " new";
  protected final String TEXT_763 = ", ";
  protected final String TEXT_764 = " msgs)" + NL + "\t{";
  protected final String TEXT_765 = NL + "\t\tif (new";
  protected final String TEXT_766 = " != null && !(new";
  protected final String TEXT_767 = " instanceof ";
  protected final String TEXT_768 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(\"new";
  protected final String TEXT_769 = " must be an instance of ";
  protected final String TEXT_770 = "\");";
  protected final String TEXT_771 = NL + "\t\t}";
  protected final String TEXT_772 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_773 = ")new";
  protected final String TEXT_774 = ", ";
  protected final String TEXT_775 = ", msgs);";
  protected final String TEXT_776 = NL + "\t\t";
  protected final String TEXT_777 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_778 = NL + "\t\t\t";
  protected final String TEXT_779 = " ";
  protected final String TEXT_780 = " = ";
  protected final String TEXT_781 = "();";
  protected final String TEXT_782 = NL + "\t\t\tObject ";
  protected final String TEXT_783 = " = eVirtualGet(";
  protected final String TEXT_784 = ");";
  protected final String TEXT_785 = NL + "\t\t\tif (";
  protected final String TEXT_786 = " != null && ";
  protected final String TEXT_787 = " != new";
  protected final String TEXT_788 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_789 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_790 = NL + "\t\t\tif (new";
  protected final String TEXT_791 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_792 = NL + "\t\t\t\t";
  protected final String TEXT_793 = " ";
  protected final String TEXT_794 = " = ";
  protected final String TEXT_795 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_796 = ".contains(new";
  protected final String TEXT_797 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_798 = ".add(new";
  protected final String TEXT_799 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_800 = NL + "\t\t\t\t";
  protected final String TEXT_801 = " ";
  protected final String TEXT_802 = " = ";
  protected final String TEXT_803 = "();";
  protected final String TEXT_804 = NL + "\t\t\t\tObject ";
  protected final String TEXT_805 = " = eVirtualGet(";
  protected final String TEXT_806 = ");";
  protected final String TEXT_807 = NL + "\t\t\t\tif (new";
  protected final String TEXT_808 = " != ";
  protected final String TEXT_809 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_810 = "(new";
  protected final String TEXT_811 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_812 = NL + "\t\t\t}";
  protected final String TEXT_813 = NL + "\t\t}";
  protected final String TEXT_814 = NL + "\t\treturn msgs;";
  protected final String TEXT_815 = NL + "\t\tif (new";
  protected final String TEXT_816 = " != null && !(new";
  protected final String TEXT_817 = " instanceof ";
  protected final String TEXT_818 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(\"new";
  protected final String TEXT_819 = " must be an instance of ";
  protected final String TEXT_820 = "\");";
  protected final String TEXT_821 = NL + "\t\t}";
  protected final String TEXT_822 = NL + "\t\tmsgs = eDynamicInverseAdd((";
  protected final String TEXT_823 = ")new";
  protected final String TEXT_824 = ", ";
  protected final String TEXT_825 = ", msgs);";
  protected final String TEXT_826 = NL + "\t\t";
  protected final String TEXT_827 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_828 = NL + "\t\t\t";
  protected final String TEXT_829 = " ";
  protected final String TEXT_830 = " = ";
  protected final String TEXT_831 = "();";
  protected final String TEXT_832 = NL + "\t\t\tObject ";
  protected final String TEXT_833 = " = eVirtualGet(";
  protected final String TEXT_834 = ");";
  protected final String TEXT_835 = NL + "\t\t\tif (";
  protected final String TEXT_836 = " != null && ";
  protected final String TEXT_837 = " != new";
  protected final String TEXT_838 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_839 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_840 = NL + "\t\t\tif (new";
  protected final String TEXT_841 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_842 = NL + "\t\t\t\t";
  protected final String TEXT_843 = " ";
  protected final String TEXT_844 = " = ";
  protected final String TEXT_845 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_846 = ".contains(new";
  protected final String TEXT_847 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_848 = ".add(new";
  protected final String TEXT_849 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_850 = NL + "\t\t\t\t";
  protected final String TEXT_851 = " ";
  protected final String TEXT_852 = " = ";
  protected final String TEXT_853 = "();";
  protected final String TEXT_854 = NL + "\t\t\t\tObject ";
  protected final String TEXT_855 = " = eVirtualGet(";
  protected final String TEXT_856 = ");";
  protected final String TEXT_857 = NL + "\t\t\t\tif (new";
  protected final String TEXT_858 = " != ";
  protected final String TEXT_859 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_860 = "(new";
  protected final String TEXT_861 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_862 = NL + "\t\t\t}";
  protected final String TEXT_863 = NL + "\t\t}";
  protected final String TEXT_864 = NL + "\t\treturn msgs;";
  protected final String TEXT_865 = NL + "\t\tif (new";
  protected final String TEXT_866 = " != null && !(new";
  protected final String TEXT_867 = " instanceof ";
  protected final String TEXT_868 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(\"new";
  protected final String TEXT_869 = " must be an instance of ";
  protected final String TEXT_870 = "\");";
  protected final String TEXT_871 = NL + "\t\t}";
  protected final String TEXT_872 = NL + "\t\tObject old";
  protected final String TEXT_873 = " = eVirtualSet(";
  protected final String TEXT_874 = ", new";
  protected final String TEXT_875 = ");";
  protected final String TEXT_876 = NL + "\t\t";
  protected final String TEXT_877 = " old";
  protected final String TEXT_878 = " = ";
  protected final String TEXT_879 = ";" + NL + "\t\t";
  protected final String TEXT_880 = " = new";
  protected final String TEXT_881 = ";";
  protected final String TEXT_882 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_883 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_884 = NL + "\t\tboolean old";
  protected final String TEXT_885 = "ESet = (";
  protected final String TEXT_886 = " & ";
  protected final String TEXT_887 = "_ESETFLAG) != 0;";
  protected final String TEXT_888 = NL + "\t\t";
  protected final String TEXT_889 = " |= ";
  protected final String TEXT_890 = "_ESETFLAG;";
  protected final String TEXT_891 = NL + "\t\tboolean old";
  protected final String TEXT_892 = "ESet = ";
  protected final String TEXT_893 = "ESet;";
  protected final String TEXT_894 = NL + "\t\t";
  protected final String TEXT_895 = "ESet = true;";
  protected final String TEXT_896 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_897 = NL + "\t\t\t";
  protected final String TEXT_898 = " notification = new ";
  protected final String TEXT_899 = "(this, ";
  protected final String TEXT_900 = ".SET, ";
  protected final String TEXT_901 = ", ";
  protected final String TEXT_902 = "isSetChange ? null : old";
  protected final String TEXT_903 = "old";
  protected final String TEXT_904 = ", new";
  protected final String TEXT_905 = ", ";
  protected final String TEXT_906 = "isSetChange";
  protected final String TEXT_907 = "!old";
  protected final String TEXT_908 = "ESet";
  protected final String TEXT_909 = ");";
  protected final String TEXT_910 = NL + "\t\t\t";
  protected final String TEXT_911 = " notification = new ";
  protected final String TEXT_912 = "(this, ";
  protected final String TEXT_913 = ".SET, ";
  protected final String TEXT_914 = ", ";
  protected final String TEXT_915 = "old";
  protected final String TEXT_916 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_917 = "old";
  protected final String TEXT_918 = ", new";
  protected final String TEXT_919 = ");";
  protected final String TEXT_920 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_921 = NL + "\t\t";
  protected final String TEXT_922 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_923 = NL + "\t\t\t";
  protected final String TEXT_924 = " ";
  protected final String TEXT_925 = " = ";
  protected final String TEXT_926 = "();";
  protected final String TEXT_927 = NL + "\t\t\tObject ";
  protected final String TEXT_928 = " = eVirtualGet(";
  protected final String TEXT_929 = ");";
  protected final String TEXT_930 = NL + "\t\t\tif (";
  protected final String TEXT_931 = " != null && ";
  protected final String TEXT_932 = " != new";
  protected final String TEXT_933 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_934 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_935 = NL + "\t\t\tif (new";
  protected final String TEXT_936 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_937 = NL + "\t\t\t\t";
  protected final String TEXT_938 = " ";
  protected final String TEXT_939 = " = ";
  protected final String TEXT_940 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_941 = ".contains(new";
  protected final String TEXT_942 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_943 = ".add(new";
  protected final String TEXT_944 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_945 = NL + "\t\t\t\t";
  protected final String TEXT_946 = " ";
  protected final String TEXT_947 = " = ";
  protected final String TEXT_948 = "();";
  protected final String TEXT_949 = NL + "\t\t\t\tObject ";
  protected final String TEXT_950 = " = eVirtualGet(";
  protected final String TEXT_951 = ");";
  protected final String TEXT_952 = NL + "\t\t\t\tif (new";
  protected final String TEXT_953 = " != ";
  protected final String TEXT_954 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_955 = "(new";
  protected final String TEXT_956 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_957 = NL + "\t\t\t}";
  protected final String TEXT_958 = NL + "\t\t}";
  protected final String TEXT_959 = NL + "\t\treturn msgs;";
  protected final String TEXT_960 = NL + "\t\treturn ((";
  protected final String TEXT_961 = ".Internal)((";
  protected final String TEXT_962 = ".Internal.Wrapper)get";
  protected final String TEXT_963 = "()).featureMap()).basicAdd(";
  protected final String TEXT_964 = ", new";
  protected final String TEXT_965 = ", msgs);";
  protected final String TEXT_966 = NL + "\t\treturn ((";
  protected final String TEXT_967 = ".Internal)get";
  protected final String TEXT_968 = "()).basicAdd(";
  protected final String TEXT_969 = ", new";
  protected final String TEXT_970 = ", msgs);";
  protected final String TEXT_971 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_972 = "' ";
  protected final String TEXT_973 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_974 = NL + "\t}" + NL;
  protected final String TEXT_975 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_976 = "#";
  protected final String TEXT_977 = " <em>";
  protected final String TEXT_978 = "</em>}' ";
  protected final String TEXT_979 = ".";
  protected final String TEXT_980 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_981 = "</em>' ";
  protected final String TEXT_982 = ".";
  protected final String TEXT_983 = NL + "\t * @see ";
  protected final String TEXT_984 = NL + "\t * @see #isSet";
  protected final String TEXT_985 = "()";
  protected final String TEXT_986 = NL + "\t * @see #unset";
  protected final String TEXT_987 = "()";
  protected final String TEXT_988 = NL + "\t * @see #";
  protected final String TEXT_989 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_990 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_991 = NL + "\t@Override";
  protected final String TEXT_992 = NL + "\tvoid set";
  protected final String TEXT_993 = "(";
  protected final String TEXT_994 = " value);" + NL;
  protected final String TEXT_995 = NL + "\tpublic void set";
  protected final String TEXT_996 = "_";
  protected final String TEXT_997 = "(";
  protected final String TEXT_998 = " ";
  protected final String TEXT_999 = ")" + NL + "\t{";
  protected final String TEXT_1000 = NL + "\t\tif (new";
  protected final String TEXT_1001 = " != null && !(new";
  protected final String TEXT_1002 = " instanceof ";
  protected final String TEXT_1003 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(\"new";
  protected final String TEXT_1004 = " must be an instance of ";
  protected final String TEXT_1005 = "\");";
  protected final String TEXT_1006 = NL + "\t\t}";
  protected final String TEXT_1007 = NL + "\t\tnew";
  protected final String TEXT_1008 = " = new";
  protected final String TEXT_1009 = " == null ? ";
  protected final String TEXT_1010 = " : new";
  protected final String TEXT_1011 = ";";
  protected final String TEXT_1012 = NL + "\t\teDynamicSet(";
  protected final String TEXT_1013 = ", ";
  protected final String TEXT_1014 = ", ";
  protected final String TEXT_1015 = "new ";
  protected final String TEXT_1016 = "(";
  protected final String TEXT_1017 = "new";
  protected final String TEXT_1018 = ")";
  protected final String TEXT_1019 = ");";
  protected final String TEXT_1020 = NL + "\t\teSet(";
  protected final String TEXT_1021 = ", ";
  protected final String TEXT_1022 = "new ";
  protected final String TEXT_1023 = "(";
  protected final String TEXT_1024 = "new";
  protected final String TEXT_1025 = ")";
  protected final String TEXT_1026 = ");";
  protected final String TEXT_1027 = NL + "\t\t";
  protected final String TEXT_1028 = "__ESETTING_DELEGATE.dynamicSet(this, null, 0, ";
  protected final String TEXT_1029 = "new ";
  protected final String TEXT_1030 = "(";
  protected final String TEXT_1031 = "new";
  protected final String TEXT_1032 = ")";
  protected final String TEXT_1033 = ");";
  protected final String TEXT_1034 = NL + "\t\tif (new";
  protected final String TEXT_1035 = " != eInternalContainer() || (eContainerFeatureID() != ";
  protected final String TEXT_1036 = " && new";
  protected final String TEXT_1037 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1038 = ".isAncestor(this, ";
  protected final String TEXT_1039 = "new";
  protected final String TEXT_1040 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_1041 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_1042 = NL + "\t\t\t";
  protected final String TEXT_1043 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_1044 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_1045 = ")new";
  protected final String TEXT_1046 = ").eInverseAdd(this, ";
  protected final String TEXT_1047 = ", ";
  protected final String TEXT_1048 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_1049 = "(";
  protected final String TEXT_1050 = "new";
  protected final String TEXT_1051 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_1052 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1053 = "(this, ";
  protected final String TEXT_1054 = ".SET, ";
  protected final String TEXT_1055 = ", new";
  protected final String TEXT_1056 = ", new";
  protected final String TEXT_1057 = "));";
  protected final String TEXT_1058 = NL + "\t\t";
  protected final String TEXT_1059 = " ";
  protected final String TEXT_1060 = " = (";
  protected final String TEXT_1061 = ")eVirtualGet(";
  protected final String TEXT_1062 = ");";
  protected final String TEXT_1063 = NL + "\t\tif (new";
  protected final String TEXT_1064 = " != ";
  protected final String TEXT_1065 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1066 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_1067 = " != null)";
  protected final String TEXT_1068 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_1069 = ")";
  protected final String TEXT_1070 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1071 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_1072 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_1073 = ")new";
  protected final String TEXT_1074 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1075 = ", null, msgs);";
  protected final String TEXT_1076 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_1077 = ")";
  protected final String TEXT_1078 = ").eInverseRemove(this, ";
  protected final String TEXT_1079 = ", ";
  protected final String TEXT_1080 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_1081 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_1082 = ")new";
  protected final String TEXT_1083 = ").eInverseAdd(this, ";
  protected final String TEXT_1084 = ", ";
  protected final String TEXT_1085 = ".class, msgs);";
  protected final String TEXT_1086 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_1087 = "(";
  protected final String TEXT_1088 = "new";
  protected final String TEXT_1089 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_1090 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1091 = NL + "\t\t\tboolean old";
  protected final String TEXT_1092 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1093 = ");";
  protected final String TEXT_1094 = NL + "\t\t\tboolean old";
  protected final String TEXT_1095 = "ESet = (";
  protected final String TEXT_1096 = " & ";
  protected final String TEXT_1097 = "_ESETFLAG) != 0;";
  protected final String TEXT_1098 = NL + "\t\t\t";
  protected final String TEXT_1099 = " |= ";
  protected final String TEXT_1100 = "_ESETFLAG;";
  protected final String TEXT_1101 = NL + "\t\t\tboolean old";
  protected final String TEXT_1102 = "ESet = ";
  protected final String TEXT_1103 = "ESet;";
  protected final String TEXT_1104 = NL + "\t\t\t";
  protected final String TEXT_1105 = "ESet = true;";
  protected final String TEXT_1106 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1107 = "(this, ";
  protected final String TEXT_1108 = ".SET, ";
  protected final String TEXT_1109 = ", new";
  protected final String TEXT_1110 = ", new";
  protected final String TEXT_1111 = ", !old";
  protected final String TEXT_1112 = "ESet));";
  protected final String TEXT_1113 = NL + "\t\t}";
  protected final String TEXT_1114 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1115 = "(this, ";
  protected final String TEXT_1116 = ".SET, ";
  protected final String TEXT_1117 = ", new";
  protected final String TEXT_1118 = ", new";
  protected final String TEXT_1119 = "));";
  protected final String TEXT_1120 = NL + "\t\t";
  protected final String TEXT_1121 = " old";
  protected final String TEXT_1122 = " = (";
  protected final String TEXT_1123 = " & ";
  protected final String TEXT_1124 = "_EFLAG) != 0;";
  protected final String TEXT_1125 = NL + "\t\t";
  protected final String TEXT_1126 = " old";
  protected final String TEXT_1127 = " = ";
  protected final String TEXT_1128 = "_EFLAG_VALUES[(";
  protected final String TEXT_1129 = " & ";
  protected final String TEXT_1130 = "_EFLAG) >>> ";
  protected final String TEXT_1131 = "_EFLAG_OFFSET];";
  protected final String TEXT_1132 = NL + "\t\tif (new";
  protected final String TEXT_1133 = ") ";
  protected final String TEXT_1134 = " |= ";
  protected final String TEXT_1135 = "_EFLAG; else ";
  protected final String TEXT_1136 = " &= ~";
  protected final String TEXT_1137 = "_EFLAG;";
  protected final String TEXT_1138 = NL + "\t\tif (new";
  protected final String TEXT_1139 = " == null) new";
  protected final String TEXT_1140 = " = ";
  protected final String TEXT_1141 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_1142 = " = ";
  protected final String TEXT_1143 = " & ~";
  protected final String TEXT_1144 = "_EFLAG | ";
  protected final String TEXT_1145 = "new";
  protected final String TEXT_1146 = ".ordinal()";
  protected final String TEXT_1147 = ".VALUES.indexOf(new";
  protected final String TEXT_1148 = ")";
  protected final String TEXT_1149 = " << ";
  protected final String TEXT_1150 = "_EFLAG_OFFSET;";
  protected final String TEXT_1151 = NL + "\t\t";
  protected final String TEXT_1152 = " old";
  protected final String TEXT_1153 = " = ";
  protected final String TEXT_1154 = ";";
  protected final String TEXT_1155 = NL + "\t\t";
  protected final String TEXT_1156 = " ";
  protected final String TEXT_1157 = " = new";
  protected final String TEXT_1158 = " == null ? ";
  protected final String TEXT_1159 = " : new";
  protected final String TEXT_1160 = ";";
  protected final String TEXT_1161 = NL + "\t\t";
  protected final String TEXT_1162 = " = new";
  protected final String TEXT_1163 = " == null ? ";
  protected final String TEXT_1164 = " : new";
  protected final String TEXT_1165 = ";";
  protected final String TEXT_1166 = NL + "\t\t";
  protected final String TEXT_1167 = " ";
  protected final String TEXT_1168 = " = ";
  protected final String TEXT_1169 = "new";
  protected final String TEXT_1170 = ";";
  protected final String TEXT_1171 = NL + "\t\t";
  protected final String TEXT_1172 = " = ";
  protected final String TEXT_1173 = "new";
  protected final String TEXT_1174 = ";";
  protected final String TEXT_1175 = NL + "\t\tObject old";
  protected final String TEXT_1176 = " = eVirtualSet(";
  protected final String TEXT_1177 = ", ";
  protected final String TEXT_1178 = ");";
  protected final String TEXT_1179 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1180 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1181 = NL + "\t\tboolean old";
  protected final String TEXT_1182 = "ESet = (";
  protected final String TEXT_1183 = " & ";
  protected final String TEXT_1184 = "_ESETFLAG) != 0;";
  protected final String TEXT_1185 = NL + "\t\t";
  protected final String TEXT_1186 = " |= ";
  protected final String TEXT_1187 = "_ESETFLAG;";
  protected final String TEXT_1188 = NL + "\t\tboolean old";
  protected final String TEXT_1189 = "ESet = ";
  protected final String TEXT_1190 = "ESet;";
  protected final String TEXT_1191 = NL + "\t\t";
  protected final String TEXT_1192 = "ESet = true;";
  protected final String TEXT_1193 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1194 = "(this, ";
  protected final String TEXT_1195 = ".SET, ";
  protected final String TEXT_1196 = ", ";
  protected final String TEXT_1197 = "isSetChange ? ";
  protected final String TEXT_1198 = " : old";
  protected final String TEXT_1199 = "old";
  protected final String TEXT_1200 = ", ";
  protected final String TEXT_1201 = "new";
  protected final String TEXT_1202 = ", ";
  protected final String TEXT_1203 = "isSetChange";
  protected final String TEXT_1204 = "!old";
  protected final String TEXT_1205 = "ESet";
  protected final String TEXT_1206 = "));";
  protected final String TEXT_1207 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1208 = "(this, ";
  protected final String TEXT_1209 = ".SET, ";
  protected final String TEXT_1210 = ", ";
  protected final String TEXT_1211 = "old";
  protected final String TEXT_1212 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_1213 = " : old";
  protected final String TEXT_1214 = "old";
  protected final String TEXT_1215 = ", ";
  protected final String TEXT_1216 = "new";
  protected final String TEXT_1217 = "));";
  protected final String TEXT_1218 = NL + "\t\t";
  protected final String TEXT_1219 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_1220 = NL + "\t\t\t";
  protected final String TEXT_1221 = " ";
  protected final String TEXT_1222 = " = ";
  protected final String TEXT_1223 = "();";
  protected final String TEXT_1224 = NL + "\t\t\tObject ";
  protected final String TEXT_1225 = " = eVirtualGet(";
  protected final String TEXT_1226 = ");";
  protected final String TEXT_1227 = NL + "\t\t\tif (";
  protected final String TEXT_1228 = " != null && ";
  protected final String TEXT_1229 = " != new";
  protected final String TEXT_1230 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_1231 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_1232 = NL + "\t\t\tif (new";
  protected final String TEXT_1233 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_1234 = NL + "\t\t\t\t";
  protected final String TEXT_1235 = " ";
  protected final String TEXT_1236 = " = ";
  protected final String TEXT_1237 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_1238 = ".contains(new";
  protected final String TEXT_1239 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_1240 = ".add(new";
  protected final String TEXT_1241 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1242 = NL + "\t\t\t\t";
  protected final String TEXT_1243 = " ";
  protected final String TEXT_1244 = " = ";
  protected final String TEXT_1245 = "();";
  protected final String TEXT_1246 = NL + "\t\t\t\tObject ";
  protected final String TEXT_1247 = " = eVirtualGet(";
  protected final String TEXT_1248 = ");";
  protected final String TEXT_1249 = NL + "\t\t\t\tif (new";
  protected final String TEXT_1250 = " != ";
  protected final String TEXT_1251 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_1252 = "(new";
  protected final String TEXT_1253 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1254 = NL + "\t\t\t}";
  protected final String TEXT_1255 = NL + "\t\t}";
  protected final String TEXT_1256 = NL + "\t\t((";
  protected final String TEXT_1257 = ".Internal)((";
  protected final String TEXT_1258 = ".Internal.Wrapper)get";
  protected final String TEXT_1259 = "()).featureMap()).set(";
  protected final String TEXT_1260 = ", ";
  protected final String TEXT_1261 = "new ";
  protected final String TEXT_1262 = "(";
  protected final String TEXT_1263 = "new";
  protected final String TEXT_1264 = ")";
  protected final String TEXT_1265 = ");";
  protected final String TEXT_1266 = NL + "\t\t((";
  protected final String TEXT_1267 = ".Internal)get";
  protected final String TEXT_1268 = "()).set(";
  protected final String TEXT_1269 = ", ";
  protected final String TEXT_1270 = "new ";
  protected final String TEXT_1271 = "(";
  protected final String TEXT_1272 = "new";
  protected final String TEXT_1273 = ")";
  protected final String TEXT_1274 = ");";
  protected final String TEXT_1275 = NL + "\t\t";
  protected final String TEXT_1276 = NL + "\t\t";
  protected final String TEXT_1277 = ".";
  protected final String TEXT_1278 = "(this, ";
  protected final String TEXT_1279 = ");";
  protected final String TEXT_1280 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_1281 = "' ";
  protected final String TEXT_1282 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1283 = NL + "\t}" + NL;
  protected final String TEXT_1284 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1285 = NL + "\t@Override";
  protected final String TEXT_1286 = NL + "\tpublic ";
  protected final String TEXT_1287 = " basicUnset";
  protected final String TEXT_1288 = "(";
  protected final String TEXT_1289 = " msgs)" + NL + "\t{";
  protected final String TEXT_1290 = NL + "\t\treturn eDynamicInverseRemove((";
  protected final String TEXT_1291 = ")";
  protected final String TEXT_1292 = "basicGet";
  protected final String TEXT_1293 = "(), ";
  protected final String TEXT_1294 = ", msgs);";
  protected final String TEXT_1295 = "Object old";
  protected final String TEXT_1296 = " = ";
  protected final String TEXT_1297 = "eVirtualUnset(";
  protected final String TEXT_1298 = ");";
  protected final String TEXT_1299 = NL + "\t\t";
  protected final String TEXT_1300 = " old";
  protected final String TEXT_1301 = " = ";
  protected final String TEXT_1302 = ";";
  protected final String TEXT_1303 = NL + "\t\t";
  protected final String TEXT_1304 = " = null;";
  protected final String TEXT_1305 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1306 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1307 = NL + "\t\tboolean old";
  protected final String TEXT_1308 = "ESet = (";
  protected final String TEXT_1309 = " & ";
  protected final String TEXT_1310 = "_ESETFLAG) != 0;";
  protected final String TEXT_1311 = NL + "\t\t";
  protected final String TEXT_1312 = " &= ~";
  protected final String TEXT_1313 = "_ESETFLAG;";
  protected final String TEXT_1314 = NL + "\t\tboolean old";
  protected final String TEXT_1315 = "ESet = ";
  protected final String TEXT_1316 = "ESet;";
  protected final String TEXT_1317 = NL + "\t\t";
  protected final String TEXT_1318 = "ESet = false;";
  protected final String TEXT_1319 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1320 = " notification = new ";
  protected final String TEXT_1321 = "(this, ";
  protected final String TEXT_1322 = ".UNSET, ";
  protected final String TEXT_1323 = ", ";
  protected final String TEXT_1324 = "isSetChange ? old";
  protected final String TEXT_1325 = " : null";
  protected final String TEXT_1326 = "old";
  protected final String TEXT_1327 = ", null, ";
  protected final String TEXT_1328 = "isSetChange";
  protected final String TEXT_1329 = "old";
  protected final String TEXT_1330 = "ESet";
  protected final String TEXT_1331 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1332 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1333 = "' ";
  protected final String TEXT_1334 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1335 = NL + "\t}" + NL;
  protected final String TEXT_1336 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1337 = "#";
  protected final String TEXT_1338 = " <em>";
  protected final String TEXT_1339 = "</em>}' ";
  protected final String TEXT_1340 = ".";
  protected final String TEXT_1341 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1342 = NL + "\t * @see #isSet";
  protected final String TEXT_1343 = "()";
  protected final String TEXT_1344 = NL + "\t * @see #";
  protected final String TEXT_1345 = "()";
  protected final String TEXT_1346 = NL + "\t * @see #set";
  protected final String TEXT_1347 = "(";
  protected final String TEXT_1348 = ")";
  protected final String TEXT_1349 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1350 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1351 = NL + "\t@Override";
  protected final String TEXT_1352 = NL + "\tvoid unset";
  protected final String TEXT_1353 = "();" + NL;
  protected final String TEXT_1354 = NL + "\tpublic void unset";
  protected final String TEXT_1355 = "_";
  protected final String TEXT_1356 = "()" + NL + "\t{";
  protected final String TEXT_1357 = NL + "\t\teDynamicUnset(";
  protected final String TEXT_1358 = ", ";
  protected final String TEXT_1359 = ");";
  protected final String TEXT_1360 = NL + "\t\teUnset(";
  protected final String TEXT_1361 = ");";
  protected final String TEXT_1362 = NL + "\t\t";
  protected final String TEXT_1363 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_1364 = NL + "\t\t";
  protected final String TEXT_1365 = " ";
  protected final String TEXT_1366 = " = (";
  protected final String TEXT_1367 = ")eVirtualGet(";
  protected final String TEXT_1368 = ");";
  protected final String TEXT_1369 = NL + "\t\tif (";
  protected final String TEXT_1370 = " != null) ((";
  protected final String TEXT_1371 = ".Unsettable";
  protected final String TEXT_1372 = ")";
  protected final String TEXT_1373 = ").unset();";
  protected final String TEXT_1374 = NL + "\t\t";
  protected final String TEXT_1375 = " ";
  protected final String TEXT_1376 = " = (";
  protected final String TEXT_1377 = ")eVirtualGet(";
  protected final String TEXT_1378 = ");";
  protected final String TEXT_1379 = NL + "\t\tif (";
  protected final String TEXT_1380 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1381 = " msgs = null;";
  protected final String TEXT_1382 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1383 = ")";
  protected final String TEXT_1384 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1385 = ", null, msgs);";
  protected final String TEXT_1386 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1387 = ")";
  protected final String TEXT_1388 = ").eInverseRemove(this, ";
  protected final String TEXT_1389 = ", ";
  protected final String TEXT_1390 = ".class, msgs);";
  protected final String TEXT_1391 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1392 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1393 = NL + "\t\t\tboolean old";
  protected final String TEXT_1394 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1395 = ");";
  protected final String TEXT_1396 = NL + "\t\t\tboolean old";
  protected final String TEXT_1397 = "ESet = (";
  protected final String TEXT_1398 = " & ";
  protected final String TEXT_1399 = "_ESETFLAG) != 0;";
  protected final String TEXT_1400 = NL + "\t\t\t";
  protected final String TEXT_1401 = " &= ~";
  protected final String TEXT_1402 = "_ESETFLAG;";
  protected final String TEXT_1403 = NL + "\t\t\tboolean old";
  protected final String TEXT_1404 = "ESet = ";
  protected final String TEXT_1405 = "ESet;";
  protected final String TEXT_1406 = NL + "\t\t\t";
  protected final String TEXT_1407 = "ESet = false;";
  protected final String TEXT_1408 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1409 = "(this, ";
  protected final String TEXT_1410 = ".UNSET, ";
  protected final String TEXT_1411 = ", null, null, old";
  protected final String TEXT_1412 = "ESet));";
  protected final String TEXT_1413 = NL + "\t\t}";
  protected final String TEXT_1414 = NL + "\t\t";
  protected final String TEXT_1415 = " old";
  protected final String TEXT_1416 = " = (";
  protected final String TEXT_1417 = " & ";
  protected final String TEXT_1418 = "_EFLAG) != 0;";
  protected final String TEXT_1419 = NL + "\t\t";
  protected final String TEXT_1420 = " old";
  protected final String TEXT_1421 = " = ";
  protected final String TEXT_1422 = "_EFLAG_VALUES[(";
  protected final String TEXT_1423 = " & ";
  protected final String TEXT_1424 = "_EFLAG) >>> ";
  protected final String TEXT_1425 = "_EFLAG_OFFSET];";
  protected final String TEXT_1426 = NL + "\t\tObject old";
  protected final String TEXT_1427 = " = eVirtualUnset(";
  protected final String TEXT_1428 = ");";
  protected final String TEXT_1429 = NL + "\t\t";
  protected final String TEXT_1430 = " old";
  protected final String TEXT_1431 = " = ";
  protected final String TEXT_1432 = ";";
  protected final String TEXT_1433 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1434 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1435 = NL + "\t\tboolean old";
  protected final String TEXT_1436 = "ESet = (";
  protected final String TEXT_1437 = " & ";
  protected final String TEXT_1438 = "_ESETFLAG) != 0;";
  protected final String TEXT_1439 = NL + "\t\tboolean old";
  protected final String TEXT_1440 = "ESet = ";
  protected final String TEXT_1441 = "ESet;";
  protected final String TEXT_1442 = NL + "\t\t";
  protected final String TEXT_1443 = " = null;";
  protected final String TEXT_1444 = NL + "\t\t";
  protected final String TEXT_1445 = " &= ~";
  protected final String TEXT_1446 = "_ESETFLAG;";
  protected final String TEXT_1447 = NL + "\t\t";
  protected final String TEXT_1448 = "ESet = false;";
  protected final String TEXT_1449 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1450 = "(this, ";
  protected final String TEXT_1451 = ".UNSET, ";
  protected final String TEXT_1452 = ", ";
  protected final String TEXT_1453 = "isSetChange ? old";
  protected final String TEXT_1454 = " : null";
  protected final String TEXT_1455 = "old";
  protected final String TEXT_1456 = ", null, ";
  protected final String TEXT_1457 = "isSetChange";
  protected final String TEXT_1458 = "old";
  protected final String TEXT_1459 = "ESet";
  protected final String TEXT_1460 = "));";
  protected final String TEXT_1461 = NL + "\t\tif (";
  protected final String TEXT_1462 = ") ";
  protected final String TEXT_1463 = " |= ";
  protected final String TEXT_1464 = "_EFLAG; else ";
  protected final String TEXT_1465 = " &= ~";
  protected final String TEXT_1466 = "_EFLAG;";
  protected final String TEXT_1467 = NL + "\t\t";
  protected final String TEXT_1468 = " = ";
  protected final String TEXT_1469 = " & ~";
  protected final String TEXT_1470 = "_EFLAG | ";
  protected final String TEXT_1471 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1472 = NL + "\t\t";
  protected final String TEXT_1473 = " = ";
  protected final String TEXT_1474 = ";";
  protected final String TEXT_1475 = NL + "\t\t";
  protected final String TEXT_1476 = " &= ~";
  protected final String TEXT_1477 = "_ESETFLAG;";
  protected final String TEXT_1478 = NL + "\t\t";
  protected final String TEXT_1479 = "ESet = false;";
  protected final String TEXT_1480 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1481 = "(this, ";
  protected final String TEXT_1482 = ".UNSET, ";
  protected final String TEXT_1483 = ", ";
  protected final String TEXT_1484 = "isSetChange ? old";
  protected final String TEXT_1485 = " : ";
  protected final String TEXT_1486 = "old";
  protected final String TEXT_1487 = ", ";
  protected final String TEXT_1488 = ", ";
  protected final String TEXT_1489 = "isSetChange";
  protected final String TEXT_1490 = "old";
  protected final String TEXT_1491 = "ESet";
  protected final String TEXT_1492 = "));";
  protected final String TEXT_1493 = NL + "\t\t((";
  protected final String TEXT_1494 = ".Internal)((";
  protected final String TEXT_1495 = ".Internal.Wrapper)get";
  protected final String TEXT_1496 = "()).featureMap()).clear(";
  protected final String TEXT_1497 = ");";
  protected final String TEXT_1498 = NL + "\t\t((";
  protected final String TEXT_1499 = ".Internal)get";
  protected final String TEXT_1500 = "()).clear(";
  protected final String TEXT_1501 = ");";
  protected final String TEXT_1502 = NL + "\t\t";
  protected final String TEXT_1503 = NL + "\t\t";
  protected final String TEXT_1504 = ".";
  protected final String TEXT_1505 = "(this);";
  protected final String TEXT_1506 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1507 = "' ";
  protected final String TEXT_1508 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1509 = NL + "\t}" + NL;
  protected final String TEXT_1510 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1511 = "#";
  protected final String TEXT_1512 = " <em>";
  protected final String TEXT_1513 = "</em>}' ";
  protected final String TEXT_1514 = " is set.";
  protected final String TEXT_1515 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1516 = "</em>' ";
  protected final String TEXT_1517 = " is set.";
  protected final String TEXT_1518 = NL + "\t * @see #unset";
  protected final String TEXT_1519 = "()";
  protected final String TEXT_1520 = NL + "\t * @see #";
  protected final String TEXT_1521 = "()";
  protected final String TEXT_1522 = NL + "\t * @see #set";
  protected final String TEXT_1523 = "(";
  protected final String TEXT_1524 = ")";
  protected final String TEXT_1525 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1526 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1527 = NL + "\t@Override";
  protected final String TEXT_1528 = NL + "\tboolean isSet";
  protected final String TEXT_1529 = "();" + NL;
  protected final String TEXT_1530 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1531 = "_";
  protected final String TEXT_1532 = "()" + NL + "\t{";
  protected final String TEXT_1533 = NL + "\t\treturn eDynamicIsSet(";
  protected final String TEXT_1534 = ", ";
  protected final String TEXT_1535 = ");";
  protected final String TEXT_1536 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1537 = ");";
  protected final String TEXT_1538 = NL + "\t\treturn ";
  protected final String TEXT_1539 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_1540 = NL + "\t\t";
  protected final String TEXT_1541 = " ";
  protected final String TEXT_1542 = " = (";
  protected final String TEXT_1543 = ")eVirtualGet(";
  protected final String TEXT_1544 = ");";
  protected final String TEXT_1545 = NL + "\t\treturn ";
  protected final String TEXT_1546 = " != null && ((";
  protected final String TEXT_1547 = ".Unsettable";
  protected final String TEXT_1548 = ")";
  protected final String TEXT_1549 = ").isSet();";
  protected final String TEXT_1550 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1551 = ");";
  protected final String TEXT_1552 = NL + "\t\treturn (";
  protected final String TEXT_1553 = " & ";
  protected final String TEXT_1554 = "_ESETFLAG) != 0;";
  protected final String TEXT_1555 = NL + "\t\treturn ";
  protected final String TEXT_1556 = "ESet;";
  protected final String TEXT_1557 = NL + "\t\treturn !((";
  protected final String TEXT_1558 = ".Internal)((";
  protected final String TEXT_1559 = ".Internal.Wrapper)get";
  protected final String TEXT_1560 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1561 = ");";
  protected final String TEXT_1562 = NL + "\t\treturn !((";
  protected final String TEXT_1563 = ".Internal)get";
  protected final String TEXT_1564 = "()).isEmpty(";
  protected final String TEXT_1565 = ");";
  protected final String TEXT_1566 = NL + "\t\t";
  protected final String TEXT_1567 = NL + "\t\treturn ";
  protected final String TEXT_1568 = ".";
  protected final String TEXT_1569 = "(this);";
  protected final String TEXT_1570 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1571 = "' ";
  protected final String TEXT_1572 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1573 = NL + "\t}" + NL;
  protected final String TEXT_1574 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1575 = "() <em>";
  protected final String TEXT_1576 = "</em>}' ";
  protected final String TEXT_1577 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1578 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1579 = "_ESUBSETS = ";
  protected final String TEXT_1580 = ";" + NL;
  protected final String TEXT_1581 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1582 = "() <em>";
  protected final String TEXT_1583 = "</em>}' ";
  protected final String TEXT_1584 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1585 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1586 = "_ESUPERSETS = ";
  protected final String TEXT_1587 = ";" + NL;
  protected final String TEXT_1588 = NL + "\t/**";
  protected final String TEXT_1589 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1590 = "}, with the specified ";
  protected final String TEXT_1591 = ", and appends it to the '<em><b>";
  protected final String TEXT_1592 = "</b></em>' ";
  protected final String TEXT_1593 = ".";
  protected final String TEXT_1594 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1595 = "}, with the specified ";
  protected final String TEXT_1596 = ", and sets the '<em><b>";
  protected final String TEXT_1597 = "</b></em>' ";
  protected final String TEXT_1598 = ".";
  protected final String TEXT_1599 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1600 = "} and appends it to the '<em><b>";
  protected final String TEXT_1601 = "</b></em>' ";
  protected final String TEXT_1602 = ".";
  protected final String TEXT_1603 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1604 = "} and sets the '<em><b>";
  protected final String TEXT_1605 = "</b></em>' ";
  protected final String TEXT_1606 = ".";
  protected final String TEXT_1607 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1608 = NL + "\t * @param ";
  protected final String TEXT_1609 = " The ";
  protected final String TEXT_1610 = " for the new {@link ";
  protected final String TEXT_1611 = "}, or <code>null</code>.";
  protected final String TEXT_1612 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1613 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1614 = "}." + NL + "\t * @see #";
  protected final String TEXT_1615 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1616 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1617 = NL + "\t";
  protected final String TEXT_1618 = " create";
  protected final String TEXT_1619 = "(";
  protected final String TEXT_1620 = ", ";
  protected final String TEXT_1621 = " eClass);" + NL;
  protected final String TEXT_1622 = NL + "\t@Override";
  protected final String TEXT_1623 = NL + "\tpublic ";
  protected final String TEXT_1624 = " create";
  protected final String TEXT_1625 = "(";
  protected final String TEXT_1626 = ", ";
  protected final String TEXT_1627 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1628 = " new";
  protected final String TEXT_1629 = " = (";
  protected final String TEXT_1630 = ") create(eClass);";
  protected final String TEXT_1631 = NL + "\t\t";
  protected final String TEXT_1632 = "().add(new";
  protected final String TEXT_1633 = ");";
  protected final String TEXT_1634 = NL + "\t\tset";
  protected final String TEXT_1635 = "(new";
  protected final String TEXT_1636 = ");";
  protected final String TEXT_1637 = NL + "\t\tint ";
  protected final String TEXT_1638 = "ListSize = 0;";
  protected final String TEXT_1639 = NL + "\t\tint ";
  protected final String TEXT_1640 = "Size = ";
  protected final String TEXT_1641 = " == null ? 0 : ";
  protected final String TEXT_1642 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1643 = "Size > ";
  protected final String TEXT_1644 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1645 = "ListSize = ";
  protected final String TEXT_1646 = "Size;";
  protected final String TEXT_1647 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1648 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1649 = ".create";
  protected final String TEXT_1650 = "(";
  protected final String TEXT_1651 = ", ";
  protected final String TEXT_1652 = "i < ";
  protected final String TEXT_1653 = "Size ? (";
  protected final String TEXT_1654 = ") ";
  protected final String TEXT_1655 = ".get(i) : null";
  protected final String TEXT_1656 = ");" + NL + "\t\t}";
  protected final String TEXT_1657 = NL + "\t\tnew";
  protected final String TEXT_1658 = ".create";
  protected final String TEXT_1659 = "(";
  protected final String TEXT_1660 = ", ";
  protected final String TEXT_1661 = ");";
  protected final String TEXT_1662 = NL + "\t\tif (";
  protected final String TEXT_1663 = " != null)";
  protected final String TEXT_1664 = NL + "\t\t\tnew";
  protected final String TEXT_1665 = ".";
  protected final String TEXT_1666 = "().addAll(";
  protected final String TEXT_1667 = ");";
  protected final String TEXT_1668 = NL + "\t\t\tnew";
  protected final String TEXT_1669 = ".set";
  protected final String TEXT_1670 = "(";
  protected final String TEXT_1671 = ");";
  protected final String TEXT_1672 = NL + "\t\treturn new";
  protected final String TEXT_1673 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1674 = NL + "\t/**";
  protected final String TEXT_1675 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1676 = "}, with the specified ";
  protected final String TEXT_1677 = ", and appends it to the '<em><b>";
  protected final String TEXT_1678 = "</b></em>' ";
  protected final String TEXT_1679 = ".";
  protected final String TEXT_1680 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1681 = "},with the specified ";
  protected final String TEXT_1682 = ", and sets the '<em><b>";
  protected final String TEXT_1683 = "</b></em>' ";
  protected final String TEXT_1684 = ".";
  protected final String TEXT_1685 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1686 = "} and appends it to the '<em><b>";
  protected final String TEXT_1687 = "</b></em>' ";
  protected final String TEXT_1688 = ".";
  protected final String TEXT_1689 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1690 = "} and sets the '<em><b>";
  protected final String TEXT_1691 = "</b></em>' ";
  protected final String TEXT_1692 = ".";
  protected final String TEXT_1693 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1694 = NL + "\t * @param ";
  protected final String TEXT_1695 = " The ";
  protected final String TEXT_1696 = " for the new {@link ";
  protected final String TEXT_1697 = "}, or <code>null</code>.";
  protected final String TEXT_1698 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1699 = "}." + NL + "\t * @see #";
  protected final String TEXT_1700 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1701 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1702 = NL + "\t";
  protected final String TEXT_1703 = " create";
  protected final String TEXT_1704 = "(";
  protected final String TEXT_1705 = ");" + NL;
  protected final String TEXT_1706 = NL + "\t@Override";
  protected final String TEXT_1707 = NL + "\tpublic ";
  protected final String TEXT_1708 = " create";
  protected final String TEXT_1709 = "(";
  protected final String TEXT_1710 = ")" + NL + "\t{";
  protected final String TEXT_1711 = NL + "\t\treturn create";
  protected final String TEXT_1712 = "(";
  protected final String TEXT_1713 = ", ";
  protected final String TEXT_1714 = ");";
  protected final String TEXT_1715 = NL + "\t\t";
  protected final String TEXT_1716 = " new";
  protected final String TEXT_1717 = " = (";
  protected final String TEXT_1718 = ") create(";
  protected final String TEXT_1719 = ");";
  protected final String TEXT_1720 = NL + "\t\t";
  protected final String TEXT_1721 = "().add(new";
  protected final String TEXT_1722 = ");";
  protected final String TEXT_1723 = NL + "\t\tset";
  protected final String TEXT_1724 = "(new";
  protected final String TEXT_1725 = ");";
  protected final String TEXT_1726 = NL + "\t\tint ";
  protected final String TEXT_1727 = "ListSize = 0;";
  protected final String TEXT_1728 = NL + "\t\tint ";
  protected final String TEXT_1729 = "Size = ";
  protected final String TEXT_1730 = " == null ? 0 : ";
  protected final String TEXT_1731 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1732 = "Size > ";
  protected final String TEXT_1733 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1734 = "ListSize = ";
  protected final String TEXT_1735 = "Size;";
  protected final String TEXT_1736 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1737 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1738 = ".create";
  protected final String TEXT_1739 = "(";
  protected final String TEXT_1740 = ", ";
  protected final String TEXT_1741 = "i < ";
  protected final String TEXT_1742 = "Size ? (";
  protected final String TEXT_1743 = ") ";
  protected final String TEXT_1744 = ".get(i) : null";
  protected final String TEXT_1745 = ");" + NL + "\t\t}";
  protected final String TEXT_1746 = NL + "\t\tnew";
  protected final String TEXT_1747 = ".create";
  protected final String TEXT_1748 = "(";
  protected final String TEXT_1749 = ", ";
  protected final String TEXT_1750 = ");";
  protected final String TEXT_1751 = NL + "\t\tif (";
  protected final String TEXT_1752 = " != null)";
  protected final String TEXT_1753 = NL + "\t\t\tnew";
  protected final String TEXT_1754 = ".";
  protected final String TEXT_1755 = "().addAll(";
  protected final String TEXT_1756 = ");";
  protected final String TEXT_1757 = NL + "\t\t\tnew";
  protected final String TEXT_1758 = ".set";
  protected final String TEXT_1759 = "(";
  protected final String TEXT_1760 = ");";
  protected final String TEXT_1761 = NL + "\t\treturn new";
  protected final String TEXT_1762 = ";";
  protected final String TEXT_1763 = NL + "\t}" + NL;
  protected final String TEXT_1764 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1765 = "} with the specified ";
  protected final String TEXT_1766 = " from the '<em><b>";
  protected final String TEXT_1767 = "</b></em>' ";
  protected final String TEXT_1768 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1769 = NL + "\t * @param ";
  protected final String TEXT_1770 = " The ";
  protected final String TEXT_1771 = " of the {@link ";
  protected final String TEXT_1772 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1773 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1774 = "} with the specified ";
  protected final String TEXT_1775 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1776 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1777 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1778 = NL + "\t";
  protected final String TEXT_1779 = " get";
  protected final String TEXT_1780 = "(";
  protected final String TEXT_1781 = ");" + NL;
  protected final String TEXT_1782 = NL + "\t@Override";
  protected final String TEXT_1783 = NL + "\tpublic ";
  protected final String TEXT_1784 = " get";
  protected final String TEXT_1785 = "(";
  protected final String TEXT_1786 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1787 = "(";
  protected final String TEXT_1788 = ", false";
  protected final String TEXT_1789 = ", null";
  protected final String TEXT_1790 = ", false";
  protected final String TEXT_1791 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1792 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1793 = "} with the specified ";
  protected final String TEXT_1794 = " from the '<em><b>";
  protected final String TEXT_1795 = "</b></em>' ";
  protected final String TEXT_1796 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1797 = NL + "\t * @param ";
  protected final String TEXT_1798 = " The ";
  protected final String TEXT_1799 = " of the {@link ";
  protected final String TEXT_1800 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1801 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1802 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1803 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1804 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1805 = "} on demand if not found.";
  protected final String TEXT_1806 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1807 = "} with the specified ";
  protected final String TEXT_1808 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1809 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1810 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1811 = NL + "\t";
  protected final String TEXT_1812 = " get";
  protected final String TEXT_1813 = "(";
  protected final String TEXT_1814 = ", boolean ignoreCase";
  protected final String TEXT_1815 = ", ";
  protected final String TEXT_1816 = " eClass";
  protected final String TEXT_1817 = ", boolean createOnDemand";
  protected final String TEXT_1818 = ");" + NL;
  protected final String TEXT_1819 = NL + "\t@Override";
  protected final String TEXT_1820 = NL + "\tpublic ";
  protected final String TEXT_1821 = " get";
  protected final String TEXT_1822 = "(";
  protected final String TEXT_1823 = ", boolean ignoreCase";
  protected final String TEXT_1824 = ", ";
  protected final String TEXT_1825 = " eClass";
  protected final String TEXT_1826 = ", boolean createOnDemand";
  protected final String TEXT_1827 = ")" + NL + "\t{";
  protected final String TEXT_1828 = NL + "\t\t";
  protected final String TEXT_1829 = "Loop: for (";
  protected final String TEXT_1830 = " ";
  protected final String TEXT_1831 = " : ";
  protected final String TEXT_1832 = "())" + NL + "\t\t{";
  protected final String TEXT_1833 = NL + "\t\t";
  protected final String TEXT_1834 = "Loop: for (";
  protected final String TEXT_1835 = " i = ";
  protected final String TEXT_1836 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1837 = " ";
  protected final String TEXT_1838 = " = (";
  protected final String TEXT_1839 = ") i.next();";
  protected final String TEXT_1840 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1841 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1842 = "Loop;";
  protected final String TEXT_1843 = NL + "\t\t\t";
  protected final String TEXT_1844 = " ";
  protected final String TEXT_1845 = "List = ";
  protected final String TEXT_1846 = ".";
  protected final String TEXT_1847 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1848 = "ListSize = ";
  protected final String TEXT_1849 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1850 = " || (";
  protected final String TEXT_1851 = " != null && ";
  protected final String TEXT_1852 = ".size() != ";
  protected final String TEXT_1853 = "ListSize";
  protected final String TEXT_1854 = ")";
  protected final String TEXT_1855 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1856 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1857 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1858 = " ";
  protected final String TEXT_1859 = " = ";
  protected final String TEXT_1860 = "(";
  protected final String TEXT_1861 = ") ";
  protected final String TEXT_1862 = "List.get(j);";
  protected final String TEXT_1863 = NL + "\t\t\t\tif (";
  protected final String TEXT_1864 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1865 = "(";
  protected final String TEXT_1866 = ")";
  protected final String TEXT_1867 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1868 = ".";
  protected final String TEXT_1869 = "()) : ";
  protected final String TEXT_1870 = ".get(j).equals(";
  protected final String TEXT_1871 = ".";
  protected final String TEXT_1872 = "())))";
  protected final String TEXT_1873 = NL + "\t\t\t\tif (";
  protected final String TEXT_1874 = " != null && !";
  protected final String TEXT_1875 = ".get(j).equals(";
  protected final String TEXT_1876 = ".";
  protected final String TEXT_1877 = "()))";
  protected final String TEXT_1878 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1879 = "Loop;";
  protected final String TEXT_1880 = NL + "\t\t\t}";
  protected final String TEXT_1881 = NL + "\t\t\t";
  protected final String TEXT_1882 = " ";
  protected final String TEXT_1883 = " = ";
  protected final String TEXT_1884 = ".";
  protected final String TEXT_1885 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1886 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1887 = "Loop;";
  protected final String TEXT_1888 = NL + "\t\t\tif (";
  protected final String TEXT_1889 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1890 = ".equalsIgnoreCase(";
  protected final String TEXT_1891 = ".";
  protected final String TEXT_1892 = "()) : ";
  protected final String TEXT_1893 = ".equals(";
  protected final String TEXT_1894 = ".";
  protected final String TEXT_1895 = "())))";
  protected final String TEXT_1896 = NL + "\t\t\tif (";
  protected final String TEXT_1897 = " != null && !";
  protected final String TEXT_1898 = ".equals(";
  protected final String TEXT_1899 = ".";
  protected final String TEXT_1900 = "()))";
  protected final String TEXT_1901 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1902 = "Loop;";
  protected final String TEXT_1903 = NL + "\t\t\tif (";
  protected final String TEXT_1904 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1905 = ".equalsIgnoreCase(";
  protected final String TEXT_1906 = ".";
  protected final String TEXT_1907 = "()) : ";
  protected final String TEXT_1908 = ".equals(";
  protected final String TEXT_1909 = ".";
  protected final String TEXT_1910 = "())))";
  protected final String TEXT_1911 = NL + "\t\t\tif (";
  protected final String TEXT_1912 = " != null && !";
  protected final String TEXT_1913 = ".equals(";
  protected final String TEXT_1914 = ".";
  protected final String TEXT_1915 = "()))";
  protected final String TEXT_1916 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1917 = "Loop;";
  protected final String TEXT_1918 = NL + "\t\t\treturn ";
  protected final String TEXT_1919 = ";" + NL + "\t\t}";
  protected final String TEXT_1920 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1921 = " && eClass != null";
  protected final String TEXT_1922 = " ? create";
  protected final String TEXT_1923 = "(";
  protected final String TEXT_1924 = ", eClass";
  protected final String TEXT_1925 = ") : null;";
  protected final String TEXT_1926 = NL + "\t\treturn null;";
  protected final String TEXT_1927 = NL + "\t}" + NL;
  protected final String TEXT_1928 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1929 = "()" + NL + "\t{";
  protected final String TEXT_1930 = NL + "  \t\treturn false;";
  protected final String TEXT_1931 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1932 = ");";
  protected final String TEXT_1933 = NL + "\t\treturn !((";
  protected final String TEXT_1934 = ".Internal.Wrapper)";
  protected final String TEXT_1935 = "()).featureMap().isEmpty();";
  protected final String TEXT_1936 = NL + "\t\treturn ";
  protected final String TEXT_1937 = " != null && !";
  protected final String TEXT_1938 = ".featureMap().isEmpty();";
  protected final String TEXT_1939 = NL + "\t\treturn ";
  protected final String TEXT_1940 = " != null && !";
  protected final String TEXT_1941 = ".isEmpty();";
  protected final String TEXT_1942 = NL + "\t\t";
  protected final String TEXT_1943 = " ";
  protected final String TEXT_1944 = " = (";
  protected final String TEXT_1945 = ")eVirtualGet(";
  protected final String TEXT_1946 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1947 = " != null && !";
  protected final String TEXT_1948 = ".isEmpty();";
  protected final String TEXT_1949 = NL + "\t\treturn !";
  protected final String TEXT_1950 = "().isEmpty();";
  protected final String TEXT_1951 = NL + "\t\treturn ";
  protected final String TEXT_1952 = " != null;";
  protected final String TEXT_1953 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1954 = ") != null;";
  protected final String TEXT_1955 = NL + "\t\treturn basicGet";
  protected final String TEXT_1956 = "() != null;";
  protected final String TEXT_1957 = NL + "\t\treturn ";
  protected final String TEXT_1958 = " != null;";
  protected final String TEXT_1959 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1960 = ") != null;";
  protected final String TEXT_1961 = NL + "\t\treturn ";
  protected final String TEXT_1962 = "() != null;";
  protected final String TEXT_1963 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1964 = " & ";
  protected final String TEXT_1965 = "_EFLAG) != 0) != ";
  protected final String TEXT_1966 = ";";
  protected final String TEXT_1967 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1968 = " & ";
  protected final String TEXT_1969 = "_EFLAG) != ";
  protected final String TEXT_1970 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1971 = NL + "\t\treturn ";
  protected final String TEXT_1972 = " != ";
  protected final String TEXT_1973 = ";";
  protected final String TEXT_1974 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1975 = ", ";
  protected final String TEXT_1976 = ") != ";
  protected final String TEXT_1977 = ";";
  protected final String TEXT_1978 = NL + "\t\treturn ";
  protected final String TEXT_1979 = "() != ";
  protected final String TEXT_1980 = ";";
  protected final String TEXT_1981 = NL + "\t\treturn ";
  protected final String TEXT_1982 = " == null ? ";
  protected final String TEXT_1983 = " != null : !";
  protected final String TEXT_1984 = ".equals(";
  protected final String TEXT_1985 = ");";
  protected final String TEXT_1986 = NL + "\t\t";
  protected final String TEXT_1987 = " ";
  protected final String TEXT_1988 = " = (";
  protected final String TEXT_1989 = ")eVirtualGet(";
  protected final String TEXT_1990 = ", ";
  protected final String TEXT_1991 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1992 = " == null ? ";
  protected final String TEXT_1993 = " != null : !";
  protected final String TEXT_1994 = ".equals(";
  protected final String TEXT_1995 = ");";
  protected final String TEXT_1996 = NL + "\t\treturn ";
  protected final String TEXT_1997 = " == null ? ";
  protected final String TEXT_1998 = "() != null : !";
  protected final String TEXT_1999 = ".equals(";
  protected final String TEXT_2000 = "());";
  protected final String TEXT_2001 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2002 = ");";
  protected final String TEXT_2003 = NL + "\t\t";
  protected final String TEXT_2004 = " ";
  protected final String TEXT_2005 = " = (";
  protected final String TEXT_2006 = ")eVirtualGet(";
  protected final String TEXT_2007 = ");";
  protected final String TEXT_2008 = NL + "\t\treturn ";
  protected final String TEXT_2009 = " != null && ((";
  protected final String TEXT_2010 = ".Unsettable";
  protected final String TEXT_2011 = ")";
  protected final String TEXT_2012 = ").isSet();";
  protected final String TEXT_2013 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_2014 = ");";
  protected final String TEXT_2015 = NL + "\t\treturn (";
  protected final String TEXT_2016 = " & ";
  protected final String TEXT_2017 = "_ESETFLAG) != 0;";
  protected final String TEXT_2018 = NL + "\t\treturn ";
  protected final String TEXT_2019 = "ESet;";
  protected final String TEXT_2020 = NL + "\t\treturn !((";
  protected final String TEXT_2021 = ".Internal)((";
  protected final String TEXT_2022 = ".Internal.Wrapper)get";
  protected final String TEXT_2023 = "()).featureMap()).isEmpty(";
  protected final String TEXT_2024 = ");";
  protected final String TEXT_2025 = NL + "\t\treturn !((";
  protected final String TEXT_2026 = ".Internal)get";
  protected final String TEXT_2027 = "()).isEmpty(";
  protected final String TEXT_2028 = ");";
  protected final String TEXT_2029 = NL + "\t\treturn ";
  protected final String TEXT_2030 = ".";
  protected final String TEXT_2031 = "(this);";
  protected final String TEXT_2032 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_2033 = "' ";
  protected final String TEXT_2034 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2035 = NL + "\t}" + NL;
  protected final String TEXT_2036 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_2037 = "(";
  protected final String TEXT_2038 = ") <em>";
  protected final String TEXT_2039 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2040 = "(";
  protected final String TEXT_2041 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2042 = " ";
  protected final String TEXT_2043 = "__EOCL_EXP = \"";
  protected final String TEXT_2044 = "\";";
  protected final String TEXT_2045 = NL;
  protected final String TEXT_2046 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_2047 = "(";
  protected final String TEXT_2048 = ") <em>";
  protected final String TEXT_2049 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2050 = "(";
  protected final String TEXT_2051 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_2052 = " ";
  protected final String TEXT_2053 = "__EOCL_INV;" + NL;
  protected final String TEXT_2054 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_2055 = "(";
  protected final String TEXT_2056 = ") <em>";
  protected final String TEXT_2057 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2058 = "(";
  protected final String TEXT_2059 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_2060 = "<";
  protected final String TEXT_2061 = ">";
  protected final String TEXT_2062 = " ";
  protected final String TEXT_2063 = "__EOCL_QRY;" + NL;
  protected final String TEXT_2064 = NL + "\t/**" + NL + "\t * The cached validation expression for the '{@link #";
  protected final String TEXT_2065 = "(";
  protected final String TEXT_2066 = ") <em>";
  protected final String TEXT_2067 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2068 = "(";
  protected final String TEXT_2069 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2070 = " ";
  protected final String TEXT_2071 = "__EEXPRESSION = \"";
  protected final String TEXT_2072 = "\";";
  protected final String TEXT_2073 = NL;
  protected final String TEXT_2074 = NL + "\t/**" + NL + "\t * The cached invocation delegate for the '{@link #";
  protected final String TEXT_2075 = "(";
  protected final String TEXT_2076 = ") <em>";
  protected final String TEXT_2077 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2078 = "(";
  protected final String TEXT_2079 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2080 = ".Internal.InvocationDelegate ";
  protected final String TEXT_2081 = "__EINVOCATION_DELEGATE = ((";
  protected final String TEXT_2082 = ".Internal)";
  protected final String TEXT_2083 = ").getInvocationDelegate();" + NL;
  protected final String TEXT_2084 = NL + "\t/**";
  protected final String TEXT_2085 = NL + "\t * <p>" + NL + "\t * This operation redefines the following operations:" + NL + "\t * <ul>";
  protected final String TEXT_2086 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_2087 = "#";
  protected final String TEXT_2088 = "(";
  protected final String TEXT_2089 = ") <em>";
  protected final String TEXT_2090 = "</em>}' </li>";
  protected final String TEXT_2091 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_2092 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2093 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_2094 = NL + "\t * ";
  protected final String TEXT_2095 = NL + "\t * @param ";
  protected final String TEXT_2096 = NL + "\t *   ";
  protected final String TEXT_2097 = NL + "\t * @param ";
  protected final String TEXT_2098 = " ";
  protected final String TEXT_2099 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_2100 = NL + "\t * @model ";
  protected final String TEXT_2101 = NL + "\t *        ";
  protected final String TEXT_2102 = NL + "\t * @model";
  protected final String TEXT_2103 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2104 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2105 = NL + "\t@Override";
  protected final String TEXT_2106 = NL + "\t";
  protected final String TEXT_2107 = " ";
  protected final String TEXT_2108 = "(";
  protected final String TEXT_2109 = ")";
  protected final String TEXT_2110 = ";" + NL;
  protected final String TEXT_2111 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2112 = NL + "\tpublic ";
  protected final String TEXT_2113 = " ";
  protected final String TEXT_2114 = "(";
  protected final String TEXT_2115 = ")";
  protected final String TEXT_2116 = NL + "\t{";
  protected final String TEXT_2117 = NL + "\t\t";
  protected final String TEXT_2118 = NL + "\t\treturn" + NL + "\t\t\t";
  protected final String TEXT_2119 = ".validate" + NL + "\t\t\t\t(";
  protected final String TEXT_2120 = "," + NL + "\t\t\t\t this," + NL + "\t\t\t\t ";
  protected final String TEXT_2121 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_2122 = "," + NL + "\t\t\t\t \"";
  protected final String TEXT_2123 = "\",";
  protected final String TEXT_2124 = NL + "\t\t\t\t ";
  protected final String TEXT_2125 = "," + NL + "\t\t\t\t ";
  protected final String TEXT_2126 = "__EEXPRESSION," + NL + "\t\t\t\t ";
  protected final String TEXT_2127 = ".ERROR," + NL + "\t\t\t\t ";
  protected final String TEXT_2128 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t ";
  protected final String TEXT_2129 = ".";
  protected final String TEXT_2130 = ");";
  protected final String TEXT_2131 = NL + "\t\treturn ";
  protected final String TEXT_2132 = ".";
  protected final String TEXT_2133 = "(this, ";
  protected final String TEXT_2134 = ", ";
  protected final String TEXT_2135 = ");";
  protected final String TEXT_2136 = NL + "\t\tif (";
  protected final String TEXT_2137 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2138 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_2139 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2140 = " = helper.createInvariant(";
  protected final String TEXT_2141 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2142 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_2143 = ").check(this))";
  protected final String TEXT_2144 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_2145 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_2146 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_2147 = NL + "\t\t\t\t";
  protected final String TEXT_2148 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_2149 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_2150 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2151 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2152 = ".";
  protected final String TEXT_2153 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_2154 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_2155 = "\", ";
  protected final String TEXT_2156 = ".getObjectLabel(this, ";
  protected final String TEXT_2157 = ") }),";
  protected final String TEXT_2158 = NL + "\t\t\t\t\t\t new Object [] { this }));";
  protected final String TEXT_2159 = NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_2160 = NL + "\t\ttry" + NL + "\t\t{";
  protected final String TEXT_2161 = NL + "\t\t\t";
  protected final String TEXT_2162 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_2163 = "new ";
  protected final String TEXT_2164 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_2165 = ", ";
  protected final String TEXT_2166 = ")";
  protected final String TEXT_2167 = "null";
  protected final String TEXT_2168 = ");";
  protected final String TEXT_2169 = NL + "\t\t\treturn ";
  protected final String TEXT_2170 = "(";
  protected final String TEXT_2171 = "(";
  protected final String TEXT_2172 = ")";
  protected final String TEXT_2173 = "__EINVOCATION_DELEGATE.dynamicInvoke(this, ";
  protected final String TEXT_2174 = "new ";
  protected final String TEXT_2175 = ".UnmodifiableEList<Object>(";
  protected final String TEXT_2176 = ", ";
  protected final String TEXT_2177 = ")";
  protected final String TEXT_2178 = "null";
  protected final String TEXT_2179 = ")";
  protected final String TEXT_2180 = ").";
  protected final String TEXT_2181 = "()";
  protected final String TEXT_2182 = ";";
  protected final String TEXT_2183 = NL + "\t\t}" + NL + "\t\tcatch (";
  protected final String TEXT_2184 = " ite)" + NL + "\t\t{" + NL + "\t\t\tthrow new ";
  protected final String TEXT_2185 = "(ite);" + NL + "\t\t}";
  protected final String TEXT_2186 = NL + "\t\t";
  protected final String TEXT_2187 = ".";
  protected final String TEXT_2188 = "(this";
  protected final String TEXT_2189 = ", ";
  protected final String TEXT_2190 = ");";
  protected final String TEXT_2191 = NL + "\t\t";
  protected final String TEXT_2192 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_2193 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2194 = NL + "\t\t\t";
  protected final String TEXT_2195 = " result = (";
  protected final String TEXT_2196 = ") cache.get(";
  protected final String TEXT_2197 = "eResource(), ";
  protected final String TEXT_2198 = "this, ";
  protected final String TEXT_2199 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_2200 = "eResource(), ";
  protected final String TEXT_2201 = "this, ";
  protected final String TEXT_2202 = ", result = ";
  protected final String TEXT_2203 = "new ";
  protected final String TEXT_2204 = "(";
  protected final String TEXT_2205 = ".";
  protected final String TEXT_2206 = "(this";
  protected final String TEXT_2207 = ", ";
  protected final String TEXT_2208 = ")";
  protected final String TEXT_2209 = ")";
  protected final String TEXT_2210 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_2211 = ".";
  protected final String TEXT_2212 = "()";
  protected final String TEXT_2213 = ";" + NL + "\t\t}";
  protected final String TEXT_2214 = NL + "\t\treturn ";
  protected final String TEXT_2215 = ".";
  protected final String TEXT_2216 = "(this";
  protected final String TEXT_2217 = ", ";
  protected final String TEXT_2218 = ");";
  protected final String TEXT_2219 = NL + "\t\tif (";
  protected final String TEXT_2220 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2221 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_2222 = ", ";
  protected final String TEXT_2223 = ".getEAllOperations().get(";
  protected final String TEXT_2224 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2225 = " = helper.createQuery(";
  protected final String TEXT_2226 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2227 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_2228 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_2229 = ");";
  protected final String TEXT_2230 = NL + "\t\t";
  protected final String TEXT_2231 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_2232 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_2233 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_2234 = "\", ";
  protected final String TEXT_2235 = ");";
  protected final String TEXT_2236 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2237 = NL + "\t\t";
  protected final String TEXT_2238 = "<";
  protected final String TEXT_2239 = "> result = (";
  protected final String TEXT_2240 = "<";
  protected final String TEXT_2241 = ">) query.evaluate(this);" + NL + "\t\treturn new ";
  protected final String TEXT_2242 = ".UnmodifiableEList<";
  protected final String TEXT_2243 = ">(result.size(), result.toArray());";
  protected final String TEXT_2244 = NL + "\t\treturn ((";
  protected final String TEXT_2245 = ") query.evaluate(this)).";
  protected final String TEXT_2246 = "();";
  protected final String TEXT_2247 = NL + "\t\treturn (";
  protected final String TEXT_2248 = ") query.evaluate(this);";
  protected final String TEXT_2249 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2250 = NL + "\t}" + NL;
  protected final String TEXT_2251 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2252 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2253 = NL + "\t@Override";
  protected final String TEXT_2254 = NL + "\tpublic ";
  protected final String TEXT_2255 = " eInverseAdd(";
  protected final String TEXT_2256 = " otherEnd, int featureID, ";
  protected final String TEXT_2257 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2258 = ")" + NL + "\t\t{";
  protected final String TEXT_2259 = NL + "\t\t\tcase ";
  protected final String TEXT_2260 = ":";
  protected final String TEXT_2261 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2262 = "(";
  protected final String TEXT_2263 = ".InternalMapView";
  protected final String TEXT_2264 = ")";
  protected final String TEXT_2265 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2266 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2267 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2268 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2269 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2270 = "((";
  protected final String TEXT_2271 = ")otherEnd, msgs);";
  protected final String TEXT_2272 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_2273 = ", msgs);";
  protected final String TEXT_2274 = NL + "\t\t\t\t";
  protected final String TEXT_2275 = " ";
  protected final String TEXT_2276 = " = (";
  protected final String TEXT_2277 = ")eVirtualGet(";
  protected final String TEXT_2278 = ");";
  protected final String TEXT_2279 = NL + "\t\t\t\t";
  protected final String TEXT_2280 = " ";
  protected final String TEXT_2281 = " = ";
  protected final String TEXT_2282 = "basicGet";
  protected final String TEXT_2283 = "();";
  protected final String TEXT_2284 = NL + "\t\t\t\tif (";
  protected final String TEXT_2285 = " != null)";
  protected final String TEXT_2286 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2287 = ")";
  protected final String TEXT_2288 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_2289 = ", null, msgs);";
  protected final String TEXT_2290 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2291 = ")";
  protected final String TEXT_2292 = ").eInverseRemove(this, ";
  protected final String TEXT_2293 = ", ";
  protected final String TEXT_2294 = ".class, msgs);";
  protected final String TEXT_2295 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2296 = "((";
  protected final String TEXT_2297 = ")otherEnd, msgs);";
  protected final String TEXT_2298 = NL + "\t\t}";
  protected final String TEXT_2299 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2300 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2301 = NL + "\t}" + NL;
  protected final String TEXT_2302 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2303 = NL + "\t@Override";
  protected final String TEXT_2304 = NL + "\tpublic ";
  protected final String TEXT_2305 = " eInverseRemove(";
  protected final String TEXT_2306 = " otherEnd, int featureID, ";
  protected final String TEXT_2307 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2308 = ")" + NL + "\t\t{";
  protected final String TEXT_2309 = NL + "\t\t\tcase ";
  protected final String TEXT_2310 = ":";
  protected final String TEXT_2311 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2312 = ")((";
  protected final String TEXT_2313 = ".InternalMapView";
  protected final String TEXT_2314 = ")";
  protected final String TEXT_2315 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2316 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2317 = ")((";
  protected final String TEXT_2318 = ".Internal.Wrapper)";
  protected final String TEXT_2319 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2320 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2321 = ")";
  protected final String TEXT_2322 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2323 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_2324 = ", msgs);";
  protected final String TEXT_2325 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_2326 = "(msgs);";
  protected final String TEXT_2327 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2328 = "(null, msgs);";
  protected final String TEXT_2329 = NL + "\t\t}";
  protected final String TEXT_2330 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2331 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2332 = NL + "\t}" + NL;
  protected final String TEXT_2333 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2334 = NL + "\t@Override";
  protected final String TEXT_2335 = NL + "\tpublic ";
  protected final String TEXT_2336 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_2337 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID()";
  protected final String TEXT_2338 = ")" + NL + "\t\t{";
  protected final String TEXT_2339 = NL + "\t\t\tcase ";
  protected final String TEXT_2340 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_2341 = ", ";
  protected final String TEXT_2342 = ".class, msgs);";
  protected final String TEXT_2343 = NL + "\t\t}";
  protected final String TEXT_2344 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_2345 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2346 = NL + "\t}" + NL;
  protected final String TEXT_2347 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2348 = NL + "\t@Override";
  protected final String TEXT_2349 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2350 = ")" + NL + "\t\t{";
  protected final String TEXT_2351 = NL + "\t\t\tcase ";
  protected final String TEXT_2352 = ":";
  protected final String TEXT_2353 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2354 = "();";
  protected final String TEXT_2355 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2356 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_2357 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_2358 = "(";
  protected final String TEXT_2359 = "());";
  protected final String TEXT_2360 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_2361 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2362 = "();";
  protected final String TEXT_2363 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2364 = ".InternalMapView";
  protected final String TEXT_2365 = ")";
  protected final String TEXT_2366 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2367 = "();";
  protected final String TEXT_2368 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2369 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2370 = "().map();";
  protected final String TEXT_2371 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2372 = ".Internal.Wrapper)";
  protected final String TEXT_2373 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2374 = "();";
  protected final String TEXT_2375 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2376 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_2377 = ".Internal)";
  protected final String TEXT_2378 = "()).getWrapper();";
  protected final String TEXT_2379 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2380 = "();";
  protected final String TEXT_2381 = NL + "\t\t}";
  protected final String TEXT_2382 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_2383 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_2384 = NL + "\t}" + NL;
  protected final String TEXT_2385 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2386 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2387 = NL + "\t@Override";
  protected final String TEXT_2388 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2389 = ")" + NL + "\t\t{";
  protected final String TEXT_2390 = NL + "\t\t\tcase ";
  protected final String TEXT_2391 = ":";
  protected final String TEXT_2392 = NL + "\t\t\t\t((";
  protected final String TEXT_2393 = ".Internal)((";
  protected final String TEXT_2394 = ".Internal.Wrapper)";
  protected final String TEXT_2395 = "()).featureMap()).set(newValue);";
  protected final String TEXT_2396 = NL + "\t\t\t\t((";
  protected final String TEXT_2397 = ".Internal)";
  protected final String TEXT_2398 = "()).set(newValue);";
  protected final String TEXT_2399 = NL + "\t\t\t\t((";
  protected final String TEXT_2400 = ".Setting)((";
  protected final String TEXT_2401 = ".InternalMapView";
  protected final String TEXT_2402 = ")";
  protected final String TEXT_2403 = "()).eMap()).set(newValue);";
  protected final String TEXT_2404 = NL + "\t\t\t\t((";
  protected final String TEXT_2405 = ".Setting)";
  protected final String TEXT_2406 = "()).set(newValue);";
  protected final String TEXT_2407 = NL + "\t\t\t\t";
  protected final String TEXT_2408 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_2409 = "().addAll((";
  protected final String TEXT_2410 = "<? extends ";
  protected final String TEXT_2411 = ">";
  protected final String TEXT_2412 = ")newValue);";
  protected final String TEXT_2413 = NL + "\t\t\t\tset";
  protected final String TEXT_2414 = "(((";
  protected final String TEXT_2415 = ")newValue).";
  protected final String TEXT_2416 = "());";
  protected final String TEXT_2417 = NL + "\t\t\t\tset";
  protected final String TEXT_2418 = "(";
  protected final String TEXT_2419 = "(";
  protected final String TEXT_2420 = ")";
  protected final String TEXT_2421 = "newValue);";
  protected final String TEXT_2422 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2423 = NL + "\t\t}";
  protected final String TEXT_2424 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_2425 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_2426 = NL + "\t}" + NL;
  protected final String TEXT_2427 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2428 = NL + "\t@Override";
  protected final String TEXT_2429 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2430 = ")" + NL + "\t\t{";
  protected final String TEXT_2431 = NL + "\t\t\tcase ";
  protected final String TEXT_2432 = ":";
  protected final String TEXT_2433 = NL + "\t\t\t\t((";
  protected final String TEXT_2434 = ".Internal.Wrapper)";
  protected final String TEXT_2435 = "()).featureMap().clear();";
  protected final String TEXT_2436 = NL + "\t\t\t\t";
  protected final String TEXT_2437 = "().clear();";
  protected final String TEXT_2438 = NL + "\t\t\t\tunset";
  protected final String TEXT_2439 = "();";
  protected final String TEXT_2440 = NL + "\t\t\t\tset";
  protected final String TEXT_2441 = "((";
  protected final String TEXT_2442 = ")null);";
  protected final String TEXT_2443 = NL + "\t\t\t\t";
  protected final String TEXT_2444 = "__ESETTING_DELEGATE.dynamicUnset(this, null, 0);";
  protected final String TEXT_2445 = NL + "\t\t\t\tset";
  protected final String TEXT_2446 = "(";
  protected final String TEXT_2447 = ");";
  protected final String TEXT_2448 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2449 = NL + "\t\t}";
  protected final String TEXT_2450 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_2451 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_2452 = NL + "\t}" + NL;
  protected final String TEXT_2453 = NL;
  protected final String TEXT_2454 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2455 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2456 = NL + "\t@Override";
  protected final String TEXT_2457 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_2458 = NL + "\t\t\tcase ";
  protected final String TEXT_2459 = ":";
  protected final String TEXT_2460 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2461 = "();";
  protected final String TEXT_2462 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2463 = "();";
  protected final String TEXT_2464 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2465 = "__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);";
  protected final String TEXT_2466 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_2467 = ".Internal.Wrapper)";
  protected final String TEXT_2468 = "()).featureMap().isEmpty();";
  protected final String TEXT_2469 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2470 = " != null && !";
  protected final String TEXT_2471 = ".featureMap().isEmpty();";
  protected final String TEXT_2472 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2473 = " != null && !";
  protected final String TEXT_2474 = ".isEmpty();";
  protected final String TEXT_2475 = NL + "\t\t\t\t";
  protected final String TEXT_2476 = " ";
  protected final String TEXT_2477 = " = (";
  protected final String TEXT_2478 = ")eVirtualGet(";
  protected final String TEXT_2479 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2480 = " != null && !";
  protected final String TEXT_2481 = ".isEmpty();";
  protected final String TEXT_2482 = NL + "\t\t\t\treturn !";
  protected final String TEXT_2483 = "().isEmpty();";
  protected final String TEXT_2484 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2485 = "();";
  protected final String TEXT_2486 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2487 = " != null;";
  protected final String TEXT_2488 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2489 = ") != null;";
  protected final String TEXT_2490 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2491 = "() != null;";
  protected final String TEXT_2492 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2493 = " != null;";
  protected final String TEXT_2494 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2495 = ") != null;";
  protected final String TEXT_2496 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2497 = "() != null;";
  protected final String TEXT_2498 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2499 = " & ";
  protected final String TEXT_2500 = "_EFLAG) != 0) != ";
  protected final String TEXT_2501 = ";";
  protected final String TEXT_2502 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2503 = " & ";
  protected final String TEXT_2504 = "_EFLAG) != ";
  protected final String TEXT_2505 = "_EFLAG_DEFAULT;";
  protected final String TEXT_2506 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2507 = " != ";
  protected final String TEXT_2508 = ";";
  protected final String TEXT_2509 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2510 = ", ";
  protected final String TEXT_2511 = ") != ";
  protected final String TEXT_2512 = ";";
  protected final String TEXT_2513 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2514 = "() != ";
  protected final String TEXT_2515 = ";";
  protected final String TEXT_2516 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2517 = " == null ? ";
  protected final String TEXT_2518 = " != null : !";
  protected final String TEXT_2519 = ".equals(";
  protected final String TEXT_2520 = ");";
  protected final String TEXT_2521 = NL + "\t\t\t\t";
  protected final String TEXT_2522 = " ";
  protected final String TEXT_2523 = " = (";
  protected final String TEXT_2524 = ")eVirtualGet(";
  protected final String TEXT_2525 = ", ";
  protected final String TEXT_2526 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2527 = " == null ? ";
  protected final String TEXT_2528 = " != null : !";
  protected final String TEXT_2529 = ".equals(";
  protected final String TEXT_2530 = ");";
  protected final String TEXT_2531 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2532 = " == null ? ";
  protected final String TEXT_2533 = "() != null : !";
  protected final String TEXT_2534 = ".equals(";
  protected final String TEXT_2535 = "());";
  protected final String TEXT_2536 = NL + "\t\t}";
  protected final String TEXT_2537 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2538 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2539 = NL + "\t}" + NL;
  protected final String TEXT_2540 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2541 = NL + "\t@Override";
  protected final String TEXT_2542 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2543 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2544 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2545 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_2546 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2547 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2548 = ": return ";
  protected final String TEXT_2549 = ";";
  protected final String TEXT_2550 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2551 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_2552 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2553 = NL + "\t@Override";
  protected final String TEXT_2554 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2555 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2556 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2557 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2558 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2559 = ": return ";
  protected final String TEXT_2560 = ";";
  protected final String TEXT_2561 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2562 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2563 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_2564 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2565 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2566 = ": return ";
  protected final String TEXT_2567 = ";";
  protected final String TEXT_2568 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2569 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2570 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2571 = NL + "\t@Override";
  protected final String TEXT_2572 = NL + "\tpublic int eDerivedOperationID(int baseOperationID, Class";
  protected final String TEXT_2573 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2574 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2575 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_2576 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2577 = ": return ";
  protected final String TEXT_2578 = ";";
  protected final String TEXT_2579 = NL + "\t\t\t\tdefault: return super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2580 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2581 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID)" + NL + "\t\t\t{";
  protected final String TEXT_2582 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2583 = ": return ";
  protected final String TEXT_2584 = ";";
  protected final String TEXT_2585 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2586 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2587 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseOperationID";
  protected final String TEXT_2588 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2589 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2590 = ": return ";
  protected final String TEXT_2591 = ";";
  protected final String TEXT_2592 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2593 = NL + "\t\treturn super.eDerivedOperationID(baseOperationID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2594 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2595 = NL + "\t@Override";
  protected final String TEXT_2596 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2597 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2598 = NL + "\t@Override";
  protected final String TEXT_2599 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2600 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2601 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2602 = NL + "\t@Override";
  protected final String TEXT_2603 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2604 = NL + "\t\t\tcase ";
  protected final String TEXT_2605 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2606 = ";";
  protected final String TEXT_2607 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2608 = NL + "\t@Override";
  protected final String TEXT_2609 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2610 = NL + "\t\t\tcase ";
  protected final String TEXT_2611 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2612 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2613 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2614 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2615 = NL + "\t@Override";
  protected final String TEXT_2616 = NL + "\t@SuppressWarnings(";
  protected final String TEXT_2617 = "\"unchecked\"";
  protected final String TEXT_2618 = "{\"rawtypes\", \"unchecked\" }";
  protected final String TEXT_2619 = ")";
  protected final String TEXT_2620 = NL + "\tpublic Object eInvoke(int operationID, ";
  protected final String TEXT_2621 = " arguments) throws ";
  protected final String TEXT_2622 = NL + "\t{" + NL + "\t\tswitch (operationID";
  protected final String TEXT_2623 = ")" + NL + "\t\t{";
  protected final String TEXT_2624 = NL + "\t\t\tcase ";
  protected final String TEXT_2625 = ":";
  protected final String TEXT_2626 = NL + "\t\t\t\ttry" + NL + "\t\t\t\t{";
  protected final String TEXT_2627 = NL + "\t\t\t\t";
  protected final String TEXT_2628 = "(";
  protected final String TEXT_2629 = "(";
  protected final String TEXT_2630 = "(";
  protected final String TEXT_2631 = ")";
  protected final String TEXT_2632 = "arguments.get(";
  protected final String TEXT_2633 = ")";
  protected final String TEXT_2634 = ").";
  protected final String TEXT_2635 = "()";
  protected final String TEXT_2636 = ", ";
  protected final String TEXT_2637 = ");" + NL + "\t\t\t\t";
  protected final String TEXT_2638 = "return null;";
  protected final String TEXT_2639 = NL + "\t\t\t\t";
  protected final String TEXT_2640 = "return ";
  protected final String TEXT_2641 = "new ";
  protected final String TEXT_2642 = "(";
  protected final String TEXT_2643 = "(";
  protected final String TEXT_2644 = "(";
  protected final String TEXT_2645 = "(";
  protected final String TEXT_2646 = ")";
  protected final String TEXT_2647 = "arguments.get(";
  protected final String TEXT_2648 = ")";
  protected final String TEXT_2649 = ").";
  protected final String TEXT_2650 = "()";
  protected final String TEXT_2651 = ", ";
  protected final String TEXT_2652 = ")";
  protected final String TEXT_2653 = ")";
  protected final String TEXT_2654 = ";";
  protected final String TEXT_2655 = NL + "\t\t\t\t}" + NL + "\t\t\t\tcatch (";
  protected final String TEXT_2656 = " throwable)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tthrow new ";
  protected final String TEXT_2657 = "(throwable);" + NL + "\t\t\t\t}";
  protected final String TEXT_2658 = NL + "\t\t}";
  protected final String TEXT_2659 = NL + "\t\treturn super.eInvoke(operationID, arguments);";
  protected final String TEXT_2660 = NL + "\t\treturn eDynamicInvoke(operationID, arguments);";
  protected final String TEXT_2661 = NL + "\t}" + NL;
  protected final String TEXT_2662 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2663 = NL + "\t@Override";
  protected final String TEXT_2664 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2665 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2666 = ": \");";
  protected final String TEXT_2667 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2668 = ": \");";
  protected final String TEXT_2669 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2670 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2671 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2672 = NL + "\t\tif (";
  protected final String TEXT_2673 = "(";
  protected final String TEXT_2674 = " & ";
  protected final String TEXT_2675 = "_ESETFLAG) != 0";
  protected final String TEXT_2676 = "ESet";
  protected final String TEXT_2677 = ") result.append((";
  protected final String TEXT_2678 = " & ";
  protected final String TEXT_2679 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2680 = NL + "\t\tif (";
  protected final String TEXT_2681 = "(";
  protected final String TEXT_2682 = " & ";
  protected final String TEXT_2683 = "_ESETFLAG) != 0";
  protected final String TEXT_2684 = "ESet";
  protected final String TEXT_2685 = ") result.append(";
  protected final String TEXT_2686 = "_EFLAG_VALUES[(";
  protected final String TEXT_2687 = " & ";
  protected final String TEXT_2688 = "_EFLAG) >>> ";
  protected final String TEXT_2689 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_2690 = NL + "\t\tif (";
  protected final String TEXT_2691 = "(";
  protected final String TEXT_2692 = " & ";
  protected final String TEXT_2693 = "_ESETFLAG) != 0";
  protected final String TEXT_2694 = "ESet";
  protected final String TEXT_2695 = ") result.append(";
  protected final String TEXT_2696 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2697 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2698 = ", ";
  protected final String TEXT_2699 = "));";
  protected final String TEXT_2700 = NL + "\t\tresult.append((";
  protected final String TEXT_2701 = " & ";
  protected final String TEXT_2702 = "_EFLAG) != 0);";
  protected final String TEXT_2703 = NL + "\t\tresult.append(";
  protected final String TEXT_2704 = "_EFLAG_VALUES[(";
  protected final String TEXT_2705 = " & ";
  protected final String TEXT_2706 = "_EFLAG) >>> ";
  protected final String TEXT_2707 = "_EFLAG_OFFSET]);";
  protected final String TEXT_2708 = NL + "\t\tresult.append(";
  protected final String TEXT_2709 = ");";
  protected final String TEXT_2710 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2711 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2712 = NL + "\t@";
  protected final String TEXT_2713 = NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2714 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2715 = " getKey()" + NL + "\t{";
  protected final String TEXT_2716 = NL + "\t\treturn new ";
  protected final String TEXT_2717 = "(getTypedKey());";
  protected final String TEXT_2718 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2719 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2720 = " key)" + NL + "\t{";
  protected final String TEXT_2721 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2722 = "(";
  protected final String TEXT_2723 = ")";
  protected final String TEXT_2724 = "key);";
  protected final String TEXT_2725 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2726 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2727 = ")key).";
  protected final String TEXT_2728 = "());";
  protected final String TEXT_2729 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2730 = ")key);";
  protected final String TEXT_2731 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2732 = " getValue()" + NL + "\t{";
  protected final String TEXT_2733 = NL + "\t\treturn new ";
  protected final String TEXT_2734 = "(getTypedValue());";
  protected final String TEXT_2735 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2736 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2737 = " setValue(";
  protected final String TEXT_2738 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2739 = " oldValue = getValue();";
  protected final String TEXT_2740 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2741 = "(";
  protected final String TEXT_2742 = ")";
  protected final String TEXT_2743 = "value);";
  protected final String TEXT_2744 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2745 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2746 = ")value).";
  protected final String TEXT_2747 = "());";
  protected final String TEXT_2748 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2749 = ")value);";
  protected final String TEXT_2750 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2751 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2752 = NL + "\tpublic ";
  protected final String TEXT_2753 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2754 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2755 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2756 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2757 = " EOCL_ENV = ";
  protected final String TEXT_2758 = ".newInstance();" + NL;
  protected final String TEXT_2759 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2760 = " create(";
  protected final String TEXT_2761 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2762 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2763 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2764 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2765 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2766 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2767 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2768 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2769 = NL + "\t@Override";
  protected final String TEXT_2770 = NL + "\tprotected ";
  protected final String TEXT_2771 = " ";
  protected final String TEXT_2772 = "Helper(";
  protected final String TEXT_2773 = " ";
  protected final String TEXT_2774 = ")" + NL + "\t{";
  protected final String TEXT_2775 = NL + "\t\t";
  protected final String TEXT_2776 = ".addAll(super.";
  protected final String TEXT_2777 = "());";
  protected final String TEXT_2778 = NL + "\t\tsuper.";
  protected final String TEXT_2779 = "Helper(";
  protected final String TEXT_2780 = ");";
  protected final String TEXT_2781 = NL + "\t\tif (isSet";
  protected final String TEXT_2782 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2783 = "<";
  protected final String TEXT_2784 = ">";
  protected final String TEXT_2785 = " i = ((";
  protected final String TEXT_2786 = ") ";
  protected final String TEXT_2787 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2788 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2789 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2790 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2791 = "<";
  protected final String TEXT_2792 = ">";
  protected final String TEXT_2793 = " i = ((";
  protected final String TEXT_2794 = ") ";
  protected final String TEXT_2795 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2796 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2797 = NL + "\t\t";
  protected final String TEXT_2798 = " ";
  protected final String TEXT_2799 = " = ";
  protected final String TEXT_2800 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2801 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2802 = "<";
  protected final String TEXT_2803 = ">";
  protected final String TEXT_2804 = " i = ((";
  protected final String TEXT_2805 = ") ";
  protected final String TEXT_2806 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2807 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2808 = NL + "\t\tif (isSet";
  protected final String TEXT_2809 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2810 = ".addAll(";
  protected final String TEXT_2811 = "());" + NL + "\t\t}";
  protected final String TEXT_2812 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2813 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2814 = ".addAll(";
  protected final String TEXT_2815 = "());" + NL + "\t\t}";
  protected final String TEXT_2816 = NL + "\t\t";
  protected final String TEXT_2817 = " ";
  protected final String TEXT_2818 = " = ";
  protected final String TEXT_2819 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2820 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2821 = ".addAll(";
  protected final String TEXT_2822 = ");" + NL + "\t\t}";
  protected final String TEXT_2823 = NL + "\t\tif (isSet";
  protected final String TEXT_2824 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2825 = ".add(";
  protected final String TEXT_2826 = "basicGet";
  protected final String TEXT_2827 = "());" + NL + "\t\t}";
  protected final String TEXT_2828 = NL + "\t\t";
  protected final String TEXT_2829 = " ";
  protected final String TEXT_2830 = " = ";
  protected final String TEXT_2831 = "basicGet";
  protected final String TEXT_2832 = "();" + NL + "\t\tif (";
  protected final String TEXT_2833 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2834 = ".add(";
  protected final String TEXT_2835 = ");" + NL + "\t\t}";
  protected final String TEXT_2836 = NL + "\t\treturn ";
  protected final String TEXT_2837 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2838 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2839 = NL + "\t@Override";
  protected final String TEXT_2840 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2841 = "()" + NL + "\t{";
  protected final String TEXT_2842 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2843 = "()";
  protected final String TEXT_2844 = NL + "\t\treturn isSet";
  protected final String TEXT_2845 = "()";
  protected final String TEXT_2846 = ";";
  protected final String TEXT_2847 = NL + "\t\treturn !";
  protected final String TEXT_2848 = "().isEmpty()";
  protected final String TEXT_2849 = ";";
  protected final String TEXT_2850 = NL + "\t\treturn ";
  protected final String TEXT_2851 = "basicGet";
  protected final String TEXT_2852 = "() != null";
  protected final String TEXT_2853 = ";";
  protected final String TEXT_2854 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2855 = ")";
  protected final String TEXT_2856 = ";";
  protected final String TEXT_2857 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2858 = "()";
  protected final String TEXT_2859 = ";";
  protected final String TEXT_2860 = NL + "\t\t\t|| !";
  protected final String TEXT_2861 = "().isEmpty()";
  protected final String TEXT_2862 = ";";
  protected final String TEXT_2863 = NL + "\t\t\t|| ";
  protected final String TEXT_2864 = "basicGet";
  protected final String TEXT_2865 = "() != null";
  protected final String TEXT_2866 = ";";
  protected final String TEXT_2867 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2868 = ")";
  protected final String TEXT_2869 = ";";
  protected final String TEXT_2870 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2871 = "();";
  protected final String TEXT_2872 = NL + "\t\treturn false;";
  protected final String TEXT_2873 = NL + "\t}" + NL;
  protected final String TEXT_2874 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2875 = NL + "\t@Override";
  protected final String TEXT_2876 = NL + "\tpublic ";
  protected final String TEXT_2877 = " ";
  protected final String TEXT_2878 = "()" + NL + "\t{";
  protected final String TEXT_2879 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2880 = " ";
  protected final String TEXT_2881 = " = (";
  protected final String TEXT_2882 = ")((";
  protected final String TEXT_2883 = ")";
  protected final String TEXT_2884 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2885 = ";";
  protected final String TEXT_2886 = NL + "\t\treturn ";
  protected final String TEXT_2887 = "();";
  protected final String TEXT_2888 = NL + "\t\t";
  protected final String TEXT_2889 = " ";
  protected final String TEXT_2890 = " = new ";
  protected final String TEXT_2891 = "();" + NL + "\t\t";
  protected final String TEXT_2892 = " ";
  protected final String TEXT_2893 = " = ";
  protected final String TEXT_2894 = "();" + NL + "\t\tif (";
  protected final String TEXT_2895 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2896 = ".add(";
  protected final String TEXT_2897 = ");" + NL + "\t\t}" + NL + "\t\treturn new ";
  protected final String TEXT_2898 = "(this, ";
  protected final String TEXT_2899 = "null";
  protected final String TEXT_2900 = ", ";
  protected final String TEXT_2901 = ".size(), ";
  protected final String TEXT_2902 = ".toArray());";
  protected final String TEXT_2903 = NL + "\t\treturn null;";
  protected final String TEXT_2904 = NL + "\t\treturn ";
  protected final String TEXT_2905 = "();";
  protected final String TEXT_2906 = NL + "\t}" + NL;
  protected final String TEXT_2907 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2908 = NL + "\t@Override";
  protected final String TEXT_2909 = NL + "\tpublic ";
  protected final String TEXT_2910 = " basicGet";
  protected final String TEXT_2911 = "()" + NL + "\t{";
  protected final String TEXT_2912 = NL + "\t\treturn null;";
  protected final String TEXT_2913 = NL + "\t\treturn ";
  protected final String TEXT_2914 = "basicGet";
  protected final String TEXT_2915 = "();";
  protected final String TEXT_2916 = NL + "\t}" + NL;
  protected final String TEXT_2917 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2918 = NL + "\t@Override";
  protected final String TEXT_2919 = NL + "\tpublic ";
  protected final String TEXT_2920 = " basicSet";
  protected final String TEXT_2921 = "(";
  protected final String TEXT_2922 = " new";
  protected final String TEXT_2923 = ", ";
  protected final String TEXT_2924 = " msgs)" + NL + "\t{";
  protected final String TEXT_2925 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2926 = NL + "\t\tif (new";
  protected final String TEXT_2927 = " != null && !(new";
  protected final String TEXT_2928 = " instanceof ";
  protected final String TEXT_2929 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(\"new";
  protected final String TEXT_2930 = " must be an instance of ";
  protected final String TEXT_2931 = "\");";
  protected final String TEXT_2932 = NL + "\t\t}";
  protected final String TEXT_2933 = NL + "\t\treturn basicSet";
  protected final String TEXT_2934 = "(";
  protected final String TEXT_2935 = "(";
  protected final String TEXT_2936 = ") ";
  protected final String TEXT_2937 = "new";
  protected final String TEXT_2938 = ", msgs);";
  protected final String TEXT_2939 = NL + "\t\tset";
  protected final String TEXT_2940 = "(";
  protected final String TEXT_2941 = "(";
  protected final String TEXT_2942 = ") ";
  protected final String TEXT_2943 = "new";
  protected final String TEXT_2944 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2945 = NL + "\t}" + NL;
  protected final String TEXT_2946 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2947 = NL + "\t@Override";
  protected final String TEXT_2948 = NL + "\tpublic void set";
  protected final String TEXT_2949 = "(";
  protected final String TEXT_2950 = " new";
  protected final String TEXT_2951 = ")" + NL + "\t{";
  protected final String TEXT_2952 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2953 = NL + "\t\tif (new";
  protected final String TEXT_2954 = " != null && !(new";
  protected final String TEXT_2955 = " instanceof ";
  protected final String TEXT_2956 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(\"new";
  protected final String TEXT_2957 = " must be an instance of ";
  protected final String TEXT_2958 = "\");";
  protected final String TEXT_2959 = NL + "\t\t}";
  protected final String TEXT_2960 = NL + "\t\tset";
  protected final String TEXT_2961 = "(";
  protected final String TEXT_2962 = "(";
  protected final String TEXT_2963 = ") ";
  protected final String TEXT_2964 = "new";
  protected final String TEXT_2965 = ");";
  protected final String TEXT_2966 = NL + "\t}" + NL;
  protected final String TEXT_2967 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2968 = "() <em>";
  protected final String TEXT_2969 = "</em>}' ";
  protected final String TEXT_2970 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2971 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2972 = "_ESUBSETS = ";
  protected final String TEXT_2973 = ";" + NL;
  protected final String TEXT_2974 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2975 = "() <em>";
  protected final String TEXT_2976 = "</em>}' ";
  protected final String TEXT_2977 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2978 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2979 = "_ESUPERSETS = ";
  protected final String TEXT_2980 = ";" + NL;
  protected final String TEXT_2981 = NL + "\t/**";
  protected final String TEXT_2982 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2983 = "}, with the specified ";
  protected final String TEXT_2984 = ", and appends it to the '<em><b>";
  protected final String TEXT_2985 = "</b></em>' ";
  protected final String TEXT_2986 = ".";
  protected final String TEXT_2987 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2988 = "}, with the specified ";
  protected final String TEXT_2989 = ", and sets the '<em><b>";
  protected final String TEXT_2990 = "</b></em>' ";
  protected final String TEXT_2991 = ".";
  protected final String TEXT_2992 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2993 = "} and appends it to the '<em><b>";
  protected final String TEXT_2994 = "</b></em>' ";
  protected final String TEXT_2995 = ".";
  protected final String TEXT_2996 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2997 = "} and sets the '<em><b>";
  protected final String TEXT_2998 = "</b></em>' ";
  protected final String TEXT_2999 = ".";
  protected final String TEXT_3000 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3001 = NL + "\t * @param ";
  protected final String TEXT_3002 = " The ";
  protected final String TEXT_3003 = " for the new {@link ";
  protected final String TEXT_3004 = "}, or <code>null</code>.";
  protected final String TEXT_3005 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_3006 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_3007 = "}." + NL + "\t * @see #";
  protected final String TEXT_3008 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3009 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3010 = NL + "\t";
  protected final String TEXT_3011 = " create";
  protected final String TEXT_3012 = "(";
  protected final String TEXT_3013 = ", ";
  protected final String TEXT_3014 = " eClass);" + NL;
  protected final String TEXT_3015 = NL + "\t@Override";
  protected final String TEXT_3016 = NL + "\tpublic ";
  protected final String TEXT_3017 = " create";
  protected final String TEXT_3018 = "(";
  protected final String TEXT_3019 = ", ";
  protected final String TEXT_3020 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_3021 = " new";
  protected final String TEXT_3022 = " = (";
  protected final String TEXT_3023 = ") create(eClass);";
  protected final String TEXT_3024 = NL + "\t\t";
  protected final String TEXT_3025 = "().add(new";
  protected final String TEXT_3026 = ");";
  protected final String TEXT_3027 = NL + "\t\tset";
  protected final String TEXT_3028 = "(new";
  protected final String TEXT_3029 = ");";
  protected final String TEXT_3030 = NL + "\t\tint ";
  protected final String TEXT_3031 = "ListSize = 0;";
  protected final String TEXT_3032 = NL + "\t\tint ";
  protected final String TEXT_3033 = "Size = ";
  protected final String TEXT_3034 = " == null ? 0 : ";
  protected final String TEXT_3035 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_3036 = "Size > ";
  protected final String TEXT_3037 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_3038 = "ListSize = ";
  protected final String TEXT_3039 = "Size;";
  protected final String TEXT_3040 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_3041 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_3042 = ".create";
  protected final String TEXT_3043 = "(";
  protected final String TEXT_3044 = ", ";
  protected final String TEXT_3045 = "i < ";
  protected final String TEXT_3046 = "Size ? (";
  protected final String TEXT_3047 = ") ";
  protected final String TEXT_3048 = ".get(i) : null";
  protected final String TEXT_3049 = ");" + NL + "\t\t}";
  protected final String TEXT_3050 = NL + "\t\tnew";
  protected final String TEXT_3051 = ".create";
  protected final String TEXT_3052 = "(";
  protected final String TEXT_3053 = ", ";
  protected final String TEXT_3054 = ");";
  protected final String TEXT_3055 = NL + "\t\tif (";
  protected final String TEXT_3056 = " != null)";
  protected final String TEXT_3057 = NL + "\t\t\tnew";
  protected final String TEXT_3058 = ".";
  protected final String TEXT_3059 = "().addAll(";
  protected final String TEXT_3060 = ");";
  protected final String TEXT_3061 = NL + "\t\t\tnew";
  protected final String TEXT_3062 = ".set";
  protected final String TEXT_3063 = "(";
  protected final String TEXT_3064 = ");";
  protected final String TEXT_3065 = NL + "\t\treturn new";
  protected final String TEXT_3066 = ";" + NL + "\t}" + NL;
  protected final String TEXT_3067 = NL + "\t/**";
  protected final String TEXT_3068 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_3069 = "}, with the specified ";
  protected final String TEXT_3070 = ", and appends it to the '<em><b>";
  protected final String TEXT_3071 = "</b></em>' ";
  protected final String TEXT_3072 = ".";
  protected final String TEXT_3073 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_3074 = "},with the specified ";
  protected final String TEXT_3075 = ", and sets the '<em><b>";
  protected final String TEXT_3076 = "</b></em>' ";
  protected final String TEXT_3077 = ".";
  protected final String TEXT_3078 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_3079 = "} and appends it to the '<em><b>";
  protected final String TEXT_3080 = "</b></em>' ";
  protected final String TEXT_3081 = ".";
  protected final String TEXT_3082 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_3083 = "} and sets the '<em><b>";
  protected final String TEXT_3084 = "</b></em>' ";
  protected final String TEXT_3085 = ".";
  protected final String TEXT_3086 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3087 = NL + "\t * @param ";
  protected final String TEXT_3088 = " The ";
  protected final String TEXT_3089 = " for the new {@link ";
  protected final String TEXT_3090 = "}, or <code>null</code>.";
  protected final String TEXT_3091 = NL + "\t * @return The new {@link ";
  protected final String TEXT_3092 = "}." + NL + "\t * @see #";
  protected final String TEXT_3093 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3094 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3095 = NL + "\t";
  protected final String TEXT_3096 = " create";
  protected final String TEXT_3097 = "(";
  protected final String TEXT_3098 = ");" + NL;
  protected final String TEXT_3099 = NL + "\t@Override";
  protected final String TEXT_3100 = NL + "\tpublic ";
  protected final String TEXT_3101 = " create";
  protected final String TEXT_3102 = "(";
  protected final String TEXT_3103 = ")" + NL + "\t{";
  protected final String TEXT_3104 = NL + "\t\treturn create";
  protected final String TEXT_3105 = "(";
  protected final String TEXT_3106 = ", ";
  protected final String TEXT_3107 = ");";
  protected final String TEXT_3108 = NL + "\t\t";
  protected final String TEXT_3109 = " new";
  protected final String TEXT_3110 = " = (";
  protected final String TEXT_3111 = ") create(";
  protected final String TEXT_3112 = ");";
  protected final String TEXT_3113 = NL + "\t\t";
  protected final String TEXT_3114 = "().add(new";
  protected final String TEXT_3115 = ");";
  protected final String TEXT_3116 = NL + "\t\tset";
  protected final String TEXT_3117 = "(new";
  protected final String TEXT_3118 = ");";
  protected final String TEXT_3119 = NL + "\t\tint ";
  protected final String TEXT_3120 = "ListSize = 0;";
  protected final String TEXT_3121 = NL + "\t\tint ";
  protected final String TEXT_3122 = "Size = ";
  protected final String TEXT_3123 = " == null ? 0 : ";
  protected final String TEXT_3124 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_3125 = "Size > ";
  protected final String TEXT_3126 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_3127 = "ListSize = ";
  protected final String TEXT_3128 = "Size;";
  protected final String TEXT_3129 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_3130 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_3131 = ".create";
  protected final String TEXT_3132 = "(";
  protected final String TEXT_3133 = ", ";
  protected final String TEXT_3134 = "i < ";
  protected final String TEXT_3135 = "Size ? (";
  protected final String TEXT_3136 = ") ";
  protected final String TEXT_3137 = ".get(i) : null";
  protected final String TEXT_3138 = ");" + NL + "\t\t}";
  protected final String TEXT_3139 = NL + "\t\tnew";
  protected final String TEXT_3140 = ".create";
  protected final String TEXT_3141 = "(";
  protected final String TEXT_3142 = ", ";
  protected final String TEXT_3143 = ");";
  protected final String TEXT_3144 = NL + "\t\tif (";
  protected final String TEXT_3145 = " != null)";
  protected final String TEXT_3146 = NL + "\t\t\tnew";
  protected final String TEXT_3147 = ".";
  protected final String TEXT_3148 = "().addAll(";
  protected final String TEXT_3149 = ");";
  protected final String TEXT_3150 = NL + "\t\t\tnew";
  protected final String TEXT_3151 = ".set";
  protected final String TEXT_3152 = "(";
  protected final String TEXT_3153 = ");";
  protected final String TEXT_3154 = NL + "\t\treturn new";
  protected final String TEXT_3155 = ";";
  protected final String TEXT_3156 = NL + "\t}" + NL;
  protected final String TEXT_3157 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_3158 = "} with the specified ";
  protected final String TEXT_3159 = " from the '<em><b>";
  protected final String TEXT_3160 = "</b></em>' ";
  protected final String TEXT_3161 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3162 = NL + "\t * @param ";
  protected final String TEXT_3163 = " The ";
  protected final String TEXT_3164 = " of the {@link ";
  protected final String TEXT_3165 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3166 = NL + "\t * @return The first {@link ";
  protected final String TEXT_3167 = "} with the specified ";
  protected final String TEXT_3168 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_3169 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3170 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3171 = NL + "\t";
  protected final String TEXT_3172 = " get";
  protected final String TEXT_3173 = "(";
  protected final String TEXT_3174 = ");" + NL;
  protected final String TEXT_3175 = NL + "\t@Override";
  protected final String TEXT_3176 = NL + "\tpublic ";
  protected final String TEXT_3177 = " get";
  protected final String TEXT_3178 = "(";
  protected final String TEXT_3179 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_3180 = "(";
  protected final String TEXT_3181 = ", false";
  protected final String TEXT_3182 = ", null";
  protected final String TEXT_3183 = ", false";
  protected final String TEXT_3184 = ");" + NL + "\t}" + NL;
  protected final String TEXT_3185 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_3186 = "} with the specified ";
  protected final String TEXT_3187 = " from the '<em><b>";
  protected final String TEXT_3188 = "</b></em>' ";
  protected final String TEXT_3189 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_3190 = NL + "\t * @param ";
  protected final String TEXT_3191 = " The ";
  protected final String TEXT_3192 = " of the {@link ";
  protected final String TEXT_3193 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3194 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_3195 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_3196 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_3197 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_3198 = "} on demand if not found.";
  protected final String TEXT_3199 = NL + "\t * @return The first {@link ";
  protected final String TEXT_3200 = "} with the specified ";
  protected final String TEXT_3201 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_3202 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3203 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3204 = NL + "\t";
  protected final String TEXT_3205 = " get";
  protected final String TEXT_3206 = "(";
  protected final String TEXT_3207 = ", boolean ignoreCase";
  protected final String TEXT_3208 = ", ";
  protected final String TEXT_3209 = " eClass";
  protected final String TEXT_3210 = ", boolean createOnDemand";
  protected final String TEXT_3211 = ");" + NL;
  protected final String TEXT_3212 = NL + "\t@Override";
  protected final String TEXT_3213 = NL + "\tpublic ";
  protected final String TEXT_3214 = " get";
  protected final String TEXT_3215 = "(";
  protected final String TEXT_3216 = ", boolean ignoreCase";
  protected final String TEXT_3217 = ", ";
  protected final String TEXT_3218 = " eClass";
  protected final String TEXT_3219 = ", boolean createOnDemand";
  protected final String TEXT_3220 = ")" + NL + "\t{";
  protected final String TEXT_3221 = NL + "\t\t";
  protected final String TEXT_3222 = "Loop: for (";
  protected final String TEXT_3223 = " ";
  protected final String TEXT_3224 = " : ";
  protected final String TEXT_3225 = "())" + NL + "\t\t{";
  protected final String TEXT_3226 = NL + "\t\t";
  protected final String TEXT_3227 = "Loop: for (";
  protected final String TEXT_3228 = " i = ";
  protected final String TEXT_3229 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_3230 = " ";
  protected final String TEXT_3231 = " = (";
  protected final String TEXT_3232 = ") i.next();";
  protected final String TEXT_3233 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_3234 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3235 = "Loop;";
  protected final String TEXT_3236 = NL + "\t\t\t";
  protected final String TEXT_3237 = " ";
  protected final String TEXT_3238 = "List = ";
  protected final String TEXT_3239 = ".";
  protected final String TEXT_3240 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_3241 = "ListSize = ";
  protected final String TEXT_3242 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_3243 = " || (";
  protected final String TEXT_3244 = " != null && ";
  protected final String TEXT_3245 = ".size() != ";
  protected final String TEXT_3246 = "ListSize";
  protected final String TEXT_3247 = ")";
  protected final String TEXT_3248 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_3249 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_3250 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_3251 = " ";
  protected final String TEXT_3252 = " = ";
  protected final String TEXT_3253 = "(";
  protected final String TEXT_3254 = ") ";
  protected final String TEXT_3255 = "List.get(j);";
  protected final String TEXT_3256 = NL + "\t\t\t\tif (";
  protected final String TEXT_3257 = " != null && !(ignoreCase ? (";
  protected final String TEXT_3258 = "(";
  protected final String TEXT_3259 = ")";
  protected final String TEXT_3260 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_3261 = ".";
  protected final String TEXT_3262 = "()) : ";
  protected final String TEXT_3263 = ".get(j).equals(";
  protected final String TEXT_3264 = ".";
  protected final String TEXT_3265 = "())))";
  protected final String TEXT_3266 = NL + "\t\t\t\tif (";
  protected final String TEXT_3267 = " != null && !";
  protected final String TEXT_3268 = ".get(j).equals(";
  protected final String TEXT_3269 = ".";
  protected final String TEXT_3270 = "()))";
  protected final String TEXT_3271 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_3272 = "Loop;";
  protected final String TEXT_3273 = NL + "\t\t\t}";
  protected final String TEXT_3274 = NL + "\t\t\t";
  protected final String TEXT_3275 = " ";
  protected final String TEXT_3276 = " = ";
  protected final String TEXT_3277 = ".";
  protected final String TEXT_3278 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_3279 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3280 = "Loop;";
  protected final String TEXT_3281 = NL + "\t\t\tif (";
  protected final String TEXT_3282 = " != null && !(ignoreCase ? ";
  protected final String TEXT_3283 = ".equalsIgnoreCase(";
  protected final String TEXT_3284 = ".";
  protected final String TEXT_3285 = "()) : ";
  protected final String TEXT_3286 = ".equals(";
  protected final String TEXT_3287 = ".";
  protected final String TEXT_3288 = "())))";
  protected final String TEXT_3289 = NL + "\t\t\tif (";
  protected final String TEXT_3290 = " != null && !";
  protected final String TEXT_3291 = ".equals(";
  protected final String TEXT_3292 = ".";
  protected final String TEXT_3293 = "()))";
  protected final String TEXT_3294 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3295 = "Loop;";
  protected final String TEXT_3296 = NL + "\t\t\tif (";
  protected final String TEXT_3297 = " != null && !(ignoreCase ? ";
  protected final String TEXT_3298 = ".equalsIgnoreCase(";
  protected final String TEXT_3299 = ".";
  protected final String TEXT_3300 = "()) : ";
  protected final String TEXT_3301 = ".equals(";
  protected final String TEXT_3302 = ".";
  protected final String TEXT_3303 = "())))";
  protected final String TEXT_3304 = NL + "\t\t\tif (";
  protected final String TEXT_3305 = " != null && !";
  protected final String TEXT_3306 = ".equals(";
  protected final String TEXT_3307 = ".";
  protected final String TEXT_3308 = "()))";
  protected final String TEXT_3309 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_3310 = "Loop;";
  protected final String TEXT_3311 = NL + "\t\t\treturn ";
  protected final String TEXT_3312 = ";" + NL + "\t\t}";
  protected final String TEXT_3313 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_3314 = " && eClass != null";
  protected final String TEXT_3315 = " ? create";
  protected final String TEXT_3316 = "(";
  protected final String TEXT_3317 = ", eClass";
  protected final String TEXT_3318 = ") : null;";
  protected final String TEXT_3319 = NL + "\t\treturn null;";
  protected final String TEXT_3320 = NL + "\t}" + NL;
  protected final String TEXT_3321 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_3322 = "()" + NL + "\t{";
  protected final String TEXT_3323 = NL + "  \t\treturn false;";
  protected final String TEXT_3324 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3325 = ");";
  protected final String TEXT_3326 = NL + "\t\treturn !((";
  protected final String TEXT_3327 = ".Internal.Wrapper)";
  protected final String TEXT_3328 = "()).featureMap().isEmpty();";
  protected final String TEXT_3329 = NL + "\t\treturn ";
  protected final String TEXT_3330 = " != null && !";
  protected final String TEXT_3331 = ".featureMap().isEmpty();";
  protected final String TEXT_3332 = NL + "\t\treturn ";
  protected final String TEXT_3333 = " != null && !";
  protected final String TEXT_3334 = ".isEmpty();";
  protected final String TEXT_3335 = NL + "\t\t";
  protected final String TEXT_3336 = " ";
  protected final String TEXT_3337 = " = (";
  protected final String TEXT_3338 = ")eVirtualGet(";
  protected final String TEXT_3339 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3340 = " != null && !";
  protected final String TEXT_3341 = ".isEmpty();";
  protected final String TEXT_3342 = NL + "\t\treturn !";
  protected final String TEXT_3343 = "().isEmpty();";
  protected final String TEXT_3344 = NL + "\t\treturn ";
  protected final String TEXT_3345 = " != null;";
  protected final String TEXT_3346 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3347 = ") != null;";
  protected final String TEXT_3348 = NL + "\t\treturn basicGet";
  protected final String TEXT_3349 = "() != null;";
  protected final String TEXT_3350 = NL + "\t\treturn ";
  protected final String TEXT_3351 = " != null;";
  protected final String TEXT_3352 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3353 = ") != null;";
  protected final String TEXT_3354 = NL + "\t\treturn ";
  protected final String TEXT_3355 = "() != null;";
  protected final String TEXT_3356 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_3357 = " & ";
  protected final String TEXT_3358 = "_EFLAG) != 0) != ";
  protected final String TEXT_3359 = ";";
  protected final String TEXT_3360 = NL + "\t\t\t\treturn (";
  protected final String TEXT_3361 = " & ";
  protected final String TEXT_3362 = "_EFLAG) != ";
  protected final String TEXT_3363 = "_EFLAG_DEFAULT;";
  protected final String TEXT_3364 = NL + "\t\treturn ";
  protected final String TEXT_3365 = " != ";
  protected final String TEXT_3366 = ";";
  protected final String TEXT_3367 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3368 = ", ";
  protected final String TEXT_3369 = ") != ";
  protected final String TEXT_3370 = ";";
  protected final String TEXT_3371 = NL + "\t\treturn ";
  protected final String TEXT_3372 = "() != ";
  protected final String TEXT_3373 = ";";
  protected final String TEXT_3374 = NL + "\t\treturn ";
  protected final String TEXT_3375 = " == null ? ";
  protected final String TEXT_3376 = " != null : !";
  protected final String TEXT_3377 = ".equals(";
  protected final String TEXT_3378 = ");";
  protected final String TEXT_3379 = NL + "\t\t";
  protected final String TEXT_3380 = " ";
  protected final String TEXT_3381 = " = (";
  protected final String TEXT_3382 = ")eVirtualGet(";
  protected final String TEXT_3383 = ", ";
  protected final String TEXT_3384 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3385 = " == null ? ";
  protected final String TEXT_3386 = " != null : !";
  protected final String TEXT_3387 = ".equals(";
  protected final String TEXT_3388 = ");";
  protected final String TEXT_3389 = NL + "\t\treturn ";
  protected final String TEXT_3390 = " == null ? ";
  protected final String TEXT_3391 = "() != null : !";
  protected final String TEXT_3392 = ".equals(";
  protected final String TEXT_3393 = "());";
  protected final String TEXT_3394 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3395 = ");";
  protected final String TEXT_3396 = NL + "\t\t";
  protected final String TEXT_3397 = " ";
  protected final String TEXT_3398 = " = (";
  protected final String TEXT_3399 = ")eVirtualGet(";
  protected final String TEXT_3400 = ");";
  protected final String TEXT_3401 = NL + "\t\treturn ";
  protected final String TEXT_3402 = " != null && ((";
  protected final String TEXT_3403 = ".Unsettable";
  protected final String TEXT_3404 = ")";
  protected final String TEXT_3405 = ").isSet();";
  protected final String TEXT_3406 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_3407 = ");";
  protected final String TEXT_3408 = NL + "\t\treturn (";
  protected final String TEXT_3409 = " & ";
  protected final String TEXT_3410 = "_ESETFLAG) != 0;";
  protected final String TEXT_3411 = NL + "\t\treturn ";
  protected final String TEXT_3412 = "ESet;";
  protected final String TEXT_3413 = NL + "\t\treturn !((";
  protected final String TEXT_3414 = ".Internal)((";
  protected final String TEXT_3415 = ".Internal.Wrapper)get";
  protected final String TEXT_3416 = "()).featureMap()).isEmpty(";
  protected final String TEXT_3417 = ");";
  protected final String TEXT_3418 = NL + "\t\treturn !((";
  protected final String TEXT_3419 = ".Internal)get";
  protected final String TEXT_3420 = "()).isEmpty(";
  protected final String TEXT_3421 = ");";
  protected final String TEXT_3422 = NL + "\t\treturn ";
  protected final String TEXT_3423 = ".";
  protected final String TEXT_3424 = "(this);";
  protected final String TEXT_3425 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_3426 = "' ";
  protected final String TEXT_3427 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3428 = NL + "\t}" + NL;
  protected final String TEXT_3429 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3430 = NL + "\t@Override";
  protected final String TEXT_3431 = NL + "\tpublic ";
  protected final String TEXT_3432 = " ";
  protected final String TEXT_3433 = "(";
  protected final String TEXT_3434 = ")";
  protected final String TEXT_3435 = NL + "\t{";
  protected final String TEXT_3436 = NL + "\t\t";
  protected final String TEXT_3437 = "(";
  protected final String TEXT_3438 = ");";
  protected final String TEXT_3439 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3440 = NL + "\t\treturn ";
  protected final String TEXT_3441 = "(";
  protected final String TEXT_3442 = ");";
  protected final String TEXT_3443 = NL + "\t}" + NL;
  protected final String TEXT_3444 = NL + "} //";
  protected final String TEXT_3445 = NL;

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
    stringBuffer.append(TEXT_213);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_214);
    }
    stringBuffer.append(TEXT_215);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_216);
    }
    //Class/reflectiveDelegation.override.javajetinc
    if (isImplementation) {
    new Runnable() { public void run() { GenClass classExtendsGenClass = genClass.getClassExtendsGenClass(); List<GenFeature> classExtendsAllGenFeatures = classExtendsGenClass == null? Collections.<GenFeature>emptyList() : classExtendsGenClass.getAllGenFeatures();
    for (GenFeature genFeature : genClass.getReifiedGenFeatures()) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String arrayElementType = genFeature.getArrayItemType(genClass);
    stringBuffer.append(TEXT_217);
    if (genModel.useGenerics() && CodeGenUtil.isUncheckedCast(arrayElementType)) {
    stringBuffer.append(TEXT_218);
    }
    if (classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_219);
    }
    stringBuffer.append(TEXT_220);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_222);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_223);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_224);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_227);
    } else {
    stringBuffer.append(TEXT_228);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_234);
    }
    stringBuffer.append(TEXT_235);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_236);
    }
    if (genFeature.isGet() && genFeature.isListType()) {
    stringBuffer.append(TEXT_237);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_238);
    }
    }
    if (genFeature.isListType() && genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_239);
    }
    if (classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_240);
    }
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_243);
    }
    stringBuffer.append(TEXT_244);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_247);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_248);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_249);
    }
    stringBuffer.append(TEXT_250);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_251);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_252);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_253);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_254);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_255);
    } else {
    stringBuffer.append(TEXT_256);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_257);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_258);
    }
    stringBuffer.append(TEXT_259);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_260);
    }
    if (!genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_261);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_262);
    }
    }
    if (classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_263);
    }
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_266);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_267);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_269);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_271);
    }
    if (genFeature.isSet() && !(!genModel.isReflectiveDelegation() && genFeature.isBasicSet())) {
    stringBuffer.append(TEXT_272);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_273);
    }
    }
    { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    if (classExtendsAllGenFeatures.contains(genFeature)) {
    stringBuffer.append(TEXT_274);
    }
    stringBuffer.append(TEXT_275);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_276);
    }
    stringBuffer.append(TEXT_277);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_278);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_279);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_280);
    }
    stringBuffer.append(TEXT_281);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_282);
    }
    }
    //Class/genFeatureReified.override.javajetinc
    }}}.run();}
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String arrayElementType = genFeature.getArrayItemType(genClass);
    stringBuffer.append(TEXT_283);
    if (!isImplementation) {
    stringBuffer.append(TEXT_284);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_286);
    } else {
    if (genModel.useGenerics() && CodeGenUtil.isUncheckedCast(arrayElementType)) {
    stringBuffer.append(TEXT_287);
    }
    stringBuffer.append(TEXT_288);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_289);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_290);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_292);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_295);
    } else {
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_297);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_302);
    }
    stringBuffer.append(TEXT_303);
    stringBuffer.append(arrayElementType);
    stringBuffer.append(TEXT_304);
    }
    stringBuffer.append(TEXT_305);
    if (!isImplementation) {
    stringBuffer.append(TEXT_306);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_307);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_308);
    } else {
    stringBuffer.append(TEXT_309);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_310);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_311);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_313);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_314);
    }
    stringBuffer.append(TEXT_315);
    if (!isImplementation) {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_317);
    } else {
    stringBuffer.append(TEXT_318);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_319);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_320);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_321);
    } else {
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_324);
    }
    stringBuffer.append(TEXT_325);
    }
    stringBuffer.append(TEXT_326);
    if (!isImplementation) {
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_328);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_330);
    } else {
    stringBuffer.append(TEXT_331);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_334);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_336);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_337);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_338);
    }
    stringBuffer.append(TEXT_339);
    if (!isImplementation) {
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_342);
    } else {
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_346);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_348);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_349);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_350);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_351);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_352);
    } else {
    stringBuffer.append(TEXT_353);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_354);
    }
    stringBuffer.append(TEXT_355);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_356);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_357);
    } else {
    stringBuffer.append(TEXT_358);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_359);
    }
    stringBuffer.append(TEXT_360);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

    stringBuffer.append(TEXT_361);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_362);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_363);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_365);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_367);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_368);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_369);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_371);
    }
    }
    if (!UML2GenModelUtil.getSubsettedGenFeatures(genFeature).isEmpty()) {
    stringBuffer.append(TEXT_372);
    for (GenFeature subsettedGenFeature : UML2GenModelUtil.getSubsettedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(subsettedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_374);
    stringBuffer.append(subsettedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_375);
    stringBuffer.append(subsettedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_376);
    }
    stringBuffer.append(TEXT_377);
    }if (UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_378);
    for (GenFeature redefinedGenFeature : UML2GenModelUtil.getRedefinedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_379);
    stringBuffer.append(redefinedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_380);
    stringBuffer.append(redefinedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_381);
    stringBuffer.append(redefinedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_382);
    }
    stringBuffer.append(TEXT_383);
    }if(genFeature.isDerived() && UML2GenModelUtil.isUnion(genFeature)){
    stringBuffer.append(TEXT_384);
    }
    stringBuffer.append(TEXT_385);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_386);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_387);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_388);
    }
    stringBuffer.append(TEXT_389);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_390);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_391);
    }
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_393);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_394);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_395);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_397);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_398);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_399);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_401);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_402);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_405);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_406);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_407);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_408);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_409);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_410);
    }}
    stringBuffer.append(TEXT_411);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_412);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_413);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_415);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_416);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !(genModel.isReflectiveDelegation() && genModel.isDynamicDelegation()) && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && !genFeature.isFeatureMapType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation() || genModel.isDynamicDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature() || genFeature.isListType() && genFeature.hasSettingDelegate())) {
    stringBuffer.append(TEXT_417);
    }
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_420);
    }
    stringBuffer.append(TEXT_421);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_422);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_423);
    }
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_427);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_428);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_430);
    }
    stringBuffer.append(TEXT_431);
    } else if (genModel.isReflectiveDelegation()) {
    if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_432);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_433);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_434);
    }
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_436);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_437);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_439);
    }
    stringBuffer.append(TEXT_440);
    }
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_441);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_442);
    }
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_444);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_445);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_447);
    }
    stringBuffer.append(TEXT_448);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_449);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_453);
    }
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_455);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_457);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_459);
    } else {
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_461);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_462);
    }
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_464);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_466);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_467);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_468);
    } else {
    stringBuffer.append(TEXT_469);
    }
    stringBuffer.append(TEXT_470);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_471);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_472);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_475);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_476);
    }
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_479);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_480);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_487);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_488);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_489);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_490);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_491);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_493);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_494);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_495);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_497);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_500);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_501);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_502);
    }
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_504);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_507);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_509);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_510);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_511);
    }
    stringBuffer.append(TEXT_512);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_513);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_515);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_519);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_521);
    }
    stringBuffer.append(TEXT_522);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_526);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_529);
    } else {
    stringBuffer.append(TEXT_530);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_533);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_534);
    }
    } else {
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_536);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_546);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = isJDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_547);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_549);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_550);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_551);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_553);
    } else {
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_555);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_556);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_557);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_558);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_559);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_560);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_562);
    } else {
    stringBuffer.append(TEXT_563);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_564);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_565);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_566);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_567);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_568);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_569);
    }
    stringBuffer.append(TEXT_570);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_571);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_572);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_573);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_574);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_575);
    }
    stringBuffer.append(TEXT_576);
    } else {
    stringBuffer.append(TEXT_577);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_578);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_579);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_580);
    }
    stringBuffer.append(TEXT_581);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_583);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_585);
    }
    stringBuffer.append(TEXT_586);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_587);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_588);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_590);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_591);
    }
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_594);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_595);
    }
    stringBuffer.append(TEXT_596);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_597);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_598);
    }
    stringBuffer.append(TEXT_599);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_600);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_601);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_602);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_603);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_604);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_605);
    }
    stringBuffer.append(TEXT_606);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_608);
    }
    stringBuffer.append(TEXT_609);
    }
    stringBuffer.append(TEXT_610);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_611);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_612);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_614);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_615);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_616);
    }
    stringBuffer.append(TEXT_617);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_618);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_619);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_620);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_621);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_622);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_623);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_624);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_626);
    }
    stringBuffer.append(TEXT_627);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_628);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_630);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_631);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_632);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_633);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_634);
    }
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_640);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_644);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_645);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_646);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_647);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_648);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_649);
    }
    stringBuffer.append(TEXT_650);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_651);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_653);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_655);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_657);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_658);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_660);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_661);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_662);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_663);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_664);
    }
    stringBuffer.append(TEXT_665);
    }
    stringBuffer.append(TEXT_666);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_668);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_669);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_670);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_671);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_672);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_673);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_674);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_675);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_677);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_678);
    } else {
    stringBuffer.append(TEXT_679);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_680);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_681);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_682);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_683);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_684);
    }
    }
    }
    }
    stringBuffer.append(TEXT_685);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_687);
    } else {
    stringBuffer.append(TEXT_688);
    }
    stringBuffer.append(TEXT_689);
    }
    } else {
    stringBuffer.append(TEXT_690);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_691);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_692);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_693);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_694);
    if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_695);
    }
    }
    stringBuffer.append(TEXT_696);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_697);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_698);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_700);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_701);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_702);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_703);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_704);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_705);
    }
    stringBuffer.append(TEXT_706);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_707);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_708);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_709);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_710);
    }
    stringBuffer.append(TEXT_711);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_712);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_713);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_714);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_715);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_716);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_717);
    } else {
    stringBuffer.append(TEXT_718);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_719);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_720);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_721);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_722);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_723);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_724);
    } else {
    stringBuffer.append(TEXT_725);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_726);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_728);
    }
    } else if (genFeature.hasGetterBody()) {
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getGetterBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_730);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_732);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_733);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_734);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_735);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_736);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_738);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_739);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_740);
    } else {
    stringBuffer.append(TEXT_741);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_742);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_743);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_744);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_745);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_746);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_747);
    }
    }
    }
    }
    stringBuffer.append(TEXT_748);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_750);
    } else {
    stringBuffer.append(TEXT_751);
    }
    stringBuffer.append(TEXT_752);
    } else {
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_755);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_756);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_757);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_758);
    }
    }
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_760);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_761);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_763);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_764);
    if (genFeature.isContainer()) {
    if (UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature) != genFeature.getTypeGenClassifier()) {
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_767);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_769);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_771);
    }
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_774);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_775);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_777);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_778);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_779);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_781);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_782);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_784);
    }
    stringBuffer.append(TEXT_785);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_786);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_788);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_789);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_791);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_792);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_793);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_794);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_795);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_797);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_799);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_800);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_801);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_802);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_803);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_804);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_806);
    }
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_808);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_809);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_811);
    }
    stringBuffer.append(TEXT_812);
    }
    stringBuffer.append(TEXT_813);
    }
    stringBuffer.append(TEXT_814);
    } else if (genModel.isDynamicDelegation()) {
    if (UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature) != genFeature.getTypeGenClassifier()) {
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_817);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_819);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_820);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_821);
    }
    stringBuffer.append(TEXT_822);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_825);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_827);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_828);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_829);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_830);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_831);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_832);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_834);
    }
    stringBuffer.append(TEXT_835);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_836);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_837);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_838);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_839);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_840);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_841);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_842);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_843);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_844);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_845);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_846);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_847);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_849);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_850);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_851);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_852);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_853);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_854);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_856);
    }
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_858);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_859);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_861);
    }
    stringBuffer.append(TEXT_862);
    }
    stringBuffer.append(TEXT_863);
    }
    stringBuffer.append(TEXT_864);
    } else if (!genFeature.isVolatile()) {
    if (UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature) != genFeature.getTypeGenClassifier()) {
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_866);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_867);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_869);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_871);
    }
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_873);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_874);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_875);
    } else {
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_881);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_883);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_887);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_888);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_890);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_892);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_893);
    }
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_895);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_896);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_898);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_901);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_903);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_905);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_906);
    } else {
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_908);
    }
    stringBuffer.append(TEXT_909);
    } else {
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_914);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_915);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_916);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_919);
    }
    stringBuffer.append(TEXT_920);
    }
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_922);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_923);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_924);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_925);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_926);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_927);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_929);
    }
    stringBuffer.append(TEXT_930);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_931);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_933);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_934);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_936);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_937);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_938);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_939);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_940);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_941);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_942);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_944);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_945);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_946);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_947);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_948);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_949);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_951);
    }
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_953);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_954);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_955);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_956);
    }
    stringBuffer.append(TEXT_957);
    }
    stringBuffer.append(TEXT_958);
    }
    stringBuffer.append(TEXT_959);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_960);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_962);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_965);
    } else {
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_967);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_970);
    }
    } else {
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_972);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_973);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_974);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_978);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_979);
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_982);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_985);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_987);
    }
    }
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_989);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_990);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_991);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_994);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    stringBuffer.append(TEXT_995);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_996);
    }
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_998);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_999);
    if (UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature) != genFeature.getTypeGenClassifier()) {
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(UML2GenModelUtil.getRedefinitionTypeGenClassifier(genFeature).getRawImportedInstanceClassName());
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1006);
    }
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1011);
    }
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1014);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1015);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1016);
    }
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1018);
    }
    stringBuffer.append(TEXT_1019);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1021);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1023);
    }
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1025);
    }
    stringBuffer.append(TEXT_1026);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1028);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1030);
    }
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1032);
    }
    stringBuffer.append(TEXT_1033);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_1041);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1046);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1051);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1057);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1062);
    }
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1067);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1075);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1085);
    }
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1089);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_1090);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1093);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1097);
    }
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1100);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1103);
    }
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1105);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1112);
    }
    stringBuffer.append(TEXT_1113);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1114);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1119);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1124);
    } else {
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1131);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1137);
    } else {
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1139);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1144);
    if (isJDK50) {
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1146);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1148);
    }
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1150);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1154);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1160);
    } else {
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1165);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1168);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1170);
    } else {
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1174);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1178);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1180);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1184);
    }
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1186);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1187);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1190);
    }
    stringBuffer.append(TEXT_1191);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1192);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1194);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1196);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1200);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1202);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1203);
    } else {
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1205);
    }
    stringBuffer.append(TEXT_1206);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1210);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1215);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1217);
    }
    }
    }
    if (!genFeature.isBasicSet()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_1219);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1223);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1224);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1226);
    }
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1231);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1233);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1241);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1245);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_1248);
    }
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1253);
    }
    stringBuffer.append(TEXT_1254);
    }
    stringBuffer.append(TEXT_1255);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1257);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1260);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1262);
    }
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1264);
    }
    stringBuffer.append(TEXT_1265);
    } else {
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1269);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1271);
    }
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1273);
    }
    stringBuffer.append(TEXT_1274);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1279);
    } else {
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1282);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1283);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_1284);
    if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1285);
    }
    }
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1289);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1291);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1294);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1296);
    }
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1298);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1302);
    }
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1304);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1305);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1306);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1310);
    }
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1313);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1316);
    }
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1318);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1323);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1325);
    } else {
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1327);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1328);
    } else {
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1330);
    }
    stringBuffer.append(TEXT_1331);
    }
    } else {
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1334);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1335);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1336);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(TEXT_1341);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1343);
    }
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1345);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1348);
    }
    stringBuffer.append(TEXT_1349);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1350);
    if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1351);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1353);
    } else {
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1355);
    }
    stringBuffer.append(TEXT_1356);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1359);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1361);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1363);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1368);
    }
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1373);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1376);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1378);
    }
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1381);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1385);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1390);
    }
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1392);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1395);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1398);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1399);
    }
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1402);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1405);
    }
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1407);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1412);
    }
    stringBuffer.append(TEXT_1413);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1418);
    } else {
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1424);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1425);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1428);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1430);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1432);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1434);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1438);
    } else {
    stringBuffer.append(TEXT_1439);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1441);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1443);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1446);
    } else {
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1448);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1452);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1454);
    } else {
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1456);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1457);
    } else {
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1459);
    }
    stringBuffer.append(TEXT_1460);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1466);
    } else {
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1471);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1474);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1477);
    } else {
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1479);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1483);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1487);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1488);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1489);
    } else {
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1491);
    }
    stringBuffer.append(TEXT_1492);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1497);
    } else {
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1501);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1504);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1505);
    } else {
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1508);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1509);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1510);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1511);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1516);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1517);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1519);
    }
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1521);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1524);
    }
    stringBuffer.append(TEXT_1525);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1526);
    if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1527);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1529);
    } else {
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1531);
    }
    stringBuffer.append(TEXT_1532);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1535);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1537);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1539);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1544);
    }
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1549);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1551);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1554);
    } else {
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1556);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1561);
    } else {
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1565);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1569);
    } else {
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1572);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1573);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1580);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
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
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1587);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1588);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1593);
    } else {
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1597);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1598);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1602);
    } else {
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1606);
    }
    }
    stringBuffer.append(TEXT_1607);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1609);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1611);
    }
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1614);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1615);
    }
    } else {
    stringBuffer.append(TEXT_1616);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1619);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1620);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1621);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1622);
    }
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1625);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1626);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1630);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1633);
    } else {
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1636);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1638);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1642);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1646);
    index++;}
    stringBuffer.append(TEXT_1647);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1650);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1651);
    }
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1655);
    }
    stringBuffer.append(TEXT_1656);
    } else {
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1659);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1660);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1661);
    }
    } else {
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1663);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1667);
    } else {
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1671);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1673);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1674);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1679);
    } else {
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1684);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1686);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1688);
    } else {
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1692);
    }
    }
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
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1700);
    }
    } else {
    stringBuffer.append(TEXT_1701);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1705);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1706);
    }
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1710);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1712);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_1713);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1714);
    } else {
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1719);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1722);
    } else {
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1725);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1727);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1735);
    index++;}
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1739);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1740);
    }
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1744);
    }
    stringBuffer.append(TEXT_1745);
    } else {
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1748);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1749);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1750);
    }
    } else {
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1752);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1756);
    } else {
    stringBuffer.append(TEXT_1757);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1760);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1762);
    }
    stringBuffer.append(TEXT_1763);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1768);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1772);
    }
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1776);
    }
    } else {
    stringBuffer.append(TEXT_1777);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1781);
    }
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1782);
    }
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1788);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1789);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1790);
    }
    stringBuffer.append(TEXT_1791);
    }
    }
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1796);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1800);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1801);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1803);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1805);
    }
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1809);
    }
    } else {
    stringBuffer.append(TEXT_1810);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1814);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1816);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1817);
    }
    stringBuffer.append(TEXT_1818);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1819);
    }
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1823);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1824);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1825);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1826);
    }
    stringBuffer.append(TEXT_1827);
    if (isJDK50) {
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1832);
    } else {
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1837);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1839);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1842);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1849);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1850);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1853);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1854);
    }
    }
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1856);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1857);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1859);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1861);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1862);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1864);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1866);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1872);
    } else {
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1877);
    }
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1879);
    index++;}
    stringBuffer.append(TEXT_1880);
    } else {
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1884);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1887);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1895);
    } else {
    stringBuffer.append(TEXT_1896);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1900);
    }
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1902);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1908);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1909);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1910);
    } else {
    stringBuffer.append(TEXT_1911);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1915);
    }
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1917);
    index++;}
    }
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1919);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1920);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1921);
    }
    stringBuffer.append(TEXT_1922);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1924);
    }
    stringBuffer.append(TEXT_1925);
    } else {
    stringBuffer.append(TEXT_1926);
    }
    stringBuffer.append(TEXT_1927);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1929);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1930);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1931);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1932);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1933);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1934);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1935);
    } else {
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1938);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1941);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1948);
    } else {
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1950);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1952);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1953);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1954);
    } else {
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1956);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1958);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1960);
    } else {
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1962);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1963);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1965);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1966);
    } else {
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1969);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1970);
    }
    } else {
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1972);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1973);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1975);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1976);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1977);
    } else {
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1979);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1980);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1981);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1983);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1984);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1985);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1986);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1987);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1989);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1990);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1992);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1993);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1995);
    } else {
    stringBuffer.append(TEXT_1996);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1998);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1999);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2000);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_2001);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2002);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2004);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2005);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2006);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2007);
    }
    stringBuffer.append(TEXT_2008);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2009);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2011);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2012);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2013);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2014);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2017);
    } else {
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2019);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2020);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2023);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2024);
    } else {
    stringBuffer.append(TEXT_2025);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2026);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_2027);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_2028);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_2029);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2030);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2031);
    } else {
    stringBuffer.append(TEXT_2032);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2033);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2034);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_2035);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation && !UML2GenModelUtil.hasOperationsClass(genClass, genOperation) && UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_2036);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2037);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2038);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_2039);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2040);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2041);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2042);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_2044);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2045);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_2046);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2048);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2050);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_2052);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2053);
    } else {
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2055);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2056);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2058);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2059);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2060);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_2061);
    }
    stringBuffer.append(TEXT_2062);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2063);
    }
    }
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && isImplementation) {
    if (genOperation.isInvariant() && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_2064);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2065);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2066);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_2067);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2070);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2071);
    stringBuffer.append(genOperation.getInvariantExpression("\t\t"));
    stringBuffer.append(TEXT_2072);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2073);
    } else if (genOperation.hasInvocationDelegate()) {
    stringBuffer.append(TEXT_2074);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2075);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2076);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_2077);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2078);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2079);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_2080);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EOperation"));
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2083);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2084);
    if (UML2GenModelUtil.isRedefinition(genOperation)) {
    stringBuffer.append(TEXT_2085);
    for (GenOperation redefinedGenOperation : UML2GenModelUtil.getRedefinedGenOperations(genOperation)) {
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(redefinedGenOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2087);
    stringBuffer.append(redefinedGenOperation.getName());
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(redefinedGenOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_2089);
    stringBuffer.append(redefinedGenOperation.getFormattedName());
    stringBuffer.append(TEXT_2090);
    }
    stringBuffer.append(TEXT_2091);
    }
    stringBuffer.append(TEXT_2092);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_2093);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_2094);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2096);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2098);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_2099);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_2101);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_2102);
    }}
    stringBuffer.append(TEXT_2103);
    } else {
    stringBuffer.append(TEXT_2104);
    if (isJDK50) {
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_2105);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2106);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_2107);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2108);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_2109);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_2110);
    } else {
    if (genModel.useGenerics() && !genOperation.hasBody() && !genOperation.isInvariant() && genOperation.hasInvocationDelegate() && genOperation.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_2111);
    }
    stringBuffer.append(TEXT_2112);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_2115);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_2116);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_2117);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant() && (genOperation.hasInvariantExpression() || !genOperation.hasInvocationDelegate())) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvariantExpression()) {
    stringBuffer.append(TEXT_2118);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2119);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2120);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2121);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2122);
    stringBuffer.append(genOperation.getValidationDelegate());
    stringBuffer.append(TEXT_2123);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2124);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2125);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2126);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_2127);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2129);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_2130);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_2131);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2133);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2134);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2135);
    } else {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_2136);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2139);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2141);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2142);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_2143);
    } else {
    stringBuffer.append(TEXT_2144);
    }
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2146);
    stringBuffer.append(TEXT_2147);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_2148);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_2149);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_2150);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2151);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_2152);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_2154);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2155);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_2156);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_2157);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_2158);
    //genOperation.diagnostics.override.javajetinc
    stringBuffer.append(TEXT_2159);
    }
    }
    } else if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE && genOperation.hasInvocationDelegate()) { int size = genOperation.getGenParameters().size();
    stringBuffer.append(TEXT_2160);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2161);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2162);
    if (size > 0) {
    stringBuffer.append(TEXT_2163);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2164);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_2165);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_2166);
    } else {
    stringBuffer.append(TEXT_2167);
    }
    stringBuffer.append(TEXT_2168);
    } else {
    stringBuffer.append(TEXT_2169);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2170);
    }
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2172);
    stringBuffer.append(CodeGenUtil.upperName(genClass.getUniqueName(genOperation), genModel.getLocale()));
    stringBuffer.append(TEXT_2173);
    if (size > 0) {
    stringBuffer.append(TEXT_2174);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2175);
    stringBuffer.append(size);
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(genOperation.getParametersArray(genClass));
    stringBuffer.append(TEXT_2177);
    } else {
    stringBuffer.append(TEXT_2178);
    }
    stringBuffer.append(TEXT_2179);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2180);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2181);
    }
    stringBuffer.append(TEXT_2182);
    }
    stringBuffer.append(TEXT_2183);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.WrappedException"));
    stringBuffer.append(TEXT_2185);
    } else {
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2188);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2189);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2190);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2192);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_2193);
    }
    stringBuffer.append(TEXT_2194);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2195);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2196);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_2197);
    }
    stringBuffer.append(TEXT_2198);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2199);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_2200);
    }
    stringBuffer.append(TEXT_2201);
    stringBuffer.append(genOperation.getQualifiedOperationAccessor());
    stringBuffer.append(TEXT_2202);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2203);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2204);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2205);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2206);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2207);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2208);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2209);
    }
    stringBuffer.append(TEXT_2210);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2212);
    }
    stringBuffer.append(TEXT_2213);
    }
    stringBuffer.append(TEXT_2214);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_2215);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2216);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_2217);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_2218);
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
    stringBuffer.append(TEXT_2219);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2220);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2221);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2222);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2223);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_2224);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2225);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2226);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2227);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2228);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2229);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_2230);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2231);
    }
    stringBuffer.append(TEXT_2232);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_2233);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2234);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2235);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2236);
    }
    stringBuffer.append(TEXT_2237);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2238);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2239);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2241);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2242);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2243);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2244);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_2245);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2246);
    } else {
    stringBuffer.append(TEXT_2247);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_2248);
    }
    } else {
    stringBuffer.append(TEXT_2249);
    }
    }
    stringBuffer.append(TEXT_2250);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_2251);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_2252);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2253);
    }
    stringBuffer.append(TEXT_2254);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2255);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2256);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2257);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2258);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_2259);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2260);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2261);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_2262);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2263);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2264);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2265);
    } else {
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2267);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_2268);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2269);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2270);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2271);
    } else {
    stringBuffer.append(TEXT_2272);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2273);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2275);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2277);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2278);
    } else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
    stringBuffer.append(TEXT_2279);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2280);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2281);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_2282);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2283);
    }
    stringBuffer.append(TEXT_2284);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2285);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_2286);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2288);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2289);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_2290);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2292);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2293);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2294);
    }
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2296);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2297);
    }
    }
    stringBuffer.append(TEXT_2298);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2299);
    } else {
    stringBuffer.append(TEXT_2300);
    }
    stringBuffer.append(TEXT_2301);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_2302);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2303);
    }
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2305);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2306);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2307);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2308);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_2309);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2310);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2311);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2313);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2315);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2316);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2317);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2319);
    } else {
    stringBuffer.append(TEXT_2320);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2321);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2322);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2323);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2324);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2325);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2326);
    } else {
    stringBuffer.append(TEXT_2327);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2328);
    }
    }
    stringBuffer.append(TEXT_2329);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2330);
    } else {
    stringBuffer.append(TEXT_2331);
    }
    stringBuffer.append(TEXT_2332);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_2333);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2334);
    }
    stringBuffer.append(TEXT_2335);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2336);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2337);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2338);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(genFeature) : "";
    stringBuffer.append(TEXT_2339);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2340);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2341);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2342);
    }
    stringBuffer.append(TEXT_2343);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2344);
    } else {
    stringBuffer.append(TEXT_2345);
    }
    stringBuffer.append(TEXT_2346);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_2347);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2348);
    }
    stringBuffer.append(TEXT_2349);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2350);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_2351);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2352);
    if (genFeature.isPrimitiveType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2353);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2354);
    } else if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2355);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2356);
    } else {
    stringBuffer.append(TEXT_2357);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2358);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2359);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_2360);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2361);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2362);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2363);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2366);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2367);
    } else {
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2369);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2370);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2373);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2374);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2376);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2377);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2378);
    } else {
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2380);
    }
    }
    stringBuffer.append(TEXT_2381);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2382);
    } else {
    stringBuffer.append(TEXT_2383);
    }
    stringBuffer.append(TEXT_2384);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_2385);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_2386);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2387);
    }
    stringBuffer.append(TEXT_2388);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2389);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_2390);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2391);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2392);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2393);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2394);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2395);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2397);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2398);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2399);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2400);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2401);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2403);
    } else {
    stringBuffer.append(TEXT_2404);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2405);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2406);
    }
    } else {
    stringBuffer.append(TEXT_2407);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2408);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2409);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2410);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2411);
    }
    stringBuffer.append(TEXT_2412);
    }
    } else if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2413);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2414);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2415);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2416);
    } else {
    stringBuffer.append(TEXT_2417);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2418);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2419);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2420);
    }
    stringBuffer.append(TEXT_2421);
    }
    stringBuffer.append(TEXT_2422);
    }
    stringBuffer.append(TEXT_2423);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2424);
    } else {
    stringBuffer.append(TEXT_2425);
    }
    stringBuffer.append(TEXT_2426);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_2427);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2428);
    }
    stringBuffer.append(TEXT_2429);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2430);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_2431);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2432);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2433);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2434);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2435);
    } else {
    stringBuffer.append(TEXT_2436);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2437);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2438);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2439);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_2440);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2441);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2442);
    } else if (genFeature.hasSettingDelegate()) {
    stringBuffer.append(TEXT_2443);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2444);
    } else {
    stringBuffer.append(TEXT_2445);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2446);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2447);
    }
    stringBuffer.append(TEXT_2448);
    }
    stringBuffer.append(TEXT_2449);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2450);
    } else {
    stringBuffer.append(TEXT_2451);
    }
    stringBuffer.append(TEXT_2452);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_2453);
    stringBuffer.append(TEXT_2454);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) {
    if (genFeature.isListType() && !genFeature.isUnsettable() && !genFeature.isWrappedFeatureMapType() && !genClass.isField(genFeature) && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2455);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2456);
    }
    stringBuffer.append(TEXT_2457);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) { String safeNameAccessor = genFeature.getSafeName(); if ("featureID".equals(safeNameAccessor)) { safeNameAccessor = "this." + safeNameAccessor; }
    stringBuffer.append(TEXT_2458);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2459);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2461);
    } else {
    if (genFeature.hasSettingDelegate()) {
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2462);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2463);
    } else {
    stringBuffer.append(TEXT_2464);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2465);
    }
    } else if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2466);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2467);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2468);
    } else {
    stringBuffer.append(TEXT_2469);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2470);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2471);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2472);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2473);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2474);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2475);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2476);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2478);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2480);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2481);
    } else {
    stringBuffer.append(TEXT_2482);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2483);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2484);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2485);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2487);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2488);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2489);
    } else {
    stringBuffer.append(TEXT_2490);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2491);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2492);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2493);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2494);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2495);
    } else {
    stringBuffer.append(TEXT_2496);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2497);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2499);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2500);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2501);
    } else {
    stringBuffer.append(TEXT_2502);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2503);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2504);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2505);
    }
    } else {
    stringBuffer.append(TEXT_2506);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2507);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2508);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2509);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2510);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2511);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2512);
    } else {
    stringBuffer.append(TEXT_2513);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2514);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2515);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2516);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2517);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2518);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2520);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2521);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2522);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2523);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2524);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2525);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2526);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2527);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2528);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2530);
    } else {
    stringBuffer.append(TEXT_2531);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2532);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2533);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2534);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2535);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2536);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2537);
    } else {
    stringBuffer.append(TEXT_2538);
    }
    stringBuffer.append(TEXT_2539);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2540);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2541);
    }
    stringBuffer.append(TEXT_2542);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2543);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2544);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2545);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2546);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2547);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2548);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2549);
    }
    stringBuffer.append(TEXT_2550);
    }
    stringBuffer.append(TEXT_2551);
    }
    stringBuffer.append(TEXT_2552);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2553);
    }
    stringBuffer.append(TEXT_2554);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2555);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2556);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2557);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2558);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2559);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2560);
    }
    stringBuffer.append(TEXT_2561);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2562);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2563);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2564);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2565);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2567);
    }
    stringBuffer.append(TEXT_2568);
    }
    stringBuffer.append(TEXT_2569);
    }
    if (genModel.isOperationReflection() && isImplementation && (!genClass.getMixinGenOperations().isEmpty() || !genClass.getOverrideGenOperations(genClass.getExtendedGenOperations(), genClass.getImplementedGenOperations()).isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty())) {
    stringBuffer.append(TEXT_2570);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2571);
    }
    stringBuffer.append(TEXT_2572);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2573);
    for (GenClass extendedGenClass : genClass.getExtendedGenClasses()) { List<GenOperation> extendedImplementedGenOperations = extendedGenClass.getImplementedGenOperations(); List<GenOperation> implementedGenOperations = genClass.getImplementedGenOperations();
    if (!genClass.getOverrideGenOperations(extendedImplementedGenOperations, implementedGenOperations).isEmpty()) {
    stringBuffer.append(TEXT_2574);
    stringBuffer.append(extendedGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2575);
    for (GenOperation genOperation : extendedImplementedGenOperations) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    if (implementedGenOperations.contains(overrideGenOperation)) {
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(extendedGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2577);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2578);
    }
    }
    stringBuffer.append(TEXT_2579);
    }
    }
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2581);
    for (GenOperation genOperation : mixinGenClass.getGenOperations()) { GenOperation overrideGenOperation = genClass.getOverrideGenOperation(genOperation);
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(mixinGenClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2583);
    stringBuffer.append(genClass.getQualifiedOperationID(overrideGenOperation != null ? overrideGenOperation : genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2584);
    }
    stringBuffer.append(TEXT_2585);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_2586);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2587);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_2588);
    for (GenOperation genOperation : genClass.getGenOperations()) {
    stringBuffer.append(TEXT_2589);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2590);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(positiveOperationOffsetCorrection);
    stringBuffer.append(TEXT_2591);
    }
    stringBuffer.append(TEXT_2592);
    }
    stringBuffer.append(TEXT_2593);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2594);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2595);
    }
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2597);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2598);
    }
    stringBuffer.append(TEXT_2599);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2600);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2601);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2602);
    }
    stringBuffer.append(TEXT_2603);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2604);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2605);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2606);
    }
    stringBuffer.append(TEXT_2607);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2608);
    }
    stringBuffer.append(TEXT_2609);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2610);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2611);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2612);
    }
    stringBuffer.append(TEXT_2613);
    }
    }
    }
    if (genModel.isOperationReflection() && isImplementation && !genClass.getImplementedGenOperations().isEmpty()) {
    stringBuffer.append(TEXT_2614);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2615);
    }
    if (genModel.useGenerics()) {
    boolean isUnchecked = false; boolean isRaw = false; LOOP: for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { for (GenParameter genParameter : genOperation.getGenParameters()) { if (genParameter.isUncheckedCast()) { if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType()) { isUnchecked = true; } if (genParameter.usesOperationTypeParameters() && !genParameter.getEcoreParameter().getEGenericType().getETypeArguments().isEmpty()) { isRaw = true; break LOOP; }}}}
    if (isUnchecked) {
    stringBuffer.append(TEXT_2616);
    if (!isRaw) {
    stringBuffer.append(TEXT_2617);
    } else {
    stringBuffer.append(TEXT_2618);
    }
    stringBuffer.append(TEXT_2619);
    }
    }
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2621);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(negativeOperationOffsetCorrection);
    stringBuffer.append(TEXT_2623);
    for (GenOperation genOperation : (genModel.isMinimalReflectiveMethods() ? genClass.getImplementedGenOperations() : genClass.getAllGenOperations())) { List<GenParameter> genParameters = genOperation.getGenParameters(); int size = genParameters.size();  boolean hasCheckedException = genOperation.hasCheckedException(); String indent = hasCheckedException ? "\t" : "";
    stringBuffer.append(TEXT_2624);
    stringBuffer.append(genClass.getQualifiedOperationID(genOperation));
    stringBuffer.append(TEXT_2625);
    if (hasCheckedException) {
    stringBuffer.append(TEXT_2626);
    /*}*/}
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_2627);
    stringBuffer.append(indent);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2628);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2629);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_2630);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_2631);
    }
    stringBuffer.append(TEXT_2632);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2633);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2635);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_2636);
    }
    }
    stringBuffer.append(TEXT_2637);
    stringBuffer.append(indent);
    stringBuffer.append(TEXT_2638);
    } else {
    stringBuffer.append(TEXT_2639);
    stringBuffer.append(indent);
    stringBuffer.append(TEXT_2640);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2641);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_2642);
    }
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_2643);
    for (int i = 0; i < size; i++) { GenParameter genParameter = genParameters.get(i);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2644);
    }
    if (genParameter.getTypeGenDataType() == null || !genParameter.getTypeGenDataType().isObjectType() || !genParameter.usesOperationTypeParameters() && !genParameter.getRawType().equals(genParameter.getType(genClass))) {
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass));
    stringBuffer.append(TEXT_2646);
    }
    stringBuffer.append(TEXT_2647);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2648);
    if (!isJDK50 && genParameter.isPrimitiveType()) {
    stringBuffer.append(TEXT_2649);
    stringBuffer.append(genParameter.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2650);
    }
    if (i < (size - 1)) {
    stringBuffer.append(TEXT_2651);
    }
    }
    stringBuffer.append(TEXT_2652);
    if (!isJDK50 && genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2653);
    }
    stringBuffer.append(TEXT_2654);
    }
    if (hasCheckedException) {/*{*/
    stringBuffer.append(TEXT_2655);
    stringBuffer.append(genModel.getImportedName("java.lang.Throwable"));
    stringBuffer.append(TEXT_2656);
    stringBuffer.append(genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException"));
    stringBuffer.append(TEXT_2657);
    }
    }
    stringBuffer.append(TEXT_2658);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2659);
    } else {
    stringBuffer.append(TEXT_2660);
    }
    stringBuffer.append(TEXT_2661);
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2662);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2663);
    }
    stringBuffer.append(TEXT_2664);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2665);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2666);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2668);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2669);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2670);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2672);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2674);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2675);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2676);
    }
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2678);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2679);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2680);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2682);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2683);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2684);
    }
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2687);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_2690);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2691);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2692);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2693);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2694);
    }
    stringBuffer.append(TEXT_2695);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2696);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2697);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2698);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2699);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2700);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2701);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2702);
    } else {
    stringBuffer.append(TEXT_2703);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2704);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2706);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2707);
    }
    } else {
    stringBuffer.append(TEXT_2708);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2709);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2710);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2711);
    if (isGWT) {
    stringBuffer.append(TEXT_2712);
    stringBuffer.append(genModel.getImportedName("com.google.gwt.user.client.rpc.GwtTransient"));
    }
    stringBuffer.append(TEXT_2713);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2714);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2715);
    if (!isJDK50 && keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2716);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2717);
    } else {
    stringBuffer.append(TEXT_2718);
    }
    stringBuffer.append(TEXT_2719);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2720);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2721);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2722);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2723);
    }
    stringBuffer.append(TEXT_2724);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2725);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2726);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2727);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2728);
    } else {
    stringBuffer.append(TEXT_2729);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2730);
    }
    stringBuffer.append(TEXT_2731);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2732);
    if (!isJDK50 && valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2733);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2734);
    } else {
    stringBuffer.append(TEXT_2735);
    }
    stringBuffer.append(TEXT_2736);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2737);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2739);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2740);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2741);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2742);
    }
    stringBuffer.append(TEXT_2743);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2744);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2745);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2746);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2747);
    } else {
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2749);
    }
    stringBuffer.append(TEXT_2750);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2751);
    }
    stringBuffer.append(TEXT_2752);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2753);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2754);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2755);
    }
    if (isImplementation) {
    if (!UML2GenModelUtil.isOperationsClasses(genPackage) && UML2GenModelUtil.hasOCLOperationBodies(genClass) && (!UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass()) || UML2GenModelUtil.isOperationsClasses(genClass.getClassExtendsGenClass().getGenPackage()))) {
    stringBuffer.append(TEXT_2756);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2757);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2758);
    }
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2759);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2760);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2762);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2763);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2764);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2765);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2767);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2768);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2769);
    }
    stringBuffer.append(TEXT_2770);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2771);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2772);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2773);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2774);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2775);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2776);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2777);
    } else {
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2780);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2781);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2782);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2784);
    }
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2786);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2787);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2788);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2789);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2790);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2791);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2792);
    }
    stringBuffer.append(TEXT_2793);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2794);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2795);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2796);
    } else {
    stringBuffer.append(TEXT_2797);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2798);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2799);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2800);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2801);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2802);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2803);
    }
    stringBuffer.append(TEXT_2804);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2805);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2806);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2807);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2808);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2809);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2811);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2812);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2813);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2814);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2815);
    } else {
    stringBuffer.append(TEXT_2816);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2817);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2818);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2819);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2820);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2821);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2822);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2823);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2824);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2825);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2826);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2827);
    } else {
    stringBuffer.append(TEXT_2828);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2829);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2830);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2831);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2832);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2833);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2834);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2835);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2836);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2837);
    }
    }
    }
    stringBuffer.append(TEXT_2838);
    if (isJDK50) { //isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2839);
    }
    }
    stringBuffer.append(TEXT_2840);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2841);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2842);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2843);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2844);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2845);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2846);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2847);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2848);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2849);
    }
    } else {
    stringBuffer.append(TEXT_2850);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2851);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2852);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2853);
    }
    }
    } else {
    stringBuffer.append(TEXT_2854);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2855);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2856);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2857);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2858);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2859);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2860);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2861);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2862);
    }
    } else {
    stringBuffer.append(TEXT_2863);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2864);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2865);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2866);
    }
    }
    } else {
    stringBuffer.append(TEXT_2867);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2868);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2869);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2870);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2871);
    } else {
    stringBuffer.append(TEXT_2872);
    }
    }
    stringBuffer.append(TEXT_2873);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2874);
    if (isJDK50) { //getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2875);
    }
    }
    stringBuffer.append(TEXT_2876);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2877);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2878);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType(genClass).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_2879);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2880);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2881);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2882);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2883);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2884);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2885);
    } else {
    stringBuffer.append(TEXT_2886);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2887);
    }
    } else {
    stringBuffer.append(TEXT_2888);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList"));
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2889);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2890);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2891);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2892);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2893);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2894);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2895);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2896);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2897);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2898);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2899);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2900);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2901);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2902);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2903);
    } else {
    stringBuffer.append(TEXT_2904);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2905);
    }
    }
    stringBuffer.append(TEXT_2906);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2907);
    if (isJDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2908);
    }
    }
    stringBuffer.append(TEXT_2909);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2910);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2911);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2912);
    } else {
    stringBuffer.append(TEXT_2913);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2914);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2915);
    }
    stringBuffer.append(TEXT_2916);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2917);
    if (isJDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2918);
    }
    }
    stringBuffer.append(TEXT_2919);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2920);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2921);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_2922);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2923);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2924);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2925);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2926);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2927);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2928);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2929);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2930);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2931);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2932);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2933);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2934);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2935);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2936);
    }
    stringBuffer.append(TEXT_2937);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2938);
    } else {
    stringBuffer.append(TEXT_2939);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2940);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2941);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2942);
    }
    stringBuffer.append(TEXT_2943);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2944);
    }
    }
    stringBuffer.append(TEXT_2945);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2946);
    if (isJDK50) { //setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2947);
    }
    }
    stringBuffer.append(TEXT_2948);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2949);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2950);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2951);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2952);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2953);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2954);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2955);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2956);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2957);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2958);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_2959);
    }
    stringBuffer.append(TEXT_2960);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2961);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2962);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2963);
    }
    stringBuffer.append(TEXT_2964);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2965);
    }
    stringBuffer.append(TEXT_2966);
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2967);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2968);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2969);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2970);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2971);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2972);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2973);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
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
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2980);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_2981);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2982);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2983);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2984);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2985);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2986);
    } else {
    stringBuffer.append(TEXT_2987);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2988);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2989);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2990);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2991);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2992);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2993);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2994);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2995);
    } else {
    stringBuffer.append(TEXT_2996);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2997);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2998);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2999);
    }
    }
    stringBuffer.append(TEXT_3000);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3001);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3002);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3003);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3004);
    }
    stringBuffer.append(TEXT_3005);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3006);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3007);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3008);
    }
    } else {
    stringBuffer.append(TEXT_3009);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3010);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3011);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3012);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3013);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3014);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3015);
    }
    stringBuffer.append(TEXT_3016);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3017);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3018);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3019);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3020);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3021);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3022);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3023);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_3024);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3025);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3026);
    } else {
    stringBuffer.append(TEXT_3027);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3028);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3029);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3030);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3031);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_3032);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3033);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3034);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3035);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3036);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3037);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3038);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3039);
    index++;}
    stringBuffer.append(TEXT_3040);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3041);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3042);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3043);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3044);
    }
    stringBuffer.append(TEXT_3045);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3046);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3047);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3048);
    }
    stringBuffer.append(TEXT_3049);
    } else {
    stringBuffer.append(TEXT_3050);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3051);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3052);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3053);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_3054);
    }
    } else {
    stringBuffer.append(TEXT_3055);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3056);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3057);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3058);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3059);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3060);
    } else {
    stringBuffer.append(TEXT_3061);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3062);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_3063);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3064);
    }
    index++;}
    }
    stringBuffer.append(TEXT_3065);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3066);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3067);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_3068);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_3069);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3070);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3071);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3072);
    } else {
    stringBuffer.append(TEXT_3073);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_3074);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3075);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3076);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3077);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_3078);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_3079);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3080);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3081);
    } else {
    stringBuffer.append(TEXT_3082);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_3083);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3084);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3085);
    }
    }
    stringBuffer.append(TEXT_3086);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3087);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3088);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3089);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3090);
    }
    stringBuffer.append(TEXT_3091);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_3092);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3093);
    }
    } else {
    stringBuffer.append(TEXT_3094);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3095);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3096);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3097);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3098);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3099);
    }
    stringBuffer.append(TEXT_3100);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3101);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3102);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3103);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3104);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3105);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_3106);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_3107);
    } else {
    stringBuffer.append(TEXT_3108);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3109);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3110);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3111);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_3112);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_3113);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3114);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3115);
    } else {
    stringBuffer.append(TEXT_3116);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3117);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3118);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3119);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3120);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_3121);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3122);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3123);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3124);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3125);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3126);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3127);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3128);
    index++;}
    stringBuffer.append(TEXT_3129);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3130);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3131);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3132);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3133);
    }
    stringBuffer.append(TEXT_3134);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3135);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3136);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_3137);
    }
    stringBuffer.append(TEXT_3138);
    } else {
    stringBuffer.append(TEXT_3139);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3140);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_3141);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_3142);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_3143);
    }
    } else {
    stringBuffer.append(TEXT_3144);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3145);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3146);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3147);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3148);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3149);
    } else {
    stringBuffer.append(TEXT_3150);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3151);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_3152);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3153);
    }
    index++;}
    }
    stringBuffer.append(TEXT_3154);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3155);
    }
    stringBuffer.append(TEXT_3156);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3157);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3158);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3159);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3160);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3161);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3162);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3163);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3164);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3165);
    }
    stringBuffer.append(TEXT_3166);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3167);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3168);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3169);
    }
    } else {
    stringBuffer.append(TEXT_3170);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3171);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3172);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3173);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3174);
    }
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3175);
    }
    stringBuffer.append(TEXT_3176);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3177);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3178);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_3179);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3180);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3181);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3182);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3183);
    }
    stringBuffer.append(TEXT_3184);
    }
    }
    if (isInterface) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3185);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3186);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3187);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3188);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3189);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_3190);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3191);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_3192);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3193);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3194);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3195);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3196);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3197);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3198);
    }
    stringBuffer.append(TEXT_3199);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_3200);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_3201);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3202);
    }
    } else {
    stringBuffer.append(TEXT_3203);
    }
    if (!isImplementation) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_3204);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3205);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3206);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3207);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3208);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3209);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3210);
    }
    stringBuffer.append(TEXT_3211);
    }
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_3212);
    }
    stringBuffer.append(TEXT_3213);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_3214);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3215);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_3216);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3217);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_3218);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3219);
    }
    stringBuffer.append(TEXT_3220);
    if (isJDK50) {
    stringBuffer.append(TEXT_3221);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3222);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_3223);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3224);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3225);
    } else {
    stringBuffer.append(TEXT_3226);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3227);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_3228);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3229);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3230);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3231);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3232);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3233);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3234);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3235);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_3236);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3237);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3238);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3239);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3240);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3241);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3242);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_3243);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_3244);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_3245);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3246);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_3247);
    }
    }
    stringBuffer.append(TEXT_3248);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3249);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3250);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3251);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3252);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_3253);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_3254);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3255);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3256);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3257);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_3258);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_3259);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3260);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3261);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3262);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3263);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3264);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3265);
    } else {
    stringBuffer.append(TEXT_3266);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3267);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3268);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3269);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3270);
    }
    stringBuffer.append(TEXT_3271);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3272);
    index++;}
    stringBuffer.append(TEXT_3273);
    } else {
    stringBuffer.append(TEXT_3274);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3275);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3276);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3277);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3278);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3279);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3280);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3281);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3282);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3283);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3284);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3285);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3286);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3287);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3288);
    } else {
    stringBuffer.append(TEXT_3289);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3290);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3291);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_3292);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3293);
    }
    stringBuffer.append(TEXT_3294);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3295);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_3296);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3297);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3298);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3299);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3300);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3301);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3302);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3303);
    } else {
    stringBuffer.append(TEXT_3304);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3305);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_3306);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3307);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_3308);
    }
    stringBuffer.append(TEXT_3309);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3310);
    index++;}
    }
    stringBuffer.append(TEXT_3311);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3312);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_3313);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3314);
    }
    stringBuffer.append(TEXT_3315);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_3316);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3317);
    }
    stringBuffer.append(TEXT_3318);
    } else {
    stringBuffer.append(TEXT_3319);
    }
    stringBuffer.append(TEXT_3320);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_3321);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3322);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_3323);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3324);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3325);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_3326);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3327);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3328);
    } else {
    stringBuffer.append(TEXT_3329);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3330);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3331);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3332);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3333);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3334);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3335);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3336);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3337);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3338);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3339);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3340);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3341);
    } else {
    stringBuffer.append(TEXT_3342);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3343);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3344);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3345);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3346);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3347);
    } else {
    stringBuffer.append(TEXT_3348);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3349);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3350);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3351);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3352);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3353);
    } else {
    stringBuffer.append(TEXT_3354);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3355);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_3356);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3357);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3358);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3359);
    } else {
    stringBuffer.append(TEXT_3360);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3361);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3362);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3363);
    }
    } else {
    stringBuffer.append(TEXT_3364);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3365);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3366);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3367);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3368);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3369);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3370);
    } else {
    stringBuffer.append(TEXT_3371);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3372);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3373);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3374);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3375);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3376);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3377);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3378);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3379);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3380);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3381);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3382);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3383);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3384);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3385);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3386);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3387);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3388);
    } else {
    stringBuffer.append(TEXT_3389);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3390);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3391);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3392);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3393);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3394);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3395);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_3396);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3397);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3398);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3399);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3400);
    }
    stringBuffer.append(TEXT_3401);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3402);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_3403);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_3404);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3405);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_3406);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3407);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_3408);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_3409);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3410);
    } else {
    stringBuffer.append(TEXT_3411);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3412);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_3413);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3414);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3415);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3416);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3417);
    } else {
    stringBuffer.append(TEXT_3418);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3419);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3420);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3421);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_3422);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_3423);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3424);
    } else {
    stringBuffer.append(TEXT_3425);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3426);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3427);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_3428);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_3429);
    if (isJDK50) { //genOperation.annotations.insert.javajetinc
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_3430);
    }
    }
    stringBuffer.append(TEXT_3431);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_3432);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3433);
    stringBuffer.append(genOperation.getParameters(isImplementation, genClass));
    stringBuffer.append(TEXT_3434);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_3435);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_3436);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3437);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3438);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_3439);
    } else {
    stringBuffer.append(TEXT_3440);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3441);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3442);
    }
    }
    stringBuffer.append(TEXT_3443);
    }
    }
    stringBuffer.append(TEXT_3444);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_3445);
    return stringBuffer.toString();
  }
}
